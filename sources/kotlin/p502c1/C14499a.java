package kotlin.p502c1;

import kotlin.C6096e0;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14489v;
import kotlin.p214b1.p216u.C14495y;

@C6055e(name = "MathKt")
/* renamed from: kotlin.c1.a */
/* compiled from: MathJVM.kt */
public final class C14499a {

    /* renamed from: a */
    public static final double f42641a = 3.141592653589793d;

    /* renamed from: b */
    public static final double f42642b = 2.718281828459045d;

    /* renamed from: c */
    private static final double f42643c = Math.log(2.0d);

    /* renamed from: d */
    private static final double f42644d = Math.ulp(1.0d);

    /* renamed from: e */
    private static final double f42645e = Math.sqrt(f42644d);

    /* renamed from: f */
    private static final double f42646f = Math.sqrt(f42645e);

    /* renamed from: g */
    private static final double f42647g;

    /* renamed from: h */
    private static final double f42648h;

    static {
        double d = (double) 1;
        double d2 = f42645e;
        Double.isNaN(d);
        f42647g = d / d2;
        double d3 = f42646f;
        Double.isNaN(d);
        f42648h = d / d3;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: A */
    private static final double m62699A(double d) {
        return Math.signum(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: B */
    public static /* synthetic */ void m62701B(double d) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: B */
    public static /* synthetic */ void m62702B(float f) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: C */
    private static final double m62703C(double d) {
        return Math.sin(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: D */
    private static final double m62705D(double d) {
        return Math.sinh(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: E */
    private static final double m62707E(double d) {
        return Math.sqrt(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: F */
    private static final double m62709F(double d) {
        return Math.tan(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: G */
    private static final double m62711G(double d) {
        return Math.tanh(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: H */
    public static final double m62713H(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return d;
        }
        if (d > ((double) 0)) {
            return Math.floor(d);
        }
        return Math.ceil(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: I */
    public static /* synthetic */ void m62715I(double d) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: I */
    public static /* synthetic */ void m62716I(float f) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final double m62717a(double d) {
        return Math.abs(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: a */
    public static /* synthetic */ void m62727a() {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final double m62728b(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @C6096e0(version = "1.2")
    /* renamed from: b */
    public static /* synthetic */ void m62734b() {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    public static /* synthetic */ void m62735b(double d) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    public static /* synthetic */ void m62736b(float f) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    public static /* synthetic */ void m62737b(int i) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    public static /* synthetic */ void m62738b(long j) {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final double m62739c(double d) {
        return Math.acos(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: d */
    public static final double m62745d(double d) {
        double d2 = (double) 1;
        if (d < d2) {
            return C14489v.f42623f.mo45652d();
        }
        if (d > f42647g) {
            return Math.log(d) + f42643c;
        }
        Double.isNaN(d2);
        double d3 = d - d2;
        if (d3 >= f42646f) {
            double d4 = d * d;
            Double.isNaN(d2);
            return Math.log(d + Math.sqrt(d4 - d2));
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= f42645e) {
            double d5 = sqrt * sqrt * sqrt;
            double d6 = (double) 12;
            Double.isNaN(d6);
            sqrt -= d5 / d6;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    /* renamed from: d */
    public static final int m62749d(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: d */
    public static final int m62750d(long j) {
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final double m62751e(double d) {
        return Math.asin(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: e */
    public static /* synthetic */ void m62755e(int i) {
    }

    @C6096e0(version = "1.2")
    /* renamed from: e */
    public static /* synthetic */ void m62756e(long j) {
    }

    @C6096e0(version = "1.2")
    /* renamed from: f */
    public static final double m62757f(double d) {
        double d2 = f42646f;
        if (d >= d2) {
            if (d <= f42648h) {
                double d3 = d * d;
                double d4 = (double) 1;
                Double.isNaN(d4);
                return Math.log(d + Math.sqrt(d3 + d4));
            } else if (d > f42647g) {
                return Math.log(d) + f42643c;
            } else {
                double d5 = (double) 2;
                Double.isNaN(d5);
                double d6 = d * d5;
                double d7 = (double) 1;
                Double.isNaN(d7);
                return Math.log(d6 + (d7 / d6));
            }
        } else if (d <= (-d2)) {
            return -m62757f(-d);
        } else {
            if (Math.abs(d) < f42645e) {
                return d;
            }
            double d8 = d * d * d;
            double d9 = (double) 6;
            Double.isNaN(d9);
            return d - (d8 / d9);
        }
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: g */
    private static final double m62761g(double d) {
        return Math.atan(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: h */
    public static final double m62765h(double d) {
        if (Math.abs(d) < f42646f) {
            if (Math.abs(d) > f42645e) {
                double d2 = d * d * d;
                double d3 = (double) 3;
                Double.isNaN(d3);
                d += d2 / d3;
            }
            return d;
        }
        double d4 = (double) 1;
        Double.isNaN(d4);
        double d5 = d4 + d;
        Double.isNaN(d4);
        double log = Math.log(d5 / (d4 - d));
        double d6 = (double) 2;
        Double.isNaN(d6);
        return log / d6;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: i */
    private static final double m62769i(double d) {
        return Math.ceil(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: j */
    private static final double m62773j(double d) {
        return Math.cos(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: k */
    private static final double m62775k(double d) {
        return Math.cosh(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: l */
    private static final double m62777l(double d) {
        return Math.exp(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: m */
    private static final double m62779m(double d) {
        return Math.expm1(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: n */
    private static final double m62781n(double d) {
        return Math.floor(d);
    }

    /* renamed from: o */
    private static final double m62783o(double d) {
        return Math.abs(d);
    }

    /* renamed from: p */
    private static final double m62785p(double d) {
        return Math.signum(d);
    }

    /* renamed from: q */
    private static final double m62787q(double d) {
        return Math.ulp(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: r */
    private static final double m62789r(double d) {
        return Math.log(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: s */
    private static final double m62791s(double d) {
        return Math.log1p(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: t */
    private static final double m62793t(double d) {
        return Math.log10(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: u */
    public static final double m62795u(double d) {
        return Math.log(d) / f42643c;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: v */
    private static final double m62797v(double d) {
        return Math.nextAfter(d, C14489v.f42623f.mo45651c());
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: w */
    private static final double m62799w(double d) {
        return Math.nextUp(d);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: x */
    private static final double m62801x(double d) {
        return Math.rint(d);
    }

    @C6096e0(version = "1.2")
    /* renamed from: y */
    public static final int m62803y(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > ((double) Integer.MAX_VALUE)) {
            return Integer.MAX_VALUE;
        } else {
            if (d < ((double) Integer.MIN_VALUE)) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    @C6096e0(version = "1.2")
    /* renamed from: z */
    public static final long m62805z(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: A */
    private static final float m62700A(float f) {
        return Math.signum(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: C */
    private static final float m62704C(float f) {
        return (float) Math.sin((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: D */
    private static final float m62706D(float f) {
        return (float) Math.sinh((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: E */
    private static final float m62708E(float f) {
        return (float) Math.sqrt((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: F */
    private static final float m62710F(float f) {
        return (float) Math.tan((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: G */
    private static final float m62712G(float f) {
        return (float) Math.tanh((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final double m62719a(double d, int i) {
        return Math.pow(d, (double) i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final double m62729b(double d, int i) {
        return Math.copySign(d, (double) i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final double m62740c(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final double m62752e(double d, double d2) {
        return Math.max(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: g */
    private static final double m62762g(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: i */
    private static final double m62770i(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: j */
    private static final float m62774j(float f) {
        return (float) Math.cos((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: k */
    private static final float m62776k(float f) {
        return (float) Math.cosh((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: l */
    private static final float m62778l(float f) {
        return (float) Math.exp((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: m */
    private static final float m62780m(float f) {
        return (float) Math.expm1((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: n */
    private static final float m62782n(float f) {
        return (float) Math.floor((double) f);
    }

    /* renamed from: o */
    private static final float m62784o(float f) {
        return Math.abs(f);
    }

    /* renamed from: p */
    private static final float m62786p(float f) {
        return Math.signum(f);
    }

    /* renamed from: q */
    private static final float m62788q(float f) {
        return Math.ulp(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: r */
    private static final float m62790r(float f) {
        return (float) Math.log((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: s */
    private static final float m62792s(float f) {
        return (float) Math.log1p((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: t */
    private static final float m62794t(float f) {
        return (float) Math.log10((double) f);
    }

    @C6096e0(version = "1.2")
    /* renamed from: u */
    public static final float m62796u(float f) {
        return (float) (Math.log((double) f) / f42643c);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: v */
    private static final float m62798v(float f) {
        return Math.nextAfter(f, C14489v.f42623f.mo45651c());
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: w */
    private static final float m62800w(float f) {
        return Math.nextUp(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: x */
    private static final float m62802x(float f) {
        return (float) Math.rint((double) f);
    }

    @C6096e0(version = "1.2")
    /* renamed from: z */
    public static final long m62806z(float f) {
        return m62805z((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final double m62718a(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final float m62730b(float f, float f2) {
        return (float) Math.atan2((double) f, (double) f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final float m62741c(float f) {
        return (float) Math.acos((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final float m62753e(float f) {
        return (float) Math.asin((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: g */
    private static final float m62763g(float f) {
        return (float) Math.atan((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: i */
    private static final float m62771i(float f) {
        return (float) Math.ceil((double) f);
    }

    @C6096e0(version = "1.2")
    /* renamed from: H */
    public static final float m62714H(float f) {
        double d;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > ((float) 0)) {
            d = Math.floor((double) f);
        } else {
            d = Math.ceil((double) f);
        }
        return (float) d;
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final float m62720a(float f) {
        return Math.abs(f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final float m62731b(float f, int i) {
        return Math.copySign(f, (float) i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final float m62742c(float f, float f2) {
        return (float) Math.hypot((double) f, (double) f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: e */
    private static final float m62754e(float f, float f2) {
        return Math.max(f, f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: g */
    private static final float m62764g(float f, float f2) {
        return Math.nextAfter(f, (double) f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: i */
    private static final float m62772i(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @C6096e0(version = "1.2")
    /* renamed from: y */
    public static final int m62804y(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final float m62722a(float f, int i) {
        return (float) Math.pow((double) f, (double) i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final int m62732b(int i, int i2) {
        return Math.min(i, i2);
    }

    /* renamed from: c */
    private static final int m62743c(int i) {
        return Math.abs(i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: h */
    private static final double m62766h(double d, double d2) {
        return Math.pow(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final float m62721a(float f, float f2) {
        return (float) Math.IEEEremainder((double) f, (double) f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: b */
    private static final long m62733b(long j, long j2) {
        return Math.min(j, j2);
    }

    /* renamed from: c */
    private static final long m62744c(long j) {
        return Math.abs(j);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: h */
    private static final float m62767h(float f) {
        return (float) m62765h((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final int m62723a(int i) {
        return Math.abs(i);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: h */
    private static final float m62768h(float f, float f2) {
        return (float) Math.pow((double) f, (double) f2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final int m62724a(int i, int i2) {
        return Math.max(i, i2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final long m62725a(long j) {
        return Math.abs(j);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final long m62726a(long j, long j2) {
        return Math.max(j, j2);
    }

    @C6096e0(version = "1.2")
    /* renamed from: d */
    public static final double m62746d(double d, double d2) {
        if (d2 <= 0.0d || d2 == 1.0d) {
            return C14489v.f42623f.mo45652d();
        }
        return Math.log(d) / Math.log(d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: f */
    private static final double m62758f(double d, double d2) {
        return Math.min(d, d2);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: f */
    private static final float m62759f(float f) {
        return (float) m62757f((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: d */
    private static final float m62747d(float f) {
        return (float) m62745d((double) f);
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: f */
    private static final float m62760f(float f, float f2) {
        return Math.min(f, f2);
    }

    @C6096e0(version = "1.2")
    /* renamed from: d */
    public static final float m62748d(float f, float f2) {
        if (f2 <= 0.0f || f2 == 1.0f) {
            return C14495y.f42636f.mo45667d();
        }
        return (float) (Math.log((double) f) / Math.log((double) f2));
    }
}
