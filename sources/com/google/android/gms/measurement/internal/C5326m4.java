package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4484g;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5326m4 extends C5360p5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f15299l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5370q4 f15300c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5370q4 f15301d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C5337n4<?>> f15302e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C5337n4<?>> f15303f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final UncaughtExceptionHandler f15304g = new C5348o4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final UncaughtExceptionHandler f15305h = new C5348o4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f15306i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f15307j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f15308k;

    C5326m4(C5359p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: a */
    public final <V> Future<V> mo21554a(Callable<V> callable) throws IllegalStateException {
        mo21613o();
        C4300a0.m18620a(callable);
        C5337n4 n4Var = new C5337n4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15300c) {
            if (!this.f15302e.isEmpty()) {
                mo21205d().mo21536w().mo21549a("Callable skipped the worker queue.");
            }
            n4Var.run();
        } else {
            m23212a(n4Var);
        }
        return n4Var;
    }

    /* renamed from: b */
    public final <V> Future<V> mo21556b(Callable<V> callable) throws IllegalStateException {
        mo21613o();
        C4300a0.m18620a(callable);
        C5337n4 n4Var = new C5337n4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15300c) {
            n4Var.run();
        } else {
            m23212a(n4Var);
        }
        return n4Var;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final void mo21207f() {
        if (Thread.currentThread() != this.f15301d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final void mo21209h() {
        if (Thread.currentThread() != this.f15300c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo21326r() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo21558t() {
        return Thread.currentThread() == this.f15300c;
    }

    /* renamed from: b */
    public final void mo21557b(Runnable runnable) throws IllegalStateException {
        mo21613o();
        C4300a0.m18620a(runnable);
        C5337n4 n4Var = new C5337n4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15306i) {
            this.f15303f.add(n4Var);
            if (this.f15301d == null) {
                this.f15301d = new C5370q4(this, "Measurement Network", this.f15303f);
                this.f15301d.setUncaughtExceptionHandler(this.f15305h);
                this.f15301d.start();
            } else {
                this.f15301d.mo21622a();
            }
        }
    }

    /* renamed from: a */
    public final void mo21555a(Runnable runnable) throws IllegalStateException {
        mo21613o();
        C4300a0.m18620a(runnable);
        m23212a(new C5337n4<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)(1:20)|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = mo21205d().mo21536w();
        r3 = "Timed out waiting for ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4.length() == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2.mo21549a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = mo21205d().mo21536w();
        r3 = "Interrupted waiting for ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4.length() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r2.mo21549a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r1 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo21553a(java.util.concurrent.atomic.AtomicReference<T> r1, long r2, java.lang.String r4, java.lang.Runnable r5) {
        /*
            r0 = this;
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.m4 r2 = r0.mo21203c()     // Catch:{ all -> 0x005c }
            r2.mo21555a(r5)     // Catch:{ all -> 0x005c }
            r2 = 15000(0x3a98, double:7.411E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0036
            com.google.android.gms.measurement.internal.k3 r2 = r0.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21536w()
            java.lang.String r3 = "Timed out waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x002d
            java.lang.String r3 = r3.concat(r4)
            goto L_0x0033
        L_0x002d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0033:
            r2.mo21549a(r3)
        L_0x0036:
            return r1
        L_0x0037:
            com.google.android.gms.measurement.internal.k3 r2 = r0.mo21205d()     // Catch:{ all -> 0x005c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21536w()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Interrupted waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005c }
            int r5 = r4.length()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0050
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0056
        L_0x0050:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005c }
            r4.<init>(r3)     // Catch:{ all -> 0x005c }
            r3 = r4
        L_0x0056:
            r2.mo21549a(r3)     // Catch:{ all -> 0x005c }
            r2 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5326m4.mo21553a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: a */
    private final void m23212a(C5337n4<?> n4Var) {
        synchronized (this.f15306i) {
            this.f15302e.add(n4Var);
            if (this.f15300c == null) {
                this.f15300c = new C5370q4(this, "Measurement Worker", this.f15302e);
                this.f15300c.setUncaughtExceptionHandler(this.f15304g);
                this.f15300c.start();
            } else {
                this.f15300c.mo21622a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
