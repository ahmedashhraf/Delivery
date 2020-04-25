package p195e.p196a.p448v0;

import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13750g;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p454e.p456b.C12675k;
import p195e.p196a.p199x0.p454e.p456b.C12934z2;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;

/* renamed from: e.a.v0.a */
/* compiled from: ConnectableFlowable */
public abstract class C12322a<T> extends C5929l<T> {
    @C5937f
    /* renamed from: U */
    public C5929l<T> mo42080U() {
        return mo42085m(1);
    }

    /* renamed from: V */
    public final C12314c mo42081V() {
        C13750g gVar = new C13750g();
        mo42084l(gVar);
        return gVar.f39800a;
    }

    @C5937f
    /* renamed from: W */
    public C5929l<T> mo42082W() {
        return C12205a.m54871a((C5929l<T>) new C12934z2<T>(this));
    }

    @C5937f
    /* renamed from: a */
    public C5929l<T> mo42083a(int i, @C5937f C12331g<? super C12314c> gVar) {
        if (i > 0) {
            return C12205a.m54871a((C5929l<T>) new C12675k<T>(this, i, gVar));
        }
        mo42084l(gVar);
        return C12205a.m54874a(this);
    }

    /* renamed from: l */
    public abstract void mo42084l(@C5937f C12331g<? super C12314c> gVar);

    @C5937f
    /* renamed from: m */
    public C5929l<T> mo42085m(int i) {
        return mo42083a(i, C12351a.m55520d());
    }
}
