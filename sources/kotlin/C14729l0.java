package kotlin;

import java.io.Serializable;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.l0 */
/* compiled from: Tuples.kt */
public final class C14729l0<A, B, C> implements Serializable {

    /* renamed from: N */
    private final C f42978N;

    /* renamed from: a */
    private final A f42979a;

    /* renamed from: b */
    private final B f42980b;

    public C14729l0(A a, B b, C c) {
        this.f42979a = a;
        this.f42980b = b;
        this.f42978N = c;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=A, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=B, for r2v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=C, for r3v0, types: [java.lang.Object] */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ kotlin.C14729l0 m63861a(kotlin.C14729l0 r0, A r1, B r2, C r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            A r1 = r0.f42979a
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            B r2 = r0.f42980b
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            C r3 = r0.f42978N
        L_0x0012:
            kotlin.l0 r0 = r0.mo45987a(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14729l0.m63861a(kotlin.l0, java.lang.Object, java.lang.Object, java.lang.Object, int, java.lang.Object):kotlin.l0");
    }

    /* renamed from: a */
    public final A mo45986a() {
        return this.f42979a;
    }

    @C6003d
    /* renamed from: a */
    public final C14729l0<A, B, C> mo45987a(A a, B b, C c) {
        return new C14729l0<>(a, b, c);
    }

    /* renamed from: d */
    public final B mo45988d() {
        return this.f42980b;
    }

    /* renamed from: e */
    public final C mo45989e() {
        return this.f42978N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) r2.f42978N, (java.lang.Object) r3.f42978N) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof kotlin.C14729l0
            if (r0 == 0) goto L_0x0027
            kotlin.l0 r3 = (kotlin.C14729l0) r3
            A r0 = r2.f42979a
            A r1 = r3.f42979a
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f42980b
            B r1 = r3.f42980b
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f42978N
            C r3 = r3.f42978N
            boolean r3 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14729l0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final A mo45991f() {
        return this.f42979a;
    }

    /* renamed from: g */
    public final B mo45992g() {
        return this.f42980b;
    }

    /* renamed from: h */
    public final C mo45993h() {
        return this.f42978N;
    }

    public int hashCode() {
        A a = this.f42979a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f42980b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f42978N;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f42979a);
        String str = ", ";
        sb.append(str);
        sb.append(this.f42980b);
        sb.append(str);
        sb.append(this.f42978N);
        sb.append(')');
        return sb.toString();
    }
}
