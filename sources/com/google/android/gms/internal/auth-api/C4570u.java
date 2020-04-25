package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.u */
public final class C4570u extends C4550a implements C4569t {
    C4570u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: a */
    public final void mo18660a(C4567r rVar, CredentialRequest credentialRequest) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) rVar);
        C4552c.m19588a(G0, (Parcelable) credentialRequest);
        mo18649a(1, G0);
    }

    /* renamed from: a */
    public final void mo18662a(C4567r rVar, zzy zzy) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) rVar);
        C4552c.m19588a(G0, (Parcelable) zzy);
        mo18649a(2, G0);
    }

    /* renamed from: a */
    public final void mo18661a(C4567r rVar, zzs zzs) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) rVar);
        C4552c.m19588a(G0, (Parcelable) zzs);
        mo18649a(3, G0);
    }

    /* renamed from: a */
    public final void mo18659a(C4567r rVar) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) rVar);
        mo18649a(4, G0);
    }
}
