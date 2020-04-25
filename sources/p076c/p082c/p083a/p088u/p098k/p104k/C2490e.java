package p076c.p082c.p083a.p088u.p098k.p104k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2973k;
import com.bumptech.glide.load.resource.bitmap.C2975l;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: c.c.a.u.k.k.e */
/* compiled from: GlideBitmapDrawableTranscoder */
public class C2490e implements C2491f<Bitmap, C2973k> {

    /* renamed from: a */
    private final Resources f9509a;

    /* renamed from: b */
    private final C2330c f9510b;

    public C2490e(Context context) {
        this(context.getResources(), C2232l.m11632a(context).mo9480e());
    }

    /* renamed from: a */
    public C2322l<C2973k> mo9926a(C2322l<Bitmap> lVar) {
        return new C2975l(new C2973k(this.f9509a, (Bitmap) lVar.get()), this.f9510b);
    }

    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public C2490e(Resources resources, C2330c cVar) {
        this.f9509a = resources;
        this.f9510b = cVar;
    }
}
