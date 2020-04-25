package com.mrsool.utils.p419a0;

import android.view.animation.Interpolator;

/* renamed from: com.mrsool.utils.a0.a */
/* compiled from: CustomSpringInterpolator */
public class C11570a implements Interpolator {

    /* renamed from: a */
    private float f32761a = 0.8f;

    public C11570a() {
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.f32761a;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        double d3 = (double) f2;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin(d2 / d3)) + 1.0d);
    }

    public C11570a(float f) {
        this.f32761a = f;
    }
}
