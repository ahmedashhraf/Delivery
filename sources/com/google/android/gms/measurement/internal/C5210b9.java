package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5210b9 implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzm f14916a;

    /* renamed from: b */
    private final /* synthetic */ C5461y8 f14917b;

    C5210b9(C5461y8 y8Var, zzm zzm) {
        this.f14917b = y8Var;
        this.f14916a = zzm;
    }

    public final /* synthetic */ Object call() throws Exception {
        C5239e5 a = this.f14917b.m23787e(this.f14916a);
        if (a != null) {
            return a.mo21280j();
        }
        this.f14917b.mo21205d().mo21536w().mo21549a("App info was null when attempting to get app instance id");
        return null;
    }
}
