package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.y */
final class C5580y<TResult> implements C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15905a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15906b = new Object();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: c */
    public C5549f f15907c;

    public C5580y(@C0193h0 Executor executor, @C0193h0 C5549f fVar) {
        this.f15905a = executor;
        this.f15907c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f15905a.execute(new com.google.android.gms.tasks.C5581z(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21973a(@androidx.annotation.C0193h0 com.google.android.gms.tasks.C5560k<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo22013e()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo22011c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f15906b
            monitor-enter(r0)
            com.google.android.gms.tasks.f r1 = r2.f15907c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f15905a
            com.google.android.gms.tasks.z r1 = new com.google.android.gms.tasks.z
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C5580y.mo21973a(com.google.android.gms.tasks.k):void");
    }

    public final void cancel() {
        synchronized (this.f15906b) {
            this.f15907c = null;
        }
    }
}
