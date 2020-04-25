package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5394s6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f15455a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15456b;

    C5394s6(C5437w5 w5Var, long j) {
        this.f15456b = w5Var;
        this.f15455a = j;
    }

    public final void run() {
        this.f15456b.mo21213l().f15581p.mo21826a(this.f15455a);
        this.f15456b.mo21205d().mo21527A().mo21550a("Minimum session duration set", Long.valueOf(this.f15455a));
    }
}
