package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14033d;

/* renamed from: i.b.a.a.c.j.c.f.g */
/* compiled from: InterfaceFieldProbeArrayStrategy */
class C14021g implements C14018d {

    /* renamed from: f */
    private static final Object[] f41203f = {C14020f.f41196e};

    /* renamed from: g */
    private static final Object[] f41204g = new Object[0];

    /* renamed from: a */
    private final String f41205a;

    /* renamed from: b */
    private final long f41206b;

    /* renamed from: c */
    private final int f41207c;

    /* renamed from: d */
    private final C14033d f41208d;

    /* renamed from: e */
    private boolean f41209e = false;

    C14021g(String str, long j, int i, C14033d dVar) {
        this.f41205a = str;
        this.f41206b = j;
        this.f41207c = i;
        this.f41208d = dVar;
    }

    /* renamed from: b */
    private void m60483b(C13945f fVar, int i) {
        C13957r a = fVar.mo44097a(4104, "<clinit>", "()V", (String) null, (String[]) null);
        a.mo44188b();
        int a2 = this.f41208d.mo44353a(this.f41206b, this.f41205a, i, a);
        a.mo44177a(179, this.f41205a, C14020f.f41193b, C14020f.f41196e);
        a.mo44189b(C13959t.f40820N2);
        a.mo44196c(a2, 0);
        a.mo44195c();
    }

    /* renamed from: c */
    private void m60484c(C13945f fVar, int i) {
        C13957r a = fVar.mo44097a((int) C14020f.f41199h, C14020f.f41197f, C14020f.f41198g, (String) null, (String[]) null);
        a.mo44188b();
        a.mo44177a(178, this.f41205a, C14020f.f41193b, C14020f.f41196e);
        a.mo44189b(89);
        C13956q qVar = new C13956q();
        a.mo44175a((int) C13959t.f40913i3, qVar);
        a.mo44189b(87);
        int a2 = this.f41208d.mo44353a(this.f41206b, this.f41205a, i, a);
        a.mo44174a(-1, 0, f41204g, 1, f41203f);
        a.mo44180a(qVar);
        a.mo44189b(C13959t.f40816M2);
        a.mo44196c(Math.max(a2, 2), 0);
        a.mo44195c();
    }

    /* renamed from: a */
    public int mo44311a(C13957r rVar, boolean z, int i) {
        if (z) {
            int a = this.f41208d.mo44353a(this.f41206b, this.f41205a, this.f41207c, rVar);
            rVar.mo44189b(89);
            rVar.mo44177a(179, this.f41205a, C14020f.f41193b, C14020f.f41196e);
            rVar.mo44197d(58, i);
            this.f41209e = true;
            return Math.max(a, 2);
        }
        rVar.mo44178a(184, this.f41205a, C14020f.f41197f, C14020f.f41198g, true);
        rVar.mo44197d(58, i);
        return 1;
    }

    /* renamed from: a */
    public void mo44312a(C13945f fVar, int i) {
        m60482a(fVar);
        m60484c(fVar, i);
        if (!this.f41209e) {
            m60483b(fVar, i);
        }
    }

    /* renamed from: a */
    private void m60482a(C13945f fVar) {
        fVar.mo44096a((int) C14020f.f41195d, C14020f.f41193b, C14020f.f41196e, (String) null, (Object) null);
    }
}
