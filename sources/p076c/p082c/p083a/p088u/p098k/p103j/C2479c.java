package p076c.p082c.p083a.p088u.p098k.p103j;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2963d;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p076c.p082c.p083a.p084a0.C2208a;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;

/* renamed from: c.c.a.u.k.j.c */
/* compiled from: GifBitmapWrapperResourceDecoder */
public class C2479c implements C2274e<C2400g, C2477a> {

    /* renamed from: g */
    private static final C2481b f9486g = new C2481b();

    /* renamed from: h */
    private static final C2480a f9487h = new C2480a();

    /* renamed from: i */
    static final int f9488i = 2048;

    /* renamed from: a */
    private final C2274e<C2400g, Bitmap> f9489a;

    /* renamed from: b */
    private final C2274e<InputStream, C2458b> f9490b;

    /* renamed from: c */
    private final C2330c f9491c;

    /* renamed from: d */
    private final C2481b f9492d;

    /* renamed from: e */
    private final C2480a f9493e;

    /* renamed from: f */
    private String f9494f;

    /* renamed from: c.c.a.u.k.j.c$a */
    /* compiled from: GifBitmapWrapperResourceDecoder */
    static class C2480a {
        C2480a() {
        }

        /* renamed from: a */
        public InputStream mo9922a(InputStream inputStream, byte[] bArr) {
            return new RecyclableBufferedInputStream(inputStream, bArr);
        }
    }

    /* renamed from: c.c.a.u.k.j.c$b */
    /* compiled from: GifBitmapWrapperResourceDecoder */
    static class C2481b {
        C2481b() {
        }

        /* renamed from: a */
        public ImageType mo9923a(InputStream inputStream) throws IOException {
            return new ImageHeaderParser(inputStream).mo11738b();
        }
    }

    public C2479c(C2274e<C2400g, Bitmap> eVar, C2274e<InputStream, C2458b> eVar2, C2330c cVar) {
        this(eVar, eVar2, cVar, f9486g, f9487h);
    }

    /* renamed from: b */
    private C2477a m12411b(C2400g gVar, int i, int i2, byte[] bArr) throws IOException {
        InputStream a = this.f9493e.mo9922a(gVar.mo9827b(), bArr);
        a.mark(2048);
        ImageType a2 = this.f9492d.mo9923a(a);
        a.reset();
        C2477a a3 = a2 == ImageType.GIF ? m12409a(a, i, i2) : null;
        return a3 == null ? m12410b(new C2400g(a, gVar.mo9826a()), i, i2) : a3;
    }

    public String getId() {
        if (this.f9494f == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9490b.getId());
            sb.append(this.f9489a.getId());
            this.f9494f = sb.toString();
        }
        return this.f9494f;
    }

    C2479c(C2274e<C2400g, Bitmap> eVar, C2274e<InputStream, C2458b> eVar2, C2330c cVar, C2481b bVar, C2480a aVar) {
        this.f9489a = eVar;
        this.f9490b = eVar2;
        this.f9491c = cVar;
        this.f9492d = bVar;
        this.f9493e = aVar;
    }

    /* renamed from: a */
    public C2322l<C2477a> mo9641a(C2400g gVar, int i, int i2) throws IOException {
        C2208a c = C2208a.m11306c();
        byte[] b = c.mo9363b();
        try {
            C2477a a = m12408a(gVar, i, i2, b);
            if (a != null) {
                return new C2478b(a);
            }
            return null;
        } finally {
            c.mo9362a(b);
        }
    }

    /* renamed from: a */
    private C2477a m12408a(C2400g gVar, int i, int i2, byte[] bArr) throws IOException {
        if (gVar.mo9827b() != null) {
            return m12411b(gVar, i, i2, bArr);
        }
        return m12410b(gVar, i, i2);
    }

    /* renamed from: b */
    private C2477a m12410b(C2400g gVar, int i, int i2) throws IOException {
        C2322l a = this.f9489a.mo9641a(gVar, i, i2);
        if (a != null) {
            return new C2477a(a, null);
        }
        return null;
    }

    /* renamed from: a */
    private C2477a m12409a(InputStream inputStream, int i, int i2) throws IOException {
        C2322l a = this.f9490b.mo9641a(inputStream, i, i2);
        if (a == null) {
            return null;
        }
        C2458b bVar = (C2458b) a.get();
        if (bVar.mo9879f() > 1) {
            return new C2477a(null, a);
        }
        return new C2477a(new C2963d(bVar.mo9878e(), this.f9491c), null);
    }
}
