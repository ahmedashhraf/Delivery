package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.a.y */
/* compiled from: CompletableMerge */
public final class C12506y extends C5925c {

    /* renamed from: N */
    final boolean f35800N;

    /* renamed from: a */
    final C6007b<? extends C5927i> f35801a;

    /* renamed from: b */
    final int f35802b;

    /* renamed from: e.a.x0.e.a.y$a */
    /* compiled from: CompletableMerge */
    static final class C12507a extends AtomicInteger implements C12297q<C5927i>, C12314c {
        private static final long serialVersionUID = -2108443387387077490L;

        /* renamed from: N */
        final boolean f35803N;

        /* renamed from: O */
        final C13746c f35804O = new C13746c();

        /* renamed from: P */
        final C12313b f35805P = new C12313b();

        /* renamed from: Q */
        C14063d f35806Q;

        /* renamed from: a */
        final C12268f f35807a;

        /* renamed from: b */
        final int f35808b;

        /* renamed from: e.a.x0.e.a.y$a$a */
        /* compiled from: CompletableMerge */
        final class C12508a extends AtomicReference<C12314c> implements C12268f, C12314c {
            private static final long serialVersionUID = 251330541679988317L;

            C12508a() {
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
                C12507a.this.mo42214a(this);
            }

            public void onError(Throwable th) {
                C12507a.this.mo42215a(this, th);
            }
        }

        C12507a(C12268f fVar, int i, boolean z) {
            this.f35807a = fVar;
            this.f35808b = i;
            this.f35803N = z;
            lazySet(1);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35805P.mo41878d();
        }

        public void dispose() {
            this.f35806Q.cancel();
            this.f35805P.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() != 0) {
                return;
            }
            if (((Throwable) this.f35804O.get()) != null) {
                this.f35807a.onError(this.f35804O.mo43143d());
            } else {
                this.f35807a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f35803N) {
                this.f35805P.dispose();
                if (!this.f35804O.mo43142a(th)) {
                    C12205a.m54894b(th);
                } else if (getAndSet(0) > 0) {
                    this.f35807a.onError(this.f35804O.mo43143d());
                }
            } else if (!this.f35804O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (decrementAndGet() == 0) {
                this.f35807a.onError(this.f35804O.mo43143d());
            }
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35806Q, dVar)) {
                this.f35806Q = dVar;
                this.f35807a.mo41921a(this);
                int i = this.f35808b;
                if (i == Integer.MAX_VALUE) {
                    dVar.mo41813c(Long.MAX_VALUE);
                } else {
                    dVar.mo41813c((long) i);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(C5927i iVar) {
            getAndIncrement();
            C12508a aVar = new C12508a();
            this.f35805P.mo42072b(aVar);
            iVar.mo24122a(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42215a(C12508a aVar, Throwable th) {
            this.f35805P.mo42073c(aVar);
            if (!this.f35803N) {
                this.f35806Q.cancel();
                this.f35805P.dispose();
                if (!this.f35804O.mo43142a(th)) {
                    C12205a.m54894b(th);
                } else if (getAndSet(0) > 0) {
                    this.f35807a.onError(this.f35804O.mo43143d());
                }
            } else if (!this.f35804O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (decrementAndGet() == 0) {
                this.f35807a.onError(this.f35804O.mo43143d());
            } else if (this.f35808b != Integer.MAX_VALUE) {
                this.f35806Q.mo41813c(1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42214a(C12508a aVar) {
            this.f35805P.mo42073c(aVar);
            if (decrementAndGet() == 0) {
                Throwable th = (Throwable) this.f35804O.get();
                if (th != null) {
                    this.f35807a.onError(th);
                } else {
                    this.f35807a.onComplete();
                }
            } else if (this.f35808b != Integer.MAX_VALUE) {
                this.f35806Q.mo41813c(1);
            }
        }
    }

    public C12506y(C6007b<? extends C5927i> bVar, int i, boolean z) {
        this.f35801a = bVar;
        this.f35802b = i;
        this.f35800N = z;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35801a.mo24397a(new C12507a(fVar, this.f35802b, this.f35800N));
    }
}
