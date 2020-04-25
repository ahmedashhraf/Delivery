package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.p1 */
/* compiled from: FlowableHide */
public final class C12761p1<T> extends C12511a<T, T> {

    /* renamed from: e.a.x0.e.b.p1$a */
    /* compiled from: FlowableHide */
    static final class C12762a<T> implements C12297q<T>, C14063d {

        /* renamed from: a */
        final C14062c<? super T> f36622a;

        /* renamed from: b */
        C14063d f36623b;

        C12762a(C14062c<? super T> cVar) {
            this.f36622a = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36623b, dVar)) {
                this.f36623b = dVar;
                this.f36622a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36623b.mo41813c(j);
        }

        public void cancel() {
            this.f36623b.cancel();
        }

        public void onComplete() {
            this.f36622a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36622a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36622a.mo41789a(t);
        }
    }

    public C12761p1(C5929l<T> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12762a<Object>(cVar));
    }
}
