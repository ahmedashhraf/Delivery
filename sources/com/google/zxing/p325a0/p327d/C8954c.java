package com.google.zxing.p325a0.p327d;

import com.google.zxing.C8974d;
import com.google.zxing.C8987p;
import com.google.zxing.C8988q;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p325a0.p326c.C8949j;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9049g;
import com.google.zxing.p335u.C9051i;
import com.google.zxing.p335u.C9053k;
import com.google.zxing.p335u.p336m.C9055a;
import java.util.Map;

/* renamed from: com.google.zxing.a0.d.c */
/* compiled from: Detector */
public class C8954c {

    /* renamed from: a */
    private final C9044b f23409a;

    /* renamed from: b */
    private C8988q f23410b;

    public C8954c(C9044b bVar) {
        this.f23409a = bVar;
    }

    /* renamed from: a */
    public C9049g mo32716a() throws NotFoundException, FormatException {
        return mo32718a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9044b mo32719b() {
        return this.f23409a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C8988q mo32720c() {
        return this.f23410b;
    }

    /* renamed from: b */
    private float m41795b(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float a = m41790a(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i5 = 0;
        } else if (i6 >= this.f23409a.mo33005h()) {
            f = ((float) ((this.f23409a.mo33005h() - 1) - i)) / ((float) (i6 - i));
            i5 = this.f23409a.mo33005h() - 1;
        } else {
            i5 = i6;
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f23409a.mo33001e()) {
            f2 = ((float) ((this.f23409a.mo33001e() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f23409a.mo33001e() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (a + m41790a(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i7)) - 1.0f;
    }

    /* renamed from: a */
    public final C9049g mo32718a(Map<C8974d, ?> map) throws NotFoundException, FormatException {
        C8988q qVar;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (C8988q) map.get(C8974d.NEED_RESULT_POINT_CALLBACK);
        }
        this.f23410b = qVar;
        return mo32717a(new C8956e(this.f23409a, this.f23410b).mo32725a(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9049g mo32717a(C8960f fVar) throws NotFoundException, FormatException {
        C8987p[] pVarArr;
        C8955d b = fVar.mo32734b();
        C8955d c = fVar.mo32735c();
        C8955d a = fVar.mo32733a();
        float a2 = mo32714a((C8987p) b, (C8987p) c, (C8987p) a);
        if (a2 >= 1.0f) {
            int a3 = m41792a((C8987p) b, (C8987p) c, (C8987p) a, a2);
            C8949j b2 = C8949j.m41768b(a3);
            int c2 = b2.mo32701c() - 7;
            C8952a aVar = null;
            if (b2.mo32700b().length > 0) {
                float f = 1.0f - (3.0f / ((float) c2));
                int a4 = (int) (b.mo32830a() + ((((c.mo32830a() - b.mo32830a()) + a.mo32830a()) - b.mo32830a()) * f));
                int b3 = (int) (b.mo32831b() + (f * (((c.mo32831b() - b.mo32831b()) + a.mo32831b()) - b.mo32831b())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo32715a(a2, a4, b3, (float) i);
                        break;
                    } catch (NotFoundException unused) {
                        i <<= 1;
                    }
                }
            }
            C9044b a5 = m41793a(this.f23409a, m41794a(b, c, a, aVar, a3), a3);
            if (aVar == null) {
                pVarArr = new C8987p[]{a, b, c};
            } else {
                pVarArr = new C8987p[]{a, b, c, aVar};
            }
            return new C9049g(a5, pVarArr);
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static C9053k m41794a(C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (pVar4 != null) {
            f2 = pVar4.mo32830a();
            f = pVar4.mo32831b();
            f3 = f4 - 3.0f;
        } else {
            f2 = (pVar2.mo32830a() - pVar.mo32830a()) + pVar3.mo32830a();
            f = (pVar2.mo32831b() - pVar.mo32831b()) + pVar3.mo32831b();
            f3 = f4;
        }
        return C9053k.m42361a(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, pVar.mo32830a(), pVar.mo32831b(), pVar2.mo32830a(), pVar2.mo32831b(), f2, f, pVar3.mo32830a(), pVar3.mo32831b());
    }

    /* renamed from: a */
    private static C9044b m41793a(C9044b bVar, C9053k kVar, int i) throws NotFoundException {
        return C9051i.m42349a().mo33030a(bVar, i, i, kVar);
    }

    /* renamed from: a */
    private static int m41792a(C8987p pVar, C8987p pVar2, C8987p pVar3, float f) throws NotFoundException {
        int a = ((C9055a.m42370a(C8987p.m41990a(pVar, pVar2) / f) + C9055a.m42370a(C8987p.m41990a(pVar, pVar3) / f)) / 2) + 7;
        int i = a & 3;
        if (i == 0) {
            return a + 1;
        }
        if (i == 2) {
            return a - 1;
        }
        if (i != 3) {
            return a;
        }
        throw NotFoundException.m41712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo32714a(C8987p pVar, C8987p pVar2, C8987p pVar3) {
        return (m41791a(pVar, pVar2) + m41791a(pVar, pVar3)) / 2.0f;
    }

    /* renamed from: a */
    private float m41791a(C8987p pVar, C8987p pVar2) {
        float b = m41795b((int) pVar.mo32830a(), (int) pVar.mo32831b(), (int) pVar2.mo32830a(), (int) pVar2.mo32831b());
        float b2 = m41795b((int) pVar2.mo32830a(), (int) pVar2.mo32831b(), (int) pVar.mo32830a(), (int) pVar.mo32831b());
        if (Float.isNaN(b)) {
            return b2 / 7.0f;
        }
        return Float.isNaN(b2) ? b / 7.0f : (b + b2) / 14.0f;
    }

    /* renamed from: a */
    private float m41790a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C8954c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i5 = i;
            i7 = i2;
            i6 = i3;
            i8 = i4;
        } else {
            i7 = i;
            i5 = i2;
            i8 = i3;
            i6 = i4;
        }
        int abs = Math.abs(i8 - i7);
        int abs2 = Math.abs(i6 - i5);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i7 < i8 ? 1 : -1;
        if (i5 < i6) {
            i12 = 1;
        }
        int i14 = i8 + i13;
        int i15 = i5;
        int i16 = i11;
        int i17 = 0;
        int i18 = i7;
        while (true) {
            if (i18 == i14) {
                i9 = i14;
                break;
            }
            int i19 = z3 ? i15 : i18;
            int i20 = z3 ? i18 : i15;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f23409a.mo32995b(i19, i20)) {
                if (i17 == 2) {
                    return C9055a.m42369a(i18, i15, i7, i5);
                }
                i17++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i15 == i6) {
                    break;
                }
                i15 += i12;
                i16 -= abs;
            }
            i18 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C9055a.m42369a(i9, i6, i7, i5);
        }
        return Float.NaN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8952a mo32715a(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f23409a.mo33005h() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f23409a.mo33001e() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                C8953b bVar = new C8953b(this.f23409a, max, max2, min, min2, f, this.f23410b);
                return bVar.mo32713a();
            }
            throw NotFoundException.m41712a();
        }
        throw NotFoundException.m41712a();
    }
}
