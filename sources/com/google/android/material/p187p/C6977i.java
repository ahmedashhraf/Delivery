package com.google.android.material.p187p;

import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.p.i */
/* compiled from: MarkerEdgeTreatment */
public final class C6977i extends C6974g {

    /* renamed from: a */
    private final float f19540a;

    public C6977i(float f) {
        this.f19540a = f - 0.001f;
    }

    /* renamed from: a */
    public void mo22347a(float f, float f2, float f3, @C0193h0 C6993q qVar) {
        double d = (double) this.f19540a;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = (float) ((d * sqrt) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f19540a, 2.0d) - Math.pow((double) f4, 2.0d));
        float f5 = f2 - f4;
        double d2 = (double) this.f19540a;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt3;
        double d4 = (double) this.f19540a;
        Double.isNaN(d4);
        qVar.mo27912b(f5, ((float) (-(d3 - d4))) + sqrt2);
        double d5 = (double) this.f19540a;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt4;
        double d7 = (double) this.f19540a;
        Double.isNaN(d7);
        qVar.mo27907a(f2, (float) (-(d6 - d7)));
        float f6 = f2 + f4;
        double d8 = (double) this.f19540a;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt5;
        double d10 = (double) this.f19540a;
        Double.isNaN(d10);
        qVar.mo27907a(f6, ((float) (-(d9 - d10))) + sqrt2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo27772b() {
        return true;
    }
}
