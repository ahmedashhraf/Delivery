package com.fasterxml.jackson.core.p160u;

/* renamed from: com.fasterxml.jackson.core.u.g */
/* compiled from: NameN */
public final class C3851g extends C3850f {

    /* renamed from: c */
    final int[] f12215c;

    /* renamed from: d */
    final int f12216d;

    C3851g(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 >= 3) {
            this.f12215c = iArr;
            this.f12216d = i2;
            return;
        }
        throw new IllegalArgumentException("Qlen must >= 3");
    }

    /* renamed from: a */
    public boolean mo17048a(int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo17049a(int i, int i2) {
        return false;
    }

    /* renamed from: a */
    public boolean mo17050a(int[] iArr, int i) {
        if (i != this.f12216d) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != this.f12215c[i2]) {
                return false;
            }
        }
        return true;
    }
}
