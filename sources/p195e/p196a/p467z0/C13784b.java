package p195e.p196a.p467z0;

import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.b */
/* compiled from: DefaultObserver */
public abstract class C13784b<T> implements C12280i0<T> {

    /* renamed from: a */
    private C12314c f39832a;

    /* renamed from: a */
    public final void mo34123a(@C5937f C12314c cVar) {
        if (C13752i.m58716a(this.f39832a, cVar, getClass())) {
            this.f39832a = cVar;
            mo43250b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo43250b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43249a() {
        C12314c cVar = this.f39832a;
        this.f39832a = C12347d.DISPOSED;
        cVar.dispose();
    }
}
