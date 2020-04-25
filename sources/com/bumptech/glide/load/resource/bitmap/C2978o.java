package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2412o;
import p076c.p082c.p083a.p088u.p098k.p101h.C2452c;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
/* compiled from: StreamBitmapDataLoadProvider */
public class C2978o implements C2517b<InputStream, Bitmap> {

    /* renamed from: N */
    private final C2412o f10535N = new C2412o();

    /* renamed from: O */
    private final C2452c<Bitmap> f10536O;

    /* renamed from: a */
    private final C2979p f10537a;

    /* renamed from: b */
    private final C2962c f10538b;

    public C2978o(C2330c cVar, C2270a aVar) {
        this.f10537a = new C2979p(cVar, aVar);
        this.f10538b = new C2962c();
        this.f10536O = new C2452c<>(this.f10537a);
    }

    /* renamed from: b */
    public C2271b<InputStream> mo9867b() {
        return this.f10535N;
    }

    /* renamed from: d */
    public C2275f<Bitmap> mo9868d() {
        return this.f10538b;
    }

    /* renamed from: e */
    public C2274e<InputStream, Bitmap> mo9869e() {
        return this.f10537a;
    }

    /* renamed from: f */
    public C2274e<File, Bitmap> mo9870f() {
        return this.f10536O;
    }
}
