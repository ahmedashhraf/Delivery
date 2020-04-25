package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2651f0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;

public abstract class zzbe extends C2657j implements zzbd {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza(C2651f0.m12866a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
