package org.jcodec.containers.mkv.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.common.DemuxerTrack;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.containers.mkv.MKVParser;
import org.jcodec.containers.mkv.MKVType;
import org.jcodec.containers.mkv.boxes.EbmlBase;
import org.jcodec.containers.mkv.boxes.EbmlBin;
import org.jcodec.containers.mkv.boxes.EbmlFloat;
import org.jcodec.containers.mkv.boxes.EbmlMaster;
import org.jcodec.containers.mkv.boxes.EbmlUint;
import org.jcodec.containers.mkv.boxes.MkvBlock;

public final class MKVDemuxer {
    /* access modifiers changed from: private */
    public static final TapeTimecode ZERO_TAPE_TIMECODE;
    private List<DemuxerTrack> aTracks = new ArrayList();
    /* access modifiers changed from: private */
    public SeekableByteChannel channel;
    int pictureHeight;
    int pictureWidth;

    /* renamed from: t */
    private List<EbmlMaster> f44839t;
    long timescale = 1;
    private VideoTrack vTrack = null;

    public class AudioTrack implements SeekableDemuxerTrack {
        private int blockIdx = 0;
        List<IndexedBlock> blocks = new ArrayList();
        private int frameIdx = 0;
        private int frameInBlockIdx = 0;
        /* access modifiers changed from: private */
        public int framesCount = 0;
        public double samplingFrequency;
        public final int trackNo;

        public AudioTrack(int i) {
            this.trackNo = i;
        }

        static /* synthetic */ int access$012(AudioTrack audioTrack, int i) {
            int i2 = audioTrack.framesCount + i;
            audioTrack.framesCount = i2;
            return i2;
        }

        private int findBlockIndex(long j) {
            for (int i = 0; i < this.blocks.size(); i++) {
                if (j < ((long) ((IndexedBlock) this.blocks.get(i)).block.frameSizes.length)) {
                    return i;
                }
                j -= (long) ((IndexedBlock) this.blocks.get(i)).block.frameSizes.length;
            }
            return -1;
        }

        public long getCurFrame() {
            return (long) this.frameIdx;
        }

        public Packet getFrames(int i) {
            int i2;
            if (i + this.frameIdx >= this.framesCount) {
                return null;
            }
            ArrayList<ByteBuffer> arrayList = new ArrayList<>();
            MkvBlock mkvBlock = ((IndexedBlock) this.blocks.get(this.blockIdx)).block;
            int i3 = i;
            while (true) {
                i2 = 0;
                if (i3 <= 0) {
                    break;
                }
                MkvBlock mkvBlock2 = ((IndexedBlock) this.blocks.get(this.blockIdx)).block;
                ByteBuffer[] byteBufferArr = mkvBlock2.frames;
                if (byteBufferArr == null || byteBufferArr.length == 0) {
                    try {
                        MKVDemuxer.this.channel.position(mkvBlock2.dataOffset);
                        ByteBuffer allocate = ByteBuffer.allocate(mkvBlock2.dataLen);
                        MKVDemuxer.this.channel.read(allocate);
                        mkvBlock2.readFrames(allocate);
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("while reading frames of a Block at offset 0x");
                        sb.append(Long.toHexString(mkvBlock2.dataOffset).toUpperCase());
                        sb.append(")");
                        throw new RuntimeException(sb.toString(), e);
                    }
                }
                arrayList.add(mkvBlock2.frames[this.frameInBlockIdx].duplicate());
                this.frameIdx++;
                this.frameInBlockIdx++;
                if (this.frameInBlockIdx >= mkvBlock2.frames.length) {
                    this.frameInBlockIdx = 0;
                    this.blockIdx++;
                }
                i3--;
            }
            for (ByteBuffer limit : arrayList) {
                i2 += limit.limit();
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
            for (ByteBuffer put : arrayList) {
                allocate2.put(put);
            }
            Packet packet = new Packet(allocate2, mkvBlock.absoluteTimecode, Math.round(this.samplingFrequency), (long) arrayList.size(), 0, false, MKVDemuxer.ZERO_TAPE_TIMECODE);
            return packet;
        }

        public DemuxerTrackMeta getMeta() {
            throw new RuntimeException("Unsupported");
        }

        public boolean gotoFrame(long j) {
            if (j > 2147483647L || j > ((long) this.framesCount)) {
                return false;
            }
            int findBlockIndex = findBlockIndex(j);
            if (findBlockIndex == -1) {
                return false;
            }
            int i = (int) j;
            this.frameIdx = i;
            this.blockIdx = findBlockIndex;
            this.frameInBlockIdx = i - ((IndexedBlock) this.blocks.get(this.blockIdx)).firstFrameNo;
            return true;
        }

        public boolean gotoSyncFrame(long j) {
            return gotoFrame(j);
        }

        public Packet nextFrame() throws IOException {
            if (this.frameIdx > this.blocks.size()) {
                return null;
            }
            MkvBlock mkvBlock = ((IndexedBlock) this.blocks.get(this.blockIdx)).block;
            if (mkvBlock != null) {
                ByteBuffer[] byteBufferArr = mkvBlock.frames;
                if (byteBufferArr == null || byteBufferArr.length == 0) {
                    MKVDemuxer.this.channel.position(mkvBlock.dataOffset);
                    ByteBuffer allocate = ByteBuffer.allocate(mkvBlock.dataLen);
                    MKVDemuxer.this.channel.read(allocate);
                    mkvBlock.readFrames(allocate);
                }
                ByteBuffer duplicate = mkvBlock.frames[this.frameInBlockIdx].duplicate();
                this.frameInBlockIdx++;
                this.frameIdx++;
                if (this.frameInBlockIdx >= mkvBlock.frames.length) {
                    this.blockIdx++;
                    this.frameInBlockIdx = 0;
                }
                Packet packet = new Packet(duplicate, mkvBlock.absoluteTimecode, Math.round(this.samplingFrequency), 1, 0, false, MKVDemuxer.ZERO_TAPE_TIMECODE);
                return packet;
            }
            throw new RuntimeException("Something somewhere went wrong.");
        }

        public void seek(double d) {
            throw new RuntimeException("Not implemented yet");
        }
    }

