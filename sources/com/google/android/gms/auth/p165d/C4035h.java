package com.google.android.gms.auth.p165d;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4572a;
import com.google.android.gms.internal.auth.C4615x;

/* renamed from: com.google.android.gms.auth.d.h */
public final class C4035h extends C4572a implements C4033f {
    C4035h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* renamed from: a */
    public final void mo17565a(C4031d dVar, String str) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) dVar);
        G0.writeString(str);
        mo18670b(2, G0);
    }

    /* renamed from: b */
    public final void mo17566b(boolean z) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19730a(G0, z);
        mo18670b(1, G0);
    }

    /* renamed from: a */
    public final void mo17564a(C4031d dVar, Account account) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19728a(G0, (IInterface) dVar);
        C4615x.m19729a(G0, (Parcelable) account);
        mo18670b(3, G0);
    }
}
