package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7205o;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.play.core.splitinstall.i0 */
final class C7173i0 extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ Collection f20300N;

    /* renamed from: O */
    private final /* synthetic */ C7205o f20301O;

    /* renamed from: P */
    private final /* synthetic */ C7169g0 f20302P;

    /* renamed from: b */
    private final /* synthetic */ Collection f20303b;

    C7173i0(C7169g0 g0Var, C7205o oVar, Collection collection, Collection collection2, C7205o oVar2) {
        this.f20302P = g0Var;
        this.f20303b = collection;
        this.f20300N = collection2;
        this.f20301O = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        ArrayList a = C7169g0.m34451d(this.f20303b);
        a.addAll(C7169g0.m34449c(this.f20300N));
        try {
            ((C7131e0) this.f20302P.f20296b.mo28497b()).mo28508e(this.f20302P.f20295a, a, C7169g0.m34450d(), new C7178l(this.f20302P, this.f20301O));
        } catch (RemoteException e) {
            C7169g0.f20293c.mo23044a((Throwable) e, "startInstall(%s,%s)", this.f20303b, this.f20300N);
            this.f20301O.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
