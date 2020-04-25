package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.n */
/* compiled from: FlowableBufferBoundary */
public final class C12722n<T, U extends Collection<? super T>, Open, Close> extends C12511a<T, U> {

    /* renamed from: N */
    final Callable<U> f36478N;

    /* renamed from: O */
    final C6007b<? extends Open> f36479O;

    /* renamed from: P */
    final C12339o<? super Open, ? extends C6007b<? extends Close>> f36480P;

    /* renamed from: e.a.x0.e.b.n$a */
    /* compiled from: FlowableBufferBoundary */
    static final class C12723a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: N */
        final C6007b<? extends Open> f36481N;

        /* renamed from: O */
        final C12339o<? super Open, ? extends C6007b<? extends Close>> f36482O;

        /* renamed from: P */
        final C12313b f36483P = new C12313b();

        /* renamed from: Q */
        final AtomicLong f36484Q = new AtomicLong();

        /* renamed from: R */
        final AtomicReference<C14063d> f36485R = new AtomicReference<>();

        /* renamed from: S */
        final C13746c f36486S = new C13746c();

        /* renamed from: T */
        volatile boolean f36487T;

        /* renamed from: U */
        final C13663c<C> f36488U = new C13663c<>(C5929l.m26793R());

        /* renamed from: V */
        volatile boolean f36489V;

        /* renamed from: W */
        long f36490W;

        /* renamed from: X */
        Map<Long, C> f36491X = new LinkedHashMap();

        /* renamed from: Y */
        long f36492Y;

        /* renamed from: a */
        final C14062c<? super C> f36493a;

        /* renamed from: b */
        final Callable<C> f36494b;

        /* renamed from: e.a.x0.e.b.n$a$a */
        /* compiled from: FlowableBufferBoundary */
        static final class C12724a<Open> extends AtomicReference<C14063d> implements C12297q<Open>, C12314c {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: a */
            final C12723a<?, ?, Open, ?> f36495a;

            C12724a(C12723a<?, ?, Open, ?> aVar) {
                this.f36495a = aVar;
            }

            /* renamed from: a */
            public void mo41788a(C14063d dVar) {
                C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return get() == C13742j.CANCELLED;
            }

            public void dispose() {
                C13742j.m58674a((AtomicReference<C14063d>) this);
            }

            public void onComplete() {
                lazySet(C13742j.CANCELLED);
                this.f36495a.mo42377a(this);
            }

            public void onError(Throwable th) {
                lazySet(C13742j.CANCELLED);
                this.f36495a.mo42376a((C12314c) this, th);
            }

            /* renamed from: a */
            public void mo41789a(Open open) {
                this.f36495a.mo42379c(open);
            }
        }

