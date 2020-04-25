package p195e.p196a.p466y0;

import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13750g;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p454e.p459e.C13280k;
import p195e.p196a.p199x0.p454e.p459e.C13327n2;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;

/* renamed from: e.a.y0.a */
/* compiled from: ConnectableObservable */
public abstract class C13772a<T> extends C5923b0<T> {
    @C5937f
    /* renamed from: P */
    public C5923b0<T> mo43193P() {
        return mo43197i(1);
    }

    /* renamed from: Q */
    public final C12314c mo43194Q() {
        C13750g gVar = new C13750g();
        mo42738k(gVar);
        return gVar.f39800a;
    }

    @C5937f
    /* renamed from: R */
    public C5923b0<T> mo43195R() {
        return C12205a.m54862a((C5923b0<T>) new C13327n2<T>(this));
    }

    @C5937f
    /* renamed from: a */
    public C5923b0<T> mo43196a(int i, @C5937f C12331g<? super C12314c> gVar) {
        if (i > 0) {
            return C12205a.m54862a((C5923b0<T>) new C13280k<T>(this, i, gVar));
        }
        mo42738k(gVar);
        return C12205a.m54877a(this);
    }

    @C5937f
    /* renamed from: i */
    public C5923b0<T> mo43197i(int i) {
        return mo43196a(i, C12351a.m55520d());
    }

    /* renamed from: k */
    public abstract void mo42738k(@C5937f C12331g<? super C12314c> gVar);
}
