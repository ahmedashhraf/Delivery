package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5383r6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f15431a;

    /* renamed from: b */
    private final /* synthetic */ C5437w5 f15432b;

    C5383r6(C5437w5 w5Var, long j) {
        this.f15432b = w5Var;
        this.f15431a = j;
    }

    public final void run() {
        this.f15432b.mo21213l().f15582q.mo21826a(this.f15431a);
        this.f15432b.mo21205d().mo21527A().mo21550a("Session timeout duration set", Long.valueOf(this.f15431a));
    }
}
