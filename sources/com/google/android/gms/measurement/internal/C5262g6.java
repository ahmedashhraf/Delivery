package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5262g6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f15063a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15064b;

    C5262g6(C5437w5 w5Var, long j) {
        this.f15064b = w5Var;
        this.f15063a = j;
    }

    public final void run() {
        C5437w5 w5Var = this.f15064b;
        long j = this.f15063a;
        w5Var.mo21209h();
        w5Var.mo21201b();
        w5Var.mo21180w();
        w5Var.mo21205d().mo21527A().mo21549a("Resetting analytics data (FE)");
        w5Var.mo21233t().mo21561A();
        if (w5Var.mo21214m().mo21647i(w5Var.mo21229p().mo21410A())) {
            w5Var.mo21213l().f15575j.mo21826a(j);
        }
        boolean f = w5Var.f15309a.mo21593f();
        if (!w5Var.mo21214m().mo21656p()) {
            w5Var.mo21213l().mo21812d(!f);
        }
        w5Var.mo21230q().mo21337D();
        w5Var.f15553h = !f;
        this.f15064b.mo21230q().mo21352a(new AtomicReference<>());
    }
}
