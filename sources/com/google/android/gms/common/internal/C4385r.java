package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.common.internal.r */
public interface C4385r extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.r$a */
    public static abstract class C4386a extends C2614b implements C4385r {
        public C4386a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo10132a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                mo18274a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C2615c.m12723a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo18276c(parcel.readInt(), (Bundle) C2615c.m12723a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo18275a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C2615c.m12723a(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo18274a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo18275a(int i, IBinder iBinder, zzb zzb) throws RemoteException;

    /* renamed from: c */
    void mo18276c(int i, Bundle bundle) throws RemoteException;
}
