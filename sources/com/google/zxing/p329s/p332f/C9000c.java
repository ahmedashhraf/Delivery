package com.google.zxing.p329s.p332f;

import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8973d;
import com.google.zxing.p335u.C9043a;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.s.f.c */
/* compiled from: Encoder */
public final class C9000c {

    /* renamed from: a */
    public static final int f23529a = 33;

    /* renamed from: b */
    public static final int f23530b = 0;

    /* renamed from: c */
    private static final int f23531c = 32;

    /* renamed from: d */
    private static final int f23532d = 4;

    /* renamed from: e */
    private static final int[] f23533e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private C9000c() {
    }

    /* renamed from: a */
    private static int m42051a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: a */
    public static C8998a m42053a(byte[] bArr) {
        return m42054a(bArr, 33, 0);
    }

    /* renamed from: b */
    private static C9043a m42060b(C9043a aVar, int i, int i2) {
        int d = aVar.mo32979d() / i2;
        C8973d dVar = new C8973d(m42052a(i2));
        int i3 = i / i2;
        int[] a = m42059a(aVar, i2, i3);
        dVar.mo32796a(a, i3 - d);
        int i4 = i % i2;
        C9043a aVar2 = new C9043a();
        aVar2.mo32966a(0, i4);
        for (int a2 : a) {
            aVar2.mo32966a(a2, i2);
        }
        return aVar2;
    }

