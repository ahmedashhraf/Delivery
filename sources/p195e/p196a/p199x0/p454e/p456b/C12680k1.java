package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5929l;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.k1 */
/* compiled from: FlowableFromObservable */
public final class C12680k1<T> extends C5929l<T> {

    /* renamed from: b */
    private final C5923b0<T> f36313b;

    /* renamed from: e.a.x0.e.b.k1$a */
    /* compiled from: FlowableFromObservable */
    static class C12681a<T> implements C12280i0<T>, C14063d {

        /* renamed from: a */
        private final C14062c<? super T> f36314a;

        /* renamed from: b */
        private C12314c f36315b;

        C12681a(C14062c<? super T> cVar) {
            this.f36314a = cVar;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f36314a.mo41789a(t);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
        }

        public void cancel() {
            this.f36315b.dispose();
        }

        public void onComplete() {
            this.f36314a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36314a.onError(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f36315b = cVar;
            this.f36314a.mo41788a((C14063d) this);
        }
    }

    public C12680k1(C5923b0<T> b0Var) {
        this.f36313b = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f36313b.mo23893a((C12280i0<? super T>) new C12681a<Object>(cVar));
    }
}
