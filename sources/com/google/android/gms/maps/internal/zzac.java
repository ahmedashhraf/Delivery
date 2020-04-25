package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2645c0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;

public abstract class zzac extends C2657j implements zzab {
    public zzac() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze(C2645c0.m12799a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
