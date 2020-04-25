package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C3945b;
import com.google.android.gms.auth.api.proxy.C3978b.C3980b;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth.n */
abstract class C4598n extends C4116a<C3980b, C4586h> {
    public C4598n(C4086i iVar) {
        super(C3945b.f12492c, iVar);
    }

    /* renamed from: d */
    protected static C3980b m19687d(Status status) {
        return new C4612u(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18694a(Context context, C4592k kVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        C4586h hVar = (C4586h) bVar;
        mo18694a(hVar.mo18257u(), (C4592k) hVar.mo18262z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* synthetic */ C4246q mo17536b(Status status) {
        return m19687d(status);
    }
}
