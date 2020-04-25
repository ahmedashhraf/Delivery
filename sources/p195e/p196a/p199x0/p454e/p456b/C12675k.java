package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C5929l;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.k */
/* compiled from: FlowableAutoConnect */
public final class C12675k<T> extends C5929l<T> {

    /* renamed from: N */
    final int f36300N;

    /* renamed from: O */
    final C12331g<? super C12314c> f36301O;

    /* renamed from: P */
    final AtomicInteger f36302P = new AtomicInteger();

    /* renamed from: b */
    final C12322a<? extends T> f36303b;

    public C12675k(C12322a<? extends T> aVar, int i, C12331g<? super C12314c> gVar) {
        this.f36303b = aVar;
        this.f36300N = i;
        this.f36301O = gVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f36303b.mo24397a(cVar);
        if (this.f36302P.incrementAndGet() == this.f36300N) {
            this.f36303b.mo42084l(this.f36301O);
        }
    }
}
