package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5925c;
import p195e.p196a.C5926g0;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.y0 */
/* compiled from: ObservableFlatMapCompletableCompletable */
public final class C13489y0<T> extends C5925c implements C12395d<T> {

    /* renamed from: N */
    final boolean f39069N;

    /* renamed from: a */
    final C5926g0<T> f39070a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f39071b;

    /* renamed from: e.a.x0.e.e.y0$a */
    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class C13490a<T> extends AtomicInteger implements C12314c, C12280i0<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: N */
        final C12339o<? super T, ? extends C5927i> f39072N;

        /* renamed from: O */
        final boolean f39073O;

        /* renamed from: P */
        final C12313b f39074P = new C12313b();

        /* renamed from: Q */
        C12314c f39075Q;

        /* renamed from: R */
        volatile boolean f39076R;

        /* renamed from: a */
        final C12268f f39077a;

        /* renamed from: b */
        final C13746c f39078b = new C13746c();

        /* renamed from: e.a.x0.e.e.y0$a$a */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C13491a extends AtomicReference<C12314c> implements C12268f, C12314c {
            private static final long serialVersionUID = 8606673141535671828L;

            C13491a() {
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return C12347d.m55463a((C12314c) get());
            }

            public void dispose() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }

            public void onComplete() {
                C13490a.this.mo42942a(this);
            }

            public void onError(Throwable th) {
                C13490a.this.mo42943a(this, th);
            }
        }

        C13490a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
            this.f39077a = fVar;
            this.f39072N = oVar;
            this.f39073O = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39075Q, cVar)) {
                this.f39075Q = cVar;
                this.f39077a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39075Q.mo41878d();
        }

        public void dispose() {
            this.f39076R = true;
            this.f39075Q.dispose();
            this.f39074P.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable d = this.f39078b.mo43143d();
                if (d != null) {
                    this.f39077a.onError(d);
                } else {
                    this.f39077a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f39078b.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (!this.f39073O) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f39077a.onError(this.f39078b.mo43143d());
                }
            } else if (decrementAndGet() == 0) {
                this.f39077a.onError(this.f39078b.mo43143d());
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f39072N.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13491a aVar = new C13491a();
                if (!this.f39076R && this.f39074P.mo42072b(aVar)) {
                    iVar.mo24122a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39075Q.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42942a(C13491a aVar) {
            this.f39074P.mo42073c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42943a(C13491a aVar, Throwable th) {
            this.f39074P.mo42073c(aVar);
            onError(th);
        }
    }

    public C13489y0(C5926g0<T> g0Var, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
        this.f39070a = g0Var;
        this.f39071b = oVar;
        this.f39069N = z;
    }

    /* renamed from: a */
    public C5923b0<T> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13473x0<T>(this.f39070a, this.f39071b, this.f39069N));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f39070a.mo23893a(new C13490a(fVar, this.f39071b, this.f39069N));
    }
}
