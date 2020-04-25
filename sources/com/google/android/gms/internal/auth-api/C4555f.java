package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.C3952a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.f */
public final class C4555f implements C3952a {

    /* renamed from: a */
    private final Status f13826a;

    /* renamed from: b */
    private final Credential f13827b;

    public C4555f(Status status, Credential credential) {
        this.f13826a = status;
        this.f13827b = credential;
    }

    /* renamed from: a */
    public static C4555f m19592a(Status status) {
        return new C4555f(status, null);
    }

    /* renamed from: I */
    public final Credential mo17402I() {
        return this.f13827b;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f13826a;
    }
}
