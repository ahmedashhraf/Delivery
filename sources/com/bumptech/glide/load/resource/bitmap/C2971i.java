package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
/* compiled from: FileDescriptorBitmapDecoder */
public class C2971i implements C2274e<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2981r f10512a;

    /* renamed from: b */
    private final C2330c f10513b;

    /* renamed from: c */
    private C2270a f10514c;

    public C2971i(Context context) {
        this(C2232l.m11632a(context).mo9480e(), C2270a.DEFAULT);
    }

    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }

    public C2971i(Context context, C2270a aVar) {
        this(C2232l.m11632a(context).mo9480e(), aVar);
    }

    /* renamed from: a */
    public C2322l<Bitmap> mo9641a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) throws IOException {
        return C2963d.m14190a(this.f10512a.mo11759a(parcelFileDescriptor, this.f10513b, i, i2, this.f10514c), this.f10513b);
    }

    public C2971i(C2330c cVar, C2270a aVar) {
        this(new C2981r(), cVar, aVar);
    }

    public C2971i(C2981r rVar, C2330c cVar, C2270a aVar) {
        this.f10512a = rVar;
        this.f10513b = cVar;
        this.f10514c = aVar;
    }
}
