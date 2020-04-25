package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.a0 */
/* compiled from: ObservableCount */
public final class C13132a0<T> extends C13131a<T, Long> {

    /* renamed from: e.a.x0.e.e.a0$a */
    /* compiled from: ObservableCount */
    static final class C13133a implements C12280i0<Object>, C12314c {

        /* renamed from: N */
        long f37852N;

        /* renamed from: a */
        final C12280i0<? super Long> f37853a;

        /* renamed from: b */
        C12314c f37854b;

        C13133a(C12280i0<? super Long> i0Var) {
            this.f37853a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37854b, cVar)) {
                this.f37854b = cVar;
                this.f37853a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37854b.mo41878d();
        }

        public void dispose() {
            this.f37854b.dispose();
        }

        public void onComplete() {
            this.f37853a.mo33453a(Long.valueOf(this.f37852N));
            this.f37853a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37853a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            this.f37852N++;
        }
    }

    public C13132a0(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super Long> i0Var) {
        this.f37851a.mo23893a(new C13133a(i0Var));
    }
}
