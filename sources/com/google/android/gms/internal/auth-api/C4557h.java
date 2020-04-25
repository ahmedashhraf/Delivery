package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C3952a;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.h */
final class C4557h extends C4563n<C3952a> {

    /* renamed from: s */
    private final /* synthetic */ CredentialRequest f13828s;

    C4557h(C4556g gVar, C4086i iVar, CredentialRequest credentialRequest) {
        this.f13828s = credentialRequest;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18656a(Context context, C4569t tVar) throws RemoteException {
        tVar.mo18660a((C4567r) new C4558i(this), this.f13828s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return C4555f.m19592a(status);
    }
}
