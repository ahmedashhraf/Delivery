package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.c.q */
/* compiled from: MaybeDoAfterSuccess */
public final class C13046q<T> extends C12943a<T, T> {

    /* renamed from: b */
    final C12331g<? super T> f37548b;

    /* renamed from: e.a.x0.e.c.q$a */
    /* compiled from: MaybeDoAfterSuccess */
    static final class C13047a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37549N;

        /* renamed from: a */
        final C12321v<? super T> f37550a;

        /* renamed from: b */
        final C12331g<? super T> f37551b;

        C13047a(C12321v<? super T> vVar, C12331g<? super T> gVar) {
            this.f37550a = vVar;
            this.f37551b = gVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37549N, cVar)) {
                this.f37549N = cVar;
                this.f37550a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37549N.mo41878d();
        }

        public void dispose() {
            this.f37549N.dispose();
        }

        public void onComplete() {
            this.f37550a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37550a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37550a.onSuccess(t);
            try {
                this.f37551b.mo33410c(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C13046q(C5941y<T> yVar, C12331g<? super T> gVar) {
        super(yVar);
        this.f37548b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37333a.mo24639a(new C13047a(vVar, this.f37548b));
    }
}
