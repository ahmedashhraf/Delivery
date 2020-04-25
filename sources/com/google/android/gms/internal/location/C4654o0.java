package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.o0 */
final class C4654o0 extends C4662s0 {

    /* renamed from: s */
    private final /* synthetic */ long f13898s;

    /* renamed from: t */
    private final /* synthetic */ PendingIntent f13899t;

    C4654o0(C4652n0 n0Var, C4086i iVar, long j, PendingIntent pendingIntent) {
        this.f13898s = j;
        this.f13899t = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18788a(this.f13898s, this.f13899t);
        mo17744a(Status.f12780P);
    }
}
