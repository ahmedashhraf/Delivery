package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.j */
final class C4559j extends C4563n<Status> {

    /* renamed from: s */
    private final /* synthetic */ Credential f13830s;

    C4559j(C4556g gVar, C4086i iVar, Credential credential) {
        this.f13830s = credential;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18656a(Context context, C4569t tVar) throws RemoteException {
        tVar.mo18662a((C4567r) new C4562m(this), new zzy(this.f13830s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return status;
    }
}
