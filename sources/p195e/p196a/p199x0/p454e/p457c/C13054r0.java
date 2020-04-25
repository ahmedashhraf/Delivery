package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12394c;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.r0 */
/* compiled from: MaybeIsEmptySingle */
public final class C13054r0<T> extends C5928k0<Boolean> implements C12397f<T>, C12394c<Boolean> {

    /* renamed from: a */
    final C5941y<T> f37566a;

    /* renamed from: e.a.x0.e.c.r0$a */
    /* compiled from: MaybeIsEmptySingle */
    static final class C13055a<T> implements C12321v<T>, C12314c {

        /* renamed from: a */
        final C12292n0<? super Boolean> f37567a;

        /* renamed from: b */
        C12314c f37568b;

        C13055a(C12292n0<? super Boolean> n0Var) {
            this.f37567a = n0Var;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37568b, cVar)) {
                this.f37568b = cVar;
                this.f37567a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37568b.mo41878d();
        }

        public void dispose() {
            this.f37568b.dispose();
            this.f37568b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37568b = C12347d.DISPOSED;
            this.f37567a.onSuccess(Boolean.valueOf(true));
        }

        public void onError(Throwable th) {
            this.f37568b = C12347d.DISPOSED;
            this.f37567a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37568b = C12347d.DISPOSED;
            this.f37567a.onSuccess(Boolean.valueOf(false));
        }
    }

    public C13054r0(C5941y<T> yVar) {
        this.f37566a = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f37566a.mo24639a(new C13055a(n0Var));
    }

    /* renamed from: c */
    public C5931s<Boolean> mo42140c() {
        return C12205a.m54873a((C5931s<T>) new C13048q0<T>(this.f37566a));
    }

    public C5941y<T> source() {
        return this.f37566a;
    }
}
