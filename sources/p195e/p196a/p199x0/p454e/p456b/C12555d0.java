package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.d0 */
/* compiled from: FlowableCount */
public final class C12555d0<T> extends C12511a<T, Long> {

    /* renamed from: e.a.x0.e.b.d0$a */
    /* compiled from: FlowableCount */
    static final class C12556a extends C13738f<Long> implements C12297q<Object> {
        private static final long serialVersionUID = 4973004223787171406L;

        /* renamed from: V */
        C14063d f35935V;

        /* renamed from: W */
        long f35936W;

        C12556a(C14062c<? super Long> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35935V, dVar)) {
                this.f35935V = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f35935V.cancel();
        }

        public void onComplete() {
            mo43123c(Long.valueOf(this.f35936W));
        }

        public void onError(Throwable th) {
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            this.f35936W++;
        }
    }

    public C12555d0(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super Long> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12556a<Object>(cVar));
    }
}
