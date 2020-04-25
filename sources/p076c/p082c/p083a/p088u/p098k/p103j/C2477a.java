package p076c.p082c.p083a.p088u.p098k.p103j;

import android.graphics.Bitmap;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;

/* renamed from: c.c.a.u.k.j.a */
/* compiled from: GifBitmapWrapper */
public class C2477a {

    /* renamed from: a */
    private final C2322l<C2458b> f9483a;

    /* renamed from: b */
    private final C2322l<Bitmap> f9484b;

    public C2477a(C2322l<Bitmap> lVar, C2322l<C2458b> lVar2) {
        if (lVar != null && lVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.f9484b = lVar;
            this.f9483a = lVar2;
        }
    }

    /* renamed from: a */
    public C2322l<Bitmap> mo9918a() {
        return this.f9484b;
    }

    /* renamed from: b */
    public C2322l<C2458b> mo9919b() {
        return this.f9483a;
    }

    /* renamed from: c */
    public int mo9920c() {
        C2322l<Bitmap> lVar = this.f9484b;
        if (lVar != null) {
            return lVar.getSize();
        }
        return this.f9483a.getSize();
    }
}
