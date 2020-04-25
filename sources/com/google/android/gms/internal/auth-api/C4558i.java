package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.i */
final class C4558i extends C4554e {

    /* renamed from: b */
    private final /* synthetic */ C4557h f13829b;

    C4558i(C4557h hVar) {
        this.f13829b = hVar;
    }

    /* renamed from: a */
    public final void mo18653a(Status status, Credential credential) {
        this.f13829b.mo17744a(new C4555f(status, credential));
    }

    /* renamed from: i */
    public final void mo18655i(Status status) {
        this.f13829b.mo17744a(C4555f.m19592a(status));
    }
}
