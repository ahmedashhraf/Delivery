package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p447u0.C12314c;

@C5936e
/* renamed from: e.a.x0.e.a.b */
/* compiled from: CompletableCache */
public final class C12438b extends C5925c implements C12268f {

    /* renamed from: P */
    static final C12439a[] f35648P = new C12439a[0];

    /* renamed from: Q */
    static final C12439a[] f35649Q = new C12439a[0];

    /* renamed from: N */
    final AtomicBoolean f35650N = new AtomicBoolean();

    /* renamed from: O */
    Throwable f35651O;

    /* renamed from: a */
    final C5927i f35652a;

    /* renamed from: b */
    final AtomicReference<C12439a[]> f35653b = new AtomicReference<>(f35648P);

    /* renamed from: e.a.x0.e.a.b$a */
    /* compiled from: CompletableCache */
    final class C12439a extends AtomicBoolean implements C12314c {
        private static final long serialVersionUID = 8943152917179642732L;

        /* renamed from: a */
        final C12268f f35654a;

        C12439a(C12268f fVar) {
            this.f35654a = fVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                C12438b.this.mo42194b(this);
            }
        }
    }

    public C12438b(C5927i iVar) {
        this.f35652a = iVar;
    }

    /* renamed from: a */
    public void mo41921a(C12314c cVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo42193a(C12439a aVar) {
        C12439a[] aVarArr;
        C12439a[] aVarArr2;
        do {
            aVarArr = (C12439a[]) this.f35653b.get();
            if (aVarArr == f35649Q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12439a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35653b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12439a aVar = new C12439a(fVar);
        fVar.mo41921a(aVar);
        if (mo42193a(aVar)) {
            if (aVar.mo41878d()) {
                mo42194b(aVar);
            }
            if (this.f35650N.compareAndSet(false, true)) {
                this.f35652a.mo24122a(this);
                return;
            }
            return;
        }
        Throwable th = this.f35651O;
        if (th != null) {
            fVar.onError(th);
        } else {
            fVar.onComplete();
        }
    }

    public void onComplete() {
        C12439a[] aVarArr;
        for (C12439a aVar : (C12439a[]) this.f35653b.getAndSet(f35649Q)) {
            if (!aVar.get()) {
                aVar.f35654a.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12439a[] aVarArr;
        this.f35651O = th;
        for (C12439a aVar : (C12439a[]) this.f35653b.getAndSet(f35649Q)) {
            if (!aVar.get()) {
                aVar.f35654a.onError(th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo42194b(C12439a aVar) {
        C12439a[] aVarArr;
        C12439a[] aVarArr2;
        do {
            aVarArr = (C12439a[]) this.f35653b.get();
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
                        aVarArr2 = f35648P;
                    } else {
                        C12439a[] aVarArr3 = new C12439a[(length - 1)];
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
        } while (!this.f35653b.compareAndSet(aVarArr, aVarArr2));
    }
}
