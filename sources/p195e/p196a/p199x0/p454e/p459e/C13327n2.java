package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p466y0.C13772a;

/* renamed from: e.a.x0.e.e.n2 */
/* compiled from: ObservableRefCount */
public final class C13327n2<T> extends C13131a<T, T> {

    /* renamed from: N */
    volatile C12313b f38529N = new C12313b();

    /* renamed from: O */
    final AtomicInteger f38530O = new AtomicInteger();

    /* renamed from: P */
    final ReentrantLock f38531P = new ReentrantLock();

    /* renamed from: b */
    final C13772a<? extends T> f38532b;

    /* renamed from: e.a.x0.e.e.n2$a */
    /* compiled from: ObservableRefCount */
    final class C13328a extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 3813126992133394324L;

        /* renamed from: N */
        final C12314c f38533N;

        /* renamed from: a */
        final C12280i0<? super T> f38535a;

        /* renamed from: b */
        final C12313b f38536b;

        C13328a(C12280i0<? super T> i0Var, C12313b bVar, C12314c cVar) {
            this.f38535a = i0Var;
            this.f38536b = bVar;
            this.f38533N = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f38533N.dispose();
        }

        public void onComplete() {
            mo42816a();
            this.f38535a.onComplete();
        }

        public void onError(Throwable th) {
            mo42816a();
            this.f38535a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38535a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42816a() {
            C13327n2.this.f38531P.lock();
            try {
                if (C13327n2.this.f38529N == this.f38536b) {
                    if (C13327n2.this.f38532b instanceof C12314c) {
                        ((C12314c) C13327n2.this.f38532b).dispose();
                    }
                    C13327n2.this.f38529N.dispose();
                    C13327n2.this.f38529N = new C12313b();
                    C13327n2.this.f38530O.set(0);
                }
            } finally {
                C13327n2.this.f38531P.unlock();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.n2$b */
    /* compiled from: ObservableRefCount */
    final class C13329b implements C12331g<C12314c> {

        /* renamed from: a */
        private final C12280i0<? super T> f38538a;

        /* renamed from: b */
        private final AtomicBoolean f38539b;

        C13329b(C12280i0<? super T> i0Var, AtomicBoolean atomicBoolean) {
            this.f38538a = i0Var;
            this.f38539b = atomicBoolean;
        }

        /* renamed from: a */
        public void mo33410c(C12314c cVar) {
            try {
                C13327n2.this.f38529N.mo42072b(cVar);
                C13327n2.this.mo42815a(this.f38538a, C13327n2.this.f38529N);
            } finally {
                C13327n2.this.f38531P.unlock();
                this.f38539b.set(false);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.n2$c */
    /* compiled from: ObservableRefCount */
    final class C13330c implements Runnable {

        /* renamed from: a */
        private final C12313b f38540a;

        C13330c(C12313b bVar) {
            this.f38540a = bVar;
        }

        public void run() {
            C13327n2.this.f38531P.lock();
            try {
                if (C13327n2.this.f38529N == this.f38540a && C13327n2.this.f38530O.decrementAndGet() == 0) {
                    if (C13327n2.this.f38532b instanceof C12314c) {
                        ((C12314c) C13327n2.this.f38532b).dispose();
                    }
                    C13327n2.this.f38529N.dispose();
                    C13327n2.this.f38529N = new C12313b();
                }
            } finally {
                C13327n2.this.f38531P.unlock();
            }
        }
    }

    public C13327n2(C13772a<T> aVar) {
        super(aVar);
        this.f38532b = aVar;
    }

    /* renamed from: a */
    private C12331g<C12314c> m57691a(C12280i0<? super T> i0Var, AtomicBoolean atomicBoolean) {
        return new C13329b(i0Var, atomicBoolean);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f38531P.lock();
        if (this.f38530O.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f38532b.mo42738k(m57691a(i0Var, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.f38531P.unlock();
                }
            }
        } else {
            try {
                mo42815a(i0Var, this.f38529N);
            } finally {
                this.f38531P.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42815a(C12280i0<? super T> i0Var, C12313b bVar) {
        C13328a aVar = new C13328a(i0Var, bVar, m57690a(bVar));
        i0Var.mo34123a((C12314c) aVar);
        this.f38532b.mo23893a((C12280i0<? super T>) aVar);
    }

    /* renamed from: a */
    private C12314c m57690a(C12313b bVar) {
        return C12315d.m55416a((Runnable) new C13330c(bVar));
    }
}
