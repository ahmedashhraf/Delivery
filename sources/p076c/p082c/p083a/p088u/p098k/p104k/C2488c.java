package p076c.p082c.p083a.p088u.p098k.p104k;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2973k;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p088u.p098k.p103j.C2477a;

/* renamed from: c.c.a.u.k.k.c */
/* compiled from: GifBitmapWrapperDrawableTranscoder */
public class C2488c implements C2491f<C2477a, C2449b> {

    /* renamed from: a */
    private final C2491f<Bitmap, C2973k> f9508a;

    public C2488c(C2491f<Bitmap, C2973k> fVar) {
        this.f9508a = fVar;
    }

    /* renamed from: a */
    public C2322l<C2449b> mo9926a(C2322l<C2477a> lVar) {
        C2477a aVar = (C2477a) lVar.get();
        C2322l a = aVar.mo9918a();
        if (a != null) {
            return this.f9508a.mo9926a(a);
        }
        return aVar.mo9919b();
    }

    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
