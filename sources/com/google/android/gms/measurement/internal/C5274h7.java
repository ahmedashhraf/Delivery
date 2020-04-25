package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5274h7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5208b7 f15101a;

    /* renamed from: b */
    private final /* synthetic */ C5241e7 f15102b;

    C5274h7(C5241e7 e7Var, C5208b7 b7Var) {
        this.f15102b = e7Var;
        this.f15101a = b7Var;
    }

    public final void run() {
        this.f15102b.m22694a(this.f15101a, false);
        C5241e7 e7Var = this.f15102b;
        e7Var.f15005c = null;
        e7Var.mo21230q().mo21348a((C5208b7) null);
    }
}
