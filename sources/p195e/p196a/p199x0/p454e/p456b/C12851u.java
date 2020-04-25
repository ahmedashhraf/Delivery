package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.u */
/* compiled from: FlowableCombineLatest */
public final class C12851u<T, R> extends C5929l<R> {
    @C5938g

    /* renamed from: N */
    final Iterable<? extends C6007b<? extends T>> f36935N;

    /* renamed from: O */
    final C12339o<? super Object[], ? extends R> f36936O;

    /* renamed from: P */
    final int f36937P;

    /* renamed from: Q */
    final boolean f36938Q;
    @C5938g

    /* renamed from: b */
    final C6007b<? extends T>[] f36939b;

    /* renamed from: e.a.x0.e.b.u$a */
    /* compiled from: FlowableCombineLatest */
    static final class C12852a<T, R> extends C13735c<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* renamed from: N */
        final C12853b<T>[] f36940N;

        /* renamed from: O */
        final C13663c<Object> f36941O;

        /* renamed from: P */
        final Object[] f36942P;

        /* renamed from: Q */
        final boolean f36943Q;

        /* renamed from: R */
        boolean f36944R;

        /* renamed from: S */
        int f36945S;

        /* renamed from: T */
        int f36946T;

        /* renamed from: U */
        volatile boolean f36947U;

        /* renamed from: V */
        final AtomicLong f36948V;

        /* renamed from: W */
        volatile boolean f36949W;

        /* renamed from: X */
        final AtomicReference<Throwable> f36950X;

        /* renamed from: a */
        final C14062c<? super R> f36951a;

        /* renamed from: b */
        final C12339o<? super Object[], ? extends R> f36952b;

        C12852a(C14062c<? super R> cVar, C12339o<? super Object[], ? extends R> oVar, int i, int i2, boolean z) {
            this.f36951a = cVar;
            this.f36952b = oVar;
            C12853b<T>[] bVarArr = new C12853b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C12853b<>(this, i3, i2);
            }
            this.f36940N = bVarArr;
            this.f36942P = new Object[i];
            this.f36941O = new C13663c<>(i2);
            this.f36948V = new AtomicLong();
            this.f36950X = new AtomicReference<>();
            this.f36943Q = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42476a(C6007b<? extends T>[] bVarArr, int i) {
            C12853b<T>[] bVarArr2 = this.f36940N;
            for (int i2 = 0; i2 < i && !this.f36949W && !this.f36947U; i2++) {
                bVarArr[i2].mo24397a(bVarArr2[i2]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            mo42473a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42478b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.Object[] r0 = r2.f36942P     // Catch:{ all -> 0x001c }
                r3 = r0[r3]     // Catch:{ all -> 0x001c }
                r1 = 1
                if (r3 == 0) goto L_0x0015
                int r3 = r2.f36946T     // Catch:{ all -> 0x001c }
                int r3 = r3 + r1
                int r0 = r0.length     // Catch:{ all -> 0x001c }
                if (r3 != r0) goto L_0x0011
                r2.f36949W = r1     // Catch:{ all -> 0x001c }
                goto L_0x0017
            L_0x0011:
                r2.f36946T = r3     // Catch:{ all -> 0x001c }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                return
            L_0x0015:
                r2.f36949W = r1     // Catch:{ all -> 0x001c }
            L_0x0017:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                r2.mo42473a()
                return
            L_0x001c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12851u.C12852a.mo42478b(int):void");
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36948V, j);
                mo42473a();
            }
        }

        public void cancel() {
            this.f36947U = true;
            mo42479d();
        }

