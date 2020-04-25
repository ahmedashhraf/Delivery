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

/* renamed from: e.a.x0.e.e.g */
/* compiled from: ObservableAllSingle */
public final class C13213g<T> extends C5928k0<Boolean> implements C12395d<Boolean> {

    /* renamed from: a */
    final C5926g0<T> f38133a;

    /* renamed from: b */
    final C12342r<? super T> f38134b;

    /* renamed from: e.a.x0.e.e.g$a */
    /* compiled from: ObservableAllSingle */
    static final class C13214a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38135N;

        /* renamed from: O */
        boolean f38136O;

        /* renamed from: a */
        final C12292n0<? super Boolean> f38137a;

        /* renamed from: b */
        final C12342r<? super T> f38138b;

        C13214a(C12292n0<? super Boolean> n0Var, C12342r<? super T> rVar) {
            this.f38137a = n0Var;
            this.f38138b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38135N, cVar)) {
                this.f38135N = cVar;
                this.f38137a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38135N.mo41878d();
        }

        public void dispose() {
            this.f38135N.dispose();
        }

        public void onComplete() {
            if (!this.f38136O) {
                this.f38136O = true;
                this.f38137a.onSuccess(Boolean.valueOf(true));
            }
        }

        public void onError(Throwable th) {
            if (this.f38136O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38136O = true;
            this.f38137a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38136O) {
                try {
                    if (!this.f38138b.mo41812b(t)) {
                        this.f38136O = true;
                        this.f38135N.dispose();
                        this.f38137a.onSuccess(Boolean.valueOf(false));
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38135N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13213g(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        this.f38133a = g0Var;
        this.f38134b = rVar;
    }

    /* renamed from: a */
    public C5923b0<Boolean> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13199f<T>(this.f38133a, this.f38134b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f38133a.mo23893a(new C13214a(n0Var, this.f38134b));
    }
}
