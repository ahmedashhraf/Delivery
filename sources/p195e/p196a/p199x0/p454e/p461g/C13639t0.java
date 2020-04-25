package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.g.t0 */
/* compiled from: SingleUsing */
public final class C13639t0<T, U> extends C5928k0<T> {

    /* renamed from: N */
    final C12331g<? super U> f39463N;

    /* renamed from: O */
    final boolean f39464O;

    /* renamed from: a */
    final Callable<U> f39465a;

    /* renamed from: b */
    final C12339o<? super U, ? extends C5930q0<? extends T>> f39466b;

    /* renamed from: e.a.x0.e.g.t0$a */
    /* compiled from: SingleUsing */
    static final class C13640a<T, U> extends AtomicReference<Object> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = -5331524057054083935L;

        /* renamed from: N */
        final boolean f39467N;

        /* renamed from: O */
        C12314c f39468O;

        /* renamed from: a */
        final C12292n0<? super T> f39469a;

        /* renamed from: b */
        final C12331g<? super U> f39470b;

        C13640a(C12292n0<? super T> n0Var, U u, boolean z, C12331g<? super U> gVar) {
            super(u);
            this.f39469a = n0Var;
            this.f39467N = z;
            this.f39470b = gVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39468O, cVar)) {
                this.f39468O = cVar;
                this.f39469a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39468O.mo41878d();
        }

        public void dispose() {
            this.f39468O.dispose();
            this.f39468O = C12347d.DISPOSED;
            mo43011a();
        }

        public void onError(Throwable th) {
            this.f39468O = C12347d.DISPOSED;
            if (this.f39467N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f39470b.mo33410c(andSet);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        th = new CompositeException(th, th2);
                    }
                } else {
                    return;
                }
            }
            this.f39469a.onError(th);
            if (!this.f39467N) {
                mo43011a();
            }
        }

        public void onSuccess(T t) {
            this.f39468O = C12347d.DISPOSED;
            if (this.f39467N) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.f39470b.mo33410c(andSet);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f39469a.onError(th);
                    }
                }
                return;
            }
            this.f39469a.onSuccess(t);
            if (!this.f39467N) {
                mo43011a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43011a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f39470b.mo33410c(andSet);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C13639t0(Callable<U> callable, C12339o<? super U, ? extends C5930q0<? extends T>> oVar, C12331g<? super U> gVar, boolean z) {
        this.f39465a = callable;
        this.f39466b = oVar;
        this.f39463N = gVar;
        this.f39464O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        try {
            Object call = this.f39465a.call();
            try {
                ((C5930q0) C12390b.m55563a(this.f39466b.apply(call), "The singleFunction returned a null SingleSource")).mo24192a(new C13640a(n0Var, call, this.f39464O, this.f39463N));
                return;
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            C12348e.m55477a(th, n0Var);
            if (!this.f39464O) {
                this.f39463N.mo33410c(call);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55477a(th2, n0Var);
        }
    }
}
