package com.google.api.client.http.p308j0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.p540e0.C15238a;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6397m0;

/* renamed from: com.google.api.client.http.j0.d */
/* compiled from: ContentEntity */
final class C7279d extends C15238a {

    /* renamed from: O */
    private final long f20592O;

    /* renamed from: P */
    private final C6397m0 f20593P;

    C7279d(long j, C6397m0 m0Var) {
        this.f20592O = j;
        this.f20593P = (C6397m0) C6381h0.m29663a(m0Var);
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    public long getContentLength() {
        return this.f20592O;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.f20592O != 0) {
            this.f20593P.writeTo(outputStream);
        }
    }
}
