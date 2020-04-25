package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.c4 */
/* compiled from: FlowableTakeLastOne */
public final class C12550c4<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.c4$a */
    /* compiled from: FlowableTakeLastOne */
    static final class C12551a<T> extends C13738f<T> implements C12297q<T> {
        private static final long serialVersionUID = -5467847744262967226L;

        /* renamed from: V */
        C14063d f35929V;

        C12551a(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35929V, dVar)) {
                this.f35929V = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f35929V.cancel();
        }

        public void onComplete() {
            T t = this.f39782b;
            if (t != null) {
                mo43123c(t);
            } else {
                this.f39781a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f39782b = null;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39782b = t;
        }
    }

    public C12550c4(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12551a<Object>(cVar));
    }
}
