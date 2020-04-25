package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.i4 */
/* compiled from: FlowableThrottleFirstTimed */
public final class C12654i4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36234N;

    /* renamed from: O */
    final TimeUnit f36235O;

    /* renamed from: P */
    final C12282j0 f36236P;

    /* renamed from: e.a.x0.e.b.i4$a */
    /* compiled from: FlowableThrottleFirstTimed */
    static final class C12655a<T> extends AtomicLong implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: N */
        final TimeUnit f36237N;

        /* renamed from: O */
        final C12285c f36238O;

        /* renamed from: P */
        C14063d f36239P;

        /* renamed from: Q */
        final C12350g f36240Q = new C12350g();

        /* renamed from: R */
        volatile boolean f36241R;

        /* renamed from: S */
        boolean f36242S;

        /* renamed from: a */
        final C14062c<? super T> f36243a;

        /* renamed from: b */
        final long f36244b;

        C12655a(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12285c cVar2) {
            this.f36243a = cVar;
            this.f36244b = j;
            this.f36237N = timeUnit;
            this.f36238O = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36239P, dVar)) {
                this.f36239P = dVar;
                this.f36243a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f36239P.cancel();
            this.f36238O.dispose();
        }

        public void onComplete() {
            if (!this.f36242S) {
                this.f36242S = true;
                this.f36243a.onComplete();
                this.f36238O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f36242S) {
                C12205a.m54894b(th);
                return;
            }
            this.f36242S = true;
            this.f36243a.onError(th);
            this.f36238O.dispose();
        }

        public void run() {
            this.f36241R = false;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36242S && !this.f36241R) {
                this.f36241R = true;
                if (get() != 0) {
                    this.f36243a.mo41789a(t);
                    C13747d.m58699c(this, 1);
                    C12314c cVar = (C12314c) this.f36240Q.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f36240Q.mo42109a(this.f36238O.mo41877a(this, this.f36244b, this.f36237N));
                } else {
                    this.f36242S = true;
                    cancel();
                    this.f36243a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }
    }

    public C12654i4(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        super(lVar);
        this.f36234N = j;
        this.f36235O = timeUnit;
        this.f36236P = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12655a aVar = new C12655a(new C12274e(cVar), this.f36234N, this.f36235O, this.f36236P.mo41871a());
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
