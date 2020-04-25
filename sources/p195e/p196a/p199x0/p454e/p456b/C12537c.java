package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12200a0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12271b;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.c */
/* compiled from: BlockingFlowableLatest */
public final class C12537c<T> implements Iterable<T> {

    /* renamed from: a */
    final C6007b<? extends T> f35892a;

    /* renamed from: e.a.x0.e.b.c$a */
    /* compiled from: BlockingFlowableLatest */
    static final class C12538a<T> extends C12271b<C12200a0<T>> implements Iterator<T> {

        /* renamed from: N */
        final AtomicReference<C12200a0<T>> f35893N = new AtomicReference<>();

        /* renamed from: O */
        C12200a0<T> f35894O;

        /* renamed from: b */
        final Semaphore f35895b = new Semaphore(0);

        C12538a() {
        }

        public boolean hasNext() {
            C12200a0<T> a0Var = this.f35894O;
            if (a0Var == null || !a0Var.mo41774d()) {
                C12200a0<T> a0Var2 = this.f35894O;
                if ((a0Var2 == null || a0Var2.mo41775e()) && this.f35894O == null) {
                    try {
                        C13748e.m58701a();
                        this.f35895b.acquire();
                        C12200a0<T> a0Var3 = (C12200a0) this.f35893N.getAndSet(null);
                        this.f35894O = a0Var3;
                        if (a0Var3.mo41774d()) {
                            throw C13754k.m58724c(a0Var3.mo41771a());
                        }
                    } catch (InterruptedException e) {
                        dispose();
                        this.f35894O = C12200a0.m54846a((Throwable) e);
                        throw C13754k.m58724c(e);
                    }
                }
                return this.f35894O.mo41775e();
            }
            throw C13754k.m58724c(this.f35894O.mo41771a());
        }

        public T next() {
            if (!hasNext() || !this.f35894O.mo41775e()) {
                throw new NoSuchElementException();
            }
            T b = this.f35894O.mo41772b();
            this.f35894O = null;
            return b;
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
        public void mo41789a(C12200a0<T> a0Var) {
            if (this.f35893N.getAndSet(a0Var) == null) {
                this.f35895b.release();
            }
        }
    }

    public C12537c(C6007b<? extends T> bVar) {
        this.f35892a = bVar;
    }

    public Iterator<T> iterator() {
        C12538a aVar = new C12538a();
        C5929l.m26913q(this.f35892a).mo24597u().mo24393a((C12297q<? super T>) aVar);
        return aVar;
    }
}
