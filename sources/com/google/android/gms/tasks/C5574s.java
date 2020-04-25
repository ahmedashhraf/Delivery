package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.s */
final class C5574s<TResult, TContinuationResult> implements C5545d, C5549f, C5551g<TContinuationResult>, C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15891a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5543c<TResult, C5560k<TContinuationResult>> f15892b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5556i0<TContinuationResult> f15893c;

    public C5574s(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, C5560k<TContinuationResult>> cVar, @C0193h0 C5556i0<TContinuationResult> i0Var) {
        this.f15891a = executor;
        this.f15892b = cVar;
        this.f15893c = i0Var;
    }

    /* renamed from: a */
    public final void mo21973a(@C0193h0 C5560k<TResult> kVar) {
        this.f15891a.execute(new C5575t(this, kVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f15893c.mo22005a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo21979a(@C0193h0 Exception exc) {
        this.f15893c.mo22004a(exc);
    }

    /* renamed from: a */
    public final void mo21978a() {
        this.f15893c.mo22014f();
    }
}
