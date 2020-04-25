package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13765r;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12429v;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.q */
/* compiled from: ObservableBufferTimed */
public final class C13369q<T, U extends Collection<? super T>> extends C13131a<T, U> {

    /* renamed from: N */
    final long f38627N;

    /* renamed from: O */
    final TimeUnit f38628O;

    /* renamed from: P */
    final C12282j0 f38629P;

    /* renamed from: Q */
    final Callable<U> f38630Q;

    /* renamed from: R */
    final int f38631R;

    /* renamed from: S */
    final boolean f38632S;

    /* renamed from: b */
    final long f38633b;

    /* renamed from: e.a.x0.e.e.q$a */
    /* compiled from: ObservableBufferTimed */
    static final class C13370a<T, U extends Collection<? super T>> extends C12429v<T, U, U> implements Runnable, C12314c {

        /* renamed from: A0 */
        final C12285c f38634A0;

        /* renamed from: B0 */
        U f38635B0;

        /* renamed from: C0 */
        C12314c f38636C0;

        /* renamed from: D0 */
        C12314c f38637D0;

        /* renamed from: E0 */
        long f38638E0;

        /* renamed from: F0 */
        long f38639F0;

        /* renamed from: v0 */
        final Callable<U> f38640v0;

        /* renamed from: w0 */
        final long f38641w0;

        /* renamed from: x0 */
        final TimeUnit f38642x0;

        /* renamed from: y0 */
        final int f38643y0;

        /* renamed from: z0 */
        final boolean f38644z0;

        C13370a(C12280i0<? super U> i0Var, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C12285c cVar) {
            super(i0Var, new C13660a());
            this.f38640v0 = callable;
            this.f38641w0 = j;
            this.f38642x0 = timeUnit;
            this.f38643y0 = i;
            this.f38644z0 = z;
            this.f38634A0 = cVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            if (!this.f35602s0) {
                this.f35602s0 = true;
                this.f38637D0.dispose();
                this.f38634A0.dispose();
                synchronized (this) {
                    this.f38635B0 = null;
                }
            }
        }

        public void onComplete() {
            U u;
            this.f38634A0.dispose();
            synchronized (this) {
                u = this.f38635B0;
                this.f38635B0 = null;
            }
            this.f35601r0.offer(u);
            this.f35603t0 = true;
            if (mo42188b()) {
                C13769v.m58781a(this.f35601r0, this.f35600q0, false, (C12314c) this, (C13765r<T, U>) this);
            }
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f38635B0 = null;
            }
            this.f35600q0.onError(th);
            this.f38634A0.dispose();
        }

