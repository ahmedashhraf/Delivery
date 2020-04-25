package p076c.p082c.p083a.p108y;

/* renamed from: c.c.a.y.h */
/* compiled from: ThumbnailRequestCoordinator */
public class C2531h implements C2526d, C2525c {

    /* renamed from: a */
    private C2525c f9605a;

    /* renamed from: b */
    private C2525c f9606b;

    /* renamed from: c */
    private C2526d f9607c;

    public C2531h() {
        this(null);
    }

    /* renamed from: h */
    private boolean m12573h() {
        C2526d dVar = this.f9607c;
        return dVar == null || dVar.mo9996a(this);
    }

    /* renamed from: i */
    private boolean m12574i() {
        C2526d dVar = this.f9607c;
        return dVar == null || dVar.mo9998b(this);
    }

    /* renamed from: j */
    private boolean m12575j() {
        C2526d dVar = this.f9607c;
        return dVar != null && dVar.mo9997b();
    }

    /* renamed from: a */
    public void mo10012a(C2525c cVar, C2525c cVar2) {
        this.f9605a = cVar;
        this.f9606b = cVar2;
    }

    /* renamed from: b */
    public boolean mo9998b(C2525c cVar) {
        return m12574i() && (cVar.equals(this.f9605a) || !this.f9605a.mo9990e());
    }

    /* renamed from: c */
    public void mo9999c(C2525c cVar) {
        if (!cVar.equals(this.f9606b)) {
            C2526d dVar = this.f9607c;
            if (dVar != null) {
                dVar.mo9999c(this);
            }
            if (!this.f9606b.mo9989d()) {
                this.f9606b.clear();
            }
        }
    }

    public void clear() {
        this.f9606b.clear();
        this.f9605a.clear();
    }

    /* renamed from: d */
    public boolean mo9989d() {
        return this.f9605a.mo9989d() || this.f9606b.mo9989d();
    }

    /* renamed from: e */
    public boolean mo9990e() {
        return this.f9605a.mo9990e() || this.f9606b.mo9990e();
    }

    /* renamed from: f */
    public boolean mo9991f() {
        return this.f9605a.mo9991f();
    }

    /* renamed from: g */
    public boolean mo9992g() {
        return this.f9605a.mo9992g();
    }

    public boolean isCancelled() {
        return this.f9605a.isCancelled();
    }

    public boolean isRunning() {
        return this.f9605a.isRunning();
    }

    /* renamed from: o */
    public void mo9995o() {
        this.f9605a.mo9995o();
        this.f9606b.mo9995o();
    }

    public C2531h(C2526d dVar) {
        this.f9607c = dVar;
    }

    /* renamed from: b */
    public boolean mo9997b() {
        return m12575j() || mo9990e();
    }

    /* renamed from: a */
    public boolean mo9996a(C2525c cVar) {
        return m12573h() && cVar.equals(this.f9605a) && !mo9997b();
    }

    /* renamed from: a */
    public void mo9985a() {
        this.f9605a.mo9985a();
        this.f9606b.mo9985a();
    }

    /* renamed from: c */
    public void mo9987c() {
        if (!this.f9606b.isRunning()) {
            this.f9606b.mo9987c();
        }
        if (!this.f9605a.isRunning()) {
            this.f9605a.mo9987c();
        }
    }
}
