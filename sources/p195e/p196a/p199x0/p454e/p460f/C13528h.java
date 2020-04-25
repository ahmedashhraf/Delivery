package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import p195e.p196a.C12297q;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.f.h */
/* compiled from: ParallelFromPublisher */
public final class C13528h<T> extends C5922b<T> {

    /* renamed from: a */
    final C6007b<? extends T> f39174a;

    /* renamed from: b */
    final int f39175b;

    /* renamed from: c */
    final int f39176c;

    /* renamed from: e.a.x0.e.f.h$a */
    /* compiled from: ParallelFromPublisher */
    static final class C13529a<T> extends AtomicInteger implements C12297q<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* renamed from: N */
        final long[] f39177N;

        /* renamed from: O */
        final int f39178O;

        /* renamed from: P */
        final int f39179P;

        /* renamed from: Q */
        C14063d f39180Q;

        /* renamed from: R */
        C12406o<T> f39181R;

        /* renamed from: S */
        Throwable f39182S;

        /* renamed from: T */
        volatile boolean f39183T;

        /* renamed from: U */
        int f39184U;

        /* renamed from: V */
        volatile boolean f39185V;

        /* renamed from: W */
        final AtomicInteger f39186W = new AtomicInteger();

        /* renamed from: X */
        int f39187X;

        /* renamed from: Y */
        int f39188Y;

        /* renamed from: a */
        final C14062c<? super T>[] f39189a;

        /* renamed from: b */
        final AtomicLongArray f39190b;

        /* renamed from: e.a.x0.e.f.h$a$a */
        /* compiled from: ParallelFromPublisher */
        final class C13530a implements C14063d {

            /* renamed from: a */
            final int f39192a;

            /* renamed from: b */
            final int f39193b;

            C13530a(int i, int i2) {
                this.f39192a = i;
                this.f39193b = i2;
            }

            /* renamed from: c */
            public void mo41813c(long j) {
                long j2;
                if (C13742j.m58678b(j)) {
                    AtomicLongArray atomicLongArray = C13529a.this.f39190b;
                    do {
                        j2 = atomicLongArray.get(this.f39192a);
                        if (j2 != Long.MAX_VALUE) {
                        } else {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f39192a, j2, C13747d.m58695a(j2, j)));
                    if (C13529a.this.f39186W.get() == this.f39193b) {
                        C13529a.this.mo42956a();
                    }
                }
            }

            public void cancel() {
                if (C13529a.this.f39190b.compareAndSet(this.f39192a + this.f39193b, 0, 1)) {
                    C13529a aVar = C13529a.this;
                    int i = this.f39193b;
                    aVar.mo42957a(i + i);
                }
            }
        }

