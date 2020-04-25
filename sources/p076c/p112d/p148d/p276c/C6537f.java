package p076c.p112d.p148d.p276c;

import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.c.f */
/* compiled from: BloomFilter */
public final class C6537f<T> implements C5831y<T>, Serializable {

    /* renamed from: P */
    private static final C6540c f18252P = m31145f();
    @C2778d

    /* renamed from: Q */
    static final String f18253Q = "com.google.common.hash.BloomFilter.useMitz32";
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C6548i<T> f18254N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C6540c f18255O;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6544c f18256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f18257b;

    /* renamed from: c.d.d.c.f$b */
    /* compiled from: BloomFilter */
    private static class C6539b<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: N */
        final C6548i<T> f18258N;

        /* renamed from: O */
        final C6540c f18259O;

        /* renamed from: a */
        final long[] f18260a;

        /* renamed from: b */
        final int f18261b;

        C6539b(C6537f<T> fVar) {
            this.f18260a = fVar.f18256a.f18262a;
            this.f18261b = fVar.f18257b;
            this.f18258N = fVar.f18254N;
            this.f18259O = fVar.f18255O;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            C6537f fVar = new C6537f(new C6544c(this.f18260a), this.f18261b, this.f18258N, this.f18259O);
            return fVar;
        }
    }

    /* renamed from: c.d.d.c.f$c */
    /* compiled from: BloomFilter */
    interface C6540c extends Serializable {
        /* renamed from: a */
        <T> boolean mo26457a(T t, C6548i<? super T> iVar, int i, C6544c cVar);

        /* renamed from: b */
        <T> boolean mo26458b(T t, C6548i<? super T> iVar, int i, C6544c cVar);

        int ordinal();
    }

    private Object writeReplace() {
        return new C6539b(this);
    }

    /* renamed from: a */
    public boolean mo26450a(T t) {
        return this.f18255O.mo26458b(t, this.f18254N, this.f18257b, this.f18256a);
    }

    @Deprecated
    public boolean apply(T t) {
        return mo26450a(t);
    }

    /* renamed from: b */
    public boolean mo26452b(T t) {
        return this.f18255O.mo26457a(t, this.f18254N, this.f18257b, this.f18256a);
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6537f)) {
            return false;
        }
        C6537f fVar = (C6537f) obj;
        if (this.f18257b != fVar.f18257b || !this.f18254N.equals(fVar.f18254N) || !this.f18256a.equals(fVar.f18256a) || !this.f18255O.equals(fVar.f18255O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5827t.m25558a(Integer.valueOf(this.f18257b), this.f18254N, this.f18255O, this.f18256a);
    }

    private C6537f(C6544c cVar, int i, C6548i<T> iVar, C6540c cVar2) {
        C7397x.m35672a(i > 0, "numHashFunctions (%s) must be > 0", Integer.valueOf(i));
        C7397x.m35672a(i <= 255, "numHashFunctions (%s) must be <= 255", Integer.valueOf(i));
        this.f18256a = (C6544c) C7397x.m35664a(cVar);
        this.f18257b = i;
        this.f18254N = (C6548i) C7397x.m35664a(iVar);
        this.f18255O = (C6540c) C7397x.m35664a(cVar2);
    }

    @C2778d
    /* renamed from: f */
    static C6540c m31145f() {
        return Boolean.parseBoolean(System.getProperty(f18253Q)) ? C6541g.MURMUR128_MITZ_32 : C6541g.MURMUR128_MITZ_64;
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: a */
    public long mo26448a() {
        return this.f18256a.mo26463b();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=c.d.d.c.f<T>, code=c.d.d.c.f, for r9v0, types: [c.d.d.c.f<T>, java.lang.Object, c.d.d.c.f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26451b(p076c.p112d.p148d.p276c.C6537f r9) {
        /*
            r8 = this;
            com.google.common.base.C7397x.m35664a(r9)
            r0 = 1
            r1 = 0
            if (r8 == r9) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            java.lang.String r3 = "Cannot combine a BloomFilter with itself."
            com.google.common.base.C7397x.m35671a(r2, r3)
            int r2 = r8.f18257b
            int r3 = r9.f18257b
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r8.f18257b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            int r5 = r9.f18257b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r0] = r5
            java.lang.String r5 = "BloomFilters must have the same number of hash functions (%s != %s)"
            com.google.common.base.C7397x.m35672a(r2, r5, r4)
            long r4 = r8.mo26448a()
            long r6 = r9.mo26448a()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r5 = r8.mo26448a()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r1] = r5
            long r5 = r9.mo26448a()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r0] = r5
            java.lang.String r5 = "BloomFilters must have the same size underlying bit arrays (%s != %s)"
            com.google.common.base.C7397x.m35672a(r2, r5, r4)
            c.d.d.c.f$c r2 = r8.f18255O
            c.d.d.c.f$c r4 = r9.f18255O
            boolean r2 = r2.equals(r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            c.d.d.c.f$c r5 = r8.f18255O
            r4[r1] = r5
            c.d.d.c.f$c r5 = r9.f18255O
            r4[r0] = r5
            java.lang.String r5 = "BloomFilters must have equal strategies (%s != %s)"
            com.google.common.base.C7397x.m35672a(r2, r5, r4)
            c.d.d.c.i<T> r2 = r8.f18254N
            c.d.d.c.i<T> r4 = r9.f18254N
            boolean r2 = r2.equals(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            c.d.d.c.i<T> r4 = r8.f18254N
            r3[r1] = r4
            c.d.d.c.i<T> r1 = r9.f18254N
            r3[r0] = r1
            java.lang.String r0 = "BloomFilters must have equal funnels (%s != %s)"
            com.google.common.base.C7397x.m35672a(r2, r0, r3)
            c.d.d.c.g$c r0 = r8.f18256a
            c.d.d.c.g$c r9 = r9.f18256a
            r0.mo26461a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p276c.C6537f.mo26451b(c.d.d.c.f):void");
    }

    /* renamed from: d */
    public C6537f<T> mo26453d() {
        return new C6537f<>(this.f18256a.mo26465c(), this.f18257b, this.f18254N, this.f18255O);
    }

    /* renamed from: e */
    public double mo26454e() {
        double a = (double) this.f18256a.mo26460a();
        double a2 = (double) mo26448a();
        Double.isNaN(a);
        Double.isNaN(a2);
        return Math.pow(a / a2, (double) this.f18257b);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=c.d.d.c.f<T>, code=c.d.d.c.f, for r6v0, types: [c.d.d.c.f<T>, java.lang.Object, c.d.d.c.f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26449a(p076c.p112d.p148d.p276c.C6537f r6) {
        /*
            r5 = this;
            com.google.common.base.C7397x.m35664a(r6)
            if (r5 == r6) goto L_0x002d
            int r0 = r5.f18257b
            int r1 = r6.f18257b
            if (r0 != r1) goto L_0x002d
            long r0 = r5.mo26448a()
            long r2 = r6.mo26448a()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            c.d.d.c.f$c r0 = r5.f18255O
            c.d.d.c.f$c r1 = r6.f18255O
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002d
            c.d.d.c.i<T> r0 = r5.f18254N
            c.d.d.c.i<T> r6 = r6.f18254N
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p276c.C6537f.mo26449a(c.d.d.c.f):boolean");
    }

    /* renamed from: a */
    public static <T> C6537f<T> m31140a(C6548i<T> iVar, int i, double d) {
        return m31141a(iVar, i, d, f18252P);
    }

    @C2778d
    /* renamed from: a */
    static <T> C6537f<T> m31141a(C6548i<T> iVar, int i, double d, C6540c cVar) {
        C7397x.m35664a(iVar);
        C7397x.m35672a(i >= 0, "Expected insertions (%s) must be >= 0", Integer.valueOf(i));
        C7397x.m35672a(d > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        C7397x.m35672a(d < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        C7397x.m35664a(cVar);
        if (i == 0) {
            i = 1;
        }
        long j = (long) i;
        long a = m31138a(j, d);
        try {
            return new C6537f<>(new C6544c(a), m31137a(j, a), iVar, cVar);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create BloomFilter of ");
            sb.append(a);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static <T> C6537f<T> m31139a(C6548i<T> iVar, int i) {
        return m31140a(iVar, i, 0.03d);
    }

    @C2778d
    /* renamed from: a */
    static int m31137a(long j, long j2) {
        double d = (double) (j2 / j);
        double log = Math.log(2.0d);
        Double.isNaN(d);
        return Math.max(1, (int) Math.round(d * log));
    }

    @C2778d
    /* renamed from: a */
    static long m31138a(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        double d2 = (double) (-j);
        double log = Math.log(d);
        Double.isNaN(d2);
        return (long) ((d2 * log) / (Math.log(2.0d) * Math.log(2.0d)));
    }
}
