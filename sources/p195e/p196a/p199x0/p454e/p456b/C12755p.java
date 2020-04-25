package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p199x0.p464h.C13724m;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p443f1.C12271b;
import p195e.p196a.p443f1.C12274e;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.p */
/* compiled from: FlowableBufferExactBoundary */
public final class C12755p<T, U extends Collection<? super T>, B> extends C12511a<T, U> {

    /* renamed from: N */
    final C6007b<B> f36611N;

    /* renamed from: O */
    final Callable<U> f36612O;

    /* renamed from: e.a.x0.e.b.p$a */
    /* compiled from: FlowableBufferExactBoundary */
    static final class C12756a<T, U extends Collection<? super T>, B> extends C12271b<B> {

        /* renamed from: b */
        final C12757b<T, U, B> f36613b;

        C12756a(C12757b<T, U, B> bVar) {
            this.f36613b = bVar;
        }

        /* renamed from: a */
        public void mo41789a(B b) {
            this.f36613b.mo42414h();
        }

        public void onComplete() {
            this.f36613b.onComplete();
        }

        public void onError(Throwable th) {
            this.f36613b.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.b.p$b */
    /* compiled from: FlowableBufferExactBoundary */
    static final class C12757b<T, U extends Collection<? super T>, B> extends C13724m<T, U, U> implements C12297q<T>, C14063d, C12314c {

        /* renamed from: L0 */
        final Callable<U> f36614L0;

        /* renamed from: M0 */
        final C6007b<B> f36615M0;

        /* renamed from: N0 */
        C14063d f36616N0;

        /* renamed from: O0 */
        C12314c f36617O0;

        /* renamed from: P0 */
        U f36618P0;

        C12757b(C14062c<? super U> cVar, Callable<U> callable, C6007b<B> bVar) {
            super(cVar, new C13660a());
            this.f36614L0 = callable;
            this.f36615M0 = bVar;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            mo43107b(j);
        }

        public void cancel() {
            if (!this.f39707I0) {
                this.f39707I0 = true;
                this.f36617O0.dispose();
                this.f36616N0.cancel();
                if (mo43109b()) {
                    this.f39706H0.clear();
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39707I0;
        }

        public void dispose() {
            cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo42414h() {
            try {
                U u = (Collection) C12390b.m55563a(this.f36614L0.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.f36618P0;
                    if (u2 != null) {
                        this.f36618P0 = u;
                        mo43106a(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cancel();
                this.f39705G0.onError(th);
            }
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
                U r0 = r3.f36618P0     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f36618P0 = r1     // Catch:{ all -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12755p.C12757b.onComplete():void");
        }

        public void onError(Throwable th) {
            cancel();
            this.f39705G0.onError(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36616N0, dVar)) {
                this.f36616N0 = dVar;
                try {
                    this.f36618P0 = (Collection) C12390b.m55563a(this.f36614L0.call(), "The buffer supplied is null");
                    C12756a aVar = new C12756a(this);
                    this.f36617O0 = aVar;
                    this.f39705G0.mo41788a((C14063d) this);
                    if (!this.f39707I0) {
                        dVar.mo41813c(Long.MAX_VALUE);
                        this.f36615M0.mo24397a(aVar);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f39707I0 = true;
                    dVar.cancel();
                    C13739g.m58655a(th, this.f39705G0);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            synchronized (this) {
                U u = this.f36618P0;
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

    public C12755p(C5929l<T> lVar, C6007b<B> bVar, Callable<U> callable) {
        super(lVar);
        this.f36611N = bVar;
        this.f36612O = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12757b<Object>(new C12274e(cVar), this.f36612O, this.f36611N));
    }
}
