package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5361p6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15404a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15405b;

    C5361p6(C5437w5 w5Var, boolean z) {
        this.f15405b = w5Var;
        this.f15404a = z;
    }

    public final void run() {
        boolean f = this.f15405b.f15309a.mo21593f();
        boolean b = this.f15405b.f15309a.mo21592b();
        this.f15405b.f15309a.mo21591a(this.f15404a);
        if (b == this.f15404a) {
            this.f15405b.f15309a.mo21205d().mo21528C().mo21550a("Default data collection state already set to", Boolean.valueOf(this.f15404a));
        }
        if (this.f15405b.f15309a.mo21593f() == f || this.f15405b.f15309a.mo21593f() != this.f15405b.f15309a.mo21592b()) {
            this.f15405b.f15309a.mo21205d().mo21538y().mo21551a("Default data collection is different than actual status", Boolean.valueOf(this.f15404a), Boolean.valueOf(f));
        }
        this.f15405b.m23620M();
    }
}
