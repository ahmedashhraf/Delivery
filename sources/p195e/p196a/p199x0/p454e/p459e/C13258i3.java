package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12344a;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.i3 */
/* compiled from: ObservableSkipUntil */
public final class C13258i3<T, U> extends C13131a<T, T> {

    /* renamed from: b */
    final C5926g0<U> f38293b;

    /* renamed from: e.a.x0.e.e.i3$a */
    /* compiled from: ObservableSkipUntil */
    final class C13259a implements C12280i0<U> {

        /* renamed from: N */
        private final C13795m<T> f38294N;

        /* renamed from: O */
        C12314c f38295O;

        /* renamed from: a */
        private final C12344a f38297a;

        /* renamed from: b */
        private final C13260b<T> f38298b;

        C13259a(C12344a aVar, C13260b<T> bVar, C13795m<T> mVar) {
            this.f38297a = aVar;
            this.f38298b = bVar;
            this.f38294N = mVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38295O, cVar)) {
                this.f38295O = cVar;
                this.f38297a.mo42103b(1, cVar);
            }
        }

        public void onComplete() {
            this.f38298b.f38300O = true;
        }

        public void onError(Throwable th) {
            this.f38297a.dispose();
            this.f38294N.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            this.f38295O.dispose();
            this.f38298b.f38300O = true;
        }
    }

    /* renamed from: e.a.x0.e.e.i3$b */
    /* compiled from: ObservableSkipUntil */
    static final class C13260b<T> implements C12280i0<T> {

        /* renamed from: N */
        C12314c f38299N;

        /* renamed from: O */
        volatile boolean f38300O;

        /* renamed from: P */
        boolean f38301P;

        /* renamed from: a */
        final C12280i0<? super T> f38302a;

        /* renamed from: b */
        final C12344a f38303b;

        C13260b(C12280i0<? super T> i0Var, C12344a aVar) {
            this.f38302a = i0Var;
            this.f38303b = aVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38299N, cVar)) {
                this.f38299N = cVar;
                this.f38303b.mo42103b(0, cVar);
            }
        }

        public void onComplete() {
            this.f38303b.dispose();
            this.f38302a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38303b.dispose();
            this.f38302a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38301P) {
                this.f38302a.mo33453a(t);
            } else if (this.f38300O) {
                this.f38301P = true;
                this.f38302a.mo33453a(t);
            }
        }
    }

    public C13258i3(C5926g0<T> g0Var, C5926g0<U> g0Var2) {
        super(g0Var);
        this.f38293b = g0Var2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        C12344a aVar = new C12344a(2);
        mVar.mo34123a((C12314c) aVar);
        C13260b bVar = new C13260b(mVar, aVar);
        this.f38293b.mo23893a(new C13259a(aVar, bVar, mVar));
        this.f37851a.mo23893a(bVar);
    }
}
