package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.Callable;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.l0 */
/* compiled from: MaybeFromRunnable */
public final class C13018l0<T> extends C5931s<T> implements Callable<T> {

    /* renamed from: a */
    final Runnable f37506a;

    public C13018l0(Runnable runnable) {
        this.f37506a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C12314c b = C12315d.m55419b();
        vVar.mo41931a(b);
        if (!b.mo41878d()) {
            try {
                this.f37506a.run();
                if (!b.mo41878d()) {
                    vVar.onComplete();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                if (!b.mo41878d()) {
                    vVar.onError(th);
                } else {
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        this.f37506a.run();
        return null;
    }
}
