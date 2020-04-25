package p076c.p082c.p083a.p085r;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: c.c.a.r.b */
/* compiled from: StrictLineReader */
class C2259b implements Closeable {

    /* renamed from: Q */
    private static final byte f8933Q = 13;

    /* renamed from: R */
    private static final byte f8934R = 10;

    /* renamed from: N */
    private byte[] f8935N;

    /* renamed from: O */
    private int f8936O;

    /* renamed from: P */
    private int f8937P;

    /* renamed from: a */
    private final InputStream f8938a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f8939b;

    /* renamed from: c.c.a.r.b$a */
    /* compiled from: StrictLineReader */
    class C2260a extends ByteArrayOutputStream {
        C2260a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C2259b.this.f8939b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C2259b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: e */
    private void m11812e() throws IOException {
        InputStream inputStream = this.f8938a;
        byte[] bArr = this.f8935N;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f8936O = 0;
            this.f8937P = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f8938a) {
            if (this.f8935N != null) {
                this.f8935N = null;
                this.f8938a.close();
            }
        }
    }

    /* renamed from: d */
    public String mo9579d() throws IOException {
        int i;
        int i2;
        synchronized (this.f8938a) {
            if (this.f8935N != null) {
                if (this.f8936O >= this.f8937P) {
                    m11812e();
                }
                for (int i3 = this.f8936O; i3 != this.f8937P; i3++) {
                    if (this.f8935N[i3] == 10) {
                        if (i3 != this.f8936O) {
                            i2 = i3 - 1;
                            if (this.f8935N[i2] == 13) {
                                String str = new String(this.f8935N, this.f8936O, i2 - this.f8936O, this.f8939b.name());
                                this.f8936O = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f8935N, this.f8936O, i2 - this.f8936O, this.f8939b.name());
                        this.f8936O = i3 + 1;
                        return str2;
                    }
                }
                C2260a aVar = new C2260a((this.f8937P - this.f8936O) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f8935N, this.f8936O, this.f8937P - this.f8936O);
                    this.f8937P = -1;
                    m11812e();
                    i = this.f8936O;
                    while (true) {
                        if (i != this.f8937P) {
                            if (this.f8935N[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f8936O) {
                    aVar.write(this.f8935N, this.f8936O, i - this.f8936O);
                }
                this.f8936O = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C2259b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2261c.f8941a)) {
            this.f8938a = inputStream;
            this.f8939b = charset;
            this.f8935N = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public boolean mo9577a() {
        return this.f8937P == -1;
    }
}
