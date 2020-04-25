package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;

/* renamed from: com.google.android.gms.internal.location.r0 */
final class C4660r0 extends C4662s0 {

    /* renamed from: s */
    private final /* synthetic */ PendingIntent f13903s;

    C4660r0(C4652n0 n0Var, C4086i iVar, PendingIntent pendingIntent) {
        this.f13903s = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18790a(this.f13903s, (C4117b<Status>) this);
    }
}
