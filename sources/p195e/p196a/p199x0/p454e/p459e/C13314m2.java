package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.m2 */
/* compiled from: ObservableReduceWithSingle */
public final class C13314m2<T, R> extends C5928k0<R> {

    /* renamed from: N */
    final C12327c<R, ? super T, R> f38478N;

    /* renamed from: a */
    final C5926g0<T> f38479a;

    /* renamed from: b */
    final Callable<R> f38480b;

    public C13314m2(C5926g0<T> g0Var, Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        this.f38479a = g0Var;
        this.f38480b = callable;
        this.f38478N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        try {
            this.f38479a.mo23893a(new C13302a(n0Var, this.f38478N, C12390b.m55563a(this.f38480b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }
}
