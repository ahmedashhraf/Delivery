package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.q */
final class C5572q<TResult, TContinuationResult> implements C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15886a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5543c<TResult, TContinuationResult> f15887b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5556i0<TContinuationResult> f15888c;

    public C5572q(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, TContinuationResult> cVar, @C0193h0 C5556i0<TContinuationResult> i0Var) {
        this.f15886a = executor;
        this.f15887b = cVar;
        this.f15888c = i0Var;
    }

    /* renamed from: a */
    public final void mo21973a(@C0193h0 C5560k<TResult> kVar) {
        this.f15886a.execute(new C5573r(this, kVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
