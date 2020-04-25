package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.f0 */
/* compiled from: ObservableDefer */
public final class C13201f0<T> extends C5923b0<T> {

    /* renamed from: a */
    final Callable<? extends C5926g0<? extends T>> f38100a;

    public C13201f0(Callable<? extends C5926g0<? extends T>> callable) {
        this.f38100a = callable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            ((C5926g0) C12390b.m55563a(this.f38100a.call(), "null ObservableSource supplied")).mo23893a(i0Var);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