        public void run() {
            try {
                U u = (Collection) C12390b.m55563a(this.f38640v0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.f38635B0;
                    if (u2 != null) {
                        if (this.f38638E0 == this.f38639F0) {
                            this.f38635B0 = u;
                            mo42187b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dispose();
                this.f35600q0.onError(th);
            }
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38637D0, cVar)) {
                this.f38637D0 = cVar;
                try {
                    this.f38635B0 = (Collection) C12390b.m55563a(this.f38640v0.call(), "The buffer supplied is null");
                    this.f35600q0.mo34123a((C12314c) this);
                    C12285c cVar2 = this.f38634A0;
                    long j = this.f38641w0;
                    this.f38636C0 = cVar2.mo42028a(this, j, j, this.f38642x0);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cVar.dispose();
                    C12348e.m55476a(th, this.f35600q0);
                    this.f38634A0.dispose();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f38644z0 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f38636C0.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo42187b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) p195e.p196a.p199x0.p451b.C12390b.m55563a(r7.f38640v0.call(), "The buffer supplied is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f38635B0 = r8;
            r7.f38639F0++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r7.f38644z0 == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r0 = r7.f38634A0;
            r4 = r7.f38641w0;
            r7.f38636C0 = r0.mo42028a(r7, r4, r4, r7.f38642x0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
            p212io.reactivex.exceptions.C14398a.m62357b(r8);
            r7.f35600q0.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33453a(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f38635B0     // Catch:{ all -> 0x0066 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0066 }
                int r8 = r0.size()     // Catch:{ all -> 0x0066 }
                int r1 = r7.f38643y0     // Catch:{ all -> 0x0066 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0014:
                r8 = 0
                r7.f38635B0 = r8     // Catch:{ all -> 0x0066 }
                long r1 = r7.f38638E0     // Catch:{ all -> 0x0066 }
                r3 = 1
                long r1 = r1 + r3
                r7.f38638E0 = r1     // Catch:{ all -> 0x0066 }
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                boolean r8 = r7.f38644z0
                if (r8 == 0) goto L_0x0028
                e.a.u0.c r8 = r7.f38636C0
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo42187b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f38640v0     // Catch:{ all -> 0x0059 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0059 }
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r8, r0)     // Catch:{ all -> 0x0059 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0059 }
                monitor-enter(r7)
                r7.f38635B0 = r8     // Catch:{ all -> 0x0056 }
                long r0 = r7.f38639F0     // Catch:{ all -> 0x0056 }
                long r0 = r0 + r3
                r7.f38639F0 = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                boolean r8 = r7.f38644z0
                if (r8 == 0) goto L_0x0055
                e.a.j0$c r0 = r7.f38634A0
                long r4 = r7.f38641w0
                java.util.concurrent.TimeUnit r6 = r7.f38642x0
                r1 = r7
                r2 = r4
                e.a.u0.c r8 = r0.mo42028a(r1, r2, r4, r6)
                r7.f38636C0 = r8
            L_0x0055:
                return
            L_0x0056:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                throw r8
            L_0x0059:
                r8 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r8)
                e.a.i0<? super V> r0 = r7.f35600q0
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0066:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13369q.C13370a.mo33453a(java.lang.Object):void");
        }

        /* renamed from: a */
        public void mo42184a(C12280i0<? super U> i0Var, U u) {
            i0Var.mo33453a(u);
        }
    }

    /* renamed from: e.a.x0.e.e.q$b */
    /* compiled from: ObservableBufferTimed */
    static final class C13371b<T, U extends Collection<? super T>> extends C12429v<T, U, U> implements Runnable, C12314c {

        /* renamed from: A0 */
        U f38645A0;

        /* renamed from: B0 */
        final AtomicReference<C12314c> f38646B0 = new AtomicReference<>();

        /* renamed from: v0 */
        final Callable<U> f38647v0;

        /* renamed from: w0 */
        final long f38648w0;

        /* renamed from: x0 */
        final TimeUnit f38649x0;

        /* renamed from: y0 */
        final C12282j0 f38650y0;

        /* renamed from: z0 */
        C12314c f38651z0;

        C13371b(C12280i0<? super U> i0Var, Callable<U> callable, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            super(i0Var, new C13660a());
            this.f38647v0 = callable;
            this.f38648w0 = j;
            this.f38649x0 = timeUnit;
            this.f38650y0 = j0Var;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38646B0.get() == C12347d.DISPOSED;
        }

        public void dispose() {
            C12347d.m55465a(this.f38646B0);
            this.f38651z0.dispose();
        }

        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f38645A0;
                this.f38645A0 = null;
            }
            if (u != null) {
                this.f35601r0.offer(u);
                this.f35603t0 = true;
                if (mo42188b()) {
                    C13769v.m58781a(this.f35601r0, this.f35600q0, false, (C12314c) null, (C13765r<T, U>) this);
                }
            }
            C12347d.m55465a(this.f38646B0);
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f38645A0 = null;
            }
            this.f35600q0.onError(th);
            C12347d.m55465a(this.f38646B0);
        }

