package p195e.p196a.p442e1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12419l;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.a */
/* compiled from: AsyncSubject */
public final class C12244a<T> extends C12265i<T> {

    /* renamed from: O */
    static final C12245a[] f35354O = new C12245a[0];

    /* renamed from: P */
    static final C12245a[] f35355P = new C12245a[0];

    /* renamed from: N */
    T f35356N;

    /* renamed from: a */
    final AtomicReference<C12245a<T>[]> f35357a = new AtomicReference<>(f35354O);

    /* renamed from: b */
    Throwable f35358b;

    /* renamed from: e.a.e1.a$a */
    /* compiled from: AsyncSubject */
    static final class C12245a<T> extends C12419l<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* renamed from: S */
        final C12244a<T> f35359S;

        C12245a(C12280i0<? super T> i0Var, C12244a<T> aVar) {
            super(i0Var);
            this.f35359S = aVar;
        }

        public void dispose() {
            if (super.mo42164e()) {
                this.f35359S.mo41905b(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void onComplete() {
            if (!mo41878d()) {
                this.f35574a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        public void onError(Throwable th) {
            if (mo41878d()) {
                C12205a.m54894b(th);
            } else {
                this.f35574a.onError(th);
            }
        }
    }

    C12244a() {
    }

    @C5935d
    @C5937f
    /* renamed from: X */
    public static <T> C12244a<T> m55120X() {
        return new C12244a<>();
    }

    /* renamed from: P */
    public Throwable mo41897P() {
        if (this.f35357a.get() == f35355P) {
            return this.f35358b;
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return this.f35357a.get() == f35355P && this.f35358b == null;
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return ((C12245a[]) this.f35357a.get()).length != 0;
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return this.f35357a.get() == f35355P && this.f35358b != null;
    }

    @C5938g
    /* renamed from: U */
    public T mo41901U() {
        if (this.f35357a.get() == f35355P) {
            return this.f35356N;
        }
        return null;
    }

    /* renamed from: V */
    public Object[] mo41902V() {
        Object U = mo41901U();
        if (U == null) {
            return new Object[0];
        }
        return new Object[]{U};
    }

    /* renamed from: W */
    public boolean mo41903W() {
        return this.f35357a.get() == f35355P && this.f35356N != null;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (this.f35357a.get() == f35355P) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41905b(C12245a<T> aVar) {
        C12245a<T>[] aVarArr;
        C12245a[] aVarArr2;
        do {
            aVarArr = (C12245a[]) this.f35357a.get();
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
                        aVarArr2 = f35354O;
                    } else {
                        C12245a[] aVarArr3 = new C12245a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f35357a.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: c */
    public T[] mo41906c(T[] tArr) {
        T U = mo41901U();
        if (U == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = Arrays.copyOf(tArr, 1);
        }
        tArr[0] = U;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12245a aVar = new C12245a(i0Var, this);
        i0Var.mo34123a((C12314c) aVar);
        if (!mo41904a(aVar)) {
            Throwable th = this.f35358b;
            if (th != null) {
                i0Var.onError(th);
                return;
            }
            T t = this.f35356N;
            if (t != null) {
                aVar.mo42163b(t);
            } else {
                aVar.onComplete();
            }
        } else if (aVar.mo41878d()) {
            mo41905b(aVar);
        }
    }

    public void onComplete() {
        Object obj = this.f35357a.get();
        Object obj2 = f35355P;
        if (obj != obj2) {
            T t = this.f35356N;
            C12245a[] aVarArr = (C12245a[]) this.f35357a.getAndSet(obj2);
            int i = 0;
            if (t == null) {
                int length = aVarArr.length;
                while (i < length) {
                    aVarArr[i].onComplete();
                    i++;
                }
            } else {
                int length2 = aVarArr.length;
                while (i < length2) {
                    aVarArr[i].mo42163b(t);
                    i++;
                }
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f35357a.get();
        Object obj2 = f35355P;
        if (obj == obj2) {
            C12205a.m54894b(th);
            return;
        }
        this.f35356N = null;
        this.f35358b = th;
        for (C12245a onError : (C12245a[]) this.f35357a.getAndSet(obj2)) {
            onError.onError(th);
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35357a.get() != f35355P) {
            this.f35356N = t;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41904a(C12245a<T> aVar) {
        C12245a[] aVarArr;
        C12245a[] aVarArr2;
        do {
            aVarArr = (C12245a[]) this.f35357a.get();
            if (aVarArr == f35355P) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12245a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35357a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
