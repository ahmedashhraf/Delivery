package p205i.p471b.p472a.p473a.p474c;

import java.lang.instrument.Instrumentation;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14035f;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14036g;

/* renamed from: i.b.a.a.c.h */
/* compiled from: PreMain */
public final class C13939h {
    private C13939h() {
    }

    /* renamed from: a */
    public static void m59887a(String str, Instrumentation instrumentation) throws Exception {
        C14030b bVar = new C14030b(str);
        C13929a a = C13929a.m59862a(bVar);
        C14035f a2 = m59886a(instrumentation);
        a2.mo44319a(a.mo44042d());
        instrumentation.addTransformer(new C13934d(a2, bVar, C13935e.f40465a));
    }

    /* renamed from: a */
    private static C14035f m59886a(Instrumentation instrumentation) throws Exception {
        return C14036g.m60572a(instrumentation, "java/util/UUID");
    }
}
