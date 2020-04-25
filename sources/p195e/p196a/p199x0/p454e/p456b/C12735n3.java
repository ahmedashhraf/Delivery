package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.n3 */
/* compiled from: FlowableSequenceEqualSingle */
public final class C12735n3<T> extends C5928k0<Boolean> implements C12393b<Boolean> {

    /* renamed from: N */
    final C12328d<? super T, ? super T> f36540N;

    /* renamed from: O */
    final int f36541O;

    /* renamed from: a */
    final C6007b<? extends T> f36542a;

    /* renamed from: b */
    final C6007b<? extends T> f36543b;

    /* renamed from: e.a.x0.e.b.n3$a */
    /* compiled from: FlowableSequenceEqualSingle */
    static final class C12736a<T> extends AtomicInteger implements C12314c, C12718b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: N */
        final C12719c<T> f36544N;

        /* renamed from: O */
        final C12719c<T> f36545O;

        /* renamed from: P */
        final C13746c f36546P = new C13746c();

        /* renamed from: Q */
        T f36547Q;

        /* renamed from: R */
        T f36548R;

        /* renamed from: a */
        final C12292n0<? super Boolean> f36549a;

        /* renamed from: b */
        final C12328d<? super T, ? super T> f36550b;

        C12736a(C12292n0<? super Boolean> n0Var, int i, C12328d<? super T, ? super T> dVar) {
            this.f36549a = n0Var;
            this.f36550b = dVar;
            this.f36544N = new C12719c<>(this, i);
            this.f36545O = new C12719c<>(this, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42396a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
            bVar.mo24397a(this.f36544N);
            bVar2.mo24397a(this.f36545O);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C13742j.m58672a((C14063d) this.f36544N.get());
        }

        public void dispose() {
            this.f36544N.mo42370a();
            this.f36545O.mo42370a();
            if (getAndIncrement() == 0) {
                this.f36544N.mo42371d();
                this.f36545O.mo42371d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42397e() {
            this.f36544N.mo42370a();
            this.f36544N.mo42371d();
            this.f36545O.mo42370a();
            this.f36545O.mo42371d();
        }

        /* renamed from: a */
        public void mo42366a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    C12406o<T> oVar = this.f36544N.f36468P;
                    C12406o<T> oVar2 = this.f36545O.f36468P;
                    if (oVar != null && oVar2 != null) {
                        while (!mo41878d()) {
                            if (((Throwable) this.f36546P.get()) != null) {
                                mo42397e();
                                this.f36549a.onError(this.f36546P.mo43143d());
                                return;
                            }
                            boolean z = this.f36544N.f36469Q;
                            T t = this.f36547Q;
                            if (t == null) {
                                try {
                                    t = oVar.poll();
                                    this.f36547Q = t;
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    mo42397e();
                                    this.f36546P.mo43142a(th);
                                    this.f36549a.onError(this.f36546P.mo43143d());
                                    return;
                                }
                            }
                            boolean z2 = t == null;
                            boolean z3 = this.f36545O.f36469Q;
                            T t2 = this.f36548R;
                            if (t2 == null) {
                                try {
                                    t2 = oVar2.poll();
                                    this.f36548R = t2;
                                } catch (Throwable th2) {
                                    C14398a.m62357b(th2);
                                    mo42397e();
                                    this.f36546P.mo43142a(th2);
                                    this.f36549a.onError(this.f36546P.mo43143d());
                                    return;
                                }
                            }
                            boolean z4 = t2 == null;
                            if (z && z3 && z2 && z4) {
                                this.f36549a.onSuccess(Boolean.valueOf(true));
                                return;
                            } else if (z && z3 && z2 != z4) {
                                mo42397e();
                                this.f36549a.onSuccess(Boolean.valueOf(false));
                                return;
                            } else if (!z2 && !z4) {
                                try {
                                    if (!this.f36550b.mo42089a(t, t2)) {
                                        mo42397e();
                                        this.f36549a.onSuccess(Boolean.valueOf(false));
                                        return;
                                    }
                                    this.f36547Q = null;
                                    this.f36548R = null;
                                    this.f36544N.mo42372e();
                                    this.f36545O.mo42372e();
                                } catch (Throwable th3) {
                                    C14398a.m62357b(th3);
                                    mo42397e();
                                    this.f36546P.mo43142a(th3);
                                    this.f36549a.onError(this.f36546P.mo43143d());
                                    return;
                                }
                            }
                        }
                        this.f36544N.mo42371d();
                        this.f36545O.mo42371d();
                        return;
                    } else if (mo41878d()) {
                        this.f36544N.mo42371d();
                        this.f36545O.mo42371d();
                        return;
                    } else if (((Throwable) this.f36546P.get()) != null) {
                        mo42397e();
                        this.f36549a.onError(this.f36546P.mo43143d());
                        return;
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: a */
        public void mo42368a(Throwable th) {
            if (this.f36546P.mo43142a(th)) {
                mo42366a();
            } else {
                C12205a.m54894b(th);
            }
        }
    }

    public C12735n3(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C12328d<? super T, ? super T> dVar, int i) {
        this.f36542a = bVar;
        this.f36543b = bVar2;
        this.f36540N = dVar;
        this.f36541O = i;
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        C12736a aVar = new C12736a(n0Var, this.f36541O, this.f36540N);
        n0Var.mo41974a(aVar);
        aVar.mo42396a(this.f36542a, this.f36543b);
    }

    /* renamed from: b */
    public C5929l<Boolean> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12716m3<T>(this.f36542a, this.f36543b, this.f36540N, this.f36541O));
    }
}
