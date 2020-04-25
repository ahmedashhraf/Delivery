package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13768u;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p464h.C13724m;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.q */
/* compiled from: FlowableBufferTimed */
public final class C12770q<T, U extends Collection<? super T>> extends C12511a<T, U> {

    /* renamed from: N */
    final long f36643N;

    /* renamed from: O */
    final long f36644O;

    /* renamed from: P */
    final TimeUnit f36645P;

    /* renamed from: Q */
    final C12282j0 f36646Q;

    /* renamed from: R */
    final Callable<U> f36647R;

    /* renamed from: S */
    final int f36648S;

    /* renamed from: T */
    final boolean f36649T;

    /* renamed from: e.a.x0.e.b.q$a */
    /* compiled from: FlowableBufferTimed */
    static final class C12771a<T, U extends Collection<? super T>> extends C13724m<T, U, U> implements C14063d, Runnable, C12314c {

        /* renamed from: L0 */
        final Callable<U> f36650L0;

        /* renamed from: M0 */
        final long f36651M0;

        /* renamed from: N0 */
        final TimeUnit f36652N0;

        /* renamed from: O0 */
        final int f36653O0;

        /* renamed from: P0 */
        final boolean f36654P0;

        /* renamed from: Q0 */
        final C12285c f36655Q0;

        /* renamed from: R0 */
        U f36656R0;

        /* renamed from: S0 */
        C12314c f36657S0;

        /* renamed from: T0 */
        C14063d f36658T0;

        /* renamed from: U0 */
        long f36659U0;

        /* renamed from: V0 */
        long f36660V0;

