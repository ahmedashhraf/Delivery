package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.h */
/* compiled from: ObservableAmb */
public final class C13231h<T> extends C5923b0<T> {

    /* renamed from: a */
    final C5926g0<? extends T>[] f38189a;

    /* renamed from: b */
    final Iterable<? extends C5926g0<? extends T>> f38190b;

    /* renamed from: e.a.x0.e.e.h$a */
    /* compiled from: ObservableAmb */
    static final class C13232a<T> implements C12314c {

        /* renamed from: N */
        final AtomicInteger f38191N = new AtomicInteger();

        /* renamed from: a */
        final C12280i0<? super T> f38192a;

        /* renamed from: b */
        final C13233b<T>[] f38193b;

        C13232a(C12280i0<? super T> i0Var, int i) {
            this.f38192a = i0Var;
            this.f38193b = new C13233b[i];
        }

        /* renamed from: a */
        public void mo42748a(C5926g0<? extends T>[] g0VarArr) {
            C13233b<T>[] bVarArr = this.f38193b;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr[i] = new C13233b<>(this, i2, this.f38192a);
                i = i2;
            }
            this.f38191N.lazySet(0);
            this.f38192a.mo34123a((C12314c) this);
            for (int i3 = 0; i3 < length && this.f38191N.get() == 0; i3++) {
                g0VarArr[i3].mo23893a(bVarArr[i3]);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38191N.get() == -1;
        }

        public void dispose() {
            if (this.f38191N.get() != -1) {
                this.f38191N.lazySet(-1);
                for (C13233b<T> a : this.f38193b) {
                    a.mo42750a();
                }
            }
        }

        /* renamed from: a */
        public boolean mo42749a(int i) {
            int i2 = this.f38191N.get();
            boolean z = true;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != i) {
                    z = false;
                }
                return z;
            } else if (!this.f38191N.compareAndSet(0, i)) {
                return false;
            } else {
                C13233b<T>[] bVarArr = this.f38193b;
                int length = bVarArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        bVarArr[i3].mo42750a();
                    }
                    i3 = i4;
                }
                return true;
            }
        }
    }

    /* renamed from: e.a.x0.e.e.h$b */
    /* compiled from: ObservableAmb */
    static final class C13233b<T> extends AtomicReference<C12314c> implements C12280i0<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* renamed from: N */
        final C12280i0<? super T> f38194N;

        /* renamed from: O */
        boolean f38195O;

        /* renamed from: a */
        final C13232a<T> f38196a;

        /* renamed from: b */
        final int f38197b;

        C13233b(C13232a<T> aVar, int i, C12280i0<? super T> i0Var) {
            this.f38196a = aVar;
            this.f38197b = i;
            this.f38194N = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            if (this.f38195O) {
                this.f38194N.onComplete();
            } else if (this.f38196a.mo42749a(this.f38197b)) {
                this.f38195O = true;
                this.f38194N.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38195O) {
                this.f38194N.onError(th);
            } else if (this.f38196a.mo42749a(this.f38197b)) {
                this.f38195O = true;
                this.f38194N.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38195O) {
                this.f38194N.mo33453a(t);
            } else if (this.f38196a.mo42749a(this.f38197b)) {
                this.f38195O = true;
                this.f38194N.mo33453a(t);
            } else {
                ((C12314c) get()).dispose();
            }
        }

        /* renamed from: a */
        public void mo42750a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }
    }

    public C13231h(C5926g0<? extends T>[] g0VarArr, Iterable<? extends C5926g0<? extends T>> iterable) {
        this.f38189a = g0VarArr;
        this.f38190b = iterable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        int i;
        C5926g0<? extends T>[] g0VarArr = this.f38189a;
        if (g0VarArr == null) {
            g0VarArr = new C5923b0[8];
            try {
                i = 0;
                for (C5926g0<? extends T> g0Var : this.f38190b) {
                    if (g0Var == null) {
                        C12348e.m55476a((Throwable) new NullPointerException("One of the sources is null"), i0Var);
                        return;
                    }
                    if (i == g0VarArr.length) {
                        C5926g0<? extends T>[] g0VarArr2 = new C5926g0[((i >> 2) + i)];
                        System.arraycopy(g0VarArr, 0, g0VarArr2, 0, i);
                        g0VarArr = g0VarArr2;
                    }
                    int i2 = i + 1;
                    g0VarArr[i] = g0Var;
                    i = i2;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a(th, i0Var);
                return;
            }
        } else {
            i = g0VarArr.length;
        }
        if (i == 0) {
            C12348e.m55473a(i0Var);
        } else if (i == 1) {
            g0VarArr[0].mo23893a(i0Var);
        } else {
            new C13232a(i0Var, i).mo42748a(g0VarArr);
        }
    }
}
