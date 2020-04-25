package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p463g.C13707s;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.u1 */
/* compiled from: FlowableIntervalRange */
public final class C12857u1 extends C5929l<Long> {

    /* renamed from: N */
    final long f36966N;

    /* renamed from: O */
    final long f36967O;

    /* renamed from: P */
    final long f36968P;

    /* renamed from: Q */
    final long f36969Q;

    /* renamed from: R */
    final TimeUnit f36970R;

    /* renamed from: b */
    final C12282j0 f36971b;

    /* renamed from: e.a.x0.e.b.u1$a */
    /* compiled from: FlowableIntervalRange */
    static final class C12858a extends AtomicLong implements C14063d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: N */
        long f36972N;

        /* renamed from: O */
        final AtomicReference<C12314c> f36973O = new AtomicReference<>();

        /* renamed from: a */
        final C14062c<? super Long> f36974a;

        /* renamed from: b */
        final long f36975b;

        C12858a(C14062c<? super Long> cVar, long j, long j2) {
            this.f36974a = cVar;
            this.f36972N = j;
            this.f36975b = j2;
        }

        /* renamed from: a */
        public void mo42484a(C12314c cVar) {
            C12347d.m55468c(this.f36973O, cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            C12347d.m55465a(this.f36973O);
        }

        public void run() {
            if (this.f36973O.get() != C12347d.DISPOSED) {
                long j = get();
                if (j != 0) {
                    long j2 = this.f36972N;
                    this.f36974a.mo41789a(Long.valueOf(j2));
                    if (j2 == this.f36975b) {
                        if (this.f36973O.get() != C12347d.DISPOSED) {
                            this.f36974a.onComplete();
                        }
                        C12347d.m55465a(this.f36973O);
                        return;
                    }
                    this.f36972N = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                } else {
                    C14062c<? super Long> cVar = this.f36974a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't deliver value ");
                    sb.append(this.f36972N);
                    sb.append(" due to lack of requests");
                    cVar.onError(new MissingBackpressureException(sb.toString()));
                    C12347d.m55465a(this.f36973O);
                }
            }
        }
    }

    public C12857u1(long j, long j2, long j3, long j4, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f36968P = j3;
        this.f36969Q = j4;
        this.f36970R = timeUnit;
        this.f36971b = j0Var;
        this.f36966N = j;
        this.f36967O = j2;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Long> cVar) {
        C12858a aVar = new C12858a(cVar, this.f36966N, this.f36967O);
        cVar.mo41788a((C14063d) aVar);
        C12282j0 j0Var = this.f36971b;
        if (j0Var instanceof C13707s) {
            C12285c a = j0Var.mo41871a();
            aVar.mo42484a(a);
            a.mo42028a(aVar, this.f36968P, this.f36969Q, this.f36970R);
            return;
        }
        aVar.mo42484a(j0Var.mo42022a(aVar, this.f36968P, this.f36969Q, this.f36970R));
    }
}
