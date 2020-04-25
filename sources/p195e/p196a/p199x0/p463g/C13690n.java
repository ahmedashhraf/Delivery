package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.p199x0.p450a.C12346c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.n */
/* compiled from: ScheduledRunnable */
public final class C13690n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C12314c {

    /* renamed from: N */
    static final Object f39613N = new Object();

    /* renamed from: O */
    static final Object f39614O = new Object();

    /* renamed from: P */
    static final Object f39615P = new Object();

    /* renamed from: Q */
    static final int f39616Q = 0;

    /* renamed from: R */
    static final int f39617R = 1;

    /* renamed from: S */
    static final int f39618S = 2;

    /* renamed from: b */
    static final Object f39619b = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a */
    final Runnable f39620a;

    public C13690n(Runnable runnable, C12346c cVar) {
        super(3);
        this.f39620a = runnable;
        lazySet(0, cVar);
    }

    /* renamed from: a */
    public void mo43070a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f39615P) {
                if (obj == f39613N) {
                    future.cancel(false);
                    return;
                } else if (obj == f39614O) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        Object obj = get(0);
        if (obj == f39619b || obj == f39615P) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f39615P
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f39613N
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f39614O
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f39614O
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f39613N
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f39615P
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f39619b
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            e.a.x0.a.c r0 = (p195e.p196a.p199x0.p450a.C12346c) r0
            r0.mo42073c(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p463g.C13690n.dispose():void");
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f39620a.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f39619b || !compareAndSet(0, obj3, f39615P) || obj3 == null)) {
                ((C12346c) obj3).mo42073c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f39613N || obj2 == f39614O) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f39615P));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f39619b || !compareAndSet(0, obj4, f39615P) || obj4 == null)) {
            ((C12346c) obj4).mo42073c(this);
        }
        do {
            obj = get(1);
            if (obj == f39613N || obj == f39614O) {
                return;
            }
        } while (!compareAndSet(1, obj, f39615P));
    }
}
