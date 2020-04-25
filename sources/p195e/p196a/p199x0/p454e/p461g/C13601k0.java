package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.g.k0 */
/* compiled from: SingleOnErrorReturn */
public final class C13601k0<T> extends C5928k0<T> {

    /* renamed from: N */
    final T f39378N;

    /* renamed from: a */
    final C5930q0<? extends T> f39379a;

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends T> f39380b;

    /* renamed from: e.a.x0.e.g.k0$a */
    /* compiled from: SingleOnErrorReturn */
    final class C13602a implements C12292n0<T> {

        /* renamed from: a */
        private final C12292n0<? super T> f39381a;

        C13602a(C12292n0<? super T> n0Var) {
            this.f39381a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39381a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            T t;
            C13601k0 k0Var = C13601k0.this;
            C12339o<? super Throwable, ? extends T> oVar = k0Var.f39380b;
            if (oVar != null) {
                try {
                    t = oVar.apply(th);
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f39381a.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = k0Var.f39378N;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f39381a.onError(nullPointerException);
                return;
            }
            this.f39381a.onSuccess(t);
        }

        public void onSuccess(T t) {
            this.f39381a.onSuccess(t);
        }
    }

    public C13601k0(C5930q0<? extends T> q0Var, C12339o<? super Throwable, ? extends T> oVar, T t) {
        this.f39379a = q0Var;
        this.f39380b = oVar;
        this.f39378N = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39379a.mo24192a(new C13602a(n0Var));
    }
}
