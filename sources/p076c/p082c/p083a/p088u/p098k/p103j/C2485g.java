package p076c.p082c.p083a.p088u.p098k.p103j;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p098k.p101h.C2452c;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: c.c.a.u.k.j.g */
/* compiled from: ImageVideoGifDrawableLoadProvider */
public class C2485g implements C2517b<C2400g, C2477a> {

    /* renamed from: N */
    private final C2275f<C2477a> f9501N;

    /* renamed from: O */
    private final C2271b<C2400g> f9502O;

    /* renamed from: a */
    private final C2274e<File, C2477a> f9503a;

    /* renamed from: b */
    private final C2274e<C2400g, C2477a> f9504b;

    public C2485g(C2517b<C2400g, Bitmap> bVar, C2517b<InputStream, C2458b> bVar2, C2330c cVar) {
        C2479c cVar2 = new C2479c(bVar.mo9869e(), bVar2.mo9869e(), cVar);
        this.f9503a = new C2452c(new C2483e(cVar2));
        this.f9504b = cVar2;
        this.f9501N = new C2482d(bVar.mo9868d(), bVar2.mo9868d());
        this.f9502O = bVar.mo9867b();
    }

    /* renamed from: b */
    public C2271b<C2400g> mo9867b() {
        return this.f9502O;
    }

    /* renamed from: d */
    public C2275f<C2477a> mo9868d() {
        return this.f9501N;
    }

    /* renamed from: e */
    public C2274e<C2400g, C2477a> mo9869e() {
        return this.f9504b;
    }

    /* renamed from: f */
    public C2274e<File, C2477a> mo9870f() {
        return this.f9503a;
    }
}
