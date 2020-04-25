package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.C4086i;

/* renamed from: com.google.android.gms.internal.auth.p */
final class C4602p extends C4596m {

    /* renamed from: s */
    private final /* synthetic */ ProxyRequest f13849s;

    C4602p(C4600o oVar, C4086i iVar, ProxyRequest proxyRequest) {
        this.f13849s = proxyRequest;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18693a(Context context, C4592k kVar) throws RemoteException {
        kVar.mo18692a(new C4604q(this), this.f13849s);
    }
}
