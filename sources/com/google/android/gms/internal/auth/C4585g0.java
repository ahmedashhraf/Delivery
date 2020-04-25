package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.p165d.C4031d;
import com.google.android.gms.auth.p165d.C4033f;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth.g0 */
final class C4585g0 extends C4116a<C4246q, C4597m0> {

    /* renamed from: s */
    private final /* synthetic */ Account f13842s;

    C4585g0(C4577c0 c0Var, C4059a aVar, C4086i iVar, Account account) {
        this.f13842s = account;
        super(aVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4033f) ((C4597m0) bVar).mo18262z()).mo17564a((C4031d) new C4587h0(this), this.f13842s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4246q mo17536b(Status status) {
        return new C4595l0(status);
    }
}
