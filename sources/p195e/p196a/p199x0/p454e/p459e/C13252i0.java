package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12200a0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.i0 */
/* compiled from: ObservableDematerialize */
public final class C13252i0<T> extends C13131a<C12200a0<T>, T> {

    /* renamed from: e.a.x0.e.e.i0$a */
    /* compiled from: ObservableDematerialize */
    static final class C13253a<T> implements C12280i0<C12200a0<T>>, C12314c {

        /* renamed from: N */
        C12314c f38274N;

        /* renamed from: a */
        final C12280i0<? super T> f38275a;

        /* renamed from: b */
        boolean f38276b;

        C13253a(C12280i0<? super T> i0Var) {
            this.f38275a = i0Var;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38274N.mo41878d();
        }

        public void dispose() {
            this.f38274N.dispose();
        }

        public void onComplete() {
            if (!this.f38276b) {
                this.f38276b = true;
                this.f38275a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38276b) {
                C12205a.m54894b(th);
                return;
            }
            this.f38276b = true;
            this.f38275a.onError(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38274N, cVar)) {
                this.f38274N = cVar;
                this.f38275a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: a */
        public void mo33453a(C12200a0<T> a0Var) {
            if (this.f38276b) {
                if (a0Var.mo41774d()) {
                    C12205a.m54894b(a0Var.mo41771a());
                }
                return;
            }
            if (a0Var.mo41774d()) {
                this.f38274N.dispose();
                onError(a0Var.mo41771a());
            } else if (a0Var.mo41773c()) {
                this.f38274N.dispose();
                onComplete();
            } else {
                this.f38275a.mo33453a(a0Var.mo41772b());
            }
        }
    }

    public C13252i0(C5926g0<C12200a0<T>> g0Var) {
        super(g0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13253a(i0Var));
    }
}
