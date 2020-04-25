package com.fasterxml.jackson.core.p158s;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.s.g */
/* compiled from: MergedStream */
public final class C3822g extends InputStream {

    /* renamed from: N */
    byte[] f12014N;

    /* renamed from: O */
    int f12015O;

    /* renamed from: P */
    final int f12016P;

    /* renamed from: a */
    protected final C3819d f12017a;

    /* renamed from: b */
    final InputStream f12018b;

    public C3822g(C3819d dVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f12017a = dVar;
        this.f12018b = inputStream;
        this.f12014N = bArr;
        this.f12015O = i;
        this.f12016P = i2;
    }

    /* renamed from: a */
    private void m16300a() {
        byte[] bArr = this.f12014N;
        if (bArr != null) {
            this.f12014N = null;
            C3819d dVar = this.f12017a;
            if (dVar != null) {
                dVar.mo16880b(bArr);
            }
        }
    }

    public int available() throws IOException {
        if (this.f12014N != null) {
            return this.f12016P - this.f12015O;
        }
        return this.f12018b.available();
    }

    public void close() throws IOException {
        m16300a();
        this.f12018b.close();
    }

    public void mark(int i) {
        if (this.f12014N == null) {
            this.f12018b.mark(i);
        }
    }

    public boolean markSupported() {
        return this.f12014N == null && this.f12018b.markSupported();
    }

    public int read() throws IOException {
        byte[] bArr = this.f12014N;
        if (bArr == null) {
            return this.f12018b.read();
        }
        int i = this.f12015O;
        this.f12015O = i + 1;
        byte b = bArr[i] & 255;
        if (this.f12015O >= this.f12016P) {
            m16300a();
        }
        return b;
    }

    public void reset() throws IOException {
        if (this.f12014N == null) {
            this.f12018b.reset();
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        if (this.f12014N != null) {
            int i = this.f12016P;
            int i2 = this.f12015O;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.f12015O = i2 + ((int) j);
                return j;
            }
            m16300a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            j2 += this.f12018b.skip(j);
        }
        return j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12014N == null) {
            return this.f12018b.read(bArr, i, i2);
        }
        int i3 = this.f12016P - this.f12015O;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f12014N, this.f12015O, bArr, i, i2);
        this.f12015O += i2;
        if (this.f12015O >= this.f12016P) {
            m16300a();
        }
        return i2;
    }
}
