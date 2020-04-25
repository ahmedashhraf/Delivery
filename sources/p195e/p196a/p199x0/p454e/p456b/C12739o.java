package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p464h.C13724m;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p443f1.C12271b;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.o */
/* compiled from: FlowableBufferBoundarySupplier */
public final class C12739o<T, U extends Collection<? super T>, B> extends C12511a<T, U> {

    /* renamed from: N */
    final Callable<? extends C6007b<B>> f36553N;

    /* renamed from: O */
    final Callable<U> f36554O;

    /* renamed from: e.a.x0.e.b.o$a */
    /* compiled from: FlowableBufferBoundarySupplier */
    static final class C12740a<T, U extends Collection<? super T>, B> extends C12271b<B> {

        /* renamed from: N */
        boolean f36555N;

        /* renamed from: b */
        final C12741b<T, U, B> f36556b;

        C12740a(C12741b<T, U, B> bVar) {
            this.f36556b = bVar;
        }

        /* renamed from: a */
        public void mo41789a(B b) {
            if (!this.f36555N) {
                this.f36555N = true;
                mo41997b();
                this.f36556b.mo42401i();
            }
        }

        public void onComplete() {
            if (!this.f36555N) {
                this.f36555N = true;
                this.f36556b.mo42401i();
            }
        }

        public void onError(Throwable th) {
            if (this.f36555N) {
                C12205a.m54894b(th);
                return;
            }
            this.f36555N = true;
            this.f36556b.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.b.o$b */
    /* compiled from: FlowableBufferBoundarySupplier */
    static final class C12741b<T, U extends Collection<? super T>, B> extends C13724m<T, U, U> implements C12297q<T>, C14063d, C12314c {

        /* renamed from: L0 */
        final Callable<U> f36557L0;

        /* renamed from: M0 */
        final Callable<? extends C6007b<B>> f36558M0;

        /* renamed from: N0 */
        C14063d f36559N0;

        /* renamed from: O0 */
        final AtomicReference<C12314c> f36560O0 = new AtomicReference<>();

        /* renamed from: P0 */
        U f36561P0;

        C12741b(C14062c<? super U> cVar, Callable<U> callable, Callable<? extends C6007b<B>> callable2) {
            super(cVar, new C13660a());
            this.f36557L0 = callable;
            this.f36558M0 = callable2;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            if (!this.f39707I0) {
                this.f39707I0 = true;
                this.f36559N0.cancel();
                mo42400h();
                if (mo43109b()) {
                    this.f39706H0.clear();
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36560O0.get() == C12347d.DISPOSED;
        }

        public void dispose() {
            this.f36559N0.cancel();
            mo42400h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42400h() {
            C12347d.m55465a(this.f36560O0);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            r1.mo24397a(r2);
            mo43106a(r3, false, r4);
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42401i() {
            /*
                r4 = this;
                java.util.concurrent.Callable<U> r0 = r4.f36557L0     // Catch:{ all -> 0x0051 }
                java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0051 }
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r0, r1)     // Catch:{ all -> 0x0051 }
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0051 }
                java.util.concurrent.Callable<? extends i.e.b<B>> r1 = r4.f36558M0     // Catch:{ all -> 0x003f }
                java.lang.Object r1 = r1.call()     // Catch:{ all -> 0x003f }
                java.lang.String r2 = "The boundary publisher supplied is null"
                java.lang.Object r1 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r1, r2)     // Catch:{ all -> 0x003f }
                i.e.b r1 = (p205i.p211e.C6007b) r1     // Catch:{ all -> 0x003f }
                e.a.x0.e.b.o$a r2 = new e.a.x0.e.b.o$a
                r2.<init>(r4)
                java.util.concurrent.atomic.AtomicReference<e.a.u0.c> r3 = r4.f36560O0
                boolean r3 = p195e.p196a.p199x0.p450a.C12347d.m55466a(r3, r2)
                if (r3 == 0) goto L_0x003e
                monitor-enter(r4)
                U r3 = r4.f36561P0     // Catch:{ all -> 0x003b }
                if (r3 != 0) goto L_0x0030
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                return
            L_0x0030:
                r4.f36561P0 = r0     // Catch:{ all -> 0x003b }
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                r1.mo24397a(r2)
                r0 = 0
                r4.mo43106a(r3, r0, r4)
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
                r4.f39707I0 = r1
                i.e.d r1 = r4.f36559N0
                r1.cancel()
                i.e.c<? super V> r1 = r4.f39705G0
                r1.onError(r0)
                return
            L_0x0051:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r4.cancel()
                i.e.c<? super V> r1 = r4.f39705G0
                r1.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12739o.C12741b.mo42401i():void");
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.v.a(e.a.x0.c.n, i.e.c, boolean, e.a.u0.c, e.a.x0.j.u):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            p195e.p196a.p199x0.p200j.C13769v.m58782a((p195e.p196a.p199x0.p452c.C12405n) r3.f39706H0, (p205i.p211e.C14062c) r3.f39705G0, false, (p195e.p196a.p447u0.C12314c) r3, (p195e.p196a.p199x0.p200j.C13768u) r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.f39706H0.offer(r0);
            r3.f39708J0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo43109b() == false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.f36561P0     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f36561P0 = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                e.a.x0.c.n<U> r1 = r3.f39706H0
                r1.offer(r0)
                r0 = 1
                r3.f39708J0 = r0
                boolean r0 = r3.mo43109b()
                if (r0 == 0) goto L_0x0021
                e.a.x0.c.n<U> r0 = r3.f39706H0
                i.e.c<? super V> r1 = r3.f39705G0
                r2 = 0
                p195e.p196a.p199x0.p200j.C13769v.m58782a(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12739o.C12741b.onComplete():void");
        }

        public void onError(Throwable th) {
            cancel();
            this.f39705G0.onError(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36559N0, dVar)) {
                this.f36559N0 = dVar;
                C14062c<? super V> cVar = this.f39705G0;
                try {
                    this.f36561P0 = (Collection) C12390b.m55563a(this.f36557L0.call(), "The buffer supplied is null");
                    try {
                        C6007b bVar = (C6007b) C12390b.m55563a(this.f36558M0.call(), "The boundary publisher supplied is null");
                        C12740a aVar = new C12740a(this);
                        this.f36560O0.set(aVar);
                        cVar.mo41788a((C14063d) this);
                        if (!this.f39707I0) {
                            dVar.mo41813c(Long.MAX_VALUE);
                            bVar.mo24397a(aVar);
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f39707I0 = true;
                        dVar.cancel();
                        C13739g.m58655a(th, cVar);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f39707I0 = true;
                    dVar.cancel();
                    C13739g.m58655a(th2, cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            synchronized (this) {
                U u = this.f36561P0;
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

    public C12739o(C5929l<T> lVar, Callable<? extends C6007b<B>> callable, Callable<U> callable2) {
        super(lVar);
        this.f36553N = callable;
        this.f36554O = callable2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12741b<Object>(new C12274e(cVar), this.f36554O, this.f36553N));
    }
}
