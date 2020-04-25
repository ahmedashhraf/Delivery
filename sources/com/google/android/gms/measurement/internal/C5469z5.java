package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final /* synthetic */ class C5469z5 implements Runnable {

    /* renamed from: a */
    private final C5437w5 f15675a;

    C5469z5(C5437w5 w5Var) {
        this.f15675a = w5Var;
    }

    public final void run() {
        C5437w5 w5Var = this.f15675a;
        w5Var.mo21209h();
        if (w5Var.mo21213l().f15591z.mo21870a()) {
            w5Var.mo21205d().mo21527A().mo21549a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = w5Var.mo21213l().f15567A.mo21825a();
        w5Var.mo21213l().f15567A.mo21826a(1 + a);
        if (a >= 5) {
            w5Var.mo21205d().mo21536w().mo21549a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            w5Var.mo21213l().f15591z.mo21869a(true);
            return;
        }
        w5Var.f15309a.mo21599m();
    }
}
