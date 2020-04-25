package com.google.zxing.p350z.p351e.p352k;

/* renamed from: com.google.zxing.z.e.k.c */
/* compiled from: ModulusPoly */
final class C9179c {

    /* renamed from: a */
    private final C9178b f24113a;

    /* renamed from: b */
    private final int[] f24114b;

    C9179c(C9178b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f24113a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f24114b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f24114b = new int[]{0};
                return;
            }
            this.f24114b = new int[(length - i)];
            int[] iArr2 = this.f24114b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo33268a() {
        return this.f24114b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33269b() {
        return this.f24114b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33274c() {
        return this.f24114b[0] == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C9179c mo33275d() {
        int length = this.f24114b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f24113a.mo33264d(0, this.f24114b[i]);
        }
        return new C9179c(this.f24113a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo33269b() * 8);
        for (int b = mo33269b(); b >= 0; b--) {
            int b2 = mo33270b(b);
            if (b2 != 0) {
                if (b2 < 0) {
                    sb.append(" - ");
                    b2 = -b2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || b2 != 1) {
                    sb.append(b2);
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
    public int mo33265a(int i) {
        if (i == 0) {
            return mo33270b(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f24114b) {
                i2 = this.f24113a.mo33256a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f24114b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C9178b bVar = this.f24113a;
            i3 = bVar.mo33256a(bVar.mo33262c(i, i3), this.f24114b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33270b(int i) {
        int[] iArr = this.f24114b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9179c mo33273c(C9179c cVar) {
        if (!this.f24113a.equals(cVar.f24113a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.mo33274c()) {
            return this;
        } else {
            return mo33267a(cVar.mo33275d());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9179c mo33271b(C9179c cVar) {
        if (!this.f24113a.equals(cVar.f24113a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo33274c() || cVar.mo33274c()) {
            return this.f24113a.mo33263c();
        } else {
            int[] iArr = this.f24114b;
            int length = iArr.length;
            int[] iArr2 = cVar.f24114b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C9178b bVar = this.f24113a;
                    iArr3[i4] = bVar.mo33256a(iArr3[i4], bVar.mo33262c(i2, iArr2[i3]));
                }
            }
            return new C9179c(this.f24113a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9179c mo33272c(int i) {
        if (i == 0) {
            return this.f24113a.mo33263c();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f24114b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f24113a.mo33262c(this.f24114b[i2], i);
        }
        return new C9179c(this.f24113a, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9179c mo33267a(C9179c cVar) {
        if (!this.f24113a.equals(cVar.f24113a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo33274c()) {
            return cVar;
        } else {
            if (cVar.mo33274c()) {
                return this;
            }
            int[] iArr = this.f24114b;
            int[] iArr2 = cVar.f24114b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = this.f24113a.mo33256a(iArr[i - length], iArr2[i]);
            }
            return new C9179c(this.f24113a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9179c mo33266a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f24113a.mo33263c();
        } else {
            int length = this.f24114b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f24113a.mo33262c(this.f24114b[i3], i2);
            }
            return new C9179c(this.f24113a, iArr);
        }
    }
}
