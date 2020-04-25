package p076c.p112d.p148d.p278e;

import com.google.common.base.C7397x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;

@C2776b(emulated = true)
/* renamed from: c.d.d.e.a */
/* compiled from: BigIntegerMath */
public final class C6596a {
    @C2778d

    /* renamed from: a */
    static final int f18330a = 256;
    @C2778d

    /* renamed from: b */
    static final BigInteger f18331b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: c */
    private static final double f18332c = Math.log(10.0d);

    /* renamed from: d */
    private static final double f18333d = Math.log(2.0d);

    /* renamed from: c.d.d.e.a$a */
    /* compiled from: BigIntegerMath */
    static /* synthetic */ class C6597a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18334a = new int[RoundingMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18334a = r0
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f18334a     // Catch:{ NoSuchFieldError -> 0x0062 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p278e.C6596a.C6597a.<clinit>():void");
        }
    }

    private C6596a() {
    }

    @C2777c("TODO")
    /* renamed from: a */
    public static int m31332a(BigInteger bigInteger, RoundingMode roundingMode) {
        int i;
        C6606f.m31417b("x", bigInteger);
        if (m31338a(bigInteger)) {
            return C6604e.m31390a(bigInteger.longValue(), roundingMode);
        }
        double b = (double) m31339b(bigInteger, RoundingMode.FLOOR);
        double d = f18333d;
        Double.isNaN(b);
        int i2 = (int) ((b * d) / f18332c);
        BigInteger pow = BigInteger.TEN.pow(i2);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                i2--;
                pow = pow.divide(BigInteger.TEN);
                i = pow.compareTo(bigInteger);
            } while (i > 0);
        } else {
            BigInteger multiply = BigInteger.TEN.multiply(pow);
            int compareTo2 = multiply.compareTo(bigInteger);
            BigInteger bigInteger2 = multiply;
            int i3 = compareTo;
            int i4 = compareTo2;
            BigInteger bigInteger3 = bigInteger2;
            while (i4 <= 0) {
                i2++;
                BigInteger multiply2 = BigInteger.TEN.multiply(bigInteger3);
                int compareTo3 = multiply2.compareTo(bigInteger);
                BigInteger bigInteger4 = bigInteger3;
                bigInteger3 = multiply2;
                pow = bigInteger4;
                int i5 = compareTo3;
                i3 = i4;
                i4 = i5;
            }
            i = i3;
        }
        switch (C6597a.f18334a[roundingMode.ordinal()]) {
            case 1:
                C6606f.m31419c(i == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!pow.equals(bigInteger)) {
                    i2++;
                }
                return i2;
            case 6:
            case 7:
            case 8:
                if (bigInteger.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) > 0) {
                    i2++;
                }
                return i2;
            default:
                throw new AssertionError();
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m31340b(BigInteger bigInteger) {
        C7397x.m35664a(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    @C2777c("TODO")
    /* renamed from: c */
    public static BigInteger m31342c(BigInteger bigInteger, RoundingMode roundingMode) {
        C6606f.m31413a("x", bigInteger);
        if (m31338a(bigInteger)) {
            return BigInteger.valueOf(C6604e.m31405c(bigInteger.longValue(), roundingMode));
        }
        BigInteger d = m31343d(bigInteger);
        switch (C6597a.f18334a[roundingMode.ordinal()]) {
            case 1:
                C6606f.m31419c(d.pow(2).equals(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                int intValue = d.intValue();
                if (!(intValue * intValue == bigInteger.intValue() && d.pow(2).equals(bigInteger))) {
                    d = d.add(BigInteger.ONE);
                }
                return d;
            case 6:
            case 7:
            case 8:
                if (d.pow(2).add(d).compareTo(bigInteger) < 0) {
                    d = d.add(BigInteger.ONE);
                }
                return d;
            default:
                throw new AssertionError();
        }
        return d;
    }

    @C2777c("TODO")
    /* renamed from: d */
    private static BigInteger m31343d(BigInteger bigInteger) {
        BigInteger bigInteger2;
        int b = m31339b(bigInteger, RoundingMode.FLOOR);
        if (b < 1023) {
            bigInteger2 = m31341c(bigInteger);
        } else {
            int i = (b - 52) & -2;
            bigInteger2 = m31341c(bigInteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        BigInteger shiftRight = bigInteger2.add(bigInteger.divide(bigInteger2)).shiftRight(1);
        if (bigInteger2.equals(shiftRight)) {
            return bigInteger2;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }

    /* renamed from: b */
    public static int m31339b(BigInteger bigInteger, RoundingMode roundingMode) {
        C6606f.m31417b("x", (BigInteger) C7397x.m35664a(bigInteger));
        int bitLength = bigInteger.bitLength() - 1;
        switch (C6597a.f18334a[roundingMode.ordinal()]) {
            case 1:
                C6606f.m31419c(m31340b(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!m31340b(bigInteger)) {
                    bitLength++;
                }
                return bitLength;
            case 6:
            case 7:
            case 8:
                if (bitLength < 256) {
                    return bigInteger.compareTo(f18331b.shiftRight(256 - bitLength)) <= 0 ? bitLength : bitLength + 1;
                }
                if (bigInteger.pow(2).bitLength() - 1 >= (bitLength * 2) + 1) {
                    bitLength++;
                }
                return bitLength;
            default:
                throw new AssertionError();
        }
        return bitLength;
    }

    @C2777c("TODO")
    /* renamed from: c */
    private static BigInteger m31341c(BigInteger bigInteger) {
        return C6598b.m31357c(Math.sqrt(C6601c.m31364a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @C2777c("TODO")
    /* renamed from: a */
    public static BigInteger m31335a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    /* renamed from: a */
    public static BigInteger m31333a(int i) {
        int i2 = i;
        C6606f.m31411a("n", i2);
        long[] jArr = C6604e.f18367f;
        if (i2 < jArr.length) {
            return BigInteger.valueOf(jArr[i2]);
        }
        ArrayList arrayList = new ArrayList(C6602d.m31374a(C6602d.m31377b(i2, RoundingMode.CEILING) * i2, 64, RoundingMode.CEILING));
        long[] jArr2 = C6604e.f18367f;
        int length = jArr2.length;
        long j = jArr2[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        int b = C6604e.m31399b(j2, RoundingMode.FLOOR) + 1;
        long j3 = (long) length;
        int b2 = C6604e.m31399b(j3, RoundingMode.FLOOR) + 1;
        int i3 = 1 << (b2 - 1);
        while (j3 <= ((long) i2)) {
            if ((((long) i3) & j3) != 0) {
                i3 <<= 1;
                b2++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((b2 - numberOfTrailingZeros2) + b >= 64) {
                arrayList.add(BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            b = C6604e.m31399b(j2, RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(BigInteger.valueOf(j2));
        }
        return m31336a((List<BigInteger>) arrayList).shiftLeft(numberOfTrailingZeros);
    }

    /* renamed from: a */
    static BigInteger m31336a(List<BigInteger> list) {
        return m31337a(list, 0, list.size());
    }

    /* renamed from: a */
    static BigInteger m31337a(List<BigInteger> list, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return BigInteger.ONE;
        }
        if (i3 == 1) {
            return (BigInteger) list.get(i);
        }
        if (i3 == 2) {
            return ((BigInteger) list.get(i)).multiply((BigInteger) list.get(i + 1));
        }
        if (i3 == 3) {
            return ((BigInteger) list.get(i)).multiply((BigInteger) list.get(i + 1)).multiply((BigInteger) list.get(i + 2));
        }
        int i4 = (i2 + i) >>> 1;
        return m31337a(list, i, i4).multiply(m31337a(list, i4, i2));
    }

    /* renamed from: a */
    public static BigInteger m31334a(int i, int i2) {
        C6606f.m31411a("n", i);
        C6606f.m31411a("k", i2);
        int i3 = 1;
        C7397x.m35672a(i2 <= i, "k (%s) > n (%s)", Integer.valueOf(i2), Integer.valueOf(i));
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = C6604e.f18368g;
        if (i2 < iArr.length && i <= iArr[i2]) {
            return BigInteger.valueOf(C6604e.m31392a(i, i2));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j = (long) i;
        long j2 = 1;
        int b = C6604e.m31399b(j, RoundingMode.CEILING);
        while (true) {
            int i4 = b;
            while (i3 < i2) {
                int i5 = i - i3;
                i3++;
                i4 += b;
                if (i4 >= 63) {
                    bigInteger = bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
                    j = (long) i5;
                    j2 = (long) i3;
                } else {
                    j *= (long) i5;
                    j2 *= (long) i3;
                }
            }
            return bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
        }
    }

    @C2777c("TODO")
    /* renamed from: a */
    static boolean m31338a(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }
}
