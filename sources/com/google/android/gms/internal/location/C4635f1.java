package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.f1 */
final class C4635f1 extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ LocationRequest f13889s;

    /* renamed from: t */
    private final /* synthetic */ PendingIntent f13890t;

    C4635f1(C4672x0 x0Var, C4086i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f13889s = locationRequest;
        this.f13890t = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18798a(this.f13889s, this.f13890t, (C4643j) new C4627d(this));
    }
}
