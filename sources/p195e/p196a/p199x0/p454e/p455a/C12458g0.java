package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.a.g0 */
/* compiled from: CompletablePeek */
public final class C12458g0 extends C5925c {

    /* renamed from: N */
    final C12331g<? super Throwable> f35697N;

    /* renamed from: O */
    final C12325a f35698O;

    /* renamed from: P */
    final C12325a f35699P;

    /* renamed from: Q */
    final C12325a f35700Q;

    /* renamed from: R */
    final C12325a f35701R;

    /* renamed from: a */
    final C5927i f35702a;

    /* renamed from: b */
    final C12331g<? super C12314c> f35703b;

    /* renamed from: e.a.x0.e.a.g0$a */
    /* compiled from: CompletablePeek */
    final class C12459a implements C12268f, C12314c {

        /* renamed from: a */
        final C12268f f35705a;

        /* renamed from: b */
        C12314c f35706b;

        C12459a(C12268f fVar) {
            this.f35705a = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            try {
                C12458g0.this.f35703b.mo33410c(cVar);
                if (C12347d.m55464a(this.f35706b, cVar)) {
                    this.f35706b = cVar;
                    this.f35705a.mo41921a(this);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cVar.dispose();
                this.f35706b = C12347d.DISPOSED;
                C12348e.m55475a(th, this.f35705a);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35706b.mo41878d();
        }

        public void dispose() {
            try {
                C12458g0.this.f35701R.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f35706b.dispose();
        }

        public void onComplete() {
            if (this.f35706b != C12347d.DISPOSED) {
                try {
                    C12458g0.this.f35698O.run();
                    C12458g0.this.f35699P.run();
                    this.f35705a.onComplete();
                    mo42203a();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f35705a.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f35706b == C12347d.DISPOSED) {
                C12205a.m54894b(th);
                return;
            }
            try {
                C12458g0.this.f35697N.mo33410c(th);
                C12458g0.this.f35699P.run();
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f35705a.onError(th);
            mo42203a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42203a() {
            try {
                C12458g0.this.f35700Q.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C12458g0(C5927i iVar, C12331g<? super C12314c> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2, C12325a aVar3, C12325a aVar4) {
        this.f35702a = iVar;
        this.f35703b = gVar;
        this.f35697N = gVar2;
        this.f35698O = aVar;
        this.f35699P = aVar2;
        this.f35700Q = aVar3;
        this.f35701R = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35702a.mo24122a(new C12459a(fVar));
    }
}
