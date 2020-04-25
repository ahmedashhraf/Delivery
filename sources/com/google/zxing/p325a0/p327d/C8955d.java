package com.google.zxing.p325a0.p327d;

import com.google.zxing.C8987p;

/* renamed from: com.google.zxing.a0.d.d */
/* compiled from: FinderPattern */
public final class C8955d extends C8987p {

    /* renamed from: c */
    private final float f23411c;

    /* renamed from: d */
    private final int f23412d;

    C8955d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32721a(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32831b()) > f || Math.abs(f3 - mo32830a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f23411c);
        if (abs <= 1.0f || abs <= this.f23411c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8955d mo32722b(float f, float f2, float f3) {
        int i = this.f23412d;
        int i2 = i + 1;
        float a = (((float) i) * mo32830a()) + f2;
        float f4 = (float) i2;
        return new C8955d(a / f4, ((((float) this.f23412d) * mo32831b()) + f) / f4, ((((float) this.f23412d) * this.f23411c) + f3) / f4, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo32723c() {
        return this.f23412d;
    }

    /* renamed from: d */
    public float mo32724d() {
        return this.f23411c;
    }

    private C8955d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f23411c = f3;
        this.f23412d = i;
    }
}
