package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.g */
/* compiled from: ObservableConcatMapCompletable */
public final class C13112g<T> extends C5925c {

    /* renamed from: N */
    final C13753j f37757N;

    /* renamed from: O */
    final int f37758O;

    /* renamed from: a */
    final C5923b0<T> f37759a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f37760b;

    /* renamed from: e.a.x0.e.d.g$a */
    /* compiled from: ObservableConcatMapCompletable */
    static final class C13113a<T> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: N */
        final C13753j f37761N;

        /* renamed from: O */
        final C13746c f37762O = new C13746c();

        /* renamed from: P */
        final C13114a f37763P = new C13114a(this);

        /* renamed from: Q */
        final int f37764Q;

        /* renamed from: R */
        C12406o<T> f37765R;

        /* renamed from: S */
        C12314c f37766S;

        /* renamed from: T */
        volatile boolean f37767T;

        /* renamed from: U */
        volatile boolean f37768U;

        /* renamed from: V */
        volatile boolean f37769V;

        /* renamed from: a */
        final C12268f f37770a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f37771b;

        /* renamed from: e.a.x0.e.d.g$a$a */
        /* compiled from: ObservableConcatMapCompletable */
        static final class C13114a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: a */
            final C13113a<?> f37772a;

            C13114a(C13113a<?> aVar) {
                this.f37772a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                this.f37772a.mo42635e();
            }

            public void onError(Throwable th) {
                this.f37772a.mo42634a(th);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42636a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13113a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, C13753j jVar, int i) {
            this.f37770a = fVar;
            this.f37771b = oVar;
            this.f37761N = jVar;
            this.f37764Q = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37766S, cVar)) {
                this.f37766S = cVar;
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(3);
                    if (a == 1) {
                        this.f37765R = jVar;
                        this.f37768U = true;
                        this.f37770a.mo41921a(this);
                        mo42633a();
                        return;
                    } else if (a == 2) {
                        this.f37765R = jVar;
                        this.f37770a.mo41921a(this);
                        return;
                    }
                }
                this.f37765R = new C13663c(this.f37764Q);
                this.f37770a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37769V;
        }

        public void dispose() {
            this.f37769V = true;
            this.f37766S.dispose();
            this.f37763P.mo42636a();
            if (getAndIncrement() == 0) {
                this.f37765R.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42635e() {
            this.f37767T = false;
            mo42633a();
        }

        public void onComplete() {
            this.f37768U = true;
            mo42633a();
        }

        public void onError(Throwable th) {
            if (!this.f37762O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37761N == C13753j.IMMEDIATE) {
                this.f37769V = true;
                this.f37763P.mo42636a();
                Throwable d = this.f37762O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37770a.onError(d);
                }
                if (getAndIncrement() == 0) {
                    this.f37765R.clear();
                }
            } else {
                this.f37768U = true;
                mo42633a();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (t != null) {
                this.f37765R.offer(t);
            }
            mo42633a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42634a(Throwable th) {
            if (!this.f37762O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37761N == C13753j.IMMEDIATE) {
                this.f37769V = true;
                this.f37766S.dispose();
                Throwable d = this.f37762O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37770a.onError(d);
                }
                if (getAndIncrement() == 0) {
                    this.f37765R.clear();
                }
            } else {
                this.f37767T = false;
                mo42633a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42633a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C13746c cVar = this.f37762O;
                C13753j jVar = this.f37761N;
                while (!this.f37769V) {
                    if (!this.f37767T) {
                        if (jVar != C13753j.BOUNDARY || cVar.get() == null) {
                            boolean z2 = this.f37768U;
                            C5927i iVar = null;
                            try {
                                Object poll = this.f37765R.poll();
                                if (poll != null) {
                                    iVar = (C5927i) C12390b.m55563a(this.f37771b.apply(poll), "The mapper returned a null CompletableSource");
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.f37769V = true;
                                    Throwable d = cVar.mo43143d();
                                    if (d != null) {
                                        this.f37770a.onError(d);
                                    } else {
                                        this.f37770a.onComplete();
                                    }
                                    return;
                                } else if (!z) {
                                    this.f37767T = true;
                                    iVar.mo24122a(this.f37763P);
                                }
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                this.f37769V = true;
                                this.f37765R.clear();
                                this.f37766S.dispose();
                                cVar.mo43142a(th);
                                this.f37770a.onError(cVar.mo43143d());
                                return;
                            }
                        } else {
                            this.f37769V = true;
                            this.f37765R.clear();
                            this.f37770a.onError(cVar.mo43143d());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f37765R.clear();
            }
        }
    }

    public C13112g(C5923b0<T> b0Var, C12339o<? super T, ? extends C5927i> oVar, C13753j jVar, int i) {
        this.f37759a = b0Var;
        this.f37760b = oVar;
        this.f37757N = jVar;
        this.f37758O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        if (!C13130m.m57219a((Object) this.f37759a, this.f37760b, fVar)) {
            this.f37759a.mo23893a((C12280i0<? super T>) new C13113a<Object>(fVar, this.f37760b, this.f37757N, this.f37758O));
        }
    }
}
