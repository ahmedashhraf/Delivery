package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.xb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C5053xb extends C4677a implements C5027vb {
    C5053xb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: c */
    public final void mo19016c(Bundle bundle) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) bundle);
        mo18822b(1, G0);
    }
}
