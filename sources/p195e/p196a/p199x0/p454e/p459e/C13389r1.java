package p195e.p196a.p199x0.p454e.p459e;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.r1 */
/* compiled from: ObservableJoin */
public final class C13389r1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C13131a<TLeft, R> {

    /* renamed from: N */
    final C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> f38730N;

    /* renamed from: O */
    final C12339o<? super TRight, ? extends C5926g0<TRightEnd>> f38731O;

    /* renamed from: P */
    final C12327c<? super TLeft, ? super TRight, ? extends R> f38732P;

    /* renamed from: b */
    final C5926g0<? extends TRight> f38733b;

    /* renamed from: e.a.x0.e.e.r1$a */
    /* compiled from: ObservableJoin */
    static final class C13390a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C12314c, C13285b {

        /* renamed from: Y */
        static final Integer f38734Y = Integer.valueOf(1);

        /* renamed from: Z */
        static final Integer f38735Z = Integer.valueOf(2);

        /* renamed from: a0 */
        static final Integer f38736a0 = Integer.valueOf(3);

        /* renamed from: b0 */
        static final Integer f38737b0 = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: N */
        final C12313b f38738N = new C12313b();

        /* renamed from: O */
        final Map<Integer, TLeft> f38739O = new LinkedHashMap();

        /* renamed from: P */
        final Map<Integer, TRight> f38740P = new LinkedHashMap();

        /* renamed from: Q */
        final AtomicReference<Throwable> f38741Q = new AtomicReference<>();

        /* renamed from: R */
        final C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> f38742R;

        /* renamed from: S */
        final C12339o<? super TRight, ? extends C5926g0<TRightEnd>> f38743S;

        /* renamed from: T */
        final C12327c<? super TLeft, ? super TRight, ? extends R> f38744T;

        /* renamed from: U */
        final AtomicInteger f38745U;

        /* renamed from: V */
        int f38746V;

        /* renamed from: W */
        int f38747W;

        /* renamed from: X */
        volatile boolean f38748X;

        /* renamed from: a */
        final C12280i0<? super R> f38749a;

        /* renamed from: b */
        final C13663c<Object> f38750b = new C13663c<>(C5923b0.m26088M());

