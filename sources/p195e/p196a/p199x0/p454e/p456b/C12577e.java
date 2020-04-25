package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12200a0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12271b;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.e */
/* compiled from: BlockingFlowableNext */
public final class C12577e<T> implements Iterable<T> {

    /* renamed from: a */
    final C6007b<? extends T> f36007a;

    /* renamed from: e.a.x0.e.b.e$a */
    /* compiled from: BlockingFlowableNext */
    static final class C12578a<T> implements Iterator<T> {

        /* renamed from: N */
        private T f36008N;

        /* renamed from: O */
        private boolean f36009O = true;

        /* renamed from: P */
        private boolean f36010P = true;

        /* renamed from: Q */
        private Throwable f36011Q;

        /* renamed from: R */
        private boolean f36012R;

        /* renamed from: a */
        private final C12579b<T> f36013a;

        /* renamed from: b */
        private final C6007b<? extends T> f36014b;

        C12578a(C6007b<? extends T> bVar, C12579b<T> bVar2) {
            this.f36014b = bVar;
            this.f36013a = bVar2;
        }

        /* renamed from: b */
        private boolean m55925b() {
            try {
                if (!this.f36012R) {
                    this.f36012R = true;
                    this.f36013a.mo42281g();
                    C5929l.m26913q(this.f36014b).mo24597u().mo24393a((C12297q<? super T>) this.f36013a);
                }
                C12200a0 h = this.f36013a.mo42282h();
                if (h.mo41775e()) {
                    this.f36010P = false;
                    this.f36008N = h.mo41772b();
                    return true;
                }
                this.f36009O = false;
                if (h.mo41773c()) {
                    return false;
                }
                if (h.mo41774d()) {
                    this.f36011Q = h.mo41771a();
                    throw C13754k.m58724c(this.f36011Q);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f36013a.dispose();
                this.f36011Q = e;
                throw C13754k.m58724c(e);
            }
        }

        public boolean hasNext() {
            Throwable th = this.f36011Q;
            if (th == null) {
                boolean z = false;
                if (!this.f36009O) {
                    return false;
                }
                if (!this.f36010P || m55925b()) {
                    z = true;
                }
                return z;
            }
            throw C13754k.m58724c(th);
        }

        public T next() {
            Throwable th = this.f36011Q;
            if (th != null) {
                throw C13754k.m58724c(th);
            } else if (hasNext()) {
                this.f36010P = true;
                return this.f36008N;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: e.a.x0.e.b.e$b */
    /* compiled from: BlockingFlowableNext */
    static final class C12579b<T> extends C12271b<C12200a0<T>> {

        /* renamed from: N */
        final AtomicInteger f36015N = new AtomicInteger();

        /* renamed from: b */
        private final BlockingQueue<C12200a0<T>> f36016b = new ArrayBlockingQueue(1);

        C12579b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42281g() {
            this.f36015N.set(1);
        }

        /* renamed from: h */
        public C12200a0<T> mo42282h() throws InterruptedException {
            mo42281g();
            C13748e.m58701a();
            return (C12200a0) this.f36016b.take();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(C12200a0<T> a0Var) {
            if (this.f36015N.getAndSet(0) == 1 || !a0Var.mo41775e()) {
                while (!this.f36016b.offer(a0Var)) {
                    C12200a0<T> a0Var2 = (C12200a0) this.f36016b.poll();
                    if (a0Var2 != null && !a0Var2.mo41775e()) {
                        a0Var = a0Var2;
                    }
                }
            }
        }
    }

    public C12577e(C6007b<? extends T> bVar) {
        this.f36007a = bVar;
    }

    public Iterator<T> iterator() {
        return new C12578a(this.f36007a, new C12579b());
    }
}
