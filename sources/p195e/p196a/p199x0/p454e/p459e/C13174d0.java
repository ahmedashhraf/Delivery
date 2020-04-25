package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p467z0.C13787e;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.d0 */
/* compiled from: ObservableDebounce */
public final class C13174d0<T, U> extends C13131a<T, T> {

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<U>> f37985b;

    /* renamed from: e.a.x0.e.e.d0$a */
    /* compiled from: ObservableDebounce */
    static final class C13175a<T, U> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f37986N;

        /* renamed from: O */
        final AtomicReference<C12314c> f37987O = new AtomicReference<>();

        /* renamed from: P */
        volatile long f37988P;

        /* renamed from: Q */
        boolean f37989Q;

        /* renamed from: a */
        final C12280i0<? super T> f37990a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<U>> f37991b;

        /* renamed from: e.a.x0.e.e.d0$a$a */
        /* compiled from: ObservableDebounce */
        static final class C13176a<T, U> extends C13787e<U> {

            /* renamed from: N */
            final long f37992N;

            /* renamed from: O */
            final T f37993O;

            /* renamed from: P */
            boolean f37994P;

            /* renamed from: Q */
            final AtomicBoolean f37995Q = new AtomicBoolean();

            /* renamed from: b */
            final C13175a<T, U> f37996b;

            C13176a(C13175a<T, U> aVar, long j, T t) {
                this.f37996b = aVar;
                this.f37992N = j;
                this.f37993O = t;
            }

            /* renamed from: a */
            public void mo33453a(U u) {
                if (!this.f37994P) {
                    this.f37994P = true;
                    dispose();
                    mo42705c();
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public void mo42705c() {
                if (this.f37995Q.compareAndSet(false, true)) {
                    this.f37996b.mo42704a(this.f37992N, this.f37993O);
                }
            }

            public void onComplete() {
                if (!this.f37994P) {
                    this.f37994P = true;
                    mo42705c();
                }
            }

            public void onError(Throwable th) {
                if (this.f37994P) {
                    C12205a.m54894b(th);
                    return;
                }
                this.f37994P = true;
                this.f37996b.onError(th);
            }
        }

        C13175a(C12280i0<? super T> i0Var, C12339o<? super T, ? extends C5926g0<U>> oVar) {
            this.f37990a = i0Var;
            this.f37991b = oVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37986N, cVar)) {
                this.f37986N = cVar;
                this.f37990a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37986N.mo41878d();
        }

        public void dispose() {
            this.f37986N.dispose();
            C12347d.m55465a(this.f37987O);
        }

        public void onComplete() {
            if (!this.f37989Q) {
                this.f37989Q = true;
                C12314c cVar = (C12314c) this.f37987O.get();
                if (cVar != C12347d.DISPOSED) {
                    ((C13176a) cVar).mo42705c();
                    C12347d.m55465a(this.f37987O);
                    this.f37990a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f37987O);
            this.f37990a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f37989Q) {
                long j = this.f37988P + 1;
                this.f37988P = j;
                C12314c cVar = (C12314c) this.f37987O.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                try {
                    C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f37991b.apply(t), "The ObservableSource supplied is null");
                    C13176a aVar = new C13176a(this, j, t);
                    if (this.f37987O.compareAndSet(cVar, aVar)) {
                        g0Var.mo23893a(aVar);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    dispose();
                    this.f37990a.onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42704a(long j, T t) {
            if (j == this.f37988P) {
                this.f37990a.mo33453a(t);
            }
        }
    }

    public C13174d0(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<U>> oVar) {
        super(g0Var);
        this.f37985b = oVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13175a(new C13795m(i0Var), this.f37985b));
    }
}
