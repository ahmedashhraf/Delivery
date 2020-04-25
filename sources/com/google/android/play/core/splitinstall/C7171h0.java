package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.h0 */
final class C7171h0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f20297N;

    /* renamed from: O */
    private final /* synthetic */ C7169g0 f20298O;

    /* renamed from: b */
    private final /* synthetic */ List f20299b;

    C7171h0(C7169g0 g0Var, C7205o oVar, List list, C7205o oVar2) {
        this.f20298O = g0Var;
        this.f20299b = list;
        this.f20297N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7131e0) this.f20298O.f20296b.mo28497b()).mo28507d(this.f20298O.f20295a, C7169g0.m34451d((Collection<String>) this.f20299b), C7169g0.m34450d(), new C7176k(this.f20298O, this.f20297N));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "deferredUninstall(%s)", this.f20299b);
            this.f20297N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
