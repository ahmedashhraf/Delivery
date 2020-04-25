package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

@C5936e
/* renamed from: e.a.x0.e.g.k */
/* compiled from: SingleDetach */
public final class C13599k<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39375a;

    /* renamed from: e.a.x0.e.g.k$a */
    /* compiled from: SingleDetach */
    static final class C13600a<T> implements C12292n0<T>, C12314c {

        /* renamed from: a */
        C12292n0<? super T> f39376a;

        /* renamed from: b */
        C12314c f39377b;

        C13600a(C12292n0<? super T> n0Var) {
            this.f39376a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39377b, cVar)) {
                this.f39377b = cVar;
                this.f39376a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39377b.mo41878d();
        }

        public void dispose() {
            this.f39376a = null;
            this.f39377b.dispose();
            this.f39377b = C12347d.DISPOSED;
        }

        public void onError(Throwable th) {
            this.f39377b = C12347d.DISPOSED;
            C12292n0<? super T> n0Var = this.f39376a;
            if (n0Var != null) {
                this.f39376a = null;
                n0Var.onError(th);
            }
        }

        public void onSuccess(T t) {
            this.f39377b = C12347d.DISPOSED;
            C12292n0<? super T> n0Var = this.f39376a;
            if (n0Var != null) {
                this.f39376a = null;
                n0Var.onSuccess(t);
            }
        }
    }

    public C13599k(C5930q0<T> q0Var) {
        this.f39375a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39375a.mo24192a(new C13600a(n0Var));
    }
}
