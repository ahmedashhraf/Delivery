package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2645c0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;

public abstract class zzau extends C2657j implements zzat {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb(C2645c0.m12799a(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzd(C2645c0.m12799a(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            zzc(C2645c0.m12799a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
