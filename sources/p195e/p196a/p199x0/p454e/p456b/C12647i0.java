package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p205i.p211e.C14062c;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.i0 */
/* compiled from: FlowableDefer */
public final class C12647i0<T> extends C5929l<T> {

    /* renamed from: b */
    final Callable<? extends C6007b<? extends T>> f36217b;

    public C12647i0(Callable<? extends C6007b<? extends T>> callable) {
        this.f36217b = callable;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            ((C6007b) C12390b.m55563a(this.f36217b.call(), "The publisher supplied is null")).mo24397a(cVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
