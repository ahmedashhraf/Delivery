package com.google.common.util.concurrent;

import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jivesoftware.smackx.workgroup.packet.MonitorPacket;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.p203u.C5966a;

@C2775a
/* renamed from: com.google.common.util.concurrent.i0 */
/* compiled from: Monitor */
public final class C8517i0 {

    /* renamed from: a */
    private final boolean f22460a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ReentrantLock f22461b;
    @C5966a("lock")

    /* renamed from: c */
    private C8518a f22462c;

    @C2775a
    /* renamed from: com.google.common.util.concurrent.i0$a */
    /* compiled from: Monitor */
    public static abstract class C8518a {

        /* renamed from: a */
        final C8517i0 f22463a;

        /* renamed from: b */
        final Condition f22464b;
        @C5966a("monitor.lock")

        /* renamed from: c */
        int f22465c = 0;
        @C5966a("monitor.lock")

        /* renamed from: d */
        C8518a f22466d;

        protected C8518a(C8517i0 i0Var) {
            this.f22463a = (C8517i0) C7397x.m35665a(i0Var, (Object) MonitorPacket.ELEMENT_NAME);
            this.f22464b = i0Var.f22461b.newCondition();
        }

        /* renamed from: a */
        public abstract boolean mo31716a();
    }

    public C8517i0() {
        this(false);
    }

    @C5966a("lock")
    /* renamed from: k */
    private void m40222k() {
        for (C8518a aVar = this.f22462c; aVar != null; aVar = aVar.f22466d) {
            aVar.f22464b.signalAll();
        }
    }

