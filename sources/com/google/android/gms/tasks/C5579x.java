package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.x */
final class C5579x implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15903a;

    /* renamed from: b */
    private final /* synthetic */ C5578w f15904b;

    C5579x(C5578w wVar, C5560k kVar) {
        this.f15904b = wVar;
        this.f15903a = kVar;
    }

    public final void run() {
        synchronized (this.f15904b.f15901b) {
            if (this.f15904b.f15902c != null) {
                this.f15904b.f15902c.mo17805a(this.f15903a);
            }
        }
    }
}
