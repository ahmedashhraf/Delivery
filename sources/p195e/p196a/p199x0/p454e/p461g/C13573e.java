package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.e */
/* compiled from: SingleDefer */
public final class C13573e<T> extends C5928k0<T> {

    /* renamed from: a */
    final Callable<? extends C5930q0<? extends T>> f39327a;

    public C13573e(Callable<? extends C5930q0<? extends T>> callable) {
        this.f39327a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        try {
            ((C5930q0) C12390b.m55563a(this.f39327a.call(), "The singleSupplier returned a null SingleSource")).mo24192a(n0Var);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }
}
