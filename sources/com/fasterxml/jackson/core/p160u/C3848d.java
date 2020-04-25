package com.fasterxml.jackson.core.p160u;

/* renamed from: com.fasterxml.jackson.core.u.d */
/* compiled from: Name2 */
public final class C3848d extends C3850f {

    /* renamed from: c */
    final int f12208c;

    /* renamed from: d */
    final int f12209d;

    C3848d(String str, int i, int i2, int i3) {
        super(str, i);
        this.f12208c = i2;
        this.f12209d = i3;
    }

    /* renamed from: a */
    public boolean mo17048a(int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo17049a(int i, int i2) {
        return i == this.f12208c && i2 == this.f12209d;
    }

    /* renamed from: a */
    public boolean mo17050a(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.f12208c && iArr[1] == this.f12209d;
    }
}
