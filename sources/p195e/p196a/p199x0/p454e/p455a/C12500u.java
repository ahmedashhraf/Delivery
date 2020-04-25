package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C12292n0;
import p195e.p196a.C5925c;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.u */
/* compiled from: CompletableFromSingle */
public final class C12500u<T> extends C5925c {

    /* renamed from: a */
    final C5930q0<T> f35792a;

    /* renamed from: e.a.x0.e.a.u$a */
    /* compiled from: CompletableFromSingle */
    static final class C12501a<T> implements C12292n0<T> {

        /* renamed from: a */
        final C12268f f35793a;

        C12501a(C12268f fVar) {
            this.f35793a = fVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f35793a.mo41921a(cVar);
        }

        public void onError(Throwable th) {
            this.f35793a.onError(th);
        }

        public void onSuccess(T t) {
            this.f35793a.onComplete();
        }
    }

    public C12500u(C5930q0<T> q0Var) {
        this.f35792a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35792a.mo24192a(new C12501a(fVar));
    }
}
