package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C3945b;
import com.google.android.gms.auth.api.proxy.C3978b.C3979a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth.m */
abstract class C4596m extends C4116a<C3979a, C4586h> {
    public C4596m(C4086i iVar) {
        super(C3945b.f12492c, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18693a(Context context, C4592k kVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        C4586h hVar = (C4586h) bVar;
        mo18693a(hVar.mo18257u(), (C4592k) hVar.mo18262z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* synthetic */ C4246q mo17536b(Status status) {
        return new C4610t(status);
    }
}
