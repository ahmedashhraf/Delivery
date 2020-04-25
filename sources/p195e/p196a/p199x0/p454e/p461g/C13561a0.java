package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.a0 */
/* compiled from: SingleFromCallable */
public final class C13561a0<T> extends C5928k0<T> {

    /* renamed from: a */
    final Callable<? extends T> f39300a;

    public C13561a0(Callable<? extends T> callable) {
        this.f39300a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C12314c b = C12315d.m55419b();
        n0Var.mo41974a(b);
        if (!b.mo41878d()) {
            try {
                Object a = C12390b.m55563a(this.f39300a.call(), "The callable returned a null value");
                if (!b.mo41878d()) {
                    n0Var.onSuccess(a);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                if (!b.mo41878d()) {
                    n0Var.onError(th);
                } else {
                    C12205a.m54894b(th);
                }
            }
        }
    }
}
