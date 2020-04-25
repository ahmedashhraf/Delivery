package org.apache.http.p540e0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.C15423j;
import org.apache.http.p550k0.C15456d;

/* renamed from: org.apache.http.e0.c */
/* compiled from: BufferedHttpEntity */
public class C15240c extends C15246i {

    /* renamed from: b */
    private final byte[] f44162b;

    public C15240c(C15423j jVar) throws IOException {
        super(jVar);
        if (!jVar.isRepeatable() || jVar.getContentLength() < 0) {
            this.f44162b = C15456d.m68499b(jVar);
        } else {
            this.f44162b = null;
        }
    }

    /* renamed from: c */
    public boolean mo47164c() {
        return this.f44162b == null && this.f44168a.mo47164c();
    }

    public InputStream getContent() throws IOException {
        byte[] bArr = this.f44162b;
        if (bArr != null) {
            return new ByteArrayInputStream(bArr);
        }
        return this.f44168a.getContent();
    }

    public long getContentLength() {
        byte[] bArr = this.f44162b;
        if (bArr != null) {
            return (long) bArr.length;
        }
        return this.f44168a.getContentLength();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.f44162b == null && this.f44168a.isStreaming();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            byte[] bArr = this.f44162b;
            if (bArr != null) {
                outputStream.write(bArr);
            } else {
                this.f44168a.writeTo(outputStream);
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
