package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12200a0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13748e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p467z0.C13787e;

/* renamed from: e.a.x0.e.e.e */
/* compiled from: BlockingObservableNext */
public final class C13185e<T> implements Iterable<T> {

    /* renamed from: a */
    final C5926g0<T> f38037a;

    /* renamed from: e.a.x0.e.e.e$a */
    /* compiled from: BlockingObservableNext */
    static final class C13186a<T> implements Iterator<T> {

        /* renamed from: N */
        private T f38038N;

        /* renamed from: O */
        private boolean f38039O = true;

        /* renamed from: P */
        private boolean f38040P = true;

        /* renamed from: Q */
        private Throwable f38041Q;

        /* renamed from: R */
        private boolean f38042R;

        /* renamed from: a */
        private final C13187b<T> f38043a;

        /* renamed from: b */
        private final C5926g0<T> f38044b;

        C13186a(C5926g0<T> g0Var, C13187b<T> bVar) {
            this.f38044b = g0Var;
            this.f38043a = bVar;
        }

        /* renamed from: b */
        private boolean m57354b() {
            if (!this.f38042R) {
                this.f38042R = true;
                this.f38043a.mo42719c();
                new C13492y1(this.f38044b).mo23893a((C12280i0<? super T>) this.f38043a);
            }
            try {
                C12200a0 g = this.f38043a.mo42720g();
                if (g.mo41775e()) {
                    this.f38040P = false;
                    this.f38038N = g.mo41772b();
                    return true;
                }
                this.f38039O = false;
                if (g.mo41773c()) {
                    return false;
                }
                this.f38041Q = g.mo41771a();
                throw C13754k.m58724c(this.f38041Q);
            } catch (InterruptedException e) {
                this.f38043a.dispose();
                this.f38041Q = e;
                throw C13754k.m58724c(e);
            }
        }

        public boolean hasNext() {
            Throwable th = this.f38041Q;
            if (th == null) {
                boolean z = false;
                if (!this.f38039O) {
                    return false;
                }
                if (!this.f38040P || m57354b()) {
                    z = true;
                }
                return z;
            }
            throw C13754k.m58724c(th);
        }

        public T next() {
            Throwable th = this.f38041Q;
            if (th != null) {
                throw C13754k.m58724c(th);
            } else if (hasNext()) {
                this.f38040P = true;
                return this.f38038N;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: e.a.x0.e.e.e$b */
    /* compiled from: BlockingObservableNext */
    static final class C13187b<T> extends C13787e<C12200a0<T>> {

        /* renamed from: N */
        final AtomicInteger f38045N = new AtomicInteger();

        /* renamed from: b */
        private final BlockingQueue<C12200a0<T>> f38046b = new ArrayBlockingQueue(1);

        C13187b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42719c() {
            this.f38045N.set(1);
        }

        /* renamed from: g */
        public C12200a0<T> mo42720g() throws InterruptedException {
            mo42719c();
            C13748e.m58701a();
            return (C12200a0) this.f38046b.take();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(C12200a0<T> a0Var) {
            if (this.f38045N.getAndSet(0) == 1 || !a0Var.mo41775e()) {
                while (!this.f38046b.offer(a0Var)) {
                    C12200a0<T> a0Var2 = (C12200a0) this.f38046b.poll();
                    if (a0Var2 != null && !a0Var2.mo41775e()) {
                        a0Var = a0Var2;
                    }
                }
            }
        }
    }

    public C13185e(C5926g0<T> g0Var) {
        this.f38037a = g0Var;
    }

    public Iterator<T> iterator() {
        return new C13186a(this.f38037a, new C13187b());
    }
}
