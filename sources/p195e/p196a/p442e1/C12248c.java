package p195e.p196a.p442e1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.c */
/* compiled from: CompletableSubject */
public final class C12248c extends C5925c implements C12268f {

    /* renamed from: O */
    static final C12249a[] f35378O = new C12249a[0];

    /* renamed from: P */
    static final C12249a[] f35379P = new C12249a[0];

    /* renamed from: N */
    Throwable f35380N;

    /* renamed from: a */
    final AtomicReference<C12249a[]> f35381a = new AtomicReference<>(f35378O);

    /* renamed from: b */
    final AtomicBoolean f35382b = new AtomicBoolean();

    /* renamed from: e.a.e1.c$a */
    /* compiled from: CompletableSubject */
    static final class C12249a extends AtomicReference<C12248c> implements C12314c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final C12268f f35383a;

        C12249a(C12268f fVar, C12248c cVar) {
            this.f35383a = fVar;
            lazySet(cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == null;
        }

        public void dispose() {
            C12248c cVar = (C12248c) getAndSet(null);
            if (cVar != null) {
                cVar.mo41923b(this);
            }
        }
    }

    C12248c() {
    }

    @C5935d
    @C5937f
    /* renamed from: x */
    public static C12248c m55157x() {
        return new C12248c();
    }

    /* renamed from: a */
    public void mo41921a(C12314c cVar) {
        if (this.f35381a.get() == f35379P) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12249a aVar = new C12249a(fVar, this);
        fVar.mo41921a(aVar);
        if (!mo41922a(aVar)) {
            Throwable th = this.f35380N;
            if (th != null) {
                fVar.onError(th);
            } else {
                fVar.onComplete();
            }
        } else if (aVar.mo41878d()) {
            mo41923b(aVar);
        }
    }

    public void onComplete() {
        if (this.f35382b.compareAndSet(false, true)) {
            for (C12249a aVar : (C12249a[]) this.f35381a.getAndSet(f35379P)) {
                aVar.f35383a.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35382b.compareAndSet(false, true)) {
            this.f35380N = th;
            for (C12249a aVar : (C12249a[]) this.f35381a.getAndSet(f35379P)) {
                aVar.f35383a.onError(th);
            }
            return;
        }
        C12205a.m54894b(th);
    }

    @C5938g
    /* renamed from: s */
    public Throwable mo41926s() {
        if (this.f35381a.get() == f35379P) {
            return this.f35380N;
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo41927t() {
        return this.f35381a.get() == f35379P && this.f35380N == null;
    }

    /* renamed from: u */
    public boolean mo41928u() {
        return ((C12249a[]) this.f35381a.get()).length != 0;
    }

    /* renamed from: v */
    public boolean mo41929v() {
        return this.f35381a.get() == f35379P && this.f35380N != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public int mo41930w() {
        return ((C12249a[]) this.f35381a.get()).length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41922a(C12249a aVar) {
        C12249a[] aVarArr;
        C12249a[] aVarArr2;
        do {
            aVarArr = (C12249a[]) this.f35381a.get();
            if (aVarArr == f35379P) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12249a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35381a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41923b(C12249a aVar) {
        C12249a[] aVarArr;
        C12249a[] aVarArr2;
        do {
            aVarArr = (C12249a[]) this.f35381a.get();
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
                        aVarArr2 = f35378O;
                    } else {
                        C12249a[] aVarArr3 = new C12249a[(length - 1)];
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
        } while (!this.f35381a.compareAndSet(aVarArr, aVarArr2));
    }
}
