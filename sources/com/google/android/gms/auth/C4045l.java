package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4573a0;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.l */
final class C4045l implements C4047n<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ Account f12739a;

    C4045l(Account account) {
        this.f12739a = account;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17573a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle) C4041h.m17492a(C4573a0.m19635a(iBinder).mo18679b(this.f12739a));
    }
}
