package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12407a;
import p195e.p196a.p449w0.C12339o;

/* renamed from: e.a.x0.e.e.w1 */
/* compiled from: ObservableMap */
public final class C13459w1<T, U> extends C13131a<T, U> {

    /* renamed from: b */
    final C12339o<? super T, ? extends U> f38987b;

    /* renamed from: e.a.x0.e.e.w1$a */
    /* compiled from: ObservableMap */
    static final class C13460a<T, U> extends C12407a<T, U> {

        /* renamed from: Q */
        final C12339o<? super T, ? extends U> f38988Q;

        C13460a(C12280i0<? super U> i0Var, C12339o<? super T, ? extends U> oVar) {
            super(i0Var);
            this.f38988Q = oVar;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f35548O) {
                if (this.f35549P != 0) {
                    this.f35550a.mo33453a(null);
                    return;
                }
                try {
                    this.f35550a.mo33453a(C12390b.m55563a(this.f38988Q.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo42149a(th);
                }
            }
        }

        @C5938g
        public U poll() throws Exception {
            Object poll = this.f35547N.poll();
            if (poll != null) {
                return C12390b.m55563a(this.f38988Q.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo42150b(i);
        }
    }

    public C13459w1(C5926g0<T> g0Var, C12339o<? super T, ? extends U> oVar) {
        super(g0Var);
        this.f38987b = oVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        this.f37851a.mo23893a(new C13460a(i0Var, this.f38987b));
    }
}
