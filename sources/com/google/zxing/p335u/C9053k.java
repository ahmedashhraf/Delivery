package com.google.zxing.p335u;

/* renamed from: com.google.zxing.u.k */
/* compiled from: PerspectiveTransform */
public final class C9053k {

    /* renamed from: a */
    private final float f23695a;

    /* renamed from: b */
    private final float f23696b;

    /* renamed from: c */
    private final float f23697c;

    /* renamed from: d */
    private final float f23698d;

    /* renamed from: e */
    private final float f23699e;

    /* renamed from: f */
    private final float f23700f;

    /* renamed from: g */
    private final float f23701g;

    /* renamed from: h */
    private final float f23702h;

    /* renamed from: i */
    private final float f23703i;

    private C9053k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f23695a = f;
        this.f23696b = f4;
        this.f23697c = f7;
        this.f23698d = f2;
        this.f23699e = f5;
        this.f23700f = f8;
        this.f23701g = f3;
        this.f23702h = f6;
        this.f23703i = f9;
    }

    /* renamed from: a */
    public static C9053k m42361a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m42362b(f9, f10, f11, f12, f13, f14, f15, f16).mo33034a(m42360a(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: b */
    public static C9053k m42362b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            C9053k kVar = new C9053k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
            return kVar;
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        C9053k kVar2 = new C9053k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
        return kVar2;
    }

    /* renamed from: a */
    public void mo33035a(float[] fArr) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float f = this.f23695a;
        float f2 = this.f23696b;
        float f3 = this.f23697c;
        float f4 = this.f23698d;
        float f5 = this.f23699e;
        float f6 = this.f23700f;
        float f7 = this.f23701g;
        float f8 = this.f23702h;
        float f9 = this.f23703i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    /* renamed from: a */
    public void mo33036a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.f23697c * f) + (this.f23700f * f2) + this.f23703i;
            fArr[i] = (((this.f23695a * f) + (this.f23698d * f2)) + this.f23701g) / f3;
            fArr2[i] = (((this.f23696b * f) + (this.f23699e * f2)) + this.f23702h) / f3;
        }
    }

    /* renamed from: a */
    public static C9053k m42360a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m42362b(f, f2, f3, f4, f5, f6, f7, f8).mo33033a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9053k mo33033a() {
        float f = this.f23699e;
        float f2 = this.f23703i;
        float f3 = f * f2;
        float f4 = this.f23700f;
        float f5 = this.f23702h;
        float f6 = f3 - (f4 * f5);
        float f7 = this.f23701g;
        float f8 = f4 * f7;
        float f9 = this.f23698d;
        float f10 = f8 - (f9 * f2);
        float f11 = (f9 * f5) - (f * f7);
        float f12 = this.f23697c;
        float f13 = f12 * f5;
        float f14 = this.f23696b;
        float f15 = f13 - (f14 * f2);
        float f16 = this.f23695a;
        C9053k kVar = new C9053k(f6, f10, f11, f15, (f2 * f16) - (f12 * f7), (f7 * f14) - (f5 * f16), (f14 * f4) - (f12 * f), (f12 * f9) - (f4 * f16), (f16 * f) - (f14 * f9));
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9053k mo33034a(C9053k kVar) {
        C9053k kVar2 = kVar;
        float f = this.f23695a;
        float f2 = kVar2.f23695a;
        float f3 = f * f2;
        float f4 = this.f23698d;
        float f5 = kVar2.f23696b;
        float f6 = f3 + (f4 * f5);
        float f7 = this.f23701g;
        float f8 = kVar2.f23697c;
        float f9 = f6 + (f7 * f8);
        float f10 = kVar2.f23698d;
        float f11 = f * f10;
        float f12 = kVar2.f23699e;
        float f13 = f11 + (f4 * f12);
        float f14 = kVar2.f23700f;
        float f15 = f13 + (f7 * f14);
        float f16 = kVar2.f23701g;
        float f17 = f * f16;
        float f18 = kVar2.f23702h;
        float f19 = f17 + (f4 * f18);
        float f20 = kVar2.f23703i;
        float f21 = f19 + (f7 * f20);
        float f22 = this.f23696b;
        float f23 = f22 * f2;
        float f24 = f21;
        float f25 = this.f23699e;
        float f26 = f23 + (f25 * f5);
        float f27 = f15;
        float f28 = this.f23702h;
        float f29 = f26 + (f28 * f8);
        float f30 = (f22 * f10) + (f25 * f12) + (f28 * f14);
        float f31 = (f28 * f20) + (f22 * f16) + (f25 * f18);
        float f32 = this.f23697c;
        float f33 = f2 * f32;
        float f34 = this.f23700f;
        float f35 = f33 + (f5 * f34);
        float f36 = this.f23703i;
        float f37 = (f32 * f16) + (f34 * f18) + (f36 * f20);
        C9053k kVar3 = new C9053k(f9, f27, f24, f29, f30, f31, (f8 * f36) + f35, (f10 * f32) + (f12 * f34) + (f14 * f36), f37);
        return kVar3;
    }
}
