package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.y3 */
/* compiled from: ObservableTimer */
public final class C13496y3 extends C5923b0<Long> {

    /* renamed from: N */
    final TimeUnit f39088N;

    /* renamed from: a */
    final C12282j0 f39089a;

    /* renamed from: b */
    final long f39090b;

    /* renamed from: e.a.x0.e.e.y3$a */
    /* compiled from: ObservableTimer */
    static final class C13497a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C12280i0<? super Long> f39091a;

        C13497a(C12280i0<? super Long> i0Var) {
            this.f39091a = i0Var;
        }

        /* renamed from: a */
        public void mo42944a(C12314c cVar) {
            C12347d.m55469d(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void run() {
            if (!mo41878d()) {
                this.f39091a.mo33453a(Long.valueOf(0));
                lazySet(C12348e.INSTANCE);
                this.f39091a.onComplete();
            }
        }
    }

    public C13496y3(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f39090b = j;
        this.f39088N = timeUnit;
        this.f39089a = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super Long> i0Var) {
        C13497a aVar = new C13497a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        aVar.mo42944a(this.f39089a.mo42023a(aVar, this.f39090b, this.f39088N));
    }
}