        public void clear() {
            this.f36941O.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42479d() {
            for (C12853b<T> a : this.f36940N) {
                a.mo42482a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42480e() {
            C14062c<? super R> cVar = this.f36951a;
            C13663c<Object> cVar2 = this.f36941O;
            int i = 1;
            do {
                long j = this.f36948V.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f36949W;
                    Object poll = cVar2.poll();
                    boolean z2 = poll == null;
                    if (!mo42477a(z, z2, cVar, cVar2)) {
                        if (z2) {
                            break;
                        }
                        try {
                            cVar.mo41789a(C12390b.m55563a(this.f36952b.apply((Object[]) cVar2.poll()), "The combiner returned a null value"));
                            ((C12853b) poll).mo42483d();
                            j2++;
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            mo42479d();
                            C13754k.m58722a(this.f36950X, th);
                            cVar.onError(C13754k.m58720a(this.f36950X));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != j || !mo42477a(this.f36949W, cVar2.isEmpty(), cVar, cVar2)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.f36948V.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42481f() {
            C14062c<? super R> cVar = this.f36951a;
            C13663c<Object> cVar2 = this.f36941O;
            int i = 1;
            while (!this.f36947U) {
                Throwable th = (Throwable) this.f36950X.get();
                if (th != null) {
                    cVar2.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z = this.f36949W;
                boolean isEmpty = cVar2.isEmpty();
                if (!isEmpty) {
                    cVar.mo41789a(null);
                }
                if (!z || !isEmpty) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            cVar2.clear();
        }

        public boolean isEmpty() {
            return this.f36941O.isEmpty();
        }

        @C5938g
        public R poll() throws Exception {
            Object poll = this.f36941O.poll();
            if (poll == null) {
                return null;
            }
            R a = C12390b.m55563a(this.f36952b.apply((Object[]) this.f36941O.poll()), "The combiner returned a null value");
            ((C12853b) poll).mo42483d();
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42474a(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.f36942P;
                int i2 = this.f36945S;
                if (objArr[i] == null) {
                    i2++;
                    this.f36945S = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.f36941O.mo42104a(this.f36940N[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.f36940N[i].mo42483d();
            } else {
                mo42473a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42475a(int i, Throwable th) {
            if (!C13754k.m58722a(this.f36950X, th)) {
                C12205a.m54894b(th);
            } else if (!this.f36943Q) {
                mo42479d();
                this.f36949W = true;
                mo42473a();
            } else {
                mo42478b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42473a() {
            if (getAndIncrement() == 0) {
                if (this.f36944R) {
                    mo42481f();
                } else {
                    mo42480e();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42477a(boolean z, boolean z2, C14062c<?> cVar, C13663c<?> cVar2) {
            if (this.f36947U) {
                mo42479d();
                cVar2.clear();
                return true;
            }
            if (z) {
                if (!this.f36943Q) {
                    Throwable a = C13754k.m58720a(this.f36950X);
                    if (a != null && a != C13754k.f39801a) {
                        mo42479d();
                        cVar2.clear();
                        cVar.onError(a);
                        return true;
                    } else if (z2) {
                        mo42479d();
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    mo42479d();
                    Throwable a2 = C13754k.m58720a(this.f36950X);
                    if (a2 == null || a2 == C13754k.f39801a) {
                        cVar.onComplete();
                    } else {
                        cVar.onError(a2);
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            if (i2 != 0) {
                z = true;
            }
            this.f36944R = z;
            return i2;
        }
    }

    /* renamed from: e.a.x0.e.b.u$b */
    /* compiled from: FlowableCombineLatest */
    static final class C12853b<T> extends AtomicReference<C14063d> implements C12297q<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* renamed from: N */
        final int f36953N;

        /* renamed from: O */
        final int f36954O;

        /* renamed from: P */
        int f36955P;

        /* renamed from: a */
        final C12852a<T, ?> f36956a;

        /* renamed from: b */
        final int f36957b;

        C12853b(C12852a<T, ?> aVar, int i, int i2) {
            this.f36956a = aVar;
            this.f36957b = i;
            this.f36953N = i2;
            this.f36954O = i2 - (i2 >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, (long) this.f36953N);
        }

        /* renamed from: d */
        public void mo42483d() {
            int i = this.f36955P + 1;
            if (i == this.f36954O) {
                this.f36955P = 0;
                ((C14063d) get()).mo41813c((long) i);
                return;
            }
            this.f36955P = i;
        }

        public void onComplete() {
            this.f36956a.mo42478b(this.f36957b);
        }

        public void onError(Throwable th) {
            this.f36956a.mo42475a(this.f36957b, th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36956a.mo42474a(this.f36957b, t);
        }

        /* renamed from: a */
        public void mo42482a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    /* renamed from: e.a.x0.e.b.u$c */
    /* compiled from: FlowableCombineLatest */
    final class C12854c implements C12339o<T, R> {
        C12854c() {
        }

        public R apply(T t) throws Exception {
            return C12851u.this.f36936O.apply(new Object[]{t});
        }
    }

    public C12851u(@C5937f C6007b<? extends T>[] bVarArr, @C5937f C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f36939b = bVarArr;
        this.f36935N = null;
        this.f36936O = oVar;
        this.f36937P = i;
        this.f36938Q = z;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        int i;
        C6007b<? extends T>[] bVarArr = this.f36939b;
        if (bVarArr == null) {
            bVarArr = new C6007b[8];
            try {
                Iterator it = (Iterator) C12390b.m55563a(this.f36935N.iterator(), "The iterator returned is null");
                i = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            C6007b<? extends T> bVar = (C6007b) C12390b.m55563a(it.next(), "The publisher returned by the iterator is null");
                            if (i == bVarArr.length) {
                                C6007b<? extends T>[] bVarArr2 = new C6007b[((i >> 2) + i)];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                                bVarArr = bVarArr2;
                            }
                            int i2 = i + 1;
                            bVarArr[i] = bVar;
                            i = i2;
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            C13739g.m58655a(th, cVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        C13739g.m58655a(th2, cVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C13739g.m58655a(th3, cVar);
                return;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            C13739g.m58654a(cVar);
        } else if (i == 1) {
            bVarArr[0].mo24397a(new C12532b(cVar, new C12854c()));
        } else {
            C12852a aVar = new C12852a(cVar, this.f36936O, i, this.f36937P, this.f36938Q);
            cVar.mo41788a((C14063d) aVar);
            aVar.mo42476a(bVarArr, i);
        }
    }

    public C12851u(@C5937f Iterable<? extends C6007b<? extends T>> iterable, @C5937f C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f36939b = null;
        this.f36935N = iterable;
        this.f36936O = oVar;
        this.f36937P = i;
        this.f36938Q = z;
    }
}
