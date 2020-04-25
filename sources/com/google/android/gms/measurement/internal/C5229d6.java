package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5229d6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5437w5 f14951N;

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f14952a;

    /* renamed from: b */
    private final /* synthetic */ boolean f14953b;

    C5229d6(C5437w5 w5Var, AtomicReference atomicReference, boolean z) {
        this.f14951N = w5Var;
        this.f14952a = atomicReference;
        this.f14953b = z;
    }

    public final void run() {
        this.f14951N.mo21230q().mo21355a(this.f14952a, this.f14953b);
    }
}
