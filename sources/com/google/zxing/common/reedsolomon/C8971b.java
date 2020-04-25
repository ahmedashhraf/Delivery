package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.b */
/* compiled from: GenericGFPoly */
final class C8971b {

    /* renamed from: a */
    private final C8970a f23469a;

    /* renamed from: b */
    private final int[] f23470b;

    C8971b(C8970a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f23469a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f23470b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f23470b = new int[]{0};
                return;
            }
            this.f23470b = new int[(length - i)];
            int[] iArr2 = this.f23470b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo32787a() {
        return this.f23470b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32788b() {
        return this.f23470b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo32793c() {
        return this.f23470b[0] == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo32788b() * 8);
        for (int b = mo32788b(); b >= 0; b--) {
            int b2 = mo32789b(b);
            if (b2 != 0) {
                if (b2 < 0) {
                    sb.append(" - ");
                    b2 = -b2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || b2 != 1) {
                    int c = this.f23469a.mo32781c(b2);
                    if (c == 0) {
                        sb.append('1');
                    } else if (c == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(c);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo32784a(int i) {
        if (i == 0) {
            return mo32789b(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int c : this.f23470b) {
                i2 = C8970a.m41912c(i2, c);
            }
            return i2;
        }
        int[] iArr = this.f23470b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C8970a.m41912c(this.f23469a.mo32778b(i, i3), this.f23470b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32789b(int i) {
        int[] iArr = this.f23470b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8971b mo32792c(C8971b bVar) {
        if (!this.f23469a.equals(bVar.f23469a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32793c() || bVar.mo32793c()) {
            return this.f23469a.mo32782d();
        } else {
            int[] iArr = this.f23470b;
            int length = iArr.length;
            int[] iArr2 = bVar.f23470b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C8970a.m41912c(iArr3[i4], this.f23469a.mo32778b(i2, iArr2[i3]));
                }
            }
            return new C8971b(this.f23469a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8971b[] mo32790b(C8971b bVar) {
        if (!this.f23469a.equals(bVar.f23469a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo32793c()) {
            C8971b d = this.f23469a.mo32782d();
            int b = this.f23469a.mo32777b(bVar.mo32789b(bVar.mo32788b()));
            C8971b bVar2 = d;
            C8971b bVar3 = this;
            while (bVar3.mo32788b() >= bVar.mo32788b() && !bVar3.mo32793c()) {
                int b2 = bVar3.mo32788b() - bVar.mo32788b();
                int b3 = this.f23469a.mo32778b(bVar3.mo32789b(bVar3.mo32788b()), b);
                C8971b a = bVar.mo32785a(b2, b3);
                bVar2 = bVar2.mo32786a(this.f23469a.mo32776a(b2, b3));
                bVar3 = bVar3.mo32786a(a);
            }
            return new C8971b[]{bVar2, bVar3};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8971b mo32786a(C8971b bVar) {
        if (!this.f23469a.equals(bVar.f23469a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32793c()) {
            return bVar;
        } else {
            if (bVar.mo32793c()) {
                return this;
            }
            int[] iArr = this.f23470b;
            int[] iArr2 = bVar.f23470b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = C8970a.m41912c(iArr[i - length], iArr2[i]);
            }
            return new C8971b(this.f23469a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8971b mo32791c(int i) {
        if (i == 0) {
            return this.f23469a.mo32782d();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f23470b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f23469a.mo32778b(this.f23470b[i2], i);
        }
        return new C8971b(this.f23469a, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8971b mo32785a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f23469a.mo32782d();
        } else {
            int length = this.f23470b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f23469a.mo32778b(this.f23470b[i3], i2);
            }
            return new C8971b(this.f23469a, iArr);
        }
    }
}
