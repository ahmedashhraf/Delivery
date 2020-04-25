package com.fasterxml.jackson.core.p158s;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.s.a */
/* compiled from: BaseReader */
abstract class C3816a extends Reader {

    /* renamed from: R */
    protected static final int f11970R = 1114111;

    /* renamed from: S */
    protected static final char f11971S = 0;

    /* renamed from: T */
    protected static final char f11972T = 0;

    /* renamed from: N */
    protected byte[] f11973N;

    /* renamed from: O */
    protected int f11974O;

    /* renamed from: P */
    protected int f11975P;

    /* renamed from: Q */
    protected char[] f11976Q = null;

    /* renamed from: a */
    protected final C3819d f11977a;

    /* renamed from: b */
    protected InputStream f11978b;

    protected C3816a(C3819d dVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f11977a = dVar;
        this.f11978b = inputStream;
        this.f11973N = bArr;
        this.f11974O = i;
        this.f11975P = i2;
    }

    /* renamed from: a */
    public final void mo16868a() {
        byte[] bArr = this.f11973N;
        if (bArr != null) {
            this.f11973N = null;
            this.f11977a.mo16880b(bArr);
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.f11978b;
        if (inputStream != null) {
            this.f11978b = null;
            mo16868a();
            inputStream.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16871d() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public int read() throws IOException {
        if (this.f11976Q == null) {
            this.f11976Q = new char[1];
        }
        if (read(this.f11976Q, 0, 1) < 1) {
            return -1;
        }
        return this.f11976Q[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16869a(char[] cArr, int i, int i2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("read(buf,");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("), cbuf[");
        sb.append(cArr.length);
        sb.append("]");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}
