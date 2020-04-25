package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.a1 */
/* compiled from: FlowableFlatMapCompletable */
public final class C12514a1<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5927i> f35820N;

    /* renamed from: O */
    final int f35821O;

    /* renamed from: P */
    final boolean f35822P;

    /* renamed from: e.a.x0.e.b.a1$a */
    /* compiled from: FlowableFlatMapCompletable */
    static final class C12515a<T> extends C13735c<T> implements C12297q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: N */
        final C12339o<? super T, ? extends C5927i> f35823N;

        /* renamed from: O */
        final boolean f35824O;

        /* renamed from: P */
        final C12313b f35825P = new C12313b();

        /* renamed from: Q */
        final int f35826Q;

        /* renamed from: R */
        C14063d f35827R;

        /* renamed from: S */
        volatile boolean f35828S;

        /* renamed from: a */
        final C14062c<? super T> f35829a;

        /* renamed from: b */
        final C13746c f35830b = new C13746c();

        /* renamed from: e.a.x0.e.b.a1$a$a */
        /* compiled from: FlowableFlatMapCompletable */
        final class C12516a extends AtomicReference<C12314c> implements C12268f, C12314c {
            private static final long serialVersionUID = 8606673141535671828L;

            C12516a() {
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
                C12515a.this.mo42216a(this);
            }

            public void onError(Throwable th) {
                C12515a.this.mo42217a(this, th);
            }
        }

        C12515a(C14062c<? super T> cVar, C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
            this.f35829a = cVar;
            this.f35823N = oVar;
            this.f35824O = z;
            this.f35826Q = i;
            lazySet(1);
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return i & 2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35827R, dVar)) {
                this.f35827R = dVar;
                this.f35829a.mo41788a((C14063d) this);
                int i = this.f35826Q;
                if (i == Integer.MAX_VALUE) {
                    dVar.mo41813c(Long.MAX_VALUE);
                } else {
                    dVar.mo41813c((long) i);
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
        }

        public void cancel() {
            this.f35828S = true;
            this.f35827R.cancel();
            this.f35825P.dispose();
        }

        public void clear() {
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable d = this.f35830b.mo43143d();
                if (d != null) {
                    this.f35829a.onError(d);
                } else {
                    this.f35829a.onComplete();
                }
            } else if (this.f35826Q != Integer.MAX_VALUE) {
                this.f35827R.mo41813c(1);
            }
        }

        public void onError(Throwable th) {
            if (!this.f35830b.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (!this.f35824O) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f35829a.onError(this.f35830b.mo43143d());
                }
            } else if (decrementAndGet() == 0) {
                this.f35829a.onError(this.f35830b.mo43143d());
            } else if (this.f35826Q != Integer.MAX_VALUE) {
                this.f35827R.mo41813c(1);
            }
        }

        @C5938g
        public T poll() throws Exception {
            return null;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f35823N.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C12516a aVar = new C12516a();
                if (!this.f35828S && this.f35825P.mo42072b(aVar)) {
                    iVar.mo24122a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35827R.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42216a(C12516a aVar) {
            this.f35825P.mo42073c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42217a(C12516a aVar, Throwable th) {
            this.f35825P.mo42073c(aVar);
            onError(th);
        }
    }

    public C12514a1(C5929l<T> lVar, C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
        super(lVar);
        this.f35820N = oVar;
        this.f35822P = z;
        this.f35821O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12515a<Object>(cVar, this.f35820N, this.f35822P, this.f35821O));
    }
}
