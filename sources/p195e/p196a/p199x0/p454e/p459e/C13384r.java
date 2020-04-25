package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p200j.C13758n;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.r */
/* compiled from: ObservableCache */
public final class C13384r<T> extends C13131a<T, T> {

    /* renamed from: N */
    final AtomicBoolean f38708N = new AtomicBoolean();

    /* renamed from: b */
    final C13385a<T> f38709b;

    /* renamed from: e.a.x0.e.e.r$a */
    /* compiled from: ObservableCache */
    static final class C13385a<T> extends C13758n implements C12280i0<T> {

        /* renamed from: V */
        static final C13386b[] f38710V = new C13386b[0];

        /* renamed from: W */
        static final C13386b[] f38711W = new C13386b[0];

        /* renamed from: Q */
        final C5923b0<? extends T> f38712Q;

        /* renamed from: R */
        final C12350g f38713R = new C12350g();

        /* renamed from: S */
        final AtomicReference<C13386b<T>[]> f38714S = new AtomicReference<>(f38710V);

        /* renamed from: T */
        volatile boolean f38715T;

        /* renamed from: U */
        boolean f38716U;

        C13385a(C5923b0<? extends T> b0Var, int i) {
            super(i);
            this.f38712Q = b0Var;
        }

        /* renamed from: a */
        public boolean mo42857a(C13386b<T> bVar) {
            C13386b[] bVarArr;
            C13386b[] bVarArr2;
            do {
                bVarArr = (C13386b[]) this.f38714S.get();
                if (bVarArr == f38711W) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new C13386b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f38714S.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo42858b(C13386b<T> bVar) {
            C13386b[] bVarArr;
            C13386b[] bVarArr2;
            do {
                bVarArr = (C13386b[]) this.f38714S.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr[i2].equals(bVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f38710V;
                        } else {
                            C13386b[] bVarArr3 = new C13386b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                            bVarArr2 = bVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f38714S.compareAndSet(bVarArr, bVarArr2));
        }

        /* renamed from: c */
        public void mo42859c() {
            this.f38712Q.mo23893a((C12280i0<? super T>) this);
            this.f38715T = true;
        }

        public void onComplete() {
            if (!this.f38716U) {
                this.f38716U = true;
                mo43150c(C13761q.m58750d());
                this.f38713R.dispose();
                for (C13386b a : (C13386b[]) this.f38714S.getAndSet(f38711W)) {
                    a.mo42860a();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f38716U) {
                this.f38716U = true;
                mo43150c(C13761q.m58743a(th));
                this.f38713R.dispose();
                for (C13386b a : (C13386b[]) this.f38714S.getAndSet(f38711W)) {
                    a.mo42860a();
                }
            }
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38713R.mo42110b(cVar);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38716U) {
                mo43150c(C13761q.m58756i(t));
                for (C13386b a : (C13386b[]) this.f38714S.get()) {
                    a.mo42860a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.r$b */
    /* compiled from: ObservableCache */
    static final class C13386b<T> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = 7058506693698832024L;

        /* renamed from: N */
        Object[] f38717N;

        /* renamed from: O */
        int f38718O;

        /* renamed from: P */
        int f38719P;

        /* renamed from: Q */
        volatile boolean f38720Q;

        /* renamed from: a */
        final C12280i0<? super T> f38721a;

        /* renamed from: b */
        final C13385a<T> f38722b;

        C13386b(C12280i0<? super T> i0Var, C13385a<T> aVar) {
            this.f38721a = i0Var;
            this.f38722b = aVar;
        }

        /* renamed from: a */
        public void mo42860a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super T> i0Var = this.f38721a;
                int i = 1;
                while (!this.f38720Q) {
                    int b = this.f38722b.mo43149b();
                    if (b != 0) {
                        Object[] objArr = this.f38717N;
                        if (objArr == null) {
                            objArr = this.f38722b.mo43148a();
                            this.f38717N = objArr;
                        }
                        int length = objArr.length - 1;
                        int i2 = this.f38719P;
                        int i3 = this.f38718O;
                        while (i2 < b) {
                            if (!this.f38720Q) {
                                if (i3 == length) {
                                    objArr = (Object[]) objArr[length];
                                    i3 = 0;
                                }
                                if (!C13761q.m58744a(objArr[i3], i0Var)) {
                                    i3++;
                                    i2++;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!this.f38720Q) {
                            this.f38719P = i2;
                            this.f38718O = i3;
                            this.f38717N = objArr;
                        } else {
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38720Q;
        }

        public void dispose() {
            if (!this.f38720Q) {
                this.f38720Q = true;
                this.f38722b.mo42858b(this);
            }
        }
    }

    private C13384r(C5923b0<T> b0Var, C13385a<T> aVar) {
        super(b0Var);
        this.f38709b = aVar;
    }

    /* renamed from: a */
    public static <T> C5923b0<T> m57810a(C5923b0<T> b0Var) {
        return m57811a(b0Var, 16);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public int mo42854P() {
        return this.f38709b.mo43149b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public boolean mo42855Q() {
        return ((C13386b[]) this.f38709b.f38714S.get()).length != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public boolean mo42856R() {
        return this.f38709b.f38715T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13386b bVar = new C13386b(i0Var, this.f38709b);
        i0Var.mo34123a((C12314c) bVar);
        this.f38709b.mo42857a(bVar);
        if (!this.f38708N.get() && this.f38708N.compareAndSet(false, true)) {
            this.f38709b.mo42859c();
        }
        bVar.mo42860a();
    }

    /* renamed from: a */
    public static <T> C5923b0<T> m57811a(C5923b0<T> b0Var, int i) {
        C12390b.m55558a(i, "capacityHint");
        return C12205a.m54862a((C5923b0<T>) new C13384r<T>(b0Var, new C13385a(b0Var, i)));
    }
}
