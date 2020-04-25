package p076c.p082c.p083a.p088u.p090i;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p076c.p082c.p083a.C2244p;
import p076c.p082c.p083a.p084a0.C2212e;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2352b;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i.C2368a;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2517b;
import p076c.p082c.p083a.p108y.C2530g;

/* renamed from: c.c.a.u.i.d */
/* compiled from: Engine */
public class C2303d implements C2313f, C2368a, C2317a {

    /* renamed from: i */
    private static final String f9153i = "Engine";

    /* renamed from: a */
    private final Map<C2272c, C2309e> f9154a;

    /* renamed from: b */
    private final C2315h f9155b;

    /* renamed from: c */
    private final C2367i f9156c;

    /* renamed from: d */
    private final C2304a f9157d;

    /* renamed from: e */
    private final Map<C2272c, WeakReference<C2316i<?>>> f9158e;

    /* renamed from: f */
    private final C2323m f9159f;

    /* renamed from: g */
    private final C2305b f9160g;

    /* renamed from: h */
    private ReferenceQueue<C2316i<?>> f9161h;

    /* renamed from: c.c.a.u.i.d$a */
    /* compiled from: Engine */
    static class C2304a {

        /* renamed from: a */
        private final ExecutorService f9162a;

        /* renamed from: b */
        private final ExecutorService f9163b;

        /* renamed from: c */
        private final C2313f f9164c;

        public C2304a(ExecutorService executorService, ExecutorService executorService2, C2313f fVar) {
            this.f9162a = executorService;
            this.f9163b = executorService2;
            this.f9164c = fVar;
        }

        /* renamed from: a */
        public C2309e mo9686a(C2272c cVar, boolean z) {
            C2309e eVar = new C2309e(cVar, this.f9162a, this.f9163b, z, this.f9164c);
            return eVar;
        }
    }

    /* renamed from: c.c.a.u.i.d$b */
    /* compiled from: Engine */
    private static class C2305b implements C2299a {

        /* renamed from: a */
        private final C2350a f9165a;

        /* renamed from: b */
        private volatile C2349a f9166b;

        public C2305b(C2350a aVar) {
            this.f9165a = aVar;
        }

        /* renamed from: a */
        public C2349a mo9674a() {
            if (this.f9166b == null) {
                synchronized (this) {
                    if (this.f9166b == null) {
                        this.f9166b = this.f9165a.build();
                    }
                    if (this.f9166b == null) {
                        this.f9166b = new C2352b();
                    }
                }
            }
            return this.f9166b;
        }
    }

    /* renamed from: c.c.a.u.i.d$c */
    /* compiled from: Engine */
    public static class C2306c {

        /* renamed from: a */
        private final C2309e f9167a;

        /* renamed from: b */
        private final C2530g f9168b;

        public C2306c(C2530g gVar, C2309e eVar) {
            this.f9168b = gVar;
            this.f9167a = eVar;
        }

        /* renamed from: a */
        public void mo9687a() {
            this.f9167a.mo9695b(this.f9168b);
        }
    }

    /* renamed from: c.c.a.u.i.d$d */
    /* compiled from: Engine */
    private static class C2307d implements IdleHandler {

        /* renamed from: a */
        private final Map<C2272c, WeakReference<C2316i<?>>> f9169a;

        /* renamed from: b */
        private final ReferenceQueue<C2316i<?>> f9170b;

        public C2307d(Map<C2272c, WeakReference<C2316i<?>>> map, ReferenceQueue<C2316i<?>> referenceQueue) {
            this.f9169a = map;
            this.f9170b = referenceQueue;
        }

        public boolean queueIdle() {
            C2308e eVar = (C2308e) this.f9170b.poll();
            if (eVar != null) {
                this.f9169a.remove(eVar.f9171a);
            }
            return true;
        }
    }

    /* renamed from: c.c.a.u.i.d$e */
    /* compiled from: Engine */
    private static class C2308e extends WeakReference<C2316i<?>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2272c f9171a;

