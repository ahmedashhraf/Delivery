package com.google.android.gms.internal.measurement;

import com.google.common.base.C5785c;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5018v2 {
    /* renamed from: a */
    static int m21625a(byte[] bArr, int i, C5004u2 u2Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m21619a((int) b, bArr, i2, u2Var);
        }
        u2Var.f14433a = b;
        return i2;
    }

    /* renamed from: b */
    static int m21626b(byte[] bArr, int i, C5004u2 u2Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            u2Var.f14434b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        u2Var.f14434b = j3;
        return i3;
    }

    /* renamed from: c */
    static double m21628c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m21627b(bArr, i));
    }

    /* renamed from: d */
    static float m21630d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m21623a(bArr, i));
    }

    /* renamed from: e */
    static int m21632e(byte[] bArr, int i, C5004u2 u2Var) throws zzfn {
        int a = m21625a(bArr, i, u2Var);
        int i2 = u2Var.f14433a;
        if (i2 < 0) {
            throw zzfn.m22029d();
        } else if (i2 > bArr.length - a) {
            throw zzfn.m22028a();
        } else if (i2 == 0) {
            u2Var.f14435c = C5070z2.f14557b;
            return a;
        } else {
            u2Var.f14435c = C5070z2.m21869a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: c */
    static int m21629c(byte[] bArr, int i, C5004u2 u2Var) throws zzfn {
        int a = m21625a(bArr, i, u2Var);
        int i2 = u2Var.f14433a;
        if (i2 < 0) {
            throw zzfn.m22029d();
        } else if (i2 == 0) {
            u2Var.f14435c = "";
            return a;
        } else {
            u2Var.f14435c = new String(bArr, a, i2, C4819j4.f14218a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m21631d(byte[] bArr, int i, C5004u2 u2Var) throws zzfn {
        int a = m21625a(bArr, i, u2Var);
        int i2 = u2Var.f14433a;
        if (i2 < 0) {
            throw zzfn.m22029d();
        } else if (i2 == 0) {
            u2Var.f14435c = "";
            return a;
        } else {
            u2Var.f14435c = C4809i7.m20375b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: a */
    static int m21619a(int i, byte[] bArr, int i2, C5004u2 u2Var) {
        int i3 = i & C13959t.f40827P1;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            u2Var.f14433a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            u2Var.f14433a = i5 | (b2 << C5785c.f16697p);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << C5785c.f16697p);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            u2Var.f14433a = i7 | (b3 << C5785c.f16706y);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << C5785c.f16706y);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            u2Var.f14433a = i9 | (b4 << C5785c.f16673F);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << C5785c.f16673F);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                u2Var.f14433a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static long m21627b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    static int m21623a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << C5785c.f16669B) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m21622a(com.google.android.gms.internal.measurement.C4790h6 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C5004u2 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m21619a(r8, r7, r0, r10)
            int r8 = r10.f14433a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo19029a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo19032a(r1, r2, r3, r4, r5)
            r6.mo19036c(r9)
            r10.f14435c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzfn r6 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5018v2.m21622a(com.google.android.gms.internal.measurement.h6, byte[], int, int, com.google.android.gms.internal.measurement.u2):int");
    }

    /* renamed from: a */
    static int m21621a(C4790h6 h6Var, byte[] bArr, int i, int i2, int i3, C5004u2 u2Var) throws IOException {
        C5021v5 v5Var = (C5021v5) h6Var;
        Object a = v5Var.mo19029a();
        int a2 = v5Var.mo19723a(a, bArr, i, i2, i3, u2Var);
        v5Var.mo19036c(a);
        u2Var.f14435c = a;
        return a2;
    }

    /* renamed from: a */
    static int m21617a(int i, byte[] bArr, int i2, int i3, C4912p4<?> p4Var, C5004u2 u2Var) {
        C4833k4 k4Var = (C4833k4) p4Var;
        int a = m21625a(bArr, i2, u2Var);
        k4Var.mo19167b(u2Var.f14433a);
        while (a < i3) {
            int a2 = m21625a(bArr, a, u2Var);
            if (i != u2Var.f14433a) {
                break;
            }
            a = m21625a(bArr, a2, u2Var);
            k4Var.mo19167b(u2Var.f14433a);
        }
        return a;
    }

    /* renamed from: a */
    static int m21624a(byte[] bArr, int i, C4912p4<?> p4Var, C5004u2 u2Var) throws IOException {
        C4833k4 k4Var = (C4833k4) p4Var;
        int a = m21625a(bArr, i, u2Var);
        int i2 = u2Var.f14433a + a;
        while (a < i2) {
            a = m21625a(bArr, a, u2Var);
            k4Var.mo19167b(u2Var.f14433a);
        }
        if (a == i2) {
            return a;
        }
        throw zzfn.m22028a();
    }

    /* renamed from: a */
    static int m21620a(C4790h6<?> h6Var, int i, byte[] bArr, int i2, int i3, C4912p4<?> p4Var, C5004u2 u2Var) throws IOException {
        int a = m21622a((C4790h6) h6Var, bArr, i2, i3, u2Var);
        p4Var.add(u2Var.f14435c);
        while (a < i3) {
            int a2 = m21625a(bArr, a, u2Var);
            if (i != u2Var.f14433a) {
                break;
            }
            a = m21622a((C4790h6) h6Var, bArr, a2, i3, u2Var);
            p4Var.add(u2Var.f14435c);
        }
        return a;
    }

    /* renamed from: a */
    static int m21616a(int i, byte[] bArr, int i2, int i3, C4699b7 b7Var, C5004u2 u2Var) throws zzfn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m21626b(bArr, i2, u2Var);
                b7Var.mo18865a(i, (Object) Long.valueOf(u2Var.f14434b));
                return b;
            } else if (i4 == 1) {
                b7Var.mo18865a(i, (Object) Long.valueOf(m21627b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m21625a(bArr, i2, u2Var);
                int i5 = u2Var.f14433a;
                if (i5 < 0) {
                    throw zzfn.m22029d();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        b7Var.mo18865a(i, (Object) C5070z2.f14557b);
                    } else {
                        b7Var.mo18865a(i, (Object) C5070z2.m21869a(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw zzfn.m22028a();
                }
            } else if (i4 == 3) {
                C4699b7 e = C4699b7.m19963e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m21625a(bArr, i2, u2Var);
                    int i8 = u2Var.f14433a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m21616a(i7, bArr, a2, i3, e, u2Var);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfn.m22034i();
                }
                b7Var.mo18865a(i, (Object) e);
                return i2;
            } else if (i4 == 5) {
                b7Var.mo18865a(i, (Object) Integer.valueOf(m21623a(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzfn.m22031f();
            }
        } else {
            throw zzfn.m22031f();
        }
    }

    /* renamed from: a */
    static int m21618a(int i, byte[] bArr, int i2, int i3, C5004u2 u2Var) throws zzfn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m21626b(bArr, i2, u2Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m21625a(bArr, i2, u2Var) + u2Var.f14433a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m21625a(bArr, i2, u2Var);
                    i6 = u2Var.f14433a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m21618a(i6, bArr, i2, i3, u2Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzfn.m22034i();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzfn.m22031f();
            }
        } else {
            throw zzfn.m22031f();
        }
    }
}
