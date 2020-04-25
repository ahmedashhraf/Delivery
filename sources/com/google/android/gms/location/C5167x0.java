package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4619a0;
import com.google.android.gms.internal.location.C4648l0;

/* renamed from: com.google.android.gms.location.x0 */
public abstract class C5167x0 extends C4619a0 implements C5165w0 {
    public C5167x0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public static C5165w0 m22436a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C5165w0 ? (C5165w0) queryLocalInterface : new C5169y0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18712a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18768a((LocationResult) C4648l0.m19779a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo18767a((LocationAvailability) C4648l0.m19779a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
