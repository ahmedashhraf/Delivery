package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5925c;
import p195e.p196a.C5926g0;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.r */
/* compiled from: CompletableFromObservable */
public final class C12495r<T> extends C5925c {

    /* renamed from: a */
    final C5926g0<T> f35786a;

    /* renamed from: e.a.x0.e.a.r$a */
    /* compiled from: CompletableFromObservable */
    static final class C12496a<T> implements C12280i0<T> {

        /* renamed from: a */
        final C12268f f35787a;

        C12496a(C12268f fVar) {
            this.f35787a = fVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f35787a.mo41921a(cVar);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
        }

        public void onComplete() {
            this.f35787a.onComplete();
        }

        public void onError(Throwable th) {
            this.f35787a.onError(th);
        }
    }

    public C12495r(C5926g0<T> g0Var) {
        this.f35786a = g0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35786a.mo23893a(new C12496a(fVar));
    }
}
