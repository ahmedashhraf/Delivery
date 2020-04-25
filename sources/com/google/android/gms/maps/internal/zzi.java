package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import p076c.p112d.p113a.p114a.p118d.p124f.C2645c0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public abstract class zzi extends C2657j implements zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C4519d dVar;
        if (i == 1) {
            dVar = zzh(C2645c0.m12799a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            dVar = zzi(C2645c0.m12799a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        C2658k.m12914a(parcel2, (IInterface) dVar);
        return true;
    }
}
