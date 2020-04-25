package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p453d.C12426s;
import p195e.p196a.p199x0.p453d.C12427t;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.w */
/* compiled from: ObservableConcatMapEager */
public final class C13454w<T, R> extends C13131a<T, R> {

    /* renamed from: N */
    final C13753j f38942N;

    /* renamed from: O */
    final int f38943O;

    /* renamed from: P */
    final int f38944P;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<? extends R>> f38945b;

    /* renamed from: e.a.x0.e.e.w$a */
    /* compiled from: ObservableConcatMapEager */
    static final class C13455a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c, C12427t<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: N */
        final int f38946N;

        /* renamed from: O */
        final int f38947O;

        /* renamed from: P */
        final C13753j f38948P;

        /* renamed from: Q */
        final C13746c f38949Q = new C13746c();

        /* renamed from: R */
        final ArrayDeque<C12426s<R>> f38950R = new ArrayDeque<>();

        /* renamed from: S */
        C12406o<T> f38951S;

        /* renamed from: T */
        C12314c f38952T;

        /* renamed from: U */
        volatile boolean f38953U;

        /* renamed from: V */
        int f38954V;

        /* renamed from: W */
        volatile boolean f38955W;

        /* renamed from: X */
        C12426s<R> f38956X;

        /* renamed from: Y */
        int f38957Y;

        /* renamed from: a */
        final C12280i0<? super R> f38958a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends R>> f38959b;

        C13455a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, int i, int i2, C13753j jVar) {
            this.f38958a = i0Var;
            this.f38959b = oVar;
            this.f38946N = i;
            this.f38947O = i2;
            this.f38948P = jVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38952T, cVar)) {
                this.f38952T = cVar;
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(3);
                    if (a == 1) {
                        this.f38954V = a;
                        this.f38951S = jVar;
                        this.f38953U = true;
                        this.f38958a.mo34123a((C12314c) this);
                        mo42179a();
                        return;
                    } else if (a == 2) {
                        this.f38954V = a;
                        this.f38951S = jVar;
                        this.f38958a.mo34123a((C12314c) this);
                        return;
                    }
                }
                this.f38951S = new C13663c(this.f38947O);
                this.f38958a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38955W;
        }

        public void dispose() {
            this.f38955W = true;
            if (getAndIncrement() == 0) {
                this.f38951S.clear();
                mo42914e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42914e() {
            C12426s<R> sVar = this.f38956X;
            if (sVar != null) {
                sVar.dispose();
            }
            while (true) {
                C12426s sVar2 = (C12426s) this.f38950R.poll();
                if (sVar2 != null) {
                    sVar2.dispose();
                } else {
                    return;
                }
            }
        }

        public void onComplete() {
            this.f38953U = true;
            mo42179a();
        }

        public void onError(Throwable th) {
            if (this.f38949Q.mo43142a(th)) {
                this.f38953U = true;
                mo42179a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (this.f38954V == 0) {
                this.f38951S.offer(t);
            }
            mo42179a();
        }

        /* renamed from: a */
        public void mo42181a(C12426s<R> sVar, R r) {
            sVar.mo42177f().offer(r);
            mo42179a();
        }

        /* renamed from: a */
        public void mo42182a(C12426s<R> sVar, Throwable th) {
            if (this.f38949Q.mo43142a(th)) {
                if (this.f38948P == C13753j.IMMEDIATE) {
                    this.f38952T.dispose();
                }
                sVar.mo42178g();
                mo42179a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42180a(C12426s<R> sVar) {
            sVar.mo42178g();
            mo42179a();
        }

        /* renamed from: a */
        public void mo42179a() {
            if (getAndIncrement() == 0) {
                C12406o<T> oVar = this.f38951S;
                ArrayDeque<C12426s<R>> arrayDeque = this.f38950R;
                C12280i0<? super R> i0Var = this.f38958a;
                C13753j jVar = this.f38948P;
                int i = 1;
                while (true) {
                    int i2 = this.f38957Y;
                    while (true) {
                        if (i2 == this.f38946N) {
                            break;
                        } else if (this.f38955W) {
                            oVar.clear();
                            mo42914e();
                            return;
                        } else if (jVar != C13753j.IMMEDIATE || ((Throwable) this.f38949Q.get()) == null) {
                            try {
                                Object poll = oVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38959b.apply(poll), "The mapper returned a null ObservableSource");
                                C12426s sVar = new C12426s(this, this.f38947O);
                                arrayDeque.offer(sVar);
                                g0Var.mo23893a(sVar);
                                i2++;
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                this.f38952T.dispose();
                                oVar.clear();
                                mo42914e();
                                this.f38949Q.mo43142a(th);
                                i0Var.onError(this.f38949Q.mo43143d());
                                return;
                            }
                        } else {
                            oVar.clear();
                            mo42914e();
                            i0Var.onError(this.f38949Q.mo43143d());
                            return;
                        }
                    }
                    this.f38957Y = i2;
                    if (this.f38955W) {
                        oVar.clear();
                        mo42914e();
                        return;
                    } else if (jVar != C13753j.IMMEDIATE || ((Throwable) this.f38949Q.get()) == null) {
                        C12426s<R> sVar2 = this.f38956X;
                        if (sVar2 == null) {
                            if (jVar != C13753j.BOUNDARY || ((Throwable) this.f38949Q.get()) == null) {
                                boolean z = this.f38953U;
                                C12426s<R> sVar3 = (C12426s) arrayDeque.poll();
                                boolean z2 = sVar3 == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.f38956X = sVar3;
                                    }
                                    sVar2 = sVar3;
                                } else {
                                    if (((Throwable) this.f38949Q.get()) != null) {
                                        oVar.clear();
                                        mo42914e();
                                        i0Var.onError(this.f38949Q.mo43143d());
                                    } else {
                                        i0Var.onComplete();
                                    }
                                    return;
                                }
                            } else {
                                oVar.clear();
                                mo42914e();
                                i0Var.onError(this.f38949Q.mo43143d());
                                return;
                            }
                        }
                        if (sVar2 != null) {
                            C12406o f = sVar2.mo42177f();
                            while (!this.f38955W) {
                                boolean e = sVar2.mo42176e();
                                if (jVar != C13753j.IMMEDIATE || ((Throwable) this.f38949Q.get()) == null) {
                                    try {
                                        Object poll2 = f.poll();
                                        boolean z3 = poll2 == null;
                                        if (e && z3) {
                                            this.f38956X = null;
                                            this.f38957Y--;
                                        } else if (!z3) {
                                            i0Var.mo33453a(poll2);
                                        }
                                    } catch (Throwable th2) {
                                        C14398a.m62357b(th2);
                                        this.f38949Q.mo43142a(th2);
                                        this.f38956X = null;
                                        this.f38957Y--;
                                    }
                                } else {
                                    oVar.clear();
                                    mo42914e();
                                    i0Var.onError(this.f38949Q.mo43143d());
                                    return;
                                }
                            }
                            oVar.clear();
                            mo42914e();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        oVar.clear();
                        mo42914e();
                        i0Var.onError(this.f38949Q.mo43143d());
                        return;
                    }
                }
            }
        }
    }

    public C13454w(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, C13753j jVar, int i, int i2) {
        super(g0Var);
        this.f38945b = oVar;
        this.f38942N = jVar;
        this.f38943O = i;
        this.f38944P = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13455a aVar = new C13455a(i0Var, this.f38945b, this.f38943O, this.f38944P, this.f38942N);
        g0Var.mo23893a(aVar);
    }
}
