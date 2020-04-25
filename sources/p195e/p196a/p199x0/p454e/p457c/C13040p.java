package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.p */
/* compiled from: MaybeDetach */
public final class C13040p<T> extends C12943a<T, T> {

    /* renamed from: e.a.x0.e.c.p$a */
    /* compiled from: MaybeDetach */
    static final class C13041a<T> implements C12321v<T>, C12314c {

        /* renamed from: a */
        C12321v<? super T> f37539a;

        /* renamed from: b */
        C12314c f37540b;

        C13041a(C12321v<? super T> vVar) {
            this.f37539a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37540b, cVar)) {
                this.f37540b = cVar;
                this.f37539a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37540b.mo41878d();
        }

        public void dispose() {
            this.f37539a = null;
            this.f37540b.dispose();
            this.f37540b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37540b = C12347d.DISPOSED;
            C12321v<? super T> vVar = this.f37539a;
            if (vVar != null) {
                this.f37539a = null;
                vVar.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f37540b = C12347d.DISPOSED;
            C12321v<? super T> vVar = this.f37539a;
            if (vVar != null) {
                this.f37539a = null;
                vVar.onError(th);
            }
        }

        public void onSuccess(T t) {
            this.f37540b = C12347d.DISPOSED;
            C12321v<? super T> vVar = this.f37539a;
            if (vVar != null) {
                this.f37539a = null;
                vVar.onSuccess(t);
            }
        }
    }

    public C13040p(C5941y<T> yVar) {
        super(yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13041a(vVar));
    }
}
