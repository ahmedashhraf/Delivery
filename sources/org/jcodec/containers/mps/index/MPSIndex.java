package org.jcodec.containers.mps.index;

import java.nio.ByteBuffer;
import org.jcodec.common.RunLength.Integer;

public class MPSIndex {
    private Integer pesStreamIds;
    private long[] pesTokens;
    private MPSStreamIndex[] streams;

    public static class MPSStreamIndex {
        protected int[] fdur;
        protected int[] fpts;
        protected int[] fsizes;
        protected int streamId;
        protected int[] sync;

        public MPSStreamIndex(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.streamId = i;
            this.fsizes = iArr;
            this.fpts = iArr2;
            this.fdur = iArr3;
            this.sync = iArr4;
        }

        public static MPSStreamIndex parseIndex(ByteBuffer byteBuffer) {
            byte b = byteBuffer.get() & 255;
            int i = byteBuffer.getInt();
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = byteBuffer.getInt();
            }
            int i3 = byteBuffer.getInt();
            int[] iArr2 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr2[i4] = byteBuffer.getInt();
            }
            int i5 = byteBuffer.getInt();
            int[] iArr3 = new int[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr3[i6] = byteBuffer.getInt();
            }
            int i7 = byteBuffer.getInt();
            int[] iArr4 = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr4[i8] = byteBuffer.getInt();
            }
            MPSStreamIndex mPSStreamIndex = new MPSStreamIndex(b, iArr, iArr2, iArr3, iArr4);
            return mPSStreamIndex;
        }

        public int estimateSize() {
            return (this.fpts.length << 2) + (this.fdur.length << 2) + (this.sync.length << 2) + (this.fsizes.length << 2) + 64;
        }

        public int[] getFdur() {
            return this.fdur;
        }

        public int[] getFpts() {
            return this.fpts;
        }

        public int[] getFsizes() {
            return this.fsizes;
        }

        public int getStreamId() {
            return this.streamId;
        }

        public int[] getSync() {
            return this.sync;
        }

        public void serialize(ByteBuffer byteBuffer) {
            byteBuffer.put((byte) this.streamId);
            byteBuffer.putInt(this.fsizes.length);
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.fsizes;
                if (i2 >= iArr.length) {
                    break;
                }
                byteBuffer.putInt(iArr[i2]);
                i2++;
            }
            byteBuffer.putInt(this.fpts.length);
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.fpts;
                if (i3 >= iArr2.length) {
                    break;
                }
                byteBuffer.putInt(iArr2[i3]);
                i3++;
            }
            byteBuffer.putInt(this.fdur.length);
            int i4 = 0;
            while (true) {
                int[] iArr3 = this.fdur;
                if (i4 >= iArr3.length) {
                    break;
                }
                byteBuffer.putInt(iArr3[i4]);
                i4++;
            }
            byteBuffer.putInt(this.sync.length);
            while (true) {
                int[] iArr4 = this.sync;
                if (i < iArr4.length) {
                    byteBuffer.putInt(iArr4[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public MPSStreamIndex(MPSStreamIndex mPSStreamIndex) {
            this(mPSStreamIndex.streamId, mPSStreamIndex.fsizes, mPSStreamIndex.fpts, mPSStreamIndex.fdur, mPSStreamIndex.sync);
        }
    }

    public MPSIndex(long[] jArr, Integer integer, MPSStreamIndex[] mPSStreamIndexArr) {
        this.pesTokens = jArr;
        this.pesStreamIds = integer;
        this.streams = mPSStreamIndexArr;
    }

    public static int leadingSize(long j) {
        return 65535 & ((int) (j >> 48));
    }

    public static long makePESToken(long j, long j2, long j3) {
        return (j << 48) | (j2 << 24) | j3;
    }

    public static MPSIndex parseIndex(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = byteBuffer.getLong();
        }
        Integer parse = Integer.parse(byteBuffer);
        int i3 = byteBuffer.getInt();
        MPSStreamIndex[] mPSStreamIndexArr = new MPSStreamIndex[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            mPSStreamIndexArr[i4] = MPSStreamIndex.parseIndex(byteBuffer);
        }
        return new MPSIndex(jArr, parse, mPSStreamIndexArr);
    }

    public static int payLoadSize(long j) {
        return 16777215 & ((int) j);
    }

    public static int pesLen(long j) {
        return 16777215 & ((int) (j >> 24));
    }

    public int estimateSize() {
        int length = (this.pesTokens.length << 3) + this.pesStreamIds.estimateSize();
        for (MPSStreamIndex estimateSize : this.streams) {
            length += estimateSize.estimateSize();
        }
        return length + 64;
    }

    public Integer getPesStreamIds() {
        return this.pesStreamIds;
    }

    public long[] getPesTokens() {
        return this.pesTokens;
    }

    public MPSStreamIndex[] getStreams() {
        return this.streams;
    }

    public void serializeTo(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.pesTokens.length);
        int i = 0;
        while (true) {
            long[] jArr = this.pesTokens;
            if (i >= jArr.length) {
                break;
            }
            byteBuffer.putLong(jArr[i]);
            i++;
        }
        this.pesStreamIds.serialize(byteBuffer);
        byteBuffer.putInt(this.streams.length);
        for (MPSStreamIndex serialize : this.streams) {
            serialize.serialize(byteBuffer);
        }
    }

    public MPSIndex(MPSIndex mPSIndex) {
        this(mPSIndex.pesTokens, mPSIndex.pesStreamIds, mPSIndex.streams);
    }
}
