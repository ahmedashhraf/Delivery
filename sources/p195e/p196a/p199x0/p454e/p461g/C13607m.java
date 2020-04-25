package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.m */
/* compiled from: SingleDoAfterTerminate */
public final class C13607m<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39392a;

    /* renamed from: b */
    final C12325a f39393b;

    /* renamed from: e.a.x0.e.g.m$a */
    /* compiled from: SingleDoAfterTerminate */
    static final class C13608a<T> implements C12292n0<T>, C12314c {

        /* renamed from: N */
        C12314c f39394N;

        /* renamed from: a */
        final C12292n0<? super T> f39395a;

        /* renamed from: b */
        final C12325a f39396b;

        C13608a(C12292n0<? super T> n0Var, C12325a aVar) {
            this.f39395a = n0Var;
            this.f39396b = aVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39394N, cVar)) {
                this.f39394N = cVar;
                this.f39395a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39394N.mo41878d();
        }

        public void dispose() {
            this.f39394N.dispose();
        }

        public void onError(Throwable th) {
            this.f39395a.onError(th);
            m58351a();
        }

        public void onSuccess(T t) {
            this.f39395a.onSuccess(t);
            m58351a();
        }

        /* renamed from: a */
        private void m58351a() {
            try {
                this.f39396b.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C13607m(C5930q0<T> q0Var, C12325a aVar) {
        this.f39392a = q0Var;
        this.f39393b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39392a.mo24192a(new C13608a(n0Var, this.f39393b));
    }
}
