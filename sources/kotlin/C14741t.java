package kotlin;

import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14489v;
import kotlin.p214b1.p216u.C14495y;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.t */
/* compiled from: Numbers.kt */
class C14741t extends C14740s {
    @C6041f
    /* renamed from: a */
    private static final boolean m63913a(double d) {
        return !Double.isInfinite(d) && !Double.isNaN(d);
    }

    @C6041f
    /* renamed from: b */
    private static final boolean m63915b(double d) {
        return Double.isInfinite(d);
    }

    @C6041f
    /* renamed from: c */
    private static final boolean m63917c(double d) {
        return Double.isNaN(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final long m63920d(double d) {
        return Double.doubleToLongBits(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final long m63922e(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @C6041f
    /* renamed from: a */
    private static final boolean m63914a(float f) {
        return !Float.isInfinite(f) && !Float.isNaN(f);
    }

    @C6041f
    /* renamed from: b */
    private static final boolean m63916b(float f) {
        return Float.isInfinite(f);
    }

    @C6041f
    /* renamed from: c */
    private static final boolean m63918c(float f) {
        return Float.isNaN(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final int m63919d(float f) {
        return Float.floatToIntBits(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final int m63921e(float f) {
        return Float.floatToRawIntBits(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final double m63911a(@C6003d C14489v vVar, long j) {
        return Double.longBitsToDouble(j);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final float m63912a(@C6003d C14495y yVar, int i) {
        return Float.intBitsToFloat(i);
    }
}
