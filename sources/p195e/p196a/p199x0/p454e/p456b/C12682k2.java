package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p449w0.C12325a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.k2 */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C12682k2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final int f36316N;

    /* renamed from: O */
    final boolean f36317O;

    /* renamed from: P */
    final boolean f36318P;

    /* renamed from: Q */
    final C12325a f36319Q;

    /* renamed from: e.a.x0.e.b.k2$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class C12683a<T> extends C13735c<T> implements C12297q<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: N */
        final boolean f36320N;

        /* renamed from: O */
        final C12325a f36321O;

        /* renamed from: P */
        C14063d f36322P;

        /* renamed from: Q */
        volatile boolean f36323Q;

        /* renamed from: R */
        volatile boolean f36324R;

        /* renamed from: S */
        Throwable f36325S;

        /* renamed from: T */
        final AtomicLong f36326T = new AtomicLong();

        /* renamed from: U */
        boolean f36327U;

        /* renamed from: a */
        final C14062c<? super T> f36328a;

        /* renamed from: b */
        final C12405n<T> f36329b;

        C12683a(C14062c<? super T> cVar, int i, boolean z, boolean z2, C12325a aVar) {
            C12405n<T> nVar;
            this.f36328a = cVar;
            this.f36321O = aVar;
            this.f36320N = z2;
            if (z) {
                nVar = new C13663c<>(i);
            } else {
                nVar = new C13662b<>(i);
            }
            this.f36329b = nVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36322P, dVar)) {
                this.f36322P = dVar;
                this.f36328a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (!this.f36327U && C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36326T, j);
                mo42353a();
            }
        }

        public void cancel() {
            if (!this.f36323Q) {
                this.f36323Q = true;
                this.f36322P.cancel();
                if (getAndIncrement() == 0) {
                    this.f36329b.clear();
                }
            }
        }

        public void clear() {
            this.f36329b.clear();
        }

        public boolean isEmpty() {
            return this.f36329b.isEmpty();
        }

        public void onComplete() {
            this.f36324R = true;
            if (this.f36327U) {
                this.f36328a.onComplete();
            } else {
                mo42353a();
            }
        }

        public void onError(Throwable th) {
            this.f36325S = th;
            this.f36324R = true;
            if (this.f36327U) {
                this.f36328a.onError(th);
            } else {
                mo42353a();
            }
        }

        @C5938g
        public T poll() throws Exception {
            return this.f36329b.poll();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36329b.offer(t)) {
                this.f36322P.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f36321O.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.f36327U) {
                this.f36328a.mo41789a(null);
            } else {
                mo42353a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42353a() {
            if (getAndIncrement() == 0) {
                C12405n<T> nVar = this.f36329b;
                C14062c<? super T> cVar = this.f36328a;
                int i = 1;
                while (!mo42354a(this.f36324R, nVar.isEmpty(), cVar)) {
                    long j = this.f36326T.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f36324R;
                        Object poll = nVar.poll();
                        boolean z2 = poll == null;
                        if (!mo42354a(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.mo41789a(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !mo42354a(this.f36324R, nVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f36326T.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42354a(boolean z, boolean z2, C14062c<? super T> cVar) {
            if (this.f36323Q) {
                this.f36329b.clear();
                return true;
            }
            if (z) {
                if (!this.f36320N) {
                    Throwable th = this.f36325S;
                    if (th != null) {
                        this.f36329b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f36325S;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f36327U = true;
            return 2;
        }
    }

    public C12682k2(C5929l<T> lVar, int i, boolean z, boolean z2, C12325a aVar) {
        super(lVar);
        this.f36316N = i;
        this.f36317O = z;
        this.f36318P = z2;
        this.f36319Q = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12683a aVar = new C12683a(cVar, this.f36316N, this.f36317O, this.f36318P, this.f36319Q);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
