package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p441d1.C12227a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.a */
/* compiled from: AbstractDirectTask */
abstract class C13664a extends AtomicReference<Future<?>> implements C12314c, C12227a {

    /* renamed from: N */
    protected static final FutureTask<Void> f39536N = new FutureTask<>(C12351a.f35502b, null);

    /* renamed from: O */
    protected static final FutureTask<Void> f39537O = new FutureTask<>(C12351a.f35502b, null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a */
    protected final Runnable f39538a;

    /* renamed from: b */
    protected Thread f39539b;

    C13664a(Runnable runnable) {
        this.f39538a = runnable;
    }

    /* renamed from: a */
    public final void mo43036a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f39536N) {
                if (future2 == f39537O) {
                    future.cancel(this.f39539b != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        Future future = (Future) get();
        return future == f39536N || future == f39537O;
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != f39536N) {
            FutureTask<Void> futureTask = f39537O;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.f39539b != Thread.currentThread());
            }
        }
    }

    /* renamed from: a */
    public Runnable mo41865a() {
        return this.f39538a;
    }
}
