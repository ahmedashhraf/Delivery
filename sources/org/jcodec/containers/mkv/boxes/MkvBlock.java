package org.jcodec.containers.mkv.boxes;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import org.jcodec.common.ByteArrayList;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mkv.MKVType;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class MkvBlock extends EbmlBin {
    private static final String EBML = "EBML";
    private static final String FIXED = "Fixed";
    private static final int MAX_BLOCK_HEADER_SIZE = 512;
    private static final String XIPH = "Xiph";
    public long absoluteTimecode;
    public boolean discardable;
    public int[] frameOffsets;
    public int[] frameSizes;
    public ByteBuffer[] frames;
    public int headerSize;
    public boolean keyFrame;
    public String lacing;
    public boolean lacingPresent;
    public int timecode;
    public long trackNumber;

    public MkvBlock(byte[] bArr) {
        super(bArr);
        if (!Arrays.equals(MKVType.SimpleBlock.f44835id, bArr) && !Arrays.equals(MKVType.Block.f44835id, bArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Block initiated with invalid id: ");
            sb.append(EbmlUtil.toHexString(bArr));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static long[] calcEbmlLacingDiffs(int[] iArr) {
        int length = iArr.length - 1;
        long[] jArr = new long[length];
        jArr[0] = (long) iArr[0];
        for (int i = 1; i < length; i++) {
            jArr[i] = (long) (iArr[i] - iArr[i - 1]);
        }
        return jArr;
    }

    public static MkvBlock copy(MkvBlock mkvBlock) {
        MkvBlock mkvBlock2 = new MkvBlock(mkvBlock.f44838id);
        mkvBlock2.trackNumber = mkvBlock.trackNumber;
        mkvBlock2.timecode = mkvBlock.timecode;
        mkvBlock2.absoluteTimecode = mkvBlock.absoluteTimecode;
        mkvBlock2.keyFrame = mkvBlock.keyFrame;
        mkvBlock2.headerSize = mkvBlock.headerSize;
        mkvBlock2.lacing = mkvBlock.lacing;
        mkvBlock2.discardable = mkvBlock.discardable;
        mkvBlock2.lacingPresent = mkvBlock.lacingPresent;
        mkvBlock2.frameOffsets = new int[mkvBlock.frameOffsets.length];
        mkvBlock2.frameSizes = new int[mkvBlock.frameSizes.length];
        mkvBlock2.dataOffset = mkvBlock.dataOffset;
        mkvBlock2.offset = mkvBlock.offset;
        mkvBlock2.type = mkvBlock.type;
        int[] iArr = mkvBlock.frameOffsets;
        int[] iArr2 = mkvBlock2.frameOffsets;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = mkvBlock.frameSizes;
        int[] iArr4 = mkvBlock2.frameSizes;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        return mkvBlock2;
    }

    public static long ebmlDecode(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int computeLength = EbmlUtil.computeLength(b);
        if (computeLength != 0) {
            long j = (long) (b & (255 >>> computeLength));
            while (true) {
                computeLength--;
                if (computeLength <= 0) {
                    return j;
                }
                j = (j << 8) | ((long) (byteBuffer.get() & 255));
            }
        } else {
            throw new RuntimeException("Invalid ebml integer size.");
        }
    }

    public static long ebmlDecodeSigned(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int computeLength = EbmlUtil.computeLength(b);
        if (computeLength != 0) {
            long j = (long) (b & (255 >>> computeLength));
            for (int i = computeLength - 1; i > 0; i--) {
                j = (j << 8) | ((long) (byteBuffer.get() & 255));
            }
            return j - EbmlSint.signedComplement[computeLength];
        }
        throw new RuntimeException("Invalid ebml integer size.");
    }

    public static MkvBlock keyFrame(long j, int i, ByteBuffer byteBuffer) {
        MkvBlock mkvBlock = new MkvBlock(MKVType.SimpleBlock.f44835id);
        mkvBlock.frames = new ByteBuffer[]{byteBuffer};
        mkvBlock.frameSizes = new int[]{byteBuffer.limit()};
        mkvBlock.keyFrame = true;
        mkvBlock.trackNumber = j;
        mkvBlock.timecode = i;
        return mkvBlock;
    }

    public static byte[] muxEbmlLacing(int[] iArr) {
        ByteArrayList byteArrayList = new ByteArrayList();
        long[] calcEbmlLacingDiffs = calcEbmlLacingDiffs(iArr);
        byteArrayList.addAll(EbmlUtil.ebmlEncode(calcEbmlLacingDiffs[0]));
        for (int i = 1; i < calcEbmlLacingDiffs.length; i++) {
            byteArrayList.addAll(EbmlSint.convertToBytes(calcEbmlLacingDiffs[i]));
        }
        return byteArrayList.toArray();
    }

    private byte[] muxLacingInfo() {
        if (EBML.equals(this.lacing)) {
            return muxEbmlLacing(this.frameSizes);
        }
        if (XIPH.equals(this.lacing)) {
            return muxXiphLacing(this.frameSizes);
        }
        if (FIXED.equals(this.lacing)) {
            return new byte[0];
        }
        return null;
    }

    public static byte[] muxXiphLacing(int[] iArr) {
        ByteArrayList byteArrayList = new ByteArrayList();
        for (int i = 0; i < iArr.length - 1; i++) {
            long j = (long) iArr[i];
            while (j >= 255) {
                byteArrayList.add(-1);
                j -= 255;
            }
            byteArrayList.add((byte) ((int) j));
        }
        return byteArrayList.toArray();
    }

    public static int readEBMLLaceSizes(ByteBuffer byteBuffer, int[] iArr, int i, int i2) {
        int length = iArr.length - 1;
        iArr[length] = i;
        int position = byteBuffer.position();
        iArr[0] = (int) ebmlDecode(byteBuffer);
        iArr[length] = iArr[length] - iArr[0];
        int i3 = iArr[0];
        for (int i4 = 1; i4 < length; i4++) {
            i3 = (int) (((long) i3) + ebmlDecodeSigned(byteBuffer));
            iArr[i4] = i3;
            iArr[length] = iArr[length] - iArr[i4];
        }
        int position2 = (byteBuffer.position() - position) + i2;
        iArr[length] = iArr[length] - position2;
        return position2;
    }

    public static int readXiphLaceSizes(ByteBuffer byteBuffer, int[] iArr, int i, int i2) {
        int position = byteBuffer.position();
        int length = iArr.length - 1;
        iArr[length] = i;
        for (int i3 = 0; i3 < length; i3++) {
            byte b = 255;
            while (b == 255) {
                b = byteBuffer.get() & 255;
                iArr[i3] = iArr[i3] + b;
            }
            iArr[length] = iArr[length] - iArr[i3];
        }
        int position2 = (byteBuffer.position() - position) + i2;
        iArr[length] = iArr[length] - position2;
        return position2;
    }

    private void turnSizesToFrameOffsets(int[] iArr) {
        this.frameOffsets = new int[iArr.length];
        this.frameOffsets[0] = this.headerSize;
        for (int i = 1; i < iArr.length; i++) {
            int[] iArr2 = this.frameOffsets;
            int i2 = i - 1;
            iArr2[i] = iArr2[i2] + iArr[i2];
        }
    }

    public ByteBuffer getData() {
        byte b;
        int dataSize = getDataSize();
        long j = (long) dataSize;
        ByteBuffer allocate = ByteBuffer.allocate(dataSize + EbmlUtil.ebmlLength(j) + this.f44838id.length);
        allocate.put(this.f44838id);
        allocate.put(EbmlUtil.ebmlEncode(j));
        allocate.put(EbmlUtil.ebmlEncode(this.trackNumber));
        allocate.put((byte) ((this.timecode >>> 8) & 255));
        allocate.put((byte) (this.timecode & 255));
        if (XIPH.equals(this.lacing)) {
            b = 2;
        } else {
            if (EBML.equals(this.lacing)) {
                b = 6;
            } else {
                b = FIXED.equals(this.lacing) ? (byte) 4 : 0;
            }
        }
        if (this.discardable) {
            b = (byte) (b | 1);
        }
        if (this.keyFrame) {
            b = (byte) (b | 128);
        }
        allocate.put(b);
        if ((b & 6) != 0) {
            allocate.put((byte) ((this.frames.length - 1) & 255));
            allocate.put(muxLacingInfo());
        }
        for (ByteBuffer put : this.frames) {
            allocate.put(put);
        }
        allocate.flip();
        return allocate;
    }

    public int getDataSize() {
        int i = 0;
        for (int i2 : this.frameSizes) {
            i = (int) (((long) i) + ((long) i2));
        }
        if (this.lacingPresent) {
            i = i + muxLacingInfo().length + 1;
        }
        return i + 3 + EbmlUtil.ebmlLength(this.trackNumber);
    }

    public ByteBuffer[] getFrames(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer[] byteBufferArr = new ByteBuffer[this.frameSizes.length];
        for (int i = 0; i < this.frameSizes.length; i++) {
            if (this.frameOffsets[i] > byteBuffer.limit()) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("frame offset: ");
                sb.append(this.frameOffsets[i]);
                sb.append(" limit: ");
                sb.append(byteBuffer.limit());
                printStream.println(sb.toString());
            }
            byteBuffer.position(this.frameOffsets[i]);
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(this.frameSizes[i]);
            byteBufferArr[i] = slice;
        }
        return byteBufferArr;
    }

    public void read(SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(100);
        seekableByteChannel.read(allocate);
        allocate.flip();
        read(allocate);
        seekableByteChannel.position(this.dataOffset + ((long) this.dataLen));
    }

    public void readFrames(ByteBuffer byteBuffer) throws IOException {
        this.frames = getFrames(byteBuffer);
    }

    public void seekAndReadContent(FileChannel fileChannel) throws IOException {
        this.data = ByteBuffer.allocate(this.dataLen);
        fileChannel.position(this.dataOffset);
        fileChannel.read(this.data);
        this.data.flip();
    }

    public long size() {
        long dataSize = (long) getDataSize();
        return dataSize + ((long) EbmlUtil.ebmlLength(dataSize)) + ((long) this.f44838id.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{dataOffset: ");
        sb.append(this.dataOffset);
        sb.append(", trackNumber: ");
        sb.append(this.trackNumber);
        sb.append(", timecode: ");
        sb.append(this.timecode);
        sb.append(", keyFrame: ");
        sb.append(this.keyFrame);
        sb.append(", headerSize: ");
        sb.append(this.headerSize);
        sb.append(", lacing: ");
        sb.append(this.lacing);
        for (int i = 0; i < this.frameSizes.length; i++) {
            sb.append(", frame[");
            sb.append(i);
            sb.append("]  offset ");
            sb.append(this.frameOffsets[i]);
            sb.append(" size ");
            sb.append(this.frameSizes[i]);
        }
        sb.append(" }");
        return sb.toString();
    }

    public void read(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.trackNumber = ebmlDecode(slice);
        this.timecode = (short) ((((short) (slice.get() & 255)) << 8) | ((short) (slice.get() & 255)));
        byte b = slice.get() & 255;
        this.keyFrame = (b & 128) > 0;
        this.discardable = (b & 1) > 0;
        byte b2 = b & 6;
        this.lacingPresent = b2 != 0;
        if (this.lacingPresent) {
            int i = (slice.get() & 255) + 1;
            this.frameSizes = new int[i];
            if (b2 == 2) {
                this.lacing = XIPH;
                this.headerSize = readXiphLaceSizes(slice, this.frameSizes, this.dataLen, slice.position());
            } else if (b2 == 6) {
                this.lacing = EBML;
                this.headerSize = readEBMLLaceSizes(slice, this.frameSizes, this.dataLen, slice.position());
            } else if (b2 == 4) {
                this.lacing = FIXED;
                this.headerSize = slice.position();
                Arrays.fill(this.frameSizes, (this.dataLen - this.headerSize) / i);
            } else {
                throw new RuntimeException("Unsupported lacing type flag.");
            }
            turnSizesToFrameOffsets(this.frameSizes);
            return;
        }
        this.lacing = "";
        int position = slice.position();
        this.frameOffsets = new int[1];
        this.frameOffsets[0] = position;
        this.headerSize = slice.position();
        this.frameSizes = new int[1];
        this.frameSizes[0] = this.dataLen - this.headerSize;
    }
}
