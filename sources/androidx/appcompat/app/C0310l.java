package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.l */
/* compiled from: TwilightCalculator */
class C0310l {

    /* renamed from: d */
    private static C0310l f929d = null;

    /* renamed from: e */
    public static final int f930e = 0;

    /* renamed from: f */
    public static final int f931f = 1;

    /* renamed from: g */
    private static final float f932g = 0.017453292f;

    /* renamed from: h */
    private static final float f933h = 9.0E-4f;

    /* renamed from: i */
    private static final float f934i = -0.10471976f;

    /* renamed from: j */
    private static final float f935j = 0.0334196f;

    /* renamed from: k */
    private static final float f936k = 3.49066E-4f;

    /* renamed from: l */
    private static final float f937l = 5.236E-6f;

    /* renamed from: m */
    private static final float f938m = 0.4092797f;

    /* renamed from: n */
    private static final long f939n = 946728000000L;

    /* renamed from: a */
    public long f940a;

    /* renamed from: b */
    public long f941b;

    /* renamed from: c */
    public int f942c;

    C0310l() {
    }

    /* renamed from: a */
    static C0310l m1596a() {
        if (f929d == null) {
            f929d = new C0310l();
        }
        return f929d;
    }

    /* renamed from: a */
    public void mo1106a(long j, double d, double d2) {
        float f = ((float) (j - f939n)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = sin + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - f933h);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + f933h);
        Double.isNaN(round);
        double sin3 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin2) * -0.0069d);
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f942c = 1;
            this.f940a = -1;
            this.f941b = -1;
        } else if (sin4 <= -1.0d) {
            this.f942c = 0;
            this.f940a = -1;
            this.f941b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin4) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f940a = Math.round((sin3 + acos) * 8.64E7d) + f939n;
            Double.isNaN(acos);
            this.f941b = Math.round((sin3 - acos) * 8.64E7d) + f939n;
            if (this.f941b >= j || this.f940a <= j) {
                this.f942c = 1;
            } else {
                this.f942c = 0;
            }
        }
    }
}
