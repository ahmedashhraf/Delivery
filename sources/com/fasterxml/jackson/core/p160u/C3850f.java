package com.fasterxml.jackson.core.p160u;

/* renamed from: com.fasterxml.jackson.core.u.f */
/* compiled from: Name */
public abstract class C3850f {

    /* renamed from: a */
    protected final String f12213a;

    /* renamed from: b */
    protected final int f12214b;

    protected C3850f(String str, int i) {
        this.f12213a = str;
        this.f12214b = i;
    }

    /* renamed from: a */
    public String mo17051a() {
        return this.f12213a;
    }

    /* renamed from: a */
    public abstract boolean mo17048a(int i);

    /* renamed from: a */
    public abstract boolean mo17049a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo17050a(int[] iArr, int i);

    public boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f12214b;
    }

    public String toString() {
        return this.f12213a;
    }
}
