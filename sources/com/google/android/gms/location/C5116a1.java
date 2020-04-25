package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C4619a0;
import com.google.android.gms.internal.location.C4648l0;

/* renamed from: com.google.android.gms.location.a1 */
public abstract class C5116a1 extends C4619a0 implements C5171z0 {
    public C5116a1() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public static C5171z0 m22352a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C5171z0 ? (C5171z0) queryLocalInterface : new C5119b1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18712a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) C4648l0.m19779a(parcel, Location.CREATOR));
        return true;
    }
}
