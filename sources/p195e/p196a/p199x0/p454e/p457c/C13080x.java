package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.x */
/* compiled from: MaybeFilter */
public final class C13080x<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12342r<? super T> f37618b;

    /* renamed from: e.a.x0.e.c.x$a */
    /* compiled from: MaybeFilter */
    static final class C13081a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37619N;

        /* renamed from: a */
        final C12321v<? super T> f37620a;

        /* renamed from: b */
        final C12342r<? super T> f37621b;

        C13081a(C12321v<? super T> vVar, C12342r<? super T> rVar) {
            this.f37620a = vVar;
            this.f37621b = rVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37619N, cVar)) {
                this.f37619N = cVar;
                this.f37620a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37619N.mo41878d();
        }

        public void dispose() {
            C12314c cVar = this.f37619N;
            this.f37619N = C12347d.DISPOSED;
            cVar.dispose();
        }

        public void onComplete() {
            this.f37620a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37620a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                if (this.f37621b.mo41812b(t)) {
                    this.f37620a.onSuccess(t);
                } else {
                    this.f37620a.onComplete();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37620a.onError(th);
            }
        }
    }

    public C13080x(C5941y<T> yVar, C12342r<? super T> rVar) {
        super(yVar);
        this.f37618b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13081a(vVar, this.f37618b));
    }
}
