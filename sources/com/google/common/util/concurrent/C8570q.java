package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.common.util.concurrent.q */
/* compiled from: ExecutionList */
public final class C8570q {
    @C2778d

    /* renamed from: c */
    static final Logger f22549c = Logger.getLogger(C8570q.class.getName());
    @C5966a("this")

    /* renamed from: a */
    private C8571a f22550a;
    @C5966a("this")

    /* renamed from: b */
    private boolean f22551b;

    /* renamed from: com.google.common.util.concurrent.q$a */
    /* compiled from: ExecutionList */
    private static final class C8571a {

        /* renamed from: a */
        final Runnable f22552a;

        /* renamed from: b */
        final Executor f22553b;
        @C5952h

        /* renamed from: c */
        C8571a f22554c;

        C8571a(Runnable runnable, Executor executor, C8571a aVar) {
            this.f22552a = runnable;
            this.f22553b = executor;
            this.f22554c = aVar;
        }
    }

    /* renamed from: b */
    private static void m40431b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f22549c;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo31888a(Runnable runnable, Executor executor) {
        C7397x.m35665a(runnable, (Object) "Runnable was null.");
        C7397x.m35665a(executor, (Object) "Executor was null.");
        synchronized (this) {
            if (!this.f22551b) {
                this.f22550a = new C8571a(runnable, executor, this.f22550a);
            } else {
                m40431b(runnable, executor);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r2 = r1.f22554c;
        r1.f22554c = r0;
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        m40431b(r0.f22552a, r0.f22553b);
        r0 = r0.f22554c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31887a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f22551b     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            r0 = 1
            r4.f22551b = r0     // Catch:{ all -> 0x0029 }
            com.google.common.util.concurrent.q$a r0 = r4.f22550a     // Catch:{ all -> 0x0029 }
            r1 = 0
            r4.f22550a = r1     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            com.google.common.util.concurrent.q$a r2 = r1.f22554c
            r1.f22554c = r0
            r0 = r1
            r1 = r2
            goto L_0x0013
        L_0x001c:
            if (r0 == 0) goto L_0x0028
            java.lang.Runnable r1 = r0.f22552a
            java.util.concurrent.Executor r2 = r0.f22553b
            m40431b(r1, r2)
            com.google.common.util.concurrent.q$a r0 = r0.f22554c
            goto L_0x001c
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x002c:
            throw r0
        L_0x002d:
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8570q.mo31887a():void");
    }
}
