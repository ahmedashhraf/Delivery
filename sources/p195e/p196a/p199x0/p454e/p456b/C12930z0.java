package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.z0 */
/* compiled from: FlowableFlatMap */
public final class C12930z0<T, U> extends C12511a<T, U> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C6007b<? extends U>> f37259N;

    /* renamed from: O */
    final boolean f37260O;

    /* renamed from: P */
    final int f37261P;

    /* renamed from: Q */
    final int f37262Q;

    /* renamed from: e.a.x0.e.b.z0$a */
    /* compiled from: FlowableFlatMap */
    static final class C12931a<T, U> extends AtomicReference<C14063d> implements C12297q<U>, C12314c {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: N */
        final int f37263N = (this.f37264O >> 2);

        /* renamed from: O */
        final int f37264O;

        /* renamed from: P */
        volatile boolean f37265P;

        /* renamed from: Q */
        volatile C12406o<U> f37266Q;

        /* renamed from: R */
        long f37267R;

        /* renamed from: S */
        int f37268S;

        /* renamed from: a */
        final long f37269a;

        /* renamed from: b */
        final C12932b<T, U> f37270b;

        C12931a(C12932b<T, U> bVar, long j) {
            this.f37269a = j;
            this.f37270b = bVar;
            this.f37264O = bVar.f37275P;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(7);
                    if (a == 1) {
                        this.f37268S = a;
                        this.f37266Q = lVar;
                        this.f37265P = true;
                        this.f37270b.mo42547f();
                        return;
                    } else if (a == 2) {
                        this.f37268S = a;
                        this.f37266Q = lVar;
                    }
                }
                dVar.mo41813c((long) this.f37264O);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == C13742j.CANCELLED;
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            this.f37265P = true;
            this.f37270b.mo42547f();
        }

        public void onError(Throwable th) {
            lazySet(C13742j.CANCELLED);
            this.f37270b.mo42538a(this, th);
        }

        /* renamed from: a */
        public void mo41789a(U u) {
            if (this.f37268S != 2) {
                this.f37270b.mo42539a(u, this);
            } else {
                this.f37270b.mo42547f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42537a(long j) {
            if (this.f37268S != 1) {
                long j2 = this.f37267R + j;
                if (j2 >= ((long) this.f37263N)) {
                    this.f37267R = 0;
                    ((C14063d) get()).mo41813c(j2);
                    return;
                }
                this.f37267R = j2;
            }
        }
    }

    /* renamed from: e.a.x0.e.b.z0$b */
    /* compiled from: FlowableFlatMap */
    static final class C12932b<T, U> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: c0 */
        static final C12931a<?, ?>[] f37271c0 = new C12931a[0];

        /* renamed from: d0 */
        static final C12931a<?, ?>[] f37272d0 = new C12931a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: N */
        final boolean f37273N;

        /* renamed from: O */
        final int f37274O;

        /* renamed from: P */
        final int f37275P;

        /* renamed from: Q */
        volatile C12405n<U> f37276Q;

        /* renamed from: R */
        volatile boolean f37277R;

        /* renamed from: S */
        final C13746c f37278S = new C13746c();

        /* renamed from: T */
        volatile boolean f37279T;

        /* renamed from: U */
        final AtomicReference<C12931a<?, ?>[]> f37280U = new AtomicReference<>();

        /* renamed from: V */
        final AtomicLong f37281V = new AtomicLong();

        /* renamed from: W */
        C14063d f37282W;

        /* renamed from: X */
        long f37283X;

        /* renamed from: Y */
        long f37284Y;

        /* renamed from: Z */
        int f37285Z;

        /* renamed from: a */
        final C14062c<? super U> f37286a;

        /* renamed from: a0 */
        int f37287a0;

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<? extends U>> f37288b;

        /* renamed from: b0 */
        final int f37289b0;

        C12932b(C14062c<? super U> cVar, C12339o<? super T, ? extends C6007b<? extends U>> oVar, boolean z, int i, int i2) {
            this.f37286a = cVar;
            this.f37288b = oVar;
            this.f37273N = z;
            this.f37274O = i;
            this.f37275P = i2;
            this.f37289b0 = Math.max(1, i >> 1);
            this.f37280U.lazySet(f37271c0);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37282W, dVar)) {
                this.f37282W = dVar;
                this.f37286a.mo41788a((C14063d) this);
                if (!this.f37279T) {
                    int i = this.f37274O;
                    if (i == Integer.MAX_VALUE) {
                        dVar.mo41813c(Long.MAX_VALUE);
                    } else {
                        dVar.mo41813c((long) i);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12406o<U> mo42542b(C12931a<T, U> aVar) {
            C12406o<U> oVar = aVar.f37266Q;
            if (oVar != null) {
                return oVar;
            }
            C13662b bVar = new C13662b(this.f37275P);
            aVar.f37266Q = bVar;
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42543c(C12931a<T, U> aVar) {
            C12931a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C12931a[]) this.f37280U.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f37271c0;
                        } else {
                            C12931a[] aVarArr2 = new C12931a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f37280U.compareAndSet(aVarArr, obj));
        }

        public void cancel() {
            if (!this.f37279T) {
                this.f37279T = true;
                this.f37282W.cancel();
                mo42546e();
                if (getAndIncrement() == 0) {
                    C12405n<U> nVar = this.f37276Q;
                    if (nVar != null) {
                        nVar.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42545d() {
            C12405n<U> nVar = this.f37276Q;
            if (nVar != null) {
                nVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42546e() {
            C12931a<?, ?>[] aVarArr = (C12931a[]) this.f37280U.get();
            C12931a<?, ?>[] aVarArr2 = f37272d0;
            if (aVarArr != aVarArr2) {
                C12931a<?, ?>[] aVarArr3 = (C12931a[]) this.f37280U.getAndSet(aVarArr2);
                if (aVarArr3 != f37272d0) {
                    for (C12931a<?, ?> dispose : aVarArr3) {
                        dispose.dispose();
                    }
                    Throwable d = this.f37278S.mo43143d();
                    if (d != null && d != C13754k.f39801a) {
                        C12205a.m54894b(d);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42547f() {
            if (getAndIncrement() == 0) {
                mo42548g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42548g() {
            long j;
            long j2;
            long j3;
            boolean z;
            C12931a[] aVarArr;
            int i;
            long j4;
            C14062c<? super U> cVar = this.f37286a;
            int i2 = 1;
            while (!mo42540a()) {
                C12405n<U> nVar = this.f37276Q;
                long j5 = this.f37281V.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                long j7 = 0;
                if (nVar != null) {
                    while (true) {
                        long j8 = 0;
                        Object obj = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            Object poll = nVar.poll();
                            if (!mo42540a()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                cVar.mo41789a(poll);
                                j7++;
                                j8++;
                                j5--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j5 = Long.MAX_VALUE;
                            } else {
                                j5 = this.f37281V.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || obj == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f37277R;
                C12405n<U> nVar2 = this.f37276Q;
                C12931a[] aVarArr2 = (C12931a[]) this.f37280U.get();
                int length = aVarArr2.length;
                if (!z3 || ((nVar2 != null && !nVar2.isEmpty()) || length != 0)) {
                    int i3 = i2;
                    if (length != 0) {
                        long j9 = this.f37284Y;
                        int i4 = this.f37285Z;
                        if (length <= i4 || aVarArr2[i4].f37269a != j9) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            int i5 = i4;
                            for (int i6 = 0; i6 < length && aVarArr2[i5].f37269a != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f37285Z = i5;
                            this.f37284Y = aVarArr2[i5].f37269a;
                            i4 = i5;
                        }
                        int i7 = i4;
                        z = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!mo42540a()) {
                                C12931a aVar = aVarArr2[i7];
                                Object obj2 = null;
                                while (!mo42540a()) {
                                    C12406o<U> oVar = aVar.f37266Q;
                                    if (oVar == null) {
                                        aVarArr = aVarArr2;
                                        i = length;
                                    } else {
                                        i = length;
                                        Object obj3 = obj2;
                                        aVarArr = aVarArr2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                Object poll2 = oVar.poll();
                                                if (poll2 == null) {
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                cVar.mo41789a(poll2);
                                                if (!mo42540a()) {
                                                    j--;
                                                    j10++;
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C14398a.m62357b(th2);
                                                aVar.dispose();
                                                this.f37278S.mo43142a(th2);
                                                if (!this.f37273N) {
                                                    this.f37282W.cancel();
                                                }
                                                if (!mo42540a()) {
                                                    mo42543c(aVar);
                                                    i8++;
                                                    z = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.f37281V.addAndGet(-j10) : Long.MAX_VALUE;
                                            aVar.mo42537a(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || obj3 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i;
                                            obj2 = obj3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z4 = aVar.f37265P;
                                    C12406o<U> oVar2 = aVar.f37266Q;
                                    if (z4 && (oVar2 == null || oVar2.isEmpty())) {
                                        mo42543c(aVar);
                                        if (!mo42540a()) {
                                            j7++;
                                            z = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        break;
                                    }
                                    int i9 = i7 + 1;
                                    i7 = i9 == i ? 0 : i9;
                                    i8++;
                                    aVarArr2 = aVarArr;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f37285Z = i7;
                        this.f37284Y = aVarArr[i7].f37269a;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.f37279T) {
                        this.f37282W.mo41813c(j3);
                    }
                    if (z) {
                        i2 = i3;
                    } else {
                        i2 = addAndGet(-i3);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable d = this.f37278S.mo43143d();
                    if (d != C13754k.f39801a) {
                        if (d == null) {
                            cVar.onComplete();
                        } else {
                            cVar.onError(d);
                        }
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C12406o<U> mo42549h() {
            C12405n<U> nVar = this.f37276Q;
            if (nVar == null) {
                int i = this.f37274O;
                if (i == Integer.MAX_VALUE) {
                    nVar = new C13663c<>(this.f37275P);
                } else {
                    nVar = new C13662b<>(i);
                }
                this.f37276Q = nVar;
            }
            return nVar;
        }

        public void onComplete() {
            if (!this.f37277R) {
                this.f37277R = true;
                mo42547f();
            }
        }

        public void onError(Throwable th) {
            if (this.f37277R) {
                C12205a.m54894b(th);
                return;
            }
            if (this.f37278S.mo43142a(th)) {
                this.f37277R = true;
                mo42547f();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37277R) {
                try {
                    C6007b bVar = (C6007b) C12390b.m55563a(this.f37288b.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                mo42544c((U) call);
                            } else if (this.f37274O != Integer.MAX_VALUE && !this.f37279T) {
                                int i = this.f37287a0 + 1;
                                this.f37287a0 = i;
                                int i2 = this.f37289b0;
                                if (i == i2) {
                                    this.f37287a0 = 0;
                                    this.f37282W.mo41813c((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            this.f37278S.mo43142a(th);
                            mo42547f();
                        }
                    } else {
                        long j = this.f37283X;
                        this.f37283X = 1 + j;
                        C12931a aVar = new C12931a(this, j);
                        if (mo42541a(aVar)) {
                            bVar.mo24397a(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f37282W.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo42544c(U u) {
            String str = "Scalar queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f37281V.get();
                C12406o oVar = this.f37276Q;
                if (j == 0 || (oVar != null && !oVar.isEmpty())) {
                    if (oVar == null) {
                        oVar = mo42549h();
                    }
                    if (!oVar.offer(u)) {
                        onError(new IllegalStateException(str));
                        return;
                    }
                } else {
                    this.f37286a.mo41789a(u);
                    if (j != Long.MAX_VALUE) {
                        this.f37281V.decrementAndGet();
                    }
                    if (this.f37274O != Integer.MAX_VALUE && !this.f37279T) {
                        int i = this.f37287a0 + 1;
                        this.f37287a0 = i;
                        int i2 = this.f37289b0;
                        if (i == i2) {
                            this.f37287a0 = 0;
                            this.f37282W.mo41813c((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo42549h().offer(u)) {
                onError(new IllegalStateException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo42548g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42541a(C12931a<T, U> aVar) {
            C12931a<?, ?>[] aVarArr;
            C12931a[] aVarArr2;
            do {
                aVarArr = (C12931a[]) this.f37280U.get();
                if (aVarArr == f37272d0) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12931a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f37280U.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37281V, j);
                mo42547f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42539a(U u, C12931a<T, U> aVar) {
            String str = "Inner queue full?!";
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12406o oVar = aVar.f37266Q;
                if (oVar == null) {
                    oVar = new C13662b(this.f37275P);
                    aVar.f37266Q = oVar;
                }
                if (!oVar.offer(u)) {
                    onError(new MissingBackpressureException(str));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f37281V.get();
                C12406o<U> oVar2 = aVar.f37266Q;
                if (j == 0 || (oVar2 != null && !oVar2.isEmpty())) {
                    if (oVar2 == null) {
                        oVar2 = mo42542b(aVar);
                    }
                    if (!oVar2.offer(u)) {
                        onError(new MissingBackpressureException(str));
                        return;
                    }
                } else {
                    this.f37286a.mo41789a(u);
                    if (j != Long.MAX_VALUE) {
                        this.f37281V.decrementAndGet();
                    }
                    aVar.mo42537a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo42548g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42540a() {
            if (this.f37279T) {
                mo42545d();
                return true;
            } else if (this.f37273N || this.f37278S.get() == null) {
                return false;
            } else {
                mo42545d();
                Throwable d = this.f37278S.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37286a.onError(d);
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42538a(C12931a<T, U> aVar, Throwable th) {
            if (this.f37278S.mo43142a(th)) {
                aVar.f37265P = true;
                if (!this.f37273N) {
                    this.f37282W.cancel();
                    for (C12931a dispose : (C12931a[]) this.f37280U.getAndSet(f37272d0)) {
                        dispose.dispose();
                    }
                }
                mo42547f();
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12930z0(C5929l<T> lVar, C12339o<? super T, ? extends C6007b<? extends U>> oVar, boolean z, int i, int i2) {
        super(lVar);
        this.f37259N = oVar;
        this.f37260O = z;
        this.f37261P = i;
        this.f37262Q = i2;
    }

    /* renamed from: a */
    public static <T, U> C12297q<T> m56805a(C14062c<? super U> cVar, C12339o<? super T, ? extends C6007b<? extends U>> oVar, boolean z, int i, int i2) {
        C12932b bVar = new C12932b(cVar, oVar, z, i, i2);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        if (!C12671j3.m56158a(this.f35814b, cVar, this.f37259N)) {
            this.f35814b.mo24393a(m56805a(cVar, this.f37259N, this.f37260O, this.f37261P, this.f37262Q));
        }
    }
}
