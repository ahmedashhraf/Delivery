package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
/* compiled from: BitmapResource */
public class C2963d implements C2322l<Bitmap> {

    /* renamed from: a */
    private final Bitmap f10498a;

    /* renamed from: b */
    private final C2330c f10499b;

    public C2963d(Bitmap bitmap, C2330c cVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (cVar != null) {
            this.f10498a = bitmap;
            this.f10499b = cVar;
        } else {
            throw new NullPointerException("BitmapPool must not be null");
        }
    }

    /* renamed from: a */
    public static C2963d m14190a(Bitmap bitmap, C2330c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2963d(bitmap, cVar);
    }

    public int getSize() {
        return C2216i.m11338a(this.f10498a);
    }

    /* renamed from: a */
    public void mo9702a() {
        if (!this.f10499b.mo9734a(this.f10498a)) {
            this.f10498a.recycle();
        }
    }

    public Bitmap get() {
        return this.f10498a;
    }
}
