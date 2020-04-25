package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.v */
/* compiled from: ObservableConcatMap */
public final class C13440v<T, U> extends C13131a<T, U> {

    /* renamed from: N */
    final int f38892N;

    /* renamed from: O */
    final C13753j f38893O;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<? extends U>> f38894b;

    /* renamed from: e.a.x0.e.e.v$a */
    /* compiled from: ObservableConcatMap */
    static final class C13441a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: N */
        final int f38895N;

        /* renamed from: O */
        final C13746c f38896O = new C13746c();

        /* renamed from: P */
        final C13442a<R> f38897P;

        /* renamed from: Q */
        final boolean f38898Q;

        /* renamed from: R */
        C12406o<T> f38899R;

        /* renamed from: S */
        C12314c f38900S;

        /* renamed from: T */
        volatile boolean f38901T;

        /* renamed from: U */
        volatile boolean f38902U;

        /* renamed from: V */
        volatile boolean f38903V;

        /* renamed from: W */
        int f38904W;

        /* renamed from: a */
        final C12280i0<? super R> f38905a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends R>> f38906b;

        /* renamed from: e.a.x0.e.e.v$a$a */
        /* compiled from: ObservableConcatMap */
        static final class C13442a<R> extends AtomicReference<C12314c> implements C12280i0<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: a */
            final C12280i0<? super R> f38907a;

            /* renamed from: b */
            final C13441a<?, R> f38908b;

            C13442a(C12280i0<? super R> i0Var, C13441a<?, R> aVar) {
                this.f38907a = i0Var;
                this.f38908b = aVar;
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                C13441a<?, R> aVar = this.f38908b;
                aVar.f38901T = false;
                aVar.mo42904a();
            }

            public void onError(Throwable th) {
                C13441a<?, R> aVar = this.f38908b;
                if (aVar.f38896O.mo43142a(th)) {
                    if (!aVar.f38898Q) {
                        aVar.f38900S.dispose();
                    }
                    aVar.f38901T = false;
                    aVar.mo42904a();
                    return;
                }
                C12205a.m54894b(th);
            }

