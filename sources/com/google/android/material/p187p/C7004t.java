package com.google.android.material.p187p;

import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.p.t */
/* compiled from: TriangleEdgeTreatment */
public class C7004t extends C6974g {

    /* renamed from: a */
    private final float f19670a;

    /* renamed from: b */
    private final boolean f19671b;

    public C7004t(float f, boolean z) {
        this.f19670a = f;
        this.f19671b = z;
    }

    /* renamed from: a */
    public void mo22347a(float f, float f2, float f3, @C0193h0 C6993q qVar) {
        qVar.mo27907a(f2 - (this.f19670a * f3), 0.0f);
        qVar.mo27907a(f2, (this.f19671b ? this.f19670a : -this.f19670a) * f3);
        qVar.mo27907a(f2 + (this.f19670a * f3), 0.0f);
        qVar.mo27907a(f, 0.0f);
    }
}
