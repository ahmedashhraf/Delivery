package com.google.android.gms.internal.measurement;

import com.google.common.base.C5785c;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4898o3 extends C4872m3 {

    /* renamed from: f */
    private final byte[] f14312f;

    /* renamed from: g */
    private final boolean f14313g;

    /* renamed from: h */
    private int f14314h;

    /* renamed from: i */
    private int f14315i;

    /* renamed from: j */
    private int f14316j;

    /* renamed from: k */
    private int f14317k;

    /* renamed from: l */
    private int f14318l;

    /* renamed from: m */
    private int f14319m;

    private C4898o3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f14319m = Integer.MAX_VALUE;
        this.f14312f = bArr;
        this.f14314h = i2 + i;
        this.f14316j = i;
        this.f14317k = this.f14316j;
        this.f14313g = z;
    }

    /* renamed from: A */
    private final void m20867A() {
        this.f14314h += this.f14315i;
        int i = this.f14314h;
        int i2 = i - this.f14317k;
        int i3 = this.f14319m;
        if (i2 > i3) {
            this.f14315i = i2 - i3;
            this.f14314h = i - this.f14315i;
            return;
        }
        this.f14315i = 0;
    }

    /* renamed from: v */
    private final byte m20869v() throws IOException {
        int i = this.f14316j;
        if (i != this.f14314h) {
            byte[] bArr = this.f14312f;
            this.f14316j = i + 1;
            return bArr[i];
        }
        throw zzfn.m22028a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20870w() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14316j
            int r1 = r5.f14314h
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f14312f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f14316j = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f14316j = r1
            return r0
        L_0x006b:
            long r0 = r5.mo19294s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4898o3.m20870w():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m20871x() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f14316j
            int r1 = r11.f14314h
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.f14312f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f14316j = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b5
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            r3 = r2
            goto L_0x00b2
        L_0x0026:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0037
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r3 = r9
            goto L_0x00b2
        L_0x0037:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0045
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0045:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005c
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0058:
            long r1 = r1 ^ r3
            r3 = r1
        L_0x005a:
            r1 = r0
            goto L_0x00b2
        L_0x005c:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006e:
            long r3 = r3 ^ r5
            goto L_0x00b2
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0058
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006e
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x005a
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
        L_0x00b2:
            r11.f14316j = r1
            return r3
        L_0x00b5:
            long r0 = r11.mo19294s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4898o3.m20871x():long");
    }

    /* renamed from: y */
    private final int m20872y() throws IOException {
        int i = this.f14316j;
        if (this.f14314h - i >= 4) {
            byte[] bArr = this.f14312f;
            this.f14316j = i + 4;
            return ((bArr[i + 3] & 255) << C5785c.f16669B) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzfn.m22028a();
    }

    /* renamed from: z */
    private final long m20873z() throws IOException {
        int i = this.f14316j;
        if (this.f14314h - i >= 8) {
            byte[] bArr = this.f14312f;
            this.f14316j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzfn.m22028a();
    }

    /* renamed from: a */
    public final int mo19272a() throws IOException {
        if (mo19295t()) {
            this.f14318l = 0;
            return 0;
        }
        this.f14318l = m20870w();
        int i = this.f14318l;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw zzfn.m22031f();
    }

    /* renamed from: b */
    public final boolean mo19275b(int i) throws IOException {
        int a;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f14314h - this.f14316j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f14312f;
                    int i4 = this.f14316j;
                    this.f14316j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfn.m22030e();
            }
            while (i3 < 10) {
                if (m20869v() < 0) {
                    i3++;
                }
            }
            throw zzfn.m22030e();
            return true;
        } else if (i2 == 1) {
            m20868f(8);
            return true;
        } else if (i2 == 2) {
            m20868f(m20870w());
            return true;
        } else if (i2 == 3) {
            do {
                a = mo19272a();
                if (a == 0) {
                    break;
                }
            } while (mo19275b(a));
            mo19273a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m20868f(4);
                return true;
            }
            throw zzfn.m22033h();
        }
    }

    /* renamed from: c */
    public final float mo19276c() throws IOException {
        return Float.intBitsToFloat(m20872y());
    }

    /* renamed from: d */
    public final long mo19278d() throws IOException {
        return m20871x();
    }

    /* renamed from: e */
    public final long mo19280e() throws IOException {
        return m20871x();
    }

    /* renamed from: f */
    public final int mo19281f() throws IOException {
        return m20870w();
    }

    /* renamed from: g */
    public final long mo19282g() throws IOException {
        return m20873z();
    }

    /* renamed from: h */
    public final int mo19283h() throws IOException {
        return m20872y();
    }

    /* renamed from: i */
    public final boolean mo19284i() throws IOException {
        return m20871x() != 0;
    }

    /* renamed from: j */
    public final String mo19285j() throws IOException {
        int w = m20870w();
        if (w > 0) {
            int i = this.f14314h;
            int i2 = this.f14316j;
            if (w <= i - i2) {
                String str = new String(this.f14312f, i2, w, C4819j4.f14218a);
                this.f14316j += w;
                return str;
            }
        }
        if (w == 0) {
            return "";
        }
        if (w < 0) {
            throw zzfn.m22029d();
        }
        throw zzfn.m22028a();
    }

    /* renamed from: k */
    public final String mo19286k() throws IOException {
        int w = m20870w();
        if (w > 0) {
            int i = this.f14314h;
            int i2 = this.f14316j;
            if (w <= i - i2) {
                String b = C4809i7.m20375b(this.f14312f, i2, w);
                this.f14316j += w;
                return b;
            }
        }
        if (w == 0) {
            return "";
        }
        if (w <= 0) {
            throw zzfn.m22029d();
        }
        throw zzfn.m22028a();
    }

    /* renamed from: l */
    public final C5070z2 mo19287l() throws IOException {
        byte[] bArr;
        int w = m20870w();
        if (w > 0) {
            int i = this.f14314h;
            int i2 = this.f14316j;
            if (w <= i - i2) {
                C5070z2 a = C5070z2.m21869a(this.f14312f, i2, w);
                this.f14316j += w;
                return a;
            }
        }
        if (w == 0) {
            return C5070z2.f14557b;
        }
        if (w > 0) {
            int i3 = this.f14314h;
            int i4 = this.f14316j;
            if (w <= i3 - i4) {
                this.f14316j = w + i4;
                bArr = Arrays.copyOfRange(this.f14312f, i4, this.f14316j);
                return C5070z2.m21868a(bArr);
            }
        }
        if (w > 0) {
            throw zzfn.m22028a();
        } else if (w == 0) {
            bArr = C4819j4.f14220c;
            return C5070z2.m21868a(bArr);
        } else {
            throw zzfn.m22029d();
        }
    }

    /* renamed from: m */
    public final int mo19288m() throws IOException {
        return m20870w();
    }

    /* renamed from: n */
    public final int mo19289n() throws IOException {
        return m20870w();
    }

    /* renamed from: o */
    public final int mo19290o() throws IOException {
        return m20872y();
    }

    /* renamed from: p */
    public final long mo19291p() throws IOException {
        return m20873z();
    }

    /* renamed from: q */
    public final int mo19292q() throws IOException {
        return C4872m3.m20651e(m20870w());
    }

    /* renamed from: r */
    public final long mo19293r() throws IOException {
        return C4872m3.m20649a(m20871x());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo19294s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte v = m20869v();
            j |= ((long) (v & Byte.MAX_VALUE)) << i;
            if ((v & 128) == 0) {
                return j;
            }
        }
        throw zzfn.m22030e();
    }

    /* renamed from: t */
    public final boolean mo19295t() throws IOException {
        return this.f14316j == this.f14314h;
    }

    /* renamed from: u */
    public final int mo19296u() {
        return this.f14316j - this.f14317k;
    }

    /* renamed from: f */
    private final void m20868f(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f14314h;
            int i3 = this.f14316j;
            if (i <= i2 - i3) {
                this.f14316j = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfn.m22029d();
        }
        throw zzfn.m22028a();
    }

    /* renamed from: c */
    public final int mo19277c(int i) throws zzfn {
        if (i >= 0) {
            int u = i + mo19296u();
            int i2 = this.f14319m;
            if (u <= i2) {
                this.f14319m = u;
                m20867A();
                return i2;
            }
            throw zzfn.m22028a();
        }
        throw zzfn.m22029d();
    }

    /* renamed from: d */
    public final void mo19279d(int i) {
        this.f14319m = i;
        m20867A();
    }

    /* renamed from: a */
    public final void mo19273a(int i) throws zzfn {
        if (this.f14318l != i) {
            throw zzfn.m22032g();
        }
    }

    /* renamed from: b */
    public final double mo19274b() throws IOException {
        return Double.longBitsToDouble(m20873z());
    }
}
