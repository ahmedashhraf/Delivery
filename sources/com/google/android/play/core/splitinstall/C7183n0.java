package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.internal.C7133f0;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: com.google.android.play.core.splitinstall.n0 */
final class C7183n0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20318N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20319O;

    /* renamed from: b */
    private final /* synthetic */ int f20320b;

    C7183n0(C7169g0 g0Var, C7205o oVar, int i, C7205o oVar2) {
        this.f20319O = g0Var;
        this.f20320b = i;
        this.f20318N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20319O.f20296b.mo28497b()).mo28501a(this.f20319O.f20295a, this.f20320b, C7169g0.m34450d(), (C7133f0) new C7168g(this.f20319O, this.f20318N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "cancelInstall(%d)", Integer.valueOf(this.f20320b));
            this.f20318N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
