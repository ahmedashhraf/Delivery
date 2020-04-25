package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.s2 */
/* compiled from: FlowablePublishMulticast */
public final class C12825s2<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super C5929l<T>, ? extends C6007b<? extends R>> f36840N;

    /* renamed from: O */
    final int f36841O;

    /* renamed from: P */
    final boolean f36842P;

    /* renamed from: e.a.x0.e.b.s2$a */
    /* compiled from: FlowablePublishMulticast */
    static final class C12826a<T> extends C5929l<T> implements C12297q<T>, C12314c {

        /* renamed from: X */
        static final C12827b[] f36843X = new C12827b[0];

        /* renamed from: Y */
        static final C12827b[] f36844Y = new C12827b[0];

        /* renamed from: N */
        final AtomicReference<C12827b<T>[]> f36845N = new AtomicReference<>(f36843X);

        /* renamed from: O */
        final int f36846O;

        /* renamed from: P */
        final int f36847P;

        /* renamed from: Q */
        final boolean f36848Q;

        /* renamed from: R */
        final AtomicReference<C14063d> f36849R = new AtomicReference<>();

        /* renamed from: S */
        volatile C12406o<T> f36850S;

        /* renamed from: T */
        int f36851T;

        /* renamed from: U */
        volatile boolean f36852U;

        /* renamed from: V */
        Throwable f36853V;

        /* renamed from: W */
        int f36854W;

        /* renamed from: b */
        final AtomicInteger f36855b = new AtomicInteger();

        C12826a(int i, boolean z) {
            this.f36846O = i;
            this.f36847P = i - (i >> 2);
            this.f36848Q = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: U */
        public void mo42453U() {
            C12827b[] bVarArr;
            for (C12827b bVar : (C12827b[]) this.f36845N.getAndSet(f36844Y)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f36857a.onComplete();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: V */
        public void mo42454V() {
            AtomicReference<C12827b<T>[]> atomicReference;
            if (this.f36855b.getAndIncrement() == 0) {
                C12406o<T> oVar = this.f36850S;
                int i = this.f36854W;
                int i2 = this.f36847P;
                boolean z = this.f36851T != 1;
                AtomicReference<C12827b<T>[]> atomicReference2 = this.f36845N;
                C12827b[] bVarArr = (C12827b[]) atomicReference2.get();
                int i3 = i;
                int i4 = 1;
                while (true) {
                    int length = bVarArr.length;
                    if (oVar == null || length == 0) {
                        atomicReference = atomicReference2;
                    } else {
                        int length2 = bVarArr.length;
                        long j = Long.MAX_VALUE;
                        int i5 = length;
                        long j2 = Long.MAX_VALUE;
                        int i6 = 0;
                        while (i6 < length2) {
                            C12827b bVar = bVarArr[i6];
                            AtomicReference<C12827b<T>[]> atomicReference3 = atomicReference2;
                            long j3 = bVar.get() - bVar.f36856N;
                            if (j3 == Long.MIN_VALUE) {
                                i5--;
                            } else if (j2 > j3) {
                                j2 = j3;
                            }
                            i6++;
                            atomicReference2 = atomicReference3;
                        }
                        atomicReference = atomicReference2;
                        long j4 = 0;
                        if (i5 == 0) {
                            j2 = 0;
                        }
                        while (j2 != j4) {
                            if (mo41878d()) {
                                oVar.clear();
                                return;
                            }
                            boolean z2 = this.f36852U;
                            if (z2 && !this.f36848Q) {
                                Throwable th = this.f36853V;
                                if (th != null) {
                                    mo42457b(th);
                                    return;
                                }
                            }
                            try {
                                Object poll = oVar.poll();
                                boolean z3 = poll == null;
                                if (z2 && z3) {
                                    Throwable th2 = this.f36853V;
                                    if (th2 != null) {
                                        mo42457b(th2);
                                    } else {
                                        mo42453U();
                                    }
                                    return;
                                } else if (z3) {
                                    break;
                                } else {
                                    int length3 = bVarArr.length;
                                    int i7 = 0;
                                    boolean z4 = false;
                                    while (i7 < length3) {
                                        C12827b bVar2 = bVarArr[i7];
                                        long j5 = bVar2.get();
                                        if (j5 != Long.MIN_VALUE) {
                                            if (j5 != j) {
                                                bVar2.f36856N++;
                                            }
                                            bVar2.f36857a.mo41789a(poll);
                                        } else {
                                            z4 = true;
                                        }
                                        i7++;
                                        j = Long.MAX_VALUE;
                                    }
                                    j2--;
                                    if (z) {
                                        i3++;
                                        if (i3 == i2) {
                                            ((C14063d) this.f36849R.get()).mo41813c((long) i2);
                                            i3 = 0;
                                        }
                                    }
                                    C12827b[] bVarArr2 = (C12827b[]) atomicReference.get();
                                    if (z4 || bVarArr2 != bVarArr) {
                                        bVarArr = bVarArr2;
                                        break;
                                    } else {
                                        j4 = 0;
                                        j = Long.MAX_VALUE;
                                    }
                                }
                            } catch (Throwable th3) {
                                Throwable th4 = th3;
                                C14398a.m62357b(th4);
                                C13742j.m58674a(this.f36849R);
                                mo42457b(th4);
                                return;
                            }
                        }
                        if (j2 == j4) {
                            if (mo41878d()) {
                                oVar.clear();
                                return;
                            }
                            boolean z5 = this.f36852U;
                            if (z5 && !this.f36848Q) {
                                Throwable th5 = this.f36853V;
                                if (th5 != null) {
                                    mo42457b(th5);
                                    return;
                                }
                            }
                            if (z5 && oVar.isEmpty()) {
                                Throwable th6 = this.f36853V;
                                if (th6 != null) {
                                    mo42457b(th6);
                                } else {
                                    mo42453U();
                                }
                                return;
                            }
                        }
                    }
                    this.f36854W = i3;
                    i4 = this.f36855b.addAndGet(-i4);
                    if (i4 != 0) {
                        if (oVar == null) {
                            oVar = this.f36850S;
                        }
                        bVarArr = (C12827b[]) atomicReference.get();
                        atomicReference2 = atomicReference;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f36849R, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f36851T = a;
                        this.f36850S = lVar;
                        this.f36852U = true;
                        mo42454V();
                        return;
                    } else if (a == 2) {
                        this.f36851T = a;
                        this.f36850S = lVar;
                        C13769v.m58784a(dVar, this.f36846O);
                        return;
                    }
                }
                this.f36850S = C13769v.m58780a(this.f36846O);
                C13769v.m58784a(dVar, this.f36846O);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42456b(C12827b<T> bVar) {
            C12827b<T>[] bVarArr;
            C12827b[] bVarArr2;
            do {
                bVarArr = (C12827b[]) this.f36845N.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr[i2] == bVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f36843X;
                        } else {
                            C12827b[] bVarArr3 = new C12827b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                            bVarArr2 = bVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f36845N.compareAndSet(bVarArr, bVarArr2));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) this.f36849R.get());
        }

        public void dispose() {
            C13742j.m58674a(this.f36849R);
            if (this.f36855b.getAndIncrement() == 0) {
                C12406o<T> oVar = this.f36850S;
                if (oVar != null) {
                    oVar.clear();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo24499e(C14062c<? super T> cVar) {
            C12827b bVar = new C12827b(cVar, this);
            cVar.mo41788a((C14063d) bVar);
            if (!mo42455a(bVar)) {
                Throwable th = this.f36853V;
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
            } else if (bVar.mo42458a()) {
                mo42456b(bVar);
            } else {
                mo42454V();
            }
        }

        public void onComplete() {
            if (!this.f36852U) {
                this.f36852U = true;
                mo42454V();
            }
        }

        public void onError(Throwable th) {
            if (this.f36852U) {
                C12205a.m54894b(th);
                return;
            }
            this.f36853V = th;
            this.f36852U = true;
            mo42454V();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42457b(Throwable th) {
            C12827b[] bVarArr;
            for (C12827b bVar : (C12827b[]) this.f36845N.getAndSet(f36844Y)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f36857a.onError(th);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36852U) {
                if (this.f36851T != 0 || this.f36850S.offer(t)) {
                    mo42454V();
                    return;
                }
                ((C14063d) this.f36849R.get()).cancel();
                onError(new MissingBackpressureException());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42455a(C12827b<T> bVar) {
            C12827b[] bVarArr;
            C12827b[] bVarArr2;
            do {
                bVarArr = (C12827b[]) this.f36845N.get();
                if (bVarArr == f36844Y) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new C12827b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f36845N.compareAndSet(bVarArr, bVarArr2));
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.s2$b */
    /* compiled from: FlowablePublishMulticast */
    static final class C12827b<T> extends AtomicLong implements C14063d {
        private static final long serialVersionUID = 8664815189257569791L;

        /* renamed from: N */
        long f36856N;

        /* renamed from: a */
        final C14062c<? super T> f36857a;

        /* renamed from: b */
        final C12826a<T> f36858b;

        C12827b(C14062c<? super T> cVar, C12826a<T> aVar) {
            this.f36857a = cVar;
            this.f36858b = aVar;
        }

        /* renamed from: a */
        public boolean mo42458a() {
            return get() == Long.MIN_VALUE;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58698b((AtomicLong) this, j);
                this.f36858b.mo42454V();
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f36858b.mo42456b(this);
                this.f36858b.mo42454V();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.s2$c */
    /* compiled from: FlowablePublishMulticast */
    static final class C12828c<R> implements C12297q<R>, C14063d {

        /* renamed from: N */
        C14063d f36859N;

        /* renamed from: a */
        final C14062c<? super R> f36860a;

        /* renamed from: b */
        final C12826a<?> f36861b;

        C12828c(C14062c<? super R> cVar, C12826a<?> aVar) {
            this.f36860a = cVar;
            this.f36861b = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36859N, dVar)) {
                this.f36859N = dVar;
                this.f36860a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36859N.mo41813c(j);
        }

        public void cancel() {
            this.f36859N.cancel();
            this.f36861b.dispose();
        }

        public void onComplete() {
            this.f36860a.onComplete();
            this.f36861b.dispose();
        }

        public void onError(Throwable th) {
            this.f36860a.onError(th);
            this.f36861b.dispose();
        }

        /* renamed from: a */
        public void mo41789a(R r) {
            this.f36860a.mo41789a(r);
        }
    }

    public C12825s2(C5929l<T> lVar, C12339o<? super C5929l<T>, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
        super(lVar);
        this.f36840N = oVar;
        this.f36841O = i;
        this.f36842P = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C12826a aVar = new C12826a(this.f36841O, this.f36842P);
        try {
            ((C6007b) C12390b.m55563a(this.f36840N.apply(aVar), "selector returned a null Publisher")).mo24397a(new C12828c(cVar, aVar));
            this.f35814b.mo24393a((C12297q<? super T>) aVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
