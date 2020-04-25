package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.u */
final class C5576u<TResult> implements C5548e0<TResult> {

    /* renamed from: a */
    private final Executor f15896a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15897b = new Object();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: c */
    public C5545d f15898c;

    public C5576u(@C0193h0 Executor executor, @C0193h0 C5545d dVar) {
        this.f15896a = executor;
        this.f15898c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f15896a.execute(new com.google.android.gms.tasks.C5577v(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21973a(@androidx.annotation.C0193h0 com.google.android.gms.tasks.C5560k r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo22011c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f15897b
            monitor-enter(r2)
            com.google.android.gms.tasks.d r0 = r1.f15898c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f15896a
            com.google.android.gms.tasks.v r0 = new com.google.android.gms.tasks.v
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C5576u.mo21973a(com.google.android.gms.tasks.k):void");
    }

    public final void cancel() {
        synchronized (this.f15897b) {
            this.f15898c = null;
        }
    }
}
