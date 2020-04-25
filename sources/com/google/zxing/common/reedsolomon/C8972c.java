package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.c */
/* compiled from: ReedSolomonDecoder */
public final class C8972c {

    /* renamed from: a */
    private final C8970a f23471a;

    public C8972c(C8970a aVar) {
        this.f23471a = aVar;
    }

    /* renamed from: a */
    public void mo32795a(int[] iArr, int i) throws ReedSolomonException {
        C8971b bVar = new C8971b(this.f23471a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C8970a aVar = this.f23471a;
            int a = bVar.mo32784a(aVar.mo32775a(aVar.mo32774a() + i3));
            iArr2[(i - 1) - i3] = a;
            if (a != 0) {
                z = false;
            }
        }
        if (!z) {
            C8971b[] a2 = m41934a(this.f23471a.mo32776a(i, 1), new C8971b(this.f23471a, iArr2), i);
            C8971b bVar2 = a2[0];
            C8971b bVar3 = a2[1];
            int[] a3 = m41932a(bVar2);
            int[] a4 = m41933a(bVar3, a3);
            while (i2 < a3.length) {
                int length = (iArr.length - 1) - this.f23471a.mo32781c(a3[i2]);
                if (length >= 0) {
                    iArr[length] = C8970a.m41912c(iArr[length], a4[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }

    /* renamed from: a */
    private C8971b[] m41934a(C8971b bVar, C8971b bVar2, int i) throws ReedSolomonException {
        if (bVar.mo32788b() < bVar2.mo32788b()) {
            C8971b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C8971b d = this.f23471a.mo32782d();
        C8971b b = this.f23471a.mo32779b();
        do {
            C8971b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C8971b bVar5 = b;
            C8971b bVar6 = d;
            d = bVar5;
            if (bVar.mo32788b() < i / 2) {
                int b2 = d.mo32789b(0);
                if (b2 != 0) {
                    int b3 = this.f23471a.mo32777b(b2);
                    return new C8971b[]{d.mo32791c(b3), bVar.mo32791c(b3)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.mo32793c()) {
                C8971b d2 = this.f23471a.mo32782d();
                int b4 = this.f23471a.mo32777b(bVar.mo32789b(bVar.mo32788b()));
                while (r11.mo32788b() >= bVar.mo32788b() && !r11.mo32793c()) {
                    int b5 = r11.mo32788b() - bVar.mo32788b();
                    int b6 = this.f23471a.mo32778b(r11.mo32789b(r11.mo32788b()), b4);
                    d2 = d2.mo32786a(this.f23471a.mo32776a(b5, b6));
                    r11 = r11.mo32786a(bVar.mo32785a(b5, b6));
                }
                b = d2.mo32792c(d).mo32786a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.mo32788b() < bVar.mo32788b());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    private int[] m41932a(C8971b bVar) throws ReedSolomonException {
        int b = bVar.mo32788b();
        int i = 0;
        if (b == 1) {
            return new int[]{bVar.mo32789b(1)};
        }
        int[] iArr = new int[b];
        for (int i2 = 1; i2 < this.f23471a.mo32780c() && i < b; i2++) {
            if (bVar.mo32784a(i2) == 0) {
                iArr[i] = this.f23471a.mo32777b(i2);
                i++;
            }
        }
        if (i == b) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: a */
    private int[] m41933a(C8971b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int b = this.f23471a.mo32777b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int b2 = this.f23471a.mo32778b(iArr[i3], b);
                    i2 = this.f23471a.mo32778b(i2, (b2 & 1) == 0 ? b2 | 1 : b2 & -2);
                }
            }
            iArr2[i] = this.f23471a.mo32778b(bVar.mo32784a(b), this.f23471a.mo32777b(i2));
            if (this.f23471a.mo32774a() != 0) {
                iArr2[i] = this.f23471a.mo32778b(iArr2[i], b);
            }
        }
        return iArr2;
    }
}
