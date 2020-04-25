package com.google.zxing.p335u.p336m;

import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;

@Deprecated
/* renamed from: com.google.zxing.u.m.b */
/* compiled from: MonochromeRectangleDetector */
public final class C9056b {

    /* renamed from: b */
    private static final int f23711b = 32;

    /* renamed from: a */
    private final C9044b f23712a;

    public C9056b(C9044b bVar) {
        this.f23712a = bVar;
    }

    /* renamed from: a */
    public C8987p[] mo33037a() throws NotFoundException {
        int e = this.f23712a.mo33001e();
        int h = this.f23712a.mo33005h();
        int i = e / 2;
        int i2 = h / 2;
        int max = Math.max(1, e / 256);
        int i3 = -max;
        int i4 = i2 / 2;
        int i5 = i2;
        int i6 = h;
        int i7 = i;
        int i8 = i3;
        int max2 = Math.max(1, h / 256);
        int i9 = e;
        int i10 = max;
        int i11 = max2;
        int i12 = -i11;
        int b = ((int) m42372a(i5, 0, 0, i6, i7, i3, 0, i9, i4).mo32831b()) - 1;
        int i13 = i11;
        int i14 = i / 2;
        C8987p a = m42372a(i5, i12, 0, i6, i7, 0, b, i9, i14);
        int a2 = ((int) a.mo32830a()) - 1;
        C8987p a3 = m42372a(i5, i13, a2, i6, i7, 0, b, i9, i14);
        int a4 = ((int) a3.mo32830a()) + 1;
        C8987p a5 = m42372a(i5, 0, a2, a4, i7, i10, b, i9, i4);
        return new C8987p[]{m42372a(i5, 0, a2, a4, i7, i8, b, ((int) a5.mo32831b()) + 1, i2 / 4), a, a3, a5};
    }

    /* renamed from: a */
    private C8987p m42372a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws NotFoundException {
        int[] iArr;
        int i10 = i;
        int i11 = i5;
        int i12 = i10;
        int i13 = i11;
        int[] iArr2 = null;
        int i14 = i8;
        while (i13 < i14 && i13 >= i7 && i12 < i4 && i12 >= i3) {
            if (i2 == 0) {
                iArr = m42373a(i13, i9, i3, i4, true);
            } else {
                iArr = m42373a(i12, i9, i7, i8, false);
            }
            if (iArr != null) {
                i13 += i6;
                i12 += i2;
                iArr2 = iArr;
            } else if (iArr2 != null) {
                char c = 1;
                if (i2 == 0) {
                    int i15 = i13 - i6;
                    if (iArr2[0] >= i10) {
                        return new C8987p((float) iArr2[1], (float) i15);
                    }
                    if (iArr2[1] <= i10) {
                        return new C8987p((float) iArr2[0], (float) i15);
                    }
                    if (i6 > 0) {
                        c = 0;
                    }
                    return new C8987p((float) iArr2[c], (float) i15);
                }
                int i16 = i12 - i2;
                if (iArr2[0] >= i11) {
                    return new C8987p((float) i16, (float) iArr2[1]);
                }
                if (iArr2[1] <= i11) {
                    return new C8987p((float) i16, (float) iArr2[0]);
                }
                float f = (float) i16;
                if (i2 < 0) {
                    c = 0;
                }
                return new C8987p(f, (float) iArr2[c]);
            } else {
                throw NotFoundException.m41712a();
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private int[] m42373a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 + i4) / 2;
        int i6 = i5;
        while (i6 >= i3) {
            C9044b bVar = this.f23712a;
            if (!z ? !bVar.mo32995b(i, i6) : !bVar.mo32995b(i6, i)) {
                int i7 = i6;
                while (true) {
                    i7--;
                    if (i7 < i3) {
                        break;
                    }
                    C9044b bVar2 = this.f23712a;
                    if (z) {
                        if (bVar2.mo32995b(i7, i)) {
                            break;
                        }
                    } else if (bVar2.mo32995b(i, i7)) {
                        break;
                    }
                }
                int i8 = i6 - i7;
                if (i7 < i3 || i8 > i2) {
                    break;
                }
                i6 = i7;
            } else {
                i6--;
            }
        }
        int i9 = i6 + 1;
        while (i5 < i4) {
            C9044b bVar3 = this.f23712a;
            if (!z ? !bVar3.mo32995b(i, i5) : !bVar3.mo32995b(i5, i)) {
                int i10 = i5;
                while (true) {
                    i10++;
                    if (i10 >= i4) {
                        break;
                    }
                    C9044b bVar4 = this.f23712a;
                    if (z) {
                        if (bVar4.mo32995b(i10, i)) {
                            break;
                        }
                    } else if (bVar4.mo32995b(i, i10)) {
                        break;
                    }
                }
                int i11 = i10 - i5;
                if (i10 >= i4 || i11 > i2) {
                    break;
                }
                i5 = i10;
            } else {
                i5++;
            }
        }
        int i12 = i5 - 1;
        if (i12 <= i9) {
            return null;
        }
        return new int[]{i9, i12};
    }
}
