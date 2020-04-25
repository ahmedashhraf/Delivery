package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.x0 */
/* compiled from: FlowableError */
public final class C12905x0<T> extends C5929l<T> {

    /* renamed from: b */
    final Callable<? extends Throwable> f37176b;

    public C12905x0(Callable<? extends Throwable> callable) {
        this.f37176b = callable;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            th = (Throwable) C12390b.m55563a(this.f37176b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C14398a.m62357b(th);
        }
        C13739g.m58655a(th, cVar);
    }
}
