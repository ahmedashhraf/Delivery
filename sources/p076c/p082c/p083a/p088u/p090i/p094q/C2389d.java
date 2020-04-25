package p076c.p082c.p083a.p088u.p090i.p094q;

import android.graphics.Bitmap.Config;

/* renamed from: c.c.a.u.i.q.d */
/* compiled from: PreFillType */
public final class C2389d {

    /* renamed from: e */
    static final Config f9337e = Config.RGB_565;

    /* renamed from: a */
    private final int f9338a;

    /* renamed from: b */
    private final int f9339b;

    /* renamed from: c */
    private final Config f9340c;

    /* renamed from: d */
    private final int f9341d;

    /* renamed from: c.c.a.u.i.q.d$a */
    /* compiled from: PreFillType */
    public static class C2390a {

        /* renamed from: a */
        private final int f9342a;

        /* renamed from: b */
        private final int f9343b;

        /* renamed from: c */
        private Config f9344c;

        /* renamed from: d */
        private int f9345d;

        public C2390a(int i) {
            this(i, i);
        }

        /* renamed from: a */
        public C2390a mo9808a(Config config) {
            this.f9344c = config;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Config mo9810b() {
            return this.f9344c;
        }

        public C2390a(int i, int i2) {
            this.f9345d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 > 0) {
                this.f9342a = i;
                this.f9343b = i2;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }

        /* renamed from: a */
        public C2390a mo9807a(int i) {
            if (i > 0) {
                this.f9345d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2389d mo9809a() {
            return new C2389d(this.f9342a, this.f9343b, this.f9344c, this.f9345d);
        }
    }

    C2389d(int i, int i2, Config config, int i3) {
        if (config != null) {
            this.f9338a = i;
            this.f9339b = i2;
            this.f9340c = config;
            this.f9341d = i3;
            return;
        }
        throw new NullPointerException("Config must not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Config mo9800a() {
        return this.f9340c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo9801b() {
        return this.f9339b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo9802c() {
        return this.f9341d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo9803d() {
        return this.f9338a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2389d)) {
            return false;
        }
        C2389d dVar = (C2389d) obj;
        if (this.f9339b == dVar.f9339b && this.f9338a == dVar.f9338a && this.f9341d == dVar.f9341d && this.f9340c == dVar.f9340c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f9338a * 31) + this.f9339b) * 31) + this.f9340c.hashCode()) * 31) + this.f9341d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreFillSize{width=");
        sb.append(this.f9338a);
        sb.append(", height=");
        sb.append(this.f9339b);
        sb.append(", config=");
        sb.append(this.f9340c);
        sb.append(", weight=");
        sb.append(this.f9341d);
        sb.append('}');
        return sb.toString();
    }
}
