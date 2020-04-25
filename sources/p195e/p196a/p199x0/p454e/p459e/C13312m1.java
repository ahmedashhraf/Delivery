package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.m1 */
/* compiled from: ObservableIgnoreElements */
public final class C13312m1<T> extends C13131a<T, T> {

    /* renamed from: e.a.x0.e.e.m1$a */
    /* compiled from: ObservableIgnoreElements */
    static final class C13313a<T> implements C12280i0<T>, C12314c {

        /* renamed from: a */
        final C12280i0<? super T> f38476a;

        /* renamed from: b */
        C12314c f38477b;

        C13313a(C12280i0<? super T> i0Var) {
            this.f38476a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38477b = cVar;
            this.f38476a.mo34123a((C12314c) this);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38477b.mo41878d();
        }

        public void dispose() {
            this.f38477b.dispose();
        }

        public void onComplete() {
            this.f38476a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38476a.onError(th);
        }
    }

    public C13312m1(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13313a(i0Var));
    }
}
