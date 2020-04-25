package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.t */
final class C5575t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15894a;

    /* renamed from: b */
    private final /* synthetic */ C5574s f15895b;

    C5575t(C5574s sVar, C5560k kVar) {
        this.f15895b = sVar;
        this.f15894a = kVar;
    }

    public final void run() {
        try {
            C5560k kVar = (C5560k) this.f15895b.f15892b.mo17952a(this.f15894a);
            if (kVar == null) {
                this.f15895b.mo21979a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            kVar.mo22000a(C5564m.f15873b, (C5551g<? super TResult>) this.f15895b);
            kVar.mo21999a(C5564m.f15873b, (C5549f) this.f15895b);
            kVar.mo21997a(C5564m.f15873b, (C5545d) this.f15895b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15895b.f15893c.mo22004a((Exception) e.getCause());
            } else {
                this.f15895b.f15893c.mo22004a((Exception) e);
            }
        } catch (Exception e2) {
            this.f15895b.f15893c.mo22004a(e2);
        }
    }
}
