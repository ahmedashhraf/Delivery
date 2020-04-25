package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.z0 */
/* compiled from: ObservableFlatMapMaybe */
public final class C13500z0<T, R> extends C13131a<T, R> {

    /* renamed from: N */
    final boolean f39096N;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f39097b;

    /* renamed from: e.a.x0.e.e.z0$a */
    /* compiled from: ObservableFlatMapMaybe */
    static final class C13501a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: N */
        final C12313b f39098N = new C12313b();

        /* renamed from: O */
        final AtomicInteger f39099O = new AtomicInteger(1);

        /* renamed from: P */
        final C13746c f39100P = new C13746c();

        /* renamed from: Q */
        final C12339o<? super T, ? extends C5941y<? extends R>> f39101Q;

        /* renamed from: R */
        final AtomicReference<C13663c<R>> f39102R = new AtomicReference<>();

        /* renamed from: S */
        C12314c f39103S;

        /* renamed from: T */
        volatile boolean f39104T;

        /* renamed from: a */
        final C12280i0<? super R> f39105a;

        /* renamed from: b */
        final boolean f39106b;

        /* renamed from: e.a.x0.e.e.z0$a$a */
        /* compiled from: ObservableFlatMapMaybe */
        final class C13502a extends AtomicReference<C12314c> implements C12321v<R>, C12314c {
            private static final long serialVersionUID = -502562646270949838L;

            C13502a() {
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
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
                C13501a.this.mo42947a(this);
            }

            public void onError(Throwable th) {
                C13501a.this.mo42949a(this, th);
            }

            public void onSuccess(R r) {
                C13501a.this.mo42948a(this, r);
            }
        }

        C13501a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
            this.f39105a = i0Var;
            this.f39101Q = oVar;
            this.f39106b = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39103S, cVar)) {
                this.f39103S = cVar;
                this.f39105a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39104T;
        }

        public void dispose() {
            this.f39104T = true;
            this.f39103S.dispose();
            this.f39098N.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42950e() {
            if (getAndIncrement() == 0) {
                mo42951f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42951f() {
            C12280i0<? super R> i0Var = this.f39105a;
            AtomicInteger atomicInteger = this.f39099O;
            AtomicReference<C13663c<R>> atomicReference = this.f39102R;
            int i = 1;
            while (!this.f39104T) {
                if (this.f39106b || ((Throwable) this.f39100P.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C13663c cVar = (C13663c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable d = this.f39100P.mo43143d();
                        if (d != null) {
                            i0Var.onError(d);
                        } else {
                            i0Var.onComplete();
                        }
                        return;
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i0Var.mo33453a(poll);
                    }
                } else {
                    Throwable d2 = this.f39100P.mo43143d();
                    mo42946a();
                    i0Var.onError(d2);
                    return;
                }
            }
            mo42946a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C13663c<R> mo42952g() {
            C13663c<R> cVar;
            do {
                C13663c<R> cVar2 = (C13663c) this.f39102R.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C13663c<>(C5923b0.m26088M());
            } while (!this.f39102R.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f39099O.decrementAndGet();
            mo42950e();
        }

        public void onError(Throwable th) {
            this.f39099O.decrementAndGet();
            if (this.f39100P.mo43142a(th)) {
                if (!this.f39106b) {
                    this.f39098N.dispose();
                }
                mo42950e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                C5941y yVar = (C5941y) C12390b.m55563a(this.f39101Q.apply(t), "The mapper returned a null MaybeSource");
                this.f39099O.getAndIncrement();
                C13502a aVar = new C13502a();
                if (!this.f39104T && this.f39098N.mo42072b(aVar)) {
                    yVar.mo24639a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39103S.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42948a(C13502a aVar, R r) {
            this.f39098N.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f39105a.mo33453a(r);
                    if (this.f39099O.decrementAndGet() != 0) {
                        z = false;
                    }
                    C13663c cVar = (C13663c) this.f39102R.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo42951f();
                    }
                    Throwable d = this.f39100P.mo43143d();
                    if (d != null) {
                        this.f39105a.onError(d);
                    } else {
                        this.f39105a.onComplete();
                    }
                    return;
                }
            }
            C13663c g = mo42952g();
            synchronized (g) {
                g.offer(r);
            }
            this.f39099O.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo42951f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42949a(C13502a aVar, Throwable th) {
            this.f39098N.mo42073c(aVar);
            if (this.f39100P.mo43142a(th)) {
                if (!this.f39106b) {
                    this.f39103S.dispose();
                    this.f39098N.dispose();
                }
                this.f39099O.decrementAndGet();
                mo42950e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42947a(C13502a aVar) {
            this.f39098N.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f39099O.decrementAndGet() != 0) {
                        z = false;
                    }
                    C13663c cVar = (C13663c) this.f39102R.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable d = this.f39100P.mo43143d();
                        if (d != null) {
                            this.f39105a.onError(d);
                        } else {
                            this.f39105a.onComplete();
                        }
                        return;
                    } else if (decrementAndGet() != 0) {
                        mo42951f();
                    } else {
                        return;
                    }
                }
            }
            this.f39099O.decrementAndGet();
            mo42950e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42946a() {
            C13663c cVar = (C13663c) this.f39102R.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C13500z0(C5926g0<T> g0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
        super(g0Var);
        this.f39097b = oVar;
        this.f39096N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        this.f37851a.mo23893a(new C13501a(i0Var, this.f39097b, this.f39096N));
    }
}
