package com.google.zxing.p346y.p347c0;

import com.google.zxing.C8987p;

/* renamed from: com.google.zxing.y.c0.c */
/* compiled from: FinderPattern */
public final class C9109c {

    /* renamed from: a */
    private final int f23887a;

    /* renamed from: b */
    private final int[] f23888b;

    /* renamed from: c */
    private final C8987p[] f23889c;

    public C9109c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f23887a = i;
        this.f23888b = iArr;
        float f = (float) i4;
        this.f23889c = new C8987p[]{new C8987p((float) i2, f), new C8987p((float) i3, f)};
    }

    /* renamed from: a */
    public C8987p[] mo33131a() {
        return this.f23889c;
    }

    /* renamed from: b */
    public int[] mo33132b() {
        return this.f23888b;
    }

    /* renamed from: c */
    public int mo33133c() {
        return this.f23887a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9109c)) {
            return false;
        }
        if (this.f23887a == ((C9109c) obj).f23887a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f23887a;
    }
}
