package p076c.p082c.p083a.p107x;

import java.util.HashMap;
import java.util.Map;
import p076c.p082c.p083a.p084a0.C2215h;

/* renamed from: c.c.a.x.c */
/* compiled from: DataLoadProviderRegistry */
public class C2518c {

    /* renamed from: b */
    private static final C2215h f9555b = new C2215h();

    /* renamed from: a */
    private final Map<C2215h, C2517b<?, ?>> f9556a = new HashMap();

    /* renamed from: a */
    public <T, Z> void mo9983a(Class<T> cls, Class<Z> cls2, C2517b<T, Z> bVar) {
        this.f9556a.put(new C2215h(cls, cls2), bVar);
    }

    /* renamed from: a */
    public <T, Z> C2517b<T, Z> mo9982a(Class<T> cls, Class<Z> cls2) {
        C2517b<T, Z> bVar;
        synchronized (f9555b) {
            f9555b.mo9398a(cls, cls2);
            bVar = (C2517b) this.f9556a.get(f9555b);
        }
        return bVar == null ? C2519d.m12510a() : bVar;
    }
}
