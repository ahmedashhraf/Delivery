package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.q0 */
/* compiled from: MaybeIsEmpty */
public final class C13048q0<T> extends C12943a<T, Boolean> {

    /* renamed from: e.a.x0.e.c.q0$a */
    /* compiled from: MaybeIsEmpty */
    static final class C13049a<T> implements C12321v<T>, C12314c {

        /* renamed from: a */
        final C12321v<? super Boolean> f37552a;

        /* renamed from: b */
        C12314c f37553b;

        C13049a(C12321v<? super Boolean> vVar) {
            this.f37552a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37553b, cVar)) {
                this.f37553b = cVar;
                this.f37552a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37553b.mo41878d();
        }

        public void dispose() {
            this.f37553b.dispose();
        }

        public void onComplete() {
            this.f37552a.onSuccess(Boolean.valueOf(true));
        }

        public void onError(Throwable th) {
            this.f37552a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37552a.onSuccess(Boolean.valueOf(false));
        }
    }

    public C13048q0(C5941y<T> yVar) {
        super(yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super Boolean> vVar) {
        this.f37333a.mo24639a(new C13049a(vVar));
    }
}