        public C2308e(C2272c cVar, C2316i<?> iVar, ReferenceQueue<? super C2316i<?>> referenceQueue) {
            super(iVar, referenceQueue);
            this.f9171a = cVar;
        }
    }

    public C2303d(C2367i iVar, C2350a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(iVar, aVar, executorService, executorService2, null, null, null, null, null);
    }

    /* renamed from: b */
    private C2316i<?> m11986b(C2272c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C2316i<?> a = m11983a(cVar);
        if (a != null) {
            a.mo9704b();
            this.f9158e.put(cVar, new C2308e(cVar, a, m11987b()));
        }
        return a;
    }

    /* renamed from: a */
    public <T, Z, R> C2306c mo9679a(C2272c cVar, int i, int i2, C2279c<T> cVar2, C2517b<T, Z> bVar, C2276g<Z> gVar, C2491f<Z, R> fVar, C2244p pVar, boolean z, C2302c cVar3, C2530g gVar2) {
        boolean z2 = z;
        C2530g gVar3 = gVar2;
        C2216i.m11347b();
        long a = C2212e.m11320a();
        C2314g a2 = this.f9155b.mo9701a(cVar2.getId(), cVar, i, i2, bVar.mo9870f(), bVar.mo9869e(), gVar, bVar.mo9868d(), fVar, bVar.mo9867b());
        C2316i b = m11986b((C2272c) a2, z2);
        String str = f9153i;
        if (b != null) {
            gVar3.mo9691a((C2322l<?>) b);
            if (Log.isLoggable(str, 2)) {
                m11985a("Loaded resource from cache", a, a2);
            }
            return null;
        }
        C2316i a3 = m11984a((C2272c) a2, z2);
        if (a3 != null) {
            gVar3.mo9691a((C2322l<?>) a3);
            if (Log.isLoggable(str, 2)) {
                m11985a("Loaded resource from active resources", a, a2);
            }
            return null;
        }
        C2309e eVar = (C2309e) this.f9154a.get(a2);
        if (eVar != null) {
            eVar.mo9692a(gVar3);
            if (Log.isLoggable(str, 2)) {
                m11985a("Added to existing load", a, a2);
            }
            return new C2306c(gVar3, eVar);
        }
        C2309e a4 = this.f9157d.mo9686a(a2, z2);
        C2298b bVar2 = new C2298b(a2, i, i2, cVar2, bVar, gVar, fVar, this.f9160g, cVar3, pVar);
        C2318j jVar = new C2318j(a4, bVar2, pVar);
        this.f9154a.put(a2, a4);
        a4.mo9692a(gVar3);
        a4.mo9694b(jVar);
        if (Log.isLoggable(str, 2)) {
            m11985a("Started new load", a, a2);
        }
        return new C2306c(gVar3, a4);
    }

    C2303d(C2367i iVar, C2350a aVar, ExecutorService executorService, ExecutorService executorService2, Map<C2272c, C2309e> map, C2315h hVar, Map<C2272c, WeakReference<C2316i<?>>> map2, C2304a aVar2, C2323m mVar) {
        this.f9156c = iVar;
        this.f9160g = new C2305b(aVar);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        this.f9158e = map2;
        if (hVar == null) {
            hVar = new C2315h();
        }
        this.f9155b = hVar;
        if (map == null) {
            map = new HashMap<>();
        }
        this.f9154a = map;
        if (aVar2 == null) {
            aVar2 = new C2304a(executorService, executorService2, this);
        }
        this.f9157d = aVar2;
        if (mVar == null) {
            mVar = new C2323m();
        }
        this.f9159f = mVar;
        iVar.mo9772a((C2368a) this);
    }

    /* renamed from: b */
    public void mo9685b(C2322l lVar) {
        C2216i.m11347b();
        if (lVar instanceof C2316i) {
            ((C2316i) lVar).mo9706d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: b */
    public void mo9684b(C2272c cVar, C2316i iVar) {
        C2216i.m11347b();
        this.f9158e.remove(cVar);
        if (iVar.mo9705c()) {
            this.f9156c.mo9770a(cVar, iVar);
        } else {
            this.f9159f.mo9712a(iVar);
        }
    }

    /* renamed from: b */
    private ReferenceQueue<C2316i<?>> m11987b() {
        if (this.f9161h == null) {
            this.f9161h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new C2307d(this.f9158e, this.f9161h));
        }
        return this.f9161h;
    }

    /* renamed from: a */
    private static void m11985a(String str, long j, C2272c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2212e.m11319a(j));
        sb.append("ms, key: ");
        sb.append(cVar);
        sb.toString();
    }

    /* renamed from: a */
    private C2316i<?> m11984a(C2272c cVar, boolean z) {
        C2316i<?> iVar = null;
        if (!z) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f9158e.get(cVar);
        if (weakReference != null) {
            iVar = (C2316i) weakReference.get();
            if (iVar != null) {
                iVar.mo9704b();
            } else {
                this.f9158e.remove(cVar);
            }
        }
        return iVar;
    }

    /* renamed from: a */
    private C2316i<?> m11983a(C2272c cVar) {
        C2322l a = this.f9156c.mo9769a(cVar);
        if (a == null) {
            return null;
        }
        if (a instanceof C2316i) {
            return (C2316i) a;
        }
        return new C2316i(a, true);
    }

    /* renamed from: a */
    public void mo9681a(C2272c cVar, C2316i<?> iVar) {
        C2216i.m11347b();
        if (iVar != null) {
            iVar.mo9703a(cVar, this);
            if (iVar.mo9705c()) {
                this.f9158e.put(cVar, new C2308e(cVar, iVar, m11987b()));
            }
        }
        this.f9154a.remove(cVar);
    }

    /* renamed from: a */
    public void mo9682a(C2309e eVar, C2272c cVar) {
        C2216i.m11347b();
        if (eVar.equals((C2309e) this.f9154a.get(cVar))) {
            this.f9154a.remove(cVar);
        }
    }

    /* renamed from: a */
    public void mo9683a(C2322l<?> lVar) {
        C2216i.m11347b();
        this.f9159f.mo9712a(lVar);
    }

    /* renamed from: a */
    public void mo9680a() {
        this.f9160g.mo9674a().clear();
    }
}
