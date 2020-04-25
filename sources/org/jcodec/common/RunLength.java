package org.jcodec.common;

import androidx.core.p034l.C0986h;
import java.nio.ByteBuffer;

public abstract class RunLength {
    protected IntArrayList counts = new IntArrayList();

    public static class Integer extends RunLength {
        private static final int MIN_VALUE = Integer.MIN_VALUE;
        private int count = 0;
        private int lastValue = Integer.MIN_VALUE;
        private IntArrayList values = new IntArrayList();

        public static Integer parse(ByteBuffer byteBuffer) {
            Integer integer = new Integer();
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (byteBuffer.get() & 255) + 1;
                int i4 = byteBuffer.getInt();
                integer.counts.add(i3);
                integer.values.add(i4);
            }
            return integer;
        }

        public void add(int i) {
            int i2 = this.lastValue;
            if (i2 == Integer.MIN_VALUE || i2 != i) {
                int i3 = this.lastValue;
                if (i3 != Integer.MIN_VALUE) {
                    this.values.add(i3);
                    this.counts.add(this.count);
                    this.count = 0;
                }
                this.lastValue = i;
            }
            this.count++;
        }

        /* access modifiers changed from: protected */
        public void finish() {
            int i = this.lastValue;
            if (i != Integer.MIN_VALUE) {
                this.values.add(i);
                this.counts.add(this.count);
                this.lastValue = Integer.MIN_VALUE;
                this.count = 0;
            }
        }

        public int[] flattern() {
            int[] counts = getCounts();
            int i = 0;
            for (int i2 : counts) {
                i += i2;
            }
            int[] values2 = getValues();
            int[] iArr = new int[i];
            int i3 = 0;
            int i4 = 0;
            while (i3 < counts.length) {
                int i5 = i4;
                int i6 = 0;
                while (i6 < counts[i3]) {
                    iArr[i5] = values2[i3];
                    i6++;
                    i5++;
                }
                i3++;
                i4 = i5;
            }
            return iArr;
        }

        public int[] getValues() {
            finish();
            return this.values.toArray();
        }

        /* access modifiers changed from: protected */
        public int recSize() {
            return 5;
        }

        public void serialize(ByteBuffer byteBuffer) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            int[] counts = getCounts();
            int[] values2 = getValues();
            NIOUtils.skip(byteBuffer, 4);
            int i = 0;
            int i2 = 0;
            while (i < counts.length) {
                int i3 = counts[i];
                while (i3 >= 256) {
                    byteBuffer.put(-1);
                    byteBuffer.putInt(values2[i]);
                    i2++;
                    i3 += C0986h.f4419u;
                }
                byteBuffer.put((byte) (i3 - 1));
                byteBuffer.putInt(values2[i]);
                i++;
                i2++;
            }
            duplicate.putInt(i2);
        }
    }

    public static class Long extends RunLength {
        private static final long MIN_VALUE = Long.MIN_VALUE;
        private int count = 0;
        private long lastValue = Long.MIN_VALUE;
        private LongArrayList values = new LongArrayList();

        public static Long parse(ByteBuffer byteBuffer) {
            Long longR = new Long();
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (byteBuffer.get() & 255) + 1;
                long j = byteBuffer.getLong();
                longR.counts.add(i3);
                longR.values.add(j);
            }
            return longR;
        }

        public void add(long j) {
            long j2 = this.lastValue;
            if (j2 == Long.MIN_VALUE || j2 != j) {
                long j3 = this.lastValue;
                if (j3 != Long.MIN_VALUE) {
                    this.values.add(j3);
                    this.counts.add(this.count);
                    this.count = 0;
                }
                this.lastValue = j;
            }
            this.count++;
        }

        /* access modifiers changed from: protected */
        public void finish() {
            long j = this.lastValue;
            if (j != Long.MIN_VALUE) {
                this.values.add(j);
                this.counts.add(this.count);
                this.lastValue = Long.MIN_VALUE;
                this.count = 0;
            }
        }

        public long[] flattern() {
            int[] counts = getCounts();
            int i = 0;
            for (int i2 : counts) {
                i += i2;
            }
            long[] values2 = getValues();
            long[] jArr = new long[i];
            int i3 = 0;
            int i4 = 0;
            while (i3 < counts.length) {
                int i5 = i4;
                int i6 = 0;
                while (i6 < counts[i3]) {
                    jArr[i5] = values2[i3];
                    i6++;
                    i5++;
                }
                i3++;
                i4 = i5;
            }
            return jArr;
        }

        public int[] getCounts() {
            finish();
            return this.counts.toArray();
        }

        public long[] getValues() {
            finish();
            return this.values.toArray();
        }

        /* access modifiers changed from: protected */
        public int recSize() {
            return 9;
        }

        public void serialize(ByteBuffer byteBuffer) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            int[] counts = getCounts();
            long[] values2 = getValues();
            NIOUtils.skip(byteBuffer, 4);
            int i = 0;
            int i2 = 0;
            while (i < counts.length) {
                int i3 = counts[i];
                while (i3 >= 256) {
                    byteBuffer.put(-1);
                    byteBuffer.putLong(values2[i]);
                    i2++;
                    i3 += C0986h.f4419u;
                }
                byteBuffer.put((byte) (i3 - 1));
                byteBuffer.putLong(values2[i]);
                i++;
                i2++;
            }
            duplicate.putInt(i2);
        }
    }

    public int estimateSize() {
        int[] counts2 = getCounts();
        int i = 0;
        int i2 = 0;
        while (i < counts2.length) {
            for (int i3 = counts2[i]; i3 >= 256; i3 += C0986h.f4419u) {
                i2++;
            }
            i++;
            i2++;
        }
        return (i2 * recSize()) + 4;
    }

    /* access modifiers changed from: protected */
    public abstract void finish();

    public int[] getCounts() {
        finish();
        return this.counts.toArray();
    }

    /* access modifiers changed from: protected */
    public abstract int recSize();
}
