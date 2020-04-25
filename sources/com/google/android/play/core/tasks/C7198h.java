package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.h */
final class C7198h implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C7191d f20332a;

    /* renamed from: b */
    private final /* synthetic */ C7197g f20333b;

    C7198h(C7197g gVar, C7191d dVar) {
        this.f20333b = gVar;
        this.f20332a = dVar;
    }

    public final void run() {
        synchronized (this.f20333b.f20330b) {
            if (this.f20333b.f20331c != null) {
                this.f20333b.f20331c.mo28609a(this.f20332a);
            }
        }
    }
}
