package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.g.p */
/* compiled from: SingleDoOnError */
public final class C13621p<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39426a;

    /* renamed from: b */
    final C12331g<? super Throwable> f39427b;

    /* renamed from: e.a.x0.e.g.p$a */
    /* compiled from: SingleDoOnError */
    final class C13622a implements C12292n0<T> {

        /* renamed from: a */
        private final C12292n0<? super T> f39428a;

        C13622a(C12292n0<? super T> n0Var) {
            this.f39428a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39428a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            try {
                C13621p.this.f39427b.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f39428a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39428a.onSuccess(t);
        }
    }

    public C13621p(C5930q0<T> q0Var, C12331g<? super Throwable> gVar) {
        this.f39426a = q0Var;
        this.f39427b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39426a.mo24192a(new C13622a(n0Var));
    }
}
