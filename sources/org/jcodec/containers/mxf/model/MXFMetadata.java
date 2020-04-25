package org.jcodec.containers.mxf.model;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import org.jcodec.common.NIOUtils;

public abstract class MXFMetadata {
    protected C15568UL uid;

    /* renamed from: ul */
    protected C15568UL f44898ul;

    public MXFMetadata(C15568UL ul) {
        this.f44898ul = ul;
    }

    protected static Date readDate(ByteBuffer byteBuffer) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, byteBuffer.getShort());
        instance.set(2, byteBuffer.get());
        instance.set(5, byteBuffer.get());
        instance.set(10, byteBuffer.get());
        instance.set(12, byteBuffer.get());
        instance.set(13, byteBuffer.get());
        instance.set(14, (byteBuffer.get() & 255) << 2);
        return instance.getTime();
    }

    protected static int[] readInt32Batch(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        byteBuffer.getInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = byteBuffer.getInt();
        }
        return iArr;
    }

    protected static C15568UL[] readULBatch(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        byteBuffer.getInt();
        C15568UL[] ulArr = new C15568UL[i];
        for (int i2 = 0; i2 < i; i2++) {
            ulArr[i2] = C15568UL.read(byteBuffer);
        }
        return ulArr;
    }

    public C15568UL getUid() {
        return this.uid;
    }

    public C15568UL getUl() {
        return this.f44898ul;
    }

    public abstract void read(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public String readUtf16String(ByteBuffer byteBuffer) {
        try {
            return new String(NIOUtils.toArray(byteBuffer), "utf-16");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
