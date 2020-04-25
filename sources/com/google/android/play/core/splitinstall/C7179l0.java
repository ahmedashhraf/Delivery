package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: com.google.android.play.core.splitinstall.l0 */
final class C7179l0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20310N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20311O;

    /* renamed from: b */
    private final /* synthetic */ int f20312b;

    C7179l0(C7169g0 g0Var, C7205o oVar, int i, C7205o oVar2) {
        this.f20311O = g0Var;
        this.f20312b = i;
        this.f20310N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20311O.f20296b.mo28497b()).mo28502a(this.f20311O.f20295a, this.f20312b, new C7174j(this.f20311O, this.f20310N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "getSessionState(%d)", Integer.valueOf(this.f20312b));
            this.f20310N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
