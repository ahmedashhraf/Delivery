package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.a0 */
final class C5540a0<TResult> implements C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15845a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15846b = new Object();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: c */
    public C5551g<? super TResult> f15847c;

    public C5540a0(@C0193h0 Executor executor, @C0193h0 C5551g<? super TResult> gVar) {
        this.f15845a = executor;
        this.f15847c = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f15845a.execute(new com.google.android.gms.tasks.C5542b0(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21973a(@androidx.annotation.C0193h0 com.google.android.gms.tasks.C5560k<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo22013e()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f15846b
            monitor-enter(r0)
            com.google.android.gms.tasks.g<? super TResult> r1 = r2.f15847c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f15845a
            com.google.android.gms.tasks.b0 r1 = new com.google.android.gms.tasks.b0
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C5540a0.mo21973a(com.google.android.gms.tasks.k):void");
    }

    public final void cancel() {
        synchronized (this.f15846b) {
            this.f15847c = null;
        }
    }
}
