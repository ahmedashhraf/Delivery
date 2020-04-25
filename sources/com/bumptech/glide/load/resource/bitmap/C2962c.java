package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import java.io.OutputStream;
import p076c.p082c.p083a.p084a0.C2212e;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.C2322l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* compiled from: BitmapEncoder */
public class C2962c implements C2275f<Bitmap> {

    /* renamed from: c */
    private static final String f10494c = "BitmapEncoder";

    /* renamed from: d */
    private static final int f10495d = 90;

    /* renamed from: a */
    private CompressFormat f10496a;

    /* renamed from: b */
    private int f10497b;

    public C2962c() {
        this(null, 90);
    }

    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public C2962c(CompressFormat compressFormat, int i) {
        this.f10496a = compressFormat;
        this.f10497b = i;
    }

    /* renamed from: a */
    public boolean mo9634a(C2322l<Bitmap> lVar, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) lVar.get();
        long a = C2212e.m11320a();
        CompressFormat a2 = m14187a(bitmap);
        bitmap.compress(a2, this.f10497b, outputStream);
        if (Log.isLoggable(f10494c, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Compressed with type: ");
            sb.append(a2);
            sb.append(" of size ");
            sb.append(C2216i.m11338a(bitmap));
            sb.append(" in ");
            sb.append(C2212e.m11319a(a));
            sb.toString();
        }
        return true;
    }

    /* renamed from: a */
    private CompressFormat m14187a(Bitmap bitmap) {
        CompressFormat compressFormat = this.f10496a;
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return CompressFormat.PNG;
        }
        return CompressFormat.JPEG;
    }
}
