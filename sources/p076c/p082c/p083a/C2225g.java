package p076c.p082c.p083a;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p095j.C2398f;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p088u.p098k.p103j.C2477a;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p105v.C2502g;
import p076c.p082c.p083a.p105v.C2510m;
import p076c.p082c.p083a.p107x.C2520e;
import p076c.p082c.p083a.p108y.C2522a;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.g */
/* compiled from: DrawableTypeRequest */
public class C2225g<ModelType> extends C2224f<ModelType> implements C2222d {

    /* renamed from: o0 */
    private final C2409l<ModelType, InputStream> f8788o0;

    /* renamed from: p0 */
    private final C2409l<ModelType, ParcelFileDescriptor> f8789p0;

    /* renamed from: q0 */
    private final C2251e f8790q0;

    C2225g(Class<ModelType> cls, C2409l<ModelType, InputStream> lVar, C2409l<ModelType, ParcelFileDescriptor> lVar2, Context context, C2232l lVar3, C2510m mVar, C2502g gVar, C2251e eVar) {
        C2520e a = m11507a(lVar3, lVar, lVar2, C2477a.class, C2449b.class, null);
        super(context, cls, a, lVar3, mVar, gVar);
        this.f8788o0 = lVar;
        this.f8789p0 = lVar2;
        this.f8790q0 = eVar;
    }

    /* renamed from: a */
    private static <A, Z, R> C2520e<A, C2400g, Z, R> m11507a(C2232l lVar, C2409l<A, InputStream> lVar2, C2409l<A, ParcelFileDescriptor> lVar3, Class<Z> cls, Class<R> cls2, C2491f<Z, R> fVar) {
        if (lVar2 == null && lVar3 == null) {
            return null;
        }
        if (fVar == null) {
            fVar = lVar.mo9475b(cls, cls2);
        }
        return new C2520e<>(new C2398f(lVar2, lVar3), fVar, lVar.mo9468a(C2400g.class, cls));
    }

    /* renamed from: l */
    private C2229i<ModelType, InputStream, File> m11508l() {
        C2251e eVar = this.f8790q0;
        C2229i iVar = new C2229i(File.class, this, this.f8788o0, InputStream.class, File.class, eVar);
        return (C2229i) eVar.mo9549a(iVar);
    }

    /* renamed from: j */
    public C2221c<ModelType> mo9441j() {
        C2251e eVar = this.f8790q0;
        return (C2221c) eVar.mo9549a(new C2221c(this, this.f8788o0, this.f8789p0, eVar));
    }

    /* renamed from: k */
    public C2231k<ModelType> mo9456k() {
        C2251e eVar = this.f8790q0;
        return (C2231k) eVar.mo9549a(new C2231k(this, this.f8788o0, eVar));
    }

    /* renamed from: a */
    public <Y extends C2561m<File>> Y mo9448a(Y y) {
        return m11508l().mo9448a(y);
    }

    /* renamed from: a */
    public C2522a<File> mo9447a(int i, int i2) {
        return m11508l().mo9447a(i, i2);
    }
}
