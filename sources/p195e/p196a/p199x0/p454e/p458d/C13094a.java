package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

@C5936e
/* renamed from: e.a.x0.e.d.a */
/* compiled from: FlowableConcatMapCompletable */
public final class C13094a<T> extends C5925c {

    /* renamed from: N */
    final C13753j f37650N;

    /* renamed from: O */
    final int f37651O;

    /* renamed from: a */
    final C5929l<T> f37652a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f37653b;

    /* renamed from: e.a.x0.e.d.a$a */
    /* compiled from: FlowableConcatMapCompletable */
    static final class C13095a<T> extends AtomicInteger implements C12297q<T>, C12314c {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: N */
        final C13753j f37654N;

        /* renamed from: O */
        final C13746c f37655O = new C13746c();

        /* renamed from: P */
        final C13096a f37656P = new C13096a(this);

        /* renamed from: Q */
        final int f37657Q;

        /* renamed from: R */
        final C12405n<T> f37658R;

        /* renamed from: S */
        C14063d f37659S;

        /* renamed from: T */
        volatile boolean f37660T;

        /* renamed from: U */
        volatile boolean f37661U;

        /* renamed from: V */
        volatile boolean f37662V;

        /* renamed from: W */
        int f37663W;

        /* renamed from: a */
        final C12268f f37664a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f37665b;

        /* renamed from: e.a.x0.e.d.a$a$a */
        /* compiled from: FlowableConcatMapCompletable */
        static final class C13096a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: a */
            final C13095a<?> f37666a;

            C13096a(C13095a<?> aVar) {
                this.f37666a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                this.f37666a.mo42609e();
            }

            public void onError(Throwable th) {
                this.f37666a.mo42608a(th);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42610a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13095a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, C13753j jVar, int i) {
            this.f37664a = fVar;
            this.f37665b = oVar;
            this.f37654N = jVar;
            this.f37657Q = i;
            this.f37658R = new C13662b(i);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37659S, dVar)) {
                this.f37659S = dVar;
                this.f37664a.mo41921a(this);
                dVar.mo41813c((long) this.f37657Q);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37662V;
        }

        public void dispose() {
            this.f37662V = true;
            this.f37659S.cancel();
            this.f37656P.mo42610a();
            if (getAndIncrement() == 0) {
                this.f37658R.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42609e() {
            this.f37660T = false;
            mo42607a();
        }

        public void onComplete() {
            this.f37661U = true;
            mo42607a();
        }

        public void onError(Throwable th) {
            if (!this.f37655O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37654N == C13753j.IMMEDIATE) {
                this.f37656P.mo42610a();
                Throwable d = this.f37655O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37664a.onError(d);
                }
                if (getAndIncrement() == 0) {
                    this.f37658R.clear();
                }
            } else {
                this.f37661U = true;
                mo42607a();
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f37658R.offer(t)) {
                mo42607a();
                return;
            }
            this.f37659S.cancel();
            onError(new MissingBackpressureException("Queue full?!"));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42608a(Throwable th) {
            if (!this.f37655O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37654N == C13753j.IMMEDIATE) {
                this.f37659S.cancel();
                Throwable d = this.f37655O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37664a.onError(d);
                }
                if (getAndIncrement() == 0) {
                    this.f37658R.clear();
                }
            } else {
                this.f37660T = false;
                mo42607a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42607a() {
            if (getAndIncrement() == 0) {
                while (!this.f37662V) {
                    if (!this.f37660T) {
                        if (this.f37654N != C13753j.BOUNDARY || this.f37655O.get() == null) {
                            boolean z = this.f37661U;
                            Object poll = this.f37658R.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable d = this.f37655O.mo43143d();
                                if (d != null) {
                                    this.f37664a.onError(d);
                                } else {
                                    this.f37664a.onComplete();
                                }
                                return;
                            } else if (!z2) {
                                int i = this.f37657Q;
                                int i2 = i - (i >> 1);
                                int i3 = this.f37663W + 1;
                                if (i3 == i2) {
                                    this.f37663W = 0;
                                    this.f37659S.mo41813c((long) i2);
                                } else {
                                    this.f37663W = i3;
                                }
                                try {
                                    C5927i iVar = (C5927i) C12390b.m55563a(this.f37665b.apply(poll), "The mapper returned a null CompletableSource");
                                    this.f37660T = true;
                                    iVar.mo24122a(this.f37656P);
                                } catch (Throwable th) {
                                    C14398a.m62357b(th);
                                    this.f37658R.clear();
                                    this.f37659S.cancel();
                                    this.f37655O.mo43142a(th);
                                    this.f37664a.onError(this.f37655O.mo43143d());
                                    return;
                                }
                            }
                        } else {
                            this.f37658R.clear();
                            this.f37664a.onError(this.f37655O.mo43143d());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f37658R.clear();
            }
        }
    }

    public C13094a(C5929l<T> lVar, C12339o<? super T, ? extends C5927i> oVar, C13753j jVar, int i) {
        this.f37652a = lVar;
        this.f37653b = oVar;
        this.f37650N = jVar;
        this.f37651O = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f37652a.mo24393a((C12297q<? super T>) new C13095a<Object>(fVar, this.f37653b, this.f37650N, this.f37651O));
    }
}
