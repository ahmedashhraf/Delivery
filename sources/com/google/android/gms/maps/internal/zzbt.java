package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public abstract class zzbt extends C2657j implements zzbs {
    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onSnapshotReady((Bitmap) C2658k.m12913a(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzb(C4520a.m19510a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
