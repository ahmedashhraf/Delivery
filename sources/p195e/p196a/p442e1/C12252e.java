package p195e.p196a.p442e1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.e */
/* compiled from: PublishSubject */
public final class C12252e<T> extends C12265i<T> {

    /* renamed from: N */
    static final C12253a[] f35391N = new C12253a[0];

    /* renamed from: O */
    static final C12253a[] f35392O = new C12253a[0];

    /* renamed from: a */
    final AtomicReference<C12253a<T>[]> f35393a = new AtomicReference<>(f35392O);

    /* renamed from: b */
    Throwable f35394b;

    /* renamed from: e.a.e1.e$a */
    /* compiled from: PublishSubject */
    static final class C12253a<T> extends AtomicBoolean implements C12314c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C12280i0<? super T> f35395a;

        /* renamed from: b */
        final C12252e<T> f35396b;

        C12253a(C12280i0<? super T> i0Var, C12252e<T> eVar) {
            this.f35395a = i0Var;
            this.f35396b = eVar;
        }

        /* renamed from: a */
        public void mo41947a(T t) {
            if (!get()) {
                this.f35395a.mo33453a(t);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f35396b.mo41945b(this);
            }
        }

        /* renamed from: a */
        public void mo41948a(Throwable th) {
            if (get()) {
                C12205a.m54894b(th);
            } else {
                this.f35395a.onError(th);
            }
        }

        /* renamed from: a */
        public void mo41946a() {
            if (!get()) {
                this.f35395a.onComplete();
            }
        }
    }

    C12252e() {
    }

    @C5935d
    @C5937f
    /* renamed from: U */
    public static <T> C12252e<T> m55181U() {
        return new C12252e<>();
    }

    @C5938g
    /* renamed from: P */
    public Throwable mo41897P() {
        if (this.f35393a.get() == f35391N) {
            return this.f35394b;
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return this.f35393a.get() == f35391N && this.f35394b == null;
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return ((C12253a[]) this.f35393a.get()).length != 0;
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return this.f35393a.get() == f35391N && this.f35394b != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41944a(C12253a<T> aVar) {
        C12253a[] aVarArr;
        C12253a[] aVarArr2;
        do {
            aVarArr = (C12253a[]) this.f35393a.get();
            if (aVarArr == f35391N) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12253a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35393a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41945b(C12253a<T> aVar) {
        C12253a<T>[] aVarArr;
        C12253a[] aVarArr2;
        do {
            aVarArr = (C12253a[]) this.f35393a.get();
            if (aVarArr != f35391N && aVarArr != f35392O) {
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
                        aVarArr2 = f35392O;
                    } else {
                        C12253a[] aVarArr3 = new C12253a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f35393a.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12253a aVar = new C12253a(i0Var, this);
        i0Var.mo34123a((C12314c) aVar);
        if (!mo41944a(aVar)) {
            Throwable th = this.f35394b;
            if (th != null) {
                i0Var.onError(th);
            } else {
                i0Var.onComplete();
            }
        } else if (aVar.mo41878d()) {
            mo41945b(aVar);
        }
    }

    public void onComplete() {
        Object obj = this.f35393a.get();
        Object obj2 = f35391N;
        if (obj != obj2) {
            for (C12253a a : (C12253a[]) this.f35393a.getAndSet(obj2)) {
                a.mo41946a();
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f35393a.get();
        Object obj2 = f35391N;
        if (obj == obj2) {
            C12205a.m54894b(th);
            return;
        }
        this.f35394b = th;
        for (C12253a a : (C12253a[]) this.f35393a.getAndSet(obj2)) {
            a.mo41948a(th);
        }
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (this.f35393a.get() == f35391N) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C12253a a : (C12253a[]) this.f35393a.get()) {
            a.mo41947a(t);
        }
    }
}
