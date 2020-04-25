package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class ChunkOffsets64Box extends FullBox {
    private long[] chunkOffsets;

    public ChunkOffsets64Box(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "co64";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.chunkOffsets.length);
        for (long putLong : this.chunkOffsets) {
            byteBuffer.putLong(putLong);
        }
    }

    public long[] getChunkOffsets() {
        return this.chunkOffsets;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.chunkOffsets = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.chunkOffsets[i2] = byteBuffer.getLong();
        }
    }

    public void setChunkOffsets(long[] jArr) {
        this.chunkOffsets = jArr;
    }

    public ChunkOffsets64Box() {
        super(new Header(fourcc(), 0));
    }

    public ChunkOffsets64Box(long[] jArr) {
        this();
        this.chunkOffsets = jArr;
    }
}
