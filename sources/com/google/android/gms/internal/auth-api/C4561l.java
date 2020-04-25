package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.l */
final class C4561l extends C4563n<Status> {
    C4561l(C4556g gVar, C4086i iVar) {
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18656a(Context context, C4569t tVar) throws RemoteException {
        tVar.mo18659a(new C4562m(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return status;
    }
}
