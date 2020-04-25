package p433d.p434a.p435a;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: d.a.a.d */
/* compiled from: LRUCache */
public class C12178d implements C12174b {

    /* renamed from: a */
    protected long f35140a;

    /* renamed from: b */
    protected long f35141b;

    /* renamed from: c */
    protected long f35142c;

    /* renamed from: d */
    protected int f35143d;

    /* renamed from: e */
    protected long f35144e;

    /* renamed from: f */
    protected LinkedHashMap<C12180e, C12175c> f35145f;

    /* renamed from: d.a.a.d$a */
    /* compiled from: LRUCache */
    class C12179a extends LinkedHashMap<C12180e, C12175c> {

        /* renamed from: a */
        final /* synthetic */ int f35146a;

        C12179a(int i, float f, boolean z, int i2) {
            this.f35146a = i2;
            super(i, f, z);
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Entry<C12180e, C12175c> entry) {
            return size() > this.f35146a;
        }
    }

    public C12178d(int i, long j) {
        this.f35140a = 0;
        this.f35141b = 0;
        this.f35142c = 0;
        this.f35143d = i;
        this.f35144e = j;
        C12179a aVar = new C12179a(Math.min(((i + 3) / 4) + i + 2, 11), 0.75f, true, i);
        this.f35145f = aVar;
    }

    /* renamed from: a */
    public synchronized void mo41696a() {
        this.f35145f.clear();
        this.f35140a = 0;
        this.f35142c = 0;
        this.f35141b = 0;
    }

    /* renamed from: b */
    public long mo41697b() {
        return this.f35141b;
    }

    /* renamed from: c */
    public long mo41698c() {
        return this.f35142c;
    }

    /* renamed from: d */
    public long mo41699d() {
        return this.f35140a;
    }

    public synchronized C12175c get(C12180e eVar) {
        C12175c cVar = (C12175c) this.f35145f.get(eVar);
        if (cVar == null) {
            this.f35140a++;
            return null;
        }
        long j = this.f35144e;
        for (C12181f fVar : cVar.mo41673b()) {
            j = Math.min(j, fVar.f35157d);
        }
        for (C12181f fVar2 : cVar.mo41671a()) {
            j = Math.min(j, fVar2.f35157d);
        }
        if (cVar.mo41682g() + j > System.currentTimeMillis()) {
            this.f35140a++;
            this.f35141b++;
            this.f35145f.remove(eVar);
            return null;
        }
        this.f35142c++;
        return cVar;
    }

    public synchronized void put(C12180e eVar, C12175c cVar) {
        if (cVar.mo41682g() > 0) {
            this.f35145f.put(eVar, cVar);
        }
    }

    public C12178d(int i) {
        this(i, Long.MAX_VALUE);
    }
}
