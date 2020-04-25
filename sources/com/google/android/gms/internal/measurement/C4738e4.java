package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.e4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4738e4 extends C4677a implements C4722d2 {
    C4738e4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: c */
    public final Bundle mo18905c(Bundle bundle) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) bundle);
        Parcel a = mo18820a(1, G0);
        Bundle bundle2 = (Bundle) C4692b0.m19943a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