        C13529a(C14062c<? super T>[] cVarArr, int i) {
            this.f39189a = cVarArr;
            this.f39178O = i;
            this.f39179P = i - (i >> 2);
            int length = cVarArr.length;
            int i2 = length + length;
            this.f39190b = new AtomicLongArray(i2 + 1);
            this.f39190b.lazySet(i2, (long) length);
            this.f39177N = new long[length];
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39180Q, dVar)) {
                this.f39180Q = dVar;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(7);
                    if (a == 1) {
                        this.f39188Y = a;
                        this.f39181R = lVar;
                        this.f39183T = true;
                        mo42960f();
                        mo42956a();
                        return;
                    } else if (a == 2) {
                        this.f39188Y = a;
                        this.f39181R = lVar;
                        mo42960f();
                        dVar.mo41813c((long) this.f39178O);
                        return;
                    }
                }
                this.f39181R = new C13662b(this.f39178O);
                mo42960f();
                dVar.mo41813c((long) this.f39178O);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42958d() {
            C12406o<T> oVar = this.f39181R;
            C14062c<? super T>[] cVarArr = this.f39189a;
            AtomicLongArray atomicLongArray = this.f39190b;
            long[] jArr = this.f39177N;
            int length = jArr.length;
            int i = this.f39184U;
            int i2 = this.f39187X;
            int i3 = 1;
            while (true) {
                int i4 = 0;
                int i5 = i2;
                int i6 = 0;
                while (!this.f39185V) {
                    boolean z = this.f39183T;
                    if (z) {
                        Throwable th = this.f39182S;
                        if (th != null) {
                            oVar.clear();
                            int length2 = cVarArr.length;
                            while (i4 < length2) {
                                cVarArr[i4].onError(th);
                                i4++;
                            }
                            return;
                        }
                    }
                    boolean isEmpty = oVar.isEmpty();
                    if (!z || !isEmpty) {
                        if (!isEmpty) {
                            long j = atomicLongArray.get(i);
                            long j2 = jArr[i];
                            if (j == j2 || atomicLongArray.get(length + i) != 0) {
                                i6++;
                            } else {
                                try {
                                    Object poll = oVar.poll();
                                    if (poll != null) {
                                        cVarArr[i].mo41789a(poll);
                                        jArr[i] = j2 + 1;
                                        int i7 = i5 + 1;
                                        if (i7 == this.f39179P) {
                                            this.f39180Q.mo41813c((long) i7);
                                            i7 = 0;
                                        }
                                        i5 = i7;
                                        i6 = 0;
                                    }
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    C14398a.m62357b(th3);
                                    this.f39180Q.cancel();
                                    int length3 = cVarArr.length;
                                    while (i4 < length3) {
                                        cVarArr[i4].onError(th3);
                                        i4++;
                                    }
                                    return;
                                }
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                                continue;
                            }
                            if (i6 == length) {
                            }
                        }
                        i2 = i5;
                        int i8 = get();
                        if (i8 == i3) {
                            this.f39184U = i;
                            this.f39187X = i2;
                            i3 = addAndGet(-i3);
                            if (i3 == 0) {
                                return;
                            }
                        } else {
                            i3 = i8;
                        }
                    } else {
                        int length4 = cVarArr.length;
                        while (i4 < length4) {
                            cVarArr[i4].onComplete();
                            i4++;
                        }
                        return;
                    }
                }
                oVar.clear();
                return;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42959e() {
            C12406o<T> oVar = this.f39181R;
            C14062c<? super T>[] cVarArr = this.f39189a;
            AtomicLongArray atomicLongArray = this.f39190b;
            long[] jArr = this.f39177N;
            int length = jArr.length;
            int i = this.f39184U;
            int i2 = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.f39185V) {
                    if (oVar.isEmpty()) {
                        int length2 = cVarArr.length;
                        while (i3 < length2) {
                            cVarArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i4++;
                    } else {
                        try {
                            Object poll = oVar.poll();
                            if (poll == null) {
                                int length3 = cVarArr.length;
                                while (i3 < length3) {
                                    cVarArr[i3].onComplete();
                                    i3++;
                                }
                                return;
                            }
                            cVarArr[i].mo41789a(poll);
                            jArr[i] = j2 + 1;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            C14398a.m62357b(th2);
                            this.f39180Q.cancel();
                            int length4 = cVarArr.length;
                            while (i3 < length4) {
                                cVarArr[i3].onError(th2);
                                i3++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                        continue;
                    }
                    if (i4 == length) {
                        int i5 = get();
                        if (i5 == i2) {
                            this.f39184U = i;
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            i2 = i5;
                        }
                    }
                }
                oVar.clear();
                return;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42960f() {
            C14062c<? super T>[] cVarArr = this.f39189a;
            int length = cVarArr.length;
            int i = 0;
            while (i < length && !this.f39185V) {
                int i2 = i + 1;
                this.f39186W.lazySet(i2);
                cVarArr[i].mo41788a((C14063d) new C13530a(i, length));
                i = i2;
            }
        }

        public void onComplete() {
            this.f39183T = true;
            mo42956a();
        }

        public void onError(Throwable th) {
            this.f39182S = th;
            this.f39183T = true;
            mo42956a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f39188Y != 0 || this.f39181R.offer(t)) {
                mo42956a();
                return;
            }
            this.f39180Q.cancel();
            onError(new MissingBackpressureException("Queue is full?"));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42957a(int i) {
            if (this.f39190b.decrementAndGet(i) == 0) {
                this.f39185V = true;
                this.f39180Q.cancel();
                if (getAndIncrement() == 0) {
                    this.f39181R.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42956a() {
            if (getAndIncrement() == 0) {
                if (this.f39188Y == 1) {
                    mo42959e();
                } else {
                    mo42958d();
                }
            }
        }
    }

    public C13528h(C6007b<? extends T> bVar, int i, int i2) {
        this.f39174a = bVar;
        this.f39175b = i;
        this.f39176c = i2;
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39175b;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            this.f39174a.mo24397a(new C13529a(cVarArr, this.f39176c));
        }
    }
}
