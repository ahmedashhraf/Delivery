package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.g.q */
/* compiled from: SingleDoOnEvent */
public final class C13625q<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39434a;

    /* renamed from: b */
    final C12326b<? super T, ? super Throwable> f39435b;

    /* renamed from: e.a.x0.e.g.q$a */
    /* compiled from: SingleDoOnEvent */
    final class C13626a implements C12292n0<T> {

        /* renamed from: a */
        private final C12292n0<? super T> f39436a;

        C13626a(C12292n0<? super T> n0Var) {
            this.f39436a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39436a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            try {
                C13625q.this.f39435b.mo42088a(null, th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f39436a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                C13625q.this.f39435b.mo42088a(t, null);
                this.f39436a.onSuccess(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39436a.onError(th);
            }
        }
    }

    public C13625q(C5930q0<T> q0Var, C12326b<? super T, ? super Throwable> bVar) {
        this.f39434a = q0Var;
        this.f39435b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39434a.mo24192a(new C13626a(n0Var));
    }
}
