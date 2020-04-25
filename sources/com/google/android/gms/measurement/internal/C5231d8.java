package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5231d8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5204b3 f14958a;

    /* renamed from: b */
    private final /* synthetic */ C5460y7 f14959b;

    C5231d8(C5460y7 y7Var, C5204b3 b3Var) {
        this.f14959b = y7Var;
        this.f14958a = b3Var;
    }

    public final void run() {
        synchronized (this.f14959b) {
            this.f14959b.f15628a = false;
            if (!this.f14959b.f15630c.mo21335A()) {
                this.f14959b.f15630c.mo21205d().mo21527A().mo21549a("Connected to remote service");
                this.f14959b.f15630c.mo21346a(this.f14958a);
            }
        }
    }
}
