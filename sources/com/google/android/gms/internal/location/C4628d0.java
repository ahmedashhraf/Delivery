package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.d0 */
final class C4628d0 extends C4659r {

    /* renamed from: b */
    private C4117b<LocationSettingsResult> f13882b;

    public C4628d0(C4117b<LocationSettingsResult> bVar) {
        C4300a0.m18628a(bVar != null, (Object) "listener can't be null.");
        this.f13882b = bVar;
    }

    /* renamed from: a */
    public final void mo18719a(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f13882b.mo17810a(locationSettingsResult);
        this.f13882b = null;
    }
}
