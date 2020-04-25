package p076c.p082c.p083a;

import java.io.InputStream;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;
import p076c.p082c.p083a.p088u.p098k.p104k.C2489d;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2520e;

/* renamed from: c.c.a.k */
/* compiled from: GifTypeRequest */
public class C2231k<ModelType> extends C2230j<ModelType> {

    /* renamed from: o0 */
    private final C2409l<ModelType, InputStream> f8827o0;

    /* renamed from: p0 */
    private final C2251e f8828p0;

    C2231k(C2226h<ModelType, ?, ?, ?> hVar, C2409l<ModelType, InputStream> lVar, C2251e eVar) {
        super(m11629a(hVar.f8791N, lVar, C2458b.class, null), C2458b.class, hVar);
        this.f8827o0 = lVar;
        this.f8828p0 = eVar;
        mo9452c();
    }

    /* renamed from: a */
    private static <A, R> C2520e<A, InputStream, C2458b, R> m11629a(C2232l lVar, C2409l<A, InputStream> lVar2, Class<R> cls, C2491f<C2458b, R> fVar) {
        if (lVar2 == null) {
            return null;
        }
        if (fVar == null) {
            fVar = lVar.mo9475b(C2458b.class, cls);
        }
        return new C2520e<>(lVar2, fVar, lVar.mo9468a(InputStream.class, C2458b.class));
    }

    /* renamed from: j */
    public C2226h<ModelType, InputStream, C2458b, byte[]> mo9441j() {
        return mo9467a(new C2489d(), byte[].class);
    }

    /* renamed from: a */
    public <R> C2226h<ModelType, InputStream, C2458b, R> mo9467a(C2491f<C2458b, R> fVar, Class<R> cls) {
        return this.f8828p0.mo9549a(new C2226h(m11629a(this.f8791N, this.f8827o0, cls, fVar), cls, this));
    }
}
