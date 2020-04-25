package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.z */
final class C5581z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15908a;

    /* renamed from: b */
    private final /* synthetic */ C5580y f15909b;

    C5581z(C5580y yVar, C5560k kVar) {
        this.f15909b = yVar;
        this.f15908a = kVar;
    }

    public final void run() {
        synchronized (this.f15909b.f15906b) {
            if (this.f15909b.f15907c != null) {
                this.f15909b.f15907c.mo21979a(this.f15908a.mo22002a());
            }
        }
    }
}
