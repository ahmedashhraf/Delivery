package p076c.p082c.p083a.p088u.p090i;

import android.util.Log;
import p076c.p082c.p083a.C2244p;
import p076c.p082c.p083a.p088u.p090i.p093p.C2382b;
import p076c.p082c.p083a.p108y.C2530g;

/* renamed from: c.c.a.u.i.j */
/* compiled from: EngineRunnable */
class C2318j implements Runnable, C2382b {

    /* renamed from: Q */
    private static final String f9212Q = "EngineRunnable";

    /* renamed from: N */
    private final C2298b<?, ?, ?> f9213N;

    /* renamed from: O */
    private C2320b f9214O = C2320b.CACHE;

    /* renamed from: P */
    private volatile boolean f9215P;

    /* renamed from: a */
    private final C2244p f9216a;

    /* renamed from: b */
    private final C2319a f9217b;

    /* renamed from: c.c.a.u.i.j$a */
    /* compiled from: EngineRunnable */
    interface C2319a extends C2530g {
        /* renamed from: a */
        void mo9690a(C2318j jVar);
    }

    /* renamed from: c.c.a.u.i.j$b */
    /* compiled from: EngineRunnable */
    private enum C2320b {
        CACHE,
        SOURCE
    }

    public C2318j(C2319a aVar, C2298b<?, ?, ?> bVar, C2244p pVar) {
        this.f9217b = aVar;
        this.f9213N = bVar;
        this.f9216a = pVar;
    }

    /* renamed from: b */
    private C2322l<?> m12027b() throws Exception {
        if (m12030e()) {
            return m12028c();
        }
        return m12029d();
    }

    /* renamed from: c */
    private C2322l<?> m12028c() throws Exception {
        C2322l<?> lVar;
        try {
            lVar = this.f9213N.mo9672c();
        } catch (Exception e) {
            if (Log.isLoggable(f9212Q, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception decoding result from cache: ");
                sb.append(e);
                sb.toString();
            }
            lVar = null;
        }
        return lVar == null ? this.f9213N.mo9673d() : lVar;
    }

    /* renamed from: d */
    private C2322l<?> m12029d() throws Exception {
        return this.f9213N.mo9671b();
    }

    /* renamed from: e */
    private boolean m12030e() {
        return this.f9214O == C2320b.CACHE;
    }

    /* renamed from: a */
    public void mo9709a() {
        this.f9215P = true;
        this.f9213N.mo9670a();
    }

    public int getPriority() {
        return this.f9216a.ordinal();
    }

    public void run() {
        if (!this.f9215P) {
            C2322l lVar = null;
            try {
                e = null;
                lVar = m12027b();
            } catch (Exception e) {
                e = e;
                boolean isLoggable = Log.isLoggable(f9212Q, 2);
            }
            if (this.f9215P) {
                if (lVar != null) {
                    lVar.mo9702a();
                }
                return;
            }
            if (lVar == null) {
                m12026a(e);
            } else {
                m12025a(lVar);
            }
        }
    }

    /* renamed from: a */
    private void m12025a(C2322l lVar) {
        this.f9217b.mo9691a(lVar);
    }

    /* renamed from: a */
    private void m12026a(Exception exc) {
        if (m12030e()) {
            this.f9214O = C2320b.SOURCE;
            this.f9217b.mo9690a(this);
            return;
        }
        this.f9217b.mo9693a(exc);
    }
}
