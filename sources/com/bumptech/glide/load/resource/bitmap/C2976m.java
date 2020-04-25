package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p095j.C2400g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
/* compiled from: ImageVideoBitmapDecoder */
public class C2976m implements C2274e<C2400g, Bitmap> {

    /* renamed from: c */
    private static final String f10528c = "ImageVideoDecoder";

    /* renamed from: a */
    private final C2274e<InputStream, Bitmap> f10529a;

    /* renamed from: b */
    private final C2274e<ParcelFileDescriptor, Bitmap> f10530b;

    public C2976m(C2274e<InputStream, Bitmap> eVar, C2274e<ParcelFileDescriptor, Bitmap> eVar2) {
        this.f10529a = eVar;
        this.f10530b = eVar2;
    }

    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p076c.p082c.p083a.p088u.p090i.C2322l<android.graphics.Bitmap> mo9641a(p076c.p082c.p083a.p088u.p095j.C2400g r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            java.io.InputStream r0 = r3.mo9827b()
            if (r0 == 0) goto L_0x0015
            c.c.a.u.e<java.io.InputStream, android.graphics.Bitmap> r1 = r2.f10529a     // Catch:{ IOException -> 0x000d }
            c.c.a.u.i.l r0 = r1.mo9641a(r0, r4, r5)     // Catch:{ IOException -> 0x000d }
            goto L_0x0016
        L_0x000d:
            r0 = 2
            java.lang.String r1 = "ImageVideoDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x0024
            android.os.ParcelFileDescriptor r3 = r3.mo9826a()
            if (r3 == 0) goto L_0x0024
            c.c.a.u.e<android.os.ParcelFileDescriptor, android.graphics.Bitmap> r0 = r2.f10530b
            c.c.a.u.i.l r0 = r0.mo9641a(r3, r4, r5)
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2976m.mo9641a(c.c.a.u.j.g, int, int):c.c.a.u.i.l");
    }
}
