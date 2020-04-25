package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.l */
public final class C4647l extends C4618a implements C4643j {
    C4647l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final void mo18718a(zzad zzad) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) zzad);
        mo18711c(1, G0);
    }
}
