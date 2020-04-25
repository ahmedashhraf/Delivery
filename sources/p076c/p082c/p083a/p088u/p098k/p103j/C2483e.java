package p076c.p082c.p083a.p088u.p098k.p103j;

import java.io.IOException;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p095j.C2400g;

/* renamed from: c.c.a.u.k.j.e */
/* compiled from: GifBitmapWrapperStreamResourceDecoder */
public class C2483e implements C2274e<InputStream, C2477a> {

    /* renamed from: a */
    private final C2274e<C2400g, C2477a> f9498a;

    public C2483e(C2274e<C2400g, C2477a> eVar) {
        this.f9498a = eVar;
    }

    public String getId() {
        return this.f9498a.getId();
    }

    /* renamed from: a */
    public C2322l<C2477a> mo9641a(InputStream inputStream, int i, int i2) throws IOException {
        return this.f9498a.mo9641a(new C2400g(inputStream, null), i, i2);
    }
}
