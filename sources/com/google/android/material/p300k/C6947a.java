package com.google.android.material.p300k;

/* renamed from: com.google.android.material.k.a */
/* compiled from: MathUtils */
public final class C6947a {

    /* renamed from: a */
    public static final float f19432a = 1.0E-4f;

    private C6947a() {
    }

    /* renamed from: a */
    public static float m33312a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static boolean m33314a(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: b */
    public static float m33315b(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    private static float m33316b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: a */
    public static float m33313a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m33316b(m33312a(f, f2, f3, f4), m33312a(f, f2, f5, f4), m33312a(f, f2, f5, f6), m33312a(f, f2, f3, f6));
    }
}
