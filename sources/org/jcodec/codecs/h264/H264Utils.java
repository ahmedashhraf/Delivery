package org.jcodec.codecs.h264;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jcodec.codecs.h264.decode.SliceHeaderReader;
import org.jcodec.codecs.h264.mp4.AvcCBox;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.h264.p552io.write.SliceHeaderWriter;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Size;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;
import org.jcodec.containers.mp4.muxer.MP4Muxer;

public class H264Utils {
    /* access modifiers changed from: private */
    public static SliceHeaderReader shr = new SliceHeaderReader();
    /* access modifiers changed from: private */
    public static SliceHeaderWriter shw = new SliceHeaderWriter();

    public static abstract class SliceHeaderTweaker {
        private List<PictureParameterSet> pps;
        private List<SeqParameterSet> sps;

        public SliceHeaderTweaker() {
        }

        private void copyDataCABAC(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, BitReader bitReader, BitWriter bitWriter) {
            long curBit = (long) bitReader.curBit();
            if (curBit != 0) {
                if (((long) ((1 << ((int) (8 - curBit))) - 1)) != ((long) bitReader.readNBit(8 - ((int) curBit)))) {
                    throw new RuntimeException("Invalid CABAC padding");
                }
            }
            if (bitWriter.curBit() != 0) {
                bitWriter.writeNBit(255, 8 - bitWriter.curBit());
            }
            bitWriter.flush();
            bitReader.stop();
            byteBuffer2.put(byteBuffer);
        }

        private void copyDataCAVLC(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, BitReader bitReader, BitWriter bitWriter) {
            int curBit = 8 - bitWriter.curBit();
            if (curBit != 0) {
                bitWriter.writeNBit(bitReader.readNBit(curBit), curBit);
            }
            bitWriter.flush();
            int curBit2 = bitReader.curBit();
            if (curBit2 != 0) {
                int i = 8 - curBit2;
                int readNBit = bitReader.readNBit(i);
                bitReader.stop();
                while (byteBuffer.hasRemaining()) {
                    int i2 = readNBit << curBit2;
                    readNBit = byteBuffer.get() & 255;
                    byteBuffer2.put((byte) (i2 | (readNBit >> i)));
                }
                byteBuffer2.put((byte) (readNBit << curBit2));
                return;
            }
            bitReader.stop();
            byteBuffer2.put(byteBuffer);
        }

        private SliceHeader part2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, NALUnit nALUnit, SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, ByteBuffer byteBuffer3, BitReader bitReader, SliceHeader sliceHeader) {
            BitWriter bitWriter = new BitWriter(byteBuffer2);
            H264Utils.shr.readPart2(sliceHeader, nALUnit, seqParameterSet, pictureParameterSet, bitReader);
            tweak(sliceHeader);
            H264Utils.shw.write(sliceHeader, nALUnit.type == NALUnitType.IDR_SLICE, nALUnit.nal_ref_idc, bitWriter);
            if (pictureParameterSet.entropy_coding_mode_flag) {
                copyDataCABAC(byteBuffer, byteBuffer2, bitReader, bitWriter);
            } else {
                copyDataCAVLC(byteBuffer, byteBuffer2, bitReader, bitWriter);
            }
            byteBuffer3.limit(byteBuffer2.position());
            H264Utils.escapeNAL(byteBuffer3);
            byteBuffer2.position(byteBuffer3.limit());
            return sliceHeader;
        }

        public SliceHeader run(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, NALUnit nALUnit) {
            ByteBuffer duplicate = byteBuffer2.duplicate();
            H264Utils.unescapeNAL(byteBuffer);
            BitReader bitReader = new BitReader(byteBuffer);
            SliceHeader readPart1 = H264Utils.shr.readPart1(bitReader);
            PictureParameterSet findPPS = H264Utils.findPPS(this.pps, readPart1.pic_parameter_set_id);
            return part2(byteBuffer, byteBuffer2, nALUnit, H264Utils.findSPS(this.sps, findPPS.pic_parameter_set_id), findPPS, duplicate, bitReader, readPart1);
        }

        /* access modifiers changed from: protected */
        public abstract void tweak(SliceHeader sliceHeader);

        public SliceHeaderTweaker(List<ByteBuffer> list, List<ByteBuffer> list2) {
            this.sps = H264Utils.readSPS(list);
            this.pps = H264Utils.readPPS(list2);
        }

