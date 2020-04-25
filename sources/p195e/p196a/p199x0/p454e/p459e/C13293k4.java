package p195e.p196a.p199x0.p454e.p459e;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.k4 */
/* compiled from: ObservableZip */
public final class C13293k4<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final C12339o<? super Object[], ? extends R> f38414N;

    /* renamed from: O */
    final int f38415O;

    /* renamed from: P */
    final boolean f38416P;

    /* renamed from: a */
    final C5926g0<? extends T>[] f38417a;

    /* renamed from: b */
    final Iterable<? extends C5926g0<? extends T>> f38418b;

    /* renamed from: e.a.x0.e.e.k4$a */
    /* compiled from: ObservableZip */
    static final class C13294a<T, R> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: N */
        final C13295b<T, R>[] f38419N;

        /* renamed from: O */
        final T[] f38420O;

        /* renamed from: P */
        final boolean f38421P;

        /* renamed from: Q */
        volatile boolean f38422Q;

        /* renamed from: a */
        final C12280i0<? super R> f38423a;

        /* renamed from: b */
        final C12339o<? super Object[], ? extends R> f38424b;

        C13294a(C12280i0<? super R> i0Var, C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
            this.f38423a = i0Var;
            this.f38424b = oVar;
            this.f38419N = new C13295b[i];
            this.f38420O = new Object[i];
            this.f38421P = z;
        }

        /* renamed from: a */
        public void mo42796a(C5926g0<? extends T>[] g0VarArr, int i) {
            C13295b<T, R>[] bVarArr = this.f38419N;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C13295b<>(this, i);
            }
            lazySet(0);
            this.f38423a.mo34123a((C12314c) this);
            for (int i3 = 0; i3 < length && !this.f38422Q; i3++) {
                g0VarArr[i3].mo23893a(bVarArr[i3]);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38422Q;
        }

        public void dispose() {
            if (!this.f38422Q) {
                this.f38422Q = true;
                mo42798e();
                if (getAndIncrement() == 0) {
                    mo42799f();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42798e() {
            for (C13295b<T, R> a : this.f38419N) {
                a.mo42801a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42799f() {
            for (C13295b<T, R> bVar : this.f38419N) {
                bVar.f38429b.clear();
            }
        }

        /* renamed from: g */
        public void mo42800g() {
            if (getAndIncrement() == 0) {
                C13295b<T, R>[] bVarArr = this.f38419N;
                C12280i0<? super R> i0Var = this.f38423a;
                T[] tArr = this.f38420O;
                boolean z = this.f38421P;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C13295b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.f38425N;
                            T poll = bVar.f38429b.poll();
                            boolean z3 = poll == null;
                            if (!mo42797a(z2, z3, i0Var, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f38425N && !z) {
                            Throwable th = bVar.f38426O;
                            if (th != null) {
                                mo42795a();
                                i0Var.onError(th);
                                return;
                            }
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            i0Var.mo33453a(C12390b.m55563a(this.f38424b.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, null);
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            mo42795a();
                            i0Var.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42795a() {
            mo42799f();
            mo42798e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42797a(boolean z, boolean z2, C12280i0<? super R> i0Var, boolean z3, C13295b<?, ?> bVar) {
            if (this.f38422Q) {
                mo42795a();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = bVar.f38426O;
                    if (th != null) {
                        mo42795a();
                        i0Var.onError(th);
                        return true;
                    } else if (z2) {
                        mo42795a();
                        i0Var.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = bVar.f38426O;
                    mo42795a();
                    if (th2 != null) {
                        i0Var.onError(th2);
                    } else {
                        i0Var.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e.a.x0.e.e.k4$b */
    /* compiled from: ObservableZip */
    static final class C13295b<T, R> implements C12280i0<T> {

        /* renamed from: N */
        volatile boolean f38425N;

        /* renamed from: O */
        Throwable f38426O;

        /* renamed from: P */
        final AtomicReference<C12314c> f38427P = new AtomicReference<>();

        /* renamed from: a */
        final C13294a<T, R> f38428a;

        /* renamed from: b */
        final C13663c<T> f38429b;

        C13295b(C13294a<T, R> aVar, int i) {
            this.f38428a = aVar;
            this.f38429b = new C13663c<>(i);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38427P, cVar);
        }

        public void onComplete() {
            this.f38425N = true;
            this.f38428a.mo42800g();
        }

        public void onError(Throwable th) {
            this.f38426O = th;
            this.f38425N = true;
            this.f38428a.mo42800g();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38429b.offer(t);
            this.f38428a.mo42800g();
        }

        /* renamed from: a */
        public void mo42801a() {
            C12347d.m55465a(this.f38427P);
        }
    }

    public C13293k4(C5926g0<? extends T>[] g0VarArr, Iterable<? extends C5926g0<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f38417a = g0VarArr;
        this.f38418b = iterable;
        this.f38414N = oVar;
        this.f38415O = i;
        this.f38416P = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        int i;
        C5926g0<? extends T>[] g0VarArr = this.f38417a;
        if (g0VarArr == null) {
            g0VarArr = new C5923b0[8];
            i = 0;
            for (C5926g0<? extends T> g0Var : this.f38418b) {
                if (i == g0VarArr.length) {
                    C5926g0<? extends T>[] g0VarArr2 = new C5926g0[((i >> 2) + i)];
                    System.arraycopy(g0VarArr, 0, g0VarArr2, 0, i);
                    g0VarArr = g0VarArr2;
                }
                int i2 = i + 1;
                g0VarArr[i] = g0Var;
                i = i2;
            }
        } else {
            i = g0VarArr.length;
        }
        if (i == 0) {
            C12348e.m55473a(i0Var);
        } else {
            new C13294a(i0Var, this.f38414N, i, this.f38416P).mo42796a(g0VarArr, this.f38415O);
        }
    }
}
