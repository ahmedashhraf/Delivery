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

/* renamed from: e.a.x0.e.b.t1 */
/* compiled from: FlowableInterval */
public final class C12838t1 extends C5929l<Long> {

    /* renamed from: N */
    final long f36900N;

    /* renamed from: O */
    final long f36901O;

    /* renamed from: P */
    final TimeUnit f36902P;

    /* renamed from: b */
    final C12282j0 f36903b;

    /* renamed from: e.a.x0.e.b.t1$a */
    /* compiled from: FlowableInterval */
    static final class C12839a extends AtomicLong implements C14063d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: N */
        final AtomicReference<C12314c> f36904N = new AtomicReference<>();

        /* renamed from: a */
        final C14062c<? super Long> f36905a;

        /* renamed from: b */
        long f36906b;

        C12839a(C14062c<? super Long> cVar) {
            this.f36905a = cVar;
        }

        /* renamed from: a */
        public void mo42464a(C12314c cVar) {
            C12347d.m55468c(this.f36904N, cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            C12347d.m55465a(this.f36904N);
        }

        public void run() {
            if (this.f36904N.get() == C12347d.DISPOSED) {
                return;
            }
            if (get() != 0) {
                C14062c<? super Long> cVar = this.f36905a;
                long j = this.f36906b;
                this.f36906b = j + 1;
                cVar.mo41789a(Long.valueOf(j));
                C13747d.m58699c(this, 1);
                return;
            }
            C14062c<? super Long> cVar2 = this.f36905a;
            StringBuilder sb = new StringBuilder();
            sb.append("Can't deliver value ");
            sb.append(this.f36906b);
            sb.append(" due to lack of requests");
            cVar2.onError(new MissingBackpressureException(sb.toString()));
            C12347d.m55465a(this.f36904N);
        }
    }

    public C12838t1(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f36900N = j;
        this.f36901O = j2;
        this.f36902P = timeUnit;
        this.f36903b = j0Var;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Long> cVar) {
        C12839a aVar = new C12839a(cVar);
        cVar.mo41788a((C14063d) aVar);
        C12282j0 j0Var = this.f36903b;
        if (j0Var instanceof C13707s) {
            C12285c a = j0Var.mo41871a();
            aVar.mo42464a(a);
            a.mo42028a(aVar, this.f36900N, this.f36901O, this.f36902P);
            return;
        }
        aVar.mo42464a(j0Var.mo42022a(aVar, this.f36900N, this.f36901O, this.f36902P));
    }
}
