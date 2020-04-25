package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.e1 */
/* compiled from: MaybeSwitchIfEmptySingle */
public final class C12973e1<T> extends C5928k0<T> implements C12397f<T> {

    /* renamed from: a */
    final C5941y<T> f37415a;

    /* renamed from: b */
    final C5930q0<? extends T> f37416b;

    /* renamed from: e.a.x0.e.c.e1$a */
    /* compiled from: MaybeSwitchIfEmptySingle */
    static final class C12974a<T> extends AtomicReference<C12314c> implements C12321v<T>, C12314c {
        private static final long serialVersionUID = 4603919676453758899L;

        /* renamed from: a */
        final C12292n0<? super T> f37417a;

        /* renamed from: b */
        final C5930q0<? extends T> f37418b;

        /* renamed from: e.a.x0.e.c.e1$a$a */
        /* compiled from: MaybeSwitchIfEmptySingle */
        static final class C12975a<T> implements C12292n0<T> {

            /* renamed from: a */
            final C12292n0<? super T> f37419a;

            /* renamed from: b */
            final AtomicReference<C12314c> f37420b;

            C12975a(C12292n0<? super T> n0Var, AtomicReference<C12314c> atomicReference) {
                this.f37419a = n0Var;
                this.f37420b = atomicReference;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this.f37420b, cVar);
            }

            public void onError(Throwable th) {
                this.f37419a.onError(th);
            }

            public void onSuccess(T t) {
                this.f37419a.onSuccess(t);
            }
        }

        C12974a(C12292n0<? super T> n0Var, C5930q0<? extends T> q0Var) {
            this.f37417a = n0Var;
            this.f37418b = q0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f37417a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            C12314c cVar = (C12314c) get();
            if (cVar != C12347d.DISPOSED && compareAndSet(cVar, null)) {
                this.f37418b.mo24192a(new C12975a(this.f37417a, this));
            }
        }

        public void onError(Throwable th) {
            this.f37417a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37417a.onSuccess(t);
        }
    }

    public C12973e1(C5941y<T> yVar, C5930q0<? extends T> q0Var) {
        this.f37415a = yVar;
        this.f37416b = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f37415a.mo24639a(new C12974a(n0Var, this.f37416b));
    }

    public C5941y<T> source() {
        return this.f37415a;
    }
}
