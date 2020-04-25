package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.v */
/* compiled from: SingleFlatMap */
public final class C13646v<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final C5930q0<? extends T> f39481a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f39482b;

    /* renamed from: e.a.x0.e.g.v$a */
    /* compiled from: SingleFlatMap */
    static final class C13647a<T, R> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: a */
        final C12292n0<? super R> f39483a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f39484b;

        /* renamed from: e.a.x0.e.g.v$a$a */
        /* compiled from: SingleFlatMap */
        static final class C13648a<R> implements C12292n0<R> {

            /* renamed from: a */
            final AtomicReference<C12314c> f39485a;

            /* renamed from: b */
            final C12292n0<? super R> f39486b;

            C13648a(AtomicReference<C12314c> atomicReference, C12292n0<? super R> n0Var) {
                this.f39485a = atomicReference;
                this.f39486b = n0Var;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55466a(this.f39485a, cVar);
            }

            public void onError(Throwable th) {
                this.f39486b.onError(th);
            }

            public void onSuccess(R r) {
                this.f39486b.onSuccess(r);
            }
        }

        C13647a(C12292n0<? super R> n0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
            this.f39483a = n0Var;
            this.f39484b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39483a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            this.f39483a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f39484b.apply(t), "The single returned by the mapper is null");
                if (!mo41878d()) {
                    q0Var.mo24192a(new C13648a(this, this.f39483a));
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39483a.onError(th);
            }
        }
    }

    public C13646v(C5930q0<? extends T> q0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        this.f39482b = oVar;
        this.f39481a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        this.f39481a.mo24192a(new C13647a(n0Var, this.f39482b));
    }
}
