package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.l1 */
/* compiled from: ObservableHide */
public final class C13299l1<T> extends C13131a<T, T> {

    /* renamed from: e.a.x0.e.e.l1$a */
    /* compiled from: ObservableHide */
    static final class C13300a<T> implements C12280i0<T>, C12314c {

        /* renamed from: a */
        final C12280i0<? super T> f38436a;

        /* renamed from: b */
        C12314c f38437b;

        C13300a(C12280i0<? super T> i0Var) {
            this.f38436a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38437b, cVar)) {
                this.f38437b = cVar;
                this.f38436a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38437b.mo41878d();
        }

        public void dispose() {
            this.f38437b.dispose();
        }

        public void onComplete() {
            this.f38436a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38436a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38436a.mo33453a(t);
        }
    }

    public C13299l1(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13300a(i0Var));
    }
}
