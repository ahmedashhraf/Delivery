package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p453d.C12407a;
import p195e.p196a.p449w0.C12331g;

@C5936e
/* renamed from: e.a.x0.e.e.m0 */
/* compiled from: ObservableDoAfterNext */
public final class C13310m0<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12331g<? super T> f38474b;

    /* renamed from: e.a.x0.e.e.m0$a */
    /* compiled from: ObservableDoAfterNext */
    static final class C13311a<T> extends C12407a<T, T> {

        /* renamed from: Q */
        final C12331g<? super T> f38475Q;

        C13311a(C12280i0<? super T> i0Var, C12331g<? super T> gVar) {
            super(i0Var);
            this.f38475Q = gVar;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f35550a.mo33453a(t);
            if (this.f35549P == 0) {
                try {
                    this.f38475Q.mo33410c(t);
                } catch (Throwable th) {
                    mo42149a(th);
                }
            }
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f35547N.poll();
            if (poll != null) {
                this.f38475Q.mo33410c(poll);
            }
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo42150b(i);
        }
    }

    public C13310m0(C5926g0<T> g0Var, C12331g<? super T> gVar) {
        super(g0Var);
        this.f38474b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13311a(i0Var, this.f38474b));
    }
}
