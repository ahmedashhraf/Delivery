package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14007d;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14011h;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14013j;

/* renamed from: i.b.a.a.c.j.c.f.i */
/* compiled from: MethodInstrumenter */
class C14023i extends C14013j {

    /* renamed from: l3 */
    private final C14019e f41214l3;

    public C14023i(C13957r rVar, C14019e eVar) {
        super(rVar);
        this.f41214l3 = eVar;
    }

    /* renamed from: b */
    private C13956q m60492b(C13956q qVar) {
        if (C14011h.m60425e(qVar) == -1) {
            return qVar;
        }
        if (C14011h.m60426f(qVar)) {
            return C14011h.m60424d(qVar);
        }
        C13956q qVar2 = new C13956q();
        C14011h.m60419a(qVar, qVar2);
        C14011h.m60432l(qVar);
        return qVar2;
    }

    /* renamed from: d */
    private int m60493d(int i) {
        if (i == 198) {
            return C13959t.f40913i3;
        }
        if (i == 199) {
            return C13959t.f40908h3;
        }
        switch (i) {
            case C13959t.f40941p2 /*153*/:
                return C13959t.f40945q2;
            case C13959t.f40945q2 /*154*/:
                return C13959t.f40941p2;
            case C13959t.f40949r2 /*155*/:
                return C13959t.f40953s2;
            case C13959t.f40953s2 /*156*/:
                return C13959t.f40949r2;
            case C13959t.f40957t2 /*157*/:
                return C13959t.f40961u2;
            case C13959t.f40961u2 /*158*/:
                return C13959t.f40957t2;
            case C13959t.f40965v2 /*159*/:
                return C13959t.f40969w2;
            case C13959t.f40969w2 /*160*/:
                return C13959t.f40965v2;
            case C13959t.f40973x2 /*161*/:
                return C13959t.f40977y2;
            case C13959t.f40977y2 /*162*/:
                return C13959t.f40973x2;
            case C13959t.f40981z2 /*163*/:
                return C13959t.f40768A2;
            case C13959t.f40768A2 /*164*/:
                return C13959t.f40981z2;
            case C13959t.f40772B2 /*165*/:
                return C13959t.f40776C2;
            case C13959t.f40776C2 /*166*/:
                return C13959t.f40772B2;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo44307a(int i, C13956q qVar, int i2, C14007d dVar) {
        if (i == 167) {
            this.f41214l3.mo44313a(i2);
            this.f40701k3.mo44175a((int) C13959t.f40780D2, qVar);
            return;
        }
        C13956q qVar2 = new C13956q();
        this.f40701k3.mo44175a(m60493d(i), qVar2);
        this.f41214l3.mo44313a(i2);
        this.f40701k3.mo44175a((int) C13959t.f40780D2, qVar);
        this.f40701k3.mo44180a(qVar2);
        dVar.mo44298a(this.f40701k3);
    }

    /* renamed from: c */
    public void mo44309c(int i) {
        this.f41214l3.mo44313a(i);
    }

    /* renamed from: e */
    public void mo44310e(int i, int i2) {
        this.f41214l3.mo44313a(i2);
        this.f40701k3.mo44189b(i);
    }

    /* renamed from: a */
    public void mo44306a(int i, int i2, C13956q qVar, C13956q[] qVarArr, C14007d dVar) {
        C14011h.m60431k(qVar);
        C14011h.m60421a(qVarArr);
        this.f40701k3.mo44173a(i, i2, m60492b(qVar), m60491a(qVarArr));
        m60490a(qVar, qVarArr, dVar);
    }

    /* renamed from: a */
    public void mo44308a(C13956q qVar, int[] iArr, C13956q[] qVarArr, C14007d dVar) {
        C14011h.m60431k(qVar);
        C14011h.m60421a(qVarArr);
        this.f40701k3.mo44182a(m60492b(qVar), iArr, m60491a(qVarArr));
        m60490a(qVar, qVarArr, dVar);
    }

    /* renamed from: a */
    private C13956q[] m60491a(C13956q[] qVarArr) {
        C13956q[] qVarArr2 = new C13956q[qVarArr.length];
        for (int i = 0; i < qVarArr.length; i++) {
            qVarArr2[i] = m60492b(qVarArr[i]);
        }
        return qVarArr2;
    }

    /* renamed from: a */
    private void m60489a(C13956q qVar, C14007d dVar) {
        int e = C14011h.m60425e(qVar);
        if (e != -1 && !C14011h.m60426f(qVar)) {
            this.f40701k3.mo44180a(C14011h.m60424d(qVar));
            dVar.mo44298a(this.f40701k3);
            this.f41214l3.mo44313a(e);
            this.f40701k3.mo44175a((int) C13959t.f40780D2, qVar);
            C14011h.m60432l(qVar);
        }
    }

    /* renamed from: a */
    private void m60490a(C13956q qVar, C13956q[] qVarArr, C14007d dVar) {
        C14011h.m60431k(qVar);
        C14011h.m60421a(qVarArr);
        m60489a(qVar, dVar);
        for (C13956q a : qVarArr) {
            m60489a(a, dVar);
        }
    }
}
