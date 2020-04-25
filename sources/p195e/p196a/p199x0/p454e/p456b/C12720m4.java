package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.m4 */
/* compiled from: FlowableTimer */
public final class C12720m4 extends C5929l<Long> {

    /* renamed from: N */
    final long f36473N;

    /* renamed from: O */
    final TimeUnit f36474O;

    /* renamed from: b */
    final C12282j0 f36475b;

    /* renamed from: e.a.x0.e.b.m4$a */
    /* compiled from: FlowableTimer */
    static final class C12721a extends AtomicReference<C12314c> implements C14063d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C14062c<? super Long> f36476a;

        /* renamed from: b */
        volatile boolean f36477b;

        C12721a(C14062c<? super Long> cVar) {
            this.f36476a = cVar;
        }

        /* renamed from: a */
        public void mo42373a(C12314c cVar) {
            C12347d.m55469d(this, cVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                this.f36477b = true;
            }
        }

        public void cancel() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void run() {
            if (get() == C12347d.DISPOSED) {
                return;
            }
            if (this.f36477b) {
                this.f36476a.mo41789a(Long.valueOf(0));
                lazySet(C12348e.INSTANCE);
                this.f36476a.onComplete();
                return;
            }
            lazySet(C12348e.INSTANCE);
            this.f36476a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }
    }

    public C12720m4(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        this.f36473N = j;
        this.f36474O = timeUnit;
        this.f36475b = j0Var;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Long> cVar) {
        C12721a aVar = new C12721a(cVar);
        cVar.mo41788a((C14063d) aVar);
        aVar.mo42373a(this.f36475b.mo42023a(aVar, this.f36473N, this.f36474O));
    }
}