        public void run() {
            U u;
            try {
                U u2 = (Collection) C12390b.m55563a(this.f38647v0.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.f38645A0;
                    if (u != null) {
                        this.f38645A0 = u2;
                    }
                }
                if (u == null) {
                    C12347d.m55465a(this.f38646B0);
                } else {
                    mo42185a(u, false, this);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35600q0.onError(th);
                dispose();
            }
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38651z0, cVar)) {
                this.f38651z0 = cVar;
                try {
                    this.f38645A0 = (Collection) C12390b.m55563a(this.f38647v0.call(), "The buffer supplied is null");
                    this.f35600q0.mo34123a((C12314c) this);
                    if (!this.f35602s0) {
                        C12282j0 j0Var = this.f38650y0;
                        long j = this.f38648w0;
                        C12314c a = j0Var.mo42022a(this, j, j, this.f38649x0);
                        if (!this.f38646B0.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    dispose();
                    C12348e.m55476a(th, this.f35600q0);
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            synchronized (this) {
                U u = this.f38645A0;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        /* renamed from: a */
        public void mo42184a(C12280i0<? super U> i0Var, U u) {
            this.f35600q0.mo33453a(u);
        }
    }

    /* renamed from: e.a.x0.e.e.q$c */
    /* compiled from: ObservableBufferTimed */
    static final class C13372c<T, U extends Collection<? super T>> extends C12429v<T, U, U> implements Runnable, C12314c {

        /* renamed from: A0 */
        final List<U> f38652A0 = new LinkedList();

        /* renamed from: B0 */
        C12314c f38653B0;

        /* renamed from: v0 */
        final Callable<U> f38654v0;

        /* renamed from: w0 */
        final long f38655w0;

        /* renamed from: x0 */
        final long f38656x0;

        /* renamed from: y0 */
        final TimeUnit f38657y0;

        /* renamed from: z0 */
        final C12285c f38658z0;

        /* renamed from: e.a.x0.e.e.q$c$a */
        /* compiled from: ObservableBufferTimed */
        final class C13373a implements Runnable {

            /* renamed from: a */
            private final U f38659a;

            C13373a(U u) {
                this.f38659a = u;
            }

            public void run() {
                synchronized (C13372c.this) {
                    C13372c.this.f38652A0.remove(this.f38659a);
                }
                C13372c cVar = C13372c.this;
                cVar.mo42187b(this.f38659a, false, cVar.f38658z0);
            }
        }

        /* renamed from: e.a.x0.e.e.q$c$b */
        /* compiled from: ObservableBufferTimed */
        final class C13374b implements Runnable {

            /* renamed from: a */
            private final U f38661a;

            C13374b(U u) {
                this.f38661a = u;
            }

            public void run() {
                synchronized (C13372c.this) {
                    C13372c.this.f38652A0.remove(this.f38661a);
                }
                C13372c cVar = C13372c.this;
                cVar.mo42187b(this.f38661a, false, cVar.f38658z0);
            }
        }

        C13372c(C12280i0<? super U> i0Var, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C12285c cVar) {
            super(i0Var, new C13660a());
            this.f38654v0 = callable;
            this.f38655w0 = j;
            this.f38656x0 = j2;
            this.f38657y0 = timeUnit;
            this.f38658z0 = cVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            if (!this.f35602s0) {
                this.f35602s0 = true;
                mo42843g();
                this.f38653B0.dispose();
                this.f38658z0.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42843g() {
            synchronized (this) {
                this.f38652A0.clear();
            }
        }

        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f38652A0);
                this.f38652A0.clear();
            }
            for (Collection offer : arrayList) {
                this.f35601r0.offer(offer);
            }
            this.f35603t0 = true;
            if (mo42188b()) {
                C13769v.m58781a(this.f35601r0, this.f35600q0, false, (C12314c) this.f38658z0, (C13765r<T, U>) this);
            }
        }

        public void onError(Throwable th) {
            this.f35603t0 = true;
            mo42843g();
            this.f35600q0.onError(th);
            this.f38658z0.dispose();
        }

        public void run() {
            if (!this.f35602s0) {
                try {
                    Collection collection = (Collection) C12390b.m55563a(this.f38654v0.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.f35602s0) {
                            this.f38652A0.add(collection);
                            this.f38658z0.mo41877a(new C13373a(collection), this.f38655w0, this.f38657y0);
                        }
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f35600q0.onError(th);
                    dispose();
                }
            }
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38653B0, cVar)) {
                this.f38653B0 = cVar;
                try {
                    Collection collection = (Collection) C12390b.m55563a(this.f38654v0.call(), "The buffer supplied is null");
                    this.f38652A0.add(collection);
                    this.f35600q0.mo34123a((C12314c) this);
                    C12285c cVar2 = this.f38658z0;
                    long j = this.f38656x0;
                    cVar2.mo42028a(this, j, j, this.f38657y0);
                    this.f38658z0.mo41877a(new C13374b(collection), this.f38655w0, this.f38657y0);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cVar.dispose();
                    C12348e.m55476a(th, this.f35600q0);
                    this.f38658z0.dispose();
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            synchronized (this) {
                for (U add : this.f38652A0) {
                    add.add(t);
                }
            }
        }

        /* renamed from: a */
        public void mo42184a(C12280i0<? super U> i0Var, U u) {
            i0Var.mo33453a(u);
        }
    }

    public C13369q(C5926g0<T> g0Var, long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, Callable<U> callable, int i, boolean z) {
        super(g0Var);
        this.f38633b = j;
        this.f38627N = j2;
        this.f38628O = timeUnit;
        this.f38629P = j0Var;
        this.f38630Q = callable;
        this.f38631R = i;
        this.f38632S = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        if (this.f38633b == this.f38627N && this.f38631R == Integer.MAX_VALUE) {
            C5926g0<T> g0Var = this.f37851a;
            C13371b bVar = new C13371b(new C13795m(i0Var), this.f38630Q, this.f38633b, this.f38628O, this.f38629P);
            g0Var.mo23893a(bVar);
            return;
        }
        C12285c a = this.f38629P.mo41871a();
        if (this.f38633b == this.f38627N) {
            C5926g0<T> g0Var2 = this.f37851a;
            C13370a aVar = new C13370a(new C13795m(i0Var), this.f38630Q, this.f38633b, this.f38628O, this.f38631R, this.f38632S, a);
            g0Var2.mo23893a(aVar);
            return;
        }
        C5926g0<T> g0Var3 = this.f37851a;
        C13372c cVar = new C13372c(new C13795m(i0Var), this.f38630Q, this.f38633b, this.f38627N, this.f38628O, a);
        g0Var3.mo23893a(cVar);
    }
}
