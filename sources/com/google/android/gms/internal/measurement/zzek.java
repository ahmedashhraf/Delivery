package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class zzek extends C5031w2 {

    /* renamed from: b */
    private static final Logger f14564b = Logger.getLogger(zzek.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f14565c = C4759f7.m20154a();

    /* renamed from: a */
    C4943r3 f14566a = this;

    /* renamed from: com.google.android.gms.internal.measurement.zzek$a */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static class C5080a extends zzek {

        /* renamed from: d */
        private final byte[] f14567d;

        /* renamed from: e */
        private final int f14568e;

        /* renamed from: f */
        private final int f14569f;

        /* renamed from: g */
        private int f14570g;

        C5080a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f14567d = bArr;
                    this.f14568e = 0;
                    this.f14570g = 0;
                    this.f14569f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final void mo19782a(int i, int i2) throws IOException {
            mo19796b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo19797b(int i, int i2) throws IOException {
            mo19782a(i, 0);
            mo19779a(i2);
        }

        /* renamed from: c */
        public final void mo19803c(int i, int i2) throws IOException {
            mo19782a(i, 0);
            mo19796b(i2);
        }

        /* renamed from: d */
        public final void mo19806d(int i) throws IOException {
            try {
                byte[] bArr = this.f14567d;
                int i2 = this.f14570g;
                this.f14570g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f14567d;
                int i3 = this.f14570g;
                this.f14570g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f14567d;
                int i4 = this.f14570g;
                this.f14570g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f14567d;
                int i5 = this.f14570g;
                this.f14570g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: e */
        public final void mo19808e(int i, int i2) throws IOException {
            mo19782a(i, 5);
            mo19806d(i2);
        }

        /* renamed from: a */
        public final void mo19783a(int i, long j) throws IOException {
            mo19782a(i, 0);
            mo19789a(j);
        }

        /* renamed from: b */
        public final void mo19801b(byte[] bArr, int i, int i2) throws IOException {
            mo19796b(i2);
            m22003c(bArr, 0, i2);
        }

        /* renamed from: c */
        public final void mo19804c(int i, long j) throws IOException {
            mo19782a(i, 1);
            mo19805c(j);
        }

        /* renamed from: a */
        public final void mo19788a(int i, boolean z) throws IOException {
            mo19782a(i, 0);
            mo19776a(z ? (byte) 1 : 0);
        }

        /* renamed from: b */
        public final void mo19799b(int i, C5070z2 z2Var) throws IOException {
            mo19782a(1, 3);
            mo19803c(2, i);
            mo19786a(3, z2Var);
            mo19782a(1, 4);
        }

        /* renamed from: c */
        public final void mo19805c(long j) throws IOException {
            try {
                byte[] bArr = this.f14567d;
                int i = this.f14570g;
                this.f14570g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f14567d;
                int i2 = this.f14570g;
                this.f14570g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f14567d;
                int i3 = this.f14570g;
                this.f14570g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f14567d;
                int i4 = this.f14570g;
                this.f14570g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f14567d;
                int i5 = this.f14570g;
                this.f14570g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f14567d;
                int i6 = this.f14570g;
                this.f14570g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f14567d;
                int i7 = this.f14570g;
                this.f14570g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f14567d;
                int i8 = this.f14570g;
                this.f14570g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo19787a(int i, String str) throws IOException {
            mo19782a(i, 2);
            mo19792a(str);
        }

        /* renamed from: a */
        public final void mo19786a(int i, C5070z2 z2Var) throws IOException {
            mo19782a(i, 2);
            mo19791a(z2Var);
        }

        /* renamed from: b */
        public final void mo19796b(int i) throws IOException {
            if (!zzek.f14565c || C4955s2.m21100a() || mo19775a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f14567d;
                    int i2 = this.f14570g;
                    this.f14570g = i2 + 1;
                    bArr[i2] = (byte) ((i & C13959t.f40827P1) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14567d;
                    int i3 = this.f14570g;
                    this.f14570g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f14567d;
                int i4 = this.f14570g;
                this.f14570g = i4 + 1;
                C4759f7.m20153a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f14567d;
                int i5 = this.f14570g;
                this.f14570g = i5 + 1;
                C4759f7.m20153a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f14567d;
                    int i7 = this.f14570g;
                    this.f14570g = i7 + 1;
                    C4759f7.m20153a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f14567d;
                int i8 = this.f14570g;
                this.f14570g = i8 + 1;
                C4759f7.m20153a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f14567d;
                    int i10 = this.f14570g;
                    this.f14570g = i10 + 1;
                    C4759f7.m20153a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f14567d;
                int i11 = this.f14570g;
                this.f14570g = i11 + 1;
                C4759f7.m20153a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f14567d;
                    int i13 = this.f14570g;
                    this.f14570g = i13 + 1;
                    C4759f7.m20153a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f14567d;
                int i14 = this.f14570g;
                this.f14570g = i14 + 1;
                C4759f7.m20153a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.f14567d;
                int i16 = this.f14570g;
                this.f14570g = i16 + 1;
                C4759f7.m20153a(bArr11, (long) i16, (byte) i15);
            }
        }

        /* renamed from: a */
        public final void mo19791a(C5070z2 z2Var) throws IOException {
            mo19796b(z2Var.mo18883a());
            z2Var.mo19164a((C5031w2) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19785a(int i, C4945r5 r5Var, C4790h6 h6Var) throws IOException {
            mo19782a(i, 2);
            C4910p2 p2Var = (C4910p2) r5Var;
            int g = p2Var.mo19049g();
            if (g == -1) {
                g = h6Var.mo19037d(p2Var);
                p2Var.mo19043a(g);
            }
            mo19796b(g);
            h6Var.mo19031a(r5Var, (C5036w7) this.f14566a);
        }

        /* renamed from: c */
        private final void m22003c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f14567d, this.f14570g, i2);
                this.f14570g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo19784a(int i, C4945r5 r5Var) throws IOException {
            mo19782a(1, 3);
            mo19803c(2, i);
            mo19782a(3, 2);
            mo19790a(r5Var);
            mo19782a(1, 4);
        }

        /* renamed from: a */
        public final void mo19790a(C4945r5 r5Var) throws IOException {
            mo19796b(r5Var.mo19045b());
            r5Var.mo19044a(this);
        }

        /* renamed from: a */
        public final void mo19776a(byte b) throws IOException {
            try {
                byte[] bArr = this.f14567d;
                int i = this.f14570g;
                this.f14570g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo19779a(int i) throws IOException {
            if (i >= 0) {
                mo19796b(i);
            } else {
                mo19789a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo19789a(long j) throws IOException {
            if (!zzek.f14565c || mo19775a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f14567d;
                    int i = this.f14570g;
                    this.f14570g = i + 1;
                    bArr[i] = (byte) ((((int) j) & C13959t.f40827P1) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14567d;
                    int i2 = this.f14570g;
                    this.f14570g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14570g), Integer.valueOf(this.f14569f), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f14567d;
                    int i3 = this.f14570g;
                    this.f14570g = i3 + 1;
                    C4759f7.m20153a(bArr3, (long) i3, (byte) ((((int) j) & C13959t.f40827P1) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f14567d;
                int i4 = this.f14570g;
                this.f14570g = i4 + 1;
                C4759f7.m20153a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo19726a(byte[] bArr, int i, int i2) throws IOException {
            m22003c(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo19792a(String str) throws IOException {
            int i = this.f14570g;
            try {
                int g = zzek.m21952g(str.length() * 3);
                int g2 = zzek.m21952g(str.length());
                if (g2 == g) {
                    this.f14570g = i + g2;
                    int a = C4809i7.m20369a(str, this.f14567d, this.f14570g, mo19775a());
                    this.f14570g = i;
                    mo19796b((a - i) - g2);
                    this.f14570g = a;
                    return;
                }
                mo19796b(C4809i7.m20368a((CharSequence) str));
                this.f14570g = C4809i7.m20369a(str, this.f14567d, this.f14570g, mo19775a());
            } catch (C4863l7 e) {
                this.f14570g = i;
                mo19793a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        /* renamed from: a */
        public final int mo19775a() {
            return this.f14569f - this.f14570g;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    private zzek() {
    }

    /* renamed from: a */
    public static zzek m21923a(byte[] bArr) {
        return new C5080a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m21924b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m21925b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m21936b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m21946e(int i, long j) {
        return m21945e(i) + m21947e(j);
    }

    /* renamed from: e */
    public static int m21947e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m21949f(int i, int i2) {
        return m21945e(i) + m21948f(i2);
    }

    /* renamed from: g */
    public static int m21952g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m21953g(int i, int i2) {
        return m21945e(i) + m21952g(i2);
    }

    /* renamed from: g */
    public static int m21955g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m21957h(int i, int i2) {
        return m21945e(i) + m21952g(m21968m(i2));
    }

    /* renamed from: h */
    public static int m21959h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m21960i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m21961i(int i, int i2) {
        return m21945e(i) + 4;
    }

    /* renamed from: i */
    private static long m21962i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m21963j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m21964j(int i, int i2) {
        return m21945e(i) + 4;
    }

    /* renamed from: k */
    public static int m21966k(int i, int i2) {
        return m21945e(i) + m21948f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m21967l(int i) {
        return m21952g(i);
    }

    /* renamed from: m */
    private static int m21968m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo19775a();

    /* renamed from: a */
    public abstract void mo19776a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo19779a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo19782a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo19783a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo19784a(int i, C4945r5 r5Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo19785a(int i, C4945r5 r5Var, C4790h6 h6Var) throws IOException;

    /* renamed from: a */
    public abstract void mo19786a(int i, C5070z2 z2Var) throws IOException;

    /* renamed from: a */
    public abstract void mo19787a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo19788a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo19789a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo19790a(C4945r5 r5Var) throws IOException;

    /* renamed from: a */
    public abstract void mo19791a(C5070z2 z2Var) throws IOException;

    /* renamed from: a */
    public abstract void mo19792a(String str) throws IOException;

    /* renamed from: b */
    public abstract void mo19796b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo19797b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo19798b(int i, long j) throws IOException {
        mo19783a(i, m21962i(j));
    }

    /* renamed from: b */
    public abstract void mo19799b(int i, C5070z2 z2Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo19801b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo19802c(int i) throws IOException {
        mo19796b(m21968m(i));
    }

    /* renamed from: c */
    public abstract void mo19803c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo19804c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo19805c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo19806d(int i) throws IOException;

    /* renamed from: d */
    public final void mo19807d(int i, int i2) throws IOException {
        mo19803c(i, m21968m(i2));
    }

    /* renamed from: e */
    public abstract void mo19808e(int i, int i2) throws IOException;

    /* renamed from: c */
    public static int m21939c(int i, C5070z2 z2Var) {
        int e = m21945e(i);
        int a = z2Var.mo18883a();
        return e + m21952g(a) + a;
    }

    /* renamed from: d */
    public static int m21942d(int i, long j) {
        return m21945e(i) + m21947e(j);
    }

    /* renamed from: e */
    public static int m21945e(int i) {
        return m21952g(i << 3);
    }

    /* renamed from: f */
    public static int m21950f(int i, long j) {
        return m21945e(i) + m21947e(m21962i(j));
    }

    /* renamed from: g */
    public static int m21954g(int i, long j) {
        return m21945e(i) + 8;
    }

    /* renamed from: b */
    public final void mo19800b(long j) throws IOException {
        mo19789a(m21962i(j));
    }

    /* renamed from: b */
    public static int m21927b(int i, float f) {
        return m21945e(i) + 4;
    }

    /* renamed from: h */
    public static int m21958h(int i, long j) {
        return m21945e(i) + 8;
    }

    /* renamed from: k */
    public static int m21965k(int i) {
        return m21948f(i);
    }

    /* renamed from: a */
    public final void mo19781a(int i, float f) throws IOException {
        mo19808e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m21926b(int i, double d) {
        return m21945e(i) + 8;
    }

    /* renamed from: d */
    public static int m21943d(int i, C5070z2 z2Var) {
        return (m21945e(1) << 1) + m21953g(2, i) + m21939c(3, z2Var);
    }

    /* renamed from: f */
    public static int m21948f(int i) {
        if (i >= 0) {
            return m21952g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m21956h(int i) {
        return m21952g(m21968m(i));
    }

    /* renamed from: a */
    public final void mo19780a(int i, double d) throws IOException {
        mo19804c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: b */
    public static int m21932b(int i, boolean z) {
        return m21945e(i) + 1;
    }

    @Deprecated
    /* renamed from: c */
    static int m21938c(int i, C4945r5 r5Var, C4790h6 h6Var) {
        int e = m21945e(i) << 1;
        C4910p2 p2Var = (C4910p2) r5Var;
        int g = p2Var.mo19049g();
        if (g == -1) {
            g = h6Var.mo19037d(p2Var);
            p2Var.mo19043a(g);
        }
        return e + g;
    }

    /* renamed from: f */
    public static int m21951f(long j) {
        return m21947e(m21962i(j));
    }

    /* renamed from: a */
    public final void mo19778a(float f) throws IOException {
        mo19806d(Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m21931b(int i, String str) {
        return m21945e(i) + m21935b(str);
    }

    /* renamed from: a */
    public final void mo19777a(double d) throws IOException {
        mo19805c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: b */
    static int m21929b(int i, C4945r5 r5Var, C4790h6 h6Var) {
        return m21945e(i) + m21921a(r5Var, h6Var);
    }

    /* renamed from: d */
    public static int m21944d(long j) {
        return m21947e(j);
    }

    /* renamed from: a */
    public final void mo19794a(boolean z) throws IOException {
        mo19776a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static int m21920a(int i, C5020v4 v4Var) {
        int e = m21945e(i);
        int a = v4Var.mo19720a();
        return e + m21952g(a) + a;
    }

    /* renamed from: b */
    public static int m21928b(int i, C4945r5 r5Var) {
        return (m21945e(1) << 1) + m21953g(2, i) + m21945e(3) + m21933b(r5Var);
    }

    @Deprecated
    /* renamed from: c */
    public static int m21940c(C4945r5 r5Var) {
        return r5Var.mo19045b();
    }

    /* renamed from: a */
    public static int m21922a(C5020v4 v4Var) {
        int a = v4Var.mo19720a();
        return m21952g(a) + a;
    }

    /* renamed from: b */
    public static int m21930b(int i, C5020v4 v4Var) {
        return (m21945e(1) << 1) + m21953g(2, i) + m21920a(3, v4Var);
    }

    /* renamed from: a */
    static int m21921a(C4945r5 r5Var, C4790h6 h6Var) {
        C4910p2 p2Var = (C4910p2) r5Var;
        int g = p2Var.mo19049g();
        if (g == -1) {
            g = h6Var.mo19037d(p2Var);
            p2Var.mo19043a(g);
        }
        return m21952g(g) + g;
    }

    /* renamed from: b */
    public static int m21935b(String str) {
        int i;
        try {
            i = C4809i7.m20368a((CharSequence) str);
        } catch (C4863l7 unused) {
            i = str.getBytes(C4819j4.f14218a).length;
        }
        return m21952g(i) + i;
    }

    /* renamed from: b */
    public static int m21934b(C5070z2 z2Var) {
        int a = z2Var.mo18883a();
        return m21952g(a) + a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19793a(String str, C4863l7 l7Var) throws IOException {
        f14564b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", l7Var);
        byte[] bytes = str.getBytes(C4819j4.f14218a);
        try {
            mo19796b(bytes.length);
            mo19726a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static int m21937b(byte[] bArr) {
        int length = bArr.length;
        return m21952g(length) + length;
    }

    /* renamed from: b */
    public static int m21933b(C4945r5 r5Var) {
        int b = r5Var.mo19045b();
        return m21952g(b) + b;
    }

    /* renamed from: b */
    public final void mo19795b() {
        if (mo19775a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
