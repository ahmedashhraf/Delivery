package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.n */
/* compiled from: ObservableBufferBoundary */
public final class C13319n<T, U extends Collection<? super T>, Open, Close> extends C13131a<T, U> {

    /* renamed from: N */
    final C5926g0<? extends Open> f38502N;

    /* renamed from: O */
    final C12339o<? super Open, ? extends C5926g0<? extends Close>> f38503O;

    /* renamed from: b */
    final Callable<U> f38504b;

    /* renamed from: e.a.x0.e.e.n$a */
    /* compiled from: ObservableBufferBoundary */
    static final class C13320a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: N */
        final C5926g0<? extends Open> f38505N;

        /* renamed from: O */
        final C12339o<? super Open, ? extends C5926g0<? extends Close>> f38506O;

        /* renamed from: P */
        final C12313b f38507P = new C12313b();

        /* renamed from: Q */
        final AtomicReference<C12314c> f38508Q = new AtomicReference<>();

        /* renamed from: R */
        final C13746c f38509R = new C13746c();

        /* renamed from: S */
        volatile boolean f38510S;

        /* renamed from: T */
        final C13663c<C> f38511T = new C13663c<>(C5923b0.m26088M());

        /* renamed from: U */
        volatile boolean f38512U;

        /* renamed from: V */
        long f38513V;

        /* renamed from: W */
        Map<Long, C> f38514W = new LinkedHashMap();

        /* renamed from: a */
        final C12280i0<? super C> f38515a;

        /* renamed from: b */
        final Callable<C> f38516b;

        /* renamed from: e.a.x0.e.e.n$a$a */
        /* compiled from: ObservableBufferBoundary */
        static final class C13321a<Open> extends AtomicReference<C12314c> implements C12280i0<Open>, C12314c {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: a */
            final C13320a<?, ?, Open, ?> f38517a;

            C13321a(C13320a<?, ?, Open, ?> aVar) {
                this.f38517a = aVar;
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return get() == C12347d.DISPOSED;
            }

            public void dispose() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }

            public void onComplete() {
                lazySet(C12347d.DISPOSED);
                this.f38517a.mo42811a(this);
            }

            public void onError(Throwable th) {
                lazySet(C12347d.DISPOSED);
                this.f38517a.mo42810a((C12314c) this, th);
            }

