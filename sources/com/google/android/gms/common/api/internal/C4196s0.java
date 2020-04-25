package com.google.android.gms.common.api.internal;

import androidx.annotation.C0190g;
import com.google.android.gms.signin.internal.C5533d;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4196s0 extends C5533d {

    /* renamed from: b */
    private final WeakReference<C4171n0> f13135b;

    C4196s0(C4171n0 n0Var) {
        this.f13135b = new WeakReference<>(n0Var);
    }

    @C0190g
    /* renamed from: a */
    public final void mo17908a(zak zak) {
        C4171n0 n0Var = (C4171n0) this.f13135b.get();
        if (n0Var != null) {
            n0Var.f13058a.mo17889a((C4134h1) new C4212v0(this, n0Var, n0Var, zak));
        }
    }
}
