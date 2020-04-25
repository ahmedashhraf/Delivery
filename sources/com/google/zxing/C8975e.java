package com.google.zxing;

/* renamed from: com.google.zxing.e */
/* compiled from: Dimension */
public final class C8975e {

    /* renamed from: a */
    private final int f23474a;

    /* renamed from: b */
    private final int f23475b;

    public C8975e(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.f23474a = i;
        this.f23475b = i2;
    }

    /* renamed from: a */
    public int mo32798a() {
        return this.f23475b;
    }

    /* renamed from: b */
    public int mo32799b() {
        return this.f23474a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8975e) {
            C8975e eVar = (C8975e) obj;
            if (this.f23474a == eVar.f23474a && this.f23475b == eVar.f23475b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f23474a * 32713) + this.f23475b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23474a);
        sb.append("x");
        sb.append(this.f23475b);
        return sb.toString();
    }
}
