package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.p0 */
/* compiled from: SingleTimer */
public final class C13623p0 extends C5928k0<Long> {

    /* renamed from: N */
    final C12282j0 f39430N;

    /* renamed from: a */
    final long f39431a;

    /* renamed from: b */
    final TimeUnit f39432b;

    /* renamed from: e.a.x0.e.g.p0$a */
    /* compiled from: SingleTimer */
    static final class C13624a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: a */
        final C12292n0<? super Long> f39433a;

        C13624a(C12292n0<? super Long> n0Var) {
            this.f39433a = n0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43008a(C12314c cVar) {
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
            this.f39433a.onSuccess(Long.valueOf(0));
        }
    }

    public C13623p0(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f39431a = j;
        this.f39432b = timeUnit;
        this.f39430N = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Long> n0Var) {
        C13624a aVar = new C13624a(n0Var);
        n0Var.mo41974a(aVar);
        aVar.mo43008a(this.f39430N.mo42023a(aVar, this.f39431a, this.f39432b));
    }
}
