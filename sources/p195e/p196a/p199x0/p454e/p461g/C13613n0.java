package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.g.n0 */
/* compiled from: SingleTakeUntil */
public final class C13613n0<T, U> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39407a;

    /* renamed from: b */
    final C6007b<U> f39408b;

    /* renamed from: e.a.x0.e.g.n0$a */
    /* compiled from: SingleTakeUntil */
    static final class C13614a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = -622603812305745221L;

        /* renamed from: a */
        final C12292n0<? super T> f39409a;

        /* renamed from: b */
        final C13615b f39410b = new C13615b(this);

        C13614a(C12292n0<? super T> n0Var) {
            this.f39409a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            this.f39410b.mo43006a();
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar == dVar || ((C12314c) getAndSet(dVar)) == C12347d.DISPOSED) {
                C12205a.m54894b(th);
            } else {
                this.f39409a.onError(th);
            }
        }

        public void onSuccess(T t) {
            this.f39410b.mo43006a();
            if (((C12314c) getAndSet(C12347d.DISPOSED)) != C12347d.DISPOSED) {
                this.f39409a.onSuccess(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43005a(Throwable th) {
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar != dVar) {
                C12314c cVar2 = (C12314c) getAndSet(dVar);
                if (cVar2 != C12347d.DISPOSED) {
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.f39409a.onError(th);
                    return;
                }
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.g.n0$b */
    /* compiled from: SingleTakeUntil */
    static final class C13615b extends AtomicReference<C14063d> implements C12297q<Object> {
        private static final long serialVersionUID = 5170026210238877381L;

        /* renamed from: a */
        final C13614a<?> f39411a;

        C13615b(C13614a<?> aVar) {
            this.f39411a = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        public void onComplete() {
            Object obj = get();
            C13742j jVar = C13742j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f39411a.mo43005a((Throwable) new CancellationException());
            }
        }

        public void onError(Throwable th) {
            this.f39411a.mo43005a(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            if (C13742j.m58674a((AtomicReference<C14063d>) this)) {
                this.f39411a.mo43005a((Throwable) new CancellationException());
            }
        }

        /* renamed from: a */
        public void mo43006a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    public C13613n0(C5930q0<T> q0Var, C6007b<U> bVar) {
        this.f39407a = q0Var;
        this.f39408b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C13614a aVar = new C13614a(n0Var);
        n0Var.mo41974a(aVar);
        this.f39408b.mo24397a(aVar.f39410b);
        this.f39407a.mo24192a(aVar);
    }
}
