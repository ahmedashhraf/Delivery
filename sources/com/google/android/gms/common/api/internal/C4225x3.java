package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.x3 */
final class C4225x3 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C4220w3 f13181N;

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f13182a;

    /* renamed from: b */
    private final /* synthetic */ String f13183b;

    C4225x3(C4220w3 w3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f13181N = w3Var;
        this.f13182a = lifecycleCallback;
        this.f13183b = str;
    }

    public final void run() {
        if (this.f13181N.f13177b > 0) {
            this.f13182a.mo17759a(this.f13181N.f13175N != null ? this.f13181N.f13175N.getBundle(this.f13183b) : null);
        }
        if (this.f13181N.f13177b >= 2) {
            this.f13182a.mo17764d();
        }
        if (this.f13181N.f13177b >= 3) {
            this.f13182a.mo17763c();
        }
        if (this.f13181N.f13177b >= 4) {
            this.f13182a.mo17765e();
        }
        if (this.f13181N.f13177b >= 5) {
            this.f13182a.mo17761b();
        }
    }
}
