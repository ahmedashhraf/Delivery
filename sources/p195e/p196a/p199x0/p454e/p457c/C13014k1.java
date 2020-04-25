package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.c.k1 */
/* compiled from: MaybeToFlowable */
public final class C13014k1<T> extends C5929l<T> implements C12397f<T> {

    /* renamed from: b */
    final C5941y<T> f37495b;

    /* renamed from: e.a.x0.e.c.k1$a */
    /* compiled from: MaybeToFlowable */
    static final class C13015a<T> extends C13738f<T> implements C12321v<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: V */
        C12314c f37496V;

        C13015a(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37496V, cVar)) {
                this.f37496V = cVar;
                this.f39781a.mo41788a((C14063d) this);
            }
        }

        public void cancel() {
            super.cancel();
            this.f37496V.dispose();
        }

        public void onComplete() {
            this.f39781a.onComplete();
        }

        public void onError(Throwable th) {
            this.f39781a.onError(th);
        }

        public void onSuccess(T t) {
            mo43123c(t);
        }
    }

    public C13014k1(C5941y<T> yVar) {
        this.f37495b = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f37495b.mo24639a(new C13015a(cVar));
    }

    public C5941y<T> source() {
        return this.f37495b;
    }
}
