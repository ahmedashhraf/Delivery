package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.n */
public abstract class C4651n extends C4619a0 implements C4649m {
    public C4651n() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18712a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18716a(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo18717b(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo18715a(parcel.readInt(), (PendingIntent) C4648l0.m19779a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
