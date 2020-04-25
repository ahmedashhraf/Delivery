package p076c.p082c.p083a.p084a0;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: c.c.a.a0.e */
/* compiled from: LogTime */
public final class C2212e {

    /* renamed from: a */
    private static final double f8763a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f8763a = d;
    }

    private C2212e() {
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m11320a() {
        if (17 <= VERSION.SDK_INT) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static double m11319a(long j) {
        double a = (double) (m11320a() - j);
        double d = f8763a;
        Double.isNaN(a);
        return a * d;
    }
}
