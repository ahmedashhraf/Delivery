package p076c.p082c.p083a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.p095j.C2398f;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p104k.C2486a;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2520e;

/* renamed from: c.c.a.c */
/* compiled from: BitmapTypeRequest */
public class C2221c<ModelType> extends C2220b<ModelType, Bitmap> {

    /* renamed from: t0 */
    private final C2409l<ModelType, InputStream> f8784t0;

    /* renamed from: u0 */
    private final C2409l<ModelType, ParcelFileDescriptor> f8785u0;

    /* renamed from: v0 */
    private final C2232l f8786v0;

    /* renamed from: w0 */
    private final C2251e f8787w0;

    C2221c(C2226h<ModelType, ?, ?, ?> hVar, C2409l<ModelType, InputStream> lVar, C2409l<ModelType, ParcelFileDescriptor> lVar2, C2251e eVar) {
        super(m11425a(hVar.f8791N, lVar, lVar2, Bitmap.class, null), Bitmap.class, hVar);
        this.f8784t0 = lVar;
        this.f8785u0 = lVar2;
        this.f8786v0 = hVar.f8791N;
        this.f8787w0 = eVar;
    }

    /* renamed from: a */
    private static <A, R> C2520e<A, C2400g, Bitmap, R> m11425a(C2232l lVar, C2409l<A, InputStream> lVar2, C2409l<A, ParcelFileDescriptor> lVar3, Class<R> cls, C2491f<Bitmap, R> fVar) {
        if (lVar2 == null && lVar3 == null) {
            return null;
        }
        if (fVar == null) {
            fVar = lVar.mo9475b(Bitmap.class, cls);
        }
        return new C2520e<>(new C2398f(lVar2, lVar3), fVar, lVar.mo9468a(C2400g.class, Bitmap.class));
    }

    /* renamed from: m */
    public C2220b<ModelType, byte[]> mo9446m() {
        return mo9445a((C2491f<Bitmap, R>) new C2486a<Bitmap,R>(), byte[].class);
    }

    /* renamed from: a */
    public <R> C2220b<ModelType, R> mo9445a(C2491f<Bitmap, R> fVar, Class<R> cls) {
        return (C2220b) this.f8787w0.mo9549a(new C2220b(m11425a(this.f8786v0, this.f8784t0, this.f8785u0, cls, fVar), cls, this));
    }

    /* renamed from: a */
    public C2220b<ModelType, byte[]> mo9444a(CompressFormat compressFormat, int i) {
        return mo9445a((C2491f<Bitmap, R>) new C2486a<Bitmap,R>(compressFormat, i), byte[].class);
    }
}
