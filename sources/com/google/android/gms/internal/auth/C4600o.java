package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C3978b;
import com.google.android.gms.auth.api.proxy.C3978b.C3979a;
import com.google.android.gms.auth.api.proxy.C3978b.C3980b;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.internal.auth.o */
public final class C4600o implements C3978b {
    /* renamed from: a */
    public final C4237l<C3979a> mo17436a(C4086i iVar, ProxyRequest proxyRequest) {
        C4300a0.m18620a(iVar);
        C4300a0.m18620a(proxyRequest);
        return iVar.mo17705b(new C4602p(this, iVar, proxyRequest));
    }

    /* renamed from: a */
    public final C4237l<C3980b> mo17435a(C4086i iVar) {
        C4300a0.m18620a(iVar);
        return iVar.mo17705b(new C4606r(this, iVar));
    }
}
