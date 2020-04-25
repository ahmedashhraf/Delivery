package com.google.common.p190io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.io.n */
/* compiled from: CountingInputStream */
public final class C8394n extends FilterInputStream {

    /* renamed from: a */
    private long f22293a;

    /* renamed from: b */
    private long f22294b = -1;

    public C8394n(@C5952h InputStream inputStream) {
        super(inputStream);
    }

    public long getCount() {
        return this.f22293a;
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.f22294b = this.f22293a;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.f22293a++;
        }
        return read;
    }

    public synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f22294b != -1) {
            this.in.reset();
            this.f22293a = this.f22294b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public long skip(long j) throws IOException {
        long skip = this.in.skip(j);
        this.f22293a += skip;
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f22293a += (long) read;
        }
        return read;
    }
}
