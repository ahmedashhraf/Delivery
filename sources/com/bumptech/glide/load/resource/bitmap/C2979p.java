package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
/* compiled from: StreamBitmapDecoder */
public class C2979p implements C2274e<InputStream, Bitmap> {

    /* renamed from: e */
    private static final String f10539e = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap";

    /* renamed from: a */
    private final C2966g f10540a;

    /* renamed from: b */
    private C2330c f10541b;

    /* renamed from: c */
    private C2270a f10542c;

    /* renamed from: d */
    private String f10543d;

    public C2979p(Context context) {
        this(C2232l.m11632a(context).mo9480e());
    }

    public String getId() {
        if (this.f10543d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(f10539e);
            sb.append(this.f10540a.getId());
            sb.append(this.f10542c.name());
            this.f10543d = sb.toString();
        }
        return this.f10543d;
    }

    public C2979p(C2330c cVar) {
        this(cVar, C2270a.DEFAULT);
    }

    /* renamed from: a */
    public C2322l<Bitmap> mo9641a(InputStream inputStream, int i, int i2) {
        return C2963d.m14190a(this.f10540a.mo11759a(inputStream, this.f10541b, i, i2, this.f10542c), this.f10541b);
    }

    public C2979p(Context context, C2270a aVar) {
        this(C2232l.m11632a(context).mo9480e(), aVar);
    }

    public C2979p(C2330c cVar, C2270a aVar) {
        this(C2966g.f10504d, cVar, aVar);
    }

    public C2979p(C2966g gVar, C2330c cVar, C2270a aVar) {
        this.f10540a = gVar;
        this.f10541b = cVar;
        this.f10542c = aVar;
    }
}
