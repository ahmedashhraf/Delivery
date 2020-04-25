package p195e.p196a.p467z0;

import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.m */
/* compiled from: SerializedObserver */
public final class C13795m<T> implements C12280i0<T>, C12314c {

    /* renamed from: R */
    static final int f39848R = 4;

    /* renamed from: N */
    C12314c f39849N;

    /* renamed from: O */
    boolean f39850O;

    /* renamed from: P */
    C13743a<Object> f39851P;

    /* renamed from: Q */
    volatile boolean f39852Q;

    /* renamed from: a */
    final C12280i0<? super T> f39853a;

    /* renamed from: b */
    final boolean f39854b;

    public C13795m(@C5937f C12280i0<? super T> i0Var) {
        this(i0Var, false);
    }

    /* renamed from: a */
    public void mo34123a(@C5937f C12314c cVar) {
        if (C12347d.m55464a(this.f39849N, cVar)) {
            this.f39849N = cVar;
            this.f39853a.mo34123a((C12314c) this);
        }
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39849N.mo41878d();
    }

    public void dispose() {
        this.f39849N.dispose();
    }

    public void onComplete() {
        if (!this.f39852Q) {
            synchronized (this) {
                if (!this.f39852Q) {
                    if (this.f39850O) {
                        C13743a<Object> aVar = this.f39851P;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f39851P = aVar;
                        }
                        aVar.mo43135a(C13761q.m58750d());
                        return;
                    }
                    this.f39852Q = true;
                    this.f39850O = true;
                    this.f39853a.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p195e.p196a.p439b1.C12205a.m54894b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f39853a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(@p195e.p196a.p198t0.C5937f java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f39852Q
            if (r0 == 0) goto L_0x0008
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f39852Q     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f39850O     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f39852Q = r1     // Catch:{ all -> 0x0044 }
            e.a.x0.j.a<java.lang.Object> r0 = r2.f39851P     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            e.a.x0.j.a r0 = new e.a.x0.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f39851P = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p195e.p196a.p199x0.p200j.C13761q.m58743a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f39854b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo43135a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo43139b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f39852Q = r1     // Catch:{ all -> 0x0044 }
            r2.f39850O = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x003e:
            e.a.i0<? super T> r0 = r2.f39853a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p467z0.C13795m.onError(java.lang.Throwable):void");
    }

    public C13795m(@C5937f C12280i0<? super T> i0Var, boolean z) {
        this.f39853a = i0Var;
        this.f39854b = z;
    }

    /* renamed from: a */
    public void mo33453a(@C5937f T t) {
        if (!this.f39852Q) {
            if (t == null) {
                this.f39849N.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f39852Q) {
                    if (this.f39850O) {
                        C13743a<Object> aVar = this.f39851P;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f39851P = aVar;
                        }
                        aVar.mo43135a(C13761q.m58756i(t));
                        return;
                    }
                    this.f39850O = true;
                    this.f39853a.mo33453a(t);
                    mo43264a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43264a() {
        C13743a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f39851P;
                if (aVar == null) {
                    this.f39850O = false;
                    return;
                }
                this.f39851P = null;
            }
        } while (!aVar.mo43137a(this.f39853a));
    }
}
