package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class SampleToChunkBox extends FullBox {
    private SampleToChunkEntry[] sampleToChunk;

    public static class SampleToChunkEntry {
        private int count;
        private int entry;
        private long first;

        public SampleToChunkEntry(long j, int i, int i2) {
            this.first = j;
            this.count = i;
            this.entry = i2;
        }

        public int getCount() {
            return this.count;
        }

        public int getEntry() {
            return this.entry;
        }

        public long getFirst() {
            return this.first;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setEntry(int i) {
            this.entry = i;
        }

        public void setFirst(long j) {
            this.first = j;
        }
    }

    public SampleToChunkBox(SampleToChunkEntry[] sampleToChunkEntryArr) {
        super(new Header(fourcc()));
        this.sampleToChunk = sampleToChunkEntryArr;
    }

    public static String fourcc() {
        return "stsc";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        SampleToChunkEntry[] sampleToChunkEntryArr;
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.sampleToChunk.length);
        for (SampleToChunkEntry sampleToChunkEntry : this.sampleToChunk) {
            byteBuffer.putInt((int) sampleToChunkEntry.getFirst());
            byteBuffer.putInt(sampleToChunkEntry.getCount());
            byteBuffer.putInt(sampleToChunkEntry.getEntry());
        }
    }

    public SampleToChunkEntry[] getSampleToChunk() {
        return this.sampleToChunk;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.sampleToChunk = new SampleToChunkEntry[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.sampleToChunk[i2] = new SampleToChunkEntry((long) byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    public void setSampleToChunk(SampleToChunkEntry[] sampleToChunkEntryArr) {
        this.sampleToChunk = sampleToChunkEntryArr;
    }

    public SampleToChunkBox() {
        super(new Header(fourcc()));
    }
}
