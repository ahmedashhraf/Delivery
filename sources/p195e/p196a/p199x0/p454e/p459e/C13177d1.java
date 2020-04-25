package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12419l;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.d1 */
/* compiled from: ObservableFromCallable */
public final class C13177d1<T> extends C5923b0<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f37997a;

    public C13177d1(Callable<? extends T> callable) {
        this.f37997a = callable;
    }

    public T call() throws Exception {
        return C12390b.m55563a(this.f37997a.call(), "The callable returned a null value");
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12419l lVar = new C12419l(i0Var);
        i0Var.mo34123a((C12314c) lVar);
        if (!lVar.mo41878d()) {
            try {
                lVar.mo42163b(C12390b.m55563a(this.f37997a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                if (!lVar.mo41878d()) {
                    i0Var.onError(th);
                } else {
                    C12205a.m54894b(th);
                }
            }
        }
    }
}
