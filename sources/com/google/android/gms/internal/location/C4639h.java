package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.h */
final class C4639h extends C4641i {

    /* renamed from: s */
    private final /* synthetic */ zzal f13894s;

    C4639h(C4633f fVar, C4086i iVar, zzal zzal) {
        this.f13894s = zzal;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18801a(this.f13894s, (C4117b<Status>) this);
    }
}
