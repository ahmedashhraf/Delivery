package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12433z;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.h */
/* compiled from: SingleDelayWithObservable */
public final class C13588h<T, U> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39349a;

    /* renamed from: b */
    final C5926g0<U> f39350b;

    /* renamed from: e.a.x0.e.g.h$a */
    /* compiled from: SingleDelayWithObservable */
    static final class C13589a<T, U> extends AtomicReference<C12314c> implements C12280i0<U>, C12314c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: N */
        boolean f39351N;

        /* renamed from: a */
        final C12292n0<? super T> f39352a;

        /* renamed from: b */
        final C5930q0<T> f39353b;

        C13589a(C12292n0<? super T> n0Var, C5930q0<T> q0Var) {
            this.f39352a = n0Var;
            this.f39353b = q0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55467b(this, cVar)) {
                this.f39352a.mo41974a(this);
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
            if (!this.f39351N) {
                this.f39351N = true;
                this.f39353b.mo24192a(new C12433z(this, this.f39352a));
            }
        }

        public void onError(Throwable th) {
            if (this.f39351N) {
                C12205a.m54894b(th);
                return;
            }
            this.f39351N = true;
            this.f39352a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            ((C12314c) get()).dispose();
            onComplete();
        }
    }

    public C13588h(C5930q0<T> q0Var, C5926g0<U> g0Var) {
        this.f39349a = q0Var;
        this.f39350b = g0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39350b.mo23893a(new C13589a(n0Var, this.f39349a));
    }
}
