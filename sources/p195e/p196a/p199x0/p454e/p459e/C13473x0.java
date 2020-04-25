package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.x0 */
/* compiled from: ObservableFlatMapCompletable */
public final class C13473x0<T> extends C13131a<T, T> {

    /* renamed from: N */
    final boolean f39017N;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f39018b;

    /* renamed from: e.a.x0.e.e.x0$a */
    /* compiled from: ObservableFlatMapCompletable */
    static final class C13474a<T> extends C12409b<T> implements C12280i0<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: N */
        final C12339o<? super T, ? extends C5927i> f39019N;

        /* renamed from: O */
        final boolean f39020O;

        /* renamed from: P */
        final C12313b f39021P = new C12313b();

        /* renamed from: Q */
        C12314c f39022Q;

        /* renamed from: R */
        volatile boolean f39023R;

        /* renamed from: a */
        final C12280i0<? super T> f39024a;

        /* renamed from: b */
        final C13746c f39025b = new C13746c();

        /* renamed from: e.a.x0.e.e.x0$a$a */
        /* compiled from: ObservableFlatMapCompletable */
        final class C13475a extends AtomicReference<C12314c> implements C12268f, C12314c {
            private static final long serialVersionUID = 8606673141535671828L;

            C13475a() {
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return C12347d.m55463a((C12314c) get());
            }

            public void dispose() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }

            public void onComplete() {
                C13474a.this.mo42936a(this);
            }

            public void onError(Throwable th) {
                C13474a.this.mo42937a(this, th);
            }
        }

        C13474a(C12280i0<? super T> i0Var, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
            this.f39024a = i0Var;
            this.f39019N = oVar;
            this.f39020O = z;
            lazySet(1);
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return i & 2;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39022Q, cVar)) {
                this.f39022Q = cVar;
                this.f39024a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39022Q.mo41878d();
        }

        public void dispose() {
            this.f39023R = true;
            this.f39022Q.dispose();
            this.f39021P.dispose();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable d = this.f39025b.mo43143d();
                if (d != null) {
                    this.f39024a.onError(d);
                } else {
                    this.f39024a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f39025b.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (!this.f39020O) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f39024a.onError(this.f39025b.mo43143d());
                }
            } else if (decrementAndGet() == 0) {
                this.f39024a.onError(this.f39025b.mo43143d());
            }
        }

        @C5938g
        public T poll() throws Exception {
            return null;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f39019N.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13475a aVar = new C13475a();
                if (!this.f39023R && this.f39021P.mo42072b(aVar)) {
                    iVar.mo24122a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39022Q.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42936a(C13475a aVar) {
            this.f39021P.mo42073c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42937a(C13475a aVar, Throwable th) {
            this.f39021P.mo42073c(aVar);
            onError(th);
        }
    }

    public C13473x0(C5926g0<T> g0Var, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
        super(g0Var);
        this.f39018b = oVar;
        this.f39017N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13474a(i0Var, this.f39018b, this.f39017N));
    }
}
