package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import com.google.common.collect.C8309z3;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.common.util.concurrent.f0 */
/* compiled from: ListenerCallQueue */
final class C8497f0<L> implements Runnable {

    /* renamed from: P */
    private static final Logger f22425P = Logger.getLogger(C8497f0.class.getName());
    @C5966a("this")

    /* renamed from: N */
    private final Queue<C8498a<L>> f22426N = C8309z3.m39670c();
    @C5966a("this")

    /* renamed from: O */
    private boolean f22427O;

    /* renamed from: a */
    private final L f22428a;

    /* renamed from: b */
    private final Executor f22429b;

    /* renamed from: com.google.common.util.concurrent.f0$a */
    /* compiled from: ListenerCallQueue */
    static abstract class C8498a<L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f22430a;

        C8498a(String str) {
            this.f22430a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo31707a(L l);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31706a(Iterable<C8497f0<L>> iterable) {
            for (C8497f0 a : iterable) {
                a.mo31704a(this);
            }
        }
    }

    C8497f0(L l, Executor executor) {
        this.f22428a = C7397x.m35664a(l);
        this.f22429b = (Executor) C7397x.m35664a(executor);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo31704a(C8498a<L> aVar) {
        this.f22426N.add(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.mo31707a(r8.f22428a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
        L_0x0000:
            r0 = 0
            r1 = 1
            monitor-enter(r8)     // Catch:{ all -> 0x004c }
            boolean r2 = r8.f22427O     // Catch:{ all -> 0x0049 }
            com.google.common.base.C7397x.m35676b(r2)     // Catch:{ all -> 0x0049 }
            java.util.Queue<com.google.common.util.concurrent.f0$a<L>> r2 = r8.f22426N     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0049 }
            com.google.common.util.concurrent.f0$a r2 = (com.google.common.util.concurrent.C8497f0.C8498a) r2     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x001a
            r8.f22427O = r0     // Catch:{ all -> 0x0049 }
            monitor-exit(r8)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            r2 = r1
            r1 = 0
            goto L_0x004a
        L_0x001a:
            monitor-exit(r8)     // Catch:{ all -> 0x0049 }
            L r3 = r8.f22428a     // Catch:{ RuntimeException -> 0x0021 }
            r2.mo31707a(r3)     // Catch:{ RuntimeException -> 0x0021 }
            goto L_0x0000
        L_0x0021:
            r3 = move-exception
            java.util.logging.Logger r4 = f22425P     // Catch:{ all -> 0x004c }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r6.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "Exception while executing callback: "
            r6.append(r7)     // Catch:{ all -> 0x004c }
            L r7 = r8.f22428a     // Catch:{ all -> 0x004c }
            r6.append(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "."
            r6.append(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = r2.f22430a     // Catch:{ all -> 0x004c }
            r6.append(r2)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x004c }
            r4.log(r5, r2, r3)     // Catch:{ all -> 0x004c }
            goto L_0x0000
        L_0x0049:
            r2 = move-exception
        L_0x004a:
            monitor-exit(r8)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            if (r1 == 0) goto L_0x0057
            monitor-enter(r8)
            r8.f22427O = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0057:
            goto L_0x0059
        L_0x0058:
            throw r2
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8497f0.run():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31703a() {
        boolean z;
        synchronized (this) {
            z = true;
            if (!this.f22427O) {
                this.f22427O = true;
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                this.f22429b.execute(this);
            } catch (RuntimeException e) {
                synchronized (this) {
                    this.f22427O = false;
                    Logger logger = f22425P;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception while running callbacks for ");
                    sb.append(this.f22428a);
                    sb.append(" on ");
                    sb.append(this.f22429b);
                    logger.log(level, sb.toString(), e);
                    throw e;
                }
            }
        }
    }
}
