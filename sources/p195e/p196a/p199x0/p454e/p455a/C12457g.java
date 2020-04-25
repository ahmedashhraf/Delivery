package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.Callable;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.g */
/* compiled from: CompletableDefer */
public final class C12457g extends C5925c {

    /* renamed from: a */
    final Callable<? extends C5927i> f35696a;

    public C12457g(Callable<? extends C5927i> callable) {
        this.f35696a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        try {
            ((C5927i) C12390b.m55563a(this.f35696a.call(), "The completableSupplier returned a null CompletableSource")).mo24122a(fVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55475a(th, fVar);
        }
    }
}
