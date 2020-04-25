package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12268f;
import p195e.p196a.C12321v;
import p195e.p196a.C5927i;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12396e;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.j0 */
/* compiled from: MaybeFromCompletable */
public final class C13008j0<T> extends C5931s<T> implements C12396e {

    /* renamed from: a */
    final C5927i f37484a;

    /* renamed from: e.a.x0.e.c.j0$a */
    /* compiled from: MaybeFromCompletable */
    static final class C13009a<T> implements C12268f, C12314c {

        /* renamed from: a */
        final C12321v<? super T> f37485a;

        /* renamed from: b */
        C12314c f37486b;

        C13009a(C12321v<? super T> vVar) {
            this.f37485a = vVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            if (C12347d.m55464a(this.f37486b, cVar)) {
                this.f37486b = cVar;
                this.f37485a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37486b.mo41878d();
        }

        public void dispose() {
            this.f37486b.dispose();
            this.f37486b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37486b = C12347d.DISPOSED;
            this.f37485a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37486b = C12347d.DISPOSED;
            this.f37485a.onError(th);
        }
    }

    public C13008j0(C5927i iVar) {
        this.f37484a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f37484a.mo24122a(new C13009a(vVar));
    }

    public C5927i source() {
        return this.f37484a;
    }
}
