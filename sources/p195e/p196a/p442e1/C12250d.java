package p195e.p196a.p442e1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.d */
/* compiled from: MaybeSubject */
public final class C12250d<T> extends C5931s<T> implements C12321v<T> {

    /* renamed from: P */
    static final C12251a[] f35384P = new C12251a[0];

    /* renamed from: Q */
    static final C12251a[] f35385Q = new C12251a[0];

    /* renamed from: N */
    T f35386N;

    /* renamed from: O */
    Throwable f35387O;

    /* renamed from: a */
    final AtomicReference<C12251a<T>[]> f35388a = new AtomicReference<>(f35384P);

    /* renamed from: b */
    final AtomicBoolean f35389b = new AtomicBoolean();

    /* renamed from: e.a.e1.d$a */
    /* compiled from: MaybeSubject */
    static final class C12251a<T> extends AtomicReference<C12250d<T>> implements C12314c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final C12321v<? super T> f35390a;

        C12251a(C12321v<? super T> vVar, C12250d<T> dVar) {
            this.f35390a = vVar;
            lazySet(dVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == null;
        }

        public void dispose() {
            C12250d dVar = (C12250d) getAndSet(null);
            if (dVar != null) {
                dVar.mo41933b(this);
            }
        }
    }

    C12250d() {
    }

    @C5935d
    @C5937f
    /* renamed from: A */
    public static <T> C12250d<T> m55168A() {
        return new C12250d<>();
    }

    /* renamed from: a */
    public void mo41931a(C12314c cVar) {
        if (this.f35388a.get() == f35385Q) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12251a aVar = new C12251a(vVar, this);
        vVar.mo41931a(aVar);
        if (!mo41932a(aVar)) {
            Throwable th = this.f35387O;
            if (th != null) {
                vVar.onError(th);
                return;
            }
            T t = this.f35386N;
            if (t == null) {
                vVar.onComplete();
            } else {
                vVar.onSuccess(t);
            }
        } else if (aVar.mo41878d()) {
            mo41933b(aVar);
        }
    }

    public void onComplete() {
        if (this.f35389b.compareAndSet(false, true)) {
            for (C12251a aVar : (C12251a[]) this.f35388a.getAndSet(f35385Q)) {
                aVar.f35390a.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35389b.compareAndSet(false, true)) {
            this.f35387O = th;
            for (C12251a aVar : (C12251a[]) this.f35388a.getAndSet(f35385Q)) {
                aVar.f35390a.onError(th);
            }
            return;
        }
        C12205a.m54894b(th);
    }

    public void onSuccess(T t) {
        C12390b.m55563a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35389b.compareAndSet(false, true)) {
            this.f35386N = t;
            for (C12251a aVar : (C12251a[]) this.f35388a.getAndSet(f35385Q)) {
                aVar.f35390a.onSuccess(t);
            }
        }
    }

    @C5938g
    /* renamed from: t */
    public Throwable mo41937t() {
        if (this.f35388a.get() == f35385Q) {
            return this.f35387O;
        }
        return null;
    }

    @C5938g
    /* renamed from: u */
    public T mo41938u() {
        if (this.f35388a.get() == f35385Q) {
            return this.f35386N;
        }
        return null;
    }

    /* renamed from: v */
    public boolean mo41939v() {
        return this.f35388a.get() == f35385Q && this.f35386N == null && this.f35387O == null;
    }

    /* renamed from: w */
    public boolean mo41940w() {
        return ((C12251a[]) this.f35388a.get()).length != 0;
    }

    /* renamed from: x */
    public boolean mo41941x() {
        return this.f35388a.get() == f35385Q && this.f35387O != null;
    }

    /* renamed from: y */
    public boolean mo41942y() {
        return this.f35388a.get() == f35385Q && this.f35386N != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public int mo41943z() {
        return ((C12251a[]) this.f35388a.get()).length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41932a(C12251a<T> aVar) {
        C12251a[] aVarArr;
        C12251a[] aVarArr2;
        do {
            aVarArr = (C12251a[]) this.f35388a.get();
            if (aVarArr == f35385Q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12251a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35388a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41933b(C12251a<T> aVar) {
        C12251a<T>[] aVarArr;
        C12251a[] aVarArr2;
        do {
            aVarArr = (C12251a[]) this.f35388a.get();
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
                        aVarArr2 = f35384P;
                    } else {
                        C12251a[] aVarArr3 = new C12251a[(length - 1)];
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
        } while (!this.f35388a.compareAndSet(aVarArr, aVarArr2));
    }
}
