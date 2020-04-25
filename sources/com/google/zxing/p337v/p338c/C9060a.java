package com.google.zxing.p337v.p338c;

import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.v.c.a */
/* compiled from: BitMatrixParser */
final class C9060a {

    /* renamed from: a */
    private final C9044b f23724a;

    /* renamed from: b */
    private final C9044b f23725b;

    /* renamed from: c */
    private final C9066e f23726c;

    C9060a(C9044b bVar) throws FormatException {
        int e = bVar.mo33001e();
        if (e < 8 || e > 144 || (e & 1) != 0) {
            throw FormatException.m41710a();
        }
        this.f23726c = m42392b(bVar);
        this.f23724a = m42388a(bVar);
        this.f23725b = new C9044b(this.f23724a.mo33005h(), this.f23724a.mo33001e());
    }

    /* renamed from: b */
    private static C9066e m42392b(C9044b bVar) throws FormatException {
        return C9066e.m42412a(bVar.mo33001e(), bVar.mo33005h());
    }

    /* renamed from: c */
    private int m42393c(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m42389a(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m42389a(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m42389a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m42389a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m42389a(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m42389a(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m42389a(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m42389a(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: d */
    private int m42394d(int i, int i2) {
        int i3 = (m42389a(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m42389a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m42389a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m42389a(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m42389a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m42389a(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m42389a(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m42389a(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9066e mo33039a() {
        return this.f23726c;
    }

    /* renamed from: a */
    private boolean m42389a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f23725b.mo32996c(i2, i);
        return this.f23724a.mo32995b(i2, i);
    }

    /* renamed from: a */
    private int m42387a(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m42389a(i3, 0, i, i2) ? 1 : 0) << true;
        if (m42389a(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m42389a(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m42389a(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m42389a(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m42389a(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m42389a(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m42389a(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte[] mo33040b() throws FormatException {
        byte[] bArr = new byte[this.f23726c.mo33050f()];
        int e = this.f23724a.mo33001e();
        int h = this.f23724a.mo33005h();
        int i = 4;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i == e && i2 == 0 && !z) {
                int i4 = i3 + 1;
                bArr[i3] = (byte) m42387a(e, h);
                i -= 2;
                i2 += 2;
                i3 = i4;
                z = true;
            } else {
                int i5 = e - 2;
                if (i == i5 && i2 == 0 && (h & 3) != 0 && !z2) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) m42390b(e, h);
                    i -= 2;
                    i2 += 2;
                    i3 = i6;
                    z2 = true;
                } else if (i == e + 4 && i2 == 2 && (h & 7) == 0 && !z3) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) m42393c(e, h);
                    i -= 2;
                    i2 += 2;
                    i3 = i7;
                    z3 = true;
                } else if (i == i5 && i2 == 0 && (h & 7) == 4 && !z4) {
                    int i8 = i3 + 1;
                    bArr[i3] = (byte) m42394d(e, h);
                    i -= 2;
                    i2 += 2;
                    i3 = i8;
                    z4 = true;
                } else {
                    do {
                        if (i < e && i2 >= 0 && !this.f23725b.mo32995b(i2, i)) {
                            int i9 = i3 + 1;
                            bArr[i3] = (byte) m42391b(i, i2, e, h);
                            i3 = i9;
                        }
                        i -= 2;
                        i2 += 2;
                        if (i < 0) {
                            break;
                        }
                    } while (i2 < h);
                    int i10 = i + 1;
                    int i11 = i2 + 3;
                    do {
                        if (i10 >= 0 && i11 < h && !this.f23725b.mo32995b(i11, i10)) {
                            int i12 = i3 + 1;
                            bArr[i3] = (byte) m42391b(i10, i11, e, h);
                            i3 = i12;
                        }
                        i10 += 2;
                        i11 -= 2;
                        if (i10 >= e) {
                            break;
                        }
                    } while (i11 >= 0);
                    i = i10 + 3;
                    i2 = i11 + 1;
                }
            }
            if (i >= e && i2 >= h) {
                break;
            }
        }
        if (i3 == this.f23726c.mo33050f()) {
            return bArr;
        }
        throw FormatException.m41710a();
    }

    /* renamed from: a */
    private C9044b m42388a(C9044b bVar) {
        int e = this.f23726c.mo33049e();
        int d = this.f23726c.mo33048d();
        if (bVar.mo33001e() == e) {
            int b = this.f23726c.mo33046b();
            int a = this.f23726c.mo33045a();
            int i = e / b;
            int i2 = d / a;
            C9044b bVar2 = new C9044b(i2 * a, i * b);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * b;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * a;
                    for (int i7 = 0; i7 < b; i7++) {
                        int i8 = ((b + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < a; i10++) {
                            if (bVar.mo32995b(((a + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo32996c(i6 + i10, i9);
                            }
                        }
                        C9044b bVar3 = bVar;
                    }
                    C9044b bVar4 = bVar;
                }
                C9044b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* renamed from: b */
    private int m42391b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m42389a(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m42389a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m42389a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m42389a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m42389a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m42389a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m42389a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m42389a(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: b */
    private int m42390b(int i, int i2) {
        int i3 = (m42389a(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m42389a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m42389a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m42389a(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m42389a(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m42389a(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m42389a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m42389a(1, i9, i, i2) ? i10 | 1 : i10;
    }
}