    @C5966a("lock")
    /* renamed from: l */
    private void m40224l() {
        for (C8518a aVar = this.f22462c; aVar != null; aVar = aVar.f22466d) {
            if (m40225l(aVar)) {
                aVar.f22464b.signal();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo31734b() throws InterruptedException {
        this.f22461b.lockInterruptibly();
    }

    /* renamed from: c */
    public void mo31739c(C8518a aVar) throws InterruptedException {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lockInterruptibly();
            try {
                if (!aVar.mo31716a()) {
                    m40218a(aVar, isHeldByCurrentThread);
                }
            } catch (Throwable th) {
                mo31754i();
                throw th;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: d */
    public void mo31742d(C8518a aVar) {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lock();
            try {
                if (!aVar.mo31716a()) {
                    m40220b(aVar, isHeldByCurrentThread);
                }
            } catch (Throwable th) {
                mo31754i();
                throw th;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: e */
    public boolean mo31746e(C8518a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        if (!(aVar.f22463a == this) || !this.f22461b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        } else if (aVar.mo31716a() || m40219a(aVar, nanos, true)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31749f(com.google.common.util.concurrent.C8517i0.C8518a r6, long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r5 = this;
            long r7 = r9.toNanos(r7)
            com.google.common.util.concurrent.i0 r9 = r6.f22463a
            r0 = 0
            r1 = 1
            if (r9 != r5) goto L_0x000c
            r9 = 1
            goto L_0x000d
        L_0x000c:
            r9 = 0
        L_0x000d:
            java.util.concurrent.locks.ReentrantLock r2 = r5.f22461b
            boolean r2 = r2.isHeldByCurrentThread()
            r9 = r9 & r2
            if (r9 == 0) goto L_0x005b
            boolean r9 = r6.mo31716a()
            if (r9 == 0) goto L_0x001d
            return r1
        L_0x001d:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 + r7
            boolean r9 = java.lang.Thread.interrupted()
            r4 = r9
            r9 = 1
        L_0x0028:
            boolean r6 = r5.m40219a(r6, r7, r9)     // Catch:{ InterruptedException -> 0x0039, all -> 0x0036 }
            if (r4 == 0) goto L_0x0035
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L_0x0035:
            return r6
        L_0x0036:
            r6 = move-exception
            r1 = r4
            goto L_0x0051
        L_0x0039:
            boolean r7 = r6.mo31716a()     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x0047
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            return r1
        L_0x0047:
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0050 }
            long r7 = r2 - r7
            r9 = 0
            r4 = 1
            goto L_0x0028
        L_0x0050:
            r6 = move-exception
        L_0x0051:
            if (r1 == 0) goto L_0x005a
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L_0x005a:
            throw r6
        L_0x005b:
            java.lang.IllegalMonitorStateException r6 = new java.lang.IllegalMonitorStateException
            r6.<init>()
            goto L_0x0062
        L_0x0061:
            throw r6
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8517i0.mo31749f(com.google.common.util.concurrent.i0$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: g */
    public boolean mo31751g(C8518a aVar) {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            if (!reentrantLock.tryLock()) {
                return false;
            }
            try {
                boolean a = aVar.mo31716a();
                if (!a) {
                }
                return a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: h */
    public void mo31752h(C8518a aVar) throws InterruptedException {
        if (!(aVar.f22463a == this) || !this.f22461b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        } else if (!aVar.mo31716a()) {
            m40218a(aVar, true);
        }
    }

    /* renamed from: i */
    public void mo31755i(C8518a aVar) {
        if (!(aVar.f22463a == this) || !this.f22461b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        } else if (!aVar.mo31716a()) {
            m40220b(aVar, true);
        }
    }

    /* renamed from: j */
    public boolean mo31756j() {
        return this.f22461b.tryLock();
    }

    public C8517i0(boolean z) {
        this.f22462c = null;
        this.f22460a = z;
        this.f22461b = new ReentrantLock(z);
    }

    @C5966a("lock")
    /* renamed from: j */
    private void m40221j(C8518a aVar) {
        int i = aVar.f22465c;
        aVar.f22465c = i + 1;
        if (i == 0) {
            aVar.f22466d = this.f22462c;
            this.f22462c = aVar;
        }
    }

    /* renamed from: a */
    public void mo31729a() {
        this.f22461b.lock();
    }

    /* renamed from: b */
    public boolean mo31735b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f22461b.tryLock(j, timeUnit);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31730a(long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r5 = this;
            long r6 = r8.toNanos(r6)
            java.util.concurrent.locks.ReentrantLock r8 = r5.f22461b
            boolean r0 = r5.f22460a
            r1 = 1
            if (r0 != 0) goto L_0x0012
            boolean r0 = r8.tryLock()
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 + r6
            boolean r0 = java.lang.Thread.interrupted()
        L_0x001b:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x002d, all -> 0x002b }
            boolean r6 = r8.tryLock(r6, r4)     // Catch:{ InterruptedException -> 0x002d, all -> 0x002b }
            if (r0 == 0) goto L_0x002a
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L_0x002a:
            return r6
        L_0x002b:
            r6 = move-exception
            goto L_0x0037
        L_0x002d:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0035 }
            long r6 = r2 - r6
            r0 = 1
            goto L_0x001b
        L_0x0035:
            r6 = move-exception
            r0 = 1
        L_0x0037:
            if (r0 == 0) goto L_0x0040
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r6
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8517i0.mo31730a(long, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public boolean mo31736b(C8518a aVar) throws InterruptedException {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            reentrantLock.lockInterruptibly();
            try {
                boolean a = aVar.mo31716a();
                if (!a) {
                }
                return a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    @C5966a("lock")
    /* renamed from: k */
    private void m40223k(C8518a aVar) {
        int i = aVar.f22465c - 1;
        aVar.f22465c = i;
        if (i == 0) {
            C8518a aVar2 = this.f22462c;
            C8518a aVar3 = null;
            while (aVar2 != aVar) {
                aVar3 = aVar2;
                aVar2 = aVar2.f22466d;
            }
            if (aVar3 == null) {
                this.f22462c = aVar2.f22466d;
            } else {
                aVar3.f22466d = aVar2.f22466d;
            }
            aVar2.f22466d = null;
        }
    }

    @C5966a("lock")
    /* renamed from: l */
    private boolean m40225l(C8518a aVar) {
        try {
            return aVar.mo31716a();
        } catch (Throwable th) {
            m40222k();
            throw C7358i0.m35589d(th);
        }
    }

    /* renamed from: e */
    public boolean mo31745e() {
        return this.f22461b.hasQueuedThreads();
    }

    /* renamed from: h */
    public boolean mo31753h() {
        return this.f22461b.isHeldByCurrentThread();
    }

    /* renamed from: i */
    public void mo31754i() {
        ReentrantLock reentrantLock = this.f22461b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                m40224l();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public int mo31744e(C8518a aVar) {
        if (aVar.f22463a == this) {
            this.f22461b.lock();
            try {
                return aVar.f22465c;
            } finally {
                this.f22461b.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: g */
    public boolean mo31750g() {
        return this.f22461b.isLocked();
    }

    /* renamed from: b */
    public boolean mo31737b(C8518a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            if (!reentrantLock.tryLock(j, timeUnit)) {
                return false;
            }
            try {
                boolean a = aVar.mo31716a();
                if (!a) {
                }
                return a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: c */
    public boolean mo31740c(C8518a aVar, long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean z = false;
            if (this.f22460a || !reentrantLock.tryLock()) {
                long nanoTime = System.nanoTime() + nanos;
                if (!reentrantLock.tryLock(j, timeUnit)) {
                    return false;
                }
                nanos = nanoTime - System.nanoTime();
            }
            try {
                if (aVar.mo31716a() || m40219a(aVar, nanos, isHeldByCurrentThread)) {
                    z = true;
                }
                if (!z) {
                }
                return z;
            } catch (Throwable th) {
                if (!isHeldByCurrentThread) {
                    m40224l();
                }
                throw th;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 151 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0060 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31743d(com.google.common.util.concurrent.C8517i0.C8518a r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            long r10 = r12.toNanos(r10)
            com.google.common.util.concurrent.i0 r12 = r9.f22463a
            if (r12 != r8) goto L_0x007a
            java.util.concurrent.locks.ReentrantLock r12 = r8.f22461b
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 + r10
            boolean r2 = r12.isHeldByCurrentThread()
            boolean r3 = java.lang.Thread.interrupted()
            boolean r4 = r8.f22460a     // Catch:{ all -> 0x006f }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0023
            boolean r4 = r12.tryLock()     // Catch:{ all -> 0x006f }
            if (r4 != 0) goto L_0x0041
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0038 }
            boolean r10 = r12.tryLock(r10, r7)     // Catch:{ InterruptedException -> 0x0038 }
            if (r10 != 0) goto L_0x0036
            if (r3 == 0) goto L_0x0035
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L_0x0035:
            return r6
        L_0x0036:
            r4 = r10
            goto L_0x0039
        L_0x0038:
            r3 = 1
        L_0x0039:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006f }
            long r10 = r0 - r10
            if (r4 == 0) goto L_0x0024
        L_0x0041:
            boolean r4 = r9.mo31716a()     // Catch:{ InterruptedException -> 0x0060, all -> 0x005e }
            if (r4 != 0) goto L_0x004f
            boolean r9 = r8.m40219a(r9, r10, r2)     // Catch:{ InterruptedException -> 0x0060, all -> 0x005e }
            if (r9 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 != 0) goto L_0x0054
            r12.unlock()     // Catch:{ all -> 0x006f }
        L_0x0054:
            if (r3 == 0) goto L_0x005d
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L_0x005d:
            return r5
        L_0x005e:
            r9 = move-exception
            goto L_0x006b
        L_0x0060:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0069 }
            long r10 = r0 - r10
            r2 = 0
            r3 = 1
            goto L_0x0041
        L_0x0069:
            r9 = move-exception
            r3 = 1
        L_0x006b:
            r12.unlock()     // Catch:{ all -> 0x006f }
            throw r9     // Catch:{ all -> 0x006f }
        L_0x006f:
            r9 = move-exception
            if (r3 == 0) goto L_0x0079
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x0079:
            throw r9
        L_0x007a:
            java.lang.IllegalMonitorStateException r9 = new java.lang.IllegalMonitorStateException
            r9.<init>()
            goto L_0x0081
        L_0x0080:
            throw r9
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8517i0.mo31743d(com.google.common.util.concurrent.i0$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: a */
    public boolean mo31731a(C8518a aVar) {
        if (aVar.f22463a == this) {
            ReentrantLock reentrantLock = this.f22461b;
            reentrantLock.lock();
            try {
                boolean a = aVar.mo31716a();
                if (!a) {
                }
                return a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* renamed from: f */
    public boolean mo31747f() {
        return this.f22460a;
    }

    /* renamed from: f */
    public boolean mo31748f(C8518a aVar) {
        return mo31744e(aVar) > 0;
    }

    @C5966a("lock")
    /* renamed from: b */
    private void m40220b(C8518a aVar, boolean z) {
        if (z) {
            m40224l();
        }
        m40221j(aVar);
        do {
            try {
                aVar.f22464b.awaitUninterruptibly();
            } finally {
                m40223k(aVar);
            }
        } while (!aVar.mo31716a());
    }

    /* renamed from: a */
    public boolean mo31732a(C8518a aVar, long j, TimeUnit timeUnit) {
        if (aVar.f22463a != this) {
            throw new IllegalMonitorStateException();
        } else if (!mo31730a(j, timeUnit)) {
            return false;
        } else {
            try {
                boolean a = aVar.mo31716a();
                if (!a) {
                }
                return a;
            } finally {
                this.f22461b.unlock();
            }
        }
    }

    /* renamed from: c */
    public int mo31738c() {
        return this.f22461b.getHoldCount();
    }

    /* renamed from: a */
    public boolean mo31733a(Thread thread) {
        return this.f22461b.hasQueuedThread(thread);
    }

    @C5966a("lock")
    /* renamed from: a */
    private void m40218a(C8518a aVar, boolean z) throws InterruptedException {
        if (z) {
            m40224l();
        }
        m40221j(aVar);
        do {
            try {
                aVar.f22464b.await();
            } finally {
                m40223k(aVar);
            }
        } while (!aVar.mo31716a());
    }

    /* renamed from: d */
    public int mo31741d() {
        return this.f22461b.getQueueLength();
    }

    @C5966a("lock")
    /* renamed from: a */
    private boolean m40219a(C8518a aVar, long j, boolean z) throws InterruptedException {
        boolean z2;
        if (z) {
            m40224l();
        }
        m40221j(aVar);
        while (true) {
            if (j < 0) {
                z2 = false;
                break;
            }
            try {
                j = aVar.f22464b.awaitNanos(j);
                if (aVar.mo31716a()) {
                    z2 = true;
                    break;
                }
            } catch (Throwable th) {
                m40223k(aVar);
                throw th;
            }
        }
        m40223k(aVar);
        return z2;
    }
}
