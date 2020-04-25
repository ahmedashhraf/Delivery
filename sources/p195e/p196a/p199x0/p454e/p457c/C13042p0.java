package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12268f;
import p195e.p196a.C12321v;
import p195e.p196a.C5925c;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12394c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.p0 */
/* compiled from: MaybeIgnoreElementCompletable */
public final class C13042p0<T> extends C5925c implements C12394c<T> {

    /* renamed from: a */
    final C5941y<T> f37541a;

    /* renamed from: e.a.x0.e.c.p0$a */
    /* compiled from: MaybeIgnoreElementCompletable */
    static final class C13043a<T> implements C12321v<T>, C12314c {

        /* renamed from: a */
        final C12268f f37542a;

        /* renamed from: b */
        C12314c f37543b;

        C13043a(C12268f fVar) {
            this.f37542a = fVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            if (C12347d.m55464a(this.f37543b, cVar)) {
                this.f37543b = cVar;
                this.f37542a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37543b.mo41878d();
        }

        public void dispose() {
            this.f37543b.dispose();
            this.f37543b = C12347d.DISPOSED;
        }

        public void onComplete() {
            this.f37543b = C12347d.DISPOSED;
            this.f37542a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37543b = C12347d.DISPOSED;
            this.f37542a.onError(th);
        }

        public void onSuccess(T t) {
            this.f37543b = C12347d.DISPOSED;
            this.f37542a.onComplete();
        }
    }

    public C13042p0(C5941y<T> yVar) {
        this.f37541a = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f37541a.mo24639a(new C13043a(fVar));
    }

    /* renamed from: c */
    public C5931s<T> mo42140c() {
        return C12205a.m54873a((C5931s<T>) new C13037o0<T>(this.f37541a));
    }
}
