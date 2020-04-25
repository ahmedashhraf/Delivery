package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C12201a;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.f.c */
/* compiled from: ParallelDoOnNextTry */
public final class C13513c<T> extends C5922b<T> {

    /* renamed from: a */
    final C5922b<T> f39137a;

    /* renamed from: b */
    final C12331g<? super T> f39138b;

    /* renamed from: c */
    final C12327c<? super Long, ? super Throwable, C12201a> f39139c;

    /* renamed from: e.a.x0.e.f.c$a */
    /* compiled from: ParallelDoOnNextTry */
    static /* synthetic */ class C13514a {

        /* renamed from: a */
        static final /* synthetic */ int[] f39140a = new int[C12201a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                e.a.a1.a[] r0 = p195e.p196a.p197a1.C12201a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39140a = r0
                int[] r0 = f39140a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.RETRY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f39140a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.SKIP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f39140a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.a.a1.a r1 = p195e.p196a.p197a1.C12201a.STOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13513c.C13514a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.f.c$b */
    /* compiled from: ParallelDoOnNextTry */
    static final class C13515b<T> implements C12392a<T>, C14063d {

        /* renamed from: N */
        final C12327c<? super Long, ? super Throwable, C12201a> f39141N;

        /* renamed from: O */
        C14063d f39142O;

        /* renamed from: P */
        boolean f39143P;

        /* renamed from: a */
        final C12392a<? super T> f39144a;

        /* renamed from: b */
        final C12331g<? super T> f39145b;

        C13515b(C12392a<? super T> aVar, C12331g<? super T> gVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
            this.f39144a = aVar;
            this.f39145b = gVar;
            this.f39141N = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39142O, dVar)) {
                this.f39142O = dVar;
                this.f39144a.mo41788a(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39143P
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 0
            L_0x0008:
                e.a.w0.g<? super T> r0 = r9.f39145b     // Catch:{ all -> 0x0014 }
                r0.mo33410c(r10)     // Catch:{ all -> 0x0014 }
                e.a.x0.c.a<? super T> r0 = r9.f39144a
                boolean r10 = r0.mo42138b(r10)
                return r10
            L_0x0014:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r4 = 1
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39141N     // Catch:{ all -> 0x004c }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004c }
                java.lang.Object r6 = r6.mo35569a(r7, r0)     // Catch:{ all -> 0x004c }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x004c }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x004c }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13513c.C13514a.f39140a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r4) goto L_0x0008
                if (r6 == r5) goto L_0x004b
                r10 = 3
                if (r6 == r10) goto L_0x0045
                r9.cancel()
                r9.onError(r0)
                return r1
            L_0x0045:
                r9.cancel()
                r9.onComplete()
            L_0x004b:
                return r1
            L_0x004c:
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
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13513c.C13515b.mo42138b(java.lang.Object):boolean");
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39142O.mo41813c(j);
        }

        public void cancel() {
            this.f39142O.cancel();
        }

        public void onComplete() {
            if (!this.f39143P) {
                this.f39143P = true;
                this.f39144a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39143P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39143P = true;
            this.f39144a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t) && !this.f39143P) {
                this.f39142O.mo41813c(1);
            }
        }
    }

    /* renamed from: e.a.x0.e.f.c$c */
    /* compiled from: ParallelDoOnNextTry */
    static final class C13516c<T> implements C12392a<T>, C14063d {

        /* renamed from: N */
        final C12327c<? super Long, ? super Throwable, C12201a> f39146N;

        /* renamed from: O */
        C14063d f39147O;

        /* renamed from: P */
        boolean f39148P;

        /* renamed from: a */
        final C14062c<? super T> f39149a;

        /* renamed from: b */
        final C12331g<? super T> f39150b;

        C13516c(C14062c<? super T> cVar, C12331g<? super T> gVar, C12327c<? super Long, ? super Throwable, C12201a> cVar2) {
            this.f39149a = cVar;
            this.f39150b = gVar;
            this.f39146N = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39147O, dVar)) {
                this.f39147O = dVar;
                this.f39149a.mo41788a((C14063d) this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo42138b(T r10) {
            /*
                r9 = this;
                boolean r0 = r9.f39148P
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 0
            L_0x0008:
                r0 = 1
                e.a.w0.g<? super T> r4 = r9.f39150b     // Catch:{ all -> 0x0014 }
                r4.mo33410c(r10)     // Catch:{ all -> 0x0014 }
                i.e.c<? super T> r1 = r9.f39149a
                r1.mo41789a(r10)
                return r0
            L_0x0014:
                r4 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                r5 = 2
                e.a.w0.c<? super java.lang.Long, ? super java.lang.Throwable, e.a.a1.a> r6 = r9.f39146N     // Catch:{ all -> 0x004b }
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004b }
                java.lang.Object r6 = r6.mo35569a(r7, r4)     // Catch:{ all -> 0x004b }
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r6, r7)     // Catch:{ all -> 0x004b }
                e.a.a1.a r6 = (p195e.p196a.p197a1.C12201a) r6     // Catch:{ all -> 0x004b }
                int[] r7 = p195e.p196a.p199x0.p454e.p460f.C13513c.C13514a.f39140a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L_0x0008
                if (r6 == r5) goto L_0x004a
                r10 = 3
                if (r6 == r10) goto L_0x0044
                r9.cancel()
                r9.onError(r4)
                return r1
            L_0x0044:
                r9.cancel()
                r9.onComplete()
            L_0x004a:
                return r1
            L_0x004b:
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
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13513c.C13516c.mo42138b(java.lang.Object):boolean");
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39147O.mo41813c(j);
        }

        public void cancel() {
            this.f39147O.cancel();
        }

        public void onComplete() {
            if (!this.f39148P) {
                this.f39148P = true;
                this.f39149a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39148P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39148P = true;
            this.f39149a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t)) {
                this.f39147O.mo41813c(1);
            }
        }
    }

    public C13513c(C5922b<T> bVar, C12331g<? super T> gVar, C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        this.f39137a = bVar;
        this.f39138b = gVar;
        this.f39139c = cVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                C12392a aVar = cVarArr[i];
                if (aVar instanceof C12392a) {
                    cVarArr2[i] = new C13515b(aVar, this.f39138b, this.f39139c);
                } else {
                    cVarArr2[i] = new C13516c(aVar, this.f39138b, this.f39139c);
                }
            }
            this.f39137a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39137a.mo23713a();
    }
}