        C12723a(C14062c<? super C> cVar, C6007b<? extends Open> bVar, C12339o<? super Open, ? extends C6007b<? extends Close>> oVar, Callable<C> callable) {
            this.f36493a = cVar;
            this.f36494b = callable;
            this.f36481N = bVar;
            this.f36482O = oVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f36485R, dVar)) {
                C12724a aVar = new C12724a(this);
                this.f36483P.mo42072b(aVar);
                this.f36481N.mo24397a(aVar);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13747d.m58696a(this.f36484Q, j);
            mo42375a();
        }

        public void cancel() {
            if (C13742j.m58674a(this.f36485R)) {
                this.f36489V = true;
                this.f36483P.dispose();
                synchronized (this) {
                    this.f36491X = null;
                }
                if (getAndIncrement() != 0) {
                    this.f36488U.clear();
                }
            }
        }

        public void onComplete() {
            this.f36483P.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f36491X;
                if (map != null) {
                    for (Collection offer : map.values()) {
                        this.f36488U.offer(offer);
                    }
                    this.f36491X = null;
                    this.f36487T = true;
                    mo42375a();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36486S.mo43142a(th)) {
                this.f36483P.dispose();
                synchronized (this) {
                    this.f36491X = null;
                }
                this.f36487T = true;
                mo42375a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42379c(Open open) {
            try {
                Collection collection = (Collection) C12390b.m55563a(this.f36494b.call(), "The bufferSupplier returned a null Collection");
                C6007b bVar = (C6007b) C12390b.m55563a(this.f36482O.apply(open), "The bufferClose returned a null Publisher");
                long j = this.f36490W;
                this.f36490W = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.f36491X;
                    if (map != null) {
                        map.put(Long.valueOf(j), collection);
                        C12725b bVar2 = new C12725b(this, j);
                        this.f36483P.mo42072b(bVar2);
                        bVar.mo24397a(bVar2);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C13742j.m58674a(this.f36485R);
                onError(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f36491X;
                if (map != null) {
                    for (Collection add : map.values()) {
                        add.add(t);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42377a(C12724a<Open> aVar) {
            this.f36483P.mo42073c(aVar);
            if (this.f36483P.mo42071b() == 0) {
                C13742j.m58674a(this.f36485R);
                this.f36487T = true;
                mo42375a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r4 == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.f36487T = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            mo42375a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42378a(p195e.p196a.p199x0.p454e.p456b.C12722n.C12725b<T, C> r4, long r5) {
            /*
                r3 = this;
                e.a.u0.b r0 = r3.f36483P
                r0.mo42073c(r4)
                e.a.u0.b r4 = r3.f36483P
                int r4 = r4.mo42071b()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<i.e.d> r4 = r3.f36485R
                p195e.p196a.p199x0.p465i.C13742j.m58674a(r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C> r1 = r3.f36491X     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001d:
                e.a.x0.f.c<C> r1 = r3.f36488U     // Catch:{ all -> 0x0035 }
                java.util.Map<java.lang.Long, C> r2 = r3.f36491X     // Catch:{ all -> 0x0035 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
                r1.offer(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                r3.f36487T = r0
            L_0x0031:
                r3.mo42375a()
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12722n.C12723a.mo42378a(e.a.x0.e.b.n$b, long):void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42376a(C12314c cVar, Throwable th) {
            C13742j.m58674a(this.f36485R);
            this.f36483P.mo42073c(cVar);
            onError(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42375a() {
            if (getAndIncrement() == 0) {
                long j = this.f36492Y;
                C14062c<? super C> cVar = this.f36493a;
                C13663c<C> cVar2 = this.f36488U;
                int i = 1;
                do {
                    long j2 = this.f36484Q.get();
                    while (j != j2) {
                        if (this.f36489V) {
                            cVar2.clear();
                            return;
                        }
                        boolean z = this.f36487T;
                        if (!z || this.f36486S.get() == null) {
                            Collection collection = (Collection) cVar2.poll();
                            boolean z2 = collection == null;
                            if (z && z2) {
                                cVar.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                cVar.mo41789a(collection);
                                j++;
                            }
                        } else {
                            cVar2.clear();
                            cVar.onError(this.f36486S.mo43143d());
                            return;
                        }
                    }
                    if (j == j2) {
                        if (this.f36489V) {
                            cVar2.clear();
                            return;
                        } else if (this.f36487T) {
                            if (this.f36486S.get() != null) {
                                cVar2.clear();
                                cVar.onError(this.f36486S.mo43143d());
                                return;
                            } else if (cVar2.isEmpty()) {
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                    this.f36492Y = j;
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.n$b */
    /* compiled from: FlowableBufferBoundary */
    static final class C12725b<T, C extends Collection<? super T>> extends AtomicReference<C14063d> implements C12297q<Object>, C12314c {
        private static final long serialVersionUID = -8498650778633225126L;

        /* renamed from: a */
        final C12723a<T, C, ?, ?> f36496a;

        /* renamed from: b */
        final long f36497b;

        C12725b(C12723a<T, C, ?, ?> aVar, long j) {
            this.f36496a = aVar;
            this.f36497b = j;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C13742j.CANCELLED;
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            Object obj = get();
            C13742j jVar = C13742j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f36496a.mo42378a(this, this.f36497b);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C13742j jVar = C13742j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.f36496a.mo42376a((C12314c) this, th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            C14063d dVar = (C14063d) get();
            C13742j jVar = C13742j.CANCELLED;
            if (dVar != jVar) {
                lazySet(jVar);
                dVar.cancel();
                this.f36496a.mo42378a(this, this.f36497b);
            }
        }
    }

    public C12722n(C5929l<T> lVar, C6007b<? extends Open> bVar, C12339o<? super Open, ? extends C6007b<? extends Close>> oVar, Callable<U> callable) {
        super(lVar);
        this.f36479O = bVar;
        this.f36480P = oVar;
        this.f36478N = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        C12723a aVar = new C12723a(cVar, this.f36479O, this.f36480P, this.f36478N);
        cVar.mo41788a((C14063d) aVar);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
    }
}
