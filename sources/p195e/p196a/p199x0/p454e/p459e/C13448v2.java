package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.v2 */
/* compiled from: ObservableSampleTimed */
public final class C13448v2<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f38924N;

    /* renamed from: O */
    final C12282j0 f38925O;

    /* renamed from: P */
    final boolean f38926P;

    /* renamed from: b */
    final long f38927b;

    /* renamed from: e.a.x0.e.e.v2$a */
    /* compiled from: ObservableSampleTimed */
    static final class C13449a<T> extends C13451c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: R */
        final AtomicInteger f38928R = new AtomicInteger(1);

        C13449a(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(i0Var, j, timeUnit, j0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42909e() {
            mo42913f();
            if (this.f38928R.decrementAndGet() == 0) {
                this.f38933a.onComplete();
            }
        }

        public void run() {
            if (this.f38928R.incrementAndGet() == 2) {
                mo42913f();
                if (this.f38928R.decrementAndGet() == 0) {
                    this.f38933a.onComplete();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.v2$b */
    /* compiled from: ObservableSampleTimed */
    static final class C13450b<T> extends C13451c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        C13450b(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(i0Var, j, timeUnit, j0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42909e() {
            this.f38933a.onComplete();
        }

        public void run() {
            mo42913f();
        }
    }

    /* renamed from: e.a.x0.e.e.v2$c */
    /* compiled from: ObservableSampleTimed */
    static abstract class C13451c<T> extends AtomicReference<T> implements C12280i0<T>, C12314c, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: N */
        final TimeUnit f38929N;

        /* renamed from: O */
        final C12282j0 f38930O;

        /* renamed from: P */
        final AtomicReference<C12314c> f38931P = new AtomicReference<>();

        /* renamed from: Q */
        C12314c f38932Q;

        /* renamed from: a */
        final C12280i0<? super T> f38933a;

        /* renamed from: b */
        final long f38934b;

        C13451c(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38933a = i0Var;
            this.f38934b = j;
            this.f38929N = timeUnit;
            this.f38930O = j0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38932Q, cVar)) {
                this.f38932Q = cVar;
                this.f38933a.mo34123a((C12314c) this);
                C12282j0 j0Var = this.f38930O;
                long j = this.f38934b;
                C12347d.m55466a(this.f38931P, j0Var.mo42022a(this, j, j, this.f38929N));
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38932Q.mo41878d();
        }

        public void dispose() {
            mo42912a();
            this.f38932Q.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42909e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42913f() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f38933a.mo33453a(andSet);
            }
        }

        public void onComplete() {
            mo42912a();
            mo42909e();
        }

        public void onError(Throwable th) {
            mo42912a();
            this.f38933a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            lazySet(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42912a() {
            C12347d.m55465a(this.f38931P);
        }
    }

    public C13448v2(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        super(g0Var);
        this.f38927b = j;
        this.f38924N = timeUnit;
        this.f38925O = j0Var;
        this.f38926P = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        if (this.f38926P) {
            C5926g0<T> g0Var = this.f37851a;
            C13449a aVar = new C13449a(mVar, this.f38927b, this.f38924N, this.f38925O);
            g0Var.mo23893a(aVar);
            return;
        }
        C5926g0<T> g0Var2 = this.f37851a;
        C13450b bVar = new C13450b(mVar, this.f38927b, this.f38924N, this.f38925O);
        g0Var2.mo23893a(bVar);
    }
}
