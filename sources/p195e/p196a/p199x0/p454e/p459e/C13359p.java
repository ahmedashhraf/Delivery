package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12429v;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.p */
/* compiled from: ObservableBufferExactBoundary */
public final class C13359p<T, U extends Collection<? super T>, B> extends C13131a<T, U> {

    /* renamed from: N */
    final Callable<U> f38603N;

    /* renamed from: b */
    final C5926g0<B> f38604b;

    /* renamed from: e.a.x0.e.e.p$a */
    /* compiled from: ObservableBufferExactBoundary */
    static final class C13360a<T, U extends Collection<? super T>, B> extends C13787e<B> {

        /* renamed from: b */
        final C13361b<T, U, B> f38605b;

        C13360a(C13361b<T, U, B> bVar) {
            this.f38605b = bVar;
        }

        /* renamed from: a */
        public void mo33453a(B b) {
            this.f38605b.mo42833g();
        }

        public void onComplete() {
            this.f38605b.onComplete();
        }

        public void onError(Throwable th) {
            this.f38605b.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.e.p$b */
    /* compiled from: ObservableBufferExactBoundary */
    static final class C13361b<T, U extends Collection<? super T>, B> extends C12429v<T, U, U> implements C12280i0<T>, C12314c {

        /* renamed from: v0 */
        final Callable<U> f38606v0;

        /* renamed from: w0 */
        final C5926g0<B> f38607w0;

        /* renamed from: x0 */
        C12314c f38608x0;

        /* renamed from: y0 */
        C12314c f38609y0;

        /* renamed from: z0 */
        U f38610z0;

        C13361b(C12280i0<? super U> i0Var, Callable<U> callable, C5926g0<B> g0Var) {
            super(i0Var, new C13660a());
            this.f38606v0 = callable;
            this.f38607w0 = g0Var;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35602s0;
        }

        public void dispose() {
            if (!this.f35602s0) {
                this.f35602s0 = true;
                this.f38609y0.dispose();
                this.f38608x0.dispose();
                if (mo42188b()) {
                    this.f35601r0.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42833g() {
            try {
                U u = (Collection) C12390b.m55563a(this.f38606v0.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.f38610z0;
                    if (u2 != null) {
                        this.f38610z0 = u;
                        mo42185a(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dispose();
                this.f35600q0.onError(th);
            }
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
                U r0 = r3.f38610z0     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f38610z0 = r1     // Catch:{ all -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13359p.C13361b.onComplete():void");
        }

        public void onError(Throwable th) {
            dispose();
            this.f35600q0.onError(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38608x0, cVar)) {
                this.f38608x0 = cVar;
                try {
                    this.f38610z0 = (Collection) C12390b.m55563a(this.f38606v0.call(), "The buffer supplied is null");
                    C13360a aVar = new C13360a(this);
                    this.f38609y0 = aVar;
                    this.f35600q0.mo34123a((C12314c) this);
                    if (!this.f35602s0) {
                        this.f38607w0.mo23893a(aVar);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f35602s0 = true;
                    cVar.dispose();
                    C12348e.m55476a(th, this.f35600q0);
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            synchronized (this) {
                U u = this.f38610z0;
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

    public C13359p(C5926g0<T> g0Var, C5926g0<B> g0Var2, Callable<U> callable) {
        super(g0Var);
        this.f38604b = g0Var2;
        this.f38603N = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        this.f37851a.mo23893a(new C13361b(new C13795m(i0Var), this.f38603N, this.f38604b));
    }
}
