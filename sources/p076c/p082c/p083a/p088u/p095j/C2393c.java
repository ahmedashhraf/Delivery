package p076c.p082c.p083a.p088u.p095j;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.c */
/* compiled from: GenericLoaderFactory */
public class C2393c {

    /* renamed from: d */
    private static final C2409l f9350d = new C2394a();

    /* renamed from: a */
    private final Map<Class, Map<Class, C2410m>> f9351a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Map<Class, C2409l>> f9352b = new HashMap();

    /* renamed from: c */
    private final Context f9353c;

    /* renamed from: c.c.a.u.j.c$a */
    /* compiled from: GenericLoaderFactory */
    static class C2394a implements C2409l {
        C2394a() {
        }

        /* renamed from: a */
        public C2279c mo9812a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public C2393c(Context context) {
        this.f9353c = context.getApplicationContext();
    }

    /* renamed from: c */
    private <T, Y> void m12222c(Class<T> cls, Class<Y> cls2) {
        m12221a(cls, cls2, f9350d);
    }

    /* renamed from: d */
    private <T, Y> C2409l<T, Y> m12223d(Class<T> cls, Class<Y> cls2) {
        Map map = (Map) this.f9352b.get(cls);
        if (map != null) {
            return (C2409l) map.get(cls2);
        }
        return null;
    }

    /* renamed from: e */
    private <T, Y> C2410m<T, Y> m12224e(Class<T> cls, Class<Y> cls2) {
        Map map = (Map) this.f9351a.get(cls);
        C2410m<T, Y> mVar = map != null ? (C2410m) map.get(cls2) : null;
        if (mVar == null) {
            for (Class cls3 : this.f9351a.keySet()) {
                if (cls3.isAssignableFrom(cls)) {
                    Map map2 = (Map) this.f9351a.get(cls3);
                    if (map2 != null) {
                        mVar = (C2410m) map2.get(cls2);
                        if (mVar != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return mVar;
    }

    /* renamed from: a */
    public synchronized <T, Y> C2410m<T, Y> mo9815a(Class<T> cls, Class<Y> cls2, C2410m<T, Y> mVar) {
        C2410m<T, Y> mVar2;
        this.f9352b.clear();
        Map map = (Map) this.f9351a.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f9351a.put(cls, map);
        }
        mVar2 = (C2410m) map.put(cls2, mVar);
        if (mVar2 != null) {
            Iterator it = this.f9351a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Map) it.next()).containsValue(mVar2)) {
                        mVar2 = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return mVar2;
    }

    /* renamed from: b */
    public synchronized <T, Y> C2410m<T, Y> mo9816b(Class<T> cls, Class<Y> cls2) {
        C2410m<T, Y> mVar;
        this.f9352b.clear();
        mVar = null;
        Map map = (Map) this.f9351a.get(cls);
        if (map != null) {
            mVar = (C2410m) map.remove(cls2);
        }
        return mVar;
    }

    @Deprecated
    /* renamed from: a */
    public synchronized <T, Y> C2409l<T, Y> mo9814a(Class<T> cls, Class<Y> cls2, Context context) {
        return mo9813a(cls, cls2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T, Y> p076c.p082c.p083a.p088u.p095j.C2409l<T, Y> mo9813a(java.lang.Class<T> r3, java.lang.Class<Y> r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            c.c.a.u.j.l r0 = r2.m12223d(r3, r4)     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0014
            c.c.a.u.j.l r3 = f9350d     // Catch:{ all -> 0x0029 }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0012
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            c.c.a.u.j.m r1 = r2.m12224e(r3, r4)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0024
            android.content.Context r0 = r2.f9353c     // Catch:{ all -> 0x0029 }
            c.c.a.u.j.l r0 = r1.mo9847a(r0, r2)     // Catch:{ all -> 0x0029 }
            r2.m12221a(r3, r4, r0)     // Catch:{ all -> 0x0029 }
            goto L_0x0027
        L_0x0024:
            r2.m12222c(r3, r4)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2)
            return r0
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p088u.p095j.C2393c.mo9813a(java.lang.Class, java.lang.Class):c.c.a.u.j.l");
    }

    /* renamed from: a */
    private <T, Y> void m12221a(Class<T> cls, Class<Y> cls2, C2409l<T, Y> lVar) {
        Map map = (Map) this.f9352b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f9352b.put(cls, map);
        }
        map.put(cls2, lVar);
    }
}
