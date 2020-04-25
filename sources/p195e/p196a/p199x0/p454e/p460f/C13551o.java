package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C12297q;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p463g.C13691o;
import p195e.p196a.p199x0.p463g.C13691o.C13692a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.f.o */
/* compiled from: ParallelRunOn */
public final class C13551o<T> extends C5922b<T> {

    /* renamed from: a */
    final C5922b<? extends T> f39265a;

    /* renamed from: b */
    final C12282j0 f39266b;

    /* renamed from: c */
    final int f39267c;

    /* renamed from: e.a.x0.e.f.o$a */
    /* compiled from: ParallelRunOn */
    static abstract class C13552a<T> extends AtomicInteger implements C12297q<T>, C14063d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;

        /* renamed from: N */
        final C13662b<T> f39268N;

        /* renamed from: O */
        final C12285c f39269O;

        /* renamed from: P */
        C14063d f39270P;

        /* renamed from: Q */
        volatile boolean f39271Q;

        /* renamed from: R */
        Throwable f39272R;

        /* renamed from: S */
        final AtomicLong f39273S = new AtomicLong();

        /* renamed from: T */
        volatile boolean f39274T;

        /* renamed from: U */
        int f39275U;

        /* renamed from: a */
        final int f39276a;

        /* renamed from: b */
        final int f39277b;

