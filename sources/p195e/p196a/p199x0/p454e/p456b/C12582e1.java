package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.e1 */
/* compiled from: FlowableFlatMapSingle */
public final class C12582e1<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f36021N;

    /* renamed from: O */
    final boolean f36022O;

    /* renamed from: P */
    final int f36023P;

    /* renamed from: e.a.x0.e.b.e1$a */
    /* compiled from: FlowableFlatMapSingle */
    static final class C12583a<T, R> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: N */
        final int f36024N;

        /* renamed from: O */
        final AtomicLong f36025O = new AtomicLong();

        /* renamed from: P */
        final C12313b f36026P = new C12313b();

        /* renamed from: Q */
        final AtomicInteger f36027Q = new AtomicInteger(1);

        /* renamed from: R */
        final C13746c f36028R = new C13746c();

        /* renamed from: S */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f36029S;

        /* renamed from: T */
        final AtomicReference<C13663c<R>> f36030T = new AtomicReference<>();

        /* renamed from: U */
        C14063d f36031U;

        /* renamed from: V */
        volatile boolean f36032V;

        /* renamed from: a */
        final C14062c<? super R> f36033a;

        /* renamed from: b */
        final boolean f36034b;

        /* renamed from: e.a.x0.e.b.e1$a$a */
        /* compiled from: FlowableFlatMapSingle */
        final class C12584a extends AtomicReference<C12314c> implements C12292n0<R>, C12314c {
            private static final long serialVersionUID = -502562646270949838L;

            C12584a() {
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return C12347d.m55463a((C12314c) get());
            }

            public void dispose() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }

            public void onError(Throwable th) {
                C12583a.this.mo42285a(this, th);
            }

            public void onSuccess(R r) {
                C12583a.this.mo42284a(this, r);
            }
        }

        C12583a(C14062c<? super R> cVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z, int i) {
            this.f36033a = cVar;
            this.f36029S = oVar;
            this.f36034b = z;
            this.f36024N = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36031U, dVar)) {
                this.f36031U = dVar;
                this.f36033a.mo41788a((C14063d) this);
                int i = this.f36024N;
                if (i == Integer.MAX_VALUE) {
                    dVar.mo41813c(Long.MAX_VALUE);
                } else {
                    dVar.mo41813c((long) i);
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36025O, j);
                mo42286d();
            }
        }

        public void cancel() {
            this.f36032V = true;
            this.f36031U.cancel();
            this.f36026P.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42286d() {
            if (getAndIncrement() == 0) {
                mo42287e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42287e() {
            boolean z;
            C14062c<? super R> cVar = this.f36033a;
            AtomicInteger atomicInteger = this.f36027Q;
            AtomicReference<C13663c<R>> atomicReference = this.f36030T;
            int i = 1;
            do {
                long j = this.f36025O.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    if (j2 == j) {
                        break;
                    } else if (this.f36032V) {
                        mo42283a();
                        return;
                    } else if (this.f36034b || ((Throwable) this.f36028R.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        C13663c cVar2 = (C13663c) atomicReference.get();
                        Object poll = cVar2 != null ? cVar2.poll() : null;
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            Throwable d = this.f36028R.mo43143d();
                            if (d != null) {
                                cVar.onError(d);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (z3) {
                            break;
                        } else {
                            cVar.mo41789a(poll);
                            j2++;
                        }
                    } else {
                        Throwable d2 = this.f36028R.mo43143d();
                        mo42283a();
                        cVar.onError(d2);
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.f36032V) {
                        mo42283a();
                        return;
                    } else if (this.f36034b || ((Throwable) this.f36028R.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        C13663c cVar3 = (C13663c) atomicReference.get();
                        if (cVar3 == null || cVar3.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable d3 = this.f36028R.mo43143d();
                            if (d3 != null) {
                                cVar.onError(d3);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        }
                    } else {
                        Throwable d4 = this.f36028R.mo43143d();
                        mo42283a();
                        cVar.onError(d4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C13747d.m58699c(this.f36025O, j2);
                    if (this.f36024N != Integer.MAX_VALUE) {
                        this.f36031U.mo41813c(j2);
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C13663c<R> mo42288f() {
            C13663c<R> cVar;
            do {
                C13663c<R> cVar2 = (C13663c) this.f36030T.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C13663c<>(C5929l.m26793R());
            } while (!this.f36030T.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f36027Q.decrementAndGet();
            mo42286d();
        }

        public void onError(Throwable th) {
            this.f36027Q.decrementAndGet();
            if (this.f36028R.mo43142a(th)) {
                if (!this.f36034b) {
                    this.f36026P.dispose();
                }
                mo42286d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f36029S.apply(t), "The mapper returned a null SingleSource");
                this.f36027Q.getAndIncrement();
                C12584a aVar = new C12584a();
                if (!this.f36032V && this.f36026P.mo42072b(aVar)) {
                    q0Var.mo24192a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f36031U.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42284a(C12584a aVar, R r) {
            this.f36026P.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f36027Q.decrementAndGet() != 0) {
                        z = false;
                    }
                    if (this.f36025O.get() != 0) {
                        this.f36033a.mo41789a(r);
                        C13663c cVar = (C13663c) this.f36030T.get();
                        if (!z || (cVar != null && !cVar.isEmpty())) {
                            C13747d.m58699c(this.f36025O, 1);
                            if (this.f36024N != Integer.MAX_VALUE) {
                                this.f36031U.mo41813c(1);
                            }
                        } else {
                            Throwable d = this.f36028R.mo43143d();
                            if (d != null) {
                                this.f36033a.onError(d);
                            } else {
                                this.f36033a.onComplete();
                            }
                            return;
                        }
                    } else {
                        C13663c f = mo42288f();
                        synchronized (f) {
                            f.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo42287e();
                }
            }
            C13663c f2 = mo42288f();
            synchronized (f2) {
                f2.offer(r);
            }
            this.f36027Q.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo42287e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42285a(C12584a aVar, Throwable th) {
            this.f36026P.mo42073c(aVar);
            if (this.f36028R.mo43142a(th)) {
                if (!this.f36034b) {
                    this.f36031U.cancel();
                    this.f36026P.dispose();
                } else if (this.f36024N != Integer.MAX_VALUE) {
                    this.f36031U.mo41813c(1);
                }
                this.f36027Q.decrementAndGet();
                mo42286d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42283a() {
            C13663c cVar = (C13663c) this.f36030T.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12582e1(C5929l<T> lVar, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z, int i) {
        super(lVar);
        this.f36021N = oVar;
        this.f36022O = z;
        this.f36023P = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12583a<Object>(cVar, this.f36021N, this.f36022O, this.f36023P));
    }
}
