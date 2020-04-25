package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public abstract class zzak extends C2657j implements zzaj {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onMapClick((LatLng) C2658k.m12913a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
