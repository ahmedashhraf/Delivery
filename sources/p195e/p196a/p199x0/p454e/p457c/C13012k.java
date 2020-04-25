package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.Callable;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.k */
/* compiled from: MaybeDefer */
public final class C13012k<T> extends C5931s<T> {

    /* renamed from: a */
    final Callable<? extends C5941y<? extends T>> f37491a;

    public C13012k(Callable<? extends C5941y<? extends T>> callable) {
        this.f37491a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        try {
            ((C5941y) C12390b.m55563a(this.f37491a.call(), "The maybeSupplier returned a null MaybeSource")).mo24639a(vVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55478a(th, vVar);
        }
    }
}
