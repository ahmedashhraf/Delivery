package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4375p;
import p076c.p112d.p113a.p114a.p118d.p121c.C2596b;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.signin.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C5536g extends C2596b implements C5534e {
    C5536g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo21959a(C4375p pVar, int i, boolean z) throws RemoteException {
        Parcel G0 = mo10093G0();
        C2598d.m12703a(G0, (IInterface) pVar);
        G0.writeInt(i);
        C2598d.m12705a(G0, z);
        mo10096b(9, G0);
    }

    /* renamed from: k */
    public final void mo21961k(int i) throws RemoteException {
        Parcel G0 = mo10093G0();
        G0.writeInt(i);
        mo10096b(7, G0);
    }

    /* renamed from: a */
    public final void mo21960a(zai zai, C5532c cVar) throws RemoteException {
        Parcel G0 = mo10093G0();
        C2598d.m12704a(G0, (Parcelable) zai);
        C2598d.m12703a(G0, (IInterface) cVar);
        mo10096b(12, G0);
    }
}
