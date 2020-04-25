package p212io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.e */
/* compiled from: RetryFuture */
class C14360e<T> extends C14355a<T> implements Runnable {

    /* renamed from: N */
    private final Callable<T> f42425N;

    /* renamed from: O */
    private final AtomicReference<Thread> f42426O = new AtomicReference<>();

    /* renamed from: P */
    RetryState f42427P;

    /* renamed from: b */
    private final C14362g f42428b;

    C14360e(Callable<T> callable, RetryState retryState, C14362g gVar) {
        this.f42425N = callable;
        this.f42427P = retryState;
        this.f42428b = gVar;
    }

    /* renamed from: c */
    private C14357b m62119c() {
        return this.f42427P.getBackoff();
    }

    /* renamed from: d */
    private int m62120d() {
        return this.f42427P.getRetryCount();
    }

    /* renamed from: e */
    private C14361f m62121e() {
        return this.f42427P.getRetryPolicy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45338a() {
        Thread thread = (Thread) this.f42426O.getAndSet(null);
        if (thread != null) {
            thread.interrupt();
        }
    }

    public void run() {
        if (!isDone() && this.f42426O.compareAndSet(null, Thread.currentThread())) {
            try {
                mo45339a(this.f42425N.call());
            } catch (Throwable th) {
                this.f42426O.getAndSet(null);
                throw th;
            }
            this.f42426O.getAndSet(null);
        }
    }
}
