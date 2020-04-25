package p195e.p196a.p199x0.p454e.p459e;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p442e1.C12266j;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.k1 */
/* compiled from: ObservableGroupJoin */
public final class C13283k1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C13131a<TLeft, R> {

    /* renamed from: N */
    final C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> f38376N;

    /* renamed from: O */
    final C12339o<? super TRight, ? extends C5926g0<TRightEnd>> f38377O;

    /* renamed from: P */
    final C12327c<? super TLeft, ? super C5923b0<TRight>, ? extends R> f38378P;

    /* renamed from: b */
    final C5926g0<? extends TRight> f38379b;

    /* renamed from: e.a.x0.e.e.k1$a */
    /* compiled from: ObservableGroupJoin */
    static final class C13284a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C12314c, C13285b {

        /* renamed from: Y */
        static final Integer f38380Y = Integer.valueOf(1);

        /* renamed from: Z */
        static final Integer f38381Z = Integer.valueOf(2);

        /* renamed from: a0 */
        static final Integer f38382a0 = Integer.valueOf(3);

        /* renamed from: b0 */
        static final Integer f38383b0 = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: N */
        final C12313b f38384N = new C12313b();

        /* renamed from: O */
        final Map<Integer, C12266j<TRight>> f38385O = new LinkedHashMap();

        /* renamed from: P */
        final Map<Integer, TRight> f38386P = new LinkedHashMap();

        /* renamed from: Q */
        final AtomicReference<Throwable> f38387Q = new AtomicReference<>();

        /* renamed from: R */
        final C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> f38388R;

        /* renamed from: S */
        final C12339o<? super TRight, ? extends C5926g0<TRightEnd>> f38389S;

        /* renamed from: T */
        final C12327c<? super TLeft, ? super C5923b0<TRight>, ? extends R> f38390T;

        /* renamed from: U */
        final AtomicInteger f38391U;

        /* renamed from: V */
        int f38392V;

        /* renamed from: W */
        int f38393W;

        /* renamed from: X */
        volatile boolean f38394X;

        /* renamed from: a */
        final C12280i0<? super R> f38395a;

        /* renamed from: b */
        final C13663c<Object> f38396b = new C13663c<>(C5923b0.m26088M());

