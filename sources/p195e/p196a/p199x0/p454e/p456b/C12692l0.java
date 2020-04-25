package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12200a0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.l0 */
/* compiled from: FlowableDematerialize */
public final class C12692l0<T> extends C12511a<C12200a0<T>, T> {

    /* renamed from: e.a.x0.e.b.l0$a */
    /* compiled from: FlowableDematerialize */
    static final class C12693a<T> implements C12297q<C12200a0<T>>, C14063d {

        /* renamed from: N */
        C14063d f36353N;

        /* renamed from: a */
        final C14062c<? super T> f36354a;

        /* renamed from: b */
        boolean f36355b;

        C12693a(C14062c<? super T> cVar) {
            this.f36354a = cVar;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36353N.mo41813c(j);
        }

        public void cancel() {
            this.f36353N.cancel();
        }

        public void onComplete() {
            if (!this.f36355b) {
                this.f36355b = true;
                this.f36354a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36355b) {
                C12205a.m54894b(th);
                return;
            }
            this.f36355b = true;
            this.f36354a.onError(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36353N, dVar)) {
                this.f36353N = dVar;
                this.f36354a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: a */
        public void mo41789a(C12200a0<T> a0Var) {
            if (this.f36355b) {
                if (a0Var.mo41774d()) {
                    C12205a.m54894b(a0Var.mo41771a());
                }
                return;
            }
            if (a0Var.mo41774d()) {
                this.f36353N.cancel();
                onError(a0Var.mo41771a());
            } else if (a0Var.mo41773c()) {
                this.f36353N.cancel();
                onComplete();
            } else {
                this.f36354a.mo41789a(a0Var.mo41772b());
            }
        }
    }

    public C12692l0(C5929l<C12200a0<T>> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12693a<Object>(cVar));
    }
}