    public static class IndexedBlock {
        public MkvBlock block;
        public int firstFrameNo;

        public static IndexedBlock make(int i, MkvBlock mkvBlock) {
            IndexedBlock indexedBlock = new IndexedBlock();
            indexedBlock.firstFrameNo = i;
            indexedBlock.block = mkvBlock;
            return indexedBlock;
        }
    }

    public class VideoTrack implements SeekableDemuxerTrack {
        List<MkvBlock> blocks = new ArrayList();
        private int frameIdx = 0;
        private ByteBuffer state;
        public final int trackNo;

        public VideoTrack(int i, ByteBuffer byteBuffer) {
            this.trackNo = i;
            this.state = byteBuffer;
        }

        public ByteBuffer getCodecState() {
            return this.state;
        }

        public long getCurFrame() {
            return (long) this.frameIdx;
        }

        public int getFrameCount() {
            return this.blocks.size();
        }

        public DemuxerTrackMeta getMeta() {
            throw new RuntimeException("Unsupported");
        }

        public boolean gotoFrame(long j) {
            if (j > 2147483647L || j > ((long) this.blocks.size())) {
                return false;
            }
            this.frameIdx = (int) j;
            return true;
        }

        public boolean gotoSyncFrame(long j) {
            throw new RuntimeException("Unsupported");
        }

        public Packet nextFrame() throws IOException {
            if (this.frameIdx >= this.blocks.size()) {
                return null;
            }
            MkvBlock mkvBlock = (MkvBlock) this.blocks.get(this.frameIdx);
            if (mkvBlock != null) {
                this.frameIdx++;
                MKVDemuxer.this.channel.position(mkvBlock.dataOffset);
                ByteBuffer allocate = ByteBuffer.allocate(mkvBlock.dataLen);
                MKVDemuxer.this.channel.read(allocate);
                allocate.flip();
                mkvBlock.readFrames(allocate.duplicate());
                long j = 1;
                if (this.frameIdx < this.blocks.size()) {
                    j = ((MkvBlock) this.blocks.get(this.frameIdx)).absoluteTimecode - mkvBlock.absoluteTimecode;
                }
                Packet packet = new Packet(mkvBlock.frames[0].duplicate(), mkvBlock.absoluteTimecode, MKVDemuxer.this.timescale, j, (long) (this.frameIdx - 1), mkvBlock.keyFrame, MKVDemuxer.ZERO_TAPE_TIMECODE);
                return packet;
            }
            throw new RuntimeException("Something somewhere went wrong.");
        }

        public void seek(double d) {
            throw new RuntimeException("Not implemented yet");
        }
    }

    static {
        TapeTimecode tapeTimecode = new TapeTimecode(0, 0, 0, 0, false);
        ZERO_TAPE_TIMECODE = tapeTimecode;
    }

    public MKVDemuxer(List<EbmlMaster> list, SeekableByteChannel seekableByteChannel) {
        this.f44839t = list;
        this.channel = seekableByteChannel;
        demux();
    }

