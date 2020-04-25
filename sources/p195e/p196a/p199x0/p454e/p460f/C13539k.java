package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C12201a;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.f.k */
/* compiled from: ParallelMapTry */
public final class C13539k<T, R> extends C5922b<R> {

    /* renamed from: a */
    final C5922b<T> f39218a;

    /* renamed from: b */
    final C12339o<? super T, ? extends R> f39219b;

    /* renamed from: c */
    final C12327c<? super Long, ? super Throwable, C12201a> f39220c;

    /* renamed from: e.a.x0.e.f.k$a */
    /* compiled from: ParallelMapTry */
    static /* synthetic */ class C13540a {

        /* renamed from: a */
        static final /* synthetic */ int[] f39221a = new int[C12201a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                e.a.a1.a[] r0 = p195e.p196a.p197a1.C12201a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39221a = r0
                int[] r0 = f39221a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.RETRY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f39221a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.SKIP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f39221a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.STOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13539k.C13540a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.f.k$b */
    /* compiled from: ParallelMapTry */
    static final class C13541b<T, R> implements C12392a<T>, C14063d {

        /* renamed from: N */
        final C12327c<? super Long, ? super Throwable, C12201a> f39222N;

        /* renamed from: O */
        C14063d f39223O;

        /* renamed from: P */
        boolean f39224P;

        /* renamed from: a */
        final C12392a<? super R> f39225a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f39226b;

        C13541b(C12392a<? super R> aVar, C12339o<? super T, ? extends R> oVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
            this.f39225a = aVar;
            this.f39226b = oVar;
            this.f39222N = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39223O, dVar)) {
                this.f39223O = dVar;
                this.f39225a.mo41788a(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39224P
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 0
            L_0x0008:
                e.a.w0.o<? super T, ? extends R> r0 = r9.f39226b     // Catch:{ all -> 0x001b }
                java.lang.Object r0 = r0.apply(r10)     // Catch:{ all -> 0x001b }
                java.lang.String r4 = "The mapper returned a null value"
                java.lang.Object r10 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r0, r4)     // Catch:{ all -> 0x001b }
                e.a.x0.c.a<? super R> r0 = r9.f39225a
                boolean r10 = r0.mo42138b(r10)
                return r10
            L_0x001b:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r4 = 1
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39222N     // Catch:{ all -> 0x0053 }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0053 }
                java.lang.Object r6 = r6.mo35569a(r7, r0)     // Catch:{ all -> 0x0053 }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x0053 }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x0053 }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13539k.C13540a.f39221a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r4) goto L_0x0008
                if (r6 == r5) goto L_0x0052
                r10 = 3
                if (r6 == r10) goto L_0x004c
                r9.cancel()
                r9.onError(r0)
                return r1
            L_0x004c:
                r9.cancel()
                r9.onComplete()
            L_0x0052:
                return r1
            L_0x0053:
                r10 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r0
                r3[r4] = r10
                r2.<init>(r3)
                r9.onError(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13539k.C13541b.mo42138b(java.lang.Object):boolean");
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39223O.mo41813c(j);
        }

        public void cancel() {
            this.f39223O.cancel();
        }

        public void onComplete() {
            if (!this.f39224P) {
                this.f39224P = true;
                this.f39225a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39224P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39224P = true;
            this.f39225a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t) && !this.f39224P) {
                this.f39223O.mo41813c(1);
            }
        }
    }

    /* renamed from: e.a.x0.e.f.k$c */
    /* compiled from: ParallelMapTry */
    static final class C13542c<T, R> implements C12392a<T>, C14063d {

        /* renamed from: N */
        final C12327c<? super Long, ? super Throwable, C12201a> f39227N;

        /* renamed from: O */
        C14063d f39228O;

        /* renamed from: P */
        boolean f39229P;

        /* renamed from: a */
        final C14062c<? super R> f39230a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f39231b;

        C13542c(C14062c<? super R> cVar, C12339o<? super T, ? extends R> oVar, C12327c<? super Long, ? super Throwable, C12201a> cVar2) {
            this.f39230a = cVar;
            this.f39231b = oVar;
            this.f39227N = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39228O, dVar)) {
                this.f39228O = dVar;
                this.f39230a.mo41788a((C14063d) this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39229P
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 0
            L_0x0008:
                r0 = 1
                e.a.w0.o<? super T, ? extends R> r4 = r9.f39231b     // Catch:{ all -> 0x001b }
                java.lang.Object r4 = r4.apply(r10)     // Catch:{ all -> 0x001b }
                java.lang.String r5 = "The mapper returned a null value"
                java.lang.Object r10 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r4, r5)     // Catch:{ all -> 0x001b }
                i.e.c<? super R> r1 = r9.f39230a
                r1.mo41789a(r10)
                return r0
            L_0x001b:
                r4 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39227N     // Catch:{ all -> 0x0052 }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0052 }
                java.lang.Object r6 = r6.mo35569a(r7, r4)     // Catch:{ all -> 0x0052 }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x0052 }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x0052 }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13539k.C13540a.f39221a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L_0x0008
                if (r6 == r5) goto L_0x0051
                r10 = 3
                if (r6 == r10) goto L_0x004b
                r9.cancel()
                r9.onError(r4)
                return r1
            L_0x004b:
                r9.cancel()
                r9.onComplete()
            L_0x0051:
                return r1
            L_0x0052:
                r10 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r10
                r2.<init>(r3)
                r9.onError(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13539k.C13542c.mo42138b(java.lang.Object):boolean");
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39228O.mo41813c(j);
        }

        public void cancel() {
            this.f39228O.cancel();
        }

        public void onComplete() {
            if (!this.f39229P) {
                this.f39229P = true;
                this.f39230a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39229P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39229P = true;
            this.f39230a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t) && !this.f39229P) {
                this.f39228O.mo41813c(1);
            }
        }
    }

    public C13539k(C5922b<T> bVar, C12339o<? super T, ? extends R> oVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        this.f39218a = bVar;
        this.f39219b = oVar;
        this.f39220c = cVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super R>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                C12392a aVar = cVarArr[i];
                if (aVar instanceof C12392a) {
                    cVarArr2[i] = new C13541b(aVar, this.f39219b, this.f39220c);
                } else {
                    cVarArr2[i] = new C13542c(aVar, this.f39219b, this.f39220c);
                }
            }
            this.f39218a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39218a.mo23713a();
    }
}
