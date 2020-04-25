package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.g.q0 */
/* compiled from: SingleToFlowable */
public final class C13627q0<T> extends C5929l<T> {

    /* renamed from: b */
    final C5930q0<? extends T> f39438b;

    /* renamed from: e.a.x0.e.g.q0$a */
    /* compiled from: SingleToFlowable */
    static final class C13628a<T> extends C13738f<T> implements C12292n0<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: V */
        C12314c f39439V;

        C13628a(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39439V, cVar)) {
                this.f39439V = cVar;
                this.f39781a.mo41788a((C14063d) this);
            }
        }

        public void cancel() {
            super.cancel();
            this.f39439V.dispose();
        }

        public void onError(Throwable th) {
            this.f39781a.onError(th);
        }

        public void onSuccess(T t) {
            mo43123c(t);
        }
    }

    public C13627q0(C5930q0<? extends T> q0Var) {
        this.f39438b = q0Var;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f39438b.mo24192a(new C13628a(cVar));
    }
}
