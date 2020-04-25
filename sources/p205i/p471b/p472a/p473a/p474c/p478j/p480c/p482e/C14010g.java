package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

import p205i.p471b.p472a.p473a.p474c.p475i.C13953n;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13983r;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13988v;

/* renamed from: i.b.a.a.c.j.c.e.g */
/* compiled from: LabelFlowAnalyzer */
public final class C14010g extends C13957r {

    /* renamed from: l3 */
    boolean f41167l3 = false;

    /* renamed from: m3 */
    boolean f41168m3 = true;

    /* renamed from: n3 */
    C13956q f41169n3 = null;

    public C14010g() {
        super(327680);
    }

    /* renamed from: a */
    public static void m60398a(C13983r rVar) {
        C14010g gVar = new C14010g();
        int size = rVar.f41095A3.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C13988v) rVar.f41095A3.get(size)).mo44280a((C13957r) gVar);
            } else {
                rVar.f41116z3.mo44236a((C13957r) gVar);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo44191b(int i, C13956q qVar) {
        this.f41169n3 = qVar;
    }

    /* renamed from: d */
    public void mo44197d(int i, int i2) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: b */
    private static void m60399b(C13956q qVar) {
        if (!C14011h.m60426f(qVar)) {
            C14011h.m60435o(qVar);
            C14011h.m60432l(qVar);
        }
    }

    /* renamed from: d */
    private void m60400d() {
        C13956q qVar = this.f41169n3;
        if (qVar != null) {
            C14011h.m60433m(qVar);
        }
    }

    /* renamed from: a */
    public void mo44181a(C13956q qVar, C13956q qVar2, C13956q qVar3, String str) {
        C14011h.m60435o(qVar);
        C14011h.m60435o(qVar3);
    }

    /* renamed from: b */
    public void mo44189b(int i) {
        if (i != 169) {
            if (i != 191) {
                switch (i) {
                    case C13959t.f40800I2 /*172*/:
                    case C13959t.f40804J2 /*173*/:
                    case C13959t.f40808K2 /*174*/:
                    case 175:
                    case C13959t.f40816M2 /*176*/:
                    case C13959t.f40820N2 /*177*/:
                        break;
                    default:
                        this.f41167l3 = true;
                        break;
                }
            }
            this.f41167l3 = false;
            this.f41168m3 = false;
            return;
        }
        throw new AssertionError("Subroutines not supported.");
    }

    /* renamed from: a */
    public void mo44175a(int i, C13956q qVar) {
        C14011h.m60435o(qVar);
        if (i != 168) {
            this.f41167l3 = i != 167;
            this.f41168m3 = false;
            return;
        }
        throw new AssertionError("Subroutines not supported.");
    }

    /* renamed from: b */
    public void mo44190b(int i, int i2) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44180a(C13956q qVar) {
        if (this.f41168m3) {
            C14011h.m60435o(qVar);
        }
        if (this.f41167l3) {
            C14011h.m60434n(qVar);
        }
    }

    /* renamed from: a */
    public void mo44173a(int i, int i2, C13956q qVar, C13956q... qVarArr) {
        m60397a(qVar, qVarArr);
    }

    /* renamed from: a */
    public void mo44182a(C13956q qVar, int[] iArr, C13956q[] qVarArr) {
        m60397a(qVar, qVarArr);
    }

    /* renamed from: a */
    private void m60397a(C13956q qVar, C13956q[] qVarArr) {
        C14011h.m60431k(qVar);
        C14011h.m60421a(qVarArr);
        m60399b(qVar);
        for (C13956q b : qVarArr) {
            m60399b(b);
        }
        this.f41167l3 = false;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44176a(int i, String str) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44177a(int i, String str, String str2, String str3) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44178a(int i, String str, String str2, String str3, boolean z) {
        this.f41167l3 = true;
        this.f41168m3 = false;
        m60400d();
    }

    /* renamed from: a */
    public void mo44185a(String str, String str2, C13953n nVar, Object... objArr) {
        this.f41167l3 = true;
        this.f41168m3 = false;
        m60400d();
    }

    /* renamed from: a */
    public void mo44183a(Object obj) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44172a(int i, int i2) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }

    /* renamed from: a */
    public void mo44184a(String str, int i) {
        this.f41167l3 = true;
        this.f41168m3 = false;
    }
}
