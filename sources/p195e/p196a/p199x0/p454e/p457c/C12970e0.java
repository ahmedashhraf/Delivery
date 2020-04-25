package p195e.p196a.p199x0.p454e.p457c;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.e0 */
/* compiled from: MaybeFlatMapSingle */
public final class C12970e0<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final C5941y<T> f37409a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37410b;

    /* renamed from: e.a.x0.e.c.e0$a */
    /* compiled from: MaybeFlatMapSingle */
    static final class C12971a<T, R> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4827726964688405508L;

        /* renamed from: a */
        final C12292n0<? super R> f37411a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37412b;

        C12971a(C12292n0<? super R> n0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
            this.f37411a = n0Var;
            this.f37412b = oVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37411a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f37411a.onError(new NoSuchElementException());
        }

        public void onError(Throwable th) {
            this.f37411a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37412b.apply(t), "The mapper returned a null SingleSource");
                if (!mo41878d()) {
                    q0Var.mo24192a(new C12972b(this, this.f37411a));
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    /* renamed from: e.a.x0.e.c.e0$b */
    /* compiled from: MaybeFlatMapSingle */
    static final class C12972b<R> implements C12292n0<R> {

        /* renamed from: a */
        final AtomicReference<C12314c> f37413a;

        /* renamed from: b */
        final C12292n0<? super R> f37414b;

        C12972b(AtomicReference<C12314c> atomicReference, C12292n0<? super R> n0Var) {
            this.f37413a = atomicReference;
            this.f37414b = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55466a(this.f37413a, cVar);
        }

        public void onError(Throwable th) {
            this.f37414b.onError(th);
        }

        public void onSuccess(R r) {
            this.f37414b.onSuccess(r);
        }
    }

    public C12970e0(C5941y<T> yVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        this.f37409a = yVar;
        this.f37410b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        this.f37409a.mo24639a(new C12971a(n0Var, this.f37410b));
    }
}
