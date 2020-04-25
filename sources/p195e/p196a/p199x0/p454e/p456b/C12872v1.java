package p195e.p196a.p199x0.p454e.p456b;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.v1 */
/* compiled from: FlowableJoin */
public final class C12872v1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C12511a<TLeft, R> {

    /* renamed from: N */
    final C6007b<? extends TRight> f37036N;

    /* renamed from: O */
    final C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> f37037O;

    /* renamed from: P */
    final C12339o<? super TRight, ? extends C6007b<TRightEnd>> f37038P;

    /* renamed from: Q */
    final C12327c<? super TLeft, ? super TRight, ? extends R> f37039Q;

    /* renamed from: e.a.x0.e.b.v1$a */
    /* compiled from: FlowableJoin */
    static final class C12873a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C14063d, C12747b {

        /* renamed from: Z */
        static final Integer f37040Z = Integer.valueOf(1);

        /* renamed from: a0 */
        static final Integer f37041a0 = Integer.valueOf(2);

        /* renamed from: b0 */
        static final Integer f37042b0 = Integer.valueOf(3);

        /* renamed from: c0 */
        static final Integer f37043c0 = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: N */
        final C13663c<Object> f37044N = new C13663c<>(C5929l.m26793R());

        /* renamed from: O */
        final C12313b f37045O = new C12313b();

        /* renamed from: P */
        final Map<Integer, TLeft> f37046P = new LinkedHashMap();

        /* renamed from: Q */
        final Map<Integer, TRight> f37047Q = new LinkedHashMap();

        /* renamed from: R */
        final AtomicReference<Throwable> f37048R = new AtomicReference<>();

        /* renamed from: S */
        final C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> f37049S;

        /* renamed from: T */
        final C12339o<? super TRight, ? extends C6007b<TRightEnd>> f37050T;

        /* renamed from: U */
        final C12327c<? super TLeft, ? super TRight, ? extends R> f37051U;

        /* renamed from: V */
        final AtomicInteger f37052V;

        /* renamed from: W */
        int f37053W;

        /* renamed from: X */
        int f37054X;

        /* renamed from: Y */
        volatile boolean f37055Y;

        /* renamed from: a */
        final C14062c<? super R> f37056a;

        /* renamed from: b */
        final AtomicLong f37057b = new AtomicLong();

