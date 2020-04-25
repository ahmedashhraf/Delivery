package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
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
/* renamed from: e.a.x0.e.d.h */
/* compiled from: ObservableConcatMapMaybe */
public final class C13115h<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final C13753j f37773N;

    /* renamed from: O */
    final int f37774O;

    /* renamed from: a */
    final C5923b0<T> f37775a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5941y<? extends R>> f37776b;

    /* renamed from: e.a.x0.e.d.h$a */
    /* compiled from: ObservableConcatMapMaybe */
    static final class C13116a<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: W */
        static final int f37777W = 0;

        /* renamed from: X */
        static final int f37778X = 1;

        /* renamed from: Y */
        static final int f37779Y = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: N */
        final C13746c f37780N = new C13746c();

        /* renamed from: O */
        final C13117a<R> f37781O = new C13117a<>(this);

        /* renamed from: P */
        final C12405n<T> f37782P;

        /* renamed from: Q */
        final C13753j f37783Q;

        /* renamed from: R */
        C12314c f37784R;

        /* renamed from: S */
        volatile boolean f37785S;

        /* renamed from: T */
        volatile boolean f37786T;

        /* renamed from: U */
        R f37787U;

        /* renamed from: V */
        volatile int f37788V;

        /* renamed from: a */
        final C12280i0<? super R> f37789a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5941y<? extends R>> f37790b;

        /* renamed from: e.a.x0.e.d.h$a$a */
        /* compiled from: ObservableConcatMapMaybe */
        static final class C13117a<R> extends AtomicReference<C12314c> implements C12321v<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: a */
            final C13116a<?, R> f37791a;

            C13117a(C13116a<?, R> aVar) {
                this.f37791a = aVar;
            }

            /* renamed from: a */
            public void mo41931a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                this.f37791a.mo42640e();
            }

            public void onError(Throwable th) {
                this.f37791a.mo42638a(th);
            }

            public void onSuccess(R r) {
                this.f37791a.mo42639b(r);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42641a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13116a(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, int i, C13753j jVar) {
            this.f37789a = i0Var;
            this.f37790b = oVar;
            this.f37783Q = jVar;
            this.f37782P = new C13663c(i);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37784R, cVar)) {
                this.f37784R = cVar;
                this.f37789a.mo34123a((C12314c) this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42639b(R r) {
            this.f37787U = r;
            this.f37788V = 2;
            mo42637a();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37786T;
        }

        public void dispose() {
            this.f37786T = true;
            this.f37784R.dispose();
            this.f37781O.mo42641a();
            if (getAndIncrement() == 0) {
                this.f37782P.clear();
                this.f37787U = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42640e() {
            this.f37788V = 0;
            mo42637a();
        }

        public void onComplete() {
            this.f37785S = true;
            mo42637a();
        }

        public void onError(Throwable th) {
            if (this.f37780N.mo43142a(th)) {
                if (this.f37783Q == C13753j.IMMEDIATE) {
                    this.f37781O.mo42641a();
                }
                this.f37785S = true;
                mo42637a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37782P.offer(t);
            mo42637a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42638a(Throwable th) {
            if (this.f37780N.mo43142a(th)) {
                if (this.f37783Q != C13753j.END) {
                    this.f37784R.dispose();
                }
                this.f37788V = 0;
                mo42637a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42637a() {
            if (getAndIncrement() == 0) {
                C12280i0<? super R> i0Var = this.f37789a;
                C13753j jVar = this.f37783Q;
                C12405n<T> nVar = this.f37782P;
                C13746c cVar = this.f37780N;
                int i = 1;
                while (true) {
                    if (this.f37786T) {
                        nVar.clear();
                        this.f37787U = null;
                    }
                    int i2 = this.f37788V;
                    if (cVar.get() == null || !(jVar == C13753j.IMMEDIATE || (jVar == C13753j.BOUNDARY && i2 == 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.f37785S;
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
                                    C5941y yVar = (C5941y) C12390b.m55563a(this.f37790b.apply(poll), "The mapper returned a null MaybeSource");
                                    this.f37788V = 1;
                                    yVar.mo24639a(this.f37781O);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    this.f37784R.dispose();
                                    nVar.clear();
                                    cVar.mo43142a(th);
                                    i0Var.onError(cVar.mo43143d());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.f37787U;
                            this.f37787U = null;
                            i0Var.mo33453a(r);
                            this.f37788V = 0;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                nVar.clear();
                this.f37787U = null;
                i0Var.onError(cVar.mo43143d());
            }
        }
    }

    public C13115h(C5923b0<T> b0Var, C12339o<? super T, ? extends C5941y<? extends R>> oVar, C13753j jVar, int i) {
        this.f37775a = b0Var;
        this.f37776b = oVar;
        this.f37773N = jVar;
        this.f37774O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        if (!C13130m.m57220a((Object) this.f37775a, this.f37776b, i0Var)) {
            this.f37775a.mo23893a((C12280i0<? super T>) new C13116a<Object>(i0Var, this.f37776b, this.f37774O, this.f37773N));
        }
    }
}
