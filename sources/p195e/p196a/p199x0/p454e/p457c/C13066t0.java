package p195e.p196a.p199x0.p454e.p457c;

import p195e.p196a.C12321v;
import p195e.p196a.C12343x;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.t0 */
/* compiled from: MaybeLift */
public final class C13066t0<T, R> extends C12943a<T, R> {

    /* renamed from: b */
    final C12343x<? extends R, ? super T> f37587b;

    public C13066t0(C5941y<T> yVar, C12343x<? extends R, ? super T> xVar) {
        super(yVar);
        this.f37587b = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        try {
            this.f37333a.mo24639a((C12321v) C12390b.m55563a(this.f37587b.mo42101a(vVar), "The operator returned a null MaybeObserver"));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55478a(th, vVar);
        }
    }
}
