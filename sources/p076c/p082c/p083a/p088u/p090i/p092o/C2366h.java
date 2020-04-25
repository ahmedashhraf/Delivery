package p076c.p082c.p083a.p088u.p090i.p092o;

import android.annotation.SuppressLint;
import p076c.p082c.p083a.p084a0.C2213f;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i.C2368a;

/* renamed from: c.c.a.u.i.o.h */
/* compiled from: LruResourceCache */
public class C2366h extends C2213f<C2272c, C2322l<?>> implements C2367i {

    /* renamed from: e */
    private C2368a f9294e;

    public C2366h(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9383a(C2272c cVar, C2322l<?> lVar) {
        C2368a aVar = this.f9294e;
        if (aVar != null) {
            aVar.mo9683a(lVar);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C2322l mo9770a(C2272c cVar, C2322l lVar) {
        return (C2322l) super.mo9386b(cVar, lVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C2322l mo9769a(C2272c cVar) {
        return (C2322l) super.mo9391d(cVar);
    }

    /* renamed from: a */
    public void mo9772a(C2368a aVar) {
        this.f9294e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9390c(C2322l<?> lVar) {
        return lVar.getSize();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo9771a(int i) {
        if (i >= 60) {
            mo9387b();
        } else if (i >= 40) {
            mo9388b(mo9389c() / 2);
        }
    }
}
