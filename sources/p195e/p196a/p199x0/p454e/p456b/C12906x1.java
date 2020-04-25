package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.x1 */
/* compiled from: FlowableLastMaybe */
public final class C12906x1<T> extends C5931s<T> {

    /* renamed from: a */
    final C6007b<T> f37177a;

    /* renamed from: e.a.x0.e.b.x1$a */
    /* compiled from: FlowableLastMaybe */
    static final class C12907a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        T f37178N;

        /* renamed from: a */
        final C12321v<? super T> f37179a;

        /* renamed from: b */
        C14063d f37180b;

        C12907a(C12321v<? super T> vVar) {
            this.f37179a = vVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37180b, dVar)) {
                this.f37180b = dVar;
                this.f37179a.mo41931a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37180b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f37180b.cancel();
            this.f37180b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f37180b = C13742j.CANCELLED;
            T t = this.f37178N;
            if (t != null) {
                this.f37178N = null;
                this.f37179a.onSuccess(t);
                return;
            }
            this.f37179a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37180b = C13742j.CANCELLED;
            this.f37178N = null;
            this.f37179a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37178N = t;
        }
    }

    public C12906x1(C6007b<T> bVar) {
        this.f37177a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37177a.mo24397a(new C12907a(vVar));
    }
}
