package com.google.zxing.p325a0.p327d;

import com.google.zxing.C8988q;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.a0.d.b */
/* compiled from: AlignmentPatternFinder */
final class C8953b {

    /* renamed from: a */
    private final C9044b f23400a;

    /* renamed from: b */
    private final List<C8952a> f23401b = new ArrayList(5);

    /* renamed from: c */
    private final int f23402c;

    /* renamed from: d */
    private final int f23403d;

    /* renamed from: e */
    private final int f23404e;

    /* renamed from: f */
    private final int f23405f;

    /* renamed from: g */
    private final float f23406g;

    /* renamed from: h */
    private final int[] f23407h;

    /* renamed from: i */
    private final C8988q f23408i;

    C8953b(C9044b bVar, int i, int i2, int i3, int i4, float f, C8988q qVar) {
        this.f23400a = bVar;
        this.f23402c = i;
        this.f23403d = i2;
        this.f23404e = i3;
        this.f23405f = i4;
        this.f23406g = f;
        this.f23407h = new int[3];
        this.f23408i = qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8952a mo32713a() throws NotFoundException {
        int i = this.f23402c;
        int i2 = this.f23405f;
        int i3 = this.f23404e + i;
        int i4 = this.f23403d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f23400a.mo32995b(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f23400a.mo32995b(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 == 2) {
                    if (m41788a(iArr)) {
                        C8952a a = m41787a(iArr, i6, i7);
                        if (a != null) {
                            return a;
                        }
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                } else {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                }
                i7++;
            }
            if (m41788a(iArr)) {
                C8952a a2 = m41787a(iArr, i6, i3);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (!this.f23401b.isEmpty()) {
            return (C8952a) this.f23401b.get(0);
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static float m41786a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: a */
    private boolean m41788a(int[] iArr) {
        float f = this.f23406g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private float m41785a(int i, int i2, int i3, int i4) {
        C9044b bVar = this.f23400a;
        int e = bVar.mo33001e();
        int[] iArr = this.f23407h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo32995b(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo32995b(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < e && bVar.mo32995b(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != e && iArr[1] <= i3) {
                while (i6 < e && !bVar.mo32995b(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m41788a(iArr)) {
                    return m41786a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: a */
    private C8952a m41787a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m41786a(iArr, i2);
        float a2 = m41785a(i, (int) a, iArr[1] * 2, i3);
        if (!Float.isNaN(a2)) {
            float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
            for (C8952a aVar : this.f23401b) {
                if (aVar.mo32711a(f, a2, a)) {
                    return aVar.mo32712b(a2, a, f);
                }
            }
            C8952a aVar2 = new C8952a(a, a2, f);
            this.f23401b.add(aVar2);
            C8988q qVar = this.f23408i;
            if (qVar != null) {
                qVar.mo32835a(aVar2);
            }
        }
        return null;
    }
}
