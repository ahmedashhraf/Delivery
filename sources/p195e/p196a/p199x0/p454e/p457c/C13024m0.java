package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5930q0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12400i;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.m0 */
/* compiled from: MaybeFromSingle */
public final class C13024m0<T> extends C5931s<T> implements C12400i<T> {

    /* renamed from: a */
    final C5930q0<T> f37516a;

    /* renamed from: e.a.x0.e.c.m0$a */
    /* compiled from: MaybeFromSingle */
    static final class C13025a<T> implements C12292n0<T>, C12314c {

        /* renamed from: a */
        final C12321v<? super T> f37517a;

        /* renamed from: b */
        C12314c f37518b;

        C13025a(C12321v<? super T> vVar) {
            this.f37517a = vVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            if (C12347d.m55464a(this.f37518b, cVar)) {
                this.f37518b = cVar;
                this.f37517a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37518b.mo41878d();
        }

        public void dispose() {
            this.f37518b.dispose();
            this.f37518b = C12347d.DISPOSED;
        }

        public void onError(Throwable th) {
            this.f37518b = C12347d.DISPOSED;
            this.f37517a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37518b = C12347d.DISPOSED;
            this.f37517a.onSuccess(t);
        }
    }

    public C13024m0(C5930q0<T> q0Var) {
        this.f37516a = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37516a.mo24192a(new C13025a(vVar));
    }

    public C5930q0<T> source() {
        return this.f37516a;
    }
}
