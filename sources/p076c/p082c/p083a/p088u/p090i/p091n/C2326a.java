package p076c.p082c.p083a.p088u.p090i.p091n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.u.i.n.a */
/* compiled from: AttributeStrategy */
class C2326a implements C2339g {

    /* renamed from: a */
    private final C2328b f9223a = new C2328b();

    /* renamed from: b */
    private final C2332e<C2327a, Bitmap> f9224b = new C2332e<>();

    /* renamed from: c.c.a.u.i.n.a$a */
    /* compiled from: AttributeStrategy */
    static class C2327a implements C2340h {

        /* renamed from: a */
        private final C2328b f9225a;

        /* renamed from: b */
        private int f9226b;

        /* renamed from: c */
        private int f9227c;

        /* renamed from: d */
        private Config f9228d;

        public C2327a(C2328b bVar) {
            this.f9225a = bVar;
        }

        /* renamed from: a */
        public void mo9722a(int i, int i2, Config config) {
            this.f9226b = i;
            this.f9227c = i2;
            this.f9228d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2327a)) {
                return false;
            }
            C2327a aVar = (C2327a) obj;
            if (this.f9226b == aVar.f9226b && this.f9227c == aVar.f9227c && this.f9228d == aVar.f9228d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f9226b * 31) + this.f9227c) * 31;
            Config config = this.f9228d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C2326a.m12037d(this.f9226b, this.f9227c, this.f9228d);
        }

        /* renamed from: a */
        public void mo9721a() {
            this.f9225a.mo9728a(this);
        }
    }

    /* renamed from: c.c.a.u.i.n.a$b */
    /* compiled from: AttributeStrategy */
    static class C2328b extends C2329b<C2327a> {
        C2328b() {
        }

        /* renamed from: a */
        public C2327a mo9727a(int i, int i2, Config config) {
            C2327a aVar = (C2327a) mo9729b();
            aVar.mo9722a(i, i2, config);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2327a m12048a() {
            return new C2327a(this);
        }
    }

    C2326a() {
    }

    /* renamed from: d */
    private static String m12038d(Bitmap bitmap) {
        return m12037d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public void mo9715a(Bitmap bitmap) {
        this.f9224b.mo9739a(this.f9223a.mo9727a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public String mo9717b(int i, int i2, Config config) {
        return m12037d(i, i2, config);
    }

    public Bitmap removeLast() {
        return (Bitmap) this.f9224b.mo9737a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f9224b);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m12037d(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: b */
    public int mo9716b(Bitmap bitmap) {
        return C2216i.m11338a(bitmap);
    }

    /* renamed from: c */
    public String mo9718c(Bitmap bitmap) {
        return m12038d(bitmap);
    }

    /* renamed from: a */
    public Bitmap mo9714a(int i, int i2, Config config) {
        return (Bitmap) this.f9224b.mo9738a(this.f9223a.mo9727a(i, i2, config));
    }
}
