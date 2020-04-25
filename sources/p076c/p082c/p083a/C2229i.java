package p076c.p082c.p083a;

import android.content.Context;
import java.io.File;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p088u.p098k.p104k.C2493h;
import p076c.p082c.p083a.p105v.C2502g;
import p076c.p082c.p083a.p105v.C2510m;
import p076c.p082c.p083a.p107x.C2520e;
import p076c.p082c.p083a.p107x.C2521f;
import p076c.p082c.p083a.p108y.C2522a;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.i */
/* compiled from: GenericTranscodeRequest */
public class C2229i<ModelType, DataType, ResourceType> extends C2226h<ModelType, DataType, ResourceType, ResourceType> implements C2222d {

    /* renamed from: o0 */
    private final C2409l<ModelType, DataType> f8823o0;

    /* renamed from: p0 */
    private final Class<DataType> f8824p0;

    /* renamed from: q0 */
    private final Class<ResourceType> f8825q0;

    /* renamed from: r0 */
    private final C2251e f8826r0;

    C2229i(Class<ResourceType> cls, C2226h<ModelType, ?, ?, ?> hVar, C2409l<ModelType, DataType> lVar, Class<DataType> cls2, Class<ResourceType> cls3, C2251e eVar) {
        super(m11552a(hVar.f8791N, lVar, cls2, cls3, C2493h.m12433a()), cls, hVar);
        this.f8823o0 = lVar;
        this.f8824p0 = cls2;
        this.f8825q0 = cls3;
        this.f8826r0 = eVar;
    }

    /* renamed from: a */
    private static <A, T, Z, R> C2521f<A, T, Z, R> m11552a(C2232l lVar, C2409l<A, T> lVar2, Class<T> cls, Class<Z> cls2, C2491f<Z, R> fVar) {
        return new C2520e(lVar2, fVar, lVar.mo9468a(cls, cls2));
    }

    /* renamed from: j */
    private C2226h<ModelType, DataType, File, File> m11553j() {
        return this.f8826r0.mo9549a(new C2226h(new C2520e(this.f8823o0, C2493h.m12433a(), this.f8791N.mo9468a(this.f8824p0, File.class)), File.class, this)).mo9410a(C2244p.LOW).mo9416a(C2302c.SOURCE).mo9421a(true);
    }

    /* renamed from: a */
    public <TranscodeType> C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9463a(C2491f<ResourceType, TranscodeType> fVar, Class<TranscodeType> cls) {
        return this.f8826r0.mo9549a(new C2226h(m11552a(this.f8791N, this.f8823o0, this.f8824p0, this.f8825q0, fVar), cls, this));
    }

    /* renamed from: a */
    public <Y extends C2561m<File>> Y mo9448a(Y y) {
        return m11553j().mo9458b(y);
    }

    C2229i(Context context, C2232l lVar, Class<ModelType> cls, C2409l<ModelType, DataType> lVar2, Class<DataType> cls2, Class<ResourceType> cls3, C2510m mVar, C2502g gVar, C2251e eVar) {
        C2409l<ModelType, DataType> lVar3 = lVar2;
        Class<DataType> cls4 = cls2;
        Class<ResourceType> cls5 = cls3;
        C2232l lVar4 = lVar;
        super(context, cls, m11552a(lVar, lVar3, cls4, cls5, C2493h.m12433a()), cls3, lVar4, mVar, gVar);
        this.f8823o0 = lVar3;
        this.f8824p0 = cls4;
        this.f8825q0 = cls5;
        this.f8826r0 = eVar;
    }

    /* renamed from: a */
    public C2522a<File> mo9447a(int i, int i2) {
        return m11553j().mo9459c(i, i2);
    }
}
