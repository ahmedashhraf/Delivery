package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p466y0.C13772a;

/* renamed from: e.a.x0.e.e.k */
/* compiled from: ObservableAutoConnect */
public final class C13280k<T> extends C5923b0<T> {

    /* renamed from: N */
    final C12331g<? super C12314c> f38368N;

    /* renamed from: O */
    final AtomicInteger f38369O = new AtomicInteger();

    /* renamed from: a */
    final C13772a<? extends T> f38370a;

    /* renamed from: b */
    final int f38371b;

    public C13280k(C13772a<? extends T> aVar, int i, C12331g<? super C12314c> gVar) {
        this.f38370a = aVar;
        this.f38371b = i;
        this.f38368N = gVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f38370a.mo23893a(i0Var);
        if (this.f38369O.incrementAndGet() == this.f38371b) {
            this.f38370a.mo42738k(this.f38368N);
        }
    }
}
