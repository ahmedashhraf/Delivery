package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.t */
/* compiled from: CompletableFromRunnable */
public final class C12499t extends C5925c {

    /* renamed from: a */
    final Runnable f35791a;

    public C12499t(Runnable runnable) {
        this.f35791a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12314c b = C12315d.m55419b();
        fVar.mo41921a(b);
        try {
            this.f35791a.run();
            if (!b.mo41878d()) {
                fVar.onComplete();
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            if (!b.mo41878d()) {
                fVar.onError(th);
            }
        }
    }
}
