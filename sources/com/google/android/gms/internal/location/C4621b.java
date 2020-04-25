package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;

/* renamed from: com.google.android.gms.internal.location.b */
final class C4621b extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ PendingIntent f13877s;

    C4621b(C4672x0 x0Var, C4086i iVar, PendingIntent pendingIntent) {
        this.f13877s = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18791a(this.f13877s, (C4643j) new C4627d(this));
    }
}
