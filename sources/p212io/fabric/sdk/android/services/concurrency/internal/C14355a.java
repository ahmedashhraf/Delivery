package p212io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.a */
/* compiled from: AbstractFuture */
public abstract class C14355a<V> implements Future<V> {

    /* renamed from: a */
    private final C14356a<V> f42413a = new C14356a<>();

    /* renamed from: io.fabric.sdk.android.services.concurrency.internal.a$a */
    /* compiled from: AbstractFuture */
    static final class C14356a<V> extends AbstractQueuedSynchronizer {

        /* renamed from: N */
        static final int f42414N = 0;

        /* renamed from: O */
        static final int f42415O = 1;

        /* renamed from: P */
        static final int f42416P = 2;

        /* renamed from: Q */
        static final int f42417Q = 4;

        /* renamed from: R */
        static final int f42418R = 8;
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private V f42419a;

        /* renamed from: b */
        private Throwable f42420b;

        C14356a() {
        }

        /* renamed from: g */
        private V m62109g() throws CancellationException, ExecutionException {
            int state = getState();
            if (state == 2) {
                Throwable th = this.f42420b;
                if (th == null) {
                    return this.f42419a;
                }
                throw new ExecutionException(th);
            } else if (state == 4 || state == 8) {
                throw C14355a.m62103a("Task was cancelled.", this.f42420b);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Error, synchronizer in invalid state: ");
                sb.append(state);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo45348a(long j) throws TimeoutException, CancellationException, ExecutionException, InterruptedException {
            if (tryAcquireSharedNanos(-1, j)) {
                return m62109g();
            }
            throw new TimeoutException("Timeout waiting for task.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo45352d() {
            return (getState() & 12) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo45353e() {
            return (getState() & 14) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo45354f() {
            return getState() == 8;
        }

        /* access modifiers changed from: protected */
        public int tryAcquireShared(int i) {
            return mo45353e() ? 1 : -1;
        }

        /* access modifiers changed from: protected */
        public boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo45347a() throws CancellationException, ExecutionException, InterruptedException {
            acquireSharedInterruptibly(-1);
            return m62109g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo45349a(V v) {
            return m62108a(v, null, 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo45350a(Throwable th) {
            return m62108a(null, th, 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo45351a(boolean z) {
            return m62108a(null, null, z ? 8 : 4);
        }

        /* renamed from: a */
        private boolean m62108a(V v, Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.f42419a = v;
                if ((i & 12) != 0) {
                    th = new CancellationException("Future.cancel() was called.");
                }
                this.f42420b = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }

    protected C14355a() {
    }

    /* renamed from: a */
    static final CancellationException m62103a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45338a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo45341b() {
        return this.f42413a.mo45354f();
    }

    public boolean cancel(boolean z) {
        if (!this.f42413a.mo45351a(z)) {
            return false;
        }
        if (z) {
            mo45338a();
        }
        return true;
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return this.f42413a.mo45348a(timeUnit.toNanos(j));
    }

    public boolean isCancelled() {
        return this.f42413a.mo45352d();
    }

    public boolean isDone() {
        return this.f42413a.mo45353e();
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.f42413a.mo45347a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo45339a(V v) {
        return this.f42413a.mo45349a(v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo45340a(Throwable th) {
        if (th != null) {
            return this.f42413a.mo45350a(th);
        }
        throw new NullPointerException();
    }
}
