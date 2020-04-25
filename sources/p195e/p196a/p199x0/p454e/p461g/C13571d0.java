package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.d0 */
/* compiled from: SingleHide */
public final class C13571d0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<? extends T> f39324a;

    /* renamed from: e.a.x0.e.g.d0$a */
    /* compiled from: SingleHide */
    static final class C13572a<T> implements C12292n0<T>, C12314c {

        /* renamed from: a */
        final C12292n0<? super T> f39325a;

        /* renamed from: b */
        C12314c f39326b;

        C13572a(C12292n0<? super T> n0Var) {
            this.f39325a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39326b, cVar)) {
                this.f39326b = cVar;
                this.f39325a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39326b.mo41878d();
        }

        public void dispose() {
            this.f39326b.dispose();
        }

        public void onError(Throwable th) {
            this.f39325a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39325a.onSuccess(t);
        }
    }

    public C13571d0(C5930q0<? extends T> q0Var) {
        this.f39324a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39324a.mo24192a(new C13572a(n0Var));
    }
}
