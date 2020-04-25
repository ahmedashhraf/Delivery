package p076c.p082c.p083a.p088u.p098k.p104k;

import java.util.HashMap;
import java.util.Map;
import p076c.p082c.p083a.p084a0.C2215h;

/* renamed from: c.c.a.u.k.k.g */
/* compiled from: TranscoderRegistry */
public class C2492g {

    /* renamed from: b */
    private static final C2215h f9511b = new C2215h();

    /* renamed from: a */
    private final Map<C2215h, C2491f<?, ?>> f9512a = new HashMap();

    /* renamed from: a */
    public <Z, R> void mo9929a(Class<Z> cls, Class<R> cls2, C2491f<Z, R> fVar) {
        this.f9512a.put(new C2215h(cls, cls2), fVar);
    }

    /* renamed from: a */
    public <Z, R> C2491f<Z, R> mo9928a(Class<Z> cls, Class<R> cls2) {
        C2491f<Z, R> fVar;
        if (cls.equals(cls2)) {
            return C2493h.m12433a();
        }
        synchronized (f9511b) {
            f9511b.mo9398a(cls, cls2);
            fVar = (C2491f) this.f9512a.get(f9511b);
        }
        if (fVar != null) {
            return fVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered for ");
        sb.append(cls);
        sb.append(" and ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }
}
