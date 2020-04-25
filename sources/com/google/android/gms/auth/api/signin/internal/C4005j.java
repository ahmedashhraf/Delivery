package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C3990e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
final class C4005j extends C4011p<C3990e> {

    /* renamed from: s */
    final /* synthetic */ Context f12695s;

    /* renamed from: t */
    final /* synthetic */ GoogleSignInOptions f12696t;

    C4005j(C4086i iVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f12695s = context;
        this.f12696t = googleSignInOptions;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4017v) ((C4003h) bVar).mo18262z()).mo17544a(new C4006k(this), this.f12696t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return new C3990e(null, status);
    }
}