    /* renamed from: a */
    public static C8998a m42054a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C9043a aVar;
        int i6;
        C9043a a = new C9001d(bArr).mo32858a();
        int i7 = 11;
        int d = ((a.mo32979d() * i) / 100) + 11;
        int d2 = a.mo32979d() + d;
        int i8 = 32;
        int i9 = 0;
        int i10 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i4 <= i8) {
                i5 = m42051a(i4, z);
                i3 = f23533e[i4];
                int i11 = i5 - (i5 % i3);
                aVar = m42055a(a, i3);
                int d3 = aVar.mo32979d() + d;
                String str = "Data to large for user specified layer";
                if (d3 > i11) {
                    throw new IllegalArgumentException(str);
                } else if (z && aVar.mo32979d() > (i3 << 6)) {
                    throw new IllegalArgumentException(str);
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C9043a aVar2 = null;
            int i12 = 0;
            i3 = 0;
            while (i12 <= 32) {
                boolean z2 = i12 <= 3;
                int i13 = z2 ? i12 + 1 : i12;
                int a2 = m42051a(i13, z2);
                if (d2 <= a2) {
                    int[] iArr = f23533e;
                    if (i3 != iArr[i13]) {
                        i3 = iArr[i13];
                        aVar2 = m42055a(a, i3);
                    }
                    int i14 = a2 - (a2 % i3);
                    if ((!z2 || aVar2.mo32979d() <= (i3 << 6)) && aVar2.mo32979d() + d <= i14) {
                        aVar = aVar2;
                        z = z2;
                        i4 = i13;
                        i5 = a2;
                    }
                }
                i12++;
                i9 = 0;
                i10 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C9043a b = m42060b(aVar, i5, i3);
        int d4 = aVar.mo32979d() / i3;
        C9043a a3 = m42056a(z, i4, d4);
        if (!z) {
            i7 = 14;
        }
        int i15 = i7 + (i4 << 2);
        int[] iArr2 = new int[i15];
        int i16 = 2;
        if (z) {
            for (int i17 = 0; i17 < iArr2.length; i17++) {
                iArr2[i17] = i17;
            }
            i6 = i15;
        } else {
            int i18 = i15 / 2;
            i6 = i15 + 1 + (((i18 - 1) / 15) * 2);
            int i19 = i6 / 2;
            for (int i20 = 0; i20 < i18; i20++) {
                int i21 = (i20 / 15) + i20;
                iArr2[(i18 - i20) - i10] = (i19 - i21) - 1;
                iArr2[i18 + i20] = i21 + i19 + i10;
            }
        }
        C9044b bVar = new C9044b(i6);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i4) {
            int i24 = ((i4 - i22) << i16) + (z ? 9 : 12);
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i25 << 1;
                while (i9 < i16) {
                    if (b.mo32974b(i23 + i26 + i9)) {
                        int i27 = i22 << 1;
                        bVar.mo32996c(iArr2[i27 + i9], iArr2[i27 + i25]);
                    }
                    if (b.mo32974b((i24 << 1) + i23 + i26 + i9)) {
                        int i28 = i22 << 1;
                        bVar.mo32996c(iArr2[i28 + i25], iArr2[((i15 - 1) - i28) - i9]);
                    }
                    if (b.mo32974b((i24 << 2) + i23 + i26 + i9)) {
                        int i29 = (i15 - 1) - (i22 << 1);
                        bVar.mo32996c(iArr2[i29 - i9], iArr2[i29 - i25]);
                    }
                    if (b.mo32974b((i24 * 6) + i23 + i26 + i9)) {
                        int i30 = i22 << 1;
                        bVar.mo32996c(iArr2[((i15 - 1) - i30) - i25], iArr2[i30 + i9]);
                    }
                    i9++;
                    i16 = 2;
                }
                i25++;
                i9 = 0;
                i16 = 2;
            }
            i23 += i24 << 3;
            i22++;
            i9 = 0;
            i16 = 2;
        }
        m42058a(bVar, z, i6, a3);
        if (z) {
            m42057a(bVar, i6 / 2, 5);
        } else {
            int i31 = i6 / 2;
            m42057a(bVar, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i32 < (i15 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i6; i34 += 2) {
                    int i35 = i31 - i33;
                    bVar.mo32996c(i35, i34);
                    int i36 = i31 + i33;
                    bVar.mo32996c(i36, i34);
                    bVar.mo32996c(i34, i35);
                    bVar.mo32996c(i34, i36);
                }
                i32 += 15;
                i33 += 16;
            }
        }
        C8998a aVar3 = new C8998a();
        aVar3.mo32849a(z);
        aVar3.mo32853c(i6);
        aVar3.mo32851b(i4);
        aVar3.mo32847a(d4);
        aVar3.mo32848a(bVar);
        return aVar3;
    }

    /* renamed from: a */
    private static void m42057a(C9044b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo32996c(i5, i4);
                bVar.mo32996c(i5, i6);
                bVar.mo32996c(i4, i5);
                bVar.mo32996c(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo32996c(i7, i7);
        int i8 = i7 + 1;
        bVar.mo32996c(i8, i7);
        bVar.mo32996c(i7, i8);
        int i9 = i + i2;
        bVar.mo32996c(i9, i7);
        bVar.mo32996c(i9, i8);
        bVar.mo32996c(i9, i9 - 1);
    }

    /* renamed from: a */
    static C9043a m42056a(boolean z, int i, int i2) {
        C9043a aVar = new C9043a();
        if (z) {
            aVar.mo32966a(i - 1, 2);
            aVar.mo32966a(i2 - 1, 6);
            return m42060b(aVar, 28, 4);
        }
        aVar.mo32966a(i - 1, 5);
        aVar.mo32966a(i2 - 1, 11);
        return m42060b(aVar, 40, 4);
    }

    /* renamed from: a */
    private static void m42058a(C9044b bVar, boolean z, int i, C9043a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo32974b(i3)) {
                    bVar.mo32996c(i4, i2 - 5);
                }
                if (aVar.mo32974b(i3 + 7)) {
                    bVar.mo32996c(i2 + 5, i4);
                }
                if (aVar.mo32974b(20 - i3)) {
                    bVar.mo32996c(i4, i2 + 5);
                }
                if (aVar.mo32974b(27 - i3)) {
                    bVar.mo32996c(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo32974b(i3)) {
                bVar.mo32996c(i5, i2 - 7);
            }
            if (aVar.mo32974b(i3 + 10)) {
                bVar.mo32996c(i2 + 7, i5);
            }
            if (aVar.mo32974b(29 - i3)) {
                bVar.mo32996c(i5, i2 + 7);
            }
            if (aVar.mo32974b(39 - i3)) {
                bVar.mo32996c(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: a */
    private static int[] m42059a(C9043a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int d = aVar.mo32979d() / i;
        for (int i3 = 0; i3 < d; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.mo32974b((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: a */
    private static C8970a m42052a(int i) {
        if (i == 4) {
            return C8970a.f23457k;
        }
        if (i == 6) {
            return C8970a.f23456j;
        }
        if (i == 8) {
            return C8970a.f23460n;
        }
        if (i == 10) {
            return C8970a.f23455i;
        }
        if (i == 12) {
            return C8970a.f23454h;
        }
        StringBuilder sb = new StringBuilder("Unsupported word size ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static C9043a m42055a(C9043a aVar, int i) {
        C9043a aVar2 = new C9043a();
        int d = aVar.mo32979d();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < d) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= d || aVar.mo32974b(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.mo32966a(i7, i);
            } else if (i7 == 0) {
                aVar2.mo32966a(i4 | 1, i);
            } else {
                aVar2.mo32966a(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }
}