    private void demux() {
        Class<EbmlMaster> cls = EbmlMaster.class;
        EbmlUint ebmlUint = (EbmlUint) MKVType.findFirst(this.f44839t, MKVType.Segment, MKVType.Info, MKVType.TimecodeScale);
        if (ebmlUint != null) {
            this.timescale = ebmlUint.get();
        }
        for (EbmlMaster ebmlMaster : MKVType.findList(this.f44839t, cls, MKVType.Segment, MKVType.Tracks, MKVType.TrackEntry)) {
            long j = ((EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.TrackType)).get();
            long j2 = ((EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.TrackNumber)).get();
            if (j == 1) {
                if (this.vTrack == null) {
                    EbmlBin ebmlBin = (EbmlBin) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.CodecPrivate);
                    ByteBuffer byteBuffer = null;
                    if (ebmlBin != null) {
                        byteBuffer = ebmlBin.data;
                    }
                    EbmlUint ebmlUint2 = (EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Video, MKVType.PixelWidth);
                    EbmlUint ebmlUint3 = (EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Video, MKVType.PixelHeight);
                    EbmlUint ebmlUint4 = (EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Video, MKVType.DisplayWidth);
                    EbmlUint ebmlUint5 = (EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Video, MKVType.DisplayHeight);
                    EbmlUint ebmlUint6 = (EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Video, MKVType.DisplayUnit);
                    if (ebmlUint2 != null && ebmlUint3 != null) {
                        this.pictureWidth = (int) ebmlUint2.get();
                        this.pictureHeight = (int) ebmlUint3.get();
                    } else if (!(ebmlUint4 == null || ebmlUint5 == null)) {
                        if (ebmlUint6 == null || ebmlUint6.get() == 0) {
                            this.pictureHeight = (int) ebmlUint5.get();
                            this.pictureWidth = (int) ebmlUint4.get();
                        } else {
                            throw new RuntimeException("DisplayUnits other then 0 are not implemented yet");
                        }
                    }
                    this.vTrack = new VideoTrack((int) j2, byteBuffer);
                } else {
                    throw new RuntimeException("More then 1 video track, can not compute...");
                }
            } else if (j == 2) {
                AudioTrack audioTrack = new AudioTrack((int) j2);
                EbmlFloat ebmlFloat = (EbmlFloat) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.TrackEntry, MKVType.Audio, MKVType.SamplingFrequency);
                if (ebmlFloat != null) {
                    audioTrack.samplingFrequency = ebmlFloat.get();
                }
                this.aTracks.add(audioTrack);
            }
        }
        for (EbmlMaster ebmlMaster2 : MKVType.findList(this.f44839t, cls, MKVType.Segment, MKVType.Cluster)) {
            long j3 = ((EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster2, MKVType.Cluster, MKVType.Timecode)).get();
            Iterator it = ebmlMaster2.children.iterator();
            while (it.hasNext()) {
                EbmlBase ebmlBase = (EbmlBase) it.next();
                if (MKVType.SimpleBlock.equals(ebmlBase.type)) {
                    MkvBlock mkvBlock = (MkvBlock) ebmlBase;
                    mkvBlock.absoluteTimecode = ((long) mkvBlock.timecode) + j3;
                    putIntoRightBasket(mkvBlock);
                } else if (MKVType.BlockGroup.equals(ebmlBase.type)) {
                    Iterator it2 = ((EbmlMaster) ebmlBase).children.iterator();
                    while (it2.hasNext()) {
                        if (MKVType.Block.equals((EbmlBase) it2.next())) {
                            MkvBlock mkvBlock2 = (MkvBlock) ebmlBase;
                            mkvBlock2.absoluteTimecode = ((long) mkvBlock2.timecode) + j3;
                            putIntoRightBasket(mkvBlock2);
                        }
                    }
                }
            }
        }
    }

    public static MKVDemuxer getDemuxer(SeekableByteChannel seekableByteChannel) throws IOException {
        return new MKVDemuxer(new MKVParser(seekableByteChannel).parse(), seekableByteChannel);
    }

    private void putIntoRightBasket(MkvBlock mkvBlock) {
        long j = mkvBlock.trackNumber;
        VideoTrack videoTrack = this.vTrack;
        if (j == ((long) videoTrack.trackNo)) {
            videoTrack.blocks.add(mkvBlock);
            return;
        }
        for (int i = 0; i < this.aTracks.size(); i++) {
            AudioTrack audioTrack = (AudioTrack) this.aTracks.get(i);
            if (mkvBlock.trackNumber == ((long) audioTrack.trackNo)) {
                audioTrack.blocks.add(IndexedBlock.make(audioTrack.framesCount, mkvBlock));
                AudioTrack.access$012(audioTrack, mkvBlock.frameSizes.length);
            }
        }
    }

    public List<DemuxerTrack> getAudioTracks() {
        return this.aTracks;
    }

    public int getPictureHeight() {
        return this.pictureHeight;
    }

    public int getPictureWidth() {
        return this.pictureWidth;
    }

    public DemuxerTrack getVideoTrack() {
        return this.vTrack;
    }
}
