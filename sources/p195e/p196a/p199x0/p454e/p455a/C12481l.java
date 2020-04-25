package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.a.l */
/* compiled from: CompletableDoOnEvent */
public final class C12481l extends C5925c {

    /* renamed from: a */
    final C5927i f35760a;

    /* renamed from: b */
    final C12331g<? super Throwable> f35761b;

    /* renamed from: e.a.x0.e.a.l$a */
    /* compiled from: CompletableDoOnEvent */
    final class C12482a implements C12268f {

        /* renamed from: a */
        private final C12268f f35762a;

        C12482a(C12268f fVar) {
            this.f35762a = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35762a.mo41921a(cVar);
        }

        public void onComplete() {
            try {
                C12481l.this.f35761b.mo33410c(null);
                this.f35762a.onComplete();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f35762a.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                C12481l.this.f35761b.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f35762a.onError(th);
        }
    }

    public C12481l(C5927i iVar, C12331g<? super Throwable> gVar) {
        this.f35760a = iVar;
        this.f35761b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35760a.mo24122a(new C12482a(fVar));
    }
}
