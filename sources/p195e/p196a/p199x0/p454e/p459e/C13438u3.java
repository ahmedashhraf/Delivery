package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.u3 */
/* compiled from: ObservableThrottleFirstTimed */
public final class C13438u3<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f38882N;

    /* renamed from: O */
    final C12282j0 f38883O;

    /* renamed from: b */
    final long f38884b;

    /* renamed from: e.a.x0.e.e.u3$a */
    /* compiled from: ObservableThrottleFirstTimed */
    static final class C13439a<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: N */
        final TimeUnit f38885N;

        /* renamed from: O */
        final C12285c f38886O;

        /* renamed from: P */
        C12314c f38887P;

        /* renamed from: Q */
        volatile boolean f38888Q;

        /* renamed from: R */
        boolean f38889R;

        /* renamed from: a */
        final C12280i0<? super T> f38890a;

        /* renamed from: b */
        final long f38891b;

        C13439a(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12285c cVar) {
            this.f38890a = i0Var;
            this.f38891b = j;
            this.f38885N = timeUnit;
            this.f38886O = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38887P, cVar)) {
                this.f38887P = cVar;
                this.f38890a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38886O.mo41878d();
        }

        public void dispose() {
            this.f38887P.dispose();
            this.f38886O.dispose();
        }

        public void onComplete() {
            if (!this.f38889R) {
                this.f38889R = true;
                this.f38890a.onComplete();
                this.f38886O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f38889R) {
                C12205a.m54894b(th);
                return;
            }
            this.f38889R = true;
            this.f38890a.onError(th);
            this.f38886O.dispose();
        }

        public void run() {
            this.f38888Q = false;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38888Q && !this.f38889R) {
                this.f38888Q = true;
                this.f38890a.mo33453a(t);
                C12314c cVar = (C12314c) get();
                if (cVar != null) {
                    cVar.dispose();
                }
                C12347d.m55466a((AtomicReference<C12314c>) this, this.f38886O.mo41877a(this, this.f38891b, this.f38885N));
            }
        }
    }

    public C13438u3(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        super(g0Var);
        this.f38884b = j;
        this.f38882N = timeUnit;
        this.f38883O = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13439a aVar = new C13439a(new C13795m(i0Var), this.f38884b, this.f38882N, this.f38883O.mo41871a());
        g0Var.mo23893a(aVar);
    }
}
