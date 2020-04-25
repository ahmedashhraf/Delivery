package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.i3 */
/* compiled from: FlowableSampleTimed */
public final class C12650i3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36222N;

    /* renamed from: O */
    final TimeUnit f36223O;

    /* renamed from: P */
    final C12282j0 f36224P;

    /* renamed from: Q */
    final boolean f36225Q;

    /* renamed from: e.a.x0.e.b.i3$a */
    /* compiled from: FlowableSampleTimed */
    static final class C12651a<T> extends C12653c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: S */
        final AtomicInteger f36226S = new AtomicInteger(1);

        C12651a(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(cVar, j, timeUnit, j0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42336d() {
            mo42340e();
            if (this.f36226S.decrementAndGet() == 0) {
                this.f36232a.onComplete();
            }
        }

        public void run() {
            if (this.f36226S.incrementAndGet() == 2) {
                mo42340e();
                if (this.f36226S.decrementAndGet() == 0) {
                    this.f36232a.onComplete();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.i3$b */
    /* compiled from: FlowableSampleTimed */
    static final class C12652b<T> extends C12653c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        C12652b(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(cVar, j, timeUnit, j0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42336d() {
            this.f36232a.onComplete();
        }

        public void run() {
            mo42340e();
        }
    }

    /* renamed from: e.a.x0.e.b.i3$c */
    /* compiled from: FlowableSampleTimed */
    static abstract class C12653c<T> extends AtomicReference<T> implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: N */
        final TimeUnit f36227N;

        /* renamed from: O */
        final C12282j0 f36228O;

        /* renamed from: P */
        final AtomicLong f36229P = new AtomicLong();

        /* renamed from: Q */
        final C12350g f36230Q = new C12350g();

        /* renamed from: R */
        C14063d f36231R;

        /* renamed from: a */
        final C14062c<? super T> f36232a;

        /* renamed from: b */
        final long f36233b;

        C12653c(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f36232a = cVar;
            this.f36233b = j;
            this.f36227N = timeUnit;
            this.f36228O = j0Var;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36231R, dVar)) {
                this.f36231R = dVar;
                this.f36232a.mo41788a((C14063d) this);
                C12350g gVar = this.f36230Q;
                C12282j0 j0Var = this.f36228O;
                long j = this.f36233b;
                gVar.mo42109a(j0Var.mo42022a(this, j, j, this.f36227N));
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36229P, j);
            }
        }

        public void cancel() {
            mo42339a();
            this.f36231R.cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo42336d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42340e() {
            Object andSet = getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (this.f36229P.get() != 0) {
                this.f36232a.mo41789a(andSet);
                C13747d.m58699c(this.f36229P, 1);
                return;
            }
            cancel();
            this.f36232a.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
        }

        public void onComplete() {
            mo42339a();
            mo42336d();
        }

        public void onError(Throwable th) {
            mo42339a();
            this.f36232a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            lazySet(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42339a() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f36230Q);
        }
    }

    public C12650i3(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        super(lVar);
        this.f36222N = j;
        this.f36223O = timeUnit;
        this.f36224P = j0Var;
        this.f36225Q = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12274e eVar = new C12274e(cVar);
        if (this.f36225Q) {
            C5929l<T> lVar = this.f35814b;
            C12651a aVar = new C12651a(eVar, this.f36222N, this.f36223O, this.f36224P);
            lVar.mo24393a((C12297q<? super T>) aVar);
            return;
        }
        C5929l<T> lVar2 = this.f35814b;
        C12652b bVar = new C12652b(eVar, this.f36222N, this.f36223O, this.f36224P);
        lVar2.mo24393a((C12297q<? super T>) bVar);
    }
}
