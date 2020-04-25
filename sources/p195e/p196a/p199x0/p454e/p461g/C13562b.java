package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.b */
/* compiled from: SingleCache */
public final class C13562b<T> extends C5928k0<T> implements C12292n0<T> {

    /* renamed from: Q */
    static final C13563a[] f39301Q = new C13563a[0];

    /* renamed from: R */
    static final C13563a[] f39302R = new C13563a[0];

    /* renamed from: N */
    final AtomicReference<C13563a<T>[]> f39303N = new AtomicReference<>(f39301Q);

    /* renamed from: O */
    T f39304O;

    /* renamed from: P */
    Throwable f39305P;

    /* renamed from: a */
    final C5930q0<? extends T> f39306a;

    /* renamed from: b */
    final AtomicInteger f39307b = new AtomicInteger();

    /* renamed from: e.a.x0.e.g.b$a */
    /* compiled from: SingleCache */
    static final class C13563a<T> extends AtomicBoolean implements C12314c {
        private static final long serialVersionUID = 7514387411091976596L;

        /* renamed from: a */
        final C12292n0<? super T> f39308a;

        /* renamed from: b */
        final C13562b<T> f39309b;

        C13563a(C12292n0<? super T> n0Var, C13562b<T> bVar) {
            this.f39308a = n0Var;
            this.f39309b = bVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f39309b.mo42992b(this);
            }
        }
    }

    public C13562b(C5930q0<? extends T> q0Var) {
        this.f39306a = q0Var;
    }

    /* renamed from: a */
    public void mo41974a(C12314c cVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo42991a(C13563a<T> aVar) {
        C13563a[] aVarArr;
        C13563a[] aVarArr2;
        do {
            aVarArr = (C13563a[]) this.f39303N.get();
            if (aVarArr == f39302R) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C13563a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f39303N.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C13563a aVar = new C13563a(n0Var, this);
        n0Var.mo41974a(aVar);
        if (mo42991a(aVar)) {
            if (aVar.mo41878d()) {
                mo42992b(aVar);
            }
            if (this.f39307b.getAndIncrement() == 0) {
                this.f39306a.mo24192a(this);
            }
            return;
        }
        Throwable th = this.f39305P;
        if (th != null) {
            n0Var.onError(th);
        } else {
            n0Var.onSuccess(this.f39304O);
        }
    }

    public void onError(Throwable th) {
        C13563a[] aVarArr;
        this.f39305P = th;
        for (C13563a aVar : (C13563a[]) this.f39303N.getAndSet(f39302R)) {
            if (!aVar.mo41878d()) {
                aVar.f39308a.onError(th);
            }
        }
    }

    public void onSuccess(T t) {
        C13563a[] aVarArr;
        this.f39304O = t;
        for (C13563a aVar : (C13563a[]) this.f39303N.getAndSet(f39302R)) {
            if (!aVar.mo41878d()) {
                aVar.f39308a.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo42992b(C13563a<T> aVar) {
        C13563a<T>[] aVarArr;
        C13563a[] aVarArr2;
        do {
            aVarArr = (C13563a[]) this.f39303N.get();
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
                        aVarArr2 = f39301Q;
                    } else {
                        C13563a[] aVarArr3 = new C13563a[(length - 1)];
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
        } while (!this.f39303N.compareAndSet(aVarArr, aVarArr2));
    }
}
