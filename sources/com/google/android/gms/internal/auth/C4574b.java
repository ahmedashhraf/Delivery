package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth.b */
public final class C4574b extends C4572a implements C4611t0 {
    C4574b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    /* renamed from: a */
    public final void mo18673a(C4607r0 r0Var, zzaf zzaf) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) r0Var);
        C4615x.m19729a(G0, (Parcelable) zzaf);
        mo18670b(5, G0);
    }

    /* renamed from: a */
    public final void mo18672a(C4607r0 r0Var, zzad zzad) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) r0Var);
        C4615x.m19729a(G0, (Parcelable) zzad);
        mo18670b(6, G0);
    }

    /* renamed from: a */
    public final void mo18675a(C4607r0 r0Var, zzv zzv) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) r0Var);
        C4615x.m19729a(G0, (Parcelable) zzv);
        mo18670b(7, G0);
    }

    /* renamed from: a */
    public final void mo18674a(C4607r0 r0Var, zzah zzah) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) r0Var);
        C4615x.m19729a(G0, (Parcelable) zzah);
        mo18670b(8, G0);
    }

    /* renamed from: a */
    public final void mo18671a(C4607r0 r0Var, zzab zzab) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) r0Var);
        C4615x.m19729a(G0, (Parcelable) zzab);
        mo18670b(9, G0);
    }
}
