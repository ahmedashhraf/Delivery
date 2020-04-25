package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.r */
public abstract class C4659r extends C4619a0 implements C4657q {
    public C4659r() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18712a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18719a((LocationSettingsResult) C4648l0.m19779a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
