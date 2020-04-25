package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.k0 */
final class C7177k0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20307N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20308O;

    /* renamed from: b */
    private final /* synthetic */ List f20309b;

    C7177k0(C7169g0 g0Var, C7205o oVar, List list, C7205o oVar2) {
        this.f20308O = g0Var;
        this.f20309b = list;
        this.f20307N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20308O.f20296b.mo28497b()).mo28506c(this.f20308O.f20295a, C7169g0.m34451d((Collection<String>) this.f20309b), C7169g0.m34450d(), new C7186p0(this.f20308O, this.f20307N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "deferredInstall(%s)", this.f20309b);
            this.f20307N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
