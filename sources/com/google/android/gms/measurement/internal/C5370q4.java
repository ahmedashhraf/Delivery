package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5370q4 extends Thread {

    /* renamed from: N */
    private final /* synthetic */ C5326m4 f15415N;

    /* renamed from: a */
    private final Object f15416a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C5337n4<?>> f15417b;

    public C5370q4(C5326m4 m4Var, String str, BlockingQueue<C5337n4<?>> blockingQueue) {
        this.f15415N = m4Var;
        C4300a0.m18620a(str);
        C4300a0.m18620a(blockingQueue);
        this.f15417b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo21622a() {
        synchronized (this.f15416a) {
            this.f15416a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.f15415N.f15306i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f15415N.f15307j.release();
        r6.f15415N.f15306i.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.f15415N.f15300c) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        r6.f15415N.f15300c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.f15415N.f15301d) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r6.f15415N.f15301d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.f15415N.mo21205d().mo21533t().mo21549a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.m4 r1 = r6.f15415N     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f15307j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m23390a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b7 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b7 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.n4<?>> r2 = r6.f15417b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.measurement.internal.n4 r2 = (com.google.android.gms.measurement.internal.C5337n4) r2     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f15338b     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b7 }
            r2.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f15416a     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.n4<?>> r3 = r6.f15417b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00b4 }
            boolean r3 = r3.f15308k     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = r6.f15416a     // Catch:{ InterruptedException -> 0x0050 }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6.m23390a(r3)     // Catch:{ all -> 0x00b4 }
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.f15306i     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.n4<?>> r3 = r6.f15417b     // Catch:{ all -> 0x00b1 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x00ae
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.m4 r1 = r6.f15415N
            java.lang.Object r1 = r1.f15306i
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            java.util.concurrent.Semaphore r2 = r2.f15307j     // Catch:{ all -> 0x00ab }
            r2.release()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r2.f15306i     // Catch:{ all -> 0x00ab }
            r2.notifyAll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.q4 r2 = r2.f15300c     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x008c
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            r2.f15300c = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x008c:
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.q4 r2 = r2.f15301d     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x009a
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N     // Catch:{ all -> 0x00ab }
            r2.f15301d = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x009a:
            com.google.android.gms.measurement.internal.m4 r0 = r6.f15415N     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo21549a(r2)     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x001c
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            com.google.android.gms.measurement.internal.m4 r2 = r6.f15415N
            java.lang.Object r2 = r2.f15306i
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            java.util.concurrent.Semaphore r3 = r3.f15307j     // Catch:{ all -> 0x00fe }
            r3.release()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.f15306i     // Catch:{ all -> 0x00fe }
            r3.notifyAll()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.q4 r3 = r3.f15300c     // Catch:{ all -> 0x00fe }
            if (r6 == r3) goto L_0x00f7
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.q4 r3 = r3.f15301d     // Catch:{ all -> 0x00fe }
            if (r6 != r3) goto L_0x00e7
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            r3.f15301d = null     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00e7:
            com.google.android.gms.measurement.internal.m4 r0 = r6.f15415N     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo21549a(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00f7:
            com.google.android.gms.measurement.internal.m4 r3 = r6.f15415N     // Catch:{ all -> 0x00fe }
            r3.f15300c = null     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x0101:
            throw r0
        L_0x0102:
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5370q4.run():void");
    }

    /* renamed from: a */
    private final void m23390a(InterruptedException interruptedException) {
        this.f15415N.mo21205d().mo21536w().mo21550a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
