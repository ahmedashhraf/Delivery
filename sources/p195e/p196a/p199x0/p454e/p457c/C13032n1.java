package p195e.p196a.p199x0.p454e.p457c;

import java.util.NoSuchElementException;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5928k0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12397f;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.n1 */
/* compiled from: MaybeToSingle */
public final class C13032n1<T> extends C5928k0<T> implements C12397f<T> {

    /* renamed from: a */
    final C5941y<T> f37526a;

    /* renamed from: b */
    final T f37527b;

    /* renamed from: e.a.x0.e.c.n1$a */
    /* compiled from: MaybeToSingle */
    static final class C13033a<T> implements C12321v<T>, C12314c {

        /* renamed from: N */
        C12314c f37528N;

        /* renamed from: a */
        final C12292n0<? super T> f37529a;

        /* renamed from: b */
        final T f37530b;

        C13033a(C12292n0<? super T> n0Var, T t) {
            this.f37529a = n0Var;
            this.f37530b = t;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37528N, cVar)) {
                this.f37528N = cVar;
                this.f37529a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37528N.mo41878d();
        }

        public void dispose() {
            this.f37528N.dispose();
            this.f37528N = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37528N = C12347d.DISPOSED;
            T t = this.f37530b;
            if (t != null) {
                this.f37529a.onSuccess(t);
            } else {
                this.f37529a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        public void onError(Throwable th) {
            this.f37528N = C12347d.DISPOSED;
            this.f37529a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37528N = C12347d.DISPOSED;
            this.f37529a.onSuccess(t);
        }
    }

    public C13032n1(C5941y<T> yVar, T t) {
        this.f37526a = yVar;
        this.f37527b = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f37526a.mo24639a(new C13033a(n0Var, this.f37527b));
    }

    public C5941y<T> source() {
        return this.f37526a;
    }
}
