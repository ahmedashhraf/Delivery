package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.common.internal.k1 */
public final class C4361k1 extends C2613a implements C4385r {
    C4361k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo18274a(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel a = mo10127a();
        a.writeInt(i);
        a.writeStrongBinder(iBinder);
        C2615c.m12725a(a, (Parcelable) bundle);
        mo10130b(1, a);
    }

    /* renamed from: c */
    public final void mo18276c(int i, Bundle bundle) throws RemoteException {
        Parcel a = mo10127a();
        a.writeInt(i);
        C2615c.m12725a(a, (Parcelable) bundle);
        mo10130b(2, a);
    }

    /* renamed from: a */
    public final void mo18275a(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel a = mo10127a();
        a.writeInt(i);
        a.writeStrongBinder(iBinder);
        C2615c.m12725a(a, (Parcelable) zzb);
        mo10130b(3, a);
    }
}
