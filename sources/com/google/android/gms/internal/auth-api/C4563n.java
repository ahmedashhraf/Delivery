package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth-api.n */
abstract class C4563n<R extends C4246q> extends C4116a<R, C4565p> {
    C4563n(C4086i iVar) {
        super(C3917a.f12419f, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18656a(Context context, C4569t tVar) throws DeadObjectException, RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        C4565p pVar = (C4565p) bVar;
        mo18656a(pVar.mo18257u(), (C4569t) pVar.mo18262z());
    }
}
