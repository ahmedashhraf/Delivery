package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p453d.C12407a;
import p195e.p196a.p449w0.C12342r;

/* renamed from: e.a.x0.e.e.v0 */
/* compiled from: ObservableFilter */
public final class C13445v0<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12342r<? super T> f38921b;

    /* renamed from: e.a.x0.e.e.v0$a */
    /* compiled from: ObservableFilter */
    static final class C13446a<T> extends C12407a<T, T> {

        /* renamed from: Q */
        final C12342r<? super T> f38922Q;

        C13446a(C12280i0<? super T> i0Var, C12342r<? super T> rVar) {
            super(i0Var);
            this.f38922Q = rVar;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f35549P == 0) {
                try {
                    if (this.f38922Q.mo41812b(t)) {
                        this.f35550a.mo33453a(t);
                    }
                } catch (Throwable th) {
                    mo42149a(th);
                }
            } else {
                this.f35550a.mo33453a(null);
            }
        }

        @C5938g
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f35547N.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f38922Q.mo41812b(poll));
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo42150b(i);
        }
    }

    public C13445v0(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38921b = rVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13446a(i0Var, this.f38921b));
    }
}
