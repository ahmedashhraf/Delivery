package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.a.f0 */
/* compiled from: CompletableOnErrorComplete */
public final class C12455f0 extends C5925c {

    /* renamed from: a */
    final C5927i f35692a;

    /* renamed from: b */
    final C12342r<? super Throwable> f35693b;

    /* renamed from: e.a.x0.e.a.f0$a */
    /* compiled from: CompletableOnErrorComplete */
    final class C12456a implements C12268f {

        /* renamed from: a */
        private final C12268f f35694a;

        C12456a(C12268f fVar) {
            this.f35694a = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35694a.mo41921a(cVar);
        }

        public void onComplete() {
            this.f35694a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (C12455f0.this.f35693b.mo41812b(th)) {
                    this.f35694a.onComplete();
                } else {
                    this.f35694a.onError(th);
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f35694a.onError(new CompositeException(th, th2));
            }
        }
    }

    public C12455f0(C5927i iVar, C12342r<? super Throwable> rVar) {
        this.f35692a = iVar;
        this.f35693b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35692a.mo24122a(new C12456a(fVar));
    }
}
