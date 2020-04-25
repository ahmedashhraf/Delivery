package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.b1 */
/* compiled from: FlowableFlatMapCompletableCompletable */
public final class C12527b1<T> extends C5925c implements C12393b<T> {

    /* renamed from: N */
    final int f35862N;

    /* renamed from: O */
    final boolean f35863O;

    /* renamed from: a */
    final C5929l<T> f35864a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f35865b;

    /* renamed from: e.a.x0.e.b.b1$a */
    /* compiled from: FlowableFlatMapCompletableCompletable */
    static final class C12528a<T> extends AtomicInteger implements C12297q<T>, C12314c {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: N */
        final C12339o<? super T, ? extends C5927i> f35866N;

        /* renamed from: O */
        final boolean f35867O;

        /* renamed from: P */
        final C12313b f35868P = new C12313b();

        /* renamed from: Q */
        final int f35869Q;

        /* renamed from: R */
        C14063d f35870R;

        /* renamed from: S */
        volatile boolean f35871S;

        /* renamed from: a */
        final C12268f f35872a;

        /* renamed from: b */
        final C13746c f35873b = new C13746c();

        /* renamed from: e.a.x0.e.b.b1$a$a */
        /* compiled from: FlowableFlatMapCompletableCompletable */
        final class C12529a extends AtomicReference<C12314c> implements C12268f, C12314c {
            private static final long serialVersionUID = 8606673141535671828L;

            C12529a() {
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
                C12528a.this.mo42225a(this);
            }

            public void onError(Throwable th) {
                C12528a.this.mo42226a(this, th);
            }
        }

        C12528a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
            this.f35872a = fVar;
            this.f35866N = oVar;
            this.f35867O = z;
            this.f35869Q = i;
            lazySet(1);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35870R, dVar)) {
                this.f35870R = dVar;
                this.f35872a.mo41921a(this);
                int i = this.f35869Q;
                if (i == Integer.MAX_VALUE) {
                    dVar.mo41813c(Long.MAX_VALUE);
                } else {
                    dVar.mo41813c((long) i);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35868P.mo41878d();
        }

        public void dispose() {
            this.f35871S = true;
            this.f35870R.cancel();
            this.f35868P.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable d = this.f35873b.mo43143d();
                if (d != null) {
                    this.f35872a.onError(d);
                } else {
                    this.f35872a.onComplete();
                }
            } else if (this.f35869Q != Integer.MAX_VALUE) {
                this.f35870R.mo41813c(1);
            }
        }

        public void onError(Throwable th) {
            if (!this.f35873b.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (!this.f35867O) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f35872a.onError(this.f35873b.mo43143d());
                }
            } else if (decrementAndGet() == 0) {
                this.f35872a.onError(this.f35873b.mo43143d());
            } else if (this.f35869Q != Integer.MAX_VALUE) {
                this.f35870R.mo41813c(1);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f35866N.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C12529a aVar = new C12529a();
                if (!this.f35871S && this.f35868P.mo42072b(aVar)) {
                    iVar.mo24122a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35870R.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42225a(C12529a aVar) {
            this.f35868P.mo42073c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42226a(C12529a aVar, Throwable th) {
            this.f35868P.mo42073c(aVar);
            onError(th);
        }
    }

    public C12527b1(C5929l<T> lVar, C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
        this.f35864a = lVar;
        this.f35865b = oVar;
        this.f35863O = z;
        this.f35862N = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35864a.mo24393a((C12297q<? super T>) new C12528a<Object>(fVar, this.f35865b, this.f35863O, this.f35862N));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12514a1<T>(this.f35864a, this.f35865b, this.f35863O, this.f35862N));
    }
}
