package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.util.concurrent.c */
/* compiled from: AbstractFuture */
public abstract class C8471c<V> implements C8473c0<V> {

    /* renamed from: a */
    private final C8472a<V> f22380a = new C8472a<>();

    /* renamed from: b */
    private final C8570q f22381b = new C8570q();

    /* renamed from: com.google.common.util.concurrent.c$a */
    /* compiled from: AbstractFuture */
    static final class C8472a<V> extends AbstractQueuedSynchronizer {

        /* renamed from: N */
        static final int f22382N = 0;

        /* renamed from: O */
        static final int f22383O = 1;

        /* renamed from: P */
        static final int f22384P = 2;

        /* renamed from: Q */
        static final int f22385Q = 4;

        /* renamed from: R */
        static final int f22386R = 8;
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private V f22387a;

        /* renamed from: b */
        private Throwable f22388b;

        C8472a() {
        }

        /* renamed from: g */
        private V m40099g() throws CancellationException, ExecutionException {
            int state = getState();
            if (state == 2) {
                Throwable th = this.f22388b;
                if (th == null) {
                    return this.f22387a;
                }
                throw new ExecutionException(th);
            } else if (state == 4 || state == 8) {
                throw C8471c.m40092a("Task was cancelled.", this.f22388b);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Error, synchronizer in invalid state: ");
                sb.append(state);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo31662a(long j) throws TimeoutException, CancellationException, ExecutionException, InterruptedException {
            if (tryAcquireSharedNanos(-1, j)) {
                return m40099g();
            }
            throw new TimeoutException("Timeout waiting for task.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo31666d() {
            return (getState() & 12) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo31667e() {
            return (getState() & 14) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo31668f() {
            return getState() == 8;
        }

        /* access modifiers changed from: protected */
        public int tryAcquireShared(int i) {
            return mo31667e() ? 1 : -1;
        }

        /* access modifiers changed from: protected */
        public boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo31661a() throws CancellationException, ExecutionException, InterruptedException {
            acquireSharedInterruptibly(-1);
            return m40099g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31663a(@C5952h V v) {
            return m40098a(v, null, 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31664a(Throwable th) {
            return m40098a(null, th, 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31665a(boolean z) {
            return m40098a(null, null, z ? 8 : 4);
        }

        /* renamed from: a */
        private boolean m40098a(@C5952h V v, @C5952h Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.f22387a = v;
                if ((i & 12) != 0) {
                    th = new CancellationException("Future.cancel() was called.");
                }
                this.f22388b = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }

    protected C8471c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31653a() {
    }

    /* renamed from: a */
    public void mo31637a(Runnable runnable, Executor executor) {
        this.f22381b.mo31888a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo31656b() {
        return this.f22380a.mo31668f();
    }

    public boolean cancel(boolean z) {
        if (!this.f22380a.mo31665a(z)) {
            return false;
        }
        this.f22381b.mo31887a();
        if (z) {
            mo31653a();
        }
        return true;
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return this.f22380a.mo31662a(timeUnit.toNanos(j));
    }

    public boolean isCancelled() {
        return this.f22380a.mo31666d();
    }

    public boolean isDone() {
        return this.f22380a.mo31667e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31654a(@C5952h V v) {
        boolean a = this.f22380a.mo31663a(v);
        if (a) {
            this.f22381b.mo31887a();
        }
        return a;
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.f22380a.mo31661a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31655a(Throwable th) {
        boolean a = this.f22380a.mo31664a((Throwable) C7397x.m35664a(th));
        if (a) {
            this.f22381b.mo31887a();
        }
        return a;
    }

    /* renamed from: a */
    static final CancellationException m40092a(@C5952h String str, @C5952h Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
