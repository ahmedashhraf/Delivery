package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5209b8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5204b3 f14914a;

    /* renamed from: b */
    private final /* synthetic */ C5460y7 f14915b;

    C5209b8(C5460y7 y7Var, C5204b3 b3Var) {
        this.f14915b = y7Var;
        this.f14914a = b3Var;
    }

    public final void run() {
        synchronized (this.f14915b) {
            this.f14915b.f15628a = false;
            if (!this.f14915b.f15630c.mo21335A()) {
                this.f14915b.f15630c.mo21205d().mo21528C().mo21549a("Connected to service");
                this.f14915b.f15630c.mo21346a(this.f14914a);
            }
        }
    }
}
