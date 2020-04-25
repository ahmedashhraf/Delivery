package p195e.p196a.p442e1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.h */
/* compiled from: SingleSubject */
public final class C12263h<T> extends C5928k0<T> implements C12292n0<T> {

    /* renamed from: P */
    static final C12264a[] f35430P = new C12264a[0];

    /* renamed from: Q */
    static final C12264a[] f35431Q = new C12264a[0];

    /* renamed from: N */
    T f35432N;

    /* renamed from: O */
    Throwable f35433O;

    /* renamed from: a */
    final AtomicReference<C12264a<T>[]> f35434a = new AtomicReference<>(f35430P);

    /* renamed from: b */
    final AtomicBoolean f35435b = new AtomicBoolean();

    /* renamed from: e.a.e1.h$a */
    /* compiled from: SingleSubject */
    static final class C12264a<T> extends AtomicReference<C12263h<T>> implements C12314c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final C12292n0<? super T> f35436a;

        C12264a(C12292n0<? super T> n0Var, C12263h<T> hVar) {
            this.f35436a = n0Var;
            lazySet(hVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == null;
        }

        public void dispose() {
            C12263h hVar = (C12263h) getAndSet(null);
            if (hVar != null) {
                hVar.mo41976b(this);
            }
        }
    }

    C12263h() {
    }

    @C5935d
    @C5937f
    /* renamed from: y */
    public static <T> C12263h<T> m55249y() {
        return new C12263h<>();
    }

    /* renamed from: a */
    public void mo41974a(@C5937f C12314c cVar) {
        if (this.f35434a.get() == f35431Q) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(@C5937f C12292n0<? super T> n0Var) {
        C12264a aVar = new C12264a(n0Var, this);
        n0Var.mo41974a(aVar);
        if (!mo41975a(aVar)) {
            Throwable th = this.f35433O;
            if (th != null) {
                n0Var.onError(th);
            } else {
                n0Var.onSuccess(this.f35432N);
            }
        } else if (aVar.mo41878d()) {
            mo41976b(aVar);
        }
    }

    public void onError(@C5937f Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35435b.compareAndSet(false, true)) {
            this.f35433O = th;
            for (C12264a aVar : (C12264a[]) this.f35434a.getAndSet(f35431Q)) {
                aVar.f35436a.onError(th);
            }
            return;
        }
        C12205a.m54894b(th);
    }

    public void onSuccess(@C5937f T t) {
        C12390b.m55563a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35435b.compareAndSet(false, true)) {
            this.f35432N = t;
            for (C12264a aVar : (C12264a[]) this.f35434a.getAndSet(f35431Q)) {
                aVar.f35436a.onSuccess(t);
            }
        }
    }

    @C5938g
    /* renamed from: s */
    public Throwable mo41979s() {
        if (this.f35434a.get() == f35431Q) {
            return this.f35433O;
        }
        return null;
    }

    @C5938g
    /* renamed from: t */
    public T mo41980t() {
        if (this.f35434a.get() == f35431Q) {
            return this.f35432N;
        }
        return null;
    }

    /* renamed from: u */
    public boolean mo41981u() {
        return ((C12264a[]) this.f35434a.get()).length != 0;
    }

    /* renamed from: v */
    public boolean mo41982v() {
        return this.f35434a.get() == f35431Q && this.f35433O != null;
    }

    /* renamed from: w */
    public boolean mo41983w() {
        return this.f35434a.get() == f35431Q && this.f35432N != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public int mo41984x() {
        return ((C12264a[]) this.f35434a.get()).length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41975a(@C5937f C12264a<T> aVar) {
        C12264a[] aVarArr;
        C12264a[] aVarArr2;
        do {
            aVarArr = (C12264a[]) this.f35434a.get();
            if (aVarArr == f35431Q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12264a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35434a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41976b(@C5937f C12264a<T> aVar) {
        C12264a<T>[] aVarArr;
        C12264a[] aVarArr2;
        do {
            aVarArr = (C12264a[]) this.f35434a.get();
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
                        aVarArr2 = f35430P;
                    } else {
                        C12264a[] aVarArr3 = new C12264a[(length - 1)];
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
        } while (!this.f35434a.compareAndSet(aVarArr, aVarArr2));
    }
}
