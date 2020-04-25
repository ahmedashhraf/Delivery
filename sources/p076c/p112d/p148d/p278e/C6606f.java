package p076c.p112d.p148d.p278e;

import java.math.BigInteger;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: c.d.d.e.f */
/* compiled from: MathPreconditions */
final class C6606f {
    private C6606f() {
    }

    /* renamed from: a */
    static int m31411a(@C5952h String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static int m31415b(@C5952h String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    static void m31419c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* renamed from: a */
    static long m31412a(@C5952h String str, long j) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static long m31416b(@C5952h String str, long j) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static BigInteger m31413a(@C5952h String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(bigInteger);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static BigInteger m31417b(@C5952h String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(bigInteger);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static double m31410a(@C5952h String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(d);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static void m31418b(boolean z) {
        if (!z) {
            throw new ArithmeticException("overflow");
        }
    }

    /* renamed from: a */
    static void m31414a(boolean z) {
        if (!z) {
            throw new ArithmeticException("not in range");
        }
    }
}
