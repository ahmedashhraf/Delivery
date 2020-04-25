package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13751h;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.j0 */
/* compiled from: ObservableDetach */
public final class C13266j0<T> extends C13131a<T, T> {

    /* renamed from: e.a.x0.e.e.j0$a */
    /* compiled from: ObservableDetach */
    static final class C13267a<T> implements C12280i0<T>, C12314c {

        /* renamed from: a */
        C12280i0<? super T> f38318a;

        /* renamed from: b */
        C12314c f38319b;

        C13267a(C12280i0<? super T> i0Var) {
            this.f38318a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38319b, cVar)) {
                this.f38319b = cVar;
                this.f38318a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38319b.mo41878d();
        }

        public void dispose() {
            C12314c cVar = this.f38319b;
            this.f38319b = C13751h.INSTANCE;
            this.f38318a = C13751h.m58707e();
            cVar.dispose();
        }

        public void onComplete() {
            C12280i0<? super T> i0Var = this.f38318a;
            this.f38319b = C13751h.INSTANCE;
            this.f38318a = C13751h.m58707e();
            i0Var.onComplete();
        }

        public void onError(Throwable th) {
            C12280i0<? super T> i0Var = this.f38318a;
            this.f38319b = C13751h.INSTANCE;
            this.f38318a = C13751h.m58707e();
            i0Var.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38318a.mo33453a(t);
        }
    }

    public C13266j0(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13267a(i0Var));
    }
}
