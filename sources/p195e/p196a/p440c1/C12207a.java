package p195e.p196a.p440c1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.c1.a */
/* compiled from: AsyncProcessor */
public final class C12207a<T> extends C12211c<T> {

    /* renamed from: P */
    static final C12208a[] f35251P = new C12208a[0];

    /* renamed from: Q */
    static final C12208a[] f35252Q = new C12208a[0];

    /* renamed from: N */
    Throwable f35253N;

    /* renamed from: O */
    T f35254O;

    /* renamed from: b */
    final AtomicReference<C12208a<T>[]> f35255b = new AtomicReference<>(f35251P);

    /* renamed from: e.a.c1.a$a */
    /* compiled from: AsyncProcessor */
    static final class C12208a<T> extends C13738f<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* renamed from: V */
        final C12207a<T> f35256V;

        C12208a(C14062c<? super T> cVar, C12207a<T> aVar) {
            super(cVar);
            this.f35256V = aVar;
        }

        public void cancel() {
            if (super.mo43125e()) {
                this.f35256V.mo41792b(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void onComplete() {
            if (!mo43124d()) {
                this.f39781a.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        public void onError(Throwable th) {
            if (mo43124d()) {
                C12205a.m54894b(th);
            } else {
                this.f39781a.onError(th);
            }
        }
    }

    C12207a() {
    }

    @C5935d
    @C5937f
    /* renamed from: c0 */
    public static <T> C12207a<T> m54946c0() {
        return new C12207a<>();
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        if (this.f35255b.get() == f35252Q) {
            return this.f35253N;
        }
        return null;
    }

    /* renamed from: V */
    public boolean mo41784V() {
        return this.f35255b.get() == f35252Q && this.f35253N == null;
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return ((C12208a[]) this.f35255b.get()).length != 0;
    }

    /* renamed from: X */
    public boolean mo41786X() {
        return this.f35255b.get() == f35252Q && this.f35253N != null;
    }

    @C5938g
    /* renamed from: Z */
    public T mo41787Z() {
        if (this.f35255b.get() == f35252Q) {
            return this.f35254O;
        }
        return null;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f35255b.get() == f35252Q) {
            dVar.cancel();
        } else {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: a0 */
    public Object[] mo41791a0() {
        Object Z = mo41787Z();
        if (Z == null) {
            return new Object[0];
        }
        return new Object[]{Z};
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41792b(C12208a<T> aVar) {
        C12208a<T>[] aVarArr;
        C12208a[] aVarArr2;
        do {
            aVarArr = (C12208a[]) this.f35255b.get();
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
                        aVarArr2 = f35251P;
                    } else {
                        C12208a[] aVarArr3 = new C12208a[(length - 1)];
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
        } while (!this.f35255b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: b0 */
    public boolean mo41793b0() {
        return this.f35255b.get() == f35252Q && this.f35254O != null;
    }

    /* renamed from: c */
    public T[] mo41794c(T[] tArr) {
        T Z = mo41787Z();
        if (Z == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = Arrays.copyOf(tArr, 1);
        }
        tArr[0] = Z;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12208a aVar = new C12208a(cVar, this);
        cVar.mo41788a((C14063d) aVar);
        if (!mo41790a(aVar)) {
            Throwable th = this.f35253N;
            if (th != null) {
                cVar.onError(th);
                return;
            }
            T t = this.f35254O;
            if (t != null) {
                aVar.mo43123c(t);
            } else {
                aVar.onComplete();
            }
        } else if (aVar.mo43124d()) {
            mo41792b(aVar);
        }
    }

    public void onComplete() {
        Object obj = this.f35255b.get();
        Object obj2 = f35252Q;
        if (obj != obj2) {
            T t = this.f35254O;
            C12208a[] aVarArr = (C12208a[]) this.f35255b.getAndSet(obj2);
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
                    aVarArr[i].mo43123c(t);
                    i++;
                }
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f35255b.get();
        Object obj2 = f35252Q;
        if (obj == obj2) {
            C12205a.m54894b(th);
            return;
        }
        this.f35254O = null;
        this.f35253N = th;
        for (C12208a onError : (C12208a[]) this.f35255b.getAndSet(obj2)) {
            onError.onError(th);
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35255b.get() != f35252Q) {
            this.f35254O = t;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41790a(C12208a<T> aVar) {
        C12208a[] aVarArr;
        C12208a[] aVarArr2;
        do {
            aVarArr = (C12208a[]) this.f35255b.get();
            if (aVarArr == f35252Q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12208a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35255b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
