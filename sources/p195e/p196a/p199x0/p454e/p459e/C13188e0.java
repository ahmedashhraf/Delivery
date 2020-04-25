package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.e0 */
/* compiled from: ObservableDebounceTimed */
public final class C13188e0<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f38047N;

    /* renamed from: O */
    final C12282j0 f38048O;

    /* renamed from: b */
    final long f38049b;

    /* renamed from: e.a.x0.e.e.e0$a */
    /* compiled from: ObservableDebounceTimed */
    static final class C13189a<T> extends AtomicReference<C12314c> implements Runnable, C12314c {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: N */
        final C13190b<T> f38050N;

        /* renamed from: O */
        final AtomicBoolean f38051O = new AtomicBoolean();

        /* renamed from: a */
        final T f38052a;

        /* renamed from: b */
        final long f38053b;

        C13189a(T t, long j, C13190b<T> bVar) {
            this.f38052a = t;
            this.f38053b = j;
            this.f38050N = bVar;
        }

        /* renamed from: a */
        public void mo42721a(C12314c cVar) {
            C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void run() {
            if (this.f38051O.compareAndSet(false, true)) {
                this.f38050N.mo42723a(this.f38053b, this.f38052a, this);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.e0$b */
    /* compiled from: ObservableDebounceTimed */
    static final class C13190b<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final TimeUnit f38054N;

        /* renamed from: O */
        final C12285c f38055O;

        /* renamed from: P */
        C12314c f38056P;

        /* renamed from: Q */
        C12314c f38057Q;

        /* renamed from: R */
        volatile long f38058R;

        /* renamed from: S */
        boolean f38059S;

        /* renamed from: a */
        final C12280i0<? super T> f38060a;

        /* renamed from: b */
        final long f38061b;

        C13190b(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12285c cVar) {
            this.f38060a = i0Var;
            this.f38061b = j;
            this.f38054N = timeUnit;
            this.f38055O = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38056P, cVar)) {
                this.f38056P = cVar;
                this.f38060a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38055O.mo41878d();
        }

        public void dispose() {
            this.f38056P.dispose();
            this.f38055O.dispose();
        }

        public void onComplete() {
            if (!this.f38059S) {
                this.f38059S = true;
                C12314c cVar = this.f38057Q;
                if (cVar != null) {
                    cVar.dispose();
                }
                C13189a aVar = (C13189a) cVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f38060a.onComplete();
                this.f38055O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f38059S) {
                C12205a.m54894b(th);
                return;
            }
            C12314c cVar = this.f38057Q;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f38059S = true;
            this.f38060a.onError(th);
            this.f38055O.dispose();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38059S) {
                long j = this.f38058R + 1;
                this.f38058R = j;
                C12314c cVar = this.f38057Q;
                if (cVar != null) {
                    cVar.dispose();
                }
                C13189a aVar = new C13189a(t, j, this);
                this.f38057Q = aVar;
                aVar.mo42721a(this.f38055O.mo41877a(aVar, this.f38061b, this.f38054N));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42723a(long j, T t, C13189a<T> aVar) {
            if (j == this.f38058R) {
                this.f38060a.mo33453a(t);
                aVar.dispose();
            }
        }
    }

    public C13188e0(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        super(g0Var);
        this.f38049b = j;
        this.f38047N = timeUnit;
        this.f38048O = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13190b bVar = new C13190b(new C13795m(i0Var), this.f38049b, this.f38047N, this.f38048O.mo41871a());
        g0Var.mo23893a(bVar);
    }
}
