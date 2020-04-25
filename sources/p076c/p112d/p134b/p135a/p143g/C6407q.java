package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;

/* renamed from: c.d.b.a.g.q */
/* compiled from: ExponentialBackOff */
public class C6407q implements C6365c {

    /* renamed from: l */
    public static final int f17847l = 500;

    /* renamed from: m */
    public static final double f17848m = 0.5d;

    /* renamed from: n */
    public static final double f17849n = 1.5d;

    /* renamed from: o */
    public static final int f17850o = 60000;

    /* renamed from: p */
    public static final int f17851p = 900000;

    /* renamed from: d */
    private int f17852d;

    /* renamed from: e */
    private final int f17853e;

    /* renamed from: f */
    private final double f17854f;

    /* renamed from: g */
    private final double f17855g;

    /* renamed from: h */
    private final int f17856h;

    /* renamed from: i */
    long f17857i;

    /* renamed from: j */
    private final int f17858j;

    /* renamed from: k */
    private final C6368c0 f17859k;

    /* renamed from: c.d.b.a.g.q$a */
    /* compiled from: ExponentialBackOff */
    public static class C6408a {

        /* renamed from: a */
        int f17860a = 500;

        /* renamed from: b */
        double f17861b = 0.5d;

        /* renamed from: c */
        double f17862c = 1.5d;

        /* renamed from: d */
        int f17863d = 60000;

        /* renamed from: e */
        int f17864e = 900000;

        /* renamed from: f */
        C6368c0 f17865f = C6368c0.f17784a;

        /* renamed from: a */
        public C6407q mo25814a() {
            return new C6407q(this);
        }

        /* renamed from: b */
        public final int mo25815b() {
            return this.f17860a;
        }

        /* renamed from: c */
        public C6408a mo25819c(int i) {
            this.f17863d = i;
            return this;
        }

        /* renamed from: d */
        public final int mo25820d() {
            return this.f17863d;
        }

        /* renamed from: e */
        public final double mo25821e() {
            return this.f17862c;
        }

        /* renamed from: f */
        public final C6368c0 mo25822f() {
            return this.f17865f;
        }

        /* renamed from: g */
        public final double mo25823g() {
            return this.f17861b;
        }

        /* renamed from: a */
        public C6408a mo25812a(int i) {
            this.f17860a = i;
            return this;
        }

        /* renamed from: b */
        public C6408a mo25816b(double d) {
            this.f17861b = d;
            return this;
        }

        /* renamed from: c */
        public final int mo25818c() {
            return this.f17864e;
        }

        /* renamed from: a */
        public C6408a mo25811a(double d) {
            this.f17862c = d;
            return this;
        }

        /* renamed from: b */
        public C6408a mo25817b(int i) {
            this.f17864e = i;
            return this;
        }

        /* renamed from: a */
        public C6408a mo25813a(C6368c0 c0Var) {
            this.f17865f = (C6368c0) C6381h0.m29663a(c0Var);
            return this;
        }
    }

    public C6407q() {
        this(new C6408a());
    }

    /* renamed from: i */
    private void m29740i() {
        int i = this.f17852d;
        double d = (double) i;
        int i2 = this.f17856h;
        double d2 = (double) i2;
        double d3 = this.f17855g;
        Double.isNaN(d2);
        if (d >= d2 / d3) {
            this.f17852d = i2;
            return;
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        this.f17852d = (int) (d4 * d3);
    }

    /* renamed from: a */
    public long mo25702a() throws IOException {
        if (mo25805c() > ((long) this.f17858j)) {
            return -1;
        }
        int a = m29739a(this.f17854f, Math.random(), this.f17852d);
        m29740i();
        return (long) a;
    }

    /* renamed from: b */
    public final int mo25804b() {
        return this.f17852d;
    }

    /* renamed from: c */
    public final long mo25805c() {
        return (this.f17859k.mo25750b() - this.f17857i) / 1000000;
    }

    /* renamed from: d */
    public final int mo25806d() {
        return this.f17853e;
    }

    /* renamed from: e */
    public final int mo25807e() {
        return this.f17858j;
    }

    /* renamed from: f */
    public final int mo25808f() {
        return this.f17856h;
    }

    /* renamed from: g */
    public final double mo25809g() {
        return this.f17855g;
    }

    /* renamed from: h */
    public final double mo25810h() {
        return this.f17854f;
    }

    public final void reset() {
        this.f17852d = this.f17853e;
        this.f17857i = this.f17859k.mo25750b();
    }

    protected C6407q(C6408a aVar) {
        this.f17853e = aVar.f17860a;
        this.f17854f = aVar.f17861b;
        this.f17855g = aVar.f17862c;
        this.f17856h = aVar.f17863d;
        this.f17858j = aVar.f17864e;
        this.f17859k = aVar.f17865f;
        boolean z = true;
        C6381h0.m29666a(this.f17853e > 0);
        double d = this.f17854f;
        C6381h0.m29666a(0.0d <= d && d < 1.0d);
        C6381h0.m29666a(this.f17855g >= 1.0d);
        C6381h0.m29666a(this.f17856h >= this.f17853e);
        if (this.f17858j <= 0) {
            z = false;
        }
        C6381h0.m29666a(z);
        reset();
    }

    /* renamed from: a */
    static int m29739a(double d, double d2, int i) {
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = d * d3;
        Double.isNaN(d3);
        double d5 = d3 - d4;
        Double.isNaN(d3);
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }
}
