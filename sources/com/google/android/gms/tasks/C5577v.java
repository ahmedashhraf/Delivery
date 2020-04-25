package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.v */
final class C5577v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576u f15899a;

    C5577v(C5576u uVar) {
        this.f15899a = uVar;
    }

    public final void run() {
        synchronized (this.f15899a.f15897b) {
            if (this.f15899a.f15898c != null) {
                this.f15899a.f15898c.mo21978a();
            }
        }
    }
}
