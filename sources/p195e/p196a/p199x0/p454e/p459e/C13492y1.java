package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12200a0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.y1 */
/* compiled from: ObservableMaterialize */
public final class C13492y1<T> extends C13131a<T, C12200a0<T>> {

    /* renamed from: e.a.x0.e.e.y1$a */
    /* compiled from: ObservableMaterialize */
    static final class C13493a<T> implements C12280i0<T>, C12314c {

        /* renamed from: a */
        final C12280i0<? super C12200a0<T>> f39080a;

        /* renamed from: b */
        C12314c f39081b;

        C13493a(C12280i0<? super C12200a0<T>> i0Var) {
            this.f39080a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39081b, cVar)) {
                this.f39081b = cVar;
                this.f39080a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39081b.mo41878d();
        }

        public void dispose() {
            this.f39081b.dispose();
        }

        public void onComplete() {
            this.f39080a.mo33453a(C12200a0.m54847f());
            this.f39080a.onComplete();
        }

        public void onError(Throwable th) {
            this.f39080a.mo33453a(C12200a0.m54846a(th));
            this.f39080a.onComplete();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f39080a.mo33453a(C12200a0.m54845a(t));
        }
    }

    public C13492y1(C5926g0<T> g0Var) {
        super(g0Var);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C12200a0<T>> i0Var) {
        this.f37851a.mo23893a(new C13493a(i0Var));
    }
}
