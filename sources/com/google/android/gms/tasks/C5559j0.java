package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.j0 */
final class C5559j0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5556i0 f15867a;

    /* renamed from: b */
    private final /* synthetic */ Callable f15868b;

    C5559j0(C5556i0 i0Var, Callable callable) {
        this.f15867a = i0Var;
        this.f15868b = callable;
    }

    public final void run() {
        try {
            this.f15867a.mo22005a(this.f15868b.call());
        } catch (Exception e) {
            this.f15867a.mo22004a(e);
        }
    }
}
