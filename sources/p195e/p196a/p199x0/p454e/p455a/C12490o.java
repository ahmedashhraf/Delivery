package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.Callable;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.o */
/* compiled from: CompletableErrorSupplier */
public final class C12490o extends C5925c {

    /* renamed from: a */
    final Callable<? extends Throwable> f35775a;

    public C12490o(Callable<? extends Throwable> callable) {
        this.f35775a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        try {
            th = (Throwable) C12390b.m55563a(this.f35775a.call(), "The error returned is null");
        } catch (Throwable th) {
            th = th;
            C14398a.m62357b(th);
        }
        C12348e.m55475a(th, fVar);
    }
}
