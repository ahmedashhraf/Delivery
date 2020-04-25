package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13751h;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.m0 */
/* compiled from: FlowableDetach */
public final class C12710m0<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.m0$a */
    /* compiled from: FlowableDetach */
    static final class C12711a<T> implements C12297q<T>, C14063d {

        /* renamed from: a */
        C14062c<? super T> f36438a;

        /* renamed from: b */
        C14063d f36439b;

        C12711a(C14062c<? super T> cVar) {
            this.f36438a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36439b, dVar)) {
                this.f36439b = dVar;
                this.f36438a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36439b.mo41813c(j);
        }

        public void cancel() {
            C14063d dVar = this.f36439b;
            this.f36439b = C13751h.INSTANCE;
            this.f36438a = C13751h.m58708f();
            dVar.cancel();
        }

        public void onComplete() {
            C14062c<? super T> cVar = this.f36438a;
            this.f36439b = C13751h.INSTANCE;
            this.f36438a = C13751h.m58708f();
            cVar.onComplete();
        }

        public void onError(Throwable th) {
            C14062c<? super T> cVar = this.f36438a;
            this.f36439b = C13751h.INSTANCE;
            this.f36438a = C13751h.m58708f();
            cVar.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36438a.mo41789a(t);
        }
    }

    public C12710m0(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12711a<Object>(cVar));
    }
}
