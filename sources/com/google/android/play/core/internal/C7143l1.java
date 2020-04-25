package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.l1 */
final class C7143l1 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7139i1 f20244N;

    /* renamed from: b */
    private final /* synthetic */ IBinder f20245b;

    C7143l1(C7139i1 i1Var, IBinder iBinder) {
        this.f20244N = i1Var;
        this.f20245b = iBinder;
    }

    /* renamed from: a */
    public final void mo25050a() {
        C7128c1 c1Var = this.f20244N.f20241a;
        c1Var.f20235k = (IInterface) c1Var.f20231g.mo25047a(this.f20245b);
        this.f20244N.f20241a.m34317e();
        this.f20244N.f20241a.f20229e = false;
        for (Runnable run : this.f20244N.f20241a.f20228d) {
            run.run();
        }
        this.f20244N.f20241a.f20228d.clear();
    }
}
