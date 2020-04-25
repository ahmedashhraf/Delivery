package com.google.android.material.p187p;

import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.p.f */
/* compiled from: CutCornerTreatment */
public class C6973f extends C6972e {

    /* renamed from: a */
    float f19532a = -1.0f;

    public C6973f() {
    }

    /* renamed from: a */
    public void mo27769a(@C0193h0 C6993q qVar, float f, float f2, float f3) {
        qVar.mo27913b(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians((double) f));
        double d = (double) f3;
        Double.isNaN(d);
        double d2 = sin * d;
        double d3 = (double) f2;
        Double.isNaN(d3);
        float f4 = (float) (d2 * d3);
        double sin2 = Math.sin(Math.toRadians((double) (90.0f - f)));
        Double.isNaN(d);
        double d4 = sin2 * d;
        Double.isNaN(d3);
        qVar.mo27907a(f4, (float) (d4 * d3));
    }

    @Deprecated
    public C6973f(float f) {
        this.f19532a = f;
    }
}
