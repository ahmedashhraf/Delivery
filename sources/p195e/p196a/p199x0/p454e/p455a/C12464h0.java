package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.a.h0 */
/* compiled from: CompletableResumeNext */
public final class C12464h0 extends C5925c {

    /* renamed from: a */
    final C5927i f35718a;

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends C5927i> f35719b;

    /* renamed from: e.a.x0.e.a.h0$a */
    /* compiled from: CompletableResumeNext */
    final class C12465a implements C12268f {

        /* renamed from: a */
        final C12268f f35721a;

        /* renamed from: b */
        final C12350g f35722b;

        /* renamed from: e.a.x0.e.a.h0$a$a */
        /* compiled from: CompletableResumeNext */
        final class C12466a implements C12268f {
            C12466a() {
            }

            /* renamed from: a */
            public void mo41921a(C12314c cVar) {
                C12465a.this.f35722b.mo42110b(cVar);
            }

            public void onComplete() {
                C12465a.this.f35721a.onComplete();
            }

            public void onError(Throwable th) {
                C12465a.this.f35721a.onError(th);
            }
        }

        C12465a(C12268f fVar, C12350g gVar) {
            this.f35721a = fVar;
            this.f35722b = gVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35722b.mo42110b(cVar);
        }

        public void onComplete() {
            this.f35721a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                C5927i iVar = (C5927i) C12464h0.this.f35719b.apply(th);
                if (iVar == null) {
                    NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.f35721a.onError(nullPointerException);
                    return;
                }
                iVar.mo24122a(new C12466a());
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f35721a.onError(new CompositeException(th2, th));
            }
        }
    }

    public C12464h0(C5927i iVar, C12339o<? super Throwable, ? extends C5927i> oVar) {
        this.f35718a = iVar;
        this.f35719b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12350g gVar = new C12350g();
        fVar.mo41921a(gVar);
        this.f35718a.mo24122a(new C12465a(fVar, gVar));
    }
}
