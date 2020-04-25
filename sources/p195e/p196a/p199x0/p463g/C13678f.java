package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.f */
/* compiled from: InstantPeriodicTask */
final class C13678f implements Callable<Void>, C12314c {

    /* renamed from: Q */
    static final FutureTask<Void> f39576Q = new FutureTask<>(C12351a.f35502b, null);

    /* renamed from: N */
    final AtomicReference<Future<?>> f39577N = new AtomicReference<>();

    /* renamed from: O */
    final ExecutorService f39578O;

    /* renamed from: P */
    Thread f39579P;

    /* renamed from: a */
    final Runnable f39580a;

    /* renamed from: b */
    final AtomicReference<Future<?>> f39581b = new AtomicReference<>();

    C13678f(Runnable runnable, ExecutorService executorService) {
        this.f39580a = runnable;
        this.f39578O = executorService;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43050a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f39577N.get();
            if (future2 == f39576Q) {
                future.cancel(this.f39579P != Thread.currentThread());
                return;
            }
        } while (!this.f39577N.compareAndSet(future2, future));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43051b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f39581b.get();
            if (future2 == f39576Q) {
                future.cancel(this.f39579P != Thread.currentThread());
                return;
            }
        } while (!this.f39581b.compareAndSet(future2, future));
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39577N.get() == f39576Q;
    }

    public void dispose() {
        Future future = (Future) this.f39577N.getAndSet(f39576Q);
        boolean z = true;
        if (!(future == null || future == f39576Q)) {
            future.cancel(this.f39579P != Thread.currentThread());
        }
        Future future2 = (Future) this.f39581b.getAndSet(f39576Q);
        if (future2 != null && future2 != f39576Q) {
            if (this.f39579P == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }

    public Void call() throws Exception {
        this.f39579P = Thread.currentThread();
        try {
            this.f39580a.run();
            mo43051b(this.f39578O.submit(this));
            this.f39579P = null;
        } catch (Throwable th) {
            this.f39579P = null;
            C12205a.m54894b(th);
        }
        return null;
    }
}
