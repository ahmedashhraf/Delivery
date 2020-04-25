package kotlin;

import java.io.Serializable;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.w */
/* compiled from: Tuples.kt */
public final class C14854w<A, B> implements Serializable {

    /* renamed from: a */
    private final A f43095a;

    /* renamed from: b */
    private final B f43096b;

    public C14854w(A a, B b) {
        this.f43095a = a;
        this.f43096b = b;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=A, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=B, for r2v0, types: [java.lang.Object] */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ kotlin.C14854w m65852a(kotlin.C14854w r0, A r1, B r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            A r1 = r0.f43095a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            B r2 = r0.f43096b
        L_0x000c:
            kotlin.w r0 = r0.mo46305a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14854w.m65852a(kotlin.w, java.lang.Object, java.lang.Object, int, java.lang.Object):kotlin.w");
    }

    /* renamed from: a */
    public final A mo46304a() {
        return this.f43095a;
    }

    @C6003d
    /* renamed from: a */
    public final C14854w<A, B> mo46305a(A a, B b) {
        return new C14854w<>(a, b);
    }

    /* renamed from: d */
    public final B mo46306d() {
        return this.f43096b;
    }

    /* renamed from: e */
    public final A mo46307e() {
        return this.f43095a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) r2.f43096b, (java.lang.Object) r3.f43096b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.C14854w
            if (r0 == 0) goto L_0x001d
            kotlin.w r3 = (kotlin.C14854w) r3
            A r0 = r2.f43095a
            A r1 = r3.f43095a
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f43096b
            B r3 = r3.f43096b
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14854w.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final B mo46309f() {
        return this.f43096b;
    }

    public int hashCode() {
        A a = this.f43095a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f43096b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f43095a);
        sb.append(", ");
        sb.append(this.f43096b);
        sb.append(')');
        return sb.toString();
    }
}
