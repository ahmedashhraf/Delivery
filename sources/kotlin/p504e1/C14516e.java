package kotlin.p504e1;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.e1.e */
/* compiled from: Ranges.kt */
final class C14516e implements C14517f<Float> {

    /* renamed from: a */
    private final float f42673a;

    /* renamed from: b */
    private final float f42674b;

    public C14516e(float f, float f2) {
        this.f42673a = f;
        this.f42674b = f2;
    }

    /* renamed from: a */
    public boolean mo45705a(float f, float f2) {
        return f <= f2;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45694a(Comparable comparable) {
        return mo45704a(((Number) comparable).floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2.f42674b == r3.f42674b) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14516e
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.e r0 = (kotlin.p504e1.C14516e) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
        L_0x0013:
            float r0 = r2.f42673a
            kotlin.e1.e r3 = (kotlin.p504e1.C14516e) r3
            float r1 = r3.f42673a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            float r0 = r2.f42674b
            float r3 = r3.f42674b
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14516e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f42673a).hashCode() * 31) + Float.valueOf(this.f42674b).hashCode();
    }

    public boolean isEmpty() {
        return this.f42673a > this.f42674b;
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f42673a);
        sb.append("..");
        sb.append(this.f42674b);
        return sb.toString();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45700a(Comparable comparable, Comparable comparable2) {
        return mo45705a(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @C6003d
    /* renamed from: b */
    public Float m62848b() {
        return Float.valueOf(this.f42673a);
    }

    @C6003d
    /* renamed from: c */
    public Float m62850c() {
        return Float.valueOf(this.f42674b);
    }

    /* renamed from: a */
    public boolean mo45704a(float f) {
        return f >= this.f42673a && f <= this.f42674b;
    }
}
