package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5295j6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15151a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15152b;

    C5295j6(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f15152b = w5Var;
        this.f15151a = atomicReference;
    }

    public final void run() {
        synchronized (this.f15151a) {
            try {
                this.f15151a.set(this.f15152b.mo21214m().mo21646h(this.f15152b.mo21229p().mo21410A()));
                this.f15151a.notify();
            } catch (Throwable th) {
                this.f15151a.notify();
                throw th;
            }
        }
    }
}
