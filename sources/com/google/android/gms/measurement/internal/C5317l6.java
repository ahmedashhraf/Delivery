package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5317l6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15284a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15285b;

    C5317l6(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f15285b = w5Var;
        this.f15284a = atomicReference;
    }

    public final void run() {
        synchronized (this.f15284a) {
            try {
                this.f15284a.set(Long.valueOf(this.f15285b.mo21214m().mo21633a(this.f15285b.mo21229p().mo21410A(), C5310l.f15216Q)));
                this.f15284a.notify();
            } catch (Throwable th) {
                this.f15284a.notify();
                throw th;
            }
        }
    }
}
