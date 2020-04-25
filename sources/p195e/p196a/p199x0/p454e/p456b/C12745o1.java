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
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.o1 */
/* compiled from: FlowableGroupJoin */
public final class C12745o1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C12511a<TLeft, R> {

    /* renamed from: N */
    final C6007b<? extends TRight> f36572N;

    /* renamed from: O */
    final C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> f36573O;

    /* renamed from: P */
    final C12339o<? super TRight, ? extends C6007b<TRightEnd>> f36574P;

    /* renamed from: Q */
    final C12327c<? super TLeft, ? super C5929l<TRight>, ? extends R> f36575Q;

    /* renamed from: e.a.x0.e.b.o1$a */
    /* compiled from: FlowableGroupJoin */
    static final class C12746a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements C14063d, C12747b {

        /* renamed from: Z */
        static final Integer f36576Z = Integer.valueOf(1);

        /* renamed from: a0 */
        static final Integer f36577a0 = Integer.valueOf(2);

        /* renamed from: b0 */
        static final Integer f36578b0 = Integer.valueOf(3);

        /* renamed from: c0 */
        static final Integer f36579c0 = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: N */
        final C13663c<Object> f36580N = new C13663c<>(C5929l.m26793R());

        /* renamed from: O */
        final C12313b f36581O = new C12313b();

        /* renamed from: P */
        final Map<Integer, C12223g<TRight>> f36582P = new LinkedHashMap();

        /* renamed from: Q */
        final Map<Integer, TRight> f36583Q = new LinkedHashMap();

        /* renamed from: R */
        final AtomicReference<Throwable> f36584R = new AtomicReference<>();

        /* renamed from: S */
        final C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> f36585S;

        /* renamed from: T */
        final C12339o<? super TRight, ? extends C6007b<TRightEnd>> f36586T;

        /* renamed from: U */
        final C12327c<? super TLeft, ? super C5929l<TRight>, ? extends R> f36587U;

        /* renamed from: V */
        final AtomicInteger f36588V;

        /* renamed from: W */
        int f36589W;

        /* renamed from: X */
        int f36590X;

        /* renamed from: Y */
        volatile boolean f36591Y;

        /* renamed from: a */
        final C14062c<? super R> f36592a;

        /* renamed from: b */
        final AtomicLong f36593b = new AtomicLong();

