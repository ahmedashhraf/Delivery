package androidx.dynamicanimation.p041a;

import androidx.annotation.C0215r;

/* renamed from: androidx.dynamicanimation.a.c */
/* compiled from: FlingAnimation */
public final class C1348c extends C1328b<C1348c> {

    /* renamed from: G */
    private final C1349a f5305G = new C1349a();

    /* renamed from: androidx.dynamicanimation.a.c$a */
    /* compiled from: FlingAnimation */
    static final class C1349a implements C1353f {

        /* renamed from: d */
        private static final float f5306d = -4.2f;

        /* renamed from: e */
        private static final float f5307e = 62.5f;

        /* renamed from: a */
        private float f5308a = f5306d;

        /* renamed from: b */
        private float f5309b;

        /* renamed from: c */
        private final C1344p f5310c = new C1344p();

        C1349a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5856a(float f) {
            this.f5308a = f * f5306d;
        }

        /* renamed from: b */
        public float mo5858b(float f, float f2) {
            return f2 * this.f5308a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo5854a() {
            return this.f5308a / f5306d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5859b(float f) {
            this.f5309b = f * f5307e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1344p mo5855a(float f, float f2, long j) {
            C1344p pVar = this.f5310c;
            double d = (double) f2;
            float f3 = (float) j;
            double exp = Math.exp((double) ((f3 / 1000.0f) * this.f5308a));
            Double.isNaN(d);
            pVar.f5304b = (float) (d * exp);
            C1344p pVar2 = this.f5310c;
            float f4 = this.f5308a;
            double d2 = (double) (f - (f2 / f4));
            double d3 = (double) (f2 / f4);
            double exp2 = Math.exp((double) ((f4 * f3) / 1000.0f));
            Double.isNaN(d3);
            double d4 = d3 * exp2;
            Double.isNaN(d2);
            pVar2.f5303a = (float) (d2 + d4);
            C1344p pVar3 = this.f5310c;
            if (mo5857a(pVar3.f5303a, pVar3.f5304b)) {
                this.f5310c.f5304b = 0.0f;
            }
            return this.f5310c;
        }

        /* renamed from: a */
        public boolean mo5857a(float f, float f2) {
            return Math.abs(f2) < this.f5309b;
        }
    }

    public C1348c(C1352e eVar) {
        super(eVar);
        this.f5305G.mo5859b(mo5812c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5819g(float f) {
        this.f5305G.mo5859b(f);
    }

    /* renamed from: h */
    public C1348c mo5853h(@C0215r(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f5305G.mo5856a(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: a */
    public C1348c m7106a(float f) {
        super.mo5802a(f);
        return this;
    }

    /* renamed from: b */
    public C1348c m7108b(float f) {
        super.mo5807b(f);
        return this;
    }

    /* renamed from: f */
    public float mo5852f() {
        return this.f5305G.mo5854a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo5801a(float f, float f2) {
        return this.f5305G.mo5858b(f, f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5811b(long j) {
        C1344p a = this.f5305G.mo5855a(this.f5290b, this.f5289a, j);
        this.f5290b = a.f5303a;
        this.f5289a = a.f5304b;
        float f = this.f5290b;
        float f2 = this.f5296h;
        if (f < f2) {
            this.f5290b = f2;
            return true;
        }
        float f3 = this.f5295g;
        if (f > f3) {
            this.f5290b = f3;
            return true;
        } else if (mo5810b(f, this.f5289a)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public C1348c m7113f(float f) {
        super.mo5818f(f);
        return this;
    }

    public <K> C1348c(K k, C1350d<K> dVar) {
        super(k, dVar);
        this.f5305G.mo5859b(mo5812c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5810b(float f, float f2) {
        return f >= this.f5295g || f <= this.f5296h || this.f5305G.mo5857a(f, f2);
    }
}
