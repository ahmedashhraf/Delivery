package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.d */
/* compiled from: FlowableSwitchMapCompletable */
public final class C13103d<T> extends C5925c {

    /* renamed from: N */
    final boolean f37713N;

    /* renamed from: a */
    final C5929l<T> f37714a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5927i> f37715b;

    /* renamed from: e.a.x0.e.d.d$a */
    /* compiled from: FlowableSwitchMapCompletable */
    static final class C13104a<T> implements C12297q<T>, C12314c {

        /* renamed from: S */
        static final C13105a f37716S = new C13105a(null);

        /* renamed from: N */
        final boolean f37717N;

        /* renamed from: O */
        final C13746c f37718O = new C13746c();

        /* renamed from: P */
        final AtomicReference<C13105a> f37719P = new AtomicReference<>();

        /* renamed from: Q */
        volatile boolean f37720Q;

        /* renamed from: R */
        C14063d f37721R;

        /* renamed from: a */
        final C12268f f37722a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5927i> f37723b;

        /* renamed from: e.a.x0.e.d.d$a$a */
        /* compiled from: FlowableSwitchMapCompletable */
        static final class C13105a extends AtomicReference<C12314c> implements C12268f {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: a */
            final C13104a<?> f37724a;

            C13105a(C13104a<?> aVar) {
                this.f37724a = aVar;
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                this.f37724a.mo42621a(this);
            }

            public void onError(Throwable th) {
                this.f37724a.mo42622a(this, th);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo42623a() {
                C12347d.m55465a((AtomicReference<C12314c>) this);
            }
        }

        C13104a(C12268f fVar, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
            this.f37722a = fVar;
            this.f37723b = oVar;
            this.f37717N = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37721R, dVar)) {
                this.f37721R = dVar;
                this.f37722a.mo41921a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37719P.get() == f37716S;
        }

        public void dispose() {
            this.f37721R.cancel();
            mo42620a();
        }

        public void onComplete() {
            this.f37720Q = true;
            if (this.f37719P.get() == null) {
                Throwable d = this.f37718O.mo43143d();
                if (d == null) {
                    this.f37722a.onComplete();
                } else {
                    this.f37722a.onError(d);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f37718O.mo43142a(th)) {
                C12205a.m54894b(th);
            } else if (this.f37717N) {
                onComplete();
            } else {
                mo42620a();
                Throwable d = this.f37718O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37722a.onError(d);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C5927i iVar = (C5927i) C12390b.m55563a(this.f37723b.apply(t), "The mapper returned a null CompletableSource");
                C13105a aVar = new C13105a(this);
                while (true) {
                    C13105a aVar2 = (C13105a) this.f37719P.get();
                    if (aVar2 == f37716S) {
                        break;
                    } else if (this.f37719P.compareAndSet(aVar2, aVar)) {
                        if (aVar2 != null) {
                            aVar2.mo42623a();
                        }
                        iVar.mo24122a(aVar);
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37721R.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42620a() {
            C13105a aVar = (C13105a) this.f37719P.getAndSet(f37716S);
            if (aVar != null && aVar != f37716S) {
                aVar.mo42623a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42622a(C13105a aVar, Throwable th) {
            if (!this.f37719P.compareAndSet(aVar, null) || !this.f37718O.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37717N) {
                dispose();
                Throwable d = this.f37718O.mo43143d();
                if (d != C13754k.f39801a) {
                    this.f37722a.onError(d);
                }
            } else if (this.f37720Q) {
                this.f37722a.onError(this.f37718O.mo43143d());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42621a(C13105a aVar) {
            if (this.f37719P.compareAndSet(aVar, null) && this.f37720Q) {
                Throwable d = this.f37718O.mo43143d();
                if (d == null) {
                    this.f37722a.onComplete();
                } else {
                    this.f37722a.onError(d);
                }
            }
        }
    }

    public C13103d(C5929l<T> lVar, C12339o<? super T, ? extends C5927i> oVar, boolean z) {
        this.f37714a = lVar;
        this.f37715b = oVar;
        this.f37713N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f37714a.mo24393a((C12297q<? super T>) new C13104a<Object>(fVar, this.f37715b, this.f37713N));
    }
}
