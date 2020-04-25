package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15475a;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15477c;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15479e;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15480f;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15481g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f.C14020f;

/* renamed from: i.b.a.a.c.j.d.j */
/* compiled from: RuntimeData */
public class C14041j {

    /* renamed from: a */
    protected final C15477c f41263a = new C15477c();

    /* renamed from: b */
    private long f41264b = System.currentTimeMillis();

    /* renamed from: c */
    private String f41265c = "<none>";

    /* renamed from: a */
    public void mo44362a(String str) {
        this.f41265c = str;
    }

    /* renamed from: b */
    public final void mo44365b() {
        synchronized (this.f41263a) {
            this.f41263a.mo47823b();
            this.f41264b = System.currentTimeMillis();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Object[]) {
            mo44364a((Object[]) obj);
        }
        return super.equals(obj);
    }

    /* renamed from: a */
    public String mo44360a() {
        return this.f41265c;
    }

    /* renamed from: a */
    public final void mo44363a(C15479e eVar, C15480f fVar, boolean z) {
        synchronized (this.f41263a) {
            C15481g gVar = new C15481g(this.f41265c, this.f41264b, System.currentTimeMillis());
            fVar.mo47827a(gVar);
            this.f41263a.mo47821a(eVar);
            if (z) {
                mo44365b();
            }
        }
    }

    /* renamed from: b */
    public static void m60587b(long j, String str, int i, C13957r rVar) {
        rVar.mo44189b(6);
        rVar.mo44176a((int) C13959t.f40868Z2, "java/lang/Object");
        rVar.mo44189b(89);
        rVar.mo44189b(3);
        rVar.mo44183a((Object) Long.valueOf(j));
        rVar.mo44178a(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        rVar.mo44189b(83);
        rVar.mo44189b(89);
        rVar.mo44189b(4);
        rVar.mo44183a((Object) str);
        rVar.mo44189b(83);
        rVar.mo44189b(89);
        rVar.mo44189b(5);
        C14020f.m60480a(rVar, i);
        rVar.mo44178a(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        rVar.mo44189b(83);
    }

    /* renamed from: a */
    public C15475a mo44361a(Long l, String str, int i) {
        C15475a a;
        synchronized (this.f41263a) {
            a = this.f41263a.mo47818a(l, str, i);
        }
        return a;
    }

    /* renamed from: a */
    public void mo44364a(Object[] objArr) {
        objArr[0] = mo44361a(objArr[0], objArr[1], objArr[2].intValue()).mo47809c();
    }

    /* renamed from: a */
    public static void m60586a(long j, String str, int i, C13957r rVar) {
        m60587b(j, str, i, rVar);
        rVar.mo44189b(90);
        rVar.mo44178a((int) C13959t.f40840S2, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
        rVar.mo44189b(87);
        rVar.mo44189b(3);
        rVar.mo44189b(50);
        rVar.mo44176a(192, C14020f.f41196e);
    }
}
