package p195e.p196a.p443f1;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.f1.e */
/* compiled from: SerializedSubscriber */
public final class C12274e<T> implements C12297q<T>, C14063d {

    /* renamed from: R */
    static final int f35456R = 4;

    /* renamed from: N */
    C14063d f35457N;

    /* renamed from: O */
    boolean f35458O;

    /* renamed from: P */
    C13743a<Object> f35459P;

    /* renamed from: Q */
    volatile boolean f35460Q;

    /* renamed from: a */
    final C14062c<? super T> f35461a;

    /* renamed from: b */
    final boolean f35462b;

    public C12274e(C14062c<? super T> cVar) {
        this(cVar, false);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f35457N, dVar)) {
            this.f35457N = dVar;
            this.f35461a.mo41788a((C14063d) this);
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        this.f35457N.mo41813c(j);
    }

    public void cancel() {
        this.f35457N.cancel();
    }

    public void onComplete() {
        if (!this.f35460Q) {
            synchronized (this) {
                if (!this.f35460Q) {
                    if (this.f35458O) {
                        C13743a<Object> aVar = this.f35459P;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35459P = aVar;
                        }
                        aVar.mo43135a(C13761q.m58750d());
                        return;
                    }
                    this.f35460Q = true;
                    this.f35458O = true;
                    this.f35461a.onComplete();
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
        r2.f35461a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f35460Q
            if (r0 == 0) goto L_0x0008
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f35460Q     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f35458O     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f35460Q = r1     // Catch:{ all -> 0x0044 }
            e.a.x0.j.a<java.lang.Object> r0 = r2.f35459P     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            e.a.x0.j.a r0 = new e.a.x0.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f35459P = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p195e.p196a.p199x0.p200j.C13761q.m58743a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f35462b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo43135a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo43139b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f35460Q = r1     // Catch:{ all -> 0x0044 }
            r2.f35458O = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p195e.p196a.p439b1.C12205a.m54894b(r3)
            return
        L_0x003e:
            i.e.c<? super T> r0 = r2.f35461a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p443f1.C12274e.onError(java.lang.Throwable):void");
    }

    public C12274e(C14062c<? super T> cVar, boolean z) {
        this.f35461a = cVar;
        this.f35462b = z;
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!this.f35460Q) {
            if (t == null) {
                this.f35457N.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f35460Q) {
                    if (this.f35458O) {
                        C13743a<Object> aVar = this.f35459P;
                        if (aVar == null) {
                            aVar = new C13743a<>(4);
                            this.f35459P = aVar;
                        }
                        aVar.mo43135a(C13761q.m58756i(t));
                        return;
                    }
                    this.f35458O = true;
                    this.f35461a.mo41789a(t);
                    mo42004a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42004a() {
        C13743a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f35459P;
                if (aVar == null) {
                    this.f35458O = false;
                    return;
                }
                this.f35459P = null;
            }
        } while (!aVar.mo43138a(this.f35461a));
    }
}
