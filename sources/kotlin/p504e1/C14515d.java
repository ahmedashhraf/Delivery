package kotlin.p504e1;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.e1.d */
/* compiled from: Ranges.kt */
final class C14515d implements C14517f<Double> {

    /* renamed from: a */
    private final double f42671a;

    /* renamed from: b */
    private final double f42672b;

    public C14515d(double d, double d2) {
        this.f42671a = d;
        this.f42672b = d2;
    }

    /* renamed from: a */
    public boolean mo45699a(double d, double d2) {
        return d <= d2;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45694a(Comparable comparable) {
        return mo45698a(((Number) comparable).doubleValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5.f42672b == r6.f42672b) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.p504e1.C14515d
            if (r0 == 0) goto L_0x0027
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.e1.d r0 = (kotlin.p504e1.C14515d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
        L_0x0013:
            double r0 = r5.f42671a
            kotlin.e1.d r6 = (kotlin.p504e1.C14515d) r6
            double r2 = r6.f42671a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            double r0 = r5.f42672b
            double r2 = r6.f42672b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
        L_0x0025:
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14515d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f42671a).hashCode() * 31) + Double.valueOf(this.f42672b).hashCode();
    }

    public boolean isEmpty() {
        return this.f42671a > this.f42672b;
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f42671a);
        sb.append("..");
        sb.append(this.f42672b);
        return sb.toString();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45700a(Comparable comparable, Comparable comparable2) {
        return mo45699a(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @C6003d
    /* renamed from: b */
    public Double m62840b() {
        return Double.valueOf(this.f42671a);
    }

    @C6003d
    /* renamed from: c */
    public Double m62842c() {
        return Double.valueOf(this.f42672b);
    }

    /* renamed from: a */
    public boolean mo45698a(double d) {
        return d >= this.f42671a && d <= this.f42672b;
    }
}
