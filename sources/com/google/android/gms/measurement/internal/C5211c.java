package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5211c implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5349o5 f14918a;

    /* renamed from: b */
    private final /* synthetic */ C5222d f14919b;

    C5211c(C5222d dVar, C5349o5 o5Var) {
        this.f14919b = dVar;
        this.f14918a = o5Var;
    }

    public final void run() {
        this.f14918a.mo21189B();
        if (C5342n9.m23293a()) {
            this.f14918a.mo21203c().mo21555a((Runnable) this);
            return;
        }
        boolean b = this.f14919b.mo21223b();
        this.f14919b.f14936c = 0;
        if (b) {
            this.f14919b.mo21221a();
        }
    }
}
