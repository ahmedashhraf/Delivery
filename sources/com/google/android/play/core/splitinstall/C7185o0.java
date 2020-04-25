package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: com.google.android.play.core.splitinstall.o0 */
final class C7185o0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7169g0 f20322N;

    /* renamed from: b */
    private final /* synthetic */ C7205o f20323b;

    C7185o0(C7169g0 g0Var, C7205o oVar, C7205o oVar2) {
        this.f20322N = g0Var;
        this.f20323b = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20322N.f20296b.mo28497b()).mo28503a(this.f20322N.f20295a, new C7180m(this.f20322N, this.f20323b));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "getSessionStates", new Object[0]);
            this.f20323b.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
