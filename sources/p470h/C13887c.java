package p470h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.google.common.base.C5785c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.p217i1.C14662d0;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.StringUtils;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: h.c */
/* compiled from: Buffer */
public final class C13887c implements C13894e, C13892d, Cloneable, ByteChannel {

    /* renamed from: N */
    private static final byte[] f40337N = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: O */
    static final int f40338O = 65533;
    @C5952h

    /* renamed from: a */
    C13921w f40339a;

    /* renamed from: b */
    long f40340b;

    /* renamed from: h.c$a */
    /* compiled from: Buffer */
    class C13888a extends OutputStream {
        C13888a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13887c.this);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) {
            C13887c.this.writeByte((int) (byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C13887c.this.write(bArr, i, i2);
        }
    }

    /* renamed from: h.c$b */
    /* compiled from: Buffer */
    class C13889b extends InputStream {
        C13889b() {
        }

        public int available() {
            return (int) Math.min(C13887c.this.f40340b, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            C13887c cVar = C13887c.this;
            if (cVar.f40340b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13887c.this);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            return C13887c.this.read(bArr, i, i2);
        }
    }

    /* renamed from: h.c$c */
    /* compiled from: Buffer */
    public static final class C13890c implements Closeable {

        /* renamed from: N */
        private C13921w f40343N;

        /* renamed from: O */
        public long f40344O = -1;

        /* renamed from: P */
        public byte[] f40345P;

        /* renamed from: Q */
        public int f40346Q = -1;

        /* renamed from: R */
        public int f40347R = -1;

        /* renamed from: a */
        public C13887c f40348a;

        /* renamed from: b */
        public boolean f40349b;

        /* renamed from: a */
        public final int mo43944a() {
            long j = this.f40344O;
            if (j == this.f40348a.f40340b) {
                throw new IllegalStateException();
            } else if (j == -1) {
                return mo43947b(0);
            } else {
                return mo43947b(j + ((long) (this.f40347R - this.f40346Q)));
            }
        }

        /* renamed from: b */
        public final int mo43947b(long j) {
            C13921w wVar;
            long j2;
            if (j >= -1) {
                C13887c cVar = this.f40348a;
                long j3 = cVar.f40340b;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f40343N = null;
                        this.f40344O = j;
                        this.f40345P = null;
                        this.f40346Q = -1;
                        this.f40347R = -1;
                        return -1;
                    }
                    long j4 = 0;
                    C13921w wVar2 = cVar.f40339a;
                    C13921w wVar3 = this.f40343N;
                    if (wVar3 != null) {
                        long j5 = this.f40344O - ((long) (this.f40346Q - wVar3.f40427b));
                        if (j5 > j) {
                            j3 = j5;
                            C13921w wVar4 = wVar3;
                            wVar3 = wVar2;
                            wVar2 = wVar4;
                        } else {
                            j4 = j5;
                        }
                    } else {
                        wVar3 = wVar2;
                    }
                    if (j3 - j > j - j4) {
                        while (true) {
                            int i = wVar.f40428c;
                            int i2 = wVar.f40427b;
                            if (j < ((long) (i - i2)) + j2) {
                                break;
                            }
                            j4 = j2 + ((long) (i - i2));
                            wVar3 = wVar.f40431f;
                        }
                    } else {
                        wVar = wVar2;
                        j2 = j3;
                        while (j2 > j) {
                            wVar = wVar.f40432g;
                            j2 -= (long) (wVar.f40428c - wVar.f40427b);
                        }
                    }
                    if (this.f40349b && wVar.f40429d) {
                        C13921w d = wVar.mo44034d();
                        C13887c cVar2 = this.f40348a;
                        if (cVar2.f40339a == wVar) {
                            cVar2.f40339a = d;
                        }
                        wVar = wVar.mo44029a(d);
                        wVar.f40432g.mo44032b();
                    }
                    this.f40343N = wVar;
                    this.f40344O = j;
                    this.f40345P = wVar.f40426a;
                    this.f40346Q = wVar.f40427b + ((int) (j - j2));
                    this.f40347R = wVar.f40428c;
                    return this.f40347R - this.f40346Q;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f40348a.f40340b)}));
        }

        public void close() {
            if (this.f40348a != null) {
                this.f40348a = null;
                this.f40343N = null;
                this.f40344O = -1;
                this.f40345P = null;
                this.f40346Q = -1;
                this.f40347R = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: a */
        public final long mo43946a(long j) {
            C13887c cVar = this.f40348a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.f40349b) {
                long j2 = cVar.f40340b;
                if (j <= j2) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            C13887c cVar2 = this.f40348a;
                            C13921w wVar = cVar2.f40339a.f40432g;
                            int i = wVar.f40428c;
                            long j4 = (long) (i - wVar.f40427b);
                            if (j4 > j3) {
                                wVar.f40428c = (int) (((long) i) - j3);
                                break;
                            }
                            cVar2.f40339a = wVar.mo44032b();
                            C13922x.m59827a(wVar);
                            j3 -= j4;
                        }
                        this.f40343N = null;
                        this.f40344O = j;
                        this.f40345P = null;
                        this.f40346Q = -1;
                        this.f40347R = -1;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("newSize < 0: ");
                        sb.append(j);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (j > j2) {
                    long j5 = j - j2;
                    boolean z = true;
                    while (j5 > 0) {
                        C13921w e = this.f40348a.mo43883e(1);
                        int min = (int) Math.min(j5, (long) (8192 - e.f40428c));
                        e.f40428c += min;
                        j5 -= (long) min;
                        if (z) {
                            this.f40343N = e;
                            this.f40344O = j2;
                            this.f40345P = e.f40426a;
                            int i2 = e.f40428c;
                            this.f40346Q = i2 - min;
                            this.f40347R = i2;
                            z = false;
                        }
                    }
                }
                this.f40348a.f40340b = j;
                return j2;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        /* renamed from: a */
        public final long mo43945a(int i) {
            if (i <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("minByteCount <= 0: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i <= 8192) {
                C13887c cVar = this.f40348a;
                if (cVar == null) {
                    throw new IllegalStateException("not attached to a buffer");
                } else if (this.f40349b) {
                    long j = cVar.f40340b;
                    C13921w e = cVar.mo43883e(i);
                    int i2 = 8192 - e.f40428c;
                    e.f40428c = 8192;
                    long j2 = (long) i2;
                    this.f40348a.f40340b = j + j2;
                    this.f40343N = e;
                    this.f40344O = j;
                    this.f40345P = e.f40426a;
                    this.f40346Q = 8192 - i2;
                    this.f40347R = 8192;
                    return j2;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("minByteCount > Segment.SIZE: ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: A */
    public InputStream mo43833A() {
        return new C13889b();
    }

    /* renamed from: G */
    public final C13896f mo43834G() {
        return m59488b("SHA-512");
    }

    /* renamed from: H */
    public final C13896f mo43835H() {
        long j = this.f40340b;
        if (j <= 2147483647L) {
            return mo43858a((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.f40340b);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public C13887c mo43867b() {
        return this;
    }

    /* renamed from: c */
    public C13887c mo43872c() {
        return this;
    }

    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13887c)) {
            return false;
        }
        C13887c cVar = (C13887c) obj;
        long j = this.f40340b;
        if (j != cVar.f40340b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C13921w wVar = this.f40339a;
        C13921w wVar2 = cVar.f40339a;
        int i = wVar.f40427b;
        int i2 = wVar2.f40427b;
        while (j2 < this.f40340b) {
            long min = (long) Math.min(wVar.f40428c - i, wVar2.f40428c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (wVar.f40426a[i4] != wVar2.f40426a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == wVar.f40428c) {
                wVar = wVar.f40431f;
                i = wVar.f40427b;
            } else {
                i = i4;
            }
            if (i3 == wVar2.f40428c) {
                wVar2 = wVar2.f40431f;
                i2 = wVar2.f40427b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public void flush() {
    }

    /* renamed from: g */
    public String mo43889g(long j) throws EOFException {
        return mo43859a(j, C13893d0.f40350a);
    }

    /* renamed from: h */
    public C13896f mo43891h(long j) throws EOFException {
        return new C13896f(mo43897j(j));
    }

    public int hashCode() {
        C13921w wVar = this.f40339a;
        if (wVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = wVar.f40427b; i2 < wVar.f40428c; i2++) {
                i = (i * 31) + wVar.f40426a[i2];
            }
            wVar = wVar.f40431f;
        } while (wVar != this.f40339a);
        return i;
    }

    /* renamed from: i */
    public String mo43893i(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = mo43841a(10, 0, j2);
            if (a != -1) {
                return mo43870b(a);
            }
            if (j2 < size() && mo43836a(j2 - 1) == 13 && mo43836a(j2) == 10) {
                return mo43870b(j2);
            }
            C13887c cVar = new C13887c();
            mo43846a(cVar, 0, Math.min(32, size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(size(), j));
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
        return true;
    }

    /* renamed from: j */
    public byte[] mo43897j(long j) throws EOFException {
        C13893d0.m59606a(this.f40340b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public void mo43899k(long j) throws EOFException {
        if (this.f40340b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: l */
    public C13892d mo43900l() {
        return this;
    }

    /* renamed from: m */
    public C13887c m59566m() {
        return this;
    }

    /* renamed from: n */
    public OutputStream mo43902n() {
        return new C13888a();
    }

    /* renamed from: o */
    public byte[] mo43903o() {
        try {
            return mo43897j(this.f40340b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: p */
    public boolean mo43904p() {
        return this.f40340b == 0;
    }

    public C13894e peek() {
        return C13906p.m59739a((C13883a0) new C13912r(this));
    }

    @C5952h
    /* renamed from: q */
    public String mo43906q() throws EOFException {
        long a = mo43839a(10);
        if (a != -1) {
            return mo43870b(a);
        }
        long j = this.f40340b;
        return j != 0 ? mo43889g(j) : null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r5 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Number too large: ");
        r3.append(r1.mo43923w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo43907r() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f40340b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b9
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0010:
            h.w r10 = r0.f40339a
            byte[] r11 = r10.f40426a
            int r12 = r10.f40427b
            int r13 = r10.f40428c
        L_0x0018:
            if (r12 >= r13) goto L_0x009a
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x006c
            r1 = 57
            if (r15 > r1) goto L_0x006c
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0038
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0076
        L_0x003f:
            h.c r1 = new h.c
            r1.<init>()
            h.c r1 = r1.m59551f(r3)
            h.c r1 = r1.writeByte(r15)
            if (r5 != 0) goto L_0x0051
            r1.readByte()
        L_0x0051:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo43923w()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006c:
            r1 = 45
            if (r15 != r1) goto L_0x007b
            if (r7 != 0) goto L_0x007b
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L_0x0076:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L_0x0018
        L_0x007b:
            if (r7 == 0) goto L_0x007f
            r6 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009a:
            if (r12 != r13) goto L_0x00a6
            h.w r1 = r10.mo44032b()
            r0.f40339a = r1
            p470h.C13922x.m59827a(r10)
            goto L_0x00a8
        L_0x00a6:
            r10.f40427b = r12
        L_0x00a8:
            if (r6 != 0) goto L_0x00ae
            h.w r1 = r0.f40339a
            if (r1 != 0) goto L_0x0010
        L_0x00ae:
            long r1 = r0.f40340b
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f40340b = r1
            if (r5 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            long r3 = -r3
        L_0x00b8:
            return r3
        L_0x00b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00c2
        L_0x00c1:
            throw r1
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13887c.mo43907r():long");
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public byte readByte() {
        long j = this.f40340b;
        if (j != 0) {
            C13921w wVar = this.f40339a;
            int i = wVar.f40427b;
            int i2 = wVar.f40428c;
            int i3 = i + 1;
            byte b = wVar.f40426a[i];
            this.f40340b = j - 1;
            if (i3 == i2) {
                this.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            } else {
                wVar.f40427b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f40340b;
        if (j >= 4) {
            C13921w wVar = this.f40339a;
            int i = wVar.f40427b;
            int i2 = wVar.f40428c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << C5785c.f16669B) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = wVar.f40426a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << C5785c.f16669B) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f40340b = j - 4;
            if (i6 == i2) {
                this.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            } else {
                wVar.f40427b = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.f40340b);
        throw new IllegalStateException(sb.toString());
    }

    public long readLong() {
        long j = this.f40340b;
        if (j >= 8) {
            C13921w wVar = this.f40339a;
            int i = wVar.f40427b;
            int i2 = wVar.f40428c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = wVar.f40426a;
            int i3 = i + 1;
            long j2 = (((long) bArr[i]) & 255) << 56;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = ((((long) bArr[i3]) & 255) << 48) | j2 | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.f40340b = j - 8;
            if (i10 == i2) {
                this.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            } else {
                wVar.f40427b = i10;
            }
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 8: ");
        sb.append(this.f40340b);
        throw new IllegalStateException(sb.toString());
    }

    public short readShort() {
        long j = this.f40340b;
        if (j >= 2) {
            C13921w wVar = this.f40339a;
            int i = wVar.f40427b;
            int i2 = wVar.f40428c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = wVar.f40426a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f40340b = j - 2;
            if (i4 == i2) {
                this.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            } else {
                wVar.f40427b = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.f40340b);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: s */
    public int mo43916s() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f40340b != 0) {
            byte a = mo43836a(0);
            int i2 = 1;
            if ((a & 128) == 0) {
                b2 = a & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((a & 224) == 192) {
                b2 = a & C5785c.f16676I;
                i = 2;
                b = 128;
            } else if ((a & 240) == 224) {
                b2 = a & C5785c.f16698q;
                i = 3;
                b = 2048;
            } else if ((a & 248) == 240) {
                b2 = a & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return f40338O;
            }
            long j = (long) i;
            if (this.f40340b >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte a2 = mo43836a(j2);
                    if ((a2 & 192) == 128) {
                        b2 = (b2 << 6) | (a2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return f40338O;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return f40338O;
                }
                if ((b2 < 55296 || b2 > 57343) && b2 >= b) {
                    return b2;
                }
                return f40338O;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("size < ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.f40340b);
            sb.append(" (to read code point prefixed 0x");
            sb.append(Integer.toHexString(a));
            sb.append(")");
            throw new EOFException(sb.toString());
        }
        throw new EOFException();
    }

    public final long size() {
        return this.f40340b;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C13921w wVar = this.f40339a;
            if (wVar != null) {
                int min = (int) Math.min(j, (long) (wVar.f40428c - wVar.f40427b));
                long j2 = (long) min;
                this.f40340b -= j2;
                j -= j2;
                C13921w wVar2 = this.f40339a;
                wVar2.f40427b += min;
                if (wVar2.f40427b == wVar2.f40428c) {
                    this.f40339a = wVar2.mo44032b();
                    C13922x.m59827a(wVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public C13896f mo43919t() {
        return new C13896f(mo43903o());
    }

    public C13885b0 timeout() {
        return C13885b0.f40333d;
    }

    public String toString() {
        return mo43835H().toString();
    }

    /* renamed from: u */
    public String mo43921u() throws EOFException {
        return mo43893i(Long.MAX_VALUE);
    }

    /* renamed from: v */
    public int mo43922v() {
        return C13893d0.m59603a(readInt());
    }

    /* renamed from: w */
    public String mo43923w() {
        try {
            return mo43859a(this.f40340b, C13893d0.f40350a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: x */
    public short mo43931x() {
        return C13893d0.m59605a(readShort());
    }

    /* renamed from: y */
    public long mo43932y() {
        return C13893d0.m59604a(readLong());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f40339a = r6.mo44032b();
        p470h.C13922x.m59827a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f40427b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r0 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo43933z() {
        /*
            r15 = this;
            long r0 = r15.f40340b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            h.w r6 = r15.f40339a
            byte[] r7 = r6.f40426a
            int r8 = r6.f40427b
            int r9 = r6.f40428c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0013
        L_0x004a:
            h.c r0 = new h.c
            r0.<init>()
            h.c r0 = r0.m59547e(r4)
            h.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo43923w()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r1 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            h.w r7 = r6.mo44032b()
            r15.f40339a = r7
            p470h.C13922x.m59827a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f40427b = r8
        L_0x009f:
            if (r0 != 0) goto L_0x00a5
            h.w r6 = r15.f40339a
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r2 = r15.f40340b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f40340b = r2
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13887c.mo43933z():long");
    }

    /* renamed from: b */
    public final C13887c mo43869b(OutputStream outputStream) throws IOException {
        return mo43851a(outputStream, this.f40340b);
    }

    /* renamed from: c */
    public boolean mo43874c(long j) {
        return this.f40340b >= j;
    }

    public C13887c clone() {
        C13887c cVar = new C13887c();
        if (this.f40340b == 0) {
            return cVar;
        }
        cVar.f40339a = this.f40339a.mo44033c();
        C13921w wVar = cVar.f40339a;
        wVar.f40432g = wVar;
        wVar.f40431f = wVar;
        C13921w wVar2 = this.f40339a;
        while (true) {
            wVar2 = wVar2.f40431f;
            if (wVar2 != this.f40339a) {
                cVar.f40339a.f40432g.mo44029a(wVar2.mo44033c());
            } else {
                cVar.f40340b = this.f40340b;
                return cVar;
            }
        }
    }

    /* renamed from: e */
    public final long mo43880e() {
        long j = this.f40340b;
        if (j == 0) {
            return 0;
        }
        C13921w wVar = this.f40339a.f40432g;
        int i = wVar.f40428c;
        if (i < 8192 && wVar.f40430e) {
            j -= (long) (i - wVar.f40427b);
        }
        return j;
    }

    /* renamed from: f */
    public C13887c m59551f(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return m59515a("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C13921w e = mo43883e(i);
        byte[] bArr = e.f40426a;
        int i2 = e.f40428c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f40337N[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        e.f40428c += i;
        this.f40340b += (long) i;
        return this;
    }

    /* renamed from: g */
    public final C13890c mo43888g() {
        return mo43845a(new C13890c());
    }

    /* renamed from: h */
    public final C13890c mo43890h() {
        return mo43866b(new C13890c());
    }

    /* renamed from: k */
    public final C13896f mo43898k() {
        return m59488b(C14248i.f42026i);
    }

    public int read(byte[] bArr, int i, int i2) {
        C13893d0.m59606a((long) bArr.length, (long) i, (long) i2);
        C13921w wVar = this.f40339a;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i2, wVar.f40428c - wVar.f40427b);
        System.arraycopy(wVar.f40426a, wVar.f40427b, bArr, i, min);
        wVar.f40427b += min;
        this.f40340b -= (long) min;
        if (wVar.f40427b == wVar.f40428c) {
            this.f40339a = wVar.mo44032b();
            C13922x.m59827a(wVar);
        }
        return min;
    }

    public C13887c writeByte(int i) {
        C13921w e = mo43883e(1);
        byte[] bArr = e.f40426a;
        int i2 = e.f40428c;
        e.f40428c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f40340b++;
        return this;
    }

    public C13887c writeInt(int i) {
        C13921w e = mo43883e(4);
        byte[] bArr = e.f40426a;
        int i2 = e.f40428c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        e.f40428c = i6;
        this.f40340b += 4;
        return this;
    }

    public C13887c writeLong(long j) {
        C13921w e = mo43883e(8);
        byte[] bArr = e.f40426a;
        int i = e.f40428c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) (j & 255));
        e.f40428c = i9;
        this.f40340b += 8;
        return this;
    }

    public C13887c writeShort(int i) {
        C13921w e = mo43883e(2);
        byte[] bArr = e.f40426a;
        int i2 = e.f40428c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f40428c = i4;
        this.f40340b += 2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo43870b(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo43836a(j2) == 13) {
                String g = mo43889g(j2);
                skip(2);
                return g;
            }
        }
        String g2 = mo43889g(j);
        skip(1);
        return g2;
    }

    /* renamed from: c */
    public C13887c m59537c(int i) {
        return writeInt(C13893d0.m59603a(i));
    }

    /* renamed from: d */
    public final void mo43879d() {
        try {
            skip(this.f40340b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public C13887c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: c */
    public long mo43871c(C13896f fVar) {
        return mo43865b(fVar, 0);
    }

    /* renamed from: d */
    public C13887c m59541d(int i) {
        return writeShort((int) C13893d0.m59605a((short) i));
    }

    /* renamed from: j */
    public final C13896f mo43896j() {
        return m59488b("SHA-1");
    }

    public C13887c write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C13893d0.m59606a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C13921w e = mo43883e(1);
                int min = Math.min(i3 - i, 8192 - e.f40428c);
                System.arraycopy(bArr, i, e.f40426a, e.f40428c, min);
                i += min;
                e.f40428c += min;
            }
            this.f40340b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final C13887c mo43850a(OutputStream outputStream) throws IOException {
        return mo43852a(outputStream, 0, this.f40340b);
    }

    /* renamed from: d */
    public C13887c m59542d(long j) {
        return writeLong(C13893d0.m59604a(j));
    }

    /* renamed from: e */
    public C13887c m59547e(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C13921w e = mo43883e(numberOfTrailingZeros);
        byte[] bArr = e.f40426a;
        int i = e.f40428c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f40337N[(int) (15 & j)];
            j >>>= 4;
        }
        e.f40428c += numberOfTrailingZeros;
        this.f40340b += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: a */
    public final C13887c mo43852a(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream != null) {
            C13893d0.m59606a(this.f40340b, j, j2);
            if (j2 == 0) {
                return this;
            }
            C13921w wVar = this.f40339a;
            while (true) {
                int i = wVar.f40428c;
                int i2 = wVar.f40427b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                wVar = wVar.f40431f;
            }
            while (j2 > 0) {
                int i3 = (int) (((long) wVar.f40427b) + j);
                int min = (int) Math.min((long) (wVar.f40428c - i3), j2);
                outputStream.write(wVar.f40426a, i3, min);
                j2 -= (long) min;
                wVar = wVar.f40431f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: d */
    public final C13896f mo43878d(C13896f fVar) {
        return m59485a(MAC.HMACSHA1, fVar);
    }

    /* renamed from: b */
    public C13887c m59531b(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                writeByte((i >> 12) | JpegConst.APP0);
                writeByte(((i >> 6) & 63) | 128);
                writeByte((i & 63) | 128);
            } else {
                writeByte(63);
            }
        } else if (i <= 1114111) {
            writeByte((i >> 18) | 240);
            writeByte(((i >> 12) & 63) | 128);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public List<Integer> mo43894i() {
        if (this.f40339a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C13921w wVar = this.f40339a;
        arrayList.add(Integer.valueOf(wVar.f40428c - wVar.f40427b));
        C13921w wVar2 = this.f40339a;
        while (true) {
            wVar2 = wVar2.f40431f;
            if (wVar2 == this.f40339a) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(wVar2.f40428c - wVar2.f40427b));
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C13921w wVar = this.f40339a;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.f40428c - wVar.f40427b);
        byteBuffer.put(wVar.f40426a, wVar.f40427b, min);
        wVar.f40427b += min;
        this.f40340b -= (long) min;
        if (wVar.f40427b == wVar.f40428c) {
            this.f40339a = wVar.mo44032b();
            C13922x.m59827a(wVar);
        }
        return min;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C13921w e = mo43883e(1);
                int min = Math.min(i, 8192 - e.f40428c);
                byteBuffer.get(e.f40426a, e.f40428c, min);
                i -= min;
                e.f40428c += min;
            }
            this.f40340b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: f */
    public final C13896f mo43886f() {
        return m59488b(StringUtils.MD5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C13921w mo43883e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C13921w wVar = this.f40339a;
        if (wVar == null) {
            this.f40339a = C13922x.m59826a();
            C13921w wVar2 = this.f40339a;
            wVar2.f40432g = wVar2;
            wVar2.f40431f = wVar2;
            return wVar2;
        }
        C13921w wVar3 = wVar.f40432g;
        if (wVar3.f40428c + i > 8192 || !wVar3.f40430e) {
            wVar3 = wVar3.mo44029a(C13922x.m59826a());
        }
        return wVar3;
    }

    /* renamed from: f */
    public final C13896f mo43887f(C13896f fVar) {
        return m59485a("HmacSHA512", fVar);
    }

    /* renamed from: a */
    public final C13887c mo43846a(C13887c cVar, long j, long j2) {
        if (cVar != null) {
            C13893d0.m59606a(this.f40340b, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f40340b += j2;
            C13921w wVar = this.f40339a;
            while (true) {
                int i = wVar.f40428c;
                int i2 = wVar.f40427b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                wVar = wVar.f40431f;
            }
            while (j2 > 0) {
                C13921w c = wVar.mo44033c();
                c.f40427b = (int) (((long) c.f40427b) + j);
                c.f40428c = Math.min(c.f40427b + ((int) j2), c.f40428c);
                C13921w wVar2 = cVar.f40339a;
                if (wVar2 == null) {
                    c.f40432g = c;
                    c.f40431f = c;
                    cVar.f40339a = c;
                } else {
                    wVar2.f40432g.mo44029a(c);
                }
                j2 -= (long) (c.f40428c - c.f40427b);
                wVar = wVar.f40431f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public long read(C13887c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f40340b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo43815b(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) {
        int i;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C13893d0.m59606a(cVar.f40340b, 0, j);
            while (j > 0) {
                C13921w wVar = cVar.f40339a;
                if (j < ((long) (wVar.f40428c - wVar.f40427b))) {
                    C13921w wVar2 = this.f40339a;
                    C13921w wVar3 = wVar2 != null ? wVar2.f40432g : null;
                    if (wVar3 != null && wVar3.f40430e) {
                        long j2 = ((long) wVar3.f40428c) + j;
                        if (wVar3.f40429d) {
                            i = 0;
                        } else {
                            i = wVar3.f40427b;
                        }
                        if (j2 - ((long) i) <= PlaybackStateCompat.f476k0) {
                            cVar.f40339a.mo44031a(wVar3, (int) j);
                            cVar.f40340b -= j;
                            this.f40340b += j;
                            return;
                        }
                    }
                    cVar.f40339a = cVar.f40339a.mo44028a((int) j);
                }
                C13921w wVar4 = cVar.f40339a;
                long j3 = (long) (wVar4.f40428c - wVar4.f40427b);
                cVar.f40339a = wVar4.mo44032b();
                C13921w wVar5 = this.f40339a;
                if (wVar5 == null) {
                    this.f40339a = wVar4;
                    C13921w wVar6 = this.f40339a;
                    wVar6.f40432g = wVar6;
                    wVar6.f40431f = wVar6;
                } else {
                    wVar5.f40432g.mo44029a(wVar4).mo44030a();
                }
                cVar.f40340b -= j3;
                this.f40340b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: e */
    public final C13896f mo43882e(C13896f fVar) {
        return m59485a("HmacSHA256", fVar);
    }

    /* renamed from: a */
    public final C13887c mo43851a(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            C13893d0.m59606a(this.f40340b, 0, j);
            C13921w wVar = this.f40339a;
            while (j > 0) {
                int min = (int) Math.min(j, (long) (wVar.f40428c - wVar.f40427b));
                outputStream.write(wVar.f40426a, wVar.f40427b, min);
                wVar.f40427b += min;
                long j2 = (long) min;
                this.f40340b -= j2;
                j -= j2;
                if (wVar.f40427b == wVar.f40428c) {
                    C13921w b = wVar.mo44032b();
                    this.f40339a = b;
                    C13922x.m59827a(wVar);
                    wVar = b;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public final C13887c mo43848a(InputStream inputStream) throws IOException {
        m59486a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    /* renamed from: a */
    public final C13887c mo43849a(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            m59486a(inputStream, j, false);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m59486a(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream != null) {
            while (true) {
                if (j > 0 || z) {
                    C13921w e = mo43883e(1);
                    int read = inputStream.read(e.f40426a, e.f40428c, (int) Math.min(j, (long) (8192 - e.f40428c)));
                    if (read != -1) {
                        e.f40428c += read;
                        long j2 = (long) read;
                        this.f40340b += j2;
                        j -= j2;
                    } else if (!z) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    /* renamed from: b */
    public long mo43864b(C13896f fVar) throws IOException {
        return mo43843a(fVar, 0);
    }

    /* renamed from: b */
    public long mo43865b(C13896f fVar, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C13921w wVar = this.f40339a;
            if (wVar == null) {
                return -1;
            }
            long j3 = this.f40340b;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = ((long) (wVar.f40428c - wVar.f40427b)) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    wVar = wVar.f40431f;
                }
            } else {
                while (j3 > j) {
                    wVar = wVar.f40432g;
                    j3 -= (long) (wVar.f40428c - wVar.f40427b);
                }
            }
            if (fVar.mo43985r() == 2) {
                byte a = fVar.mo43949a(0);
                byte a2 = fVar.mo43949a(1);
                while (j3 < this.f40340b) {
                    byte[] bArr = wVar.f40426a;
                    i = (int) ((((long) wVar.f40427b) + j) - j3);
                    int i3 = wVar.f40428c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == a || b == a2) {
                            i2 = wVar.f40427b;
                        } else {
                            i++;
                        }
                    }
                    j = ((long) (wVar.f40428c - wVar.f40427b)) + j3;
                    wVar = wVar.f40431f;
                    j3 = j;
                }
                return -1;
            }
            byte[] h = fVar.mo43979h();
            while (j3 < this.f40340b) {
                byte[] bArr2 = wVar.f40426a;
                int i4 = (int) ((((long) wVar.f40427b) + j) - j3);
                int i5 = wVar.f40428c;
                while (i < i5) {
                    byte b2 = bArr2[i];
                    int length = h.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b2 == h[i6]) {
                            i2 = wVar.f40427b;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j = ((long) (wVar.f40428c - wVar.f40427b)) + j3;
                wVar = wVar.f40431f;
                j3 = j;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* renamed from: a */
    public final byte mo43836a(long j) {
        int i;
        C13893d0.m59606a(this.f40340b, j, 1);
        long j2 = this.f40340b;
        if (j2 - j > j) {
            C13921w wVar = this.f40339a;
            while (true) {
                int i2 = wVar.f40428c;
                int i3 = wVar.f40427b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return wVar.f40426a[i3 + ((int) j)];
                }
                j -= j3;
                wVar = wVar.f40431f;
            }
        } else {
            long j4 = j - j2;
            C13921w wVar2 = this.f40339a;
            do {
                wVar2 = wVar2.f40432g;
                int i4 = wVar2.f40428c;
                i = wVar2.f40427b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return wVar2.f40426a[i + ((int) j4)];
        }
    }

    /* renamed from: a */
    public int mo43837a(C13911q qVar) {
        int a = mo43838a(qVar, false);
        if (a == -1) {
            return -1;
        }
        try {
            skip((long) qVar.f40393a[a].mo43985r());
            return a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo43838a(C13911q qVar, boolean z) {
        int i;
        int i2;
        C13911q qVar2 = qVar;
        C13921w wVar = this.f40339a;
        int i3 = -2;
        if (wVar != null) {
            byte[] bArr = wVar.f40426a;
            int i4 = wVar.f40427b;
            int i5 = wVar.f40428c;
            int[] iArr = qVar2.f40394b;
            int i6 = i4;
            int i7 = i5;
            int i8 = -1;
            C13921w wVar2 = wVar;
            byte[] bArr2 = bArr;
            int i9 = 0;
            loop0:
            while (true) {
                int i10 = i9 + 1;
                int i11 = iArr[i9];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (wVar2 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        i2 = i6 + 1;
                        int i15 = i12 + 1;
                        if ((bArr2[i6] & 255) != iArr[i12]) {
                            return i8;
                        }
                        boolean z2 = i15 == i14;
                        if (i2 == i7) {
                            C13921w wVar3 = wVar2.f40431f;
                            int i16 = wVar3.f40427b;
                            bArr2 = wVar3.f40426a;
                            i7 = wVar3.f40428c;
                            if (wVar3 != wVar) {
                                int i17 = i16;
                                wVar2 = wVar3;
                                i2 = i17;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                i2 = i16;
                                wVar2 = null;
                            }
                        }
                        if (z2) {
                            i = iArr[i15];
                            break;
                        }
                        i6 = i2;
                        i12 = i15;
                    }
                } else {
                    int i18 = i6 + 1;
                    byte b = bArr2[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (b == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i18 == i7) {
                                C13921w wVar4 = wVar2.f40431f;
                                i2 = wVar4.f40427b;
                                byte[] bArr3 = wVar4.f40426a;
                                i7 = wVar4.f40428c;
                                bArr2 = bArr3;
                                wVar2 = wVar4 == wVar ? null : wVar4;
                            } else {
                                i2 = i18;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i >= 0) {
                    return i;
                }
                int i20 = -i;
                i6 = i2;
                i9 = i20;
                i3 = -2;
            }
            return z ? i3 : i8;
        } else if (z) {
            return -2;
        } else {
            return qVar2.indexOf(C13896f.f40352P);
        }
    }

    /* renamed from: b */
    private C13896f m59488b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (this.f40339a != null) {
                instance.update(this.f40339a.f40426a, this.f40339a.f40427b, this.f40339a.f40428c - this.f40339a.f40427b);
                C13921w wVar = this.f40339a;
                while (true) {
                    wVar = wVar.f40431f;
                    if (wVar == this.f40339a) {
                        break;
                    }
                    instance.update(wVar.f40426a, wVar.f40427b, wVar.f40428c - wVar.f40427b);
                }
            }
            return C13896f.m59656e(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final C13890c mo43866b(C13890c cVar) {
        if (cVar.f40348a == null) {
            cVar.f40348a = this;
            cVar.f40349b = false;
            return cVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    /* renamed from: a */
    public void mo43861a(C13887c cVar, long j) throws EOFException {
        long j2 = this.f40340b;
        if (j2 >= j) {
            cVar.mo43815b(this, j);
        } else {
            cVar.mo43815b(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public long mo43844a(C13924z zVar) throws IOException {
        long j = this.f40340b;
        if (j > 0) {
            zVar.mo43815b(this, j);
        }
        return j;
    }

    /* renamed from: a */
    public String mo43860a(Charset charset) {
        try {
            return mo43859a(this.f40340b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String mo43859a(long j, Charset charset) throws EOFException {
        C13893d0.m59606a(this.f40340b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            C13921w wVar = this.f40339a;
            int i = wVar.f40427b;
            if (((long) i) + j > ((long) wVar.f40428c)) {
                return new String(mo43897j(j), charset);
            }
            String str = new String(wVar.f40426a, i, (int) j, charset);
            wVar.f40427b = (int) (((long) wVar.f40427b) + j);
            this.f40340b -= j;
            if (wVar.f40427b == wVar.f40428c) {
                this.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            }
            return str;
        }
    }

    /* renamed from: a */
    public C13887c m59514a(C13896f fVar) {
        if (fVar != null) {
            fVar.mo43955a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public C13887c m59515a(String str) {
        return m59516a(str, 0, str.length());
    }

    /* renamed from: a */
    public C13887c m59516a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C13921w e = mo43883e(1);
                    byte[] bArr = e.f40426a;
                    int i3 = e.f40428c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        int i5 = i4 + 1;
                        bArr[i4 + i3] = (byte) charAt2;
                        i4 = i5;
                    }
                    int i6 = i3 + i4;
                    int i7 = e.f40428c;
                    int i8 = i6 - i7;
                    e.f40428c = i7 + i8;
                    this.f40340b += (long) i8;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        writeByte((charAt >> 6) | 192);
                        writeByte((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | JpegConst.APP0);
                        writeByte(((charAt >> 6) & 63) | 128);
                        writeByte((int) (charAt & '?') | 128);
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + C5785c.f16680M;
                            writeByte((i10 >> 18) | 240);
                            writeByte(((i10 >> 12) & 63) | 128);
                            writeByte(((i10 >> 6) & 63) | 128);
                            writeByte((i10 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public C13887c m59518a(String str, Charset charset) {
        return m59517a(str, 0, str.length(), charset);
    }

    /* renamed from: a */
    public C13887c m59517a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C13893d0.f40350a)) {
            return m59516a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public long mo43842a(C13883a0 a0Var) throws IOException {
        if (a0Var != null) {
            long j = 0;
            while (true) {
                long read = a0Var.read(this, PlaybackStateCompat.f476k0);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: a */
    public C13892d mo43857a(C13883a0 a0Var, long j) throws IOException {
        while (j > 0) {
            long read = a0Var.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: a */
    public long mo43839a(byte b) {
        return mo43841a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo43840a(byte b, long j) {
        return mo43841a(b, j, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo43841a(byte b, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f40340b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f40340b;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4) {
            return -1;
        }
        C13921w wVar = this.f40339a;
        if (wVar == null) {
            return -1;
        }
        long j5 = this.f40340b;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (wVar.f40428c - wVar.f40427b)) + j5;
                if (j3 >= j) {
                    break;
                }
                wVar = wVar.f40431f;
            }
        } else {
            while (j5 > j) {
                wVar = wVar.f40432g;
                j5 -= (long) (wVar.f40428c - wVar.f40427b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = wVar.f40426a;
            int min = (int) Math.min((long) wVar.f40428c, (((long) wVar.f40427b) + j4) - j5);
            for (int i = (int) ((((long) wVar.f40427b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - wVar.f40427b)) + j5;
                }
            }
            byte b2 = b;
            j6 = ((long) (wVar.f40428c - wVar.f40427b)) + j5;
            wVar = wVar.f40431f;
            j5 = j6;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo43843a(C13896f fVar, long j) throws IOException {
        byte[] bArr;
        C13921w wVar;
        if (fVar.mo43985r() != 0) {
            long j2 = 0;
            if (j >= 0) {
                C13921w wVar2 = this.f40339a;
                long j3 = -1;
                if (wVar2 == null) {
                    return -1;
                }
                long j4 = this.f40340b;
                if (j4 - j >= j) {
                    while (true) {
                        j4 = j2;
                        j2 = ((long) (wVar2.f40428c - wVar2.f40427b)) + j4;
                        if (j2 >= j) {
                            break;
                        }
                        wVar2 = wVar2.f40431f;
                    }
                } else {
                    while (j4 > j) {
                        wVar2 = wVar2.f40432g;
                        j4 -= (long) (wVar2.f40428c - wVar2.f40427b);
                    }
                }
                byte a = fVar.mo43949a(0);
                int r = fVar.mo43985r();
                long j5 = 1 + (this.f40340b - ((long) r));
                long j6 = j;
                C13921w wVar3 = wVar2;
                long j7 = j4;
                while (j7 < j5) {
                    byte[] bArr2 = wVar3.f40426a;
                    int min = (int) Math.min((long) wVar3.f40428c, (((long) wVar3.f40427b) + j5) - j7);
                    int i = (int) ((((long) wVar3.f40427b) + j6) - j7);
                    while (i < min) {
                        if (bArr2[i] == a) {
                            bArr = bArr2;
                            wVar = wVar3;
                            if (m59487a(wVar3, i + 1, fVar, 1, r)) {
                                return ((long) (i - wVar.f40427b)) + j7;
                            }
                        } else {
                            bArr = bArr2;
                            wVar = wVar3;
                        }
                        i++;
                        wVar3 = wVar;
                        bArr2 = bArr;
                    }
                    C13921w wVar4 = wVar3;
                    j6 = ((long) (wVar4.f40428c - wVar4.f40427b)) + j7;
                    wVar3 = wVar4.f40431f;
                    j3 = -1;
                    j7 = j6;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    /* renamed from: a */
    public boolean mo43862a(long j, C13896f fVar) {
        return mo43863a(j, fVar, 0, fVar.mo43985r());
    }

    /* renamed from: a */
    public boolean mo43863a(long j, C13896f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f40340b - j < ((long) i2) || fVar.mo43985r() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo43836a(((long) i3) + j) != fVar.mo43949a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m59487a(C13921w wVar, int i, C13896f fVar, int i2, int i3) {
        int i4 = wVar.f40428c;
        byte[] bArr = wVar.f40426a;
        while (i2 < i3) {
            if (i == i4) {
                wVar = wVar.f40431f;
                byte[] bArr2 = wVar.f40426a;
                int i5 = wVar.f40427b;
                bArr = bArr2;
                i = i5;
                i4 = wVar.f40428c;
            }
            if (bArr[i] != fVar.mo43949a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    private C13896f m59485a(String str, C13896f fVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(fVar.mo43989u(), str));
            if (this.f40339a != null) {
                instance.update(this.f40339a.f40426a, this.f40339a.f40427b, this.f40339a.f40428c - this.f40339a.f40427b);
                C13921w wVar = this.f40339a;
                while (true) {
                    wVar = wVar.f40431f;
                    if (wVar == this.f40339a) {
                        break;
                    }
                    instance.update(wVar.f40426a, wVar.f40427b, wVar.f40428c - wVar.f40427b);
                }
            }
            return C13896f.m59656e(instance.doFinal());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final C13896f mo43858a(int i) {
        if (i == 0) {
            return C13896f.f40352P;
        }
        return new C13923y(this, i);
    }

    /* renamed from: a */
    public final C13890c mo43845a(C13890c cVar) {
        if (cVar.f40348a == null) {
            cVar.f40348a = this;
            cVar.f40349b = true;
            return cVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}
