package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.g4 */
/* compiled from: ObservableWindowBoundarySupplier */
public final class C13228g4<T, B> extends C13131a<T, C5923b0<T>> {

    /* renamed from: N */
    final int f38172N;

    /* renamed from: b */
    final Callable<? extends C5926g0<B>> f38173b;

    /* renamed from: e.a.x0.e.e.g4$a */
    /* compiled from: ObservableWindowBoundarySupplier */
    static final class C13229a<T, B> extends C13787e<B> {

        /* renamed from: N */
        boolean f38174N;

        /* renamed from: b */
        final C13230b<T, B> f38175b;

        C13229a(C13230b<T, B> bVar) {
            this.f38175b = bVar;
        }

        /* renamed from: a */
        public void mo33453a(B b) {
            if (!this.f38174N) {
                this.f38174N = true;
                dispose();
                this.f38175b.mo42743a(this);
            }
        }

        public void onComplete() {
            if (!this.f38174N) {
                this.f38174N = true;
                this.f38175b.mo42746f();
            }
        }

        public void onError(Throwable th) {
            if (this.f38174N) {
                C12205a.m54894b(th);
                return;
            }
            this.f38174N = true;
            this.f38175b.mo42744a(th);
        }
    }

    /* renamed from: e.a.x0.e.e.g4$b */
    /* compiled from: ObservableWindowBoundarySupplier */
    static final class C13230b<T, B> extends AtomicInteger implements C12280i0<T>, C12314c, Runnable {

        /* renamed from: W */
        static final C13229a<Object, Object> f38176W = new C13229a<>(null);

        /* renamed from: X */
        static final Object f38177X = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: N */
        final AtomicReference<C13229a<T, B>> f38178N = new AtomicReference<>();

        /* renamed from: O */
        final AtomicInteger f38179O = new AtomicInteger(1);

        /* renamed from: P */
        final C13660a<Object> f38180P = new C13660a<>();

        /* renamed from: Q */
        final C13746c f38181Q = new C13746c();

        /* renamed from: R */
        final AtomicBoolean f38182R = new AtomicBoolean();

        /* renamed from: S */
        final Callable<? extends C5926g0<B>> f38183S;

        /* renamed from: T */
        C12314c f38184T;

        /* renamed from: U */
        volatile boolean f38185U;

        /* renamed from: V */
        C12266j<T> f38186V;

        /* renamed from: a */
        final C12280i0<? super C5923b0<T>> f38187a;

        /* renamed from: b */
        final int f38188b;

        C13230b(C12280i0<? super C5923b0<T>> i0Var, int i, Callable<? extends C5926g0<B>> callable) {
            this.f38187a = i0Var;
            this.f38188b = i;
            this.f38183S = callable;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38184T, cVar)) {
                this.f38184T = cVar;
                this.f38187a.mo34123a((C12314c) this);
                this.f38180P.offer(f38177X);
                mo42745e();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38182R.get();
        }

        public void dispose() {
            if (this.f38182R.compareAndSet(false, true)) {
                mo42742a();
                if (this.f38179O.decrementAndGet() == 0) {
                    this.f38184T.dispose();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42745e() {
            if (getAndIncrement() == 0) {
                C12280i0<? super C5923b0<T>> i0Var = this.f38187a;
                C13660a<Object> aVar = this.f38180P;
                C13746c cVar = this.f38181Q;
                int i = 1;
                while (this.f38179O.get() != 0) {
                    C12266j<T> jVar = this.f38186V;
                    boolean z = this.f38185U;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable d = cVar.mo43143d();
                            if (d == null) {
                                if (jVar != null) {
                                    this.f38186V = null;
                                    jVar.onComplete();
                                }
                                i0Var.onComplete();
                            } else {
                                if (jVar != null) {
                                    this.f38186V = null;
                                    jVar.onError(d);
                                }
                                i0Var.onError(d);
                            }
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f38177X) {
                            jVar.mo33453a(poll);
                        } else {
                            if (jVar != null) {
                                this.f38186V = null;
                                jVar.onComplete();
                            }
                            if (!this.f38182R.get()) {
                                C12266j<T> a = C12266j.m55267a(this.f38188b, (Runnable) this);
                                this.f38186V = a;
                                this.f38179O.getAndIncrement();
                                try {
                                    C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38183S.call(), "The other Callable returned a null ObservableSource");
                                    C13229a aVar2 = new C13229a(this);
                                    if (this.f38178N.compareAndSet(null, aVar2)) {
                                        g0Var.mo23893a(aVar2);
                                        i0Var.mo33453a(a);
                                    }
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    cVar.mo43142a(th);
                                    this.f38185U = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable d2 = cVar.mo43143d();
                        if (jVar != null) {
                            this.f38186V = null;
                            jVar.onError(d2);
                        }
                        i0Var.onError(d2);
                        return;
                    }
                }
                aVar.clear();
                this.f38186V = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42746f() {
            this.f38184T.dispose();
            this.f38185U = true;
            mo42745e();
        }

        public void onComplete() {
            mo42742a();
            this.f38185U = true;
            mo42745e();
        }

        public void onError(Throwable th) {
            mo42742a();
            if (this.f38181Q.mo43142a(th)) {
                this.f38185U = true;
                mo42745e();
                return;
            }
            C12205a.m54894b(th);
        }

        public void run() {
            if (this.f38179O.decrementAndGet() == 0) {
                this.f38184T.dispose();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38180P.offer(t);
            mo42745e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42742a() {
            C12314c cVar = (C12314c) this.f38178N.getAndSet(f38176W);
            if (cVar != null && cVar != f38176W) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42743a(C13229a<T, B> aVar) {
            this.f38178N.compareAndSet(aVar, null);
            this.f38180P.offer(f38177X);
            mo42745e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42744a(Throwable th) {
            this.f38184T.dispose();
            if (this.f38181Q.mo43142a(th)) {
                this.f38185U = true;
                mo42745e();
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C13228g4(C5926g0<T> g0Var, Callable<? extends C5926g0<B>> callable, int i) {
        super(g0Var);
        this.f38173b = callable;
        this.f38172N = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5923b0<T>> i0Var) {
        this.f37851a.mo23893a(new C13230b(i0Var, this.f38172N, this.f38173b));
    }
}
