package p195e.p196a.p199x0.p454e.p459e;

import java.util.NoSuchElementException;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.e3 */
/* compiled from: ObservableSingleSingle */
public final class C13194e3<T> extends C5928k0<T> {

    /* renamed from: a */
    final C5926g0<? extends T> f38073a;

    /* renamed from: b */
    final T f38074b;

    /* renamed from: e.a.x0.e.e.e3$a */
    /* compiled from: ObservableSingleSingle */
    static final class C13195a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38075N;

        /* renamed from: O */
        T f38076O;

        /* renamed from: P */
        boolean f38077P;

        /* renamed from: a */
        final C12292n0<? super T> f38078a;

        /* renamed from: b */
        final T f38079b;

        C13195a(C12292n0<? super T> n0Var, T t) {
            this.f38078a = n0Var;
            this.f38079b = t;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38075N, cVar)) {
                this.f38075N = cVar;
                this.f38078a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38075N.mo41878d();
        }

        public void dispose() {
            this.f38075N.dispose();
        }

        public void onComplete() {
            if (!this.f38077P) {
                this.f38077P = true;
                T t = this.f38076O;
                this.f38076O = null;
                if (t == null) {
                    t = this.f38079b;
                }
                if (t != null) {
                    this.f38078a.onSuccess(t);
                } else {
                    this.f38078a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38077P) {
                C12205a.m54894b(th);
                return;
            }
            this.f38077P = true;
            this.f38078a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38077P) {
                if (this.f38076O != null) {
                    this.f38077P = true;
                    this.f38075N.dispose();
                    this.f38078a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f38076O = t;
            }
        }
    }

    public C13194e3(C5926g0<? extends T> g0Var, T t) {
        this.f38073a = g0Var;
        this.f38074b = t;
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f38073a.mo23893a(new C13195a(n0Var, this.f38074b));
    }
}
