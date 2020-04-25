package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.y2 */
/* compiled from: FlowableReduceWithSingle */
public final class C12923y2<T, R> extends C5928k0<R> {

    /* renamed from: N */
    final C12327c<R, ? super T, R> f37227N;

    /* renamed from: a */
    final C6007b<T> f37228a;

    /* renamed from: b */
    final Callable<R> f37229b;

    public C12923y2(C6007b<T> bVar, Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        this.f37228a = bVar;
        this.f37229b = callable;
        this.f37227N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        try {
            this.f37228a.mo24397a(new C12909a(n0Var, this.f37227N, C12390b.m55563a(this.f37229b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }
}
