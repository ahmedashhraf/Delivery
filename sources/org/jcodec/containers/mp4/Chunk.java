package org.jcodec.containers.mp4;

public class Chunk {
    private int entry;
    private long offset;
    private int sampleCount;
    private int sampleDur;
    private int[] sampleDurs;
    private int sampleSize;
    private int[] sampleSizes;
    private long startTv;

    public Chunk(long j, long j2, int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.offset = j;
        this.startTv = j2;
        this.sampleCount = i;
        this.sampleSize = i2;
        this.sampleSizes = iArr;
        this.sampleDur = i3;
        this.sampleDurs = iArr2;
        this.entry = i4;
    }

    public int getDuration() {
        int i = this.sampleDur;
        if (i > 0) {
            return i * this.sampleCount;
        }
        int i2 = 0;
        for (int i3 : this.sampleDurs) {
            i2 += i3;
        }
        return i2;
    }

    public int getEntry() {
        return this.entry;
    }

    public long getOffset() {
        return this.offset;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public int getSampleDur() {
        return this.sampleDur;
    }

    public int[] getSampleDurs() {
        return this.sampleDurs;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public int[] getSampleSizes() {
        return this.sampleSizes;
    }

    public long getSize() {
        int i = this.sampleSize;
        if (i > 0) {
            return (long) (i * this.sampleCount);
        }
        long j = 0;
        for (int i2 : this.sampleSizes) {
            j += (long) i2;
        }
        return j;
    }

    public long getStartTv() {
        return this.startTv;
    }
}
