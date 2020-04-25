package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;

/* renamed from: i.b.a.a.c.j.c.e.h */
/* compiled from: LabelInfo */
public final class C14011h {

    /* renamed from: i */
    public static final int f41170i = -1;

    /* renamed from: a */
    private boolean f41171a = false;

    /* renamed from: b */
    private boolean f41172b = false;

    /* renamed from: c */
    private boolean f41173c = false;

    /* renamed from: d */
    private boolean f41174d = false;

    /* renamed from: e */
    private boolean f41175e = false;

    /* renamed from: f */
    private int f41176f = -1;

    /* renamed from: g */
    private C13956q f41177g = null;

    /* renamed from: h */
    private C14009f f41178h = null;

    private C14011h() {
    }

    /* renamed from: a */
    public static void m60421a(C13956q[] qVarArr) {
        for (C13956q k : qVarArr) {
            m60431k(k);
        }
    }

    /* renamed from: b */
    private static C14011h m60422b(C13956q qVar) {
        Object obj = qVar.f40688a;
        if (obj instanceof C14011h) {
            return (C14011h) obj;
        }
        return null;
    }

    /* renamed from: c */
    public static C14009f m60423c(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return null;
        }
        return b.f41178h;
    }

    /* renamed from: d */
    public static C13956q m60424d(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return null;
        }
        return b.f41177g;
    }

    /* renamed from: e */
    public static int m60425e(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return -1;
        }
        return b.f41176f;
    }

    /* renamed from: f */
    public static boolean m60426f(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return false;
        }
        return b.f41175e;
    }

    /* renamed from: g */
    public static boolean m60427g(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return false;
        }
        return b.f41174d;
    }

    /* renamed from: h */
    public static boolean m60428h(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return false;
        }
        return b.f41172b;
    }

    /* renamed from: i */
    public static boolean m60429i(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b == null) {
            return false;
        }
        return b.f41173c;
    }

    /* renamed from: j */
    public static boolean m60430j(C13956q qVar) {
        C14011h b = m60422b(qVar);
        return b != null && b.f41173c && (b.f41172b || b.f41174d);
    }

    /* renamed from: k */
    public static void m60431k(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b != null) {
            b.f41175e = false;
        }
    }

    /* renamed from: l */
    public static void m60432l(C13956q qVar) {
        m60417a(qVar).f41175e = true;
    }

    /* renamed from: m */
    public static void m60433m(C13956q qVar) {
        m60417a(qVar).f41174d = true;
    }

    /* renamed from: n */
    public static void m60434n(C13956q qVar) {
        C14011h a = m60417a(qVar);
        a.f41173c = true;
        if (a.f41171a) {
            a.f41172b = true;
        }
    }

    /* renamed from: o */
    public static void m60435o(C13956q qVar) {
        C14011h a = m60417a(qVar);
        if (a.f41171a || a.f41173c) {
            a.f41172b = true;
        } else {
            a.f41171a = true;
        }
    }

    /* renamed from: a */
    public static void m60418a(C13956q qVar, int i) {
        m60417a(qVar).f41176f = i;
    }

    /* renamed from: a */
    public static void m60419a(C13956q qVar, C13956q qVar2) {
        m60417a(qVar).f41177g = qVar2;
    }

    /* renamed from: a */
    public static void m60420a(C13956q qVar, C14009f fVar) {
        m60417a(qVar).f41178h = fVar;
    }

    /* renamed from: a */
    private static C14011h m60417a(C13956q qVar) {
        C14011h b = m60422b(qVar);
        if (b != null) {
            return b;
        }
        C14011h hVar = new C14011h();
        qVar.f40688a = hVar;
        return hVar;
    }
}
