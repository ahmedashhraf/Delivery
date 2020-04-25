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

/* renamed from: e.a.x0.e.e.p1 */
/* compiled from: ObservableInterval */
public final class C13363p1 extends C5923b0<Long> {

    /* renamed from: N */
    final long f38613N;

    /* renamed from: O */
    final TimeUnit f38614O;

    /* renamed from: a */
    final C12282j0 f38615a;

    /* renamed from: b */
    final long f38616b;

    /* renamed from: e.a.x0.e.e.p1$a */
    /* compiled from: ObservableInterval */
    static final class C13364a extends AtomicReference<C12314c> implements C12314c, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: a */
        final C12280i0<? super Long> f38617a;

        /* renamed from: b */
        long f38618b;

        C13364a(C12280i0<? super Long> i0Var) {
            this.f38617a = i0Var;
        }

        /* renamed from: a */
        public void mo42834a(C12314c cVar) {
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
            if (get() != C12347d.DISPOSED) {
                C12280i0<? super Long> i0Var = this.f38617a;
                long j = this.f38618b;
                this.f38618b = 1 + j;
                i0Var.mo33453a(Long.valueOf(j));
            }
        }
    }

    public C13363p1(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f38616b = j;
        this.f38613N = j2;
        this.f38614O = timeUnit;
        this.f38615a = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super Long> i0Var) {
        C13364a aVar = new C13364a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        C12282j0 j0Var = this.f38615a;
        if (j0Var instanceof C13707s) {
            C12285c a = j0Var.mo41871a();
            aVar.mo42834a(a);
            a.mo42028a(aVar, this.f38616b, this.f38613N, this.f38614O);
            return;
        }
        aVar.mo42834a(j0Var.mo42022a(aVar, this.f38616b, this.f38613N, this.f38614O));
    }
}
