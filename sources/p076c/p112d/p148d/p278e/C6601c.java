package p076c.p112d.p148d.p278e;

import com.google.common.base.C7397x;
import java.math.BigInteger;

/* renamed from: c.d.d.e.c */
/* compiled from: DoubleUtils */
final class C6601c {

    /* renamed from: a */
    static final long f18345a = 4503599627370495L;

    /* renamed from: b */
    static final long f18346b = 9218868437227405312L;

    /* renamed from: c */
    static final long f18347c = Long.MIN_VALUE;

    /* renamed from: d */
    static final int f18348d = 52;

    /* renamed from: e */
    static final int f18349e = 1023;

    /* renamed from: f */
    static final int f18350f = 1023;

    /* renamed from: g */
    static final int f18351g = -1022;

    /* renamed from: h */
    static final long f18352h = 4503599627370496L;

    /* renamed from: i */
    private static final long f18353i = Double.doubleToRawLongBits(1.0d);

    private C6601c() {
    }

    /* renamed from: a */
    static double m31363a(double d, double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & Long.MAX_VALUE) | (Double.doubleToRawLongBits(d2) & Long.MIN_VALUE));
    }

    /* renamed from: b */
    static int m31365b(double d) {
        return ((int) ((Double.doubleToRawLongBits(d) & f18346b) >>> 52)) - 1023;
    }

    /* renamed from: c */
    static long m31366c(double d) {
        C7397x.m35671a(m31367d(d), (Object) "not a normal value");
        int b = m31365b(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & f18345a;
        return b == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | f18352h;
    }

    /* renamed from: d */
    static boolean m31367d(double d) {
        return m31365b(d) <= 1023;
    }

    /* renamed from: e */
    static boolean m31368e(double d) {
        return m31365b(d) >= f18351g;
    }

    /* renamed from: f */
    static double m31369f(double d) {
        return -m31370g(-d);
    }

    /* renamed from: g */
    static double m31370g(double d) {
        if (Double.isNaN(d)) {
            return d;
        }
        if (d == 0.0d) {
            return Double.MIN_VALUE;
        }
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        return Double.longBitsToDouble(doubleToRawLongBits + ((doubleToRawLongBits >> 63) | 1));
    }

    /* renamed from: h */
    static double m31371h(double d) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & f18345a) | f18353i);
    }

    /* renamed from: a */
    static double m31364a(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        boolean z = true;
        int bitLength = abs.bitLength() - 1;
        if (bitLength < 63) {
            return (double) bigInteger.longValue();
        }
        if (bitLength > 1023) {
            double signum = (double) bigInteger.signum();
            Double.isNaN(signum);
            return signum * Double.POSITIVE_INFINITY;
        }
        int i = (bitLength - 52) - 1;
        long longValue = abs.shiftRight(i).longValue();
        long j = (longValue >> 1) & f18345a;
        if ((longValue & 1) == 0 || ((j & 1) == 0 && abs.getLowestSetBit() >= i)) {
            z = false;
        }
        if (z) {
            j++;
        }
        return Double.longBitsToDouble(((((long) (bitLength + 1023)) << 52) + j) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    /* renamed from: a */
    static double m31362a(double d) {
        C7397x.m35670a(!Double.isNaN(d));
        if (d > 0.0d) {
            return d;
        }
        return 0.0d;
    }
}
