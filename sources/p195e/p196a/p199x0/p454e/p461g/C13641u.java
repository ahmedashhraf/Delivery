package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.u */
/* compiled from: SingleError */
public final class C13641u<T> extends C5928k0<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f39471a;

    public C13641u(Callable<? extends Throwable> callable) {
        this.f39471a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        try {
            th = (Throwable) C12390b.m55563a(this.f39471a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C14398a.m62357b(th);
        }
        C12348e.m55477a(th, n0Var);
    }
}
