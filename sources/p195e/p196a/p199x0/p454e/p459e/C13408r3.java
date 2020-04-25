package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12344a;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.r3 */
/* compiled from: ObservableTakeUntil */
public final class C13408r3<T, U> extends C13131a<T, T> {

    /* renamed from: b */
    final C5926g0<? extends U> f38787b;

    /* renamed from: e.a.x0.e.e.r3$a */
    /* compiled from: ObservableTakeUntil */
    final class C13409a implements C12280i0<U> {

        /* renamed from: a */
        private final C12344a f38789a;

        /* renamed from: b */
        private final C13795m<T> f38790b;

        C13409a(C12344a aVar, C13795m<T> mVar) {
            this.f38789a = aVar;
            this.f38790b = mVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38789a.mo42103b(1, cVar);
        }

        public void onComplete() {
            this.f38789a.dispose();
            this.f38790b.onComplete();
        }

        public void onError(Throwable th) {
            this.f38789a.dispose();
            this.f38790b.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            this.f38789a.dispose();
            this.f38790b.onComplete();
        }
    }

    /* renamed from: e.a.x0.e.e.r3$b */
    /* compiled from: ObservableTakeUntil */
    static final class C13410b<T> extends AtomicBoolean implements C12280i0<T> {
        private static final long serialVersionUID = 3451719290311127173L;

        /* renamed from: N */
        C12314c f38791N;

        /* renamed from: a */
        final C12280i0<? super T> f38792a;

        /* renamed from: b */
        final C12344a f38793b;

        C13410b(C12280i0<? super T> i0Var, C12344a aVar) {
            this.f38792a = i0Var;
            this.f38793b = aVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38791N, cVar)) {
                this.f38791N = cVar;
                this.f38793b.mo42103b(0, cVar);
            }
        }

        public void onComplete() {
            this.f38793b.dispose();
            this.f38792a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38793b.dispose();
            this.f38792a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38792a.mo33453a(t);
        }
    }

    public C13408r3(C5926g0<T> g0Var, C5926g0<? extends U> g0Var2) {
        super(g0Var);
        this.f38787b = g0Var2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        C12344a aVar = new C12344a(2);
        C13410b bVar = new C13410b(mVar, aVar);
        i0Var.mo34123a((C12314c) aVar);
        this.f38787b.mo23893a(new C13409a(aVar, mVar));
        this.f37851a.mo23893a(bVar);
    }
}
