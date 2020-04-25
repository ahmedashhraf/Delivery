package p076c.p082c.p083a.p088u.p098k.p102i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p076c.p082c.p083a.p086s.C2262a.C2263a;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: c.c.a.u.k.i.a */
/* compiled from: GifBitmapProvider */
class C2457a implements C2263a {

    /* renamed from: a */
    private final C2330c f9421a;

    public C2457a(C2330c cVar) {
        this.f9421a = cVar;
    }

    /* renamed from: a */
    public Bitmap mo9597a(int i, int i2, Config config) {
        return this.f9421a.mo9735b(i, i2, config);
    }

    /* renamed from: a */
    public void mo9598a(Bitmap bitmap) {
        if (!this.f9421a.mo9734a(bitmap)) {
            bitmap.recycle();
        }
    }
}
