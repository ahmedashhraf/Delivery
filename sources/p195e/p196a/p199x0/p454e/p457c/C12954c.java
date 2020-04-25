package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.c.c */
/* compiled from: MaybeCache */
public final class C12954c<T> extends C5931s<T> implements C12321v<T> {

    /* renamed from: P */
    static final C12955a[] f37364P = new C12955a[0];

    /* renamed from: Q */
    static final C12955a[] f37365Q = new C12955a[0];

    /* renamed from: N */
    T f37366N;

    /* renamed from: O */
    Throwable f37367O;

    /* renamed from: a */
    final AtomicReference<C5941y<T>> f37368a;

    /* renamed from: b */
    final AtomicReference<C12955a<T>[]> f37369b = new AtomicReference<>(f37364P);

    /* renamed from: e.a.x0.e.c.c$a */
    /* compiled from: MaybeCache */
    static final class C12955a<T> extends AtomicReference<C12954c<T>> implements C12314c {
        private static final long serialVersionUID = -5791853038359966195L;

        /* renamed from: a */
        final C12321v<? super T> f37370a;

        C12955a(C12321v<? super T> vVar, C12954c<T> cVar) {
            super(cVar);
            this.f37370a = vVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == null;
        }

        public void dispose() {
            C12954c cVar = (C12954c) getAndSet(null);
            if (cVar != null) {
                cVar.mo42563b(this);
            }
        }
    }

    public C12954c(C5941y<T> yVar) {
        this.f37368a = new AtomicReference<>(yVar);
    }

    /* renamed from: a */
    public void mo41931a(C12314c cVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo42562a(C12955a<T> aVar) {
        C12955a[] aVarArr;
        C12955a[] aVarArr2;
        do {
            aVarArr = (C12955a[]) this.f37369b.get();
            if (aVarArr == f37365Q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12955a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f37369b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12955a aVar = new C12955a(vVar, this);
        vVar.mo41931a(aVar);
        if (!mo42562a(aVar)) {
            if (!aVar.mo41878d()) {
                Throwable th = this.f37367O;
                if (th != null) {
                    vVar.onError(th);
                } else {
                    T t = this.f37366N;
                    if (t != null) {
                        vVar.onSuccess(t);
                    } else {
                        vVar.onComplete();
                    }
                }
            }
        } else if (aVar.mo41878d()) {
            mo42563b(aVar);
        } else {
            C5941y yVar = (C5941y) this.f37368a.getAndSet(null);
            if (yVar != null) {
                yVar.mo24639a(this);
            }
        }
    }

    public void onComplete() {
        C12955a[] aVarArr;
        for (C12955a aVar : (C12955a[]) this.f37369b.getAndSet(f37365Q)) {
            if (!aVar.mo41878d()) {
                aVar.f37370a.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12955a[] aVarArr;
        this.f37367O = th;
        for (C12955a aVar : (C12955a[]) this.f37369b.getAndSet(f37365Q)) {
            if (!aVar.mo41878d()) {
                aVar.f37370a.onError(th);
            }
        }
    }

    public void onSuccess(T t) {
        C12955a[] aVarArr;
        this.f37366N = t;
        for (C12955a aVar : (C12955a[]) this.f37369b.getAndSet(f37365Q)) {
            if (!aVar.mo41878d()) {
                aVar.f37370a.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo42563b(C12955a<T> aVar) {
        C12955a<T>[] aVarArr;
        C12955a[] aVarArr2;
        do {
            aVarArr = (C12955a[]) this.f37369b.get();
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
                        aVarArr2 = f37364P;
                    } else {
                        C12955a[] aVarArr3 = new C12955a[(length - 1)];
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
        } while (!this.f37369b.compareAndSet(aVarArr, aVarArr2));
    }
}
