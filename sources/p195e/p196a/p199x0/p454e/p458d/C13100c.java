package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

@C5936e
/* renamed from: e.a.x0.e.d.c */
/* compiled from: FlowableConcatMapSingle */
public final class C13100c<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37690N;

    /* renamed from: O */
    final C13753j f37691O;

    /* renamed from: P */
    final int f37692P;

    /* renamed from: b */
    final C5929l<T> f37693b;

    /* renamed from: e.a.x0.e.d.c$a */
    /* compiled from: FlowableConcatMapSingle */
    static final class C13101a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: a0 */
        static final int f37694a0 = 0;

        /* renamed from: b0 */
        static final int f37695b0 = 1;

        /* renamed from: c0 */
        static final int f37696c0 = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: N */
        final int f37697N;

        /* renamed from: O */
        final AtomicLong f37698O = new AtomicLong();

        /* renamed from: P */
        final C13746c f37699P = new C13746c();

        /* renamed from: Q */
        final C13102a<R> f37700Q = new C13102a<>(this);

        /* renamed from: R */
        final C12405n<T> f37701R;

        /* renamed from: S */
        final C13753j f37702S;

        /* renamed from: T */
        C14063d f37703T;

        /* renamed from: U */
        volatile boolean f37704U;

        /* renamed from: V */
        volatile boolean f37705V;

        /* renamed from: W */
        long f37706W;

        /* renamed from: X */
        int f37707X;

        /* renamed from: Y */
        R f37708Y;

        /* renamed from: Z */
        volatile int f37709Z;

        /* renamed from: a */
        final C14062c<? super R> f37710a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37711b;

        /* renamed from: e.a.x0.e.d.c$a$a */
        /* compiled from: FlowableConcatMapSingle */
        static final class C13102a<R> extends AtomicReference<C12314c> implements C12292n0<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: a */
            final C13101a<?, R> f37712a;

            C13102a(C13101a<?, R> aVar) {
                this.f37712a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onError(Throwable th) {
                this.f37712a.mo42617a(th);
            }

            public void onSuccess(R r) {
                this.f37712a.mo42618c(r);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42619a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13101a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, int i, C13753j jVar) {
            this.f37710a = cVar;
            this.f37711b = oVar;
            this.f37697N = i;
            this.f37702S = jVar;
            this.f37701R = new C13662b(i);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37703T, dVar)) {
                this.f37703T = dVar;
                this.f37710a.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f37697N);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f37698O, j);
            mo42616a();
        }

        public void cancel() {
            this.f37705V = true;
            this.f37703T.cancel();
            this.f37700Q.mo42619a();
            if (getAndIncrement() == 0) {
                this.f37701R.clear();
                this.f37708Y = null;
            }
        }

        public void onComplete() {
            this.f37704U = true;
            mo42616a();
        }

        public void onError(Throwable th) {
            if (this.f37699P.mo43142a(th)) {
                if (this.f37702S == C13753j.IMMEDIATE) {
                    this.f37700Q.mo42619a();
                }
                this.f37704U = true;
                mo42616a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42618c(R r) {
            this.f37708Y = r;
            this.f37709Z = 2;
            mo42616a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37701R.offer(t)) {
                this.f37703T.cancel();
                onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            mo42616a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42617a(Throwable th) {
            if (this.f37699P.mo43142a(th)) {
                if (this.f37702S != C13753j.END) {
                    this.f37703T.cancel();
                }
                this.f37709Z = 0;
                mo42616a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42616a() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37710a;
                C13753j jVar = this.f37702S;
                C12405n<T> nVar = this.f37701R;
                C13746c cVar2 = this.f37699P;
                AtomicLong atomicLong = this.f37698O;
                int i = this.f37697N;
                int i2 = i - (i >> 1);
                int i3 = 1;
                while (true) {
                    if (this.f37705V) {
                        nVar.clear();
                        this.f37708Y = null;
                    }
                    int i4 = this.f37709Z;
                    if (cVar2.get() == null || !(jVar == C13753j.IMMEDIATE || (jVar == C13753j.BOUNDARY && i4 == 0))) {
                        if (i4 == 0) {
                            boolean z = this.f37704U;
                            Object poll = nVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable d = cVar2.mo43143d();
                                if (d == null) {
                                    cVar.onComplete();
                                } else {
                                    cVar.onError(d);
                                }
                                return;
                            } else if (!z2) {
                                int i5 = this.f37707X + 1;
                                if (i5 == i2) {
                                    this.f37707X = 0;
                                    this.f37703T.mo41813c((long) i2);
                                } else {
                                    this.f37707X = i5;
                                }
                                try {
                                    C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37711b.apply(poll), "The mapper returned a null SingleSource");
                                    this.f37709Z = 1;
                                    q0Var.mo24192a(this.f37700Q);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    this.f37703T.cancel();
                                    nVar.clear();
                                    cVar2.mo43142a(th);
                                    cVar.onError(cVar2.mo43143d());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.f37706W;
                            if (j != atomicLong.get()) {
                                R r = this.f37708Y;
                                this.f37708Y = null;
                                cVar.mo41789a(r);
                                this.f37706W = j + 1;
                                this.f37709Z = 0;
                            }
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                nVar.clear();
                this.f37708Y = null;
                cVar.onError(cVar2.mo43143d());
            }
        }
    }

    public C13100c(C5929l<T> lVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, C13753j jVar, int i) {
        this.f37693b = lVar;
        this.f37690N = oVar;
        this.f37691O = jVar;
        this.f37692P = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f37693b.mo24393a((C12297q<? super T>) new C13101a<Object>(cVar, this.f37690N, this.f37692P, this.f37691O));
    }
}
