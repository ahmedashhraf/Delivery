package p076c.p082c.p083a.p088u.p098k.p102i;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.C2963d;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p082c.p083a.p084a0.C2212e;
import p076c.p082c.p083a.p086s.C2262a;
import p076c.p082c.p083a.p086s.C2262a.C2263a;
import p076c.p082c.p083a.p086s.C2265c;
import p076c.p082c.p083a.p086s.C2266d;
import p076c.p082c.p083a.p087t.C2267a;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.C2446e;

/* renamed from: c.c.a.u.k.i.j */
/* compiled from: GifResourceEncoder */
public class C2475j implements C2275f<C2458b> {

    /* renamed from: d */
    private static final C2476a f9478d = new C2476a();

    /* renamed from: e */
    private static final String f9479e = "GifEncoder";

    /* renamed from: a */
    private final C2263a f9480a;

    /* renamed from: b */
    private final C2330c f9481b;

    /* renamed from: c */
    private final C2476a f9482c;

    /* renamed from: c.c.a.u.k.i.j$a */
    /* compiled from: GifResourceEncoder */
    static class C2476a {
        C2476a() {
        }

        /* renamed from: a */
        public C2262a mo9914a(C2263a aVar) {
            return new C2262a(aVar);
        }

        /* renamed from: b */
        public C2266d mo9917b() {
            return new C2266d();
        }

        /* renamed from: a */
        public C2267a mo9915a() {
            return new C2267a();
        }

        /* renamed from: a */
        public C2322l<Bitmap> mo9916a(Bitmap bitmap, C2330c cVar) {
            return new C2963d(bitmap, cVar);
        }
    }

    public C2475j(C2330c cVar) {
        this(cVar, f9478d);
    }

    public String getId() {
        return "";
    }

    C2475j(C2330c cVar, C2476a aVar) {
        this.f9481b = cVar;
        this.f9480a = new C2457a(cVar);
        this.f9482c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo9634a(C2322l<C2458b> lVar, OutputStream outputStream) {
        long a = C2212e.m11320a();
        C2458b bVar = (C2458b) lVar.get();
        C2276g g = bVar.mo9880g();
        if (g instanceof C2446e) {
            return m12397a(bVar.mo9875c(), outputStream);
        }
        C2262a a2 = m12395a(bVar.mo9875c());
        C2267a a3 = this.f9482c.mo9915a();
        if (!a3.mo9611a(outputStream)) {
            return false;
        }
        int i = 0;
        while (i < a2.mo9589e()) {
            C2322l a4 = m12396a(a2.mo9593i(), g, bVar);
            try {
                if (!a3.mo9610a((Bitmap) a4.get())) {
                    a4.mo9702a();
                    return false;
                }
                a3.mo9607a(a2.mo9581a(a2.mo9587c()));
                a2.mo9584a();
                a4.mo9702a();
                i++;
            } catch (Throwable th) {
                a4.mo9702a();
                throw th;
            }
        }
        boolean a5 = a3.mo9609a();
        if (Log.isLoggable(f9479e, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Encoded gif with ");
            sb.append(a2.mo9589e());
            sb.append(" frames and ");
            sb.append(bVar.mo9875c().length);
            sb.append(" bytes in ");
            sb.append(C2212e.m11319a(a));
            sb.append(" ms");
            sb.toString();
        }
        return a5;
    }

    /* renamed from: a */
    private boolean m12397a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable(f9479e, 3);
            return false;
        }
    }

    /* renamed from: a */
    private C2262a m12395a(byte[] bArr) {
        C2266d b = this.f9482c.mo9917b();
        b.mo9603a(bArr);
        C2265c b2 = b.mo9605b();
        C2262a a = this.f9482c.mo9914a(this.f9480a);
        a.mo9585a(b2, bArr);
        a.mo9584a();
        return a;
    }

    /* renamed from: a */
    private C2322l<Bitmap> m12396a(Bitmap bitmap, C2276g<Bitmap> gVar, C2458b bVar) {
        C2322l a = this.f9482c.mo9916a(bitmap, this.f9481b);
        C2322l<Bitmap> a2 = gVar.mo9639a(a, bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        if (!a.equals(a2)) {
            a.mo9702a();
        }
        return a2;
    }
}
