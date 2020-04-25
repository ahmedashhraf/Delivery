package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12328d;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.m3 */
/* compiled from: FlowableSequenceEqual */
public final class C12716m3<T> extends C5929l<Boolean> {

    /* renamed from: N */
    final C6007b<? extends T> f36455N;

    /* renamed from: O */
    final C12328d<? super T, ? super T> f36456O;

    /* renamed from: P */
    final int f36457P;

    /* renamed from: b */
    final C6007b<? extends T> f36458b;

    /* renamed from: e.a.x0.e.b.m3$a */
    /* compiled from: FlowableSequenceEqual */
    static final class C12717a<T> extends C13738f<Boolean> implements C12718b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: V */
        final C12328d<? super T, ? super T> f36459V;

        /* renamed from: W */
        final C12719c<T> f36460W;

        /* renamed from: X */
        final C12719c<T> f36461X;

        /* renamed from: Y */
        final C13746c f36462Y;

        /* renamed from: Z */
        final AtomicInteger f36463Z = new AtomicInteger();

        /* renamed from: a0 */
        T f36464a0;

        /* renamed from: b0 */
        T f36465b0;

        C12717a(C14062c<? super Boolean> cVar, int i, C12328d<? super T, ? super T> dVar) {
            super(cVar);
            this.f36459V = dVar;
            this.f36460W = new C12719c<>(this, i);
            this.f36461X = new C12719c<>(this, i);
            this.f36462Y = new C13746c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42367a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
            bVar.mo24397a(this.f36460W);
            bVar2.mo24397a(this.f36461X);
        }

        public void cancel() {
            super.cancel();
            this.f36460W.mo42370a();
            this.f36461X.mo42370a();
            if (this.f36463Z.getAndIncrement() == 0) {
                this.f36460W.mo42371d();
                this.f36461X.mo42371d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42369f() {
            this.f36460W.mo42370a();
            this.f36460W.mo42371d();
            this.f36461X.mo42370a();
            this.f36461X.mo42371d();
        }

        /* renamed from: a */
        public void mo42366a() {
            if (this.f36463Z.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C12406o<T> oVar = this.f36460W.f36468P;
                    C12406o<T> oVar2 = this.f36461X.f36468P;
                    if (oVar != null && oVar2 != null) {
                        while (!mo43124d()) {
                            if (((Throwable) this.f36462Y.get()) != null) {
                                mo42369f();
                                this.f39781a.onError(this.f36462Y.mo43143d());
                                return;
                            }
                            boolean z = this.f36460W.f36469Q;
                            T t = this.f36464a0;
                            if (t == null) {
                                try {
                                    t = oVar.poll();
                                    this.f36464a0 = t;
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    mo42369f();
                                    this.f36462Y.mo43142a(th);
                                    this.f39781a.onError(this.f36462Y.mo43143d());
                                    return;
                                }
                            }
                            boolean z2 = t == null;
                            boolean z3 = this.f36461X.f36469Q;
                            T t2 = this.f36465b0;
                            if (t2 == null) {
                                try {
                                    t2 = oVar2.poll();
                                    this.f36465b0 = t2;
                                } catch (Throwable th2) {
                                    C14398a.m62357b(th2);
                                    mo42369f();
                                    this.f36462Y.mo43142a(th2);
                                    this.f39781a.onError(this.f36462Y.mo43143d());
                                    return;
                                }
                            }
                            boolean z4 = t2 == null;
                            if (z && z3 && z2 && z4) {
                                mo43123c(Boolean.valueOf(true));
                                return;
                            } else if (z && z3 && z2 != z4) {
                                mo42369f();
                                mo43123c(Boolean.valueOf(false));
                                return;
                            } else if (!z2 && !z4) {
                                try {
                                    if (!this.f36459V.mo42089a(t, t2)) {
                                        mo42369f();
                                        mo43123c(Boolean.valueOf(false));
                                        return;
                                    }
                                    this.f36464a0 = null;
                                    this.f36465b0 = null;
                                    this.f36460W.mo42372e();
                                    this.f36461X.mo42372e();
                                } catch (Throwable th3) {
                                    C14398a.m62357b(th3);
                                    mo42369f();
                                    this.f36462Y.mo43142a(th3);
                                    this.f39781a.onError(this.f36462Y.mo43143d());
                                    return;
                                }
                            }
                        }
                        this.f36460W.mo42371d();
                        this.f36461X.mo42371d();
                        return;
                    } else if (mo43124d()) {
                        this.f36460W.mo42371d();
                        this.f36461X.mo42371d();
                        return;
                    } else if (((Throwable) this.f36462Y.get()) != null) {
                        mo42369f();
                        this.f39781a.onError(this.f36462Y.mo43143d());
                        return;
                    }
                    i = this.f36463Z.addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: a */
        public void mo42368a(Throwable th) {
            if (this.f36462Y.mo43142a(th)) {
                mo42366a();
            } else {
                C12205a.m54894b(th);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.m3$b */
    /* compiled from: FlowableSequenceEqual */
    interface C12718b {
        /* renamed from: a */
        void mo42366a();

        /* renamed from: a */
        void mo42368a(Throwable th);
    }

    /* renamed from: e.a.x0.e.b.m3$c */
    /* compiled from: FlowableSequenceEqual */
    static final class C12719c<T> extends AtomicReference<C14063d> implements C12297q<T> {
        private static final long serialVersionUID = 4804128302091633067L;

        /* renamed from: N */
        final int f36466N;

        /* renamed from: O */
        long f36467O;

        /* renamed from: P */
        volatile C12406o<T> f36468P;

        /* renamed from: Q */
        volatile boolean f36469Q;

        /* renamed from: R */
        int f36470R;

        /* renamed from: a */
        final C12718b f36471a;

        /* renamed from: b */
        final int f36472b;

        C12719c(C12718b bVar, int i) {
            this.f36471a = bVar;
            this.f36466N = i - (i >> 2);
            this.f36472b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f36470R = a;
                        this.f36468P = lVar;
                        this.f36469Q = true;
                        this.f36471a.mo42366a();
                        return;
                    } else if (a == 2) {
                        this.f36470R = a;
                        this.f36468P = lVar;
                        dVar.mo41813c((long) this.f36472b);
                        return;
                    }
                }
                this.f36468P = new C13662b(this.f36472b);
                dVar.mo41813c((long) this.f36472b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42371d() {
            C12406o<T> oVar = this.f36468P;
            if (oVar != null) {
                oVar.clear();
            }
        }

        /* renamed from: e */
        public void mo42372e() {
            if (this.f36470R != 1) {
                long j = this.f36467O + 1;
                if (j >= ((long) this.f36466N)) {
                    this.f36467O = 0;
                    ((C14063d) get()).mo41813c(j);
                    return;
                }
                this.f36467O = j;
            }
        }

        public void onComplete() {
            this.f36469Q = true;
            this.f36471a.mo42366a();
        }

        public void onError(Throwable th) {
            this.f36471a.mo42368a(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f36470R != 0 || this.f36468P.offer(t)) {
                this.f36471a.mo42366a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        /* renamed from: a */
        public void mo42370a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    public C12716m3(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C12328d<? super T, ? super T> dVar, int i) {
        this.f36458b = bVar;
        this.f36455N = bVar2;
        this.f36456O = dVar;
        this.f36457P = i;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Boolean> cVar) {
        C12717a aVar = new C12717a(cVar, this.f36457P, this.f36456O);
        cVar.mo41788a((C14063d) aVar);
        aVar.mo42367a(this.f36458b, this.f36455N);
    }
}
