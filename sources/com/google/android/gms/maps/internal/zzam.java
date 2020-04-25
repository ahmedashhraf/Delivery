package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;

public abstract class zzam extends C2657j implements zzal {
    public zzam() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onMapLoaded();
        parcel2.writeNoException();
        return true;
    }
}
