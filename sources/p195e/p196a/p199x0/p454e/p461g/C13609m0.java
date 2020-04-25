package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.m0 */
/* compiled from: SingleSubscribeOn */
public final class C13609m0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<? extends T> f39397a;

    /* renamed from: b */
    final C12282j0 f39398b;

    /* renamed from: e.a.x0.e.g.m0$a */
    /* compiled from: SingleSubscribeOn */
    static final class C13610a<T> extends AtomicReference<C12314c> implements C12292n0<T>, C12314c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: N */
        final C5930q0<? extends T> f39399N;

        /* renamed from: a */
        final C12292n0<? super T> f39400a;

        /* renamed from: b */
        final C12350g f39401b = new C12350g();

        C13610a(C12292n0<? super T> n0Var, C5930q0<? extends T> q0Var) {
            this.f39400a = n0Var;
            this.f39399N = q0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f39401b.dispose();
        }

        public void onError(Throwable th) {
            this.f39400a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39400a.onSuccess(t);
        }

        public void run() {
            this.f39399N.mo24192a(this);
        }
    }

    public C13609m0(C5930q0<? extends T> q0Var, C12282j0 j0Var) {
        this.f39397a = q0Var;
        this.f39398b = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C13610a aVar = new C13610a(n0Var, this.f39397a);
        n0Var.mo41974a(aVar);
        aVar.f39401b.mo42109a(this.f39398b.mo42021a((Runnable) aVar));
    }
}
