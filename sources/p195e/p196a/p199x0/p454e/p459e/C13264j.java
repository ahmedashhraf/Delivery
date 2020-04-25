package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.j */
/* compiled from: ObservableAnySingle */
public final class C13264j<T> extends C5928k0<Boolean> implements C12395d<Boolean> {

    /* renamed from: a */
    final C5926g0<T> f38312a;

    /* renamed from: b */
    final C12342r<? super T> f38313b;

    /* renamed from: e.a.x0.e.e.j$a */
    /* compiled from: ObservableAnySingle */
    static final class C13265a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38314N;

        /* renamed from: O */
        boolean f38315O;

        /* renamed from: a */
        final C12292n0<? super Boolean> f38316a;

        /* renamed from: b */
        final C12342r<? super T> f38317b;

        C13265a(C12292n0<? super Boolean> n0Var, C12342r<? super T> rVar) {
            this.f38316a = n0Var;
            this.f38317b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38314N, cVar)) {
                this.f38314N = cVar;
                this.f38316a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38314N.mo41878d();
        }

        public void dispose() {
            this.f38314N.dispose();
        }

        public void onComplete() {
            if (!this.f38315O) {
                this.f38315O = true;
                this.f38316a.onSuccess(Boolean.valueOf(false));
            }
        }

        public void onError(Throwable th) {
            if (this.f38315O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38315O = true;
            this.f38316a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38315O) {
                try {
                    if (this.f38317b.mo41812b(t)) {
                        this.f38315O = true;
                        this.f38314N.dispose();
                        this.f38316a.onSuccess(Boolean.valueOf(true));
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38314N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13264j(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        this.f38312a = g0Var;
        this.f38313b = rVar;
    }

    /* renamed from: a */
    public C5923b0<Boolean> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13250i<T>(this.f38312a, this.f38313b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f38312a.mo23893a(new C13265a(n0Var, this.f38313b));
    }
}
