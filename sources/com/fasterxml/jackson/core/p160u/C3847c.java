package com.fasterxml.jackson.core.p160u;

/* renamed from: com.fasterxml.jackson.core.u.c */
/* compiled from: Name1 */
public final class C3847c extends C3850f {

    /* renamed from: d */
    static final C3847c f12206d = new C3847c("", 0, 0);

    /* renamed from: c */
    final int f12207c;

    C3847c(String str, int i, int i2) {
        super(str, i);
        this.f12207c = i2;
    }

    /* renamed from: b */
    static C3847c m16696b() {
        return f12206d;
    }

    /* renamed from: a */
    public boolean mo17048a(int i) {
        return i == this.f12207c;
    }

    /* renamed from: a */
    public boolean mo17049a(int i, int i2) {
        return i == this.f12207c && i2 == 0;
    }

    /* renamed from: a */
    public boolean mo17050a(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.f12207c;
    }
}
