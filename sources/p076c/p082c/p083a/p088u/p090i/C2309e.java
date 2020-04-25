package p076c.p082c.p083a.p088u.p090i;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p108y.C2530g;

/* renamed from: c.c.a.u.i.e */
/* compiled from: EngineJob */
class C2309e implements C2319a {

    /* renamed from: q */
    private static final C2311b f9172q = new C2311b();

    /* renamed from: r */
    private static final Handler f9173r = new Handler(Looper.getMainLooper(), new C2312c());

    /* renamed from: s */
    private static final int f9174s = 1;

    /* renamed from: t */
    private static final int f9175t = 2;

    /* renamed from: a */
    private final List<C2530g> f9176a;

    /* renamed from: b */
    private final C2311b f9177b;

    /* renamed from: c */
    private final C2313f f9178c;

    /* renamed from: d */
    private final C2272c f9179d;

    /* renamed from: e */
    private final ExecutorService f9180e;

    /* renamed from: f */
    private final ExecutorService f9181f;

    /* renamed from: g */
    private final boolean f9182g;

    /* renamed from: h */
    private boolean f9183h;

    /* renamed from: i */
    private C2322l<?> f9184i;

    /* renamed from: j */
    private boolean f9185j;

    /* renamed from: k */
    private Exception f9186k;

    /* renamed from: l */
    private boolean f9187l;

    /* renamed from: m */
    private Set<C2530g> f9188m;

    /* renamed from: n */
    private C2318j f9189n;

    /* renamed from: o */
    private C2316i<?> f9190o;

    /* renamed from: p */
    private volatile Future<?> f9191p;

    /* renamed from: c.c.a.u.i.e$b */
    /* compiled from: EngineJob */
    static class C2311b {
        C2311b() {
        }

        /* renamed from: a */
        public <R> C2316i<R> mo9697a(C2322l<R> lVar, boolean z) {
            return new C2316i<>(lVar, z);
        }
    }

    /* renamed from: c.c.a.u.i.e$c */
    /* compiled from: EngineJob */
    private static class C2312c implements Callback {
        private C2312c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1 != i && 2 != i) {
                return false;
            }
            C2309e eVar = (C2309e) message.obj;
            if (1 == message.what) {
                eVar.m12003d();
            } else {
                eVar.m12001c();
            }
            return true;
        }
    }

    public C2309e(C2272c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, C2313f fVar) {
        this(cVar, executorService, executorService2, z, fVar, f9172q);
    }

    /* renamed from: c */
    private void m12002c(C2530g gVar) {
        if (this.f9188m == null) {
            this.f9188m = new HashSet();
        }
        this.f9188m.add(gVar);
    }

    /* renamed from: d */
    private boolean m12004d(C2530g gVar) {
        Set<C2530g> set = this.f9188m;
        return set != null && set.contains(gVar);
    }

    public C2309e(C2272c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, C2313f fVar, C2311b bVar) {
        this.f9176a = new ArrayList();
        this.f9179d = cVar;
        this.f9180e = executorService;
        this.f9181f = executorService2;
        this.f9182g = z;
        this.f9178c = fVar;
        this.f9177b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m12003d() {
        if (this.f9183h) {
            this.f9184i.mo9702a();
        } else if (!this.f9176a.isEmpty()) {
            this.f9190o = this.f9177b.mo9697a(this.f9184i, this.f9182g);
            this.f9185j = true;
            this.f9190o.mo9704b();
            this.f9178c.mo9681a(this.f9179d, this.f9190o);
            for (C2530g gVar : this.f9176a) {
                if (!m12004d(gVar)) {
                    this.f9190o.mo9704b();
                    gVar.mo9691a((C2322l<?>) this.f9190o);
                }
            }
            this.f9190o.mo9706d();
        } else {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    /* renamed from: a */
    public void mo9690a(C2318j jVar) {
        this.f9191p = this.f9181f.submit(jVar);
    }

    /* renamed from: b */
    public void mo9694b(C2318j jVar) {
        this.f9189n = jVar;
        this.f9191p = this.f9180e.submit(jVar);
    }

    /* renamed from: a */
    public void mo9692a(C2530g gVar) {
        C2216i.m11347b();
        if (this.f9185j) {
            gVar.mo9691a((C2322l<?>) this.f9190o);
        } else if (this.f9187l) {
            gVar.mo9693a(this.f9186k);
        } else {
            this.f9176a.add(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12001c() {
        if (!this.f9183h) {
            if (!this.f9176a.isEmpty()) {
                this.f9187l = true;
                this.f9178c.mo9681a(this.f9179d, null);
                for (C2530g gVar : this.f9176a) {
                    if (!m12004d(gVar)) {
                        gVar.mo9693a(this.f9186k);
                    }
                }
                return;
            }
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
    }

    /* renamed from: b */
    public void mo9695b(C2530g gVar) {
        C2216i.m11347b();
        if (this.f9185j || this.f9187l) {
            m12002c(gVar);
            return;
        }
        this.f9176a.remove(gVar);
        if (this.f9176a.isEmpty()) {
            mo9689a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9689a() {
        if (!this.f9187l && !this.f9185j && !this.f9183h) {
            this.f9189n.mo9709a();
            Future<?> future = this.f9191p;
            if (future != null) {
                future.cancel(true);
            }
            this.f9183h = true;
            this.f9178c.mo9682a(this, this.f9179d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo9696b() {
        return this.f9183h;
    }

    /* renamed from: a */
    public void mo9691a(C2322l<?> lVar) {
        this.f9184i = lVar;
        f9173r.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: a */
    public void mo9693a(Exception exc) {
        this.f9186k = exc;
        f9173r.obtainMessage(2, this).sendToTarget();
    }
}
