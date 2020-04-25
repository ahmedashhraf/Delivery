package p195e.p196a.p199x0.p454e.p459e;

import java.util.NoSuchElementException;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.u1 */
/* compiled from: ObservableLastSingle */
public final class C13433u1<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5926g0<T> f38866a;

    /* renamed from: b */
    final T f38867b;

    /* renamed from: e.a.x0.e.e.u1$a */
    /* compiled from: ObservableLastSingle */
    static final class C13434a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38868N;

        /* renamed from: O */
        T f38869O;

        /* renamed from: a */
        final C12292n0<? super T> f38870a;

        /* renamed from: b */
        final T f38871b;

        C13434a(C12292n0<? super T> n0Var, T t) {
            this.f38870a = n0Var;
            this.f38871b = t;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38868N, cVar)) {
                this.f38868N = cVar;
                this.f38870a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38868N == C12347d.DISPOSED;
        }

        public void dispose() {
            this.f38868N.dispose();
            this.f38868N = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f38868N = C12347d.DISPOSED;
            T t = this.f38869O;
            if (t != null) {
                this.f38869O = null;
                this.f38870a.onSuccess(t);
                return;
            }
            T t2 = this.f38871b;
            if (t2 != null) {
                this.f38870a.onSuccess(t2);
            } else {
                this.f38870a.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f38868N = C12347d.DISPOSED;
            this.f38869O = null;
            this.f38870a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38869O = t;
        }
    }

    public C13433u1(C5926g0<T> g0Var, T t) {
        this.f38866a = g0Var;
        this.f38867b = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f38866a.mo23893a(new C13434a(n0Var, this.f38867b));
    }
}
