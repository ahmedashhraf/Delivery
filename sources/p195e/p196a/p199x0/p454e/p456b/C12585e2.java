package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12200a0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p464h.C13730s;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.e2 */
/* compiled from: FlowableMaterialize */
public final class C12585e2<T> extends C12511a<T, C12200a0<T>> {

    /* renamed from: e.a.x0.e.b.e2$a */
    /* compiled from: FlowableMaterialize */
    static final class C12586a<T> extends C13730s<T, C12200a0<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        C12586a(C14062c<? super C12200a0<T>> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39760O++;
            this.f39761a.mo41789a(C12200a0.m54845a(t));
        }

        public void onComplete() {
            mo43114c(C12200a0.m54847f());
        }

        public void onError(Throwable th) {
            mo43114c(C12200a0.m54846a(th));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42290d(C12200a0<T> a0Var) {
            if (a0Var.mo41774d()) {
                C12205a.m54894b(a0Var.mo41771a());
            }
        }
    }

    public C12585e2(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super C12200a0<T>> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12586a<Object>(cVar));
    }
}
