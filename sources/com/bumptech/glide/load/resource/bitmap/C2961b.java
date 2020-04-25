package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.p100g.C2448a;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* compiled from: BitmapDrawableResource */
public class C2961b extends C2448a<BitmapDrawable> {

    /* renamed from: b */
    private final C2330c f10493b;

    public C2961b(BitmapDrawable bitmapDrawable, C2330c cVar) {
        super(bitmapDrawable);
        this.f10493b = cVar;
    }

    /* renamed from: a */
    public void mo9702a() {
        this.f10493b.mo9734a(((BitmapDrawable) this.f9412a).getBitmap());
    }

    public int getSize() {
        return C2216i.m11338a(((BitmapDrawable) this.f9412a).getBitmap());
    }
}
