package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.c4 */
/* compiled from: ObservableUsing */
public final class C13169c4<T, D> extends C5923b0<T> {

    /* renamed from: N */
    final C12331g<? super D> f37971N;

    /* renamed from: O */
    final boolean f37972O;

    /* renamed from: a */
    final Callable<? extends D> f37973a;

    /* renamed from: b */
    final C12339o<? super D, ? extends C5926g0<? extends T>> f37974b;

    /* renamed from: e.a.x0.e.e.c4$a */
    /* compiled from: ObservableUsing */
    static final class C13170a<T, D> extends AtomicBoolean implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: N */
        final C12331g<? super D> f37975N;

        /* renamed from: O */
        final boolean f37976O;

        /* renamed from: P */
        C12314c f37977P;

        /* renamed from: a */
        final C12280i0<? super T> f37978a;

        /* renamed from: b */
        final D f37979b;

        C13170a(C12280i0<? super T> i0Var, D d, C12331g<? super D> gVar, boolean z) {
            this.f37978a = i0Var;
            this.f37979b = d;
            this.f37975N = gVar;
            this.f37976O = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37977P, cVar)) {
                this.f37977P = cVar;
                this.f37978a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            mo42698a();
            this.f37977P.dispose();
        }

        public void onComplete() {
            if (this.f37976O) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f37975N.mo33410c(this.f37979b);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37978a.onError(th);
                        return;
                    }
                }
                this.f37977P.dispose();
                this.f37978a.onComplete();
            } else {
                this.f37978a.onComplete();
                this.f37977P.dispose();
                mo42698a();
            }
        }

        public void onError(Throwable th) {
            if (this.f37976O) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f37975N.mo33410c(this.f37979b);
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f37977P.dispose();
                this.f37978a.onError(th);
                return;
            }
            this.f37978a.onError(th);
            this.f37977P.dispose();
            mo42698a();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37978a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42698a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f37975N.mo33410c(this.f37979b);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C13169c4(Callable<? extends D> callable, C12339o<? super D, ? extends C5926g0<? extends T>> oVar, C12331g<? super D> gVar, boolean z) {
        this.f37973a = callable;
        this.f37974b = oVar;
        this.f37971N = gVar;
        this.f37972O = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            Object call = this.f37973a.call();
            try {
                ((C5926g0) C12390b.m55563a(this.f37974b.apply(call), "The sourceSupplier returned a null ObservableSource")).mo23893a(new C13170a(i0Var, call, this.f37971N, this.f37972O));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a((Throwable) new CompositeException(th, th), i0Var);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55476a(th2, i0Var);
        }
    }
}
