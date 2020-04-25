package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.i */
/* compiled from: MaybeCount */
public final class C12999i<T> extends C5928k0<Long> implements C12397f<T> {

    /* renamed from: a */
    final C5941y<T> f37470a;

    /* renamed from: e.a.x0.e.c.i$a */
    /* compiled from: MaybeCount */
    static final class C13000a implements C12321v<Object>, C12314c {

        /* renamed from: a */
        final C12292n0<? super Long> f37471a;

        /* renamed from: b */
        C12314c f37472b;

        C13000a(C12292n0<? super Long> n0Var) {
            this.f37471a = n0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37472b, cVar)) {
                this.f37472b = cVar;
                this.f37471a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37472b.mo41878d();
        }

        public void dispose() {
            this.f37472b.dispose();
            this.f37472b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37472b = C12347d.DISPOSED;
            this.f37471a.onSuccess(Long.valueOf(0));
        }

        public void onError(Throwable th) {
            this.f37472b = C12347d.DISPOSED;
            this.f37471a.onError(th);
        }

        public void onSuccess(Object obj) {
            this.f37472b = C12347d.DISPOSED;
            this.f37471a.onSuccess(Long.valueOf(1));
        }
    }

    public C12999i(C5941y<T> yVar) {
        this.f37470a = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Long> n0Var) {
        this.f37470a.mo24639a(new C13000a(n0Var));
    }

    public C5941y<T> source() {
        return this.f37470a;
    }
}
