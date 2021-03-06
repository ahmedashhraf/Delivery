package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class TimeToSampleBox extends FullBox {
    private TimeToSampleEntry[] entries;

    public static class TimeToSampleEntry {
        int sampleCount;
        int sampleDuration;

        public TimeToSampleEntry(int i, int i2) {
            this.sampleCount = i;
            this.sampleDuration = i2;
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int getSampleDuration() {
            return this.sampleDuration;
        }

        public long getSegmentDuration() {
            return (long) (this.sampleCount * this.sampleDuration);
        }

        public void setSampleCount(int i) {
            this.sampleCount = i;
        }

        public void setSampleDuration(int i) {
            this.sampleDuration = i;
        }
    }

    public TimeToSampleBox(TimeToSampleEntry[] timeToSampleEntryArr) {
        super(new Header(fourcc()));
        this.entries = timeToSampleEntryArr;
    }

    public static String fourcc() {
        return "stts";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        TimeToSampleEntry[] timeToSampleEntryArr;
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.entries.length);
        for (TimeToSampleEntry timeToSampleEntry : this.entries) {
            byteBuffer.putInt(timeToSampleEntry.getSampleCount());
            byteBuffer.putInt(timeToSampleEntry.getSampleDuration());
        }
    }

    public TimeToSampleEntry[] getEntries() {
        return this.entries;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.entries = new TimeToSampleEntry[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.entries[i2] = new TimeToSampleEntry(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    public void setEntries(TimeToSampleEntry[] timeToSampleEntryArr) {
        this.entries = timeToSampleEntryArr;
    }

    public TimeToSampleBox() {
        super(new Header(fourcc()));
    }
}
