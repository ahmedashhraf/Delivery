package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5930q0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.y */
/* compiled from: MaybeFilterSingle */
public final class C13084y<T> extends C5931s<T> {

    /* renamed from: a */
    final C5930q0<T> f37627a;

    /* renamed from: b */
    final C12342r<? super T> f37628b;

    /* renamed from: e.a.x0.e.c.y$a */
    /* compiled from: MaybeFilterSingle */
    static final class C13085a<T> implements C12292n0<T>, C12314c {

        /* renamed from: N */
        C12314c f37629N;

        /* renamed from: a */
        final C12321v<? super T> f37630a;

        /* renamed from: b */
        final C12342r<? super T> f37631b;

        C13085a(C12321v<? super T> vVar, C12342r<? super T> rVar) {
            this.f37630a = vVar;
            this.f37631b = rVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f37629N, cVar)) {
                this.f37629N = cVar;
                this.f37630a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37629N.mo41878d();
        }

        public void dispose() {
            C12314c cVar = this.f37629N;
            this.f37629N = C12347d.DISPOSED;
            cVar.dispose();
        }

        public void onError(Throwable th) {
            this.f37630a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                if (this.f37631b.mo41812b(t)) {
                    this.f37630a.onSuccess(t);
                } else {
                    this.f37630a.onComplete();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37630a.onError(th);
            }
        }
    }

    public C13084y(C5930q0<T> q0Var, C12342r<? super T> rVar) {
        this.f37627a = q0Var;
        this.f37628b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37627a.mo24192a(new C13085a(vVar, this.f37628b));
    }
}
