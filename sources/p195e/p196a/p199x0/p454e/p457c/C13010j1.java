package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.j1 */
/* compiled from: MaybeTimer */
public final class C13010j1 extends C5931s<Long> {

    /* renamed from: N */
    final C12282j0 f37487N;

    /* renamed from: a */
    final long f37488a;

    /* renamed from: b */
    final TimeUnit f37489b;

    /* renamed from: e.a.x0.e.c.j1$a */
    /* compiled from: MaybeTimer */
    static final class C13011a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: a */
        final C12321v<? super Long> f37490a;

        C13011a(C12321v<? super Long> vVar) {
            this.f37490a = vVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42578a(C12314c cVar) {
            C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void run() {
            this.f37490a.onSuccess(Long.valueOf(0));
        }
    }

    public C13010j1(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f37488a = j;
        this.f37489b = timeUnit;
        this.f37487N = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super Long> vVar) {
        C13011a aVar = new C13011a(vVar);
        vVar.mo41931a(aVar);
        aVar.mo42578a(this.f37487N.mo42023a(aVar, this.f37488a, this.f37489b));
    }
}
