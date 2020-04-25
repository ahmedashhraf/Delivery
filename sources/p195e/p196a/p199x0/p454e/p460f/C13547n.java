package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.n */
/* compiled from: ParallelReduceFull */
public final class C13547n<T> extends C5929l<T> {

    /* renamed from: N */
    final C12327c<T, T, T> f39251N;

    /* renamed from: b */
    final C5922b<? extends T> f39252b;

    /* renamed from: e.a.x0.e.f.n$a */
    /* compiled from: ParallelReduceFull */
    static final class C13548a<T> extends AtomicReference<C14063d> implements C12297q<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* renamed from: N */
        T f39253N;

        /* renamed from: O */
        boolean f39254O;

        /* renamed from: a */
        final C13549b<T> f39255a;

        /* renamed from: b */
        final C12327c<T, T, T> f39256b;

        C13548a(C13549b<T> bVar, C12327c<T, T, T> cVar) {
            this.f39255a = bVar;
            this.f39256b = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        public void onComplete() {
            if (!this.f39254O) {
                this.f39254O = true;
                this.f39255a.mo42977e(this.f39253N);
            }
        }

        public void onError(Throwable th) {
            if (this.f39254O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39254O = true;
            this.f39255a.mo42975a(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39254O) {
                T t2 = this.f39253N;
                if (t2 == null) {
                    this.f39253N = t;
                    return;
                }
                try {
                    this.f39253N = C12390b.m55563a(this.f39256b.mo35569a(t2, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    ((C14063d) get()).cancel();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42974a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    /* renamed from: e.a.x0.e.f.n$b */
    /* compiled from: ParallelReduceFull */
    static final class C13549b<T> extends C13738f<T> {
        private static final long serialVersionUID = -5370107872170712765L;

        /* renamed from: V */
        final C13548a<T>[] f39257V;

        /* renamed from: W */
        final C12327c<T, T, T> f39258W;

        /* renamed from: X */
        final AtomicReference<C13550c<T>> f39259X = new AtomicReference<>();

        /* renamed from: Y */
        final AtomicInteger f39260Y = new AtomicInteger();

        /* renamed from: Z */
        final AtomicReference<Throwable> f39261Z = new AtomicReference<>();

        C13549b(C14062c<? super T> cVar, int i, C12327c<T, T, T> cVar2) {
            super(cVar);
            C13548a<T>[] aVarArr = new C13548a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = new C13548a<>(this, cVar2);
            }
            this.f39257V = aVarArr;
            this.f39258W = cVar2;
            this.f39260Y.lazySet(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42975a(Throwable th) {
            if (this.f39261Z.compareAndSet(null, th)) {
                cancel();
                this.f39781a.onError(th);
            } else if (th != this.f39261Z.get()) {
                C12205a.m54894b(th);
            }
        }

        public void cancel() {
            for (C13548a<T> a : this.f39257V) {
                a.mo42974a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C13550c<T> mo42976d(T t) {
            C13550c<T> cVar;
            int d;
            while (true) {
                cVar = (C13550c) this.f39259X.get();
                if (cVar == null) {
                    cVar = new C13550c<>();
                    if (!this.f39259X.compareAndSet(null, cVar)) {
                        continue;
                    }
                }
                d = cVar.mo42979d();
                if (d >= 0) {
                    break;
                }
                this.f39259X.compareAndSet(cVar, null);
            }
            if (d == 0) {
                cVar.f39263a = t;
            } else {
                cVar.f39264b = t;
            }
            if (!cVar.mo42978a()) {
                return null;
            }
            this.f39259X.compareAndSet(cVar, null);
            return cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42977e(T t) {
            if (t != null) {
                while (true) {
                    C13550c d = mo42976d(t);
                    if (d == null) {
                        break;
                    }
                    try {
                        t = C12390b.m55563a(this.f39258W.mo35569a(d.f39263a, d.f39264b), "The reducer returned a null value");
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        mo42975a(th);
                        return;
                    }
                }
            }
            if (this.f39260Y.decrementAndGet() == 0) {
                C13550c cVar = (C13550c) this.f39259X.get();
                this.f39259X.lazySet(null);
                if (cVar != null) {
                    mo43123c(cVar.f39263a);
                } else {
                    this.f39781a.onComplete();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.f.n$c */
    /* compiled from: ParallelReduceFull */
    static final class C13550c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        /* renamed from: N */
        final AtomicInteger f39262N = new AtomicInteger();

        /* renamed from: a */
        T f39263a;

        /* renamed from: b */
        T f39264b;

        C13550c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42978a() {
            return this.f39262N.incrementAndGet() == 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo42979d() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }
    }

    public C13547n(C5922b<? extends T> bVar, C12327c<T, T, T> cVar) {
        this.f39252b = bVar;
        this.f39251N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13549b bVar = new C13549b(cVar, this.f39252b.mo23713a(), this.f39251N);
        cVar.mo41788a((C14063d) bVar);
        this.f39252b.mo23740a((C14062c<? super T>[]) bVar.f39257V);
    }
}