        C12771a(C14062c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C12285c cVar2) {
            super(cVar, new C13660a());
            this.f36650L0 = callable;
            this.f36651M0 = j;
            this.f36652N0 = timeUnit;
            this.f36653O0 = i;
            this.f36654P0 = z;
            this.f36655Q0 = cVar2;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            if (!this.f39707I0) {
                this.f39707I0 = true;
                dispose();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36655Q0.mo41878d();
        }

        public void dispose() {
            synchronized (this) {
                this.f36656R0 = null;
            }
            this.f36658T0.cancel();
            this.f36655Q0.dispose();
        }

        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f36656R0;
                this.f36656R0 = null;
            }
            this.f39706H0.offer(u);
            this.f39708J0 = true;
            if (mo43109b()) {
                C13769v.m58782a(this.f39706H0, this.f39705G0, false, (C12314c) this, (C13768u<T, U>) this);
            }
            this.f36655Q0.dispose();
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f36656R0 = null;
            }
            this.f39705G0.onError(th);
            this.f36655Q0.dispose();
        }

        public void run() {
            try {
                U u = (Collection) C12390b.m55563a(this.f36650L0.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.f36656R0;
                    if (u2 != null) {
                        if (this.f36659U0 == this.f36660V0) {
                            this.f36656R0 = u;
                            mo43108b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cancel();
                this.f39705G0.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36658T0, dVar)) {
                this.f36658T0 = dVar;
                try {
                    this.f36656R0 = (Collection) C12390b.m55563a(this.f36650L0.call(), "The supplied buffer is null");
                    this.f39705G0.mo41788a((C14063d) this);
                    C12285c cVar = this.f36655Q0;
                    long j = this.f36651M0;
                    this.f36657S0 = cVar.mo42028a(this, j, j, this.f36652N0);
                    dVar.mo41813c(Long.MAX_VALUE);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36655Q0.dispose();
                    dVar.cancel();
                    C13739g.m58655a(th, this.f39705G0);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f36654P0 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f36657S0.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo43108b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) p195e.p196a.p199x0.p451b.C12390b.m55563a(r7.f36650L0.call(), "The supplied buffer is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f36656R0 = r8;
            r7.f36660V0++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r7.f36654P0 == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r0 = r7.f36655Q0;
            r4 = r7.f36651M0;
            r7.f36657S0 = r0.mo42028a(r7, r4, r4, r7.f36652N0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
            p212io.reactivex.exceptions.C14398a.m62357b(r8);
            cancel();
            r7.f39705G0.onError(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41789a(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f36656R0     // Catch:{ all -> 0x0066 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0066 }
                int r8 = r0.size()     // Catch:{ all -> 0x0066 }
                int r1 = r7.f36653O0     // Catch:{ all -> 0x0066 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0014:
                r8 = 0
                r7.f36656R0 = r8     // Catch:{ all -> 0x0066 }
                long r1 = r7.f36659U0     // Catch:{ all -> 0x0066 }
                r3 = 1
                long r1 = r1 + r3
                r7.f36659U0 = r1     // Catch:{ all -> 0x0066 }
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                boolean r8 = r7.f36654P0
                if (r8 == 0) goto L_0x0028
                e.a.u0.c r8 = r7.f36657S0
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo43108b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f36650L0     // Catch:{ all -> 0x0059 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0059 }
                java.lang.String r0 = "The supplied buffer is null"
                java.lang.Object r8 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r8, r0)     // Catch:{ all -> 0x0059 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0059 }
                monitor-enter(r7)
                r7.f36656R0 = r8     // Catch:{ all -> 0x0056 }
                long r0 = r7.f36660V0     // Catch:{ all -> 0x0056 }
                long r0 = r0 + r3
                r7.f36660V0 = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                boolean r8 = r7.f36654P0
                if (r8 == 0) goto L_0x0055
                e.a.j0$c r0 = r7.f36655Q0
                long r4 = r7.f36651M0
                java.util.concurrent.TimeUnit r6 = r7.f36652N0
                r1 = r7
                r2 = r4
                e.a.u0.c r8 = r0.mo42028a(r1, r2, r4, r6)
                r7.f36657S0 = r8
            L_0x0055:
                return
            L_0x0056:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                throw r8
            L_0x0059:
                r8 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r8)
                r7.cancel()
                i.e.c<? super V> r0 = r7.f39705G0
                r0.onError(r8)
                return
            L_0x0066:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12770q.C12771a.mo41789a(java.lang.Object):void");
        }

        /* renamed from: a */
        public boolean mo42398a(C14062c<? super U> cVar, U u) {
            cVar.mo41789a(u);
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.q$b */
    /* compiled from: FlowableBufferTimed */
    static final class C12772b<T, U extends Collection<? super T>> extends C13724m<T, U, U> implements C14063d, Runnable, C12314c {

        /* renamed from: L0 */
        final Callable<U> f36661L0;

        /* renamed from: M0 */
        final long f36662M0;

        /* renamed from: N0 */
        final TimeUnit f36663N0;

        /* renamed from: O0 */
        final C12282j0 f36664O0;

        /* renamed from: P0 */
        C14063d f36665P0;

        /* renamed from: Q0 */
        U f36666Q0;

        /* renamed from: R0 */
        final AtomicReference<C12314c> f36667R0 = new AtomicReference<>();

        C12772b(C14062c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(cVar, new C13660a());
            this.f36661L0 = callable;
            this.f36662M0 = j;
            this.f36663N0 = timeUnit;
            this.f36664O0 = j0Var;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
            this.f36665P0.cancel();
            C12347d.m55465a(this.f36667R0);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36667R0.get() == C12347d.DISPOSED;
        }

        public void dispose() {
            cancel();
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.v.a(e.a.x0.c.n, i.e.c, boolean, e.a.u0.c, e.a.x0.j.u):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (mo43109b() == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            p195e.p196a.p199x0.p200j.C13769v.m58782a((p195e.p196a.p199x0.p452c.C12405n) r4.f39706H0, (p205i.p211e.C14062c) r4.f39705G0, false, (p195e.p196a.p447u0.C12314c) null, (p195e.p196a.p199x0.p200j.C13768u) r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
            r4.f39706H0.offer(r0);
            r4.f39708J0 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<e.a.u0.c> r0 = r4.f36667R0
                p195e.p196a.p199x0.p450a.C12347d.m55465a(r0)
                monitor-enter(r4)
                U r0 = r4.f36666Q0     // Catch:{ all -> 0x0027 }
                if (r0 != 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                return
            L_0x000c:
                r1 = 0
                r4.f36666Q0 = r1     // Catch:{ all -> 0x0027 }
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                e.a.x0.c.n<U> r2 = r4.f39706H0
                r2.offer(r0)
                r0 = 1
                r4.f39708J0 = r0
                boolean r0 = r4.mo43109b()
                if (r0 == 0) goto L_0x0026
                e.a.x0.c.n<U> r0 = r4.f39706H0
                i.e.c<? super V> r2 = r4.f39705G0
                r3 = 0
                p195e.p196a.p199x0.p200j.C13769v.m58782a(r0, r2, r3, r1, r4)
            L_0x0026:
                return
            L_0x0027:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12770q.C12772b.onComplete():void");
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f36667R0);
            synchronized (this) {
                this.f36666Q0 = null;
            }
            this.f39705G0.onError(th);
        }

        public void run() {
            try {
                U u = (Collection) C12390b.m55563a(this.f36661L0.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.f36666Q0;
                    if (u2 != null) {
                        this.f36666Q0 = u;
                        mo43106a(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cancel();
                this.f39705G0.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36665P0, dVar)) {
                this.f36665P0 = dVar;
                try {
                    this.f36666Q0 = (Collection) C12390b.m55563a(this.f36661L0.call(), "The supplied buffer is null");
                    this.f39705G0.mo41788a((C14063d) this);
                    if (!this.f39707I0) {
                        dVar.mo41813c(Long.MAX_VALUE);
                        C12282j0 j0Var = this.f36664O0;
                        long j = this.f36662M0;
                        C12314c a = j0Var.mo42022a(this, j, j, this.f36663N0);
                        if (!this.f36667R0.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    C13739g.m58655a(th, this.f39705G0);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            synchronized (this) {
                U u = this.f36666Q0;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        /* renamed from: a */
        public boolean mo42398a(C14062c<? super U> cVar, U u) {
            this.f39705G0.mo41789a(u);
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.q$c */
    /* compiled from: FlowableBufferTimed */
    static final class C12773c<T, U extends Collection<? super T>> extends C13724m<T, U, U> implements C14063d, Runnable {

        /* renamed from: L0 */
        final Callable<U> f36668L0;

        /* renamed from: M0 */
        final long f36669M0;

        /* renamed from: N0 */
        final long f36670N0;

        /* renamed from: O0 */
        final TimeUnit f36671O0;

        /* renamed from: P0 */
        final C12285c f36672P0;

        /* renamed from: Q0 */
        final List<U> f36673Q0 = new LinkedList();

        /* renamed from: R0 */
        C14063d f36674R0;

        /* renamed from: e.a.x0.e.b.q$c$a */
        /* compiled from: FlowableBufferTimed */
        final class C12774a implements Runnable {

            /* renamed from: a */
            private final U f36675a;

            C12774a(U u) {
                this.f36675a = u;
            }

            public void run() {
                synchronized (C12773c.this) {
                    C12773c.this.f36673Q0.remove(this.f36675a);
                }
                C12773c cVar = C12773c.this;
                cVar.mo43108b(this.f36675a, false, cVar.f36672P0);
            }
        }

        C12773c(C14062c<? super U> cVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C12285c cVar2) {
            super(cVar, new C13660a());
            this.f36668L0 = callable;
            this.f36669M0 = j;
            this.f36670N0 = j2;
            this.f36671O0 = timeUnit;
            this.f36672P0 = cVar2;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            this.f39707I0 = true;
            this.f36674R0.cancel();
            this.f36672P0.dispose();
            mo42421h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42421h() {
            synchronized (this) {
                this.f36673Q0.clear();
            }
        }

        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f36673Q0);
                this.f36673Q0.clear();
            }
            for (Collection offer : arrayList) {
                this.f39706H0.offer(offer);
            }
            this.f39708J0 = true;
            if (mo43109b()) {
                C13769v.m58782a(this.f39706H0, this.f39705G0, false, (C12314c) this.f36672P0, (C13768u<T, U>) this);
            }
        }

        public void onError(Throwable th) {
            this.f39708J0 = true;
            this.f36672P0.dispose();
            mo42421h();
            this.f39705G0.onError(th);
        }

        public void run() {
            if (!this.f39707I0) {
                try {
                    Collection collection = (Collection) C12390b.m55563a(this.f36668L0.call(), "The supplied buffer is null");
                    synchronized (this) {
                        if (!this.f39707I0) {
                            this.f36673Q0.add(collection);
                            this.f36672P0.mo41877a(new C12774a(collection), this.f36669M0, this.f36671O0);
                        }
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    this.f39705G0.onError(th);
                }
            }
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36674R0, dVar)) {
                this.f36674R0 = dVar;
                try {
                    Collection collection = (Collection) C12390b.m55563a(this.f36668L0.call(), "The supplied buffer is null");
                    this.f36673Q0.add(collection);
                    this.f39705G0.mo41788a((C14063d) this);
                    dVar.mo41813c(Long.MAX_VALUE);
                    C12285c cVar = this.f36672P0;
                    long j = this.f36670N0;
                    cVar.mo42028a(this, j, j, this.f36671O0);
                    this.f36672P0.mo41877a(new C12774a(collection), this.f36669M0, this.f36671O0);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36672P0.dispose();
                    dVar.cancel();
                    C13739g.m58655a(th, this.f39705G0);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            synchronized (this) {
                for (U add : this.f36673Q0) {
                    add.add(t);
                }
            }
        }

        /* renamed from: a */
        public boolean mo42398a(C14062c<? super U> cVar, U u) {
            cVar.mo41789a(u);
            return true;
        }
    }

    public C12770q(C5929l<T> lVar, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, Callable<U> callable, int i, boolean z) {
        super(lVar);
        this.f36643N = j;
        this.f36644O = j2;
        this.f36645P = timeUnit;
        this.f36646Q = j0Var;
        this.f36647R = callable;
        this.f36648S = i;
        this.f36649T = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        if (this.f36643N == this.f36644O && this.f36648S == Integer.MAX_VALUE) {
            C5929l<T> lVar = this.f35814b;
            C12772b bVar = new C12772b(new C12274e(cVar), this.f36647R, this.f36643N, this.f36645P, this.f36646Q);
            lVar.mo24393a((C12297q<? super T>) bVar);
            return;
        }
        C12285c a = this.f36646Q.mo41871a();
        if (this.f36643N == this.f36644O) {
            C5929l<T> lVar2 = this.f35814b;
            C12771a aVar = new C12771a(new C12274e(cVar), this.f36647R, this.f36643N, this.f36645P, this.f36648S, this.f36649T, a);
            lVar2.mo24393a((C12297q<? super T>) aVar);
            return;
        }
        C5929l<T> lVar3 = this.f35814b;
        C12773c cVar2 = new C12773c(new C12274e(cVar), this.f36647R, this.f36643N, this.f36644O, this.f36645P, a);
        lVar3.mo24393a((C12297q<? super T>) cVar2);
    }
}
