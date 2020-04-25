package com.google.zxing.p335u.p336m;

import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.u.m.c */
/* compiled from: WhiteRectangleDetector */
public final class C9057c {

    /* renamed from: h */
    private static final int f23713h = 10;

    /* renamed from: i */
    private static final int f23714i = 1;

    /* renamed from: a */
    private final C9044b f23715a;

    /* renamed from: b */
    private final int f23716b;

    /* renamed from: c */
    private final int f23717c;

    /* renamed from: d */
    private final int f23718d;

    /* renamed from: e */
    private final int f23719e;

    /* renamed from: f */
    private final int f23720f;

    /* renamed from: g */
    private final int f23721g;

    public C9057c(C9044b bVar) throws NotFoundException {
        this(bVar, 10, bVar.mo33005h() / 2, bVar.mo33001e() / 2);
    }

    /* renamed from: a */
    public C8987p[] mo33038a() throws NotFoundException {
        int i = this.f23718d;
        int i2 = this.f23719e;
        int i3 = this.f23721g;
        int i4 = this.f23720f;
        boolean z = false;
        int i5 = 1;
        int i6 = i;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f23717c) {
                    z8 = m42376a(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f23717c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f23716b) {
                    z10 = m42376a(i6, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f23716b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i6 >= 0) {
                    z11 = m42376a(i3, i4, i6, false);
                    if (z11) {
                        i6--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i6--;
                    }
                }
            }
            if (i6 < 0) {
                break;
            }
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = m42376a(i6, i2, i3, true);
                    if (z12) {
                        i3--;
                        z7 = true;
                        z9 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            }
            if (z9) {
                z6 = true;
            }
            z2 = z9;
        }
        z = true;
        if (z || !z6) {
            throw NotFoundException.m41712a();
        }
        int i7 = i2 - i6;
        C8987p pVar = null;
        C8987p pVar2 = null;
        int i8 = 1;
        while (pVar2 == null && i8 < i7) {
            pVar2 = m42375a((float) i6, (float) (i4 - i8), (float) (i6 + i8), (float) i4);
            i8++;
        }
        if (pVar2 != null) {
            C8987p pVar3 = null;
            int i9 = 1;
            while (pVar3 == null && i9 < i7) {
                pVar3 = m42375a((float) i6, (float) (i3 + i9), (float) (i6 + i9), (float) i3);
                i9++;
            }
            if (pVar3 != null) {
                C8987p pVar4 = null;
                int i10 = 1;
                while (pVar4 == null && i10 < i7) {
                    pVar4 = m42375a((float) i2, (float) (i3 + i10), (float) (i2 - i10), (float) i3);
                    i10++;
                }
                if (pVar4 != null) {
                    while (pVar == null && i5 < i7) {
                        pVar = m42375a((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (pVar != null) {
                        return m42377a(pVar, pVar2, pVar4, pVar3);
                    }
                    throw NotFoundException.m41712a();
                }
                throw NotFoundException.m41712a();
            }
            throw NotFoundException.m41712a();
        }
        throw NotFoundException.m41712a();
    }

    public C9057c(C9044b bVar, int i, int i2, int i3) throws NotFoundException {
        this.f23715a = bVar;
        this.f23716b = bVar.mo33001e();
        this.f23717c = bVar.mo33005h();
        int i4 = i / 2;
        this.f23718d = i2 - i4;
        this.f23719e = i2 + i4;
        this.f23721g = i3 - i4;
        this.f23720f = i3 + i4;
        if (this.f23721g < 0 || this.f23718d < 0 || this.f23720f >= this.f23716b || this.f23719e >= this.f23717c) {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private C8987p m42375a(float f, float f2, float f3, float f4) {
        int a = C9055a.m42370a(C9055a.m42368a(f, f2, f3, f4));
        float f5 = (float) a;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < a; i++) {
            float f8 = (float) i;
            int a2 = C9055a.m42370a((f8 * f6) + f);
            int a3 = C9055a.m42370a((f8 * f7) + f2);
            if (this.f23715a.mo32995b(a2, a3)) {
                return new C8987p((float) a2, (float) a3);
            }
        }
        return null;
    }

    /* renamed from: a */
    private C8987p[] m42377a(C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4) {
        float a = pVar.mo32830a();
        float b = pVar.mo32831b();
        float a2 = pVar2.mo32830a();
        float b2 = pVar2.mo32831b();
        float a3 = pVar3.mo32830a();
        float b3 = pVar3.mo32831b();
        float a4 = pVar4.mo32830a();
        float b4 = pVar4.mo32831b();
        if (a < ((float) this.f23717c) / 2.0f) {
            return new C8987p[]{new C8987p(a4 - 1.0f, b4 + 1.0f), new C8987p(a2 + 1.0f, b2 + 1.0f), new C8987p(a3 - 1.0f, b3 - 1.0f), new C8987p(a + 1.0f, b - 1.0f)};
        }
        return new C8987p[]{new C8987p(a4 + 1.0f, b4 + 1.0f), new C8987p(a2 + 1.0f, b2 - 1.0f), new C8987p(a3 - 1.0f, b3 + 1.0f), new C8987p(a - 1.0f, b - 1.0f)};
    }

    /* renamed from: a */
    private boolean m42376a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f23715a.mo32995b(i, i3)) {
                    return true;
                }
                i++;
            }
        } else {
            while (i <= i2) {
                if (this.f23715a.mo32995b(i3, i)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
