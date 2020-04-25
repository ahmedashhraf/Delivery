package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: com.google.android.gms.internal.auth.l */
public final class C4594l extends C4572a implements C4592k {
    C4594l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: a */
    public final void mo18692a(C4588i iVar, ProxyRequest proxyRequest) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) iVar);
        C4615x.m19729a(G0, (Parcelable) proxyRequest);
        mo18670b(1, G0);
    }

    /* renamed from: a */
    public final void mo18691a(C4588i iVar) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) iVar);
        mo18670b(3, G0);
    }
}
