package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.h0 */
/* compiled from: FlowableDebounceTimed */
public final class C12631h0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36163N;

    /* renamed from: O */
    final TimeUnit f36164O;

    /* renamed from: P */
    final C12282j0 f36165P;

    /* renamed from: e.a.x0.e.b.h0$a */
    /* compiled from: FlowableDebounceTimed */
    static final class C12632a<T> extends AtomicReference<C12314c> implements Runnable, C12314c {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: N */
        final C12633b<T> f36166N;

        /* renamed from: O */
        final AtomicBoolean f36167O = new AtomicBoolean();

        /* renamed from: a */
        final T f36168a;

        /* renamed from: b */
        final long f36169b;

        C12632a(T t, long j, C12633b<T> bVar) {
            this.f36168a = t;
            this.f36169b = j;
            this.f36166N = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42319a() {
            if (this.f36167O.compareAndSet(false, true)) {
                this.f36166N.mo42322a(this.f36169b, this.f36168a, this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void run() {
            mo42319a();
        }

        /* renamed from: a */
        public void mo42320a(C12314c cVar) {
            C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
        }
    }

    /* renamed from: e.a.x0.e.b.h0$b */
    /* compiled from: FlowableDebounceTimed */
    static final class C12633b<T> extends AtomicLong implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: N */
        final TimeUnit f36170N;

        /* renamed from: O */
        final C12285c f36171O;

        /* renamed from: P */
        C14063d f36172P;

        /* renamed from: Q */
        C12314c f36173Q;

        /* renamed from: R */
        volatile long f36174R;

        /* renamed from: S */
        boolean f36175S;

        /* renamed from: a */
        final C14062c<? super T> f36176a;

        /* renamed from: b */
        final long f36177b;

        C12633b(C14062c<? super T> cVar, long j, TimeUnit timeUnit, C12285c cVar2) {
            this.f36176a = cVar;
            this.f36177b = j;
            this.f36170N = timeUnit;
            this.f36171O = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36172P, dVar)) {
                this.f36172P = dVar;
                this.f36176a.mo41788a((C14063d) this);
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
            this.f36172P.cancel();
            this.f36171O.dispose();
        }

        public void onComplete() {
            if (!this.f36175S) {
                this.f36175S = true;
                C12314c cVar = this.f36173Q;
                if (cVar != null) {
                    cVar.dispose();
                }
                C12632a aVar = (C12632a) cVar;
                if (aVar != null) {
                    aVar.mo42319a();
                }
                this.f36176a.onComplete();
                this.f36171O.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f36175S) {
                C12205a.m54894b(th);
                return;
            }
            this.f36175S = true;
            C12314c cVar = this.f36173Q;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f36176a.onError(th);
            this.f36171O.dispose();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36175S) {
                long j = this.f36174R + 1;
                this.f36174R = j;
                C12314c cVar = this.f36173Q;
                if (cVar != null) {
                    cVar.dispose();
                }
                C12632a aVar = new C12632a(t, j, this);
                this.f36173Q = aVar;
                aVar.mo42320a(this.f36171O.mo41877a(aVar, this.f36177b, this.f36170N));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42322a(long j, T t, C12632a<T> aVar) {
            if (j != this.f36174R) {
                return;
            }
            if (get() != 0) {
                this.f36176a.mo41789a(t);
                C13747d.m58699c(this, 1);
                aVar.dispose();
                return;
            }
            cancel();
            this.f36176a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }
    }

    public C12631h0(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        super(lVar);
        this.f36163N = j;
        this.f36164O = timeUnit;
        this.f36165P = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12633b bVar = new C12633b(new C12274e(cVar), this.f36163N, this.f36164O, this.f36165P.mo41871a());
        lVar.mo24393a((C12297q<? super T>) bVar);
    }
}
