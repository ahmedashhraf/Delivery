package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.C5142m.C5143a;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.j0 */
final class C4644j0 extends C5143a<LocationSettingsResult> {

    /* renamed from: s */
    private final /* synthetic */ LocationSettingsRequest f13895s;

    /* renamed from: t */
    private final /* synthetic */ String f13896t = null;

    C4644j0(C4642i0 i0Var, C4086i iVar, LocationSettingsRequest locationSettingsRequest, String str) {
        this.f13895s = locationSettingsRequest;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18800a(this.f13895s, (C4117b<LocationSettingsResult>) this, this.f13896t);
    }

    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return new LocationSettingsResult(status);
    }
}
