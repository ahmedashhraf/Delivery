package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C3990e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.k */
final class C4006k extends C3999d {

    /* renamed from: b */
    private final /* synthetic */ C4005j f12697b;

    C4006k(C4005j jVar) {
        this.f12697b = jVar;
    }

    /* renamed from: a */
    public final void mo17527a(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            C4012q.m17427a(this.f12697b.f12695s).mo17538a(this.f12697b.f12696t, googleSignInAccount);
        }
        this.f12697b.mo17744a(new C3990e(googleSignInAccount, status));
    }
}