        C13284a(C12280i0<? super R> i0Var, C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C5926g0<TRightEnd>> oVar2, C12327c<? super TLeft, ? super C5923b0<TRight>, ? extends R> cVar) {
            this.f38395a = i0Var;
            this.f38388R = oVar;
            this.f38389S = oVar2;
            this.f38390T = cVar;
            this.f38391U = new AtomicInteger(2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42784a() {
            this.f38384N.dispose();
        }

        /* renamed from: b */
        public void mo42791b(Throwable th) {
            if (C13754k.m58722a(this.f38387Q, th)) {
                mo42792e();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38394X;
        }

        public void dispose() {
            if (!this.f38394X) {
                this.f38394X = true;
                mo42784a();
                if (getAndIncrement() == 0) {
                    this.f38396b.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42792e() {
            if (getAndIncrement() == 0) {
                C13663c<Object> cVar = this.f38396b;
                C12280i0<? super R> i0Var = this.f38395a;
                int i = 1;
                while (!this.f38394X) {
                    if (((Throwable) this.f38387Q.get()) != null) {
                        cVar.clear();
                        mo42784a();
                        mo42785a(i0Var);
                        return;
                    }
                    boolean z = this.f38391U.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        for (C12266j onComplete : this.f38385O.values()) {
                            onComplete.onComplete();
                        }
                        this.f38385O.clear();
                        this.f38386P.clear();
                        this.f38384N.dispose();
                        i0Var.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        if (num == f38380Y) {
                            C12266j W = C12266j.m55266W();
                            int i2 = this.f38392V;
                            this.f38392V = i2 + 1;
                            this.f38385O.put(Integer.valueOf(i2), W);
                            try {
                                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38388R.apply(poll), "The leftEnd returned a null ObservableSource");
                                C13286c cVar2 = new C13286c(this, true, i2);
                                this.f38384N.mo42072b(cVar2);
                                g0Var.mo23893a(cVar2);
                                if (((Throwable) this.f38387Q.get()) != null) {
                                    cVar.clear();
                                    mo42784a();
                                    mo42785a(i0Var);
                                    return;
                                }
                                try {
                                    i0Var.mo33453a(C12390b.m55563a(this.f38390T.mo35569a(poll, W), "The resultSelector returned a null value"));
                                    for (Object a : this.f38386P.values()) {
                                        W.mo33453a(a);
                                    }
                                } catch (Throwable th) {
                                    mo42788a(th, i0Var, cVar);
                                    return;
                                }
                            } catch (Throwable th2) {
                                mo42788a(th2, i0Var, cVar);
                                return;
                            }
                        } else if (num == f38381Z) {
                            int i3 = this.f38393W;
                            this.f38393W = i3 + 1;
                            this.f38386P.put(Integer.valueOf(i3), poll);
                            try {
                                C5926g0 g0Var2 = (C5926g0) C12390b.m55563a(this.f38389S.apply(poll), "The rightEnd returned a null ObservableSource");
                                C13286c cVar3 = new C13286c(this, false, i3);
                                this.f38384N.mo42072b(cVar3);
                                g0Var2.mo23893a(cVar3);
                                if (((Throwable) this.f38387Q.get()) != null) {
                                    cVar.clear();
                                    mo42784a();
                                    mo42785a(i0Var);
                                    return;
                                }
                                for (C12266j a2 : this.f38385O.values()) {
                                    a2.mo33453a(poll);
                                }
                            } catch (Throwable th3) {
                                mo42788a(th3, i0Var, cVar);
                                return;
                            }
                        } else if (num == f38382a0) {
                            C13286c cVar4 = (C13286c) poll;
                            C12266j jVar = (C12266j) this.f38385O.remove(Integer.valueOf(cVar4.f38397N));
                            this.f38384N.mo42069a((C12314c) cVar4);
                            if (jVar != null) {
                                jVar.onComplete();
                            }
                        } else if (num == f38383b0) {
                            C13286c cVar5 = (C13286c) poll;
                            this.f38386P.remove(Integer.valueOf(cVar5.f38397N));
                            this.f38384N.mo42069a((C12314c) cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42785a(C12280i0<?> i0Var) {
            Throwable a = C13754k.m58720a(this.f38387Q);
            for (C12266j onError : this.f38385O.values()) {
                onError.onError(a);
            }
            this.f38385O.clear();
            this.f38386P.clear();
            i0Var.onError(a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42788a(Throwable th, C12280i0<?> i0Var, C13663c<?> cVar) {
            C14398a.m62357b(th);
            C13754k.m58722a(this.f38387Q, th);
            cVar.clear();
            mo42784a();
            mo42785a(i0Var);
        }

        /* renamed from: a */
        public void mo42787a(Throwable th) {
            if (C13754k.m58722a(this.f38387Q, th)) {
                this.f38391U.decrementAndGet();
                mo42792e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42786a(C13287d dVar) {
            this.f38384N.mo42073c(dVar);
            this.f38391U.decrementAndGet();
            mo42792e();
        }

        /* renamed from: a */
        public void mo42790a(boolean z, Object obj) {
            synchronized (this) {
                this.f38396b.mo42104a(z ? f38380Y : f38381Z, obj);
            }
            mo42792e();
        }

        /* renamed from: a */
        public void mo42789a(boolean z, C13286c cVar) {
            synchronized (this) {
                this.f38396b.mo42104a(z ? f38382a0 : f38383b0, cVar);
            }
            mo42792e();
        }
    }

    /* renamed from: e.a.x0.e.e.k1$b */
    /* compiled from: ObservableGroupJoin */
    interface C13285b {
        /* renamed from: a */
        void mo42786a(C13287d dVar);

        /* renamed from: a */
        void mo42787a(Throwable th);

        /* renamed from: a */
        void mo42789a(boolean z, C13286c cVar);

        /* renamed from: a */
        void mo42790a(boolean z, Object obj);

        /* renamed from: b */
        void mo42791b(Throwable th);
    }

    /* renamed from: e.a.x0.e.e.k1$c */
    /* compiled from: ObservableGroupJoin */
    static final class C13286c extends AtomicReference<C12314c> implements C12280i0<Object>, C12314c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: N */
        final int f38397N;

        /* renamed from: a */
        final C13285b f38398a;

        /* renamed from: b */
        final boolean f38399b;

        C13286c(C13285b bVar, boolean z, int i) {
            this.f38398a = bVar;
            this.f38399b = z;
            this.f38397N = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f38398a.mo42789a(this.f38399b, this);
        }

        public void onError(Throwable th) {
            this.f38398a.mo42791b(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
                this.f38398a.mo42789a(this.f38399b, this);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.k1$d */
    /* compiled from: ObservableGroupJoin */
    static final class C13287d extends AtomicReference<C12314c> implements C12280i0<Object>, C12314c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: a */
        final C13285b f38400a;

        /* renamed from: b */
        final boolean f38401b;

        C13287d(C13285b bVar, boolean z) {
            this.f38400a = bVar;
            this.f38401b = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f38400a.mo42786a(this);
        }

        public void onError(Throwable th) {
            this.f38400a.mo42787a(th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            this.f38400a.mo42790a(this.f38401b, obj);
        }
    }

    public C13283k1(C5926g0<TLeft> g0Var, C5926g0<? extends TRight> g0Var2, C12339o<? super TLeft, ? extends C5926g0<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C5926g0<TRightEnd>> oVar2, C12327c<? super TLeft, ? super C5923b0<TRight>, ? extends R> cVar) {
        super(g0Var);
        this.f38379b = g0Var2;
        this.f38376N = oVar;
        this.f38377O = oVar2;
        this.f38378P = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        C13284a aVar = new C13284a(i0Var, this.f38376N, this.f38377O, this.f38378P);
        i0Var.mo34123a((C12314c) aVar);
        C13287d dVar = new C13287d(aVar, true);
        aVar.f38384N.mo42072b(dVar);
        C13287d dVar2 = new C13287d(aVar, false);
        aVar.f38384N.mo42072b(dVar2);
        this.f37851a.mo23893a(dVar);
        this.f38379b.mo23893a(dVar2);
    }
}
