package p076c.p082c.p083a.p088u.p098k.p103j;

import android.graphics.Bitmap;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;
import p076c.p082c.p083a.p088u.p098k.p102i.C2462e;

/* renamed from: c.c.a.u.k.j.f */
/* compiled from: GifBitmapWrapperTransformation */
public class C2484f implements C2276g<C2477a> {

    /* renamed from: a */
    private final C2276g<Bitmap> f9499a;

    /* renamed from: b */
    private final C2276g<C2458b> f9500b;

    public C2484f(C2330c cVar, C2276g<Bitmap> gVar) {
        this(gVar, (C2276g<C2458b>) new C2462e<C2458b>(gVar, cVar));
    }

    /* renamed from: a */
    public C2322l<C2477a> mo9639a(C2322l<C2477a> lVar, int i, int i2) {
        C2322l a = ((C2477a) lVar.get()).mo9918a();
        C2322l b = ((C2477a) lVar.get()).mo9919b();
        if (a != null) {
            C2276g<Bitmap> gVar = this.f9499a;
            if (gVar != null) {
                C2322l a2 = gVar.mo9639a(a, i, i2);
                if (!a.equals(a2)) {
                    return new C2478b(new C2477a(a2, ((C2477a) lVar.get()).mo9919b()));
                }
                return lVar;
            }
        }
        if (b != null) {
            C2276g<C2458b> gVar2 = this.f9500b;
            if (gVar2 != null) {
                C2322l a3 = gVar2.mo9639a(b, i, i2);
                if (!b.equals(a3)) {
                    lVar = new C2478b<>(new C2477a(((C2477a) lVar.get()).mo9918a(), a3));
                }
            }
        }
        return lVar;
    }

    public String getId() {
        return this.f9499a.getId();
    }

    C2484f(C2276g<Bitmap> gVar, C2276g<C2458b> gVar2) {
        this.f9499a = gVar;
        this.f9500b = gVar2;
    }
}
