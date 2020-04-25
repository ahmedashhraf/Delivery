package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.tasks.d0 */
final class C5546d0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5560k f15854a;

    /* renamed from: b */
    private final /* synthetic */ C5544c0 f15855b;

    C5546d0(C5544c0 c0Var, C5560k kVar) {
        this.f15855b = c0Var;
        this.f15854a = kVar;
    }

    public final void run() {
        try {
            C5560k a = this.f15855b.f15852b.mo18453a(this.f15854a.mo22008b());
            if (a == null) {
                this.f15855b.mo21979a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo22000a(C5564m.f15873b, (C5551g<? super TResult>) this.f15855b);
            a.mo21999a(C5564m.f15873b, (C5549f) this.f15855b);
            a.mo21997a(C5564m.f15873b, (C5545d) this.f15855b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15855b.mo21979a((Exception) e.getCause());
            } else {
                this.f15855b.mo21979a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f15855b.mo21978a();
        } catch (Exception e2) {
            this.f15855b.mo21979a(e2);
        }
    }
}
