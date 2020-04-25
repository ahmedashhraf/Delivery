package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4618a;
import com.google.android.gms.internal.location.C4648l0;

/* renamed from: com.google.android.gms.location.b1 */
public final class C5119b1 extends C4618a implements C5171z0 {
    C5119b1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) location);
        mo18711c(1, G0);
    }
}
