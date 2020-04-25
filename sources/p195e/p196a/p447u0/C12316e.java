package p195e.p196a.p447u0;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.u0.e */
/* compiled from: FutureDisposable */
final class C12316e extends AtomicReference<Future<?>> implements C12314c {
    private static final long serialVersionUID = 6545242830671168775L;

    /* renamed from: a */
    private final boolean f35496a;

    C12316e(Future<?> future, boolean z) {
        super(future);
        this.f35496a = z;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        Future future = (Future) get();
        return future == null || future.isDone();
    }

    public void dispose() {
        Future future = (Future) getAndSet(null);
        if (future != null) {
            future.cancel(this.f35496a);
        }
    }
}
