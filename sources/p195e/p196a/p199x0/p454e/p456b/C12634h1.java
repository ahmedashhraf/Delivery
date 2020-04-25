package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.h1 */
/* compiled from: FlowableFromCallable */
public final class C12634h1<T> extends C5929l<T> implements Callable<T> {

    /* renamed from: b */
    final Callable<? extends T> f36178b;

    public C12634h1(Callable<? extends T> callable) {
        this.f36178b = callable;
    }

    public T call() throws Exception {
        return C12390b.m55563a(this.f36178b.call(), "The callable returned a null value");
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13738f fVar = new C13738f(cVar);
        cVar.mo41788a((C14063d) fVar);
        try {
            fVar.mo43123c(C12390b.m55563a(this.f36178b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            cVar.onError(th);
        }
    }
}
