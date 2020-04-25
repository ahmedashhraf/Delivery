package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4314e.C4317c;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4181p0 implements C4317c {

    /* renamed from: a */
    private final WeakReference<C4171n0> f13089a;

    /* renamed from: b */
    private final C4059a<?> f13090b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f13091c;

    public C4181p0(C4171n0 n0Var, C4059a<?> aVar, boolean z) {
        this.f13089a = new WeakReference<>(n0Var);
        this.f13090b = aVar;
        this.f13091c = z;
    }

    /* renamed from: a */
    public final void mo17877a(@C0193h0 ConnectionResult connectionResult) {
        C4171n0 n0Var = (C4171n0) this.f13089a.get();
        if (n0Var != null) {
            C4300a0.m18632b(Looper.myLooper() == n0Var.f13058a.f13004Y.mo17717f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            n0Var.f13059b.lock();
            try {
                if (n0Var.m18065a(0)) {
                    if (!connectionResult.mo17580R()) {
                        n0Var.m18071b(connectionResult, this.f13090b, this.f13091c);
                    }
                    if (n0Var.m18075d()) {
                        n0Var.m18076e();
                    }
                    n0Var.f13059b.unlock();
                }
            } finally {
                n0Var.f13059b.unlock();
            }
        }
    }
}
