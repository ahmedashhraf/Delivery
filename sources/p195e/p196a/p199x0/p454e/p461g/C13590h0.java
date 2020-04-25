package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.h0 */
/* compiled from: SingleMap */
public final class C13590h0<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final C5930q0<? extends T> f39354a;

    /* renamed from: b */
    final C12339o<? super T, ? extends R> f39355b;

    /* renamed from: e.a.x0.e.g.h0$a */
    /* compiled from: SingleMap */
    static final class C13591a<T, R> implements C12292n0<T> {

        /* renamed from: a */
        final C12292n0<? super R> f39356a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f39357b;

        C13591a(C12292n0<? super R> n0Var, C12339o<? super T, ? extends R> oVar) {
            this.f39356a = n0Var;
            this.f39357b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39356a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            this.f39356a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                this.f39356a.onSuccess(C12390b.m55563a(this.f39357b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                onError(th);
            }
        }
    }

    public C13590h0(C5930q0<? extends T> q0Var, C12339o<? super T, ? extends R> oVar) {
        this.f39354a = q0Var;
        this.f39355b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        this.f39354a.mo24192a(new C13591a(n0Var, this.f39355b));
    }
}
