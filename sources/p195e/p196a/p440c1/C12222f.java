package p195e.p196a.p440c1;

import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13761q;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.c1.f */
/* compiled from: SerializedProcessor */
final class C12222f<T> extends C12211c<T> {

    /* renamed from: N */
    boolean f35315N;

    /* renamed from: O */
    C13743a<Object> f35316O;

    /* renamed from: P */
    volatile boolean f35317P;

    /* renamed from: b */
    final C12211c<T> f35318b;

    C12222f(C12211c<T> cVar) {
        this.f35318b = cVar;
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        return this.f35318b.mo41783U();
    }

    /* renamed from: V */
    public boolean mo41784V() {
        return this.f35318b.mo41784V();
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return this.f35318b.mo41785W();
    }

    /* renamed from: X */
    public boolean mo41786X() {
        return this.f35318b.mo41786X();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo41849Z() {
        C13743a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f35316O;
                if (aVar == null) {
                    this.f35315N = false;
                    return;
                }
                this.f35316O = null;
            }
            aVar.mo43138a((C14062c<? super U>) this.f35318b);
        }
        while (true) {
        }
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        boolean z = true;
        if (!this.f35317P) {
            synchronized (this) {
                if (!this.f35317P) {
                    if (this.f35315N) {
                        C13743a<Object> aVar = this.f35316O;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35316O = aVar;
                        }
                        aVar.mo43135a(C13761q.m58742a(dVar));
                        return;
                    }
                    this.f35315N = true;
                    z = false;
                }
            }
        }
        if (z) {
            dVar.cancel();
        } else {
            this.f35318b.mo41788a(dVar);
            mo41849Z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35318b.mo24397a(cVar);
    }

    public void onComplete() {
        if (!this.f35317P) {
            synchronized (this) {
                if (!this.f35317P) {
                    this.f35317P = true;
                    if (this.f35315N) {
                        C13743a<Object> aVar = this.f35316O;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35316O = aVar;
                        }
                        aVar.mo43135a(C13761q.m58750d());
                        return;
                    }
                    this.f35315N = true;
                    this.f35318b.onComplete();
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
        r2.f35318b.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f35317P
            if (r0 == 0) goto L_0x0008
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f35317P     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f35317P = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f35315N     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            e.a.x0.j.a<java.lang.Object> r0 = r2.f35316O     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            e.a.x0.j.a r0 = new e.a.x0.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f35316O = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p195e.p196a.p199x0.p200j.C13761q.m58743a(r3)     // Catch:{ all -> 0x003b }
            r0.mo43139b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f35315N = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0035:
            e.a.c1.c<T> r0 = r2.f35318b
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p440c1.C12222f.onError(java.lang.Throwable):void");
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!this.f35317P) {
            synchronized (this) {
                if (!this.f35317P) {
                    if (this.f35315N) {
                        C13743a<Object> aVar = this.f35316O;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35316O = aVar;
                        }
                        aVar.mo43135a(C13761q.m58756i(t));
                        return;
                    }
                    this.f35315N = true;
                    this.f35318b.mo41789a(t);
                    mo41849Z();
                }
            }
        }
    }
}
