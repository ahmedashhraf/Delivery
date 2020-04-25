package org.jcodec.codecs.mpeg4.p553es;

import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;

/* renamed from: org.jcodec.codecs.mpeg4.es.DecoderSpecific */
public class DecoderSpecific extends Descriptor {
    private ByteBuffer data;

    public DecoderSpecific(int i, int i2) {
        super(i, i2);
    }

    public static int tag() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        NIOUtils.write(byteBuffer, this.data);
    }

    public ByteBuffer getData() {
        return this.data;
    }

    /* access modifiers changed from: protected */
    public void parse(ByteBuffer byteBuffer) {
        this.data = NIOUtils.read(byteBuffer);
    }

    public DecoderSpecific(ByteBuffer byteBuffer) {
        super(tag());
        this.data = byteBuffer;
    }
}
