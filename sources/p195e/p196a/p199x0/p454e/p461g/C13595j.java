package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p453d.C12433z;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.j */
/* compiled from: SingleDelayWithSingle */
public final class C13595j<T, U> extends C5928k0<T> {

    /* renamed from: a */
    final C5930q0<T> f39365a;

    /* renamed from: b */
    final C5930q0<U> f39366b;

    /* renamed from: e.a.x0.e.g.j$a */
    /* compiled from: SingleDelayWithSingle */
    static final class C13596a<T, U> extends AtomicReference<C12314c> implements C12292n0<U>, C12314c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: a */
        final C12292n0<? super T> f39367a;

        /* renamed from: b */
        final C5930q0<T> f39368b;

        C13596a(C12292n0<? super T> n0Var, C5930q0<T> q0Var) {
            this.f39367a = n0Var;
            this.f39368b = q0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                this.f39367a.mo41974a(this);
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
            this.f39367a.onError(th);
        }

        public void onSuccess(U u) {
            this.f39368b.mo24192a(new C12433z(this, this.f39367a));
        }
    }

    public C13595j(C5930q0<T> q0Var, C5930q0<U> q0Var2) {
        this.f39365a = q0Var;
        this.f39366b = q0Var2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39366b.mo24192a(new C13596a(n0Var, this.f39365a));
    }
}
