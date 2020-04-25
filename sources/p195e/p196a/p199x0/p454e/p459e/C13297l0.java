package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p453d.C12407a;
import p195e.p196a.p449w0.C12328d;
import p195e.p196a.p449w0.C12339o;

/* renamed from: e.a.x0.e.e.l0 */
/* compiled from: ObservableDistinctUntilChanged */
public final class C13297l0<T, K> extends C13131a<T, T> {

    /* renamed from: N */
    final C12328d<? super K, ? super K> f38430N;

    /* renamed from: b */
    final C12339o<? super T, K> f38431b;

    /* renamed from: e.a.x0.e.e.l0$a */
    /* compiled from: ObservableDistinctUntilChanged */
    static final class C13298a<T, K> extends C12407a<T, T> {

        /* renamed from: Q */
        final C12339o<? super T, K> f38432Q;

        /* renamed from: R */
        final C12328d<? super K, ? super K> f38433R;

        /* renamed from: S */
        K f38434S;

        /* renamed from: T */
        boolean f38435T;

        C13298a(C12280i0<? super T> i0Var, C12339o<? super T, K> oVar, C12328d<? super K, ? super K> dVar) {
            super(i0Var);
            this.f38432Q = oVar;
            this.f38433R = dVar;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f35548O) {
                if (this.f35549P != 0) {
                    this.f35550a.mo33453a(t);
                    return;
                }
                try {
                    K apply = this.f38432Q.apply(t);
                    if (this.f38435T) {
                        boolean a = this.f38433R.mo42089a(this.f38434S, apply);
                        this.f38434S = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f38435T = true;
                        this.f38434S = apply;
                    }
                    this.f35550a.mo33453a(t);
                } catch (Throwable th) {
                    mo42149a(th);
                }
            }
        }

        @C5938g
        public T poll() throws Exception {
            while (true) {
                T poll = this.f35547N.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f38432Q.apply(poll);
                if (!this.f38435T) {
                    this.f38435T = true;
                    this.f38434S = apply;
                    return poll;
                } else if (!this.f38433R.mo42089a(this.f38434S, apply)) {
                    this.f38434S = apply;
                    return poll;
                } else {
                    this.f38434S = apply;
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo42150b(i);
        }
    }

    public C13297l0(C5926g0<T> g0Var, C12339o<? super T, K> oVar, C12328d<? super K, ? super K> dVar) {
        super(g0Var);
        this.f38431b = oVar;
        this.f38430N = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13298a(i0Var, this.f38431b, this.f38430N));
    }
}
