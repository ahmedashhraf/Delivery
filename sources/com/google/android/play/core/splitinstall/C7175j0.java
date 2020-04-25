package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.j0 */
final class C7175j0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20304N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20305O;

    /* renamed from: b */
    private final /* synthetic */ List f20306b;

    C7175j0(C7169g0 g0Var, C7205o oVar, List list, C7205o oVar2) {
        this.f20305O = g0Var;
        this.f20306b = list;
        this.f20304N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20305O.f20296b.mo28497b()).mo28505b(this.f20305O.f20295a, C7169g0.m34449c((Collection<String>) this.f20306b), C7169g0.m34450d(), new C7172i(this.f20305O, this.f20304N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "deferredLanguageInstall(%s)", this.f20306b);
            this.f20304N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
