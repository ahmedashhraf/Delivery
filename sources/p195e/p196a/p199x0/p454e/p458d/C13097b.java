package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
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
/* renamed from: e.a.x0.e.d.b */
/* compiled from: FlowableConcatMapMaybe */
public final class C13097b<T, R> extends C5929l<R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37667N;

    /* renamed from: O */
    final C13753j f37668O;

    /* renamed from: P */
    final int f37669P;

    /* renamed from: b */
    final C5929l<T> f37670b;

    /* renamed from: e.a.x0.e.d.b$a */
    /* compiled from: FlowableConcatMapMaybe */
    static final class C13098a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: a0 */
        static final int f37671a0 = 0;

        /* renamed from: b0 */
        static final int f37672b0 = 1;

        /* renamed from: c0 */
        static final int f37673c0 = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: N */
        final int f37674N;

        /* renamed from: O */
        final AtomicLong f37675O = new AtomicLong();

        /* renamed from: P */
        final C13746c f37676P = new C13746c();

        /* renamed from: Q */
        final C13099a<R> f37677Q = new C13099a<>(this);

        /* renamed from: R */
        final C12405n<T> f37678R;

        /* renamed from: S */
        final C13753j f37679S;

        /* renamed from: T */
        C14063d f37680T;

        /* renamed from: U */
        volatile boolean f37681U;

        /* renamed from: V */
        volatile boolean f37682V;

        /* renamed from: W */
        long f37683W;

        /* renamed from: X */
        int f37684X;

        /* renamed from: Y */
        R f37685Y;

        /* renamed from: Z */
        volatile int f37686Z;

        /* renamed from: a */
        final C14062c<? super R> f37687a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37688b;

        /* renamed from: e.a.x0.e.d.b$a$a */
        /* compiled from: FlowableConcatMapMaybe */
        static final class C13099a<R> extends AtomicReference<C12314c> implements C12321v<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: a */
            final C13098a<?, R> f37689a;

            C13099a(C13098a<?, R> aVar) {
                this.f37689a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                this.f37689a.mo42614d();
            }

            public void onError(Throwable th) {
                this.f37689a.mo42612a(th);
            }

            public void onSuccess(R r) {
                this.f37689a.mo42613c(r);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42615a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13098a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, int i, C13753j jVar) {
            this.f37687a = cVar;
            this.f37688b = oVar;
            this.f37674N = i;
            this.f37679S = jVar;
            this.f37678R = new C13662b(i);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37680T, dVar)) {
                this.f37680T = dVar;
                this.f37687a.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f37674N);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f37675O, j);
            mo42611a();
        }

        public void cancel() {
            this.f37682V = true;
            this.f37680T.cancel();
            this.f37677Q.mo42615a();
            if (getAndIncrement() == 0) {
                this.f37678R.clear();
                this.f37685Y = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42614d() {
            this.f37686Z = 0;
            mo42611a();
        }

        public void onComplete() {
            this.f37681U = true;
            mo42611a();
        }

        public void onError(Throwable th) {
            if (this.f37676P.mo43142a(th)) {
                if (this.f37679S == C13753j.IMMEDIATE) {
                    this.f37677Q.mo42615a();
                }
                this.f37681U = true;
                mo42611a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42613c(R r) {
            this.f37685Y = r;
            this.f37686Z = 2;
            mo42611a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37678R.offer(t)) {
                this.f37680T.cancel();
                onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            mo42611a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42612a(Throwable th) {
            if (this.f37676P.mo43142a(th)) {
                if (this.f37679S != C13753j.END) {
                    this.f37680T.cancel();
                }
                this.f37686Z = 0;
                mo42611a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42611a() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37687a;
                C13753j jVar = this.f37679S;
                C12405n<T> nVar = this.f37678R;
                C13746c cVar2 = this.f37676P;
                AtomicLong atomicLong = this.f37675O;
                int i = this.f37674N;
                int i2 = i - (i >> 1);
                int i3 = 1;
                while (true) {
                    if (this.f37682V) {
                        nVar.clear();
                        this.f37685Y = null;
                    }
                    int i4 = this.f37686Z;
                    if (cVar2.get() == null || !(jVar == C13753j.IMMEDIATE || (jVar == C13753j.BOUNDARY && i4 == 0))) {
                        if (i4 == 0) {
                            boolean z = this.f37681U;
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
                                int i5 = this.f37684X + 1;
                                if (i5 == i2) {
                                    this.f37684X = 0;
                                    this.f37680T.mo41813c((long) i2);
                                } else {
                                    this.f37684X = i5;
                                }
                                try {
                                    C5941y yVar = (C5941y) C12390b.m55563a(this.f37688b.apply(poll), "The mapper returned a null MaybeSource");
                                    this.f37686Z = 1;
                                    yVar.mo24639a(this.f37677Q);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    this.f37680T.cancel();
                                    nVar.clear();
                                    cVar2.mo43142a(th);
                                    cVar.onError(cVar2.mo43143d());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.f37683W;
                            if (j != atomicLong.get()) {
                                R r = this.f37685Y;
                                this.f37685Y = null;
                                cVar.mo41789a(r);
                                this.f37683W = j + 1;
                                this.f37686Z = 0;
                            }
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                nVar.clear();
                this.f37685Y = null;
                cVar.onError(cVar2.mo43143d());
            }
        }
    }

    public C13097b(C5929l<T> lVar, C12339o<? super T, ? extends C5941y<? extends R>> oVar, C13753j jVar, int i) {
        this.f37670b = lVar;
        this.f37667N = oVar;
        this.f37668O = jVar;
        this.f37669P = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f37670b.mo24393a((C12297q<? super T>) new C13098a<Object>(cVar, this.f37667N, this.f37669P, this.f37668O));
    }
}
