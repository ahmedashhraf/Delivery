package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C3978b.C3980b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import p201f.p202a.C5950g;
import p201f.p202a.C5952h;

/* renamed from: com.google.android.gms.internal.auth.u */
public final class C4612u implements C3980b {

    /* renamed from: a */
    private Status f13855a;

    /* renamed from: b */
    private String f13856b;

    public C4612u(@C5950g String str) {
        this.f13856b = (String) C4300a0.m18620a(str);
        this.f13855a = Status.f12780P;
    }

    @C5952h
    /* renamed from: H */
    public final String mo17438H() {
        return this.f13856b;
    }

    @C5952h
    /* renamed from: f */
    public final Status mo17504f() {
        return this.f13855a;
    }

    public C4612u(@C5950g Status status) {
        this.f13855a = (Status) C4300a0.m18620a(status);
    }
}
