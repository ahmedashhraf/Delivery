package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5218c6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f14930a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f14931b;

    C5218c6(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f14931b = w5Var;
        this.f14930a = atomicReference;
    }

    public final void run() {
        this.f14931b.mo21230q().mo21352a(this.f14930a);
    }
}
