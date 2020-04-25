package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.s0 */
/* compiled from: SingleUnsubscribeOn */
public final class C13635s0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39451a;

    /* renamed from: b */
    final C12282j0 f39452b;

    /* renamed from: e.a.x0.e.g.s0$a */
    /* compiled from: SingleUnsubscribeOn */
    static final class C13636a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* renamed from: N */
        C12314c f39453N;

        /* renamed from: a */
        final C12292n0<? super T> f39454a;

        /* renamed from: b */
        final C12282j0 f39455b;

        C13636a(C12292n0<? super T> n0Var, C12282j0 j0Var) {
            this.f39454a = n0Var;
            this.f39455b = j0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39454a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12314c cVar = (C12314c) getAndSet(C12347d.DISPOSED);
            if (cVar != C12347d.DISPOSED) {
                this.f39453N = cVar;
                this.f39455b.mo42021a((Runnable) this);
            }
        }

        public void onError(Throwable th) {
            this.f39454a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39454a.onSuccess(t);
        }

        public void run() {
            this.f39453N.dispose();
        }
    }

    public C13635s0(C5930q0<T> q0Var, C12282j0 j0Var) {
        this.f39451a = q0Var;
        this.f39452b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39451a.mo24192a(new C13636a(n0Var, this.f39452b));
    }
}
