package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.j */
/* compiled from: ObservableSwitchMapCompletable */
public final class C13121j<T> extends C5925c {

    /* renamed from: N */
    final boolean f37811N;

    /* renamed from: a */
    final C5923b0<T> f37812a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f37813b;

    /* renamed from: e.a.x0.e.d.j$a */
    /* compiled from: ObservableSwitchMapCompletable */
    static final class C13122a<T> implements C12280i0<T>, C12314c {

        /* renamed from: S */
        static final C13123a f37814S = new C13123a(null);

        /* renamed from: N */
        final boolean f37815N;

        /* renamed from: O */
        final C13746c f37816O = new C13746c();

        /* renamed from: P */
        final AtomicReference<C13123a> f37817P = new AtomicReference<>();

        /* renamed from: Q */
        volatile boolean f37818Q;

        /* renamed from: R */
        C12314c f37819R;

        /* renamed from: a */
        final C12268f f37820a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f37821b;

        /* renamed from: e.a.x0.e.d.j$a$a */
        /* compiled from: ObservableSwitchMapCompletable */
        static final class C13123a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: a */
            final C13122a<?> f37822a;

            C13123a(C13122a<?> aVar) {
                this.f37822a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37822a.mo42647a(this);
            }

            public void onError(Throwable th) {
                this.f37822a.mo42648a(this, th);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42649a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13122a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
            this.f37820a = fVar;
            this.f37821b = oVar;
            this.f37815N = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37819R, cVar)) {
                this.f37819R = cVar;
                this.f37820a.mo41921a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37817P.get() == f37814S;
        }

        public void dispose() {
            this.f37819R.dispose();
            mo42646a();
        }

        public void onComplete() {
            this.f37818Q = true;
            if (this.f37817P.get() == null) {
                Throwable d = this.f37816O.mo43143d();
                if (d == null) {
                    this.f37820a.onComplete();
                } else {
                    this.f37820a.onError(d);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f37816O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37815N) {
                onComplete();
            } else {
                mo42646a();
                Throwable d = this.f37816O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37820a.onError(d);
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f37821b.apply(t), "The mapper returned a null CompletableSource");
                C13123a aVar = new C13123a(this);
                while (true) {
                    C13123a aVar2 = (C13123a) this.f37817P.get();
                    if (aVar2 == f37814S) {
                        break;
                    } else if (this.f37817P.compareAndSet(aVar2, aVar)) {
                        if (aVar2 != null) {
                            aVar2.mo42649a();
                        }
                        iVar.mo24122a(aVar);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37819R.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42646a() {
            C13123a aVar = (C13123a) this.f37817P.getAndSet(f37814S);
            if (aVar != null && aVar != f37814S) {
                aVar.mo42649a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42648a(C13123a aVar, Throwable th) {
            if (!this.f37817P.compareAndSet(aVar, null) || !this.f37816O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37815N) {
                dispose();
                Throwable d = this.f37816O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37820a.onError(d);
                }
            } else if (this.f37818Q) {
                this.f37820a.onError(this.f37816O.mo43143d());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42647a(C13123a aVar) {
            if (this.f37817P.compareAndSet(aVar, null) && this.f37818Q) {
                Throwable d = this.f37816O.mo43143d();
                if (d == null) {
                    this.f37820a.onComplete();
                } else {
                    this.f37820a.onError(d);
                }
            }
        }
    }

    public C13121j(C5923b0<T> b0Var, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
        this.f37812a = b0Var;
        this.f37813b = oVar;
        this.f37811N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        if (!C13130m.m57219a((Object) this.f37812a, this.f37813b, fVar)) {
            this.f37812a.mo23893a((C12280i0<? super T>) new C13122a<Object>(fVar, this.f37813b, this.f37811N));
        }
    }
}
