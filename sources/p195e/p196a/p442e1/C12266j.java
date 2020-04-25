package p195e.p196a.p442e1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.j */
/* compiled from: UnicastSubject */
public final class C12266j<T> extends C12265i<T> {

    /* renamed from: N */
    final AtomicReference<Runnable> f35437N;

    /* renamed from: O */
    final boolean f35438O;

    /* renamed from: P */
    volatile boolean f35439P;

    /* renamed from: Q */
    volatile boolean f35440Q;

    /* renamed from: R */
    Throwable f35441R;

    /* renamed from: S */
    final AtomicBoolean f35442S;

    /* renamed from: T */
    final C12409b<T> f35443T;

    /* renamed from: U */
    boolean f35444U;

    /* renamed from: a */
    final C13663c<T> f35445a;

    /* renamed from: b */
    final AtomicReference<C12280i0<? super T>> f35446b;

    /* renamed from: e.a.e1.j$a */
    /* compiled from: UnicastSubject */
    final class C12267a extends C12409b<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        C12267a() {
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C12266j.this.f35444U = true;
            return 2;
        }

        public void clear() {
            C12266j.this.f35445a.clear();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12266j.this.f35439P;
        }

        public void dispose() {
            if (!C12266j.this.f35439P) {
                C12266j jVar = C12266j.this;
                jVar.f35439P = true;
                jVar.mo41986U();
                C12266j.this.f35446b.lazySet(null);
                if (C12266j.this.f35443T.getAndIncrement() == 0) {
                    C12266j.this.f35446b.lazySet(null);
                    C12266j.this.f35445a.clear();
                }
            }
        }

        public boolean isEmpty() {
            return C12266j.this.f35445a.isEmpty();
        }

        @C5938g
        public T poll() throws Exception {
            return C12266j.this.f35445a.poll();
        }
    }

    C12266j(int i, boolean z) {
        this.f35445a = new C13663c<>(C12390b.m55558a(i, "capacityHint"));
        this.f35437N = new AtomicReference<>();
        this.f35438O = z;
        this.f35446b = new AtomicReference<>();
        this.f35442S = new AtomicBoolean();
        this.f35443T = new C12267a();
    }

    @C5935d
    @C5937f
    /* renamed from: W */
    public static <T> C12266j<T> m55266W() {
        return new C12266j<>(C5923b0.m26088M(), true);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C12266j<T> m55267a(int i, Runnable runnable) {
        return new C12266j<>(i, runnable, true);
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: b */
    public static <T> C12266j<T> m55269b(boolean z) {
        return new C12266j<>(C5923b0.m26088M(), z);
    }

    @C5935d
    @C5937f
    /* renamed from: i */
    public static <T> C12266j<T> m55270i(int i) {
        return new C12266j<>(i, true);
    }

    @C5938g
    /* renamed from: P */
    public Throwable mo41897P() {
        if (this.f35440Q) {
            return this.f35441R;
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return this.f35440Q && this.f35441R == null;
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return this.f35446b.get() != null;
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return this.f35440Q && this.f35441R != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo41986U() {
        Runnable runnable = (Runnable) this.f35437N.get();
        if (runnable != null && this.f35437N.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo41987V() {
        if (this.f35443T.getAndIncrement() == 0) {
            C12280i0 i0Var = (C12280i0) this.f35446b.get();
            int i = 1;
            while (i0Var == null) {
                i = this.f35443T.addAndGet(-i);
                if (i != 0) {
                    i0Var = (C12280i0) this.f35446b.get();
                } else {
                    return;
                }
            }
            if (this.f35444U) {
                mo41989g(i0Var);
            } else {
                mo41990h(i0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        if (this.f35442S.get() || !this.f35442S.compareAndSet(false, true)) {
            C12348e.m55476a((Throwable) new IllegalStateException("Only a single observer allowed."), i0Var);
        } else {
            i0Var.mo34123a((C12314c) this.f35443T);
            this.f35446b.lazySet(i0Var);
            if (this.f35439P) {
                this.f35446b.lazySet(null);
                return;
            }
            mo41987V();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo41989g(C12280i0<? super T> i0Var) {
        C13663c<T> cVar = this.f35445a;
        int i = 1;
        boolean z = !this.f35438O;
        while (!this.f35439P) {
            boolean z2 = this.f35440Q;
            if (!z || !z2 || !mo41988a((C12406o<T>) cVar, i0Var)) {
                i0Var.mo33453a(null);
                if (z2) {
                    mo41991i(i0Var);
                    return;
                }
                i = this.f35443T.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f35446b.lazySet(null);
        cVar.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo41990h(C12280i0<? super T> i0Var) {
        C13663c<T> cVar = this.f35445a;
        boolean z = !this.f35438O;
        boolean z2 = true;
        int i = 1;
        while (!this.f35439P) {
            boolean z3 = this.f35440Q;
            Object poll = this.f35445a.poll();
            boolean z4 = poll == null;
            if (z3) {
                if (z && z2) {
                    if (!mo41988a((C12406o<T>) cVar, i0Var)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    mo41991i(i0Var);
                    return;
                }
            }
            if (z4) {
                i = this.f35443T.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                i0Var.mo33453a(poll);
            }
        }
        this.f35446b.lazySet(null);
        cVar.clear();
    }

    public void onComplete() {
        if (!this.f35440Q && !this.f35439P) {
            this.f35440Q = true;
            mo41986U();
            mo41987V();
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35440Q || this.f35439P) {
            C12205a.m54894b(th);
            return;
        }
        this.f35441R = th;
        this.f35440Q = true;
        mo41986U();
        mo41987V();
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C12266j<T> m55268a(int i, Runnable runnable, boolean z) {
        return new C12266j<>(i, runnable, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo41991i(C12280i0<? super T> i0Var) {
        this.f35446b.lazySet(null);
        Throwable th = this.f35441R;
        if (th != null) {
            i0Var.onError(th);
        } else {
            i0Var.onComplete();
        }
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (this.f35440Q || this.f35439P) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35440Q && !this.f35439P) {
            this.f35445a.offer(t);
            mo41987V();
        }
    }

    C12266j(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    C12266j(int i, Runnable runnable, boolean z) {
        this.f35445a = new C13663c<>(C12390b.m55558a(i, "capacityHint"));
        this.f35437N = new AtomicReference<>(C12390b.m55563a(runnable, "onTerminate"));
        this.f35438O = z;
        this.f35446b = new AtomicReference<>();
        this.f35442S = new AtomicBoolean();
        this.f35443T = new C12267a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41988a(C12406o<T> oVar, C12280i0<? super T> i0Var) {
        Throwable th = this.f35441R;
        if (th == null) {
            return false;
        }
        this.f35446b.lazySet(null);
        oVar.clear();
        i0Var.onError(th);
        return true;
    }
}
