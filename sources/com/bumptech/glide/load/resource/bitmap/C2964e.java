package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
/* compiled from: BitmapTransformation */
public abstract class C2964e implements C2276g<Bitmap> {

    /* renamed from: a */
    private C2330c f10500a;

    public C2964e(Context context) {
        this(C2232l.m11632a(context).mo9480e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo11762a(C2330c cVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C2322l<Bitmap> mo9639a(C2322l<Bitmap> lVar, int i, int i2) {
        if (C2216i.m11344a(i, i2)) {
            Bitmap bitmap = (Bitmap) lVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo11762a(this.f10500a, bitmap, i, i2);
            return bitmap.equals(a) ? lVar : C2963d.m14190a(a, this.f10500a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }

    public C2964e(C2330c cVar) {
        this.f10500a = cVar;
    }
}
