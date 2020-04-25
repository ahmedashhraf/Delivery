package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.w3 */
/* compiled from: ObservableTimeout */
public final class C13466w3<T, U, V> extends C13131a<T, T> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C5926g0<V>> f38998N;

    /* renamed from: O */
    final C5926g0<? extends T> f38999O;

    /* renamed from: b */
    final C5926g0<U> f39000b;

    /* renamed from: e.a.x0.e.e.w3$a */
    /* compiled from: ObservableTimeout */
    static final class C13467a extends AtomicReference<C12314c> implements C12280i0<Object>, C12314c {
        private static final long serialVersionUID = 8708641127342403073L;

        /* renamed from: a */
        final C13470d f39001a;

        /* renamed from: b */
        final long f39002b;

        C13467a(long j, C13470d dVar) {
            this.f39002b = j;
            this.f39001a = dVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
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
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f39001a.mo42932a(this.f39002b);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f39001a.mo42933a(this.f39002b, th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            C12314c cVar = (C12314c) get();
            if (cVar != C12347d.DISPOSED) {
                cVar.dispose();
                lazySet(C12347d.DISPOSED);
                this.f39001a.mo42932a(this.f39002b);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.w3$b */
    /* compiled from: ObservableTimeout */
    static final class C13468b<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c, C13470d {
        private static final long serialVersionUID = -7508389464265974549L;

        /* renamed from: N */
        final C12350g f39003N = new C12350g();

        /* renamed from: O */
        final AtomicLong f39004O;

        /* renamed from: P */
        final AtomicReference<C12314c> f39005P;

        /* renamed from: Q */
        C5926g0<? extends T> f39006Q;

        /* renamed from: a */
        final C12280i0<? super T> f39007a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<?>> f39008b;

        C13468b(C12280i0<? super T> i0Var, C12339o<? super T, ? extends C5926g0<?>> oVar, C5926g0<? extends T> g0Var) {
            this.f39007a = i0Var;
            this.f39008b = oVar;
            this.f39006Q = g0Var;
            this.f39004O = new AtomicLong();
            this.f39005P = new AtomicReference<>();
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f39005P, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a(this.f39005P);
            C12347d.m55465a((AtomicReference<C12314c>) this);
            this.f39003N.dispose();
        }

        public void onComplete() {
            if (this.f39004O.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39003N.dispose();
                this.f39007a.onComplete();
                this.f39003N.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f39004O.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39003N.dispose();
                this.f39007a.onError(th);
                this.f39003N.dispose();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = this.f39004O.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f39004O.compareAndSet(j, j2)) {
                    C12314c cVar = (C12314c) this.f39003N.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f39007a.mo33453a(t);
                    try {
                        C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f39008b.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C13467a aVar = new C13467a(j2, this);
                        if (this.f39003N.mo42109a(aVar)) {
                            g0Var.mo23893a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        ((C12314c) this.f39005P.get()).dispose();
                        this.f39004O.getAndSet(Long.MAX_VALUE);
                        this.f39007a.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42934a(C5926g0<?> g0Var) {
            if (g0Var != null) {
                C13467a aVar = new C13467a(0, this);
                if (this.f39003N.mo42109a(aVar)) {
                    g0Var.mo23893a(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo42932a(long j) {
            if (this.f39004O.compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a(this.f39005P);
                C5926g0<? extends T> g0Var = this.f39006Q;
                this.f39006Q = null;
                g0Var.mo23893a(new C13482a(this.f39007a, this));
            }
        }

        /* renamed from: a */
        public void mo42933a(long j, Throwable th) {
            if (this.f39004O.compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a((AtomicReference<C12314c>) this);
                this.f39007a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.e.w3$c */
    /* compiled from: ObservableTimeout */
    static final class C13469c<T> extends AtomicLong implements C12280i0<T>, C12314c, C13470d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: N */
        final C12350g f39009N = new C12350g();

        /* renamed from: O */
        final AtomicReference<C12314c> f39010O = new AtomicReference<>();

        /* renamed from: a */
        final C12280i0<? super T> f39011a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<?>> f39012b;

        C13469c(C12280i0<? super T> i0Var, C12339o<? super T, ? extends C5926g0<?>> oVar) {
            this.f39011a = i0Var;
            this.f39012b = oVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f39010O, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f39010O.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f39010O);
            this.f39009N.dispose();
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39009N.dispose();
                this.f39011a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39009N.dispose();
                this.f39011a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    C12314c cVar = (C12314c) this.f39009N.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f39011a.mo33453a(t);
                    try {
                        C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f39012b.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C13467a aVar = new C13467a(j2, this);
                        if (this.f39009N.mo42109a(aVar)) {
                            g0Var.mo23893a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        ((C12314c) this.f39010O.get()).dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f39011a.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42935a(C5926g0<?> g0Var) {
            if (g0Var != null) {
                C13467a aVar = new C13467a(0, this);
                if (this.f39009N.mo42109a(aVar)) {
                    g0Var.mo23893a(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo42932a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a(this.f39010O);
                this.f39011a.onError(new TimeoutException());
            }
        }

        /* renamed from: a */
        public void mo42933a(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C12347d.m55465a(this.f39010O);
                this.f39011a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.e.w3$d */
    /* compiled from: ObservableTimeout */
    interface C13470d extends C13485d {
        /* renamed from: a */
        void mo42933a(long j, Throwable th);
    }

    public C13466w3(C5923b0<T> b0Var, C5926g0<U> g0Var, C12339o<? super T, ? extends C5926g0<V>> oVar, C5926g0<? extends T> g0Var2) {
        super(b0Var);
        this.f39000b = g0Var;
        this.f38998N = oVar;
        this.f38999O = g0Var2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<? extends T> g0Var = this.f38999O;
        if (g0Var == null) {
            C13469c cVar = new C13469c(i0Var, this.f38998N);
            i0Var.mo34123a((C12314c) cVar);
            cVar.mo42935a(this.f39000b);
            this.f37851a.mo23893a(cVar);
            return;
        }
        C13468b bVar = new C13468b(i0Var, this.f38998N, g0Var);
        i0Var.mo34123a((C12314c) bVar);
        bVar.mo42934a(this.f39000b);
        this.f37851a.mo23893a(bVar);
    }
}
