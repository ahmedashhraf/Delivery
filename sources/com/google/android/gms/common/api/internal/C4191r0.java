package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4191r0 extends C4134h1 {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f13127b;

    /* renamed from: c */
    private final /* synthetic */ C4176o0 f13128c;

    C4191r0(C4176o0 o0Var, C4124f1 f1Var, ConnectionResult connectionResult) {
        this.f13128c = o0Var;
        this.f13127b = connectionResult;
        super(f1Var);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17840a() {
        this.f13128c.f13084N.m18070b(this.f13127b);
    }
}
