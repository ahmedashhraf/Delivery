package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.s */
/* compiled from: SingleDoOnSuccess */
public final class C13633s<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39447a;

    /* renamed from: b */
    final C12331g<? super T> f39448b;

    /* renamed from: e.a.x0.e.g.s$a */
    /* compiled from: SingleDoOnSuccess */
    final class C13634a implements C12292n0<T> {

        /* renamed from: a */
        private final C12292n0<? super T> f39449a;

        C13634a(C12292n0<? super T> n0Var) {
            this.f39449a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39449a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            this.f39449a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C13633s.this.f39448b.mo33410c(t);
                this.f39449a.onSuccess(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39449a.onError(th);
            }
        }
    }

    public C13633s(C5930q0<T> q0Var, C12331g<? super T> gVar) {
        this.f39447a = q0Var;
        this.f39448b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39447a.mo24192a(new C13634a(n0Var));
    }
}