            /* renamed from: a */
            public void mo33453a(Open open) {
                this.f38517a.mo42813b(open);
            }
        }

        C13320a(C12280i0<? super C> i0Var, C5926g0<? extends Open> g0Var, C12339o<? super Open, ? extends C5926g0<? extends Close>> oVar, Callable<C> callable) {
            this.f38515a = i0Var;
            this.f38516b = callable;
            this.f38505N = g0Var;
            this.f38506O = oVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this.f38508Q, cVar)) {
                C13321a aVar = new C13321a(this);
                this.f38507P.mo42072b(aVar);
                this.f38505N.mo23893a(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42813b(Open open) {
            try {
                Collection collection = (Collection) C12390b.m55563a(this.f38516b.call(), "The bufferSupplier returned a null Collection");
                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38506O.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.f38513V;
                this.f38513V = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.f38514W;
                    if (map != null) {
                        map.put(Long.valueOf(j), collection);
                        C13322b bVar = new C13322b(this, j);
                        this.f38507P.mo42072b(bVar);
                        g0Var.mo23893a(bVar);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12347d.m55465a(this.f38508Q);
                onError(th);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f38508Q.get());
        }

        public void dispose() {
            if (C12347d.m55465a(this.f38508Q)) {
                this.f38512U = true;
                this.f38507P.dispose();
                synchronized (this) {
                    this.f38514W = null;
                }
                if (getAndIncrement() != 0) {
                    this.f38511T.clear();
                }
            }
        }

        public void onComplete() {
            this.f38507P.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f38514W;
                if (map != null) {
                    for (Collection offer : map.values()) {
                        this.f38511T.offer(offer);
                    }
                    this.f38514W = null;
                    this.f38510S = true;
                    mo42809a();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38509R.mo43142a(th)) {
                this.f38507P.dispose();
                synchronized (this) {
                    this.f38514W = null;
                }
                this.f38510S = true;
                mo42809a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f38514W;
                if (map != null) {
                    for (Collection add : map.values()) {
                        add.add(t);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42811a(C13321a<Open> aVar) {
            this.f38507P.mo42073c(aVar);
            if (this.f38507P.mo42071b() == 0) {
                C12347d.m55465a(this.f38508Q);
                this.f38510S = true;
                mo42809a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r4 == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.f38510S = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            mo42809a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42812a(p195e.p196a.p199x0.p454e.p459e.C13319n.C13322b<T, C> r4, long r5) {
            /*
                r3 = this;
                e.a.u0.b r0 = r3.f38507P
                r0.mo42073c(r4)
                e.a.u0.b r4 = r3.f38507P
                int r4 = r4.mo42071b()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<e.a.u0.c> r4 = r3.f38508Q
                p195e.p196a.p199x0.p450a.C12347d.m55465a(r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C> r1 = r3.f38514W     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001d:
                e.a.x0.f.c<C> r1 = r3.f38511T     // Catch:{ all -> 0x0035 }
                java.util.Map<java.lang.Long, C> r2 = r3.f38514W     // Catch:{ all -> 0x0035 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
                r1.offer(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                r3.f38510S = r0
            L_0x0031:
                r3.mo42809a()
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13319n.C13320a.mo42812a(e.a.x0.e.e.n$b, long):void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42810a(C12314c cVar, Throwable th) {
            C12347d.m55465a(this.f38508Q);
            this.f38507P.mo42073c(cVar);
            onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42809a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super C> i0Var = this.f38515a;
                C13663c<C> cVar = this.f38511T;
                int i = 1;
                while (!this.f38512U) {
                    boolean z = this.f38510S;
                    if (!z || this.f38509R.get() == null) {
                        Collection collection = (Collection) cVar.poll();
                        boolean z2 = collection == null;
                        if (z && z2) {
                            i0Var.onComplete();
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            i0Var.mo33453a(collection);
                        }
                    } else {
                        cVar.clear();
                        i0Var.onError(this.f38509R.mo43143d());
                        return;
                    }
                }
                cVar.clear();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.n$b */
    /* compiled from: ObservableBufferBoundary */
    static final class C13322b<T, C extends Collection<? super T>> extends AtomicReference<C12314c> implements C12280i0<Object>, C12314c {
        private static final long serialVersionUID = -8498650778633225126L;

        /* renamed from: a */
        final C13320a<T, C, ?, ?> f38518a;

        /* renamed from: b */
        final long f38519b;

        C13322b(C13320a<T, C, ?, ?> aVar, long j) {
            this.f38518a = aVar;
            this.f38519b = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f38518a.mo42812a(this, this.f38519b);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f38518a.mo42810a((C12314c) this, th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            C12314c cVar = (C12314c) get();
            C12347d dVar = C12347d.DISPOSED;
            if (cVar != dVar) {
                lazySet(dVar);
                cVar.dispose();
                this.f38518a.mo42812a(this, this.f38519b);
            }
        }
    }

    public C13319n(C5926g0<T> g0Var, C5926g0<? extends Open> g0Var2, C12339o<? super Open, ? extends C5926g0<? extends Close>> oVar, Callable<U> callable) {
        super(g0Var);
        this.f38502N = g0Var2;
        this.f38503O = oVar;
        this.f38504b = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        C13320a aVar = new C13320a(i0Var, this.f38502N, this.f38503O, this.f38504b);
        i0Var.mo34123a((C12314c) aVar);
        this.f37851a.mo23893a(aVar);
    }
}
