package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5930q0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.i */
/* compiled from: ObservableConcatMapSingle */
public final class C13118i<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final C13753j f37792N;

    /* renamed from: O */
    final int f37793O;

    /* renamed from: a */
    final C5923b0<T> f37794a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5930q0<? extends R>> f37795b;

    /* renamed from: e.a.x0.e.d.i$a */
    /* compiled from: ObservableConcatMapSingle */
    static final class C13119a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: W */
        static final int f37796W = 0;

        /* renamed from: X */
        static final int f37797X = 1;

        /* renamed from: Y */
        static final int f37798Y = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: N */
        final C13746c f37799N = new C13746c();

        /* renamed from: O */
        final C13120a<R> f37800O = new C13120a<>(this);

        /* renamed from: P */
        final C12405n<T> f37801P;

        /* renamed from: Q */
        final C13753j f37802Q;

        /* renamed from: R */
        C12314c f37803R;

        /* renamed from: S */
        volatile boolean f37804S;

        /* renamed from: T */
        volatile boolean f37805T;

        /* renamed from: U */
        R f37806U;

        /* renamed from: V */
        volatile int f37807V;

        /* renamed from: a */
        final C12280i0<? super R> f37808a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5930q0<? extends R>> f37809b;

        /* renamed from: e.a.x0.e.d.i$a$a */
        /* compiled from: ObservableConcatMapSingle */
        static final class C13120a<R> extends AtomicReference<C12314c> implements C12292n0<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: a */
            final C13119a<?, R> f37810a;

            C13120a(C13119a<?, R> aVar) {
                this.f37810a = aVar;
            }

            /* renamed from: a */
            public void mo41974a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onError(Throwable th) {
                this.f37810a.mo42643a(th);
            }

            public void onSuccess(R r) {
                this.f37810a.mo42644b(r);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42645a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13119a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, int i, C13753j jVar) {
            this.f37808a = i0Var;
            this.f37809b = oVar;
            this.f37802Q = jVar;
            this.f37801P = new C13663c(i);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37803R, cVar)) {
                this.f37803R = cVar;
                this.f37808a.mo34123a((C12314c) this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42644b(R r) {
            this.f37806U = r;
            this.f37807V = 2;
            mo42642a();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37805T;
        }

        public void dispose() {
            this.f37805T = true;
            this.f37803R.dispose();
            this.f37800O.mo42645a();
            if (getAndIncrement() == 0) {
                this.f37801P.clear();
                this.f37806U = null;
            }
        }

        public void onComplete() {
            this.f37804S = true;
            mo42642a();
        }

        public void onError(Throwable th) {
            if (this.f37799N.mo43142a(th)) {
                if (this.f37802Q == C13753j.IMMEDIATE) {
                    this.f37800O.mo42645a();
                }
                this.f37804S = true;
                mo42642a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37801P.offer(t);
            mo42642a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42643a(Throwable th) {
            if (this.f37799N.mo43142a(th)) {
                if (this.f37802Q != C13753j.END) {
                    this.f37803R.dispose();
                }
                this.f37807V = 0;
                mo42642a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42642a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super R> i0Var = this.f37808a;
                C13753j jVar = this.f37802Q;
                C12405n<T> nVar = this.f37801P;
                C13746c cVar = this.f37799N;
                int i = 1;
                while (true) {
                    if (this.f37805T) {
                        nVar.clear();
                        this.f37806U = null;
                    }
                    int i2 = this.f37807V;
                    if (cVar.get() == null || !(jVar == C13753j.IMMEDIATE || (jVar == C13753j.BOUNDARY && i2 == 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.f37804S;
                            Object poll = nVar.poll();
                            if (poll == null) {
                                z = true;
                            }
                            if (z2 && z) {
                                Throwable d = cVar.mo43143d();
                                if (d == null) {
                                    i0Var.onComplete();
                                } else {
                                    i0Var.onError(d);
                                }
                                return;
                            } else if (!z) {
                                try {
                                    C5930q0 q0Var = (C5930q0) C12390b.m55563a(this.f37809b.apply(poll), "The mapper returned a null SingleSource");
                                    this.f37807V = 1;
                                    q0Var.mo24192a(this.f37800O);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    this.f37803R.dispose();
                                    nVar.clear();
                                    cVar.mo43142a(th);
                                    i0Var.onError(cVar.mo43143d());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.f37806U;
                            this.f37806U = null;
                            i0Var.mo33453a(r);
                            this.f37807V = 0;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                nVar.clear();
                this.f37806U = null;
                i0Var.onError(cVar.mo43143d());
            }
        }
    }

    public C13118i(C5923b0<T> b0Var, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, C13753j jVar, int i) {
        this.f37794a = b0Var;
        this.f37795b = oVar;
        this.f37792N = jVar;
        this.f37793O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        if (!C13130m.m57221b(this.f37794a, this.f37795b, i0Var)) {
            this.f37794a.mo23893a((C12280i0<? super T>) new C13119a<Object>(i0Var, this.f37795b, this.f37793O, this.f37792N));
        }
    }
}
