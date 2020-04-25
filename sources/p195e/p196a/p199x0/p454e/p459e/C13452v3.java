package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p441d1.C12241d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.v3 */
/* compiled from: ObservableTimeInterval */
public final class C13452v3<T> extends C13131a<T, C12241d<T>> {

    /* renamed from: N */
    final TimeUnit f38935N;

    /* renamed from: b */
    final C12282j0 f38936b;

    /* renamed from: e.a.x0.e.e.v3$a */
    /* compiled from: ObservableTimeInterval */
    static final class C13453a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final C12282j0 f38937N;

        /* renamed from: O */
        long f38938O;

        /* renamed from: P */
        C12314c f38939P;

        /* renamed from: a */
        final C12280i0<? super C12241d<T>> f38940a;

        /* renamed from: b */
        final TimeUnit f38941b;

        C13453a(C12280i0<? super C12241d<T>> i0Var, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38940a = i0Var;
            this.f38937N = j0Var;
            this.f38941b = timeUnit;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38939P, cVar)) {
                this.f38939P = cVar;
                this.f38938O = this.f38937N.mo41870a(this.f38941b);
                this.f38940a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38939P.mo41878d();
        }

        public void dispose() {
            this.f38939P.dispose();
        }

        public void onComplete() {
            this.f38940a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38940a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long a = this.f38937N.mo41870a(this.f38941b);
            long j = this.f38938O;
            this.f38938O = a;
            this.f38940a.mo33453a(new C12241d(t, a - j, this.f38941b));
        }
    }

    public C13452v3(C5926g0<T> g0Var, TimeUnit timeUnit, C12282j0 j0Var) {
        super(g0Var);
        this.f38936b = j0Var;
        this.f38935N = timeUnit;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C12241d<T>> i0Var) {
        this.f37851a.mo23893a(new C13453a(i0Var, this.f38935N, this.f38936b));
    }
}
