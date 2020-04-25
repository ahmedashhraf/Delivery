package kotlin.p213a1;

import kotlin.C6050b0;

/* renamed from: kotlin.a1.m */
/* compiled from: progressionUtil.kt */
public final class C14403m {
    /* renamed from: a */
    private static final int m62372a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    @C6050b0
    /* renamed from: b */
    public static final int m62376b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i2 - m62373a(i2, i, i3);
        }
        if (i3 < 0) {
            return i2 + m62373a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: a */
    private static final long m62374a(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    /* renamed from: a */
    private static final int m62373a(int i, int i2, int i3) {
        return m62372a(m62372a(i, i3) - m62372a(i2, i3), i3);
    }

    /* renamed from: a */
    private static final long m62375a(long j, long j2, long j3) {
        return m62374a(m62374a(j, j3) - m62374a(j2, j3), j3);
    }

    @C6050b0
    /* renamed from: b */
    public static final long m62377b(long j, long j2, long j3) {
        if (j3 > 0) {
            return j2 - m62375a(j2, j, j3);
        }
        if (j3 < 0) {
            return j2 + m62375a(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
