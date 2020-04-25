package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14033d;

/* renamed from: i.b.a.a.c.j.c.f.a */
/* compiled from: ClassFieldProbeArrayStrategy */
class C14015a implements C14018d {

    /* renamed from: e */
    private static final Object[] f41183e = {C14020f.f41196e};

    /* renamed from: f */
    private static final Object[] f41184f = new Object[0];

    /* renamed from: a */
    private final String f41185a;

    /* renamed from: b */
    private final long f41186b;

    /* renamed from: c */
    private final boolean f41187c;

    /* renamed from: d */
    private final C14033d f41188d;

    C14015a(String str, long j, boolean z, C14033d dVar) {
        this.f41185a = str;
        this.f41186b = j;
        this.f41187c = z;
        this.f41188d = dVar;
    }

    /* renamed from: b */
    private void m60455b(C13945f fVar, int i) {
        C13957r a = fVar.mo44097a((int) C14020f.f41199h, C14020f.f41197f, C14020f.f41198g, (String) null, (String[]) null);
        a.mo44188b();
        a.mo44177a(178, this.f41185a, C14020f.f41193b, C14020f.f41196e);
        a.mo44189b(89);
        C13956q qVar = new C13956q();
        a.mo44175a((int) C13959t.f40913i3, qVar);
        a.mo44189b(87);
        int a2 = m60453a(a, i);
        if (this.f41187c) {
            a.mo44174a(-1, 0, f41184f, 1, f41183e);
        }
        a.mo44180a(qVar);
        a.mo44189b(C13959t.f40816M2);
        a.mo44196c(Math.max(a2, 2), 0);
        a.mo44195c();
    }

    /* renamed from: a */
    public int mo44311a(C13957r rVar, boolean z, int i) {
        rVar.mo44178a(184, this.f41185a, C14020f.f41197f, C14020f.f41198g, false);
        rVar.mo44197d(58, i);
        return 1;
    }

    /* renamed from: a */
    public void mo44312a(C13945f fVar, int i) {
        m60454a(fVar);
        m60455b(fVar, i);
    }

    /* renamed from: a */
    private void m60454a(C13945f fVar) {
        fVar.mo44096a((int) C14020f.f41194c, C14020f.f41193b, C14020f.f41196e, (String) null, (Object) null);
    }

    /* renamed from: a */
    private int m60453a(C13957r rVar, int i) {
        int a = this.f41188d.mo44353a(this.f41186b, this.f41185a, i, rVar);
        rVar.mo44189b(89);
        rVar.mo44177a(179, this.f41185a, C14020f.f41193b, C14020f.f41196e);
        return Math.max(a, 2);
    }
}
