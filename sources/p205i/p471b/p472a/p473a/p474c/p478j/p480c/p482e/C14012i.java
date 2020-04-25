package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

import java.util.HashMap;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.p476w.C13962a;

/* renamed from: i.b.a.a.c.j.c.e.i */
/* compiled from: MethodProbesAdapter */
public final class C14012i extends C13957r {

    /* renamed from: l3 */
    private final C14013j f41179l3;

    /* renamed from: m3 */
    private final C14008e f41180m3;

    /* renamed from: n3 */
    private C13962a f41181n3;

    /* renamed from: o3 */
    private final Map<C13956q, C13956q> f41182o3 = new HashMap();

    public C14012i(C14013j jVar, C14008e eVar) {
        super(327680, jVar);
        this.f41179l3 = jVar;
        this.f41180m3 = eVar;
    }

    /* renamed from: c */
    private C14007d m60437c(int i) {
        return C14006c.m60386a(this.f41181n3, i);
    }

    /* renamed from: d */
    private int m60438d(int i) {
        if (i == 167) {
            return 0;
        }
        if (!(i == 198 || i == 199)) {
            switch (i) {
                case C13959t.f40941p2 /*153*/:
                case C13959t.f40945q2 /*154*/:
                case C13959t.f40949r2 /*155*/:
                case C13959t.f40953s2 /*156*/:
                case C13959t.f40957t2 /*157*/:
                case C13959t.f40961u2 /*158*/:
                    break;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public void mo44305a(C13962a aVar) {
        this.f41181n3 = aVar;
    }

    /* renamed from: b */
    public void mo44189b(int i) {
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
                    this.f41179l3.mo44189b(i);
                    return;
            }
        }
        this.f41179l3.mo44310e(i, this.f41180m3.mo44296a());
    }

    /* renamed from: a */
    public void mo44181a(C13956q qVar, C13956q qVar2, C13956q qVar3, String str) {
        if (this.f41182o3.containsKey(qVar)) {
            qVar = (C13956q) this.f41182o3.get(qVar);
        } else if (C14011h.m60430j(qVar)) {
            C13956q qVar4 = new C13956q();
            C14011h.m60434n(qVar4);
            this.f41182o3.put(qVar, qVar4);
            qVar = qVar4;
        }
        this.f41179l3.mo44181a(qVar, qVar2, qVar3, str);
    }

    /* renamed from: a */
    public void mo44180a(C13956q qVar) {
        if (C14011h.m60430j(qVar)) {
            if (this.f41182o3.containsKey(qVar)) {
                this.f41179l3.mo44180a((C13956q) this.f41182o3.get(qVar));
            }
            this.f41179l3.mo44309c(this.f41180m3.mo44296a());
        }
        this.f41179l3.mo44180a(qVar);
    }

    /* renamed from: a */
    public void mo44175a(int i, C13956q qVar) {
        if (C14011h.m60428h(qVar)) {
            this.f41179l3.mo44307a(i, qVar, this.f41180m3.mo44296a(), m60437c(m60438d(i)));
        } else {
            this.f41179l3.mo44175a(i, qVar);
        }
    }

    /* renamed from: a */
    public void mo44182a(C13956q qVar, int[] iArr, C13956q[] qVarArr) {
        if (m60436a(qVar, qVarArr)) {
            this.f41179l3.mo44308a(qVar, iArr, qVarArr, m60437c(1));
        } else {
            this.f41179l3.mo44182a(qVar, iArr, qVarArr);
        }
    }

    /* renamed from: a */
    public void mo44173a(int i, int i2, C13956q qVar, C13956q... qVarArr) {
        if (m60436a(qVar, qVarArr)) {
            this.f41179l3.mo44306a(i, i2, qVar, qVarArr, m60437c(1));
            return;
        }
        this.f41179l3.mo44173a(i, i2, qVar, qVarArr);
    }

    /* renamed from: a */
    private boolean m60436a(C13956q qVar, C13956q[] qVarArr) {
        boolean z;
        C14011h.m60421a(qVarArr);
        if (C14011h.m60428h(qVar)) {
            C14011h.m60418a(qVar, this.f41180m3.mo44296a());
            z = true;
        } else {
            z = false;
        }
        C14011h.m60432l(qVar);
        for (C13956q qVar2 : qVarArr) {
            if (C14011h.m60428h(qVar2) && !C14011h.m60426f(qVar2)) {
                C14011h.m60418a(qVar2, this.f41180m3.mo44296a());
                z = true;
            }
            C14011h.m60432l(qVar2);
        }
        return z;
    }
}
