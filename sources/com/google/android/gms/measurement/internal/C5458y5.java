package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5458y5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15626a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15627b;

    C5458y5(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f15627b = w5Var;
        this.f15626a = atomicReference;
    }

    public final void run() {
        synchronized (this.f15626a) {
            try {
                this.f15626a.set(Boolean.valueOf(this.f15627b.mo21214m().mo21645g(this.f15627b.mo21229p().mo21410A())));
                this.f15626a.notify();
            } catch (Throwable th) {
                this.f15626a.notify();
                throw th;
            }
        }
    }
}