        C13552a(int i, C13662b<T> bVar, C12285c cVar) {
            this.f39276a = i;
            this.f39268N = bVar;
            this.f39277b = i - (i >> 2);
            this.f39269O = cVar;
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            if (!this.f39271Q) {
                if (!this.f39268N.offer(t)) {
                    this.f39270P.cancel();
                    onError(new MissingBackpressureException("Queue is full?!"));
                    return;
                }
                mo42981a();
            }
        }

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f39273S, j);
                mo42981a();
            }
        }

        public final void cancel() {
            if (!this.f39274T) {
                this.f39274T = true;
                this.f39270P.cancel();
                this.f39269O.dispose();
                if (getAndIncrement() == 0) {
                    this.f39268N.clear();
                }
            }
        }

        public final void onComplete() {
            if (!this.f39271Q) {
                this.f39271Q = true;
                mo42981a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f39271Q) {
                C12205a.m54894b(th);
                return;
            }
            this.f39272R = th;
            this.f39271Q = true;
            mo42981a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42981a() {
            if (getAndIncrement() == 0) {
                this.f39269O.mo41876a((Runnable) this);
            }
        }
    }

    /* renamed from: e.a.x0.e.f.o$b */
    /* compiled from: ParallelRunOn */
    final class C13553b implements C13692a {

        /* renamed from: a */
        final C14062c<? super T>[] f39278a;

        /* renamed from: b */
        final C14062c<T>[] f39279b;

        C13553b(C14062c<? super T>[] cVarArr, C14062c<T>[] cVarArr2) {
            this.f39278a = cVarArr;
            this.f39279b = cVarArr2;
        }

        /* renamed from: a */
        public void mo42982a(int i, C12285c cVar) {
            C13551o.this.mo42980a(i, this.f39278a, this.f39279b, cVar);
        }
    }

    /* renamed from: e.a.x0.e.f.o$c */
    /* compiled from: ParallelRunOn */
    static final class C13554c<T> extends C13552a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* renamed from: V */
        final C12392a<? super T> f39281V;

        C13554c(C12392a<? super T> aVar, int i, C13662b<T> bVar, C12285c cVar) {
            super(i, bVar, cVar);
            this.f39281V = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39270P, dVar)) {
                this.f39270P = dVar;
                this.f39281V.mo41788a(this);
                dVar.mo41813c((long) this.f39276a);
            }
        }

        public void run() {
            int i;
            int i2 = this.f39275U;
            C13662b<T> bVar = this.f39268N;
            C12392a<? super T> aVar = this.f39281V;
            int i3 = this.f39277b;
            int i4 = 1;
            while (true) {
                long j = this.f39273S.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f39274T) {
                        bVar.clear();
                        return;
                    }
                    boolean z = this.f39271Q;
                    if (z) {
                        Throwable th = this.f39272R;
                        if (th != null) {
                            bVar.clear();
                            aVar.onError(th);
                            this.f39269O.dispose();
                            return;
                        }
                    }
                    Object poll = bVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        aVar.onComplete();
                        this.f39269O.dispose();
                        return;
                    } else if (z2) {
                        break;
                    } else {
                        if (aVar.mo42138b(poll)) {
                            j2++;
                        }
                        i2++;
                        if (i2 == i3) {
                            i = i4;
                            this.f39270P.mo41813c((long) i2);
                            i2 = 0;
                        } else {
                            i = i4;
                        }
                        i4 = i;
                    }
                }
                int i5 = i4;
                if (j2 == j) {
                    if (this.f39274T) {
                        bVar.clear();
                        return;
                    } else if (this.f39271Q) {
                        Throwable th2 = this.f39272R;
                        if (th2 != null) {
                            bVar.clear();
                            aVar.onError(th2);
                            this.f39269O.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            aVar.onComplete();
                            this.f39269O.dispose();
                            return;
                        }
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    this.f39273S.addAndGet(-j2);
                }
                int i6 = get();
                int i7 = i5;
                if (i6 == i7) {
                    this.f39275U = i2;
                    i6 = addAndGet(-i7);
                    if (i6 == 0) {
                        return;
                    }
                }
                i4 = i6;
            }
        }
    }

    /* renamed from: e.a.x0.e.f.o$d */
    /* compiled from: ParallelRunOn */
    static final class C13555d<T> extends C13552a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        /* renamed from: V */
        final C14062c<? super T> f39282V;

        C13555d(C14062c<? super T> cVar, int i, C13662b<T> bVar, C12285c cVar2) {
            super(i, bVar, cVar2);
            this.f39282V = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39270P, dVar)) {
                this.f39270P = dVar;
                this.f39282V.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f39276a);
            }
        }

        public void run() {
            int i;
            int i2 = this.f39275U;
            C13662b<T> bVar = this.f39268N;
            C14062c<? super T> cVar = this.f39282V;
            int i3 = this.f39277b;
            int i4 = 1;
            while (true) {
                long j = this.f39273S.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f39274T) {
                        bVar.clear();
                        return;
                    }
                    boolean z = this.f39271Q;
                    if (z) {
                        Throwable th = this.f39272R;
                        if (th != null) {
                            bVar.clear();
                            cVar.onError(th);
                            this.f39269O.dispose();
                            return;
                        }
                    }
                    Object poll = bVar.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        cVar.onComplete();
                        this.f39269O.dispose();
                        return;
                    } else if (z2) {
                        break;
                    } else {
                        cVar.mo41789a(poll);
                        j2++;
                        i2++;
                        if (i2 == i3) {
                            i = i4;
                            this.f39270P.mo41813c((long) i2);
                            i2 = 0;
                        } else {
                            i = i4;
                        }
                        i4 = i;
                    }
                }
                int i5 = i4;
                if (j2 == j) {
                    if (this.f39274T) {
                        bVar.clear();
                        return;
                    } else if (this.f39271Q) {
                        Throwable th2 = this.f39272R;
                        if (th2 != null) {
                            bVar.clear();
                            cVar.onError(th2);
                            this.f39269O.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            cVar.onComplete();
                            this.f39269O.dispose();
                            return;
                        }
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    this.f39273S.addAndGet(-j2);
                }
                int i6 = get();
                int i7 = i5;
                if (i6 == i7) {
                    this.f39275U = i2;
                    i6 = addAndGet(-i7);
                    if (i6 == 0) {
                        return;
                    }
                }
                i4 = i6;
            }
        }
    }

    public C13551o(C5922b<? extends T> bVar, C12282j0 j0Var, int i) {
        this.f39265a = bVar;
        this.f39266b = j0Var;
        this.f39267c = i;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            C12282j0 j0Var = this.f39266b;
            if (j0Var instanceof C13691o) {
                ((C13691o) j0Var).mo43037a(length, new C13553b(cVarArr, cVarArr2));
            } else {
                for (int i = 0; i < length; i++) {
                    mo42980a(i, cVarArr, cVarArr2, this.f39266b.mo41871a());
                }
            }
            this.f39265a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42980a(int i, C14062c<? super T>[] cVarArr, C14062c<T>[] cVarArr2, C12285c cVar) {
        C12392a aVar = cVarArr[i];
        C13662b bVar = new C13662b(this.f39267c);
        if (aVar instanceof C12392a) {
            cVarArr2[i] = new C13554c(aVar, this.f39267c, bVar, cVar);
        } else {
            cVarArr2[i] = new C13555d(aVar, this.f39267c, bVar, cVar);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39265a.mo23713a();
    }
}
