package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4129g1 extends C4203t1 {

    /* renamed from: a */
    private WeakReference<C4232z0> f12941a;

    C4129g1(C4232z0 z0Var) {
        this.f12941a = new WeakReference<>(z0Var);
    }

    /* renamed from: a */
    public final void mo17835a() {
        C4232z0 z0Var = (C4232z0) this.f12941a.get();
        if (z0Var != null) {
            z0Var.m18306p();
        }
    }
}
