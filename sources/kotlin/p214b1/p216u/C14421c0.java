package kotlin.p214b1.p216u;

import kotlin.C6096e0;
import kotlin.p505f1.C14538b;
import kotlin.p505f1.C14544f;

/* renamed from: kotlin.b1.u.c0 */
/* compiled from: FunctionReference */
public class C14421c0 extends C14473o implements C14416a0, C14544f {

    /* renamed from: O */
    private final int f42543O;

    public C14421c0(int i) {
        this.f42543O = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a(mo45620s(), r5.mo45620s()) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof kotlin.p214b1.p216u.C14421c0
            r2 = 0
            if (r1 == 0) goto L_0x0053
            kotlin.b1.u.c0 r5 = (kotlin.p214b1.p216u.C14421c0) r5
            kotlin.f1.e r1 = r4.mo45536t()
            if (r1 != 0) goto L_0x0018
            kotlin.f1.e r1 = r5.mo45536t()
            if (r1 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0018:
            kotlin.f1.e r1 = r4.mo45536t()
            kotlin.f1.e r3 = r5.mo45536t()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
        L_0x0026:
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.mo45537v()
            java.lang.String r3 = r5.mo45537v()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r4.mo45620s()
            java.lang.Object r5 = r5.mo45620s()
            boolean r5 = kotlin.p214b1.p216u.C14445h0.m62463a(r1, r5)
            if (r5 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        L_0x0053:
            boolean r0 = r5 instanceof kotlin.p505f1.C14544f
            if (r0 == 0) goto L_0x0060
            kotlin.f1.b r0 = r4.mo45619q()
            boolean r5 = r5.equals(r0)
            return r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p214b1.p216u.C14421c0.equals(java.lang.Object):boolean");
    }

    @C6096e0(version = "1.1")
    /* renamed from: g */
    public boolean mo45540g() {
        return mo45547u().mo45540g();
    }

    public int getArity() {
        return this.f42543O;
    }

    public int hashCode() {
        return (((mo45536t() == null ? 0 : mo45536t().hashCode() * 31) + getName().hashCode()) * 31) + mo45537v().hashCode();
    }

    @C6096e0(version = "1.1")
    public boolean isExternal() {
        return mo45547u().isExternal();
    }

    @C6096e0(version = "1.1")
    /* renamed from: j */
    public boolean mo45543j() {
        return mo45547u().mo45543j();
    }

    @C6096e0(version = "1.1")
    /* renamed from: k */
    public boolean mo45544k() {
        return mo45547u().mo45544k();
    }

    @C6096e0(version = "1.1")
    /* renamed from: l */
    public boolean mo45545l() {
        return mo45547u().mo45545l();
    }

    /* access modifiers changed from: protected */
    @C6096e0(version = "1.1")
    /* renamed from: r */
    public C14538b mo45531r() {
        return C14443g1.m62432a(this);
    }

    public String toString() {
        String str;
        C14538b q = mo45619q();
        if (q != this) {
            return q.toString();
        }
        if ("<init>".equals(getName())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(getName());
            sb.append(" (Kotlin reflection is not available)");
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @C6096e0(version = "1.1")
    /* renamed from: u */
    public C14544f m62400u() {
        return (C14544f) super.mo45547u();
    }

    @C6096e0(version = "1.1")
    public C14421c0(int i, Object obj) {
        super(obj);
        this.f42543O = i;
    }
}
