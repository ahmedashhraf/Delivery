package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.w */
final class C5578w<TResult> implements C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15900a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15901b = new Object();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: c */
    public C5547e<TResult> f15902c;

    public C5578w(@C0193h0 Executor executor, @C0193h0 C5547e<TResult> eVar) {
        this.f15900a = executor;
        this.f15902c = eVar;
    }

    /* renamed from: a */
    public final void mo21973a(@C0193h0 C5560k<TResult> kVar) {
        synchronized (this.f15901b) {
            if (this.f15902c != null) {
                this.f15900a.execute(new C5579x(this, kVar));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f15901b) {
            this.f15902c = null;
        }
    }
}
