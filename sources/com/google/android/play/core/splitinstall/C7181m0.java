package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.internal.C7133f0;
import com.google.android.play.core.tasks.C7205o;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.m0 */
final class C7181m0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20313N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20314O;

    /* renamed from: b */
    private final /* synthetic */ List f20315b;

    C7181m0(C7169g0 g0Var, C7205o oVar, List list, C7205o oVar2) {
        this.f20314O = g0Var;
        this.f20315b = list;
        this.f20313N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20314O.f20296b.mo28497b()).mo28504a(this.f20314O.f20295a, (List<Bundle>) C7169g0.m34449c((Collection<String>) this.f20315b), C7169g0.m34450d(), (C7133f0) new C7170h(this.f20314O, this.f20313N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "deferredLanguageUninstall(%s)", this.f20315b);
            this.f20313N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
