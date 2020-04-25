package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.v3 */
final class C4215v3 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C4210u3 f13166N;

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f13167a;

    /* renamed from: b */
    private final /* synthetic */ String f13168b;

    C4215v3(C4210u3 u3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f13166N = u3Var;
        this.f13167a = lifecycleCallback;
        this.f13168b = str;
    }

    public final void run() {
        if (this.f13166N.f13163b > 0) {
            this.f13167a.mo17759a(this.f13166N.f13161N != null ? this.f13166N.f13161N.getBundle(this.f13168b) : null);
        }
        if (this.f13166N.f13163b >= 2) {
            this.f13167a.mo17764d();
        }
        if (this.f13166N.f13163b >= 3) {
            this.f13167a.mo17763c();
        }
        if (this.f13166N.f13163b >= 4) {
            this.f13167a.mo17765e();
        }
        if (this.f13166N.f13163b >= 5) {
            this.f13167a.mo17761b();
        }
    }
}
