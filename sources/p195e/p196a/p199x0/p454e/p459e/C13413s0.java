package p195e.p196a.p199x0.p454e.p459e;

import java.util.NoSuchElementException;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.s0 */
/* compiled from: ObservableElementAtSingle */
public final class C13413s0<T> extends C5928k0<T> implements C12395d<T> {

    /* renamed from: N */
    final T f38801N;

    /* renamed from: a */
    final C5926g0<T> f38802a;

    /* renamed from: b */
    final long f38803b;

    /* renamed from: e.a.x0.e.e.s0$a */
    /* compiled from: ObservableElementAtSingle */
    static final class C13414a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final T f38804N;

        /* renamed from: O */
        C12314c f38805O;

        /* renamed from: P */
        long f38806P;

        /* renamed from: Q */
        boolean f38807Q;

        /* renamed from: a */
        final C12292n0<? super T> f38808a;

        /* renamed from: b */
        final long f38809b;

        C13414a(C12292n0<? super T> n0Var, long j, T t) {
            this.f38808a = n0Var;
            this.f38809b = j;
            this.f38804N = t;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38805O, cVar)) {
                this.f38805O = cVar;
                this.f38808a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38805O.mo41878d();
        }

        public void dispose() {
            this.f38805O.dispose();
        }

        public void onComplete() {
            if (!this.f38807Q) {
                this.f38807Q = true;
                T t = this.f38804N;
                if (t != null) {
                    this.f38808a.onSuccess(t);
                } else {
                    this.f38808a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38807Q) {
                C12205a.m54894b(th);
                return;
            }
            this.f38807Q = true;
            this.f38808a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38807Q) {
                long j = this.f38806P;
                if (j == this.f38809b) {
                    this.f38807Q = true;
                    this.f38805O.dispose();
                    this.f38808a.onSuccess(t);
                    return;
                }
                this.f38806P = j + 1;
            }
        }
    }

    public C13413s0(C5926g0<T> g0Var, long j, T t) {
        this.f38802a = g0Var;
        this.f38803b = j;
        this.f38801N = t;
    }

    /* renamed from: a */
    public C5923b0<T> mo42141a() {
        C13375q0 q0Var = new C13375q0(this.f38802a, this.f38803b, this.f38801N, true);
        return C12205a.m54862a((C5923b0<T>) q0Var);
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f38802a.mo23893a(new C13414a(n0Var, this.f38803b, this.f38801N));
    }
}
