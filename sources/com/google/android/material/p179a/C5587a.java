package com.google.android.material.p179a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import p053b.p065e.p066b.p067a.C2116a;
import p053b.p065e.p066b.p067a.C2117b;
import p053b.p065e.p066b.p067a.C2118c;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.a.a */
/* compiled from: AnimationUtils */
public class C5587a {

    /* renamed from: a */
    public static final TimeInterpolator f15929a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f15930b = new C2117b();

    /* renamed from: c */
    public static final TimeInterpolator f15931c = new C2116a();

    /* renamed from: d */
    public static final TimeInterpolator f15932d = new C2118c();

    /* renamed from: e */
    public static final TimeInterpolator f15933e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m24251a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m24252a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
