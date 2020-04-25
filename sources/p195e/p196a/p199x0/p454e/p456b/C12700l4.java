package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.l4 */
/* compiled from: FlowableTimeoutTimed */
public final class C12700l4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36385N;

    /* renamed from: O */
    final TimeUnit f36386O;

    /* renamed from: P */
    final C12282j0 f36387P;

    /* renamed from: Q */
    final C6007b<? extends T> f36388Q;

    /* renamed from: e.a.x0.e.b.l4$a */
    /* compiled from: FlowableTimeoutTimed */
    static final class C12701a<T> implements C12297q<T> {

        /* renamed from: a */
        final C14062c<? super T> f36389a;

        /* renamed from: b */
        final C13741i f36390b;

        C12701a(C14062c<? super T> cVar, C13741i iVar) {
            this.f36389a = cVar;
            this.f36390b = iVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36390b.mo43130b(dVar);
        }

        public void onComplete() {
            this.f36389a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36389a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36389a.mo41789a(t);
        }
    }

    /* renamed from: e.a.x0.e.b.l4$b */
    /* compiled from: FlowableTimeoutTimed */
    static final class C12702b<T> extends C13741i implements C12297q<T>, C12704d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: S */
        final C14062c<? super T> f36391S;

        /* renamed from: T */
        final long f36392T;

        /* renamed from: U */
        final TimeUnit f36393U;

        /* renamed from: V */
        final C12285c f36394V;

        /* renamed from: W */
        final C12350g f36395W = new C12350g();

        /* renamed from: X */
        final AtomicReference<C14063d> f36396X = new AtomicReference<>();

        /* renamed from: Y */
        final AtomicLong f36397Y = new AtomicLong();

        /* renamed from: Z */
        long f36398Z;

        /* renamed from: a0 */
        C6007b<? extends T> f36399a0;

        C12702b(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12285c cVar2, C6007b<? extends T> bVar) {
            this.f36391S = cVar;
            this.f36392T = j;
            this.f36393U = timeUnit;
            this.f36394V = cVar2;
            this.f36399a0 = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f36396X, dVar)) {
                mo43130b(dVar);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36394V.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42363d(long j) {
            this.f36395W.mo42109a(this.f36394V.mo41877a(new C12705e(j, this), this.f36392T, this.f36393U));
        }

        public void onComplete() {
            if (this.f36397Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36395W.dispose();
                this.f36391S.onComplete();
                this.f36394V.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f36397Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36395W.dispose();
                this.f36391S.onError(th);
                this.f36394V.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = this.f36397Y.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f36397Y.compareAndSet(j, j2)) {
                    ((C12314c) this.f36395W.get()).dispose();
                    this.f36398Z++;
                    this.f36391S.mo41789a(t);
                    mo42363d(j2);
                }
            }
        }

        /* renamed from: a */
        public void mo42355a(long j) {
            if (this.f36397Y.compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36396X);
                long j2 = this.f36398Z;
                if (j2 != 0) {
                    mo43129b(j2);
                }
                C6007b<? extends T> bVar = this.f36399a0;
                this.f36399a0 = null;
                bVar.mo24397a(new C12701a(this.f36391S, this));
                this.f36394V.dispose();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.l4$c */
    /* compiled from: FlowableTimeoutTimed */
    static final class C12703c<T> extends AtomicLong implements C12297q<T>, C14063d, C12704d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: N */
        final TimeUnit f36400N;

        /* renamed from: O */
        final C12285c f36401O;

        /* renamed from: P */
        final C12350g f36402P = new C12350g();

        /* renamed from: Q */
        final AtomicReference<C14063d> f36403Q = new AtomicReference<>();

        /* renamed from: R */
        final AtomicLong f36404R = new AtomicLong();

        /* renamed from: a */
        final C14062c<? super T> f36405a;

        /* renamed from: b */
        final long f36406b;

        C12703c(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12285c cVar2) {
            this.f36405a = cVar;
            this.f36406b = j;
            this.f36400N = timeUnit;
            this.f36401O = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f36403Q, this.f36404R, dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42364b(long j) {
            this.f36402P.mo42109a(this.f36401O.mo41877a(new C12705e(j, this), this.f36406b, this.f36400N));
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f36403Q, this.f36404R, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f36403Q);
            this.f36401O.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36402P.dispose();
                this.f36405a.onComplete();
                this.f36401O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f36402P.dispose();
                this.f36405a.onError(th);
                this.f36401O.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((C12314c) this.f36402P.get()).dispose();
                    this.f36405a.mo41789a(t);
                    mo42364b(j2);
                }
            }
        }

        /* renamed from: a */
        public void mo42355a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C13742j.m58674a(this.f36403Q);
                this.f36405a.onError(new TimeoutException());
                this.f36401O.dispose();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.l4$d */
    /* compiled from: FlowableTimeoutTimed */
    interface C12704d {
        /* renamed from: a */
        void mo42355a(long j);
    }

    /* renamed from: e.a.x0.e.b.l4$e */
    /* compiled from: FlowableTimeoutTimed */
    static final class C12705e implements Runnable {

        /* renamed from: a */
        final C12704d f36407a;

        /* renamed from: b */
        final long f36408b;

        C12705e(long j, C12704d dVar) {
            this.f36408b = j;
            this.f36407a = dVar;
        }

        public void run() {
            this.f36407a.mo42355a(this.f36408b);
        }
    }

    public C12700l4(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var, C6007b<? extends T> bVar) {
        super(lVar);
        this.f36385N = j;
        this.f36386O = timeUnit;
        this.f36387P = j0Var;
        this.f36388Q = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (this.f36388Q == null) {
            C12703c cVar2 = new C12703c(cVar, this.f36385N, this.f36386O, this.f36387P.mo41871a());
            cVar.mo41788a((C14063d) cVar2);
            cVar2.mo42364b(0);
            this.f35814b.mo24393a((C12297q<? super T>) cVar2);
            return;
        }
        C12702b bVar = new C12702b(cVar, this.f36385N, this.f36386O, this.f36387P.mo41871a(), this.f36388Q);
        cVar.mo41788a((C14063d) bVar);
        bVar.mo42363d(0);
        this.f35814b.mo24393a((C12297q<? super T>) bVar);
    }
}
