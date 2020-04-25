package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4618a;
import com.google.android.gms.internal.location.C4648l0;

/* renamed from: com.google.android.gms.location.y0 */
public final class C5169y0 extends C4618a implements C5165w0 {
    C5169y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo18767a(LocationAvailability locationAvailability) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) locationAvailability);
        mo18711c(2, G0);
    }

    /* renamed from: a */
    public final void mo18768a(LocationResult locationResult) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) locationResult);
        mo18711c(1, G0);
    }
}
