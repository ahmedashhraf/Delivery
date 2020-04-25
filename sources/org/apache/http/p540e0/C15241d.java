package org.apache.http.p540e0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.e0.d */
/* compiled from: ByteArrayEntity */
public class C15241d extends C15238a implements Cloneable {

    /* renamed from: O */
    protected final byte[] f44163O;

    public C15241d(byte[] bArr) {
        if (bArr != null) {
            this.f44163O = bArr;
            return;
        }
        throw new IllegalArgumentException("Source byte array may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f44163O);
    }

    public long getContentLength() {
        return (long) this.f44163O.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f44163O);
            outputStream.flush();
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }
}
