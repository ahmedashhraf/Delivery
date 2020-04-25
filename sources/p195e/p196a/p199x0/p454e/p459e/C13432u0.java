package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.u0 */
/* compiled from: ObservableError */
public final class C13432u0<T> extends C5923b0<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f38865a;

    public C13432u0(Callable<? extends Throwable> callable) {
        this.f38865a = callable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            th = (Throwable) C12390b.m55563a(this.f38865a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C14398a.m62357b(th);
        }
        C12348e.m55476a(th, i0Var);
    }
}
