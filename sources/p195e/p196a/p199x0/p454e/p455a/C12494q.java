package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.Callable;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.q */
/* compiled from: CompletableFromCallable */
public final class C12494q extends C5925c {

    /* renamed from: a */
    final Callable<?> f35785a;

    public C12494q(Callable<?> callable) {
        this.f35785a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12314c b = C12315d.m55419b();
        fVar.mo41921a(b);
        try {
            this.f35785a.call();
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
