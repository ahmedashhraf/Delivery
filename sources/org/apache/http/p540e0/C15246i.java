package org.apache.http.p540e0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.C15133c;
import org.apache.http.C15423j;

/* renamed from: org.apache.http.e0.i */
/* compiled from: HttpEntityWrapper */
public class C15246i implements C15423j {

    /* renamed from: a */
    protected C15423j f44168a;

    public C15246i(C15423j jVar) {
        if (jVar != null) {
            this.f44168a = jVar;
            return;
        }
        throw new IllegalArgumentException("wrapped entity must not be null");
    }

    /* renamed from: b */
    public C15133c mo47161b() {
        return this.f44168a.mo47161b();
    }

    /* renamed from: c */
    public boolean mo47164c() {
        return this.f44168a.mo47164c();
    }

    public InputStream getContent() throws IOException {
        return this.f44168a.getContent();
    }

    public long getContentLength() {
        return this.f44168a.getContentLength();
    }

    public C15133c getContentType() {
        return this.f44168a.getContentType();
    }

    public boolean isRepeatable() {
        return this.f44168a.isRepeatable();
    }

    public boolean isStreaming() {
        return this.f44168a.isStreaming();
    }

    /* renamed from: j */
    public void mo46986j() throws IOException {
        this.f44168a.mo46986j();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.f44168a.writeTo(outputStream);
    }
}
