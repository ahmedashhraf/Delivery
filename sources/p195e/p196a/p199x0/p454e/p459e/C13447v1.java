package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12269f0;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.v1 */
/* compiled from: ObservableLift */
public final class C13447v1<R, T> extends C13131a<T, R> {

    /* renamed from: b */
    final C12269f0<? extends R, ? super T> f38923b;

    public C13447v1(C5926g0<T> g0Var, C12269f0<? extends R, ? super T> f0Var) {
        super(g0Var);
        this.f38923b = f0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        try {
            C12280i0 a = this.f38923b.mo41992a(i0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.f38923b);
            sb.append(" returned a null Observer");
            this.f37851a.mo23893a((C12280i0) C12390b.m55563a(a, sb.toString()));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
