package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2657j;

public interface ILocationSourceDelegate extends IInterface {

    public static abstract class zza extends C2657j implements ILocationSourceDelegate {
        public zza() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        /* access modifiers changed from: protected */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzah zzah;
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzah = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    zzah = queryLocalInterface instanceof zzah ? (zzah) queryLocalInterface : new zzai(readStrongBinder);
                }
                activate(zzah);
            } else if (i != 2) {
                return false;
            } else {
                deactivate();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activate(zzah zzah) throws RemoteException;

    void deactivate() throws RemoteException;
}
