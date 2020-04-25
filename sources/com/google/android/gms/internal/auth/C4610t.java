package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C3978b.C3979a;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.t */
final class C4610t implements C3979a {

    /* renamed from: a */
    private Status f13853a;

    /* renamed from: b */
    private ProxyResponse f13854b;

    public C4610t(ProxyResponse proxyResponse) {
        this.f13854b = proxyResponse;
        this.f13853a = Status.f12780P;
    }

    /* renamed from: J */
    public final ProxyResponse mo17437J() {
        return this.f13854b;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f13853a;
    }

    public C4610t(Status status) {
        this.f13853a = status;
    }
}
