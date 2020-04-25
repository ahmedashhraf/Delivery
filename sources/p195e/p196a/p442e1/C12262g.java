package p195e.p196a.p442e1;

import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13743a.C13744a;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.g */
/* compiled from: SerializedSubject */
final class C12262g<T> extends C12265i<T> implements C13744a<Object> {

    /* renamed from: N */
    C13743a<Object> f35426N;

    /* renamed from: O */
    volatile boolean f35427O;

    /* renamed from: a */
    final C12265i<T> f35428a;

    /* renamed from: b */
    boolean f35429b;

    C12262g(C12265i<T> iVar) {
        this.f35428a = iVar;
    }

    @C5938g
    /* renamed from: P */
    public Throwable mo41897P() {
        return this.f35428a.mo41897P();
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return this.f35428a.mo41898Q();
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return this.f35428a.mo41899R();
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return this.f35428a.mo41900S();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo41973U() {
        C13743a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f35426N;
                if (aVar == null) {
                    this.f35429b = false;
                    return;
                }
                this.f35426N = null;
            }
            aVar.mo43134a((C13744a<? super T>) this);
        }
        while (true) {
        }
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        boolean z = true;
        if (!this.f35427O) {
            synchronized (this) {
                if (!this.f35427O) {
                    if (this.f35429b) {
                        C13743a<Object> aVar = this.f35426N;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35426N = aVar;
                        }
                        aVar.mo43135a(C13761q.m58741a(cVar));
                        return;
                    }
                    this.f35429b = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.dispose();
        } else {
            this.f35428a.mo34123a(cVar);
            mo41973U();
        }
    }

    /* renamed from: b */
    public boolean mo41812b(Object obj) {
        return C13761q.m58747b(obj, (C12280i0<? super T>) this.f35428a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f35428a.mo23893a(i0Var);
    }

    public void onComplete() {
        if (!this.f35427O) {
            synchronized (this) {
                if (!this.f35427O) {
                    this.f35427O = true;
                    if (this.f35429b) {
                        C13743a<Object> aVar = this.f35426N;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35426N = aVar;
                        }
                        aVar.mo43135a(C13761q.m58750d());
                        return;
                    }
                    this.f35429b = true;
                    this.f35428a.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p195e.p196a.p439b1.C12205a.m54894b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f35428a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f35427O
            if (r0 == 0) goto L_0x0008
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f35427O     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f35427O = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f35429b     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            e.a.x0.j.a<java.lang.Object> r0 = r2.f35426N     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            e.a.x0.j.a r0 = new e.a.x0.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f35426N = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p195e.p196a.p199x0.p200j.C13761q.m58743a(r3)     // Catch:{ all -> 0x003b }
            r0.mo43139b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f35429b = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0035:
            e.a.e1.i<T> r0 = r2.f35428a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p442e1.C12262g.onError(java.lang.Throwable):void");
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        if (!this.f35427O) {
            synchronized (this) {
                if (!this.f35427O) {
                    if (this.f35429b) {
                        C13743a<Object> aVar = this.f35426N;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35426N = aVar;
                        }
                        aVar.mo43135a(C13761q.m58756i(t));
                        return;
                    }
                    this.f35429b = true;
                    this.f35428a.mo33453a(t);
                    mo41973U();
                }
            }
        }
    }
}
