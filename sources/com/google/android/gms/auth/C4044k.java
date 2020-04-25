package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4573a0;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.auth.k */
final class C4044k implements C4047n<List<AccountChangeEvent>> {

    /* renamed from: a */
    private final /* synthetic */ String f12737a;

    /* renamed from: b */
    private final /* synthetic */ int f12738b;

    C4044k(String str, int i) {
        this.f12737a = str;
        this.f12738b = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17573a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse) C4041h.m17492a(C4573a0.m19635a(iBinder).mo18678a(new AccountChangeEventsRequest().mo17284c(this.f12737a).mo17286g(this.f12738b)))).mo17288N();
    }
}
