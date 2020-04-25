package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12433z;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.g.l0 */
/* compiled from: SingleResumeNext */
public final class C13605l0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<? extends T> f39388a;

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends C5930q0<? extends T>> f39389b;

    /* renamed from: e.a.x0.e.g.l0$a */
    /* compiled from: SingleResumeNext */
    static final class C13606a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final C12292n0<? super T> f39390a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends C5930q0<? extends T>> f39391b;

        C13606a(C12292n0<? super T> n0Var, C12339o<? super Throwable, ? extends C5930q0<? extends T>> oVar) {
            this.f39390a = n0Var;
            this.f39391b = oVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39390a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            try {
                ((C5930q0) C12390b.m55563a(this.f39391b.apply(th), "The nextFunction returned a null SingleSource.")).mo24192a(new C12433z(this, this.f39390a));
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39390a.onError(new CompositeException(th, th2));
            }
        }

        public void onSuccess(T t) {
            this.f39390a.onSuccess(t);
        }
    }

    public C13605l0(C5930q0<? extends T> q0Var, C12339o<? super Throwable, ? extends C5930q0<? extends T>> oVar) {
        this.f39388a = q0Var;
        this.f39389b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39388a.mo24192a(new C13606a(n0Var, this.f39389b));
    }
}
