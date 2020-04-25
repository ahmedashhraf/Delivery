package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.l */
final class C7202l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C7191d f20342a;

    /* renamed from: b */
    private final /* synthetic */ C7201k f20343b;

    C7202l(C7201k kVar, C7191d dVar) {
        this.f20343b = kVar;
        this.f20342a = dVar;
    }

    public final void run() {
        synchronized (this.f20343b.f20340b) {
            if (this.f20343b.f20341c != null) {
                this.f20343b.f20341c.onSuccess(this.f20342a.mo28620b());
            }
        }
    }
}
