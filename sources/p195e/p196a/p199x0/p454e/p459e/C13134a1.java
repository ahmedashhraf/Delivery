package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.a1 */
/* compiled from: ObservableFlatMapSingle */
public final class C13134a1<T, R> extends C13131a<T, R> {

    /* renamed from: N */
    final boolean f37855N;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37856b;

    /* renamed from: e.a.x0.e.e.a1$a */
    /* compiled from: ObservableFlatMapSingle */
    static final class C13135a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: N */
        final C12313b f37857N = new C12313b();

        /* renamed from: O */
        final AtomicInteger f37858O = new AtomicInteger(1);

        /* renamed from: P */
        final C13746c f37859P = new C13746c();

        /* renamed from: Q */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37860Q;

        /* renamed from: R */
        final AtomicReference<C13663c<R>> f37861R = new AtomicReference<>();

        /* renamed from: S */
        C12314c f37862S;

        /* renamed from: T */
        volatile boolean f37863T;

        /* renamed from: a */
        final C12280i0<? super R> f37864a;

        /* renamed from: b */
        final boolean f37865b;

        /* renamed from: e.a.x0.e.e.a1$a$a */
        /* compiled from: ObservableFlatMapSingle */
        final class C13136a extends AtomicReference<C12314c> implements C12292n0<R>, C12314c {
            private static final long serialVersionUID = -502562646270949838L;

            C13136a() {
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
                C13135a.this.mo42661a(this, th);
            }

            public void onSuccess(R r) {
                C13135a.this.mo42660a(this, r);
            }
        }

        C13135a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
            this.f37864a = i0Var;
            this.f37860Q = oVar;
            this.f37865b = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37862S, cVar)) {
                this.f37862S = cVar;
                this.f37864a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37863T;
        }

        public void dispose() {
            this.f37863T = true;
            this.f37862S.dispose();
            this.f37857N.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42662e() {
            if (getAndIncrement() == 0) {
                mo42663f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42663f() {
            C12280i0<? super R> i0Var = this.f37864a;
            AtomicInteger atomicInteger = this.f37858O;
            AtomicReference<C13663c<R>> atomicReference = this.f37861R;
            int i = 1;
            while (!this.f37863T) {
                if (this.f37865b || ((Throwable) this.f37859P.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C13663c cVar = (C13663c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable d = this.f37859P.mo43143d();
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
                    Throwable d2 = this.f37859P.mo43143d();
                    mo42659a();
                    i0Var.onError(d2);
                    return;
                }
            }
            mo42659a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C13663c<R> mo42664g() {
            C13663c<R> cVar;
            do {
                C13663c<R> cVar2 = (C13663c) this.f37861R.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C13663c<>(C5923b0.m26088M());
            } while (!this.f37861R.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f37858O.decrementAndGet();
            mo42662e();
        }

        public void onError(Throwable th) {
            this.f37858O.decrementAndGet();
            if (this.f37859P.mo43142a(th)) {
                if (!this.f37865b) {
                    this.f37857N.dispose();
                }
                mo42662e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37860Q.apply(t), "The mapper returned a null SingleSource");
                this.f37858O.getAndIncrement();
                C13136a aVar = new C13136a();
                if (!this.f37863T && this.f37857N.mo42072b(aVar)) {
                    q0Var.mo24192a(aVar);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37862S.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42660a(C13136a aVar, R r) {
            this.f37857N.mo42073c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f37864a.mo33453a(r);
                    if (this.f37858O.decrementAndGet() != 0) {
                        z = false;
                    }
                    C13663c cVar = (C13663c) this.f37861R.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo42663f();
                    }
                    Throwable d = this.f37859P.mo43143d();
                    if (d != null) {
                        this.f37864a.onError(d);
                    } else {
                        this.f37864a.onComplete();
                    }
                    return;
                }
            }
            C13663c g = mo42664g();
            synchronized (g) {
                g.offer(r);
            }
            this.f37858O.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo42663f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42661a(C13136a aVar, Throwable th) {
            this.f37857N.mo42073c(aVar);
            if (this.f37859P.mo43142a(th)) {
                if (!this.f37865b) {
                    this.f37862S.dispose();
                    this.f37857N.dispose();
                }
                this.f37858O.decrementAndGet();
                mo42662e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42659a() {
            C13663c cVar = (C13663c) this.f37861R.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C13134a1(C5926g0<T> g0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
        super(g0Var);
        this.f37856b = oVar;
        this.f37855N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        this.f37851a.mo23893a(new C13135a(i0Var, this.f37856b, this.f37855N));
    }
}
