package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: com.google.android.gms.internal.location.g */
final class C4636g extends C4641i {

    /* renamed from: s */
    private final /* synthetic */ GeofencingRequest f13891s;

    /* renamed from: t */
    private final /* synthetic */ PendingIntent f13892t;

    C4636g(C4633f fVar, C4086i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f13891s = geofencingRequest;
        this.f13892t = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18797a(this.f13891s, this.f13892t, (C4117b<Status>) this);
    }
}
