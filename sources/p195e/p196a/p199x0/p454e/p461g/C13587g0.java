package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C12296p0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.g0 */
/* compiled from: SingleLift */
public final class C13587g0<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final C5930q0<T> f39347a;

    /* renamed from: b */
    final C12296p0<? extends R, ? super T> f39348b;

    public C13587g0(C5930q0<T> q0Var, C12296p0<? extends R, ? super T> p0Var) {
        this.f39347a = q0Var;
        this.f39348b = p0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        try {
            this.f39347a.mo24192a((C12292n0) C12390b.m55563a(this.f39348b.mo42050a(n0Var), "The onLift returned a null SingleObserver"));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }
}