        C12746a(C14062c<? super R> cVar, C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super TLeft, ? super C5929l<TRight>, ? extends R> cVar2) {
            this.f36592a = cVar;
            this.f36585S = oVar;
            this.f36586T = oVar2;
            this.f36587U = cVar2;
            this.f36588V = new AtomicInteger(2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42402a() {
            this.f36581O.dispose();
        }

        /* renamed from: b */
        public void mo42409b(Throwable th) {
            if (C13754k.m58722a(this.f36584R, th)) {
                mo42410d();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36593b, j);
            }
        }

        public void cancel() {
            if (!this.f36591Y) {
                this.f36591Y = true;
                mo42402a();
                if (getAndIncrement() == 0) {
                    this.f36580N.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42410d() {
            if (getAndIncrement() == 0) {
                C13663c<Object> cVar = this.f36580N;
                C14062c<? super R> cVar2 = this.f36592a;
                int i = 1;
                while (!this.f36591Y) {
                    if (((Throwable) this.f36584R.get()) != null) {
                        cVar.clear();
                        mo42402a();
                        mo42404a(cVar2);
                        return;
                    }
                    boolean z = this.f36588V.get() == 0;
                    Integer num = (Integer) cVar.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        for (C12223g onComplete : this.f36582P.values()) {
                            onComplete.onComplete();
                        }
                        this.f36582P.clear();
                        this.f36583Q.clear();
                        this.f36581O.dispose();
                        cVar2.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = cVar.poll();
                        if (num == f36576Z) {
                            C12223g b0 = C12223g.m55070b0();
                            int i2 = this.f36589W;
                            this.f36589W = i2 + 1;
                            this.f36582P.put(Integer.valueOf(i2), b0);
                            try {
                                C6007b bVar = (C6007b) C12390b.m55563a(this.f36585S.apply(poll), "The leftEnd returned a null Publisher");
                                C12748c cVar3 = new C12748c(this, true, i2);
                                this.f36581O.mo42072b(cVar3);
                                bVar.mo24397a(cVar3);
                                if (((Throwable) this.f36584R.get()) != null) {
                                    cVar.clear();
                                    mo42402a();
                                    mo42404a(cVar2);
                                    return;
                                }
                                try {
                                    Object a = C12390b.m55563a(this.f36587U.mo35569a(poll, b0), "The resultSelector returned a null value");
                                    if (this.f36593b.get() != 0) {
                                        cVar2.mo41789a(a);
                                        C13747d.m58699c(this.f36593b, 1);
                                        for (Object a2 : this.f36583Q.values()) {
                                            b0.mo41789a(a2);
                                        }
                                    } else {
                                        mo42406a(new MissingBackpressureException("Could not emit value due to lack of requests"), cVar2, cVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    mo42406a(th, cVar2, cVar);
                                    return;
                                }
                            } catch (Throwable th2) {
                                mo42406a(th2, cVar2, cVar);
                                return;
                            }
                        } else if (num == f36577a0) {
                            int i3 = this.f36590X;
                            this.f36590X = i3 + 1;
                            this.f36583Q.put(Integer.valueOf(i3), poll);
                            try {
                                C6007b bVar2 = (C6007b) C12390b.m55563a(this.f36586T.apply(poll), "The rightEnd returned a null Publisher");
                                C12748c cVar4 = new C12748c(this, false, i3);
                                this.f36581O.mo42072b(cVar4);
                                bVar2.mo24397a(cVar4);
                                if (((Throwable) this.f36584R.get()) != null) {
                                    cVar.clear();
                                    mo42402a();
                                    mo42404a(cVar2);
                                    return;
                                }
                                for (C12223g a3 : this.f36582P.values()) {
                                    a3.mo41789a(poll);
                                }
                            } catch (Throwable th3) {
                                mo42406a(th3, cVar2, cVar);
                                return;
                            }
                        } else if (num == f36578b0) {
                            C12748c cVar5 = (C12748c) poll;
                            C12223g gVar = (C12223g) this.f36582P.remove(Integer.valueOf(cVar5.f36594N));
                            this.f36581O.mo42069a((C12314c) cVar5);
                            if (gVar != null) {
                                gVar.onComplete();
                            }
                        } else if (num == f36579c0) {
                            C12748c cVar6 = (C12748c) poll;
                            this.f36583Q.remove(Integer.valueOf(cVar6.f36594N));
                            this.f36581O.mo42069a((C12314c) cVar6);
                        }
                    }
                }
                cVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42404a(C14062c<?> cVar) {
            Throwable a = C13754k.m58720a(this.f36584R);
            for (C12223g onError : this.f36582P.values()) {
                onError.onError(a);
            }
            this.f36582P.clear();
            this.f36583Q.clear();
            cVar.onError(a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42406a(Throwable th, C14062c<?> cVar, C12406o<?> oVar) {
            C14398a.m62357b(th);
            C13754k.m58722a(this.f36584R, th);
            oVar.clear();
            mo42402a();
            mo42404a(cVar);
        }

        /* renamed from: a */
        public void mo42405a(Throwable th) {
            if (C13754k.m58722a(this.f36584R, th)) {
                this.f36588V.decrementAndGet();
                mo42410d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42403a(C12749d dVar) {
            this.f36581O.mo42073c(dVar);
            this.f36588V.decrementAndGet();
            mo42410d();
        }

        /* renamed from: a */
        public void mo42408a(boolean z, Object obj) {
            synchronized (this) {
                this.f36580N.mo42104a(z ? f36576Z : f36577a0, obj);
            }
            mo42410d();
        }

        /* renamed from: a */
        public void mo42407a(boolean z, C12748c cVar) {
            synchronized (this) {
                this.f36580N.mo42104a(z ? f36578b0 : f36579c0, cVar);
            }
            mo42410d();
        }
    }

    /* renamed from: e.a.x0.e.b.o1$b */
    /* compiled from: FlowableGroupJoin */
    interface C12747b {
        /* renamed from: a */
        void mo42403a(C12749d dVar);

        /* renamed from: a */
        void mo42405a(Throwable th);

        /* renamed from: a */
        void mo42407a(boolean z, C12748c cVar);

        /* renamed from: a */
        void mo42408a(boolean z, Object obj);

        /* renamed from: b */
        void mo42409b(Throwable th);
    }

    /* renamed from: e.a.x0.e.b.o1$c */
    /* compiled from: FlowableGroupJoin */
    static final class C12748c extends AtomicReference<C14063d> implements C12297q<Object>, C12314c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: N */
        final int f36594N;

        /* renamed from: a */
        final C12747b f36595a;

        /* renamed from: b */
        final boolean f36596b;

        C12748c(C12747b bVar, boolean z, int i) {
            this.f36595a = bVar;
            this.f36596b = z;
            this.f36594N = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) get());
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            this.f36595a.mo42407a(this.f36596b, this);
        }

        public void onError(Throwable th) {
            this.f36595a.mo42409b(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            if (C13742j.m58674a((AtomicReference<C14063d>) this)) {
                this.f36595a.mo42407a(this.f36596b, this);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.o1$d */
    /* compiled from: FlowableGroupJoin */
    static final class C12749d extends AtomicReference<C14063d> implements C12297q<Object>, C12314c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: a */
        final C12747b f36597a;

        /* renamed from: b */
        final boolean f36598b;

        C12749d(C12747b bVar, boolean z) {
            this.f36597a = bVar;
            this.f36598b = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) get());
        }

        public void dispose() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            this.f36597a.mo42403a(this);
        }

        public void onError(Throwable th) {
            this.f36597a.mo42405a(th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            this.f36597a.mo42408a(this.f36598b, obj);
        }
    }

    public C12745o1(C5929l<TLeft> lVar, C6007b<? extends TRight> bVar, C12339o<? super TLeft, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super TLeft, ? super C5929l<TRight>, ? extends R> cVar) {
        super(lVar);
        this.f36572N = bVar;
        this.f36573O = oVar;
        this.f36574P = oVar2;
        this.f36575Q = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C12746a aVar = new C12746a(cVar, this.f36573O, this.f36574P, this.f36575Q);
        cVar.mo41788a((C14063d) aVar);
        C12749d dVar = new C12749d(aVar, true);
        aVar.f36581O.mo42072b(dVar);
        C12749d dVar2 = new C12749d(aVar, false);
        aVar.f36581O.mo42072b(dVar2);
        this.f35814b.mo24393a((C12297q<? super T>) dVar);
        this.f36572N.mo24397a(dVar2);
    }
}
