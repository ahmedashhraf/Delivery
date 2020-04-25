package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5339n6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15344a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15345b;

    C5339n6(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f15345b = w5Var;
        this.f15344a = atomicReference;
    }

    public final void run() {
        synchronized (this.f15344a) {
            try {
                this.f15344a.set(Double.valueOf(this.f15345b.mo21214m().mo21638c(this.f15345b.mo21229p().mo21410A(), C5310l.f15219S)));
                this.f15344a.notify();
            } catch (Throwable th) {
                this.f15344a.notify();
                throw th;
            }
        }
    }
}