        C13390a(C12280i0<? super R> i0Var, C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C5926g0<TRightEnd>> oVar2, C12327c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f38749a = i0Var;
            this.f38742R = oVar;
            this.f38743S = oVar2;
            this.f38744T = cVar;
            this.f38745U = new AtomicInteger(2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42861a() {
            this.f38738N.dispose();
        }

        /* renamed from: b */
        public void mo42791b(Throwable th) {
            if (C13754k.m58722a(this.f38741Q, th)) {
                mo42864e();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38748X;
        }

        public void dispose() {
            if (!this.f38748X) {
                this.f38748X = true;
                mo42861a();
                if (getAndIncrement() == 0) {
                    this.f38750b.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42864e() {
            if (getAndIncrement() == 0) {
                C13663c<Object> cVar = this.f38750b;
                C12280i0<? super R> i0Var = this.f38749a;
                int i = 1;
                while (!this.f38748X) {
                    if (((Throwable) this.f38741Q.get()) != null) {
                        cVar.clear();
                        mo42861a();
                        mo42862a(i0Var);
                        return;
                    }
                    boolean z = this.f38745U.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.f38739O.clear();
                        this.f38740P.clear();
                        this.f38738N.dispose();
                        i0Var.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        String str = "The resultSelector returned a null value";
                        if (num == f38734Y) {
                            int i2 = this.f38746V;
                            this.f38746V = i2 + 1;
                            this.f38739O.put(Integer.valueOf(i2), poll);
                            try {
                                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38742R.apply(poll), "The leftEnd returned a null ObservableSource");
                                C13286c cVar2 = new C13286c(this, true, i2);
                                this.f38738N.mo42072b(cVar2);
                                g0Var.mo23893a(cVar2);
                                if (((Throwable) this.f38741Q.get()) != null) {
                                    cVar.clear();
                                    mo42861a();
                                    mo42862a(i0Var);
                                    return;
                                }
                                for (Object a : this.f38740P.values()) {
                                    try {
                                        i0Var.mo33453a(C12390b.m55563a(this.f38744T.mo35569a(poll, a), str));
                                    } catch (Throwable th) {
                                        mo42863a(th, i0Var, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                mo42863a(th2, i0Var, cVar);
                                return;
                            }
                        } else if (num == f38735Z) {
                            int i3 = this.f38747W;
                            this.f38747W = i3 + 1;
                            this.f38740P.put(Integer.valueOf(i3), poll);
                            try {
                                C5926g0 g0Var2 = (C5926g0) C12390b.m55563a(this.f38743S.apply(poll), "The rightEnd returned a null ObservableSource");
                                C13286c cVar3 = new C13286c(this, false, i3);
                                this.f38738N.mo42072b(cVar3);
                                g0Var2.mo23893a(cVar3);
                                if (((Throwable) this.f38741Q.get()) != null) {
                                    cVar.clear();
                                    mo42861a();
                                    mo42862a(i0Var);
                                    return;
                                }
                                for (Object a2 : this.f38739O.values()) {
                                    try {
                                        i0Var.mo33453a(C12390b.m55563a(this.f38744T.mo35569a(a2, poll), str));
                                    } catch (Throwable th3) {
                                        mo42863a(th3, i0Var, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                mo42863a(th4, i0Var, cVar);
                                return;
                            }
                        } else if (num == f38736a0) {
                            C13286c cVar4 = (C13286c) poll;
                            this.f38739O.remove(Integer.valueOf(cVar4.f38397N));
                            this.f38738N.mo42069a((C12314c) cVar4);
                        } else {
                            C13286c cVar5 = (C13286c) poll;
                            this.f38740P.remove(Integer.valueOf(cVar5.f38397N));
                            this.f38738N.mo42069a((C12314c) cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42862a(C12280i0<?> i0Var) {
            Throwable a = C13754k.m58720a(this.f38741Q);
            this.f38739O.clear();
            this.f38740P.clear();
            i0Var.onError(a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42863a(Throwable th, C12280i0<?> i0Var, C13663c<?> cVar) {
            C14398a.m62357b(th);
            C13754k.m58722a(this.f38741Q, th);
            cVar.clear();
            mo42861a();
            mo42862a(i0Var);
        }

        /* renamed from: a */
        public void mo42787a(Throwable th) {
            if (C13754k.m58722a(this.f38741Q, th)) {
                this.f38745U.decrementAndGet();
                mo42864e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42786a(C13287d dVar) {
            this.f38738N.mo42073c(dVar);
            this.f38745U.decrementAndGet();
            mo42864e();
        }

        /* renamed from: a */
        public void mo42790a(boolean z, Object obj) {
            synchronized (this) {
                this.f38750b.mo42104a(z ? f38734Y : f38735Z, obj);
            }
            mo42864e();
        }

        /* renamed from: a */
        public void mo42789a(boolean z, C13286c cVar) {
            synchronized (this) {
                this.f38750b.mo42104a(z ? f38736a0 : f38737b0, cVar);
            }
            mo42864e();
        }
    }

    public C13389r1(C5926g0<TLeft> g0Var, C5926g0<? extends TRight> g0Var2, C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C5926g0<TRightEnd>> oVar2, C12327c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(g0Var);
        this.f38733b = g0Var2;
        this.f38730N = oVar;
        this.f38731O = oVar2;
        this.f38732P = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        C13390a aVar = new C13390a(i0Var, this.f38730N, this.f38731O, this.f38732P);
        i0Var.mo34123a((C12314c) aVar);
        C13287d dVar = new C13287d(aVar, true);
        aVar.f38738N.mo42072b(dVar);
        C13287d dVar2 = new C13287d(aVar, false);
        aVar.f38738N.mo42072b(dVar2);
        this.f37851a.mo23893a(dVar);
        this.f38733b.mo23893a(dVar2);
    }
}
