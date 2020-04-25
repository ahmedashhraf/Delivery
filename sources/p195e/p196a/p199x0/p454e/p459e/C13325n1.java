package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5925c;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.n1 */
/* compiled from: ObservableIgnoreElementsCompletable */
public final class C13325n1<T> extends C5925c implements C12395d<T> {

    /* renamed from: a */
    final C5926g0<T> f38526a;

    /* renamed from: e.a.x0.e.e.n1$a */
    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class C13326a<T> implements C12280i0<T>, C12314c {

        /* renamed from: a */
        final C12268f f38527a;

        /* renamed from: b */
        C12314c f38528b;

        C13326a(C12268f fVar) {
            this.f38527a = fVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38528b = cVar;
            this.f38527a.mo41921a(this);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38528b.mo41878d();
        }

        public void dispose() {
            this.f38528b.dispose();
        }

        public void onComplete() {
            this.f38527a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38527a.onError(th);
        }
    }

    public C13325n1(C5926g0<T> g0Var) {
        this.f38526a = g0Var;
    }

    /* renamed from: a */
    public C5923b0<T> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13312m1<T>(this.f38526a));
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f38526a.mo23893a(new C13326a(fVar));
    }
}
