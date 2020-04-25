package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.g.l */
/* compiled from: SingleDoAfterSuccess */
public final class C13603l<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39383a;

    /* renamed from: b */
    final C12331g<? super T> f39384b;

    /* renamed from: e.a.x0.e.g.l$a */
    /* compiled from: SingleDoAfterSuccess */
    static final class C13604a<T> implements C12292n0<T>, C12314c {

        /* renamed from: N */
        C12314c f39385N;

        /* renamed from: a */
        final C12292n0<? super T> f39386a;

        /* renamed from: b */
        final C12331g<? super T> f39387b;

        C13604a(C12292n0<? super T> n0Var, C12331g<? super T> gVar) {
            this.f39386a = n0Var;
            this.f39387b = gVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39385N, cVar)) {
                this.f39385N = cVar;
                this.f39386a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39385N.mo41878d();
        }

        public void dispose() {
            this.f39385N.dispose();
        }

        public void onError(Throwable th) {
            this.f39386a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39386a.onSuccess(t);
            try {
                this.f39387b.mo33410c(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C13603l(C5930q0<T> q0Var, C12331g<? super T> gVar) {
        this.f39383a = q0Var;
        this.f39384b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39383a.mo24192a(new C13604a(n0Var, this.f39384b));
    }
}
