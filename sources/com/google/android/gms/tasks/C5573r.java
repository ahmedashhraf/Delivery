package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.r */
final class C5573r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15889a;

    /* renamed from: b */
    private final /* synthetic */ C5572q f15890b;

    C5573r(C5572q qVar, C5560k kVar) {
        this.f15890b = qVar;
        this.f15889a = kVar;
    }

    public final void run() {
        if (this.f15889a.mo22011c()) {
            this.f15890b.f15888c.mo22014f();
            return;
        }
        try {
            this.f15890b.f15888c.mo22005a(this.f15890b.f15887b.mo17952a(this.f15889a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15890b.f15888c.mo22004a((Exception) e.getCause());
            } else {
                this.f15890b.f15888c.mo22004a((Exception) e);
            }
        } catch (Exception e2) {
            this.f15890b.f15888c.mo22004a(e2);
        }
    }
}