            /* renamed from: a */
            public void mo33453a(R r) {
                this.f38907a.mo33453a(r);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42905a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13441a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, int i, boolean z) {
            this.f38905a = i0Var;
            this.f38906b = oVar;
            this.f38895N = i;
            this.f38898Q = z;
            this.f38897P = new C13442a<>(i0Var, this);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38900S, cVar)) {
                this.f38900S = cVar;
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(3);
                    if (a == 1) {
                        this.f38904W = a;
                        this.f38899R = jVar;
                        this.f38902U = true;
                        this.f38905a.mo34123a((C12314c) this);
                        mo42904a();
                        return;
                    } else if (a == 2) {
                        this.f38904W = a;
                        this.f38899R = jVar;
                        this.f38905a.mo34123a((C12314c) this);
                        return;
                    }
                }
                this.f38899R = new C13663c(this.f38895N);
                this.f38905a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38903V;
        }

        public void dispose() {
            this.f38903V = true;
            this.f38900S.dispose();
            this.f38897P.mo42905a();
        }

        public void onComplete() {
            this.f38902U = true;
            mo42904a();
        }

        public void onError(Throwable th) {
            if (this.f38896O.mo43142a(th)) {
                this.f38902U = true;
                mo42904a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38904W == 0) {
                this.f38899R.offer(t);
            }
            mo42904a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42904a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super R> i0Var = this.f38905a;
                C12406o<T> oVar = this.f38899R;
                C13746c cVar = this.f38896O;
                while (true) {
                    if (!this.f38901T) {
                        if (this.f38903V) {
                            oVar.clear();
                            return;
                        } else if (this.f38898Q || ((Throwable) cVar.get()) == null) {
                            boolean z = this.f38902U;
                            try {
                                Object poll = oVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.f38903V = true;
                                    Throwable d = cVar.mo43143d();
                                    if (d != null) {
                                        i0Var.onError(d);
                                    } else {
                                        i0Var.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38906b.apply(poll), "The mapper returned a null ObservableSource");
                                        if (g0Var instanceof Callable) {
                                            try {
                                                Object call = ((Callable) g0Var).call();
                                                if (call != null && !this.f38903V) {
                                                    i0Var.mo33453a(call);
                                                }
                                            } catch (Throwable th) {
                                                C14398a.m62357b(th);
                                                cVar.mo43142a(th);
                                            }
                                        } else {
                                            this.f38901T = true;
                                            g0Var.mo23893a(this.f38897P);
                                        }
                                    } catch (Throwable th2) {
                                        C14398a.m62357b(th2);
                                        this.f38903V = true;
                                        this.f38900S.dispose();
                                        oVar.clear();
                                        cVar.mo43142a(th2);
                                        i0Var.onError(cVar.mo43143d());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C14398a.m62357b(th3);
                                this.f38903V = true;
                                this.f38900S.dispose();
                                cVar.mo43142a(th3);
                                i0Var.onError(cVar.mo43143d());
                                return;
                            }
                        } else {
                            oVar.clear();
                            this.f38903V = true;
                            i0Var.onError(cVar.mo43143d());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.v$b */
    /* compiled from: ObservableConcatMap */
    static final class C13443b<T, U> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: N */
        final C13444a<U> f38909N;

        /* renamed from: O */
        final int f38910O;

        /* renamed from: P */
        C12406o<T> f38911P;

        /* renamed from: Q */
        C12314c f38912Q;

        /* renamed from: R */
        volatile boolean f38913R;

        /* renamed from: S */
        volatile boolean f38914S;

        /* renamed from: T */
        volatile boolean f38915T;

        /* renamed from: U */
        int f38916U;

        /* renamed from: a */
        final C12280i0<? super U> f38917a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends U>> f38918b;

        /* renamed from: e.a.x0.e.e.v$b$a */
        /* compiled from: ObservableConcatMap */
        static final class C13444a<U> extends AtomicReference<C12314c> implements C12280i0<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: a */
            final C12280i0<? super U> f38919a;

            /* renamed from: b */
            final C13443b<?, ?> f38920b;

            C13444a(C12280i0<? super U> i0Var, C13443b<?, ?> bVar) {
                this.f38919a = i0Var;
                this.f38920b = bVar;
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C12347d.m55467b(this, cVar);
            }

            public void onComplete() {
                this.f38920b.mo42907e();
            }

            public void onError(Throwable th) {
                this.f38920b.dispose();
                this.f38919a.onError(th);
            }

            /* renamed from: a */
            public void mo33453a(U u) {
                this.f38919a.mo33453a(u);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42908a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13443b(C12280i0<? super U> i0Var, C12339o<? super T, ? extends C5926g0<? extends U>> oVar, int i) {
            this.f38917a = i0Var;
            this.f38918b = oVar;
            this.f38910O = i;
            this.f38909N = new C13444a<>(i0Var, this);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38912Q, cVar)) {
                this.f38912Q = cVar;
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(3);
                    if (a == 1) {
                        this.f38916U = a;
                        this.f38911P = jVar;
                        this.f38915T = true;
                        this.f38917a.mo34123a((C12314c) this);
                        mo42906a();
                        return;
                    } else if (a == 2) {
                        this.f38916U = a;
                        this.f38911P = jVar;
                        this.f38917a.mo34123a((C12314c) this);
                        return;
                    }
                }
                this.f38911P = new C13663c(this.f38910O);
                this.f38917a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38914S;
        }

        public void dispose() {
            this.f38914S = true;
            this.f38909N.mo42908a();
            this.f38912Q.dispose();
            if (getAndIncrement() == 0) {
                this.f38911P.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42907e() {
            this.f38913R = false;
            mo42906a();
        }

        public void onComplete() {
            if (!this.f38915T) {
                this.f38915T = true;
                mo42906a();
            }
        }

        public void onError(Throwable th) {
            if (this.f38915T) {
                C12205a.m54894b(th);
                return;
            }
            this.f38915T = true;
            dispose();
            this.f38917a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38915T) {
                if (this.f38916U == 0) {
                    this.f38911P.offer(t);
                }
                mo42906a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42906a() {
            if (getAndIncrement() == 0) {
                while (!this.f38914S) {
                    if (!this.f38913R) {
                        boolean z = this.f38915T;
                        try {
                            Object poll = this.f38911P.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f38914S = true;
                                this.f38917a.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38918b.apply(poll), "The mapper returned a null ObservableSource");
                                    this.f38913R = true;
                                    g0Var.mo23893a(this.f38909N);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    dispose();
                                    this.f38911P.clear();
                                    this.f38917a.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            dispose();
                            this.f38911P.clear();
                            this.f38917a.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f38911P.clear();
            }
        }
    }

    public C13440v(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<? extends U>> oVar, int i, C13753j jVar) {
        super(g0Var);
        this.f38894b = oVar;
        this.f38893O = jVar;
        this.f38892N = Math.max(8, i);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        if (!C13478x2.m58082a(this.f37851a, i0Var, this.f38894b)) {
            C13753j jVar = this.f38893O;
            if (jVar == C13753j.IMMEDIATE) {
                this.f37851a.mo23893a(new C13443b(new C13795m(i0Var), this.f38894b, this.f38892N));
            } else {
                this.f37851a.mo23893a(new C13441a(i0Var, this.f38894b, this.f38892N, jVar == C13753j.END));
            }
        }
    }
}
