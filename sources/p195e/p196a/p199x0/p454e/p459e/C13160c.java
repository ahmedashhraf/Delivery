package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12200a0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p467z0.C13787e;

/* renamed from: e.a.x0.e.e.c */
/* compiled from: BlockingObservableLatest */
public final class C13160c<T> implements Iterable<T> {

    /* renamed from: a */
    final C5926g0<T> f37954a;

    /* renamed from: e.a.x0.e.e.c$a */
    /* compiled from: BlockingObservableLatest */
    static final class C13161a<T> extends C13787e<C12200a0<T>> implements Iterator<T> {

        /* renamed from: N */
        final Semaphore f37955N = new Semaphore(0);

        /* renamed from: O */
        final AtomicReference<C12200a0<T>> f37956O = new AtomicReference<>();

        /* renamed from: b */
        C12200a0<T> f37957b;

        C13161a() {
        }

        public boolean hasNext() {
            C12200a0<T> a0Var = this.f37957b;
            if (a0Var == null || !a0Var.mo41774d()) {
                if (this.f37957b == null) {
                    try {
                        C13748e.m58701a();
                        this.f37955N.acquire();
                        C12200a0<T> a0Var2 = (C12200a0) this.f37956O.getAndSet(null);
                        this.f37957b = a0Var2;
                        if (a0Var2.mo41774d()) {
                            throw C13754k.m58724c(a0Var2.mo41771a());
                        }
                    } catch (InterruptedException e) {
                        dispose();
                        this.f37957b = C12200a0.m54846a((Throwable) e);
                        throw C13754k.m58724c(e);
                    }
                }
                return this.f37957b.mo41775e();
            }
            throw C13754k.m58724c(this.f37957b.mo41771a());
        }

        public T next() {
            if (hasNext()) {
                T b = this.f37957b.mo41772b();
                this.f37957b = null;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            C12205a.m54894b(th);
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        /* renamed from: a */
        public void mo33453a(C12200a0<T> a0Var) {
            if (this.f37956O.getAndSet(a0Var) == null) {
                this.f37955N.release();
            }
        }
    }

    public C13160c(C5926g0<T> g0Var) {
        this.f37954a = g0Var;
    }

    public Iterator<T> iterator() {
        C13161a aVar = new C13161a();
        C5923b0.m26213v(this.f37954a).mo24084u().mo23893a((C12280i0<? super T>) aVar);
        return aVar;
    }
}
