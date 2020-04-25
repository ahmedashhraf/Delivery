package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p095j.C2401h;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
/* compiled from: ImageVideoDataLoadProvider */
public class C2977n implements C2517b<C2400g, Bitmap> {

    /* renamed from: N */
    private final C2275f<Bitmap> f10531N;

    /* renamed from: O */
    private final C2401h f10532O;

    /* renamed from: a */
    private final C2976m f10533a;

    /* renamed from: b */
    private final C2274e<File, Bitmap> f10534b;

    public C2977n(C2517b<InputStream, Bitmap> bVar, C2517b<ParcelFileDescriptor, Bitmap> bVar2) {
        this.f10531N = bVar.mo9868d();
        this.f10532O = new C2401h(bVar.mo9867b(), bVar2.mo9867b());
        this.f10534b = bVar.mo9870f();
        this.f10533a = new C2976m(bVar.mo9869e(), bVar2.mo9869e());
    }

    /* renamed from: b */
    public C2271b<C2400g> mo9867b() {
        return this.f10532O;
    }

    /* renamed from: d */
    public C2275f<Bitmap> mo9868d() {
        return this.f10531N;
    }

    /* renamed from: e */
    public C2274e<C2400g, Bitmap> mo9869e() {
        return this.f10533a;
    }

    /* renamed from: f */
    public C2274e<File, Bitmap> mo9870f() {
        return this.f10534b;
    }
}
