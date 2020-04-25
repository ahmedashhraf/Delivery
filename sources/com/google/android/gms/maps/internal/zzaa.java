package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;
import p076c.p112d.p113a.p114a.p118d.p124f.C2670w;

public abstract class zzaa extends C2657j implements zzz {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onIndoorBuildingFocused();
        } else if (i != 2) {
            return false;
        } else {
            zza(C2670w.m13015a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
