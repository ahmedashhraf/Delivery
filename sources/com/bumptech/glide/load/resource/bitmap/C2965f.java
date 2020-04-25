package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
/* compiled from: CenterCrop */
public class C2965f extends C2964e {
    public C2965f(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo11762a(C2330c cVar, Bitmap bitmap, int i, int i2) {
        Bitmap a = cVar.mo9731a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        Bitmap a2 = C2980q.m14244a(a, bitmap, i, i2);
        if (!(a == null || a == a2 || cVar.mo9734a(a))) {
            a.recycle();
        }
        return a2;
    }

    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }

    public C2965f(C2330c cVar) {
        super(cVar);
    }
}
