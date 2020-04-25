package p195e.p196a.p199x0.p453d;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.r */
/* compiled from: FutureSingleObserver */
public final class C12425r<T> extends CountDownLatch implements C12292n0<T>, Future<T>, C12314c {

    /* renamed from: N */
    final AtomicReference<C12314c> f35588N = new AtomicReference<>();

    /* renamed from: a */
    T f35589a;

    /* renamed from: b */
    Throwable f35590b;

    public C12425r() {
        super(1);
    }

    /* renamed from: a */
    public void mo41974a(C12314c cVar) {
        C12347d.m55468c(this.f35588N, cVar);
    }

    public boolean cancel(boolean z) {
        C12314c cVar;
        C12347d dVar;
        do {
            cVar = (C12314c) this.f35588N.get();
            if (cVar != this) {
                dVar = C12347d.DISPOSED;
                if (cVar == dVar) {
                }
            }
            return false;
        } while (!this.f35588N.compareAndSet(cVar, dVar));
        if (cVar != null) {
            cVar.dispose();
        }
        countDown();
        return true;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return isDone();
    }

    public void dispose() {
    }

    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C13748e.m58701a();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f35590b;
            if (th == null) {
                return this.f35589a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public boolean isCancelled() {
        return C12347d.m55463a((C12314c) this.f35588N.get());
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public void onError(Throwable th) {
        C12314c cVar;
        do {
            cVar = (C12314c) this.f35588N.get();
            if (cVar == C12347d.DISPOSED) {
                C12205a.m54894b(th);
                return;
            }
            this.f35590b = th;
        } while (!this.f35588N.compareAndSet(cVar, this));
        countDown();
    }

    public void onSuccess(T t) {
        C12314c cVar = (C12314c) this.f35588N.get();
        if (cVar != C12347d.DISPOSED) {
            this.f35589a = t;
            this.f35588N.compareAndSet(cVar, this);
            countDown();
        }
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C13748e.m58701a();
            if (!await(j, timeUnit)) {
                throw new TimeoutException();
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f35590b;
            if (th == null) {
                return this.f35589a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
