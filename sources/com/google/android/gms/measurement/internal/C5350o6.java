package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5350o6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15358a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15359b;

    C5350o6(C5437w5 w5Var, AtomicReference atomicReference) {
        this.f15359b = w5Var;
        this.f15358a = atomicReference;
    }

    public final void run() {
        synchronized (this.f15358a) {
            try {
                this.f15358a.set(Integer.valueOf(this.f15359b.mo21214m().mo21636b(this.f15359b.mo21229p().mo21410A(), C5310l.f15218R)));
                this.f15358a.notify();
            } catch (Throwable th) {
                this.f15358a.notify();
                throw th;
            }
        }
    }
}
