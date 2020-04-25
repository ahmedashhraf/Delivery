package org.jcodec.codecs.mpeg4.p553es;

import java.nio.ByteBuffer;

/* renamed from: org.jcodec.codecs.mpeg4.es.ES */
public class C15532ES extends NodeDescriptor {
    private int trackId;

    public C15532ES(int i, int i2) {
        super(i, i2);
    }

    public static int tag() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) this.trackId);
        byteBuffer.put(0);
        super.doWrite(byteBuffer);
    }

    public int getTrackId() {
        return this.trackId;
    }

    /* access modifiers changed from: protected */
    public void parse(ByteBuffer byteBuffer) {
        this.trackId = byteBuffer.getShort();
        byteBuffer.get();
        super.parse(byteBuffer);
    }

    public C15532ES(int i, Descriptor... descriptorArr) {
        super(tag(), descriptorArr);
        this.trackId = i;
    }
}
