package p076c.p112d.p113a.p114a.p118d.p123e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.d.a.a.d.e.l */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
final class C2631l extends FilterInputStream {

    /* renamed from: a */
    private long f9740a;

    /* renamed from: b */
    private long f9741b = -1;

    C2631l(InputStream inputStream, long j) {
        super(inputStream);
        C2626g.m12736a(inputStream);
        this.f9740a = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f9740a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f9741b = this.f9740a;
    }

    public final int read() throws IOException {
        if (this.f9740a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f9740a--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f9741b != -1) {
            this.in.reset();
            this.f9740a = this.f9741b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f9740a));
        this.f9740a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f9740a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f9740a -= (long) read;
        }
        return read;
    }
}
