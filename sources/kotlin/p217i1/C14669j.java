package kotlin.p217i1;

import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14525k;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.i1.j */
/* compiled from: Regex.kt */
public final class C14669j {
    @C6003d

    /* renamed from: a */
    private final String f42896a;
    @C6003d

    /* renamed from: b */
    private final C14525k f42897b;

    public C14669j(@C6003d String str, @C6003d C14525k kVar) {
        C14445h0.m62478f(str, "value");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        this.f42896a = str;
        this.f42897b = kVar;
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ C14669j m63581a(C14669j jVar, String str, C14525k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f42896a;
        }
        if ((i & 2) != 0) {
            kVar = jVar.f42897b;
        }
        return jVar.mo45889a(str, kVar);
    }

    @C6003d
    /* renamed from: a */
    public final String mo45888a() {
        return this.f42896a;
    }

    @C6003d
    /* renamed from: a */
    public final C14669j mo45889a(@C6003d String str, @C6003d C14525k kVar) {
        C14445h0.m62478f(str, "value");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        return new C14669j(str, kVar);
    }

    @C6003d
    /* renamed from: b */
    public final C14525k mo45890b() {
        return this.f42897b;
    }

    @C6003d
    /* renamed from: c */
    public final C14525k mo45891c() {
        return this.f42897b;
    }

    @C6003d
    /* renamed from: d */
    public final String mo45892d() {
        return this.f42896a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) r2.f42897b, (java.lang.Object) r3.f42897b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.p217i1.C14669j
            if (r0 == 0) goto L_0x001d
            kotlin.i1.j r3 = (kotlin.p217i1.C14669j) r3
            java.lang.String r0 = r2.f42896a
            java.lang.String r1 = r3.f42896a
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.e1.k r0 = r2.f42897b
            kotlin.e1.k r3 = r3.f42897b
            boolean r3 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p217i1.C14669j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f42896a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C14525k kVar = this.f42897b;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.f42896a);
        sb.append(", range=");
        sb.append(this.f42897b);
        sb.append(")");
        return sb.toString();
    }
}
