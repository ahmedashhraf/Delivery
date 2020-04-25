package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class TrackFragmentBaseMediaDecodeTimeBox extends FullBox {
    /* access modifiers changed from: private */
    public long baseMediaDecodeTime;

    public static class Factory {
        private TrackFragmentBaseMediaDecodeTimeBox box;

        protected Factory(TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox) {
            this.box = new TrackFragmentBaseMediaDecodeTimeBox(trackFragmentBaseMediaDecodeTimeBox.baseMediaDecodeTime);
            TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox2 = this.box;
            trackFragmentBaseMediaDecodeTimeBox2.version = trackFragmentBaseMediaDecodeTimeBox.version;
            trackFragmentBaseMediaDecodeTimeBox2.flags = trackFragmentBaseMediaDecodeTimeBox.flags;
        }

        public Factory baseMediaDecodeTime(long j) {
            this.box.baseMediaDecodeTime = j;
            return this;
        }

        public TrackFragmentBaseMediaDecodeTimeBox create() {
            try {
                return this.box;
            } finally {
                this.box = null;
            }
        }
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super(new Header(fourcc()));
    }

    public static Factory copy(TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox) {
        return new Factory(trackFragmentBaseMediaDecodeTimeBox);
    }

    public static String fourcc() {
        return "tfdt";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byte b = this.version;
        if (b == 0) {
            byteBuffer.putInt((int) this.baseMediaDecodeTime);
        } else if (b == 1) {
            byteBuffer.putLong(this.baseMediaDecodeTime);
        } else {
            throw new RuntimeException("Unsupported tfdt version");
        }
    }

    public long getBaseMediaDecodeTime() {
        return this.baseMediaDecodeTime;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        byte b = this.version;
        if (b == 0) {
            this.baseMediaDecodeTime = (long) byteBuffer.getInt();
        } else if (b == 1) {
            this.baseMediaDecodeTime = byteBuffer.getLong();
        } else {
            throw new RuntimeException("Unsupported tfdt version");
        }
    }

    public TrackFragmentBaseMediaDecodeTimeBox(long j) {
        this();
        this.baseMediaDecodeTime = j;
        if (this.baseMediaDecodeTime > 2147483647L) {
            this.version = 1;
        }
    }
}
