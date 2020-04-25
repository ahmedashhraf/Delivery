package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.o0 */
/* compiled from: SingleTimeout */
public final class C13618o0<T> extends C5928k0<T> {

    /* renamed from: N */
    final TimeUnit f39416N;

    /* renamed from: O */
    final C12282j0 f39417O;

    /* renamed from: P */
    final C5930q0<? extends T> f39418P;

    /* renamed from: a */
    final C5930q0<T> f39419a;

    /* renamed from: b */
    final long f39420b;

    /* renamed from: e.a.x0.e.g.o0$a */
    /* compiled from: SingleTimeout */
    static final class C13619a<T> extends AtomicReference<C12314c> implements C12292n0<T>, Runnable, C12314c {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: N */
        final C13620a<T> f39421N;

        /* renamed from: O */
        C5930q0<? extends T> f39422O;

        /* renamed from: a */
        final C12292n0<? super T> f39423a;

        /* renamed from: b */
        final AtomicReference<C12314c> f39424b = new AtomicReference<>();

        /* renamed from: e.a.x0.e.g.o0$a$a */
        /* compiled from: SingleTimeout */
        static final class C13620a<T> extends AtomicReference<C12314c> implements C12292n0<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: a */
            final C12292n0<? super T> f39425a;

            C13620a(C12292n0<? super T> n0Var) {
                this.f39425a = n0Var;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onError(Throwable th) {
                this.f39425a.onError(th);
            }

            public void onSuccess(T t) {
                this.f39425a.onSuccess(t);
            }
        }

        C13619a(C12292n0<? super T> n0Var, C5930q0<? extends T> q0Var) {
            this.f39423a = n0Var;
            this.f39422O = q0Var;
            if (q0Var != null) {
                this.f39421N = new C13620a<>(n0Var);
            } else {
                this.f39421N = null;
            }
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
            C12347d.m55465a(this.f39424b);
            C13620a<T> aVar = this.f39421N;
            if (aVar != null) {
                C12347d.m55465a((AtomicReference<C12314c>) aVar);
            }
        }

        public void onError(Throwable th) {
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar == dVar || !compareAndSet(cVar, dVar)) {
                C12205a.m54894b(th);
                return;
            }
            C12347d.m55465a(this.f39424b);
            this.f39423a.onError(th);
        }

        public void onSuccess(T t) {
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar != dVar && compareAndSet(cVar, dVar)) {
                C12347d.m55465a(this.f39424b);
                this.f39423a.onSuccess(t);
            }
        }

        public void run() {
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar != dVar && compareAndSet(cVar, dVar)) {
                if (cVar != null) {
                    cVar.dispose();
                }
                C5930q0<? extends T> q0Var = this.f39422O;
                if (q0Var == null) {
                    this.f39423a.onError(new TimeoutException());
                    return;
                }
                this.f39422O = null;
                q0Var.mo24192a(this.f39421N);
            }
        }
    }

    public C13618o0(C5930q0<T> q0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, C5930q0<? extends T> q0Var2) {
        this.f39419a = q0Var;
        this.f39420b = j;
        this.f39416N = timeUnit;
        this.f39417O = j0Var;
        this.f39418P = q0Var2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C13619a aVar = new C13619a(n0Var, this.f39418P);
        n0Var.mo41974a(aVar);
        C12347d.m55466a(aVar.f39424b, this.f39417O.mo42023a(aVar, this.f39420b, this.f39416N));
        this.f39419a.mo24192a(aVar);
    }
}
