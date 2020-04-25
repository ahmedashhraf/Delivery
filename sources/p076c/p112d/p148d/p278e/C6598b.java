package p076c.p112d.p148d.p278e;

import com.google.common.base.C7397x;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6621a;

@C2776b(emulated = true)
/* renamed from: c.d.d.e.b */
/* compiled from: DoubleMath */
public final class C6598b {

    /* renamed from: a */
    private static final double f18335a = -2.147483648E9d;

    /* renamed from: b */
    private static final double f18336b = 2.147483647E9d;

    /* renamed from: c */
    private static final double f18337c = -9.223372036854776E18d;

    /* renamed from: d */
    private static final double f18338d = 9.223372036854776E18d;

    /* renamed from: e */
    private static final double f18339e = Math.log(2.0d);
    @C2778d

    /* renamed from: f */
    static final int f18340f = 170;
    @C2778d

    /* renamed from: g */
    static final double[] f18341g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: c.d.d.e.b$a */
    /* compiled from: DoubleMath */
    static /* synthetic */ class C6599a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18342a = new int[RoundingMode.values().length];

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
                f18342a = r0
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f18342a     // Catch:{ NoSuchFieldError -> 0x0062 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p278e.C6598b.C6599a.<clinit>():void");
        }
    }

    @C2777c("com.google.common.math.DoubleUtils")
    /* renamed from: c.d.d.e.b$b */
    /* compiled from: DoubleMath */
    private static final class C6600b {

        /* renamed from: a */
        private long f18343a;

        /* renamed from: b */
        private double f18344b;

        private C6600b() {
            this.f18343a = 0;
            this.f18344b = C6598b.f18339e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26528a(double d) {
            C7397x.m35670a(C6601c.m31367d(d));
            this.f18343a++;
            double d2 = this.f18344b;
            double d3 = d - d2;
            double d4 = (double) this.f18343a;
            Double.isNaN(d4);
            this.f18344b = d2 + (d3 / d4);
        }

        /* synthetic */ C6600b(C6599a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public double mo26527a() {
            C7397x.m35671a(this.f18343a > 0, (Object) "Cannot take mean of 0 values");
            return this.f18344b;
        }
    }

    private C6598b() {
    }

    @C2777c("java.lang.Math.getExponent, com.google.common.math.DoubleUtils")
    /* renamed from: a */
    public static int m31351a(double d, RoundingMode roundingMode) {
        boolean z;
        boolean z2 = false;
        C7397x.m35671a(d > f18339e && C6601c.m31367d(d), (Object) "x must be positive and finite");
        int b = C6601c.m31365b(d);
        if (!C6601c.m31368e(d)) {
            return m31351a(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C6599a.f18342a[roundingMode.ordinal()]) {
            case 1:
                C6606f.m31419c(m31354b(d));
                break;
            case 2:
                break;
            case 3:
                z2 = !m31354b(d);
                break;
            case 4:
                if (b < 0) {
                    z2 = true;
                }
                z = m31354b(d);
                break;
            case 5:
                if (b >= 0) {
                    z2 = true;
                }
                z = m31354b(d);
                break;
            case 6:
            case 7:
            case 8:
                double h = C6601c.m31371h(d);
                if (h * h > 2.0d) {
                    z2 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        z2 &= !z;
        if (z2) {
            b++;
        }
        return b;
    }

    @C2777c("#isMathematicalInteger, com.google.common.math.DoubleUtils")
    /* renamed from: b */
    static double m31353b(double d, RoundingMode roundingMode) {
        if (C6601c.m31367d(d)) {
            switch (C6599a.f18342a[roundingMode.ordinal()]) {
                case 1:
                    C6606f.m31419c(m31352a(d));
                    return d;
                case 2:
                    if (d < f18339e && !m31352a(d)) {
                        d -= 1.0d;
                    }
                    return d;
                case 3:
                    if (d > f18339e && !m31352a(d)) {
                        d += 1.0d;
                    }
                    return d;
                case 4:
                    break;
                case 5:
                    if (!m31352a(d)) {
                        d += C6601c.m31363a(1.0d, d);
                        break;
                    } else {
                        return d;
                    }
                case 6:
                    return Math.rint(d);
                case 7:
                    double rint = Math.rint(d);
                    return Math.abs(d - rint) == 0.5d ? d + C6601c.m31363a(0.5d, d) : rint;
                case 8:
                    double rint2 = Math.rint(d);
                    return Math.abs(d - rint2) == 0.5d ? d : rint2;
                default:
                    throw new AssertionError();
            }
            return d;
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    @C2777c("#roundIntermediate, java.lang.Math.getExponent, com.google.common.math.DoubleUtils")
    /* renamed from: c */
    public static BigInteger m31357c(double d, RoundingMode roundingMode) {
        double b = m31353b(d, roundingMode);
        boolean z = true;
        boolean z2 = f18337c - b < 1.0d;
        if (b >= f18338d) {
            z = false;
        }
        if (z && z2) {
            return BigInteger.valueOf((long) b);
        }
        BigInteger shiftLeft = BigInteger.valueOf(C6601c.m31366c(b)).shiftLeft(C6601c.m31365b(b) - 52);
        if (b < f18339e) {
            shiftLeft = shiftLeft.negate();
        }
        return shiftLeft;
    }

    @C2777c("#roundIntermediate")
    /* renamed from: d */
    public static int m31358d(double d, RoundingMode roundingMode) {
        double b = m31353b(d, roundingMode);
        boolean z = true;
        boolean z2 = b > -2.147483649E9d;
        if (b >= 2.147483648E9d) {
            z = false;
        }
        C6606f.m31414a(z & z2);
        return (int) b;
    }

    @C2777c("#roundIntermediate")
    /* renamed from: e */
    public static long m31359e(double d, RoundingMode roundingMode) {
        double b = m31353b(d, roundingMode);
        boolean z = true;
        boolean z2 = f18337c - b < 1.0d;
        if (b >= f18338d) {
            z = false;
        }
        C6606f.m31414a(z & z2);
        return (long) b;
    }

    /* renamed from: c */
    public static double m31356c(double d) {
        return Math.log(d) / f18339e;
    }

    @C2777c("java.lang.Math.getExponent, com.google.common.math.DoubleUtils")
    /* renamed from: a */
    public static boolean m31352a(double d) {
        return C6601c.m31367d(d) && (d == f18339e || 52 - Long.numberOfTrailingZeros(C6601c.m31366c(d)) <= C6601c.m31365b(d));
    }

    /* renamed from: a */
    public static double m31344a(int i) {
        C6606f.m31411a("n", i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        int i2 = i & -16;
        while (true) {
            i2++;
            if (i2 > i) {
                return d * f18341g[i >> 4];
            }
            double d2 = (double) i2;
            Double.isNaN(d2);
            d *= d2;
        }
    }

    /* renamed from: a */
    public static int m31350a(double d, double d2, double d3) {
        if (m31355b(d, d2, d3)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return C6621a.m31533a(Double.isNaN(d), Double.isNaN(d2));
    }

    @C2777c("com.google.common.math.DoubleUtils")
    /* renamed from: b */
    public static boolean m31354b(double d) {
        return d > f18339e && C6601c.m31367d(d) && C6604e.m31401b(C6601c.m31366c(d));
    }

    /* renamed from: b */
    public static boolean m31355b(double d, double d2, double d3) {
        C6606f.m31410a("tolerance", d3);
        return C6601c.m31363a(d - d2, 1.0d) <= d3 || d == d2 || (Double.isNaN(d) && Double.isNaN(d2));
    }

    @C2777c("MeanAccumulator")
    /* renamed from: a */
    public static double m31347a(double... dArr) {
        C6600b bVar = new C6600b(null);
        for (double a : dArr) {
            bVar.mo26528a(a);
        }
        return bVar.mo26527a();
    }

    @C2777c("MeanAccumulator")
    /* renamed from: a */
    public static double m31348a(int... iArr) {
        C6600b bVar = new C6600b(null);
        for (int i : iArr) {
            bVar.mo26528a((double) i);
        }
        return bVar.mo26527a();
    }

    @C2777c("MeanAccumulator")
    /* renamed from: a */
    public static double m31349a(long... jArr) {
        C6600b bVar = new C6600b(null);
        for (long j : jArr) {
            bVar.mo26528a((double) j);
        }
        return bVar.mo26527a();
    }

    @C2777c("MeanAccumulator")
    /* renamed from: a */
    public static double m31345a(Iterable<? extends Number> iterable) {
        C6600b bVar = new C6600b(null);
        for (Number doubleValue : iterable) {
            bVar.mo26528a(doubleValue.doubleValue());
        }
        return bVar.mo26527a();
    }

    @C2777c("MeanAccumulator")
    /* renamed from: a */
    public static double m31346a(Iterator<? extends Number> it) {
        C6600b bVar = new C6600b(null);
        while (it.hasNext()) {
            bVar.mo26528a(((Number) it.next()).doubleValue());
        }
        return bVar.mo26527a();
    }
}
