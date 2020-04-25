package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;

public class MXFPartition {
    private boolean closed;
    private boolean complete;
    private long essenceFilePos;
    private long essenceLength;
    private MXFPartitionPack pack;

    public MXFPartition(MXFPartitionPack mXFPartitionPack, long j, boolean z, boolean z2, long j2) {
        this.pack = mXFPartitionPack;
        this.essenceFilePos = j;
        this.closed = z;
        this.complete = z2;
        this.essenceLength = j2;
    }

    public static MXFPartition read(C15568UL ul, ByteBuffer byteBuffer, long j, long j2) {
        C15568UL ul2 = ul;
        boolean z = (ul.get(14) & 1) == 0;
        boolean z2 = ul.get(14) > 2;
        MXFPartitionPack mXFPartitionPack = new MXFPartitionPack(ul);
        ByteBuffer byteBuffer2 = byteBuffer;
        mXFPartitionPack.read(byteBuffer);
        long roundToKag = roundToKag(mXFPartitionPack.getThisPartition() + j, mXFPartitionPack.getKagSize()) + roundToKag(mXFPartitionPack.getHeaderByteCount(), mXFPartitionPack.getKagSize()) + roundToKag(mXFPartitionPack.getIndexByteCount(), mXFPartitionPack.getKagSize());
        MXFPartition mXFPartition = new MXFPartition(mXFPartitionPack, roundToKag, z, z2, j2 - roundToKag);
        return mXFPartition;
    }

    static long roundToKag(long j, int i) {
        long j2 = (long) i;
        long j3 = (j / j2) * j2;
        return j3 == j ? j3 : j3 + j2;
    }

    public long getEssenceFilePos() {
        return this.essenceFilePos;
    }

    public long getEssenceLength() {
        return this.essenceLength;
    }

    public MXFPartitionPack getPack() {
        return this.pack;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isComplete() {
        return this.complete;
    }
}
