package p470h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.mrsool.utils.C11644i;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.p217i1.C14662d0;
import p201f.p202a.C5952h;

/* renamed from: h.v */
/* compiled from: RealBufferedSource */
final class C13919v implements C13894e {

    /* renamed from: N */
    boolean f40420N;

    /* renamed from: a */
    public final C13887c f40421a = new C13887c();

    /* renamed from: b */
    public final C13883a0 f40422b;

    /* renamed from: h.v$a */
    /* compiled from: RealBufferedSource */
    class C13920a extends InputStream {
        C13920a() {
        }

        public int available() throws IOException {
            C13919v vVar = C13919v.this;
            if (!vVar.f40420N) {
                return (int) Math.min(vVar.f40421a.f40340b, 2147483647L);
            }
            throw new IOException(C11644i.f33433v3);
        }

        public void close() throws IOException {
            C13919v.this.close();
        }

        public int read() throws IOException {
            C13919v vVar = C13919v.this;
            if (!vVar.f40420N) {
                C13887c cVar = vVar.f40421a;
                if (cVar.f40340b == 0 && vVar.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                    return -1;
                }
                return C13919v.this.f40421a.readByte() & 255;
            }
            throw new IOException(C11644i.f33433v3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13919v.this);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C13919v.this.f40420N) {
                C13893d0.m59606a((long) bArr.length, (long) i, (long) i2);
                C13919v vVar = C13919v.this;
                C13887c cVar = vVar.f40421a;
                if (cVar.f40340b == 0 && vVar.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                    return -1;
                }
                return C13919v.this.f40421a.read(bArr, i, i2);
            }
            throw new IOException(C11644i.f33433v3);
        }
    }

    C13919v(C13883a0 a0Var) {
        if (a0Var != null) {
            this.f40422b = a0Var;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    public InputStream mo43833A() {
        return new C13920a();
    }

    /* renamed from: a */
    public int mo43837a(C13911q qVar) throws IOException {
        if (!this.f40420N) {
            do {
                int a = this.f40421a.mo43838a(qVar, true);
                if (a == -1) {
                    return -1;
                }
                if (a != -2) {
                    this.f40421a.skip((long) qVar.f40393a[a].mo43985r());
                    return a;
                }
            } while (this.f40422b.read(this.f40421a, PlaybackStateCompat.f476k0) != -1);
            return -1;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: b */
    public C13887c mo43867b() {
        return this.f40421a;
    }

    /* renamed from: c */
    public C13887c mo43872c() {
        return this.f40421a;
    }

    public void close() throws IOException {
        if (!this.f40420N) {
            this.f40420N = true;
            this.f40422b.close();
            this.f40421a.mo43879d();
        }
    }

    /* renamed from: g */
    public String mo43889g(long j) throws IOException {
        mo43899k(j);
        return this.f40421a.mo43889g(j);
    }

    /* renamed from: h */
    public C13896f mo43891h(long j) throws IOException {
        mo43899k(j);
        return this.f40421a.mo43891h(j);
    }

    /* renamed from: i */
    public String mo43893i(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo43841a(10, 0, j2);
            if (a != -1) {
                return this.f40421a.mo43870b(a);
            }
            if (j2 < Long.MAX_VALUE && mo43874c(j2) && this.f40421a.mo43836a(j2 - 1) == 13 && mo43874c(1 + j2) && this.f40421a.mo43836a(j2) == 10) {
                return this.f40421a.mo43870b(j2);
            }
            C13887c cVar = new C13887c();
            C13887c cVar2 = this.f40421a;
            cVar2.mo43846a(cVar, 0, Math.min(32, cVar2.size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f40421a.size(), j));
            sb.append(" content=");
            sb.append(cVar.mo43919t().mo43977g());
            sb.append(C14662d0.f42840E);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isOpen() {
        return !this.f40420N;
    }

    /* renamed from: j */
    public byte[] mo43897j(long j) throws IOException {
        mo43899k(j);
        return this.f40421a.mo43897j(j);
    }

    /* renamed from: k */
    public void mo43899k(long j) throws IOException {
        if (!mo43874c(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public byte[] mo43903o() throws IOException {
        this.f40421a.mo43842a(this.f40422b);
        return this.f40421a.mo43903o();
    }

    /* renamed from: p */
    public boolean mo43904p() throws IOException {
        if (!this.f40420N) {
            return this.f40421a.mo43904p() && this.f40422b.read(this.f40421a, PlaybackStateCompat.f476k0) == -1;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13894e peek() {
        return C13906p.m59739a((C13883a0) new C13912r(this));
    }

    @C5952h
    /* renamed from: q */
    public String mo43906q() throws IOException {
        long a = mo43839a(10);
        if (a != -1) {
            return this.f40421a.mo43870b(a);
        }
        long j = this.f40421a.f40340b;
        return j != 0 ? mo43889g(j) : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo43907r() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo43899k(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo43874c(r3)
            if (r3 == 0) goto L_0x0040
            h.c r3 = r6.f40421a
            long r4 = (long) r1
            byte r3 = r3.mo43836a(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            h.c r0 = r6.f40421a
            long r0 = r0.mo43907r()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13919v.mo43907r():long");
    }

    public long read(C13887c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f40420N) {
            C13887c cVar2 = this.f40421a;
            if (cVar2.f40340b == 0 && this.f40422b.read(cVar2, PlaybackStateCompat.f476k0) == -1) {
                return -1;
            }
            return this.f40421a.read(cVar, Math.min(j, this.f40421a.f40340b));
        } else {
            throw new IllegalStateException(C11644i.f33433v3);
        }
    }

    public byte readByte() throws IOException {
        mo43899k(1);
        return this.f40421a.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            mo43899k((long) bArr.length);
            this.f40421a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C13887c cVar = this.f40421a;
                long j = cVar.f40340b;
                if (j > 0) {
                    int read = cVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        mo43899k(4);
        return this.f40421a.readInt();
    }

    public long readLong() throws IOException {
        mo43899k(8);
        return this.f40421a.readLong();
    }

    public short readShort() throws IOException {
        mo43899k(2);
        return this.f40421a.readShort();
    }

    /* renamed from: s */
    public int mo43916s() throws IOException {
        mo43899k(1);
        byte a = this.f40421a.mo43836a(0);
        if ((a & 224) == 192) {
            mo43899k(2);
        } else if ((a & 240) == 224) {
            mo43899k(3);
        } else if ((a & 248) == 240) {
            mo43899k(4);
        }
        return this.f40421a.mo43916s();
    }

    public void skip(long j) throws IOException {
        if (!this.f40420N) {
            while (j > 0) {
                C13887c cVar = this.f40421a;
                if (cVar.f40340b == 0 && this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f40421a.size());
                this.f40421a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: t */
    public C13896f mo43919t() throws IOException {
        this.f40421a.mo43842a(this.f40422b);
        return this.f40421a.mo43919t();
    }

    public C13885b0 timeout() {
        return this.f40422b.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f40422b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo43921u() throws IOException {
        return mo43893i(Long.MAX_VALUE);
    }

    /* renamed from: v */
    public int mo43922v() throws IOException {
        mo43899k(4);
        return this.f40421a.mo43922v();
    }

    /* renamed from: w */
    public String mo43923w() throws IOException {
        this.f40421a.mo43842a(this.f40422b);
        return this.f40421a.mo43923w();
    }

    /* renamed from: x */
    public short mo43931x() throws IOException {
        mo43899k(2);
        return this.f40421a.mo43931x();
    }

    /* renamed from: y */
    public long mo43932y() throws IOException {
        mo43899k(8);
        return this.f40421a.mo43932y();
    }

    /* renamed from: z */
    public long mo43933z() throws IOException {
        mo43899k(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo43874c((long) i2)) {
                break;
            }
            byte a = this.f40421a.mo43836a((long) i);
            if ((a >= 48 && a <= 57) || ((a >= 97 && a <= 102) || (a >= 65 && a <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(a)}));
            }
        }
        return this.f40421a.mo43933z();
    }

    /* renamed from: b */
    public long mo43864b(C13896f fVar) throws IOException {
        return mo43843a(fVar, 0);
    }

    /* renamed from: c */
    public boolean mo43874c(long j) throws IOException {
        C13887c cVar;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f40420N) {
            do {
                cVar = this.f40421a;
                if (cVar.f40340b >= j) {
                    return true;
                }
            } while (this.f40422b.read(cVar, PlaybackStateCompat.f476k0) != -1);
            return false;
        } else {
            throw new IllegalStateException(C11644i.f33433v3);
        }
    }

    /* renamed from: b */
    public long mo43865b(C13896f fVar, long j) throws IOException {
        if (!this.f40420N) {
            while (true) {
                long b = this.f40421a.mo43865b(fVar, j);
                if (b != -1) {
                    return b;
                }
                C13887c cVar = this.f40421a;
                long j2 = cVar.f40340b;
                if (this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public void mo43861a(C13887c cVar, long j) throws IOException {
        try {
            mo43899k(j);
            this.f40421a.mo43861a(cVar, j);
        } catch (EOFException e) {
            cVar.mo43842a((C13883a0) this.f40421a);
            throw e;
        }
    }

    /* renamed from: c */
    public long mo43871c(C13896f fVar) throws IOException {
        return mo43865b(fVar, 0);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C13893d0.m59606a((long) bArr.length, (long) i, j);
        C13887c cVar = this.f40421a;
        if (cVar.f40340b == 0 && this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
            return -1;
        }
        return this.f40421a.read(bArr, i, (int) Math.min(j, this.f40421a.f40340b));
    }

    /* renamed from: a */
    public long mo43844a(C13924z zVar) throws IOException {
        if (zVar != null) {
            long j = 0;
            while (this.f40422b.read(this.f40421a, PlaybackStateCompat.f476k0) != -1) {
                long e = this.f40421a.mo43880e();
                if (e > 0) {
                    j += e;
                    zVar.mo43815b(this.f40421a, e);
                }
            }
            if (this.f40421a.size() <= 0) {
                return j;
            }
            long size = j + this.f40421a.size();
            C13887c cVar = this.f40421a;
            zVar.mo43815b(cVar, cVar.size());
            return size;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C13887c cVar = this.f40421a;
        if (cVar.f40340b == 0 && this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
            return -1;
        }
        return this.f40421a.read(byteBuffer);
    }

    /* renamed from: a */
    public String mo43860a(Charset charset) throws IOException {
        if (charset != null) {
            this.f40421a.mo43842a(this.f40422b);
            return this.f40421a.mo43860a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: a */
    public String mo43859a(long j, Charset charset) throws IOException {
        mo43899k(j);
        if (charset != null) {
            return this.f40421a.mo43859a(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: a */
    public long mo43839a(byte b) throws IOException {
        return mo43841a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo43840a(byte b, long j) throws IOException {
        return mo43841a(b, j, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo43841a(byte b, long j, long j2) throws IOException {
        if (this.f40420N) {
            throw new IllegalStateException(C11644i.f33433v3);
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f40421a.mo43841a(b, j, j2);
                if (a == -1) {
                    C13887c cVar = this.f40421a;
                    long j3 = cVar.f40340b;
                    if (j3 >= j2 || this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public long mo43843a(C13896f fVar, long j) throws IOException {
        if (!this.f40420N) {
            while (true) {
                long a = this.f40421a.mo43843a(fVar, j);
                if (a != -1) {
                    return a;
                }
                C13887c cVar = this.f40421a;
                long j2 = cVar.f40340b;
                if (this.f40422b.read(cVar, PlaybackStateCompat.f476k0) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) fVar.mo43985r())) + 1);
            }
        } else {
            throw new IllegalStateException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public boolean mo43862a(long j, C13896f fVar) throws IOException {
        return mo43863a(j, fVar, 0, fVar.mo43985r());
    }

    /* renamed from: a */
    public boolean mo43863a(long j, C13896f fVar, int i, int i2) throws IOException {
        if (this.f40420N) {
            throw new IllegalStateException(C11644i.f33433v3);
        } else if (j < 0 || i < 0 || i2 < 0 || fVar.mo43985r() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo43874c(1 + j2) || this.f40421a.mo43836a(j2) != fVar.mo43949a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
