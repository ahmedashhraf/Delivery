package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C5925c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.a.k0 */
/* compiled from: CompletableTimer */
public final class C12479k0 extends C5925c {

    /* renamed from: N */
    final C12282j0 f35756N;

    /* renamed from: a */
    final long f35757a;

    /* renamed from: b */
    final TimeUnit f35758b;

    /* renamed from: e.a.x0.e.a.k0$a */
    /* compiled from: CompletableTimer */
    static final class C12480a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* renamed from: a */
        final C12268f f35759a;

        C12480a(C12268f fVar) {
            this.f35759a = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42210a(C12314c cVar) {
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
            this.f35759a.onComplete();
        }
    }

    public C12479k0(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f35757a = j;
        this.f35758b = timeUnit;
        this.f35756N = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12480a aVar = new C12480a(fVar);
        fVar.mo41921a(aVar);
        aVar.mo42210a(this.f35756N.mo42023a(aVar, this.f35757a, this.f35758b));
    }
}
