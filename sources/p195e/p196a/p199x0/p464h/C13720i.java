package p195e.p196a.p199x0.p464h;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.i */
/* compiled from: FutureSubscriber */
public final class C13720i<T> extends CountDownLatch implements C12297q<T>, Future<T>, C14063d {

    /* renamed from: N */
    final AtomicReference<C14063d> f39691N = new AtomicReference<>();

    /* renamed from: a */
    T f39692a;

    /* renamed from: b */
    Throwable f39693b;

    public C13720i() {
        super(1);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        C13742j.m58676a(this.f39691N, dVar, Long.MAX_VALUE);
    }

    /* renamed from: c */
    public void mo41813c(long j) {
    }

    public void cancel() {
    }

    public boolean cancel(boolean z) {
        C14063d dVar;
        C13742j jVar;
        do {
            dVar = (C14063d) this.f39691N.get();
            if (dVar != this) {
                jVar = C13742j.CANCELLED;
                if (dVar == jVar) {
                }
            }
            return false;
        } while (!this.f39691N.compareAndSet(dVar, jVar));
        if (dVar != null) {
            dVar.cancel();
        }
        countDown();
        return true;
    }

    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C13748e.m58701a();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f39693b;
            if (th == null) {
                return this.f39692a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public boolean isCancelled() {
        return C13742j.m58672a((C14063d) this.f39691N.get());
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public void onComplete() {
        if (this.f39692a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            C14063d dVar = (C14063d) this.f39691N.get();
            if (dVar != this && dVar != C13742j.CANCELLED) {
                if (this.f39691N.compareAndSet(dVar, this)) {
                    countDown();
                    break;
                }
            } else {
                break;
            }
        }
    }

    public void onError(Throwable th) {
        C14063d dVar;
        do {
            dVar = (C14063d) this.f39691N.get();
            if (dVar == this || dVar == C13742j.CANCELLED) {
                C12205a.m54894b(th);
                return;
            }
            this.f39693b = th;
        } while (!this.f39691N.compareAndSet(dVar, this));
        countDown();
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (this.f39692a != null) {
            ((C14063d) this.f39691N.get()).cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f39692a = t;
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C13748e.m58701a();
            if (!await(j, timeUnit)) {
                throw new TimeoutException();
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f39693b;
            if (th == null) {
                return this.f39692a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
