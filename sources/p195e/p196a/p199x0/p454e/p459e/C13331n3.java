package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.n3 */
/* compiled from: ObservableTake */
public final class C13331n3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final long f38542b;

    /* renamed from: e.a.x0.e.e.n3$a */
    /* compiled from: ObservableTake */
    static final class C13332a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38543N;

        /* renamed from: O */
        long f38544O;

        /* renamed from: a */
        final C12280i0<? super T> f38545a;

        /* renamed from: b */
        boolean f38546b;

        C13332a(C12280i0<? super T> i0Var, long j) {
            this.f38545a = i0Var;
            this.f38544O = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38543N, cVar)) {
                this.f38543N = cVar;
                if (this.f38544O == 0) {
                    this.f38546b = true;
                    cVar.dispose();
                    C12348e.m55473a(this.f38545a);
                    return;
                }
                this.f38545a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38543N.mo41878d();
        }

        public void dispose() {
            this.f38543N.dispose();
        }

        public void onComplete() {
            if (!this.f38546b) {
                this.f38546b = true;
                this.f38543N.dispose();
                this.f38545a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38546b) {
                C12205a.m54894b(th);
                return;
            }
            this.f38546b = true;
            this.f38543N.dispose();
            this.f38545a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38546b) {
                long j = this.f38544O;
                this.f38544O = j - 1;
                if (j > 0) {
                    boolean z = this.f38544O == 0;
                    this.f38545a.mo33453a(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }
    }

    public C13331n3(C5926g0<T> g0Var, long j) {
        super(g0Var);
        this.f38542b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13332a(i0Var, this.f38542b));
    }
}
