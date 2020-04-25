package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.common.util.concurrent.m0 */
/* compiled from: SerializingExecutor */
final class C8544m0 implements Executor {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final Logger f22504Q = Logger.getLogger(C8544m0.class.getName());
    /* access modifiers changed from: private */
    @C5966a("internalLock")

    /* renamed from: N */
    public boolean f22505N = false;

    /* renamed from: O */
    private final C8546b f22506O = new C8546b(this, null);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final Object f22507P = new C8545a();

    /* renamed from: a */
    private final Executor f22508a;
    /* access modifiers changed from: private */
    @C5966a("internalLock")

    /* renamed from: b */
    public final Queue<Runnable> f22509b = new LinkedList();

    /* renamed from: com.google.common.util.concurrent.m0$a */
    /* compiled from: SerializingExecutor */
    class C8545a {
        C8545a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SerializingExecutor lock: ");
            sb.append(super.toString());
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.m0$b */
    /* compiled from: SerializingExecutor */
    private class C8546b implements Runnable {
        private C8546b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r3.run();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
            L_0x0000:
                r0 = 0
                r1 = 1
                com.google.common.util.concurrent.m0 r2 = com.google.common.util.concurrent.C8544m0.this     // Catch:{ all -> 0x004f }
                boolean r2 = r2.f22505N     // Catch:{ all -> 0x004f }
                com.google.common.base.C7397x.m35676b(r2)     // Catch:{ all -> 0x004f }
                com.google.common.util.concurrent.m0 r2 = com.google.common.util.concurrent.C8544m0.this     // Catch:{ all -> 0x004f }
                java.lang.Object r2 = r2.f22507P     // Catch:{ all -> 0x004f }
                monitor-enter(r2)     // Catch:{ all -> 0x004f }
                com.google.common.util.concurrent.m0 r3 = com.google.common.util.concurrent.C8544m0.this     // Catch:{ all -> 0x004c }
                java.util.Queue r3 = r3.f22509b     // Catch:{ all -> 0x004c }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x004c }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x004c }
                if (r3 != 0) goto L_0x002b
                com.google.common.util.concurrent.m0 r3 = com.google.common.util.concurrent.C8544m0.this     // Catch:{ all -> 0x004c }
                r3.f22505N = r0     // Catch:{ all -> 0x004c }
                monitor-exit(r2)     // Catch:{ all -> 0x0027 }
                return
            L_0x0027:
                r1 = move-exception
                r3 = r1
                r1 = 0
                goto L_0x004d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x004c }
                r3.run()     // Catch:{ RuntimeException -> 0x0030 }
                goto L_0x0000
            L_0x0030:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.C8544m0.f22504Q     // Catch:{ all -> 0x004f }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x004f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
                r6.<init>()     // Catch:{ all -> 0x004f }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x004f }
                r6.append(r3)     // Catch:{ all -> 0x004f }
                java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x004f }
                r4.log(r5, r3, r2)     // Catch:{ all -> 0x004f }
                goto L_0x0000
            L_0x004c:
                r3 = move-exception
            L_0x004d:
                monitor-exit(r2)     // Catch:{ all -> 0x004c }
                throw r3     // Catch:{ all -> 0x004f }
            L_0x004f:
                r2 = move-exception
                if (r1 == 0) goto L_0x0063
                com.google.common.util.concurrent.m0 r1 = com.google.common.util.concurrent.C8544m0.this
                java.lang.Object r1 = r1.f22507P
                monitor-enter(r1)
                com.google.common.util.concurrent.m0 r3 = com.google.common.util.concurrent.C8544m0.this     // Catch:{ all -> 0x0060 }
                r3.f22505N = r0     // Catch:{ all -> 0x0060 }
                monitor-exit(r1)     // Catch:{ all -> 0x0060 }
                goto L_0x0063
            L_0x0060:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0060 }
                throw r0
            L_0x0063:
                goto L_0x0065
            L_0x0064:
                throw r2
            L_0x0065:
                goto L_0x0064
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8544m0.C8546b.run():void");
        }

        /* synthetic */ C8546b(C8544m0 m0Var, C8545a aVar) {
            this();
        }
    }

    public C8544m0(Executor executor) {
        C7397x.m35665a(executor, (Object) "'executor' must not be null.");
        this.f22508a = executor;
    }

    public void execute(Runnable runnable) {
        boolean z;
        C7397x.m35665a(runnable, (Object) "'r' must not be null.");
        synchronized (this.f22507P) {
            this.f22509b.add(runnable);
            z = true;
            if (!this.f22505N) {
                this.f22505N = true;
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                this.f22508a.execute(this.f22506O);
            } catch (Throwable th) {
                synchronized (this.f22507P) {
                    this.f22505N = false;
                    throw th;
                }
            }
        }
    }
}
