package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.h */
/* compiled from: MaybeContains */
public final class C12992h<T> extends C5928k0<Boolean> implements C12397f<T> {

    /* renamed from: a */
    final C5941y<T> f37456a;

    /* renamed from: b */
    final Object f37457b;

    /* renamed from: e.a.x0.e.c.h$a */
    /* compiled from: MaybeContains */
    static final class C12993a implements C12321v<Object>, C12314c {

        /* renamed from: N */
        C12314c f37458N;

        /* renamed from: a */
        final C12292n0<? super Boolean> f37459a;

        /* renamed from: b */
        final Object f37460b;

        C12993a(C12292n0<? super Boolean> n0Var, Object obj) {
            this.f37459a = n0Var;
            this.f37460b = obj;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37458N, cVar)) {
                this.f37458N = cVar;
                this.f37459a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37458N.mo41878d();
        }

        public void dispose() {
            this.f37458N.dispose();
            this.f37458N = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37458N = C12347d.DISPOSED;
            this.f37459a.onSuccess(Boolean.valueOf(false));
        }

        public void onError(Throwable th) {
            this.f37458N = C12347d.DISPOSED;
            this.f37459a.onError(th);
        }

        public void onSuccess(Object obj) {
            this.f37458N = C12347d.DISPOSED;
            this.f37459a.onSuccess(Boolean.valueOf(C12390b.m55564a(obj, this.f37460b)));
        }
    }

    public C12992h(C5941y<T> yVar, Object obj) {
        this.f37456a = yVar;
        this.f37457b = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f37456a.mo24639a(new C12993a(n0Var, this.f37457b));
    }

    public C5941y<T> source() {
        return this.f37456a;
    }
}
