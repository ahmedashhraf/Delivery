package p195e.p196a.p440c1;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.c1.d */
/* compiled from: PublishProcessor */
public final class C12212d<T> extends C12211c<T> {

    /* renamed from: O */
    static final C12213a[] f35275O = new C12213a[0];

    /* renamed from: P */
    static final C12213a[] f35276P = new C12213a[0];

    /* renamed from: N */
    Throwable f35277N;

    /* renamed from: b */
    final AtomicReference<C12213a<T>[]> f35278b = new AtomicReference<>(f35276P);

    /* renamed from: e.a.c1.d$a */
    /* compiled from: PublishProcessor */
    static final class C12213a<T> extends AtomicLong implements C14063d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C14062c<? super T> f35279a;

        /* renamed from: b */
        final C12212d<T> f35280b;

        C12213a(C14062c<? super T> cVar, C12212d<T> dVar) {
            this.f35279a = cVar;
            this.f35280b = dVar;
        }

        /* renamed from: a */
        public void mo41820a(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.f35279a.mo41789a(t);
                    C13747d.m58700d(this, 1);
                } else {
                    cancel();
                    this.f35279a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58698b((AtomicLong) this, j);
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f35280b.mo41818b(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo41823d() {
            return get() == 0;
        }

        /* renamed from: e */
        public void mo41824e() {
            if (get() != Long.MIN_VALUE) {
                this.f35279a.onComplete();
            }
        }

        /* renamed from: a */
        public void mo41821a(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f35279a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public boolean mo41822a() {
            return get() == Long.MIN_VALUE;
        }
    }

    C12212d() {
    }

    @C5935d
    @C5937f
    /* renamed from: Z */
    public static <T> C12212d<T> m54990Z() {
        return new C12212d<>();
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        if (this.f35278b.get() == f35275O) {
            return this.f35277N;
        }
        return null;
    }

    /* renamed from: V */
    public boolean mo41784V() {
        return this.f35278b.get() == f35275O && this.f35277N == null;
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return ((C12213a[]) this.f35278b.get()).length != 0;
    }

    /* renamed from: X */
    public boolean mo41786X() {
        return this.f35278b.get() == f35275O && this.f35277N != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41817a(C12213a<T> aVar) {
        C12213a[] aVarArr;
        C12213a[] aVarArr2;
        do {
            aVarArr = (C12213a[]) this.f35278b.get();
            if (aVarArr == f35275O) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12213a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35278b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41818b(C12213a<T> aVar) {
        C12213a<T>[] aVarArr;
        C12213a[] aVarArr2;
        do {
            aVarArr = (C12213a[]) this.f35278b.get();
            if (aVarArr != f35275O && aVarArr != f35276P) {
                int length = aVarArr.length;
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
                        aVarArr2 = f35276P;
                    } else {
                        C12213a[] aVarArr3 = new C12213a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f35278b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12213a aVar = new C12213a(cVar, this);
        cVar.mo41788a((C14063d) aVar);
        if (!mo41817a(aVar)) {
            Throwable th = this.f35277N;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        } else if (aVar.mo41822a()) {
            mo41818b(aVar);
        }
    }

    public void onComplete() {
        Object obj = this.f35278b.get();
        Object obj2 = f35275O;
        if (obj != obj2) {
            for (C12213a e : (C12213a[]) this.f35278b.getAndSet(obj2)) {
                e.mo41824e();
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f35278b.get();
        Object obj2 = f35275O;
        if (obj == obj2) {
            C12205a.m54894b(th);
            return;
        }
        this.f35277N = th;
        for (C12213a a : (C12213a[]) this.f35278b.getAndSet(obj2)) {
            a.mo41821a(th);
        }
    }

    @C5936e
    /* renamed from: p */
    public boolean mo41819p(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        C12213a[] aVarArr = (C12213a[]) this.f35278b.get();
        for (C12213a d : aVarArr) {
            if (d.mo41823d()) {
                return false;
            }
        }
        for (C12213a a : aVarArr) {
            a.mo41820a(t);
        }
        return true;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f35278b.get() == f35275O) {
            dVar.cancel();
        } else {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C12213a a : (C12213a[]) this.f35278b.get()) {
            a.mo41820a(t);
        }
    }
}
