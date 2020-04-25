package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.k */
public abstract class C4645k extends C4619a0 implements C4643j {
    public C4645k() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18712a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18718a((zzad) C4648l0.m19779a(parcel, zzad.CREATOR));
        return true;
    }
}