        public SliceHeader run(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, NALUnit nALUnit, SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet) {
            ByteBuffer duplicate = byteBuffer2.duplicate();
            H264Utils.unescapeNAL(byteBuffer);
            BitReader bitReader = new BitReader(byteBuffer);
            return part2(byteBuffer, byteBuffer2, nALUnit, seqParameterSet, pictureParameterSet, duplicate, bitReader, H264Utils.shr.readPart1(bitReader));
        }
    }

    public static AvcCBox createAvcC(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(512);
        seqParameterSet.write(allocate);
        allocate.flip();
        escapeNAL(allocate);
        ByteBuffer allocate2 = ByteBuffer.allocate(512);
        pictureParameterSet.write(allocate2);
        allocate2.flip();
        escapeNAL(allocate2);
        int i2 = i;
        AvcCBox avcCBox = new AvcCBox(seqParameterSet.profile_idc, 0, seqParameterSet.level_idc, i2, Arrays.asList(new ByteBuffer[]{allocate}), Arrays.asList(new ByteBuffer[]{allocate2}));
        return avcCBox;
    }

    public static SampleEntry createMOVSampleEntry(List<ByteBuffer> list, List<ByteBuffer> list2, int i) {
        SeqParameterSet readSPS = readSPS(NIOUtils.duplicate((ByteBuffer) list.get(0)));
        AvcCBox avcCBox = new AvcCBox(readSPS.profile_idc, 0, readSPS.level_idc, i, list, list2);
        return createMOVSampleEntry(avcCBox);
    }

    public static void dumpFrame(FileChannelWrapper fileChannelWrapper, SeqParameterSet[] seqParameterSetArr, PictureParameterSet[] pictureParameterSetArr, List<ByteBuffer> list) throws IOException {
        for (SeqParameterSet seqParameterSet : seqParameterSetArr) {
            NIOUtils.writeInt(fileChannelWrapper, 1);
            NIOUtils.writeByte(fileChannelWrapper, 103);
            fileChannelWrapper.write(writeSPS(seqParameterSet, 128));
        }
        for (PictureParameterSet pictureParameterSet : pictureParameterSetArr) {
            NIOUtils.writeInt(fileChannelWrapper, 1);
            NIOUtils.writeByte(fileChannelWrapper, 104);
            fileChannelWrapper.write(writePPS(pictureParameterSet, 256));
        }
        for (ByteBuffer byteBuffer : list) {
            NIOUtils.writeInt(fileChannelWrapper, 1);
            fileChannelWrapper.write(byteBuffer.duplicate());
        }
    }

    public static void encodeMOVPacket(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        int position = duplicate2.position();
        while (true) {
            ByteBuffer nextNALUnit = nextNALUnit(duplicate);
            if (nextNALUnit != null) {
                duplicate2.position(position);
                duplicate2.putInt(nextNALUnit.remaining());
                position += nextNALUnit.remaining() + 4;
            } else {
                return;
            }
        }
    }

    public static final void escapeNAL(ByteBuffer byteBuffer) {
        int[] searchEscapeLocations = searchEscapeLocations(byteBuffer);
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.limit() + searchEscapeLocations.length);
        int limit2 = byteBuffer.limit() - 1;
        int i = limit - 1;
        int length = searchEscapeLocations.length - 1;
        while (limit2 >= byteBuffer.position()) {
            byteBuffer.put(limit2, byteBuffer.get(i));
            if (length >= 0 && searchEscapeLocations[length] == i) {
                limit2--;
                byteBuffer.put(limit2, 3);
                length--;
            }
            limit2--;
            i--;
        }
    }

    public static PictureParameterSet findPPS(List<PictureParameterSet> list, int i) {
        for (PictureParameterSet pictureParameterSet : list) {
            if (pictureParameterSet.pic_parameter_set_id == i) {
                return pictureParameterSet;
            }
        }
        return null;
    }

    public static SeqParameterSet findSPS(List<SeqParameterSet> list, int i) {
        for (SeqParameterSet seqParameterSet : list) {
            if (seqParameterSet.seq_parameter_set_id == i) {
                return seqParameterSet;
            }
        }
        return null;
    }

    public static ByteBuffer getAvcCData(AvcCBox avcCBox) {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        avcCBox.doWrite(allocate);
        allocate.flip();
        return allocate;
    }

    public static int getPicHeightInMbs(SeqParameterSet seqParameterSet) {
        return (seqParameterSet.pic_height_in_map_units_minus1 + 1) << (seqParameterSet.frame_mbs_only_flag ^ true ? 1 : 0);
    }

    public static Size getPicSize(SeqParameterSet seqParameterSet) {
        int i = (seqParameterSet.pic_width_in_mbs_minus1 + 1) << 4;
        int picHeightInMbs = getPicHeightInMbs(seqParameterSet) << 4;
        if (seqParameterSet.frame_cropping_flag) {
            int i2 = seqParameterSet.frame_crop_left_offset + seqParameterSet.frame_crop_right_offset;
            ColorSpace colorSpace = seqParameterSet.chroma_format_idc;
            i -= i2 << colorSpace.compWidth[1];
            picHeightInMbs -= (seqParameterSet.frame_crop_top_offset + seqParameterSet.frame_crop_bottom_offset) << colorSpace.compHeight[1];
        }
        return new Size(i, picHeightInMbs);
    }

    public static int golomb2Signed(int i) {
        int i2 = i & 1;
        return ((i >> 1) + i2) * ((i2 << 1) - 1);
    }

    public static final ByteBuffer gotoNALUnit(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        int position = byteBuffer.position();
        ByteBuffer slice = byteBuffer.slice();
        slice.order(ByteOrder.BIG_ENDIAN);
        byte b = -1;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            b = (b << 8) | (byteBuffer.get() & 255);
            if ((16777215 & b) == 1) {
                byteBuffer.position(byteBuffer.position() - (b == 1 ? 4 : 3));
                slice.limit(byteBuffer.position() - position);
            }
        }
        return slice;
    }

    public static boolean idrSlice(ByteBuffer byteBuffer) {
        ByteBuffer nextNALUnit;
        ByteBuffer duplicate = byteBuffer.duplicate();
        do {
            nextNALUnit = nextNALUnit(duplicate);
            if (nextNALUnit == null) {
                return false;
            }
        } while (NALUnit.read(nextNALUnit).type != NALUnitType.IDR_SLICE);
        return true;
    }

    public static void joinNALUnits(List<ByteBuffer> list, ByteBuffer byteBuffer) {
        for (ByteBuffer byteBuffer2 : list) {
            byteBuffer.putInt(1);
            byteBuffer.put(byteBuffer2.duplicate());
        }
    }

    public static ByteBuffer nextNALUnit(ByteBuffer byteBuffer) {
        skipToNALUnit(byteBuffer);
        return gotoNALUnit(byteBuffer);
    }

    public static AvcCBox parseAVCC(VideoSampleEntry videoSampleEntry) {
        Box box = (Box) Box.findFirst(videoSampleEntry, Box.class, "avcC");
        if (box instanceof AvcCBox) {
            return (AvcCBox) box;
        }
        return parseAVCC(((LeafBox) box).getData().duplicate());
    }

    private static void putNAL(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining() * 2);
        escapeNAL(byteBuffer2, allocate);
        allocate.flip();
        byteBuffer.putInt(1);
        byteBuffer.put((byte) i);
        byteBuffer.put(allocate);
    }

    private static int readLen(ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            return byteBuffer.get() & 255;
        }
        if (i == 2) {
            return byteBuffer.getShort() & 65535;
        }
        if (i == 3) {
            return (byteBuffer.get() & 255) | ((byteBuffer.getShort() & 65535) << 8);
        } else if (i == 4) {
            return byteBuffer.getInt();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("NAL Unit length size can not be ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static PictureParameterSet readPPS(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = NIOUtils.duplicate(byteBuffer);
        unescapeNAL(duplicate);
        return PictureParameterSet.read(duplicate);
    }

    public static SeqParameterSet readSPS(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = NIOUtils.duplicate(byteBuffer);
        unescapeNAL(duplicate);
        return SeqParameterSet.read(duplicate);
    }

    public static void saveRawFrame(ByteBuffer byteBuffer, AvcCBox avcCBox, File file) throws IOException {
        FileChannelWrapper writableFileChannel = NIOUtils.writableFileChannel(file);
        saveStreamParams(avcCBox, writableFileChannel);
        writableFileChannel.write(byteBuffer.duplicate());
        writableFileChannel.close();
    }

    public static void saveStreamParams(AvcCBox avcCBox, SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        for (ByteBuffer byteBuffer : avcCBox.getSpsList()) {
            seekableByteChannel.write(ByteBuffer.wrap(new byte[]{0, 0, 0, 1, 103}));
            escapeNAL(byteBuffer.duplicate(), allocate);
            allocate.flip();
            seekableByteChannel.write(allocate);
            allocate.clear();
        }
        for (ByteBuffer byteBuffer2 : avcCBox.getPpsList()) {
            seekableByteChannel.write(ByteBuffer.wrap(new byte[]{0, 0, 0, 1, 104}));
            escapeNAL(byteBuffer2.duplicate(), allocate);
            allocate.flip();
            seekableByteChannel.write(allocate);
            allocate.clear();
        }
    }

    private static int[] searchEscapeLocations(ByteBuffer byteBuffer) {
        IntArrayList intArrayList = new IntArrayList();
        ByteBuffer duplicate = byteBuffer.duplicate();
        short s = duplicate.getShort();
        while (duplicate.hasRemaining()) {
            byte b = duplicate.get();
            if (s == 0 && (b & -4) == 0) {
                intArrayList.add(duplicate.position() - 1);
                s = 3;
            }
            s = (short) (((short) (s << 8)) | (b & 255));
        }
        return intArrayList.toArray();
    }

    public static final void skipToNALUnit(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b = -1;
            while (true) {
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                b = (b << 8) | (byteBuffer.get() & 255);
                if ((16777215 & b) == 1) {
                    byteBuffer.position(byteBuffer.position());
                    break;
                }
            }
        }
    }

    public static List<ByteBuffer> splitFrame(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteBuffer nextNALUnit = nextNALUnit(byteBuffer);
            if (nextNALUnit == null) {
                return arrayList;
            }
            arrayList.add(nextNALUnit);
        }
    }

    public static List<ByteBuffer> splitMOVPacket(ByteBuffer byteBuffer, AvcCBox avcCBox) {
        ArrayList arrayList = new ArrayList();
        int nalLengthSize = avcCBox.getNalLengthSize();
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (duplicate.remaining() >= nalLengthSize) {
            int readLen = readLen(duplicate, nalLengthSize);
            if (readLen == 0) {
                break;
            }
            arrayList.add(NIOUtils.read(duplicate, readLen));
        }
        return arrayList;
    }

    public static void toNAL(ByteBuffer byteBuffer, SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet) {
        ByteBuffer allocate = ByteBuffer.allocate(512);
        ByteBuffer allocate2 = ByteBuffer.allocate(512);
        seqParameterSet.write(allocate);
        pictureParameterSet.write(allocate2);
        allocate.flip();
        allocate2.flip();
        putNAL(byteBuffer, allocate, 103);
        putNAL(byteBuffer, allocate2, 104);
    }

    public static final void unescapeNAL(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            byte b = duplicate.get();
            duplicate2.put(b);
            byte b2 = duplicate.get();
            duplicate2.put(b2);
            while (duplicate.hasRemaining()) {
                byte b3 = duplicate.get();
                if (b != 0 || b2 != 0 || b3 != 3) {
                    duplicate2.put(b3);
                }
                b = b2;
                b2 = b3;
            }
            byteBuffer.limit(duplicate2.position());
        }
    }

    public static void wipePS(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, List<ByteBuffer> list, List<ByteBuffer> list2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (duplicate.hasRemaining()) {
            ByteBuffer nextNALUnit = nextNALUnit(duplicate);
            if (nextNALUnit == null) {
                break;
            }
            NALUnitType nALUnitType = NALUnit.read(nextNALUnit.duplicate()).type;
            if (nALUnitType == NALUnitType.PPS) {
                if (list2 != null) {
                    list2.add(nextNALUnit);
                }
            } else if (nALUnitType != NALUnitType.SPS) {
                byteBuffer2.putInt(1);
                byteBuffer2.put(nextNALUnit);
            } else if (list != null) {
                list.add(nextNALUnit);
            }
        }
        byteBuffer2.flip();
    }

    public static ByteBuffer writePPS(PictureParameterSet pictureParameterSet, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i + 8);
        pictureParameterSet.write(allocate);
        allocate.flip();
        escapeNAL(allocate);
        return allocate;
    }

    public static ByteBuffer writeSPS(SeqParameterSet seqParameterSet, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i + 8);
        seqParameterSet.write(allocate);
        allocate.flip();
        escapeNAL(allocate);
        return allocate;
    }

    public static SampleEntry createMOVSampleEntry(AvcCBox avcCBox) {
        SeqParameterSet read = SeqParameterSet.read(((ByteBuffer) avcCBox.getSpsList().get(0)).duplicate());
        int i = (read.pic_width_in_mbs_minus1 + 1) << 4;
        int picHeightInMbs = getPicHeightInMbs(read) << 4;
        if (read.frame_cropping_flag) {
            i -= (read.frame_crop_right_offset + read.frame_crop_left_offset) << read.chroma_format_idc.compWidth[1];
        }
        if (read.frame_cropping_flag) {
            picHeightInMbs -= (read.frame_crop_bottom_offset + read.frame_crop_top_offset) << read.chroma_format_idc.compHeight[1];
        }
        VideoSampleEntry videoSampleEntry = MP4Muxer.videoSampleEntry("avc1", new Size(i, picHeightInMbs), "JCodec");
        videoSampleEntry.add(avcCBox);
        return videoSampleEntry;
    }

    public static boolean idrSlice(List<ByteBuffer> list) {
        for (ByteBuffer duplicate : list) {
            if (NALUnit.read(duplicate.duplicate()).type == NALUnitType.IDR_SLICE) {
                return true;
            }
        }
        return false;
    }

    public static List<PictureParameterSet> readPPS(List<ByteBuffer> list) {
        ArrayList arrayList = new ArrayList();
        for (ByteBuffer duplicate : list) {
            arrayList.add(readPPS(NIOUtils.duplicate(duplicate)));
        }
        return arrayList;
    }

    public static List<SeqParameterSet> readSPS(List<ByteBuffer> list) {
        ArrayList arrayList = new ArrayList();
        for (ByteBuffer duplicate : list) {
            arrayList.add(readSPS(NIOUtils.duplicate(duplicate)));
        }
        return arrayList;
    }

    public static AvcCBox parseAVCC(ByteBuffer byteBuffer) {
        AvcCBox avcCBox = new AvcCBox();
        avcCBox.parse(byteBuffer);
        return avcCBox;
    }

    public static List<ByteBuffer> writePPS(List<PictureParameterSet> list) {
        ArrayList arrayList = new ArrayList();
        for (PictureParameterSet writePPS : list) {
            arrayList.add(writePPS(writePPS, 64));
        }
        return arrayList;
    }

    public static List<ByteBuffer> writeSPS(List<SeqParameterSet> list) {
        ArrayList arrayList = new ArrayList();
        for (SeqParameterSet writeSPS : list) {
            arrayList.add(writeSPS(writeSPS, 256));
        }
        return arrayList;
    }

    public static final void escapeNAL(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byteBuffer2.put(b);
        byteBuffer2.put(b2);
        while (byteBuffer.hasRemaining()) {
            byte b3 = byteBuffer.get();
            if (b == 0 && b2 == 0 && (b3 & 255) <= 3) {
                byteBuffer2.put(3);
                b = 3;
            } else {
                b = b2;
            }
            byteBuffer2.put(b3);
            b2 = b3;
        }
    }

    public static void toNAL(ByteBuffer byteBuffer, List<ByteBuffer> list, List<ByteBuffer> list2) {
        for (ByteBuffer putNAL : list) {
            putNAL(byteBuffer, putNAL, 103);
        }
        for (ByteBuffer putNAL2 : list2) {
            putNAL(byteBuffer, putNAL2, 104);
        }
    }

    public static AvcCBox createAvcC(List<SeqParameterSet> list, List<PictureParameterSet> list2, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SeqParameterSet seqParameterSet : list) {
            ByteBuffer allocate = ByteBuffer.allocate(512);
            seqParameterSet.write(allocate);
            allocate.flip();
            escapeNAL(allocate);
            arrayList.add(allocate);
        }
        for (PictureParameterSet pictureParameterSet : list2) {
            ByteBuffer allocate2 = ByteBuffer.allocate(512);
            pictureParameterSet.write(allocate2);
            allocate2.flip();
            escapeNAL(allocate2);
            arrayList2.add(allocate2);
        }
        SeqParameterSet seqParameterSet2 = (SeqParameterSet) list.get(0);
        AvcCBox avcCBox = new AvcCBox(seqParameterSet2.profile_idc, 0, seqParameterSet2.level_idc, i, arrayList, arrayList2);
        return avcCBox;
    }

    public static SampleEntry createMOVSampleEntry(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(512);
        ByteBuffer allocate2 = ByteBuffer.allocate(512);
        seqParameterSet.write(allocate);
        pictureParameterSet.write(allocate2);
        allocate.flip();
        allocate2.flip();
        return createMOVSampleEntry(Arrays.asList(new ByteBuffer[]{allocate}), Arrays.asList(new ByteBuffer[]{allocate2}), i);
    }

    public static void wipePS(ByteBuffer byteBuffer, List<ByteBuffer> list, List<ByteBuffer> list2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (duplicate.hasRemaining()) {
            ByteBuffer nextNALUnit = nextNALUnit(duplicate);
            if (nextNALUnit != null) {
                NALUnitType nALUnitType = NALUnit.read(nextNALUnit).type;
                if (nALUnitType == NALUnitType.PPS) {
                    if (list2 != null) {
                        list2.add(nextNALUnit);
                    }
                    byteBuffer.position(duplicate.position());
                } else if (nALUnitType == NALUnitType.SPS) {
                    if (list != null) {
                        list.add(nextNALUnit);
                    }
                    byteBuffer.position(duplicate.position());
                } else if (nALUnitType == NALUnitType.IDR_SLICE || nALUnitType == NALUnitType.NON_IDR_SLICE) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
