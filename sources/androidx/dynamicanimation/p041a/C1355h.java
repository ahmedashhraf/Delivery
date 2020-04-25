package androidx.dynamicanimation.p041a;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;

/* renamed from: androidx.dynamicanimation.a.h */
/* compiled from: SpringForce */
public final class C1355h implements C1353f {

    /* renamed from: k */
    public static final float f5318k = 10000.0f;

    /* renamed from: l */
    public static final float f5319l = 1500.0f;

    /* renamed from: m */
    public static final float f5320m = 200.0f;

    /* renamed from: n */
    public static final float f5321n = 50.0f;

    /* renamed from: o */
    public static final float f5322o = 0.2f;

    /* renamed from: p */
    public static final float f5323p = 0.5f;

    /* renamed from: q */
    public static final float f5324q = 0.75f;

    /* renamed from: r */
    public static final float f5325r = 1.0f;

    /* renamed from: s */
    private static final double f5326s = 62.5d;

    /* renamed from: t */
    private static final double f5327t = Double.MAX_VALUE;

    /* renamed from: a */
    double f5328a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f5329b = 0.5d;

    /* renamed from: c */
    private boolean f5330c = false;

    /* renamed from: d */
    private double f5331d;

    /* renamed from: e */
    private double f5332e;

    /* renamed from: f */
    private double f5333f;

    /* renamed from: g */
    private double f5334g;

    /* renamed from: h */
    private double f5335h;

    /* renamed from: i */
    private double f5336i = f5327t;

    /* renamed from: j */
    private final C1344p f5337j = new C1344p();

    public C1355h() {
    }

    /* renamed from: d */
    private void m7142d() {
        if (!this.f5330c) {
            if (this.f5336i != f5327t) {
                double d = this.f5329b;
                if (d > 1.0d) {
                    double d2 = -d;
                    double d3 = this.f5328a;
                    this.f5333f = (d2 * d3) + (d3 * Math.sqrt((d * d) - 1.0d));
                    double d4 = this.f5329b;
                    double d5 = -d4;
                    double d6 = this.f5328a;
                    this.f5334g = (d5 * d6) - (d6 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f5335h = this.f5328a * Math.sqrt(1.0d - (d * d));
                }
                this.f5330c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public C1355h mo5868a(@C0215r(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f5329b = (double) f;
            this.f5330c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: b */
    public C1355h mo5871b(float f) {
        this.f5336i = (double) f;
        return this;
    }

    /* renamed from: c */
    public C1355h mo5873c(@C0215r(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f5328a = Math.sqrt((double) f);
            this.f5330c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: b */
    public float mo5870b() {
        return (float) this.f5336i;
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: b */
    public float mo5858b(float f, float f2) {
        float b = f - mo5870b();
        double d = this.f5328a;
        double d2 = d * d;
        double d3 = d * 2.0d * this.f5329b;
        double d4 = -d2;
        double d5 = (double) b;
        Double.isNaN(d5);
        double d6 = d4 * d5;
        double d7 = (double) f2;
        Double.isNaN(d7);
        return (float) (d6 - (d3 * d7));
    }

    /* renamed from: a */
    public float mo5866a() {
        return (float) this.f5329b;
    }

    /* renamed from: c */
    public float mo5872c() {
        double d = this.f5328a;
        return (float) (d * d);
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public boolean mo5857a(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f5332e && ((double) Math.abs(f - mo5870b())) < this.f5331d;
    }

    public C1355h(float f) {
        this.f5336i = (double) f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1344p mo5867a(double d, double d2, long j) {
        double d3;
        double d4;
        m7142d();
        double d5 = (double) j;
        Double.isNaN(d5);
        double d6 = d5 / 1000.0d;
        double d7 = d - this.f5336i;
        double d8 = this.f5329b;
        if (d8 > 1.0d) {
            double d9 = this.f5334g;
            double d10 = (d9 * d7) - d2;
            double d11 = this.f5333f;
            double d12 = d7 - (d10 / (d9 - d11));
            double d13 = ((d7 * d9) - d2) / (d9 - d11);
            d4 = (Math.pow(2.718281828459045d, d9 * d6) * d12) + (Math.pow(2.718281828459045d, this.f5333f * d6) * d13);
            double d14 = this.f5334g;
            double pow = d12 * d14 * Math.pow(2.718281828459045d, d14 * d6);
            double d15 = this.f5333f;
            d3 = pow + (d13 * d15 * Math.pow(2.718281828459045d, d15 * d6));
        } else if (d8 == 1.0d) {
            double d16 = this.f5328a;
            double d17 = d2 + (d16 * d7);
            double d18 = d7 + (d17 * d6);
            d4 = Math.pow(2.718281828459045d, (-d16) * d6) * d18;
            double pow2 = d18 * Math.pow(2.718281828459045d, (-this.f5328a) * d6);
            double d19 = this.f5328a;
            d3 = (d17 * Math.pow(2.718281828459045d, (-d19) * d6)) + (pow2 * (-d19));
        } else {
            double d20 = 1.0d / this.f5335h;
            double d21 = this.f5328a;
            double d22 = d20 * ((d8 * d21 * d7) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d8) * d21 * d6) * ((Math.cos(this.f5335h * d6) * d7) + (Math.sin(this.f5335h * d6) * d22));
            double d23 = this.f5328a;
            double d24 = (-d23) * pow3;
            double d25 = this.f5329b;
            double d26 = d24 * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d23 * d6);
            double d27 = this.f5335h;
            double d28 = pow3;
            double sin = (-d27) * d7 * Math.sin(d27 * d6);
            double d29 = this.f5335h;
            d3 = d26 + (pow4 * (sin + (d22 * d29 * Math.cos(d29 * d6))));
            d4 = d28;
        }
        C1344p pVar = this.f5337j;
        pVar.f5303a = (float) (d4 + this.f5336i);
        pVar.f5304b = (float) d3;
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5869a(double d) {
        this.f5331d = Math.abs(d);
        this.f5332e = this.f5331d * f5326s;
    }
}
