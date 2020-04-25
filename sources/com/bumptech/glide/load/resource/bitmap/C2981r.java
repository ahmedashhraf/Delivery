package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
/* compiled from: VideoBitmapDecoder */
public class C2981r implements C2960a<ParcelFileDescriptor> {

    /* renamed from: c */
    private static final C2982a f10546c = new C2982a();

    /* renamed from: d */
    private static final int f10547d = -1;

    /* renamed from: a */
    private C2982a f10548a;

    /* renamed from: b */
    private int f10549b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$a */
    /* compiled from: VideoBitmapDecoder */
    static class C2982a {
        C2982a() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo11789a() {
            return new MediaMetadataRetriever();
        }
    }

    public C2981r() {
        this(f10546c, -1);
    }

    public String getId() {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public C2981r(int i) {
        this(f10546c, m14250a(i));
    }

    /* renamed from: a */
    public Bitmap mo11759a(ParcelFileDescriptor parcelFileDescriptor, C2330c cVar, int i, int i2, C2270a aVar) throws IOException {
        Bitmap bitmap;
        MediaMetadataRetriever a = this.f10548a.mo11789a();
        a.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i3 = this.f10549b;
        if (i3 >= 0) {
            bitmap = a.getFrameAtTime((long) i3);
        } else {
            bitmap = a.getFrameAtTime();
        }
        a.release();
        parcelFileDescriptor.close();
        return bitmap;
    }

    C2981r(C2982a aVar) {
        this(aVar, -1);
    }

    C2981r(C2982a aVar, int i) {
        this.f10548a = aVar;
        this.f10549b = i;
    }

    /* renamed from: a */
    private static int m14250a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Requested frame must be non-negative");
    }
}
