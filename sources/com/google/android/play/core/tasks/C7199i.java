package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.i */
final class C7199i implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C7191d f20334a;

    /* renamed from: b */
    private final /* synthetic */ C7200j f20335b;

    C7199i(C7200j jVar, C7191d dVar) {
        this.f20335b = jVar;
        this.f20334a = dVar;
    }

    public final void run() {
        synchronized (this.f20335b.f20337b) {
            if (this.f20335b.f20338c != null) {
                this.f20335b.f20338c.mo28610a(this.f20334a.mo28618a());
            }
        }
    }
}
