package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.k */
final class C7201k<ResultT> implements C7204n<ResultT> {

    /* renamed from: a */
    private final Executor f20339a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f20340b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7190c<? super ResultT> f20341c;

    public C7201k(Executor executor, C7190c<? super ResultT> cVar) {
        this.f20339a = executor;
        this.f20341c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f20339a.execute(new com.google.android.play.core.tasks.C7202l(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28626a(com.google.android.play.core.tasks.C7191d<ResultT> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo28622d()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f20340b
            monitor-enter(r0)
            com.google.android.play.core.tasks.c<? super ResultT> r1 = r2.f20341c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f20339a
            com.google.android.play.core.tasks.l r1 = new com.google.android.play.core.tasks.l
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.tasks.C7201k.mo28626a(com.google.android.play.core.tasks.d):void");
    }
}
