package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.x3 */
/* compiled from: ObservableTimeoutTimed */
public final class C13481x3<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f39043N;

    /* renamed from: O */
    final C12282j0 f39044O;

    /* renamed from: P */
    final C5926g0<? extends T> f39045P;

    /* renamed from: b */
    final long f39046b;

    /* renamed from: e.a.x0.e.e.x3$a */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13482a<T> implements C12280i0<T> {

        /* renamed from: a */
        final C12280i0<? super T> f39047a;

        /* renamed from: b */
        final AtomicReference<C12314c> f39048b;

        C13482a(C12280i0<? super T> i0Var, AtomicReference<C12314c> atomicReference) {
            this.f39047a = i0Var;
            this.f39048b = atomicReference;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55466a(this.f39048b, cVar);
        }

        public void onComplete() {
            this.f39047a.onComplete();
        }

        public void onError(Throwable th) {
            this.f39047a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f39047a.mo33453a(t);
        }
    }

    /* renamed from: e.a.x0.e.e.x3$b */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13483b<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c, C13485d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: N */
        final TimeUnit f39049N;

        /* renamed from: O */
        final C12285c f39050O;

        /* renamed from: P */
        final C12350g f39051P = new C12350g();

        /* renamed from: Q */
        final AtomicLong f39052Q = new AtomicLong();

        /* renamed from: R */
        final AtomicReference<C12314c> f39053R = new AtomicReference<>();

        /* renamed from: S */
        C5926g0<? extends T> f39054S;

        /* renamed from: a */
        final C12280i0<? super T> f39055a;

        /* renamed from: b */
        final long f39056b;

        C13483b(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12285c cVar, C5926g0<? extends T> g0Var) {
            this.f39055a = i0Var;
            this.f39056b = j;
            this.f39049N = timeUnit;
            this.f39050O = cVar;
            this.f39054S = g0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f39053R, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42939b(long j) {
            this.f39051P.mo42109a(this.f39050O.mo41877a(new C13486e(j, this), this.f39056b, this.f39049N));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a(this.f39053R);
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f39050O.dispose();
        }

        public void onComplete() {
            if (this.f39052Q.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39051P.dispose();
                this.f39055a.onComplete();
                this.f39050O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f39052Q.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39051P.dispose();
                this.f39055a.onError(th);
                this.f39050O.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = this.f39052Q.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f39052Q.compareAndSet(j, j2)) {
                    ((C12314c) this.f39051P.get()).dispose();
                    this.f39055a.mo33453a(t);
                    mo42939b(j2);
                }
            }
        }

        /* renamed from: a */
        public void mo42932a(long j) {
            if (this.f39052Q.compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a(this.f39053R);
                C5926g0<? extends T> g0Var = this.f39054S;
                this.f39054S = null;
                g0Var.mo23893a(new C13482a(this.f39055a, this));
                this.f39050O.dispose();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.x3$c */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13484c<T> extends AtomicLong implements C12280i0<T>, C12314c, C13485d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: N */
        final TimeUnit f39057N;

        /* renamed from: O */
        final C12285c f39058O;

        /* renamed from: P */
        final C12350g f39059P = new C12350g();

        /* renamed from: Q */
        final AtomicReference<C12314c> f39060Q = new AtomicReference<>();

        /* renamed from: a */
        final C12280i0<? super T> f39061a;

        /* renamed from: b */
        final long f39062b;

        C13484c(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12285c cVar) {
            this.f39061a = i0Var;
            this.f39062b = j;
            this.f39057N = timeUnit;
            this.f39058O = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f39060Q, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42940b(long j) {
            this.f39059P.mo42109a(this.f39058O.mo41877a(new C13486e(j, this), this.f39062b, this.f39057N));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f39060Q.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f39060Q);
            this.f39058O.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39059P.dispose();
                this.f39061a.onComplete();
                this.f39058O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39059P.dispose();
                this.f39061a.onError(th);
                this.f39058O.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((C12314c) this.f39059P.get()).dispose();
                    this.f39061a.mo33453a(t);
                    mo42940b(j2);
                }
            }
        }

        /* renamed from: a */
        public void mo42932a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a(this.f39060Q);
                this.f39061a.onError(new TimeoutException());
                this.f39058O.dispose();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.x3$d */
    /* compiled from: ObservableTimeoutTimed */
    interface C13485d {
        /* renamed from: a */
        void mo42932a(long j);
    }

    /* renamed from: e.a.x0.e.e.x3$e */
    /* compiled from: ObservableTimeoutTimed */
    static final class C13486e implements Runnable {

        /* renamed from: a */
        final C13485d f39063a;

        /* renamed from: b */
        final long f39064b;

        C13486e(long j, C13485d dVar) {
            this.f39064b = j;
            this.f39063a = dVar;
        }

        public void run() {
            this.f39063a.mo42932a(this.f39064b);
        }
    }

    public C13481x3(C5923b0<T> b0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, C5926g0<? extends T> g0Var) {
        super(b0Var);
        this.f39046b = j;
        this.f39043N = timeUnit;
        this.f39044O = j0Var;
        this.f39045P = g0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        if (this.f39045P == null) {
            C13484c cVar = new C13484c(i0Var, this.f39046b, this.f39043N, this.f39044O.mo41871a());
            i0Var.mo34123a((C12314c) cVar);
            cVar.mo42940b(0);
            this.f37851a.mo23893a(cVar);
            return;
        }
        C13483b bVar = new C13483b(i0Var, this.f39046b, this.f39043N, this.f39044O.mo41871a(), this.f39045P);
        i0Var.mo34123a((C12314c) bVar);
        bVar.mo42939b(0);
        this.f37851a.mo23893a(bVar);
    }
}
