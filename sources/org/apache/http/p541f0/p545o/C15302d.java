package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p546g0.C15320d;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15453a;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.d */
/* compiled from: AbstractSessionOutputBuffer */
public abstract class C15302d implements C15322f {

    /* renamed from: f */
    private static final byte[] f44321f = {13, 10};

    /* renamed from: g */
    private static final int f44322g = 256;

    /* renamed from: a */
    private OutputStream f44323a;

    /* renamed from: b */
    private C15453a f44324b;

    /* renamed from: c */
    private String f44325c = "US-ASCII";

    /* renamed from: d */
    private boolean f44326d = true;

    /* renamed from: e */
    private C15311m f44327e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47374a(OutputStream outputStream, int i, C15357i iVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (iVar != null) {
            this.f44323a = outputStream;
            this.f44324b = new C15453a(i);
            this.f44325c = C15359k.m68042b(iVar);
            this.f44326d = this.f44325c.equalsIgnoreCase("US-ASCII") || this.f44325c.equalsIgnoreCase(C15430e.f44596w);
            this.f44327e = new C15311m();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public void flush() throws IOException {
        mo47373a();
        this.f44323a.flush();
    }

    public C15320d getMetrics() {
        return this.f44327e;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > 256 || i2 > this.f44324b.mo47744b()) {
                mo47373a();
                this.f44323a.write(bArr, i, i2);
                this.f44327e.mo47400a((long) i2);
            } else {
                if (i2 > this.f44324b.mo47744b() - this.f44324b.mo47750f()) {
                    mo47373a();
                }
                this.f44324b.mo47741a(bArr, i, i2);
            }
        }
    }

    public void write(byte[] bArr) throws IOException {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47373a() throws IOException {
        int f = this.f44324b.mo47750f();
        if (f > 0) {
            this.f44323a.write(this.f44324b.mo47743a(), 0, f);
            this.f44324b.mo47746c();
            this.f44327e.mo47400a((long) f);
        }
    }

    public void write(int i) throws IOException {
        if (this.f44324b.mo47749e()) {
            mo47373a();
        }
        this.f44324b.mo47739a(i);
    }

    /* renamed from: a */
    public void mo47272a(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                write(str.getBytes(this.f44325c));
            }
            write(f44321f);
        }
    }

    /* renamed from: a */
    public void mo47273a(C15454b bVar) throws IOException {
        if (bVar != null) {
            if (this.f44326d) {
                int i = 0;
                int f = bVar.mo47772f();
                while (f > 0) {
                    int min = Math.min(this.f44324b.mo47744b() - this.f44324b.mo47750f(), f);
                    if (min > 0) {
                        this.f44324b.mo47740a(bVar, i, min);
                    }
                    if (this.f44324b.mo47749e()) {
                        mo47373a();
                    }
                    i += min;
                    f -= min;
                }
            } else {
                write(bVar.toString().getBytes(this.f44325c));
            }
            write(f44321f);
        }
    }
}
