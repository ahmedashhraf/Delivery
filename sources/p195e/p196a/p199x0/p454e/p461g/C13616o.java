package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.o */
/* compiled from: SingleDoOnDispose */
public final class C13616o<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39412a;

    /* renamed from: b */
    final C12325a f39413b;

    /* renamed from: e.a.x0.e.g.o$a */
    /* compiled from: SingleDoOnDispose */
    static final class C13617a<T> extends AtomicReference<C12325a> implements C12292n0<T>, C12314c {
        private static final long serialVersionUID = -8583764624474935784L;

        /* renamed from: a */
        final C12292n0<? super T> f39414a;

        /* renamed from: b */
        C12314c f39415b;

        C13617a(C12292n0<? super T> n0Var, C12325a aVar) {
            this.f39414a = n0Var;
            lazySet(aVar);
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f39415b, cVar)) {
                this.f39415b = cVar;
                this.f39414a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39415b.mo41878d();
        }

        public void dispose() {
            C12325a aVar = (C12325a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
                this.f39415b.dispose();
            }
        }

        public void onError(Throwable th) {
            this.f39414a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39414a.onSuccess(t);
        }
    }

    public C13616o(C5930q0<T> q0Var, C12325a aVar) {
        this.f39412a = q0Var;
        this.f39413b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39412a.mo24192a(new C13617a(n0Var, this.f39413b));
    }
}
