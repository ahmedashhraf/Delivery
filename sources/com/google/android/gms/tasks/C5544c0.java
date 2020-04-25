package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.c0 */
final class C5544c0<TResult, TContinuationResult> implements C5545d, C5549f, C5551g<TContinuationResult>, C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15851a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5558j<TResult, TContinuationResult> f15852b;

    /* renamed from: c */
    private final C5556i0<TContinuationResult> f15853c;

    public C5544c0(@C0193h0 Executor executor, @C0193h0 C5558j<TResult, TContinuationResult> jVar, @C0193h0 C5556i0<TContinuationResult> i0Var) {
        this.f15851a = executor;
        this.f15852b = jVar;
        this.f15853c = i0Var;
    }

    /* renamed from: a */
    public final void mo21973a(@C0193h0 C5560k<TResult> kVar) {
        this.f15851a.execute(new C5546d0(this, kVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f15853c.mo22005a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo21979a(@C0193h0 Exception exc) {
        this.f15853c.mo22004a(exc);
    }

    /* renamed from: a */
    public final void mo21978a() {
        this.f15853c.mo22014f();
    }
}
