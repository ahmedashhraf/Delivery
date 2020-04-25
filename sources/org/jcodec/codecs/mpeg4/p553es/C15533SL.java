package org.jcodec.codecs.mpeg4.p553es;

import java.nio.ByteBuffer;
import org.jcodec.common.Assert;

/* renamed from: org.jcodec.codecs.mpeg4.es.SL */
public class C15533SL extends Descriptor {
    public C15533SL(int i, int i2) {
        super(i, i2);
    }

    public static int tag() {
        return 6;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(2);
    }

    /* access modifiers changed from: protected */
    public void parse(ByteBuffer byteBuffer) {
        Assert.assertEquals(2, (int) byteBuffer.get() & 255);
    }

    public C15533SL() {
        super(tag());
    }
}
