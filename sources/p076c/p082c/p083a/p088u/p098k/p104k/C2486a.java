package p076c.p082c.p083a.p088u.p098k.p104k;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p098k.p099f.C2447a;

/* renamed from: c.c.a.u.k.k.a */
/* compiled from: BitmapBytesTranscoder */
public class C2486a implements C2491f<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f9505a;

    /* renamed from: b */
    private final int f9506b;

    public C2486a() {
        this(CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C2322l<byte[]> mo9926a(C2322l<Bitmap> lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) lVar.get()).compress(this.f9505a, this.f9506b, byteArrayOutputStream);
        lVar.mo9702a();
        return new C2447a(byteArrayOutputStream.toByteArray());
    }

    public String getId() {
        return "BitmapBytesTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public C2486a(CompressFormat compressFormat, int i) {
        this.f9505a = compressFormat;
        this.f9506b = i;
    }
}
