package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13944e;
import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d.C13999a;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14002a;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14033d;

/* renamed from: i.b.a.a.c.j.c.f.k */
/* compiled from: ProbeArrayStrategyFactory */
public final class C14025k {
    private C14025k() {
    }

    /* renamed from: a */
    public static C14018d m60501a(C13944e eVar, C14033d dVar) {
        String b = eVar.mo44084b();
        int b2 = m60503b(eVar);
        long a = C13999a.m60371a(eVar.f40496a);
        boolean z = b2 >= 50;
        if (m60504c(eVar)) {
            C14026l a2 = m60502a(eVar);
            if (a2.mo44314c() == 0) {
                return new C14024j();
            }
            if (b2 < 52 || !a2.mo44315d()) {
                C14022h hVar = new C14022h(b, a, a2.mo44314c(), dVar);
                return hVar;
            }
            C14021g gVar = new C14021g(b, a, a2.mo44314c(), dVar);
            return gVar;
        }
        C14015a aVar = new C14015a(b, a, z, dVar);
        return aVar;
    }

    /* renamed from: b */
    private static int m60503b(C13944e eVar) {
        return eVar.mo44091e(6);
    }

    /* renamed from: c */
    private static boolean m60504c(C13944e eVar) {
        return (eVar.mo44075a() & 512) != 0;
    }

    /* renamed from: a */
    private static C14026l m60502a(C13944e eVar) {
        C14026l lVar = new C14026l();
        eVar.mo44079a((C13945f) new C14002a(lVar, false), 0);
        return lVar;
    }
}
