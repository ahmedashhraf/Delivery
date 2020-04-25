package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.j0 */
/* compiled from: SingleObserveOn */
public final class C13597j0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39369a;

    /* renamed from: b */
    final C12282j0 f39370b;

    /* renamed from: e.a.x0.e.g.j0$a */
    /* compiled from: SingleObserveOn */
    static final class C13598a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: N */
        T f39371N;

        /* renamed from: O */
        Throwable f39372O;

        /* renamed from: a */
        final C12292n0<? super T> f39373a;

        /* renamed from: b */
        final C12282j0 f39374b;

        C13598a(C12292n0<? super T> n0Var, C12282j0 j0Var) {
            this.f39373a = n0Var;
            this.f39374b = j0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39373a.mo41974a(this);
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
            this.f39372O = th;
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f39374b.mo42021a((Runnable) this));
        }

        public void onSuccess(T t) {
            this.f39371N = t;
            C12347d.m55466a((AtomicReference<C12314c>) this, this.f39374b.mo42021a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f39372O;
            if (th != null) {
                this.f39373a.onError(th);
            } else {
                this.f39373a.onSuccess(this.f39371N);
            }
        }
    }

    public C13597j0(C5930q0<T> q0Var, C12282j0 j0Var) {
        this.f39369a = q0Var;
        this.f39370b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39369a.mo24192a(new C13598a(n0Var, this.f39370b));
    }
}
