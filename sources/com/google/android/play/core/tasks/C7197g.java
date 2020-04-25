package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.g */
final class C7197g<ResultT> implements C7204n<ResultT> {

    /* renamed from: a */
    private final Executor f20329a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f20330b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7188a<ResultT> f20331c;

    public C7197g(Executor executor, C7188a<ResultT> aVar) {
        this.f20329a = executor;
        this.f20331c = aVar;
    }

    /* renamed from: a */
    public final void mo28626a(C7191d<ResultT> dVar) {
        synchronized (this.f20330b) {
            if (this.f20331c != null) {
                this.f20329a.execute(new C7198h(this, dVar));
            }
        }
    }
}
