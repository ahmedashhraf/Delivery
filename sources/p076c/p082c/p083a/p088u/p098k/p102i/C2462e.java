package p076c.p082c.p083a.p088u.p098k.p102i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2963d;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: c.c.a.u.k.i.e */
/* compiled from: GifDrawableTransformation */
public class C2462e implements C2276g<C2458b> {

    /* renamed from: a */
    private final C2276g<Bitmap> f9448a;

    /* renamed from: b */
    private final C2330c f9449b;

    public C2462e(C2276g<Bitmap> gVar, C2330c cVar) {
        this.f9448a = gVar;
        this.f9449b = cVar;
    }

    /* renamed from: a */
    public C2322l<C2458b> mo9639a(C2322l<C2458b> lVar, int i, int i2) {
        C2458b bVar = (C2458b) lVar.get();
        Bitmap e = ((C2458b) lVar.get()).mo9878e();
        Bitmap bitmap = (Bitmap) this.f9448a.mo9639a(new C2963d(e, this.f9449b), i, i2).get();
        return !bitmap.equals(e) ? new C2461d(new C2458b(bVar, bitmap, this.f9448a)) : lVar;
    }

    public String getId() {
        return this.f9448a.getId();
    }
}