        C12873a(C14062c<? super R> cVar, C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super TLeft, ? super TRight, ? extends R> cVar2) {
            this.f37056a = cVar;
            this.f37049S = oVar;
            this.f37050T = oVar2;
            this.f37051U = cVar2;
            this.f37052V = new AtomicInteger(2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42496a() {
            this.f37045O.dispose();
        }

        /* renamed from: b */
        public void mo42409b(Throwable th) {
            if (C13754k.m58722a(this.f37048R, th)) {
                mo42499d();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37057b, j);
            }
        }

        public void cancel() {
            if (!this.f37055Y) {
                this.f37055Y = true;
                mo42496a();
                if (getAndIncrement() == 0) {
                    this.f37044N.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42499d() {
            if (getAndIncrement() == 0) {
                C13663c<Object> cVar = this.f37044N;
                C14062c<? super R> cVar2 = this.f37056a;
                boolean z = true;
                int i = 1;
                while (!this.f37055Y) {
                    if (((Throwable) this.f37048R.get()) != null) {
                        cVar.clear();
                        mo42496a();
                        mo42497a(cVar2);
                        return;
                    }
                    boolean z2 = this.f37052V.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z3 = num == null;
                    if (z2 && z3) {
                        this.f37046P.clear();
                        this.f37047Q.clear();
                        this.f37045O.dispose();
                        cVar2.onComplete();
                        return;
                    } else if (z3) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        String str = "Could not emit value due to lack of requests";
                        String str2 = "The resultSelector returned a null value";
                        if (num == f37040Z) {
                            int i2 = this.f37053W;
                            this.f37053W = i2 + 1;
                            this.f37046P.put(Integer.valueOf(i2), poll);
                            try {
                                C6007b bVar = (C6007b) C12390b.m55563a(this.f37049S.apply(poll), "The leftEnd returned a null Publisher");
                                C12748c cVar3 = new C12748c(this, z, i2);
                                this.f37045O.mo42072b(cVar3);
                                bVar.mo24397a(cVar3);
                                if (((Throwable) this.f37048R.get()) != null) {
                                    cVar.clear();
                                    mo42496a();
                                    mo42497a(cVar2);
                                    return;
                                }
                                long j = this.f37057b.get();
                                long j2 = 0;
                                for (Object a : this.f37047Q.values()) {
                                    try {
                                        Object a2 = C12390b.m55563a(this.f37051U.mo35569a(poll, a), str2);
                                        if (j2 != j) {
                                            cVar2.mo41789a(a2);
                                            j2++;
                                        } else {
                                            C13754k.m58722a(this.f37048R, new MissingBackpressureException(str));
                                            cVar.clear();
                                            mo42496a();
                                            mo42497a(cVar2);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        mo42498a(th, cVar2, cVar);
                                        return;
                                    }
                                }
                                if (j2 != 0) {
                                    C13747d.m58699c(this.f37057b, j2);
                                }
                            } catch (Throwable th2) {
                                mo42498a(th2, cVar2, cVar);
                                return;
                            }
                        } else if (num == f37041a0) {
                            int i3 = this.f37054X;
                            this.f37054X = i3 + 1;
                            this.f37047Q.put(Integer.valueOf(i3), poll);
                            try {
                                C6007b bVar2 = (C6007b) C12390b.m55563a(this.f37050T.apply(poll), "The rightEnd returned a null Publisher");
                                C12748c cVar4 = new C12748c(this, false, i3);
                                this.f37045O.mo42072b(cVar4);
                                bVar2.mo24397a(cVar4);
                                if (((Throwable) this.f37048R.get()) != null) {
                                    cVar.clear();
                                    mo42496a();
                                    mo42497a(cVar2);
                                    return;
                                }
                                long j3 = this.f37057b.get();
                                long j4 = 0;
                                for (Object a3 : this.f37046P.values()) {
                                    try {
                                        Object a4 = C12390b.m55563a(this.f37051U.mo35569a(a3, poll), str2);
                                        if (j4 != j3) {
                                            cVar2.mo41789a(a4);
                                            j4++;
                                        } else {
                                            C13754k.m58722a(this.f37048R, new MissingBackpressureException(str));
                                            cVar.clear();
                                            mo42496a();
                                            mo42497a(cVar2);
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        mo42498a(th3, cVar2, cVar);
                                        return;
                                    }
                                }
                                if (j4 != 0) {
                                    C13747d.m58699c(this.f37057b, j4);
                                }
                            } catch (Throwable th4) {
                                mo42498a(th4, cVar2, cVar);
                                return;
                            }
                        } else if (num == f37042b0) {
                            C12748c cVar5 = (C12748c) poll;
                            this.f37046P.remove(Integer.valueOf(cVar5.f36594N));
                            this.f37045O.mo42069a((C12314c) cVar5);
                        } else if (num == f37043c0) {
                            C12748c cVar6 = (C12748c) poll;
                            this.f37047Q.remove(Integer.valueOf(cVar6.f36594N));
                            this.f37045O.mo42069a((C12314c) cVar6);
                        }
                        z = true;
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42497a(C14062c<?> cVar) {
            Throwable a = C13754k.m58720a(this.f37048R);
            this.f37046P.clear();
            this.f37047Q.clear();
            cVar.onError(a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42498a(Throwable th, C14062c<?> cVar, C12406o<?> oVar) {
            C14398a.m62357b(th);
            C13754k.m58722a(this.f37048R, th);
            oVar.clear();
            mo42496a();
            mo42497a(cVar);
        }

        /* renamed from: a */
        public void mo42405a(Throwable th) {
            if (C13754k.m58722a(this.f37048R, th)) {
                this.f37052V.decrementAndGet();
                mo42499d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42403a(C12749d dVar) {
            this.f37045O.mo42073c(dVar);
            this.f37052V.decrementAndGet();
            mo42499d();
        }

        /* renamed from: a */
        public void mo42408a(boolean z, Object obj) {
            synchronized (this) {
                this.f37044N.mo42104a(z ? f37040Z : f37041a0, obj);
            }
            mo42499d();
        }

        /* renamed from: a */
        public void mo42407a(boolean z, C12748c cVar) {
            synchronized (this) {
                this.f37044N.mo42104a(z ? f37042b0 : f37043c0, cVar);
            }
            mo42499d();
        }
    }

    public C12872v1(C5929l<TLeft> lVar, C6007b<? extends TRight> bVar, C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(lVar);
        this.f37036N = bVar;
        this.f37037O = oVar;
        this.f37038P = oVar2;
        this.f37039Q = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C12873a aVar = new C12873a(cVar, this.f37037O, this.f37038P, this.f37039Q);
        cVar.mo41788a((C14063d) aVar);
        C12749d dVar = new C12749d(aVar, true);
        aVar.f37045O.mo42072b(dVar);
        C12749d dVar2 = new C12749d(aVar, false);
        aVar.f37045O.mo42072b(dVar2);
        this.f35814b.mo24393a((C12297q<? super T>) dVar);
        this.f37036N.mo24397a(dVar2);
    }
}
