package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p463g.C13707s;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.d2 */
/* compiled from: ObservableObserveOn */
public final class C13178d2<T> extends C13131a<T, T> {

    /* renamed from: N */
    final boolean f37998N;

    /* renamed from: O */
    final int f37999O;

    /* renamed from: b */
    final C12282j0 f38000b;

    /* renamed from: e.a.x0.e.e.d2$a */
    /* compiled from: ObservableObserveOn */
    static final class C13179a<T> extends C12409b<T> implements C12280i0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: N */
        final boolean f38001N;

        /* renamed from: O */
        final int f38002O;

        /* renamed from: P */
        C12406o<T> f38003P;

        /* renamed from: Q */
        C12314c f38004Q;

        /* renamed from: R */
        Throwable f38005R;

        /* renamed from: S */
        volatile boolean f38006S;

        /* renamed from: T */
        volatile boolean f38007T;

        /* renamed from: U */
        int f38008U;

        /* renamed from: V */
        boolean f38009V;

        /* renamed from: a */
        final C12280i0<? super T> f38010a;

        /* renamed from: b */
        final C12285c f38011b;

        C13179a(C12280i0<? super T> i0Var, C12285c cVar, boolean z, int i) {
            this.f38010a = i0Var;
            this.f38011b = cVar;
            this.f38001N = z;
            this.f38002O = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38004Q, cVar)) {
                this.f38004Q = cVar;
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(7);
                    if (a == 1) {
                        this.f38008U = a;
                        this.f38003P = jVar;
                        this.f38006S = true;
                        this.f38010a.mo34123a((C12314c) this);
                        mo42710f();
                        return;
                    } else if (a == 2) {
                        this.f38008U = a;
                        this.f38003P = jVar;
                        this.f38010a.mo34123a((C12314c) this);
                        return;
                    }
                }
                this.f38003P = new C13663c(this.f38002O);
                this.f38010a.mo34123a((C12314c) this);
            }
        }

        public void clear() {
            this.f38003P.clear();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38007T;
        }

        public void dispose() {
            if (!this.f38007T) {
                this.f38007T = true;
                this.f38004Q.dispose();
                this.f38011b.dispose();
                if (getAndIncrement() == 0) {
                    this.f38003P.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42709e() {
            C12406o<T> oVar = this.f38003P;
            C12280i0<? super T> i0Var = this.f38010a;
            int i = 1;
            while (!mo42708a(this.f38006S, oVar.isEmpty(), i0Var)) {
                while (true) {
                    boolean z = this.f38006S;
                    try {
                        Object poll = oVar.poll();
                        boolean z2 = poll == null;
                        if (!mo42708a(z, z2, i0Var)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                i0Var.mo33453a(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f38004Q.dispose();
                        oVar.clear();
                        i0Var.onError(th);
                        this.f38011b.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42710f() {
            if (getAndIncrement() == 0) {
                this.f38011b.mo41876a((Runnable) this);
            }
        }

        public boolean isEmpty() {
            return this.f38003P.isEmpty();
        }

        public void onComplete() {
            if (!this.f38006S) {
                this.f38006S = true;
                mo42710f();
            }
        }

        public void onError(Throwable th) {
            if (this.f38006S) {
                C12205a.m54894b(th);
                return;
            }
            this.f38005R = th;
            this.f38006S = true;
            mo42710f();
        }

        @C5938g
        public T poll() throws Exception {
            return this.f38003P.poll();
        }

        public void run() {
            if (this.f38009V) {
                mo42707a();
            } else {
                mo42709e();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38006S) {
                if (this.f38008U != 2) {
                    this.f38003P.offer(t);
                }
                mo42710f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42707a() {
            int i = 1;
            while (!this.f38007T) {
                boolean z = this.f38006S;
                Throwable th = this.f38005R;
                if (this.f38001N || !z || th == null) {
                    this.f38010a.mo33453a(null);
                    if (z) {
                        Throwable th2 = this.f38005R;
                        if (th2 != null) {
                            this.f38010a.onError(th2);
                        } else {
                            this.f38010a.onComplete();
                        }
                        this.f38011b.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f38010a.onError(th);
                    this.f38011b.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42708a(boolean z, boolean z2, C12280i0<? super T> i0Var) {
            if (this.f38007T) {
                this.f38003P.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f38005R;
                if (this.f38001N) {
                    if (z2) {
                        if (th != null) {
                            i0Var.onError(th);
                        } else {
                            i0Var.onComplete();
                        }
                        this.f38011b.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.f38003P.clear();
                    i0Var.onError(th);
                    this.f38011b.dispose();
                    return true;
                } else if (z2) {
                    i0Var.onComplete();
                    this.f38011b.dispose();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f38009V = true;
            return 2;
        }
    }

    public C13178d2(C5926g0<T> g0Var, C12282j0 j0Var, boolean z, int i) {
        super(g0Var);
        this.f38000b = j0Var;
        this.f37998N = z;
        this.f37999O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12282j0 j0Var = this.f38000b;
        if (j0Var instanceof C13707s) {
            this.f37851a.mo23893a(i0Var);
            return;
        }
        this.f37851a.mo23893a(new C13179a(i0Var, j0Var.mo41871a(), this.f37998N, this.f37999O));
    }
}
