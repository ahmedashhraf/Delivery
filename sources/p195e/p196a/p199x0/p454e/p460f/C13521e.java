package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C12201a;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.f.e */
/* compiled from: ParallelFilterTry */
public final class C13521e<T> extends C5922b<T> {

    /* renamed from: a */
    final C5922b<T> f39158a;

    /* renamed from: b */
    final C12342r<? super T> f39159b;

    /* renamed from: c */
    final C12327c<? super Long, ? super Throwable, C12201a> f39160c;

    /* renamed from: e.a.x0.e.f.e$a */
    /* compiled from: ParallelFilterTry */
    static /* synthetic */ class C13522a {

        /* renamed from: a */
        static final /* synthetic */ int[] f39161a = new int[C12201a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                e.a.a1.a[] r0 = p195e.p196a.p197a1.C12201a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39161a = r0
                int[] r0 = f39161a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.RETRY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f39161a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.SKIP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f39161a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.STOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13521e.C13522a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.f.e$b */
    /* compiled from: ParallelFilterTry */
    static abstract class C13523b<T> implements C12392a<T>, C14063d {

        /* renamed from: N */
        C14063d f39162N;

        /* renamed from: O */
        boolean f39163O;

        /* renamed from: a */
        final C12342r<? super T> f39164a;

        /* renamed from: b */
        final C12327c<? super Long, ? super Throwable, C12201a> f39165b;

        C13523b(C12342r<? super T> rVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
            this.f39164a = rVar;
            this.f39165b = cVar;
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            if (!mo42138b(t) && !this.f39163O) {
                this.f39162N.mo41813c(1);
            }
        }

        /* renamed from: c */
        public final void mo41813c(long j) {
            this.f39162N.mo41813c(j);
        }

        public final void cancel() {
            this.f39162N.cancel();
        }
    }

    /* renamed from: e.a.x0.e.f.e$c */
    /* compiled from: ParallelFilterTry */
    static final class C13524c<T> extends C13523b<T> {

        /* renamed from: P */
        final C12392a<? super T> f39166P;

        C13524c(C12392a<? super T> aVar, C12342r<? super T> rVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
            super(rVar, cVar);
            this.f39166P = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39162N, dVar)) {
                this.f39162N = dVar;
                this.f39166P.mo41788a(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39163O
                r1 = 0
                if (r0 != 0) goto L_0x0067
                r2 = 0
            L_0x0007:
                r0 = 1
                e.a.w0.r<? super T> r4 = r9.f39164a     // Catch:{ all -> 0x001b }
                boolean r2 = r4.mo41812b(r10)     // Catch:{ all -> 0x001b }
                if (r2 == 0) goto L_0x0019
                e.a.x0.c.a<? super T> r2 = r9.f39166P
                boolean r10 = r2.mo42138b(r10)
                if (r10 == 0) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                return r0
            L_0x001b:
                r4 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39165b     // Catch:{ all -> 0x0052 }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0052 }
                java.lang.Object r6 = r6.mo35569a(r7, r4)     // Catch:{ all -> 0x0052 }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x0052 }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x0052 }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13521e.C13522a.f39161a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L_0x0007
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
            L_0x0067:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13521e.C13524c.mo42138b(java.lang.Object):boolean");
        }

        public void onComplete() {
            if (!this.f39163O) {
                this.f39163O = true;
                this.f39166P.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39163O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39163O = true;
            this.f39166P.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.f.e$d */
    /* compiled from: ParallelFilterTry */
    static final class C13525d<T> extends C13523b<T> {

        /* renamed from: P */
        final C14062c<? super T> f39167P;

        C13525d(C14062c<? super T> cVar, C12342r<? super T> rVar, C12327c<? super Long, ? super Throwable, C12201a> cVar2) {
            super(rVar, cVar2);
            this.f39167P = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39162N, dVar)) {
                this.f39162N = dVar;
                this.f39167P.mo41788a((C14063d) this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39163O
                r1 = 0
                if (r0 != 0) goto L_0x0063
                r2 = 0
            L_0x0007:
                r0 = 1
                e.a.w0.r<? super T> r4 = r9.f39164a     // Catch:{ all -> 0x0017 }
                boolean r2 = r4.mo41812b(r10)     // Catch:{ all -> 0x0017 }
                if (r2 == 0) goto L_0x0016
                i.e.c<? super T> r1 = r9.f39167P
                r1.mo41789a(r10)
                return r0
            L_0x0016:
                return r1
            L_0x0017:
                r4 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39165b     // Catch:{ all -> 0x004e }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004e }
                java.lang.Object r6 = r6.mo35569a(r7, r4)     // Catch:{ all -> 0x004e }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x004e }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x004e }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13521e.C13522a.f39161a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L_0x0007
                if (r6 == r5) goto L_0x004d
                r10 = 3
                if (r6 == r10) goto L_0x0047
                r9.cancel()
                r9.onError(r4)
                return r1
            L_0x0047:
                r9.cancel()
                r9.onComplete()
            L_0x004d:
                return r1
            L_0x004e:
                r10 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r10
                r2.<init>(r3)
                r9.onError(r2)
            L_0x0063:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13521e.C13525d.mo42138b(java.lang.Object):boolean");
        }

        public void onComplete() {
            if (!this.f39163O) {
                this.f39163O = true;
                this.f39167P.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39163O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39163O = true;
            this.f39167P.onError(th);
        }
    }

    public C13521e(C5922b<T> bVar, C12342r<? super T> rVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        this.f39158a = bVar;
        this.f39159b = rVar;
        this.f39160c = cVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                C12392a aVar = cVarArr[i];
                if (aVar instanceof C12392a) {
                    cVarArr2[i] = new C13524c(aVar, this.f39159b, this.f39160c);
                } else {
                    cVarArr2[i] = new C13525d(aVar, this.f39159b, this.f39160c);
                }
            }
            this.f39158a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39158a.mo23713a();
    }
}
