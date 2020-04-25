package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p463g.C13707s;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.q1 */
/* compiled from: ObservableIntervalRange */
public final class C13377q1 extends C5923b0<Long> {

    /* renamed from: N */
    final long f38673N;

    /* renamed from: O */
    final long f38674O;

    /* renamed from: P */
    final long f38675P;

    /* renamed from: Q */
    final TimeUnit f38676Q;

    /* renamed from: a */
    final C12282j0 f38677a;

    /* renamed from: b */
    final long f38678b;

    /* renamed from: e.a.x0.e.e.q1$a */
    /* compiled from: ObservableIntervalRange */
    static final class C13378a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: N */
        long f38679N;

        /* renamed from: a */
        final C12280i0<? super Long> f38680a;

        /* renamed from: b */
        final long f38681b;

        C13378a(C12280i0<? super Long> i0Var, long j, long j2) {
            this.f38680a = i0Var;
            this.f38679N = j;
            this.f38681b = j2;
        }

        /* renamed from: a */
        public void mo42847a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
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
                long j = this.f38679N;
                this.f38680a.mo33453a(Long.valueOf(j));
                if (j == this.f38681b) {
                    C12347d.m55465a((AtomicReference<C12314c>) this);
                    this.f38680a.onComplete();
                    return;
                }
                this.f38679N = j + 1;
            }
        }
    }

    public C13377q1(long j, long j2, long j3, long j4, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f38674O = j3;
        this.f38675P = j4;
        this.f38676Q = timeUnit;
        this.f38677a = j0Var;
        this.f38678b = j;
        this.f38673N = j2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super Long> i0Var) {
        C13378a aVar = new C13378a(i0Var, this.f38678b, this.f38673N);
        i0Var.mo34123a((C12314c) aVar);
        C12282j0 j0Var = this.f38677a;
        if (j0Var instanceof C13707s) {
            C12285c a = j0Var.mo41871a();
            aVar.mo42847a(a);
            a.mo42028a(aVar, this.f38674O, this.f38675P, this.f38676Q);
            return;
        }
        aVar.mo42847a(j0Var.mo42022a(aVar, this.f38674O, this.f38675P, this.f38676Q));
    }
}
