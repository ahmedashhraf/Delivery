package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.b0 */
final class C5542b0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15849a;

    /* renamed from: b */
    private final /* synthetic */ C5540a0 f15850b;

    C5542b0(C5540a0 a0Var, C5560k kVar) {
        this.f15850b = a0Var;
        this.f15849a = kVar;
    }

    public final void run() {
        synchronized (this.f15850b.f15846b) {
            if (this.f15850b.f15847c != null) {
                this.f15850b.f15847c.onSuccess(this.f15849a.mo22008b());
            }
        }
    }
}
