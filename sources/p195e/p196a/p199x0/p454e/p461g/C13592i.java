package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12433z;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.g.i */
/* compiled from: SingleDelayWithPublisher */
public final class C13592i<T, U> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39358a;

    /* renamed from: b */
    final C6007b<U> f39359b;

    /* renamed from: e.a.x0.e.g.i$a */
    /* compiled from: SingleDelayWithPublisher */
    static final class C13593a<T, U> extends AtomicReference<C12314c> implements C12297q<U>, C12314c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: N */
        boolean f39360N;

        /* renamed from: O */
        C14063d f39361O;

        /* renamed from: a */
        final C12292n0<? super T> f39362a;

        /* renamed from: b */
        final C5930q0<T> f39363b;

        C13593a(C12292n0<? super T> n0Var, C5930q0<T> q0Var) {
            this.f39362a = n0Var;
            this.f39363b = q0Var;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39361O, dVar)) {
                this.f39361O = dVar;
                this.f39362a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            this.f39361O.cancel();
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            if (!this.f39360N) {
                this.f39360N = true;
                this.f39363b.mo24192a(new C12433z(this, this.f39362a));
            }
        }

        public void onError(Throwable th) {
            if (this.f39360N) {
                C12205a.m54894b(th);
                return;
            }
            this.f39360N = true;
            this.f39362a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(U u) {
            this.f39361O.cancel();
            onComplete();
        }
    }

    public C13592i(C5930q0<T> q0Var, C6007b<U> bVar) {
        this.f39358a = q0Var;
        this.f39359b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39359b.mo24397a(new C13593a(n0Var, this.f39358a));
    }
}
