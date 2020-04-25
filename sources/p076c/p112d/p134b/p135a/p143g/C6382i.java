package p076c.p112d.p134b.p135a.p143g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: c.d.b.a.g.i */
/* compiled from: ByteStreams */
public final class C6382i {

    /* renamed from: a */
    private static final int f17801a = 4096;

    /* renamed from: c.d.b.a.g.i$a */
    /* compiled from: ByteStreams */
    private static final class C6383a extends FilterInputStream {

        /* renamed from: a */
        private long f17802a;

        /* renamed from: b */
        private long f17803b = -1;

        C6383a(InputStream inputStream, long j) {
            super(inputStream);
            C6381h0.m29663a(inputStream);
            C6381h0.m29667a(j >= 0, (Object) "limit must be non-negative");
            this.f17802a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f17802a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f17803b = this.f17802a;
        }

        public int read() throws IOException {
            if (this.f17802a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f17802a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f17803b != -1) {
                this.in.reset();
                this.f17802a = this.f17803b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f17802a));
            this.f17802a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f17802a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f17802a -= (long) read;
            }
            return read;
        }
    }

    private C6382i() {
    }

    /* renamed from: a */
    public static long m29673a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C6381h0.m29663a(inputStream);
        C6381h0.m29663a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static InputStream m29674a(InputStream inputStream, long j) {
        return new C6383a(inputStream, j);
    }

    /* renamed from: a */
    public static int m29672a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C6381h0.m29663a(inputStream);
        C6381h0.m29663a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
