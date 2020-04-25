package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.a.c */
/* compiled from: CompletableConcat */
public final class C12441c extends C5925c {

    /* renamed from: a */
    final C6007b<? extends C5927i> f35657a;

    /* renamed from: b */
    final int f35658b;

    /* renamed from: e.a.x0.e.a.c$a */
    /* compiled from: CompletableConcat */
    static final class C12442a extends AtomicInteger implements C12297q<C5927i>, C12314c {
        private static final long serialVersionUID = 9032184911934499404L;

        /* renamed from: N */
        final int f35659N;

        /* renamed from: O */
        final C12443a f35660O = new C12443a(this);

        /* renamed from: P */
        final AtomicBoolean f35661P = new AtomicBoolean();

        /* renamed from: Q */
        int f35662Q;

        /* renamed from: R */
        int f35663R;

        /* renamed from: S */
        C12406o<C5927i> f35664S;

        /* renamed from: T */
        C14063d f35665T;

        /* renamed from: U */
        volatile boolean f35666U;

        /* renamed from: V */
        volatile boolean f35667V;

        /* renamed from: a */
        final C12268f f35668a;

        /* renamed from: b */
        final int f35669b;

        /* renamed from: e.a.x0.e.a.c$a$a */
        /* compiled from: CompletableConcat */
        static final class C12443a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = -5454794857847146511L;

            /* renamed from: a */
            final C12442a f35670a;

            C12443a(C12442a aVar) {
                this.f35670a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
            }

            public void onComplete() {
                this.f35670a.mo42198e();
            }

            public void onError(Throwable th) {
                this.f35670a.mo42197a(th);
            }
        }

        C12442a(C12268f fVar, int i) {
            this.f35668a = fVar;
            this.f35669b = i;
            this.f35659N = i - (i >> 2);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f35660O.get());
        }

        public void dispose() {
            this.f35665T.cancel();
            C12347d.m55465a((AtomicReference<C12314c>) this.f35660O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42198e() {
            this.f35667V = false;
            mo42195a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42199f() {
            if (this.f35662Q != 1) {
                int i = this.f35663R + 1;
                if (i == this.f35659N) {
                    this.f35663R = 0;
                    this.f35665T.mo41813c((long) i);
                    return;
                }
                this.f35663R = i;
            }
        }

        public void onComplete() {
            this.f35666U = true;
            mo42195a();
        }

        public void onError(Throwable th) {
            if (this.f35661P.compareAndSet(false, true)) {
                C12347d.m55465a((AtomicReference<C12314c>) this.f35660O);
                this.f35668a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35665T, dVar)) {
                this.f35665T = dVar;
                int i = this.f35669b;
                long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f35662Q = a;
                        this.f35664S = lVar;
                        this.f35666U = true;
                        this.f35668a.mo41921a(this);
                        mo42195a();
                        return;
                    } else if (a == 2) {
                        this.f35662Q = a;
                        this.f35664S = lVar;
                        this.f35668a.mo41921a(this);
                        dVar.mo41813c(j);
                        return;
                    }
                }
                int i2 = this.f35669b;
                if (i2 == Integer.MAX_VALUE) {
                    this.f35664S = new C13663c(C5929l.m26793R());
                } else {
                    this.f35664S = new C13662b(i2);
                }
                this.f35668a.mo41921a(this);
                dVar.mo41813c(j);
            }
        }

        /* renamed from: a */
        public void mo41789a(C5927i iVar) {
            if (this.f35662Q != 0 || this.f35664S.offer(iVar)) {
                mo42195a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42195a() {
            if (getAndIncrement() == 0) {
                while (!mo41878d()) {
                    if (!this.f35667V) {
                        boolean z = this.f35666U;
                        try {
                            C5927i iVar = (C5927i) this.f35664S.poll();
                            boolean z2 = iVar == null;
                            if (z && z2) {
                                if (this.f35661P.compareAndSet(false, true)) {
                                    this.f35668a.onComplete();
                                }
                                return;
                            } else if (!z2) {
                                this.f35667V = true;
                                iVar.mo24122a(this.f35660O);
                                mo42199f();
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            mo42197a(th);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42197a(Throwable th) {
            if (this.f35661P.compareAndSet(false, true)) {
                this.f35665T.cancel();
                this.f35668a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12441c(C6007b<? extends C5927i> bVar, int i) {
        this.f35657a = bVar;
        this.f35658b = i;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35657a.mo24397a(new C12442a(fVar, this.f35658b));
    }
}
