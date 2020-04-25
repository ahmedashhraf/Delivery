package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12429v;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.o */
/* compiled from: ObservableBufferBoundarySupplier */
public final class C13333o<T, U extends Collection<? super T>, B> extends C13131a<T, U> {

    /* renamed from: N */
    final Callable<U> f38547N;

    /* renamed from: b */
    final Callable<? extends C5926g0<B>> f38548b;

    /* renamed from: e.a.x0.e.e.o$a */
    /* compiled from: ObservableBufferBoundarySupplier */
    static final class C13334a<T, U extends Collection<? super T>, B> extends C13787e<B> {

        /* renamed from: N */
        boolean f38549N;

        /* renamed from: b */
        final C13335b<T, U, B> f38550b;

        C13334a(C13335b<T, U, B> bVar) {
            this.f38550b = bVar;
        }

        /* renamed from: a */
        public void mo33453a(B b) {
            if (!this.f38549N) {
                this.f38549N = true;
                dispose();
                this.f38550b.mo42821h();
            }
        }

        public void onComplete() {
            if (!this.f38549N) {
                this.f38549N = true;
                this.f38550b.mo42821h();
            }
        }

        public void onError(Throwable th) {
            if (this.f38549N) {
                C12205a.m54894b(th);
                return;
            }
            this.f38549N = true;
            this.f38550b.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.e.o$b */
    /* compiled from: ObservableBufferBoundarySupplier */
    static final class C13335b<T, U extends Collection<? super T>, B> extends C12429v<T, U, U> implements C12280i0<T>, C12314c {

        /* renamed from: v0 */
        final Callable<U> f38551v0;

        /* renamed from: w0 */
        final Callable<? extends C5926g0<B>> f38552w0;

        /* renamed from: x0 */
        C12314c f38553x0;

        /* renamed from: y0 */
        final AtomicReference<C12314c> f38554y0 = new AtomicReference<>();

        /* renamed from: z0 */
        U f38555z0;

        C13335b(C12280i0<? super U> i0Var, Callable<U> callable, Callable<? extends C5926g0<B>> callable2) {
            super(i0Var, new C13660a());
            this.f38551v0 = callable;
            this.f38552w0 = callable2;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            if (!this.f35602s0) {
                this.f35602s0 = true;
                this.f38553x0.dispose();
                mo42820g();
                if (mo42188b()) {
                    this.f35601r0.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42820g() {
            C12347d.m55465a(this.f38554y0);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            r1.mo23893a(r2);
            mo42185a(r3, false, r4);
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42821h() {
            /*
                r4 = this;
                java.util.concurrent.Callable<U> r0 = r4.f38551v0     // Catch:{ all -> 0x0051 }
                java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0051 }
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r0, r1)     // Catch:{ all -> 0x0051 }
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0051 }
                java.util.concurrent.Callable<? extends e.a.g0<B>> r1 = r4.f38552w0     // Catch:{ all -> 0x003f }
                java.lang.Object r1 = r1.call()     // Catch:{ all -> 0x003f }
                java.lang.String r2 = "The boundary ObservableSource supplied is null"
                java.lang.Object r1 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r1, r2)     // Catch:{ all -> 0x003f }
                e.a.g0 r1 = (p195e.p196a.C5926g0) r1     // Catch:{ all -> 0x003f }
                e.a.x0.e.e.o$a r2 = new e.a.x0.e.e.o$a
                r2.<init>(r4)
                java.util.concurrent.atomic.AtomicReference<e.a.u0.c> r3 = r4.f38554y0
                boolean r3 = p195e.p196a.p199x0.p450a.C12347d.m55466a(r3, r2)
                if (r3 == 0) goto L_0x003e
                monitor-enter(r4)
                U r3 = r4.f38555z0     // Catch:{ all -> 0x003b }
                if (r3 != 0) goto L_0x0030
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                return
            L_0x0030:
                r4.f38555z0 = r0     // Catch:{ all -> 0x003b }
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                r1.mo23893a(r2)
                r0 = 0
                r4.mo42185a(r3, r0, r4)
                goto L_0x003e
            L_0x003b:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                throw r0
            L_0x003e:
                return
            L_0x003f:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r1 = 1
                r4.f35602s0 = r1
                e.a.u0.c r1 = r4.f38553x0
                r1.dispose()
                e.a.i0<? super V> r1 = r4.f35600q0
                r1.onError(r0)
                return
            L_0x0051:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r4.dispose()
                e.a.i0<? super V> r1 = r4.f35600q0
                r1.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13333o.C13335b.mo42821h():void");
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.v.a(e.a.x0.c.n, e.a.i0, boolean, e.a.u0.c, e.a.x0.j.r):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            p195e.p196a.p199x0.p200j.C13769v.m58781a((p195e.p196a.p199x0.p452c.C12405n) r3.f35601r0, (p195e.p196a.C12280i0) r3.f35600q0, false, (p195e.p196a.p447u0.C12314c) r3, (p195e.p196a.p199x0.p200j.C13765r) r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.f35601r0.offer(r0);
            r3.f35603t0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo42188b() == false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.f38555z0     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f38555z0 = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                e.a.x0.c.n<U> r1 = r3.f35601r0
                r1.offer(r0)
                r0 = 1
                r3.f35603t0 = r0
                boolean r0 = r3.mo42188b()
                if (r0 == 0) goto L_0x0021
                e.a.x0.c.n<U> r0 = r3.f35601r0
                e.a.i0<? super V> r1 = r3.f35600q0
                r2 = 0
                p195e.p196a.p199x0.p200j.C13769v.m58781a(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13333o.C13335b.onComplete():void");
        }

        public void onError(Throwable th) {
            dispose();
            this.f35600q0.onError(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38553x0, cVar)) {
                this.f38553x0 = cVar;
                C12280i0<? super V> i0Var = this.f35600q0;
                try {
                    this.f38555z0 = (Collection) C12390b.m55563a(this.f38551v0.call(), "The buffer supplied is null");
                    try {
                        C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38552w0.call(), "The boundary ObservableSource supplied is null");
                        C13334a aVar = new C13334a(this);
                        this.f38554y0.set(aVar);
                        i0Var.mo34123a((C12314c) this);
                        if (!this.f35602s0) {
                            g0Var.mo23893a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f35602s0 = true;
                        cVar.dispose();
                        C12348e.m55476a(th, i0Var);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f35602s0 = true;
                    cVar.dispose();
                    C12348e.m55476a(th2, i0Var);
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            synchronized (this) {
                U u = this.f38555z0;
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

    public C13333o(C5926g0<T> g0Var, Callable<? extends C5926g0<B>> callable, Callable<U> callable2) {
        super(g0Var);
        this.f38548b = callable;
        this.f38547N = callable2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        this.f37851a.mo23893a(new C13335b(new C13795m(i0Var), this.f38547N, this.f38548b));
    }
}
