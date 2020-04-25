package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.C2443b;
import p076c.p082c.p083a.p088u.p098k.p101h.C2452c;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
/* compiled from: FileDescriptorBitmapDataLoadProvider */
public class C2970h implements C2517b<ParcelFileDescriptor, Bitmap> {

    /* renamed from: N */
    private final C2962c f10508N = new C2962c();

    /* renamed from: O */
    private final C2271b<ParcelFileDescriptor> f10509O = C2443b.m12319a();

    /* renamed from: a */
    private final C2274e<File, Bitmap> f10510a;

    /* renamed from: b */
    private final C2971i f10511b;

    public C2970h(C2330c cVar, C2270a aVar) {
        this.f10510a = new C2452c(new C2979p(cVar, aVar));
        this.f10511b = new C2971i(cVar, aVar);
    }

    /* renamed from: b */
    public C2271b<ParcelFileDescriptor> mo9867b() {
        return this.f10509O;
    }

    /* renamed from: d */
    public C2275f<Bitmap> mo9868d() {
        return this.f10508N;
    }

    /* renamed from: e */
    public C2274e<ParcelFileDescriptor, Bitmap> mo9869e() {
        return this.f10511b;
    }

    /* renamed from: f */
    public C2274e<File, Bitmap> mo9870f() {
        return this.f10510a;
    }
}
