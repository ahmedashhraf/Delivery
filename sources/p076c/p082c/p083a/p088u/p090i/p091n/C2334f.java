package p076c.p082c.p083a.p088u.p090i.p091n;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.c.a.u.i.n.f */
/* compiled from: LruBitmapPool */
public class C2334f implements C2330c {

    /* renamed from: k */
    private static final String f9237k = "LruBitmapPool";

    /* renamed from: l */
    private static final Config f9238l = Config.ARGB_8888;

    /* renamed from: a */
    private final C2339g f9239a;

    /* renamed from: b */
    private final Set<Config> f9240b;

    /* renamed from: c */
    private final int f9241c;

    /* renamed from: d */
    private final C2336b f9242d;

    /* renamed from: e */
    private int f9243e;

    /* renamed from: f */
    private int f9244f;

    /* renamed from: g */
    private int f9245g;

    /* renamed from: h */
    private int f9246h;

    /* renamed from: i */
    private int f9247i;

    /* renamed from: j */
    private int f9248j;

    /* renamed from: c.c.a.u.i.n.f$b */
    /* compiled from: LruBitmapPool */
    private interface C2336b {
        /* renamed from: a */
        void mo9744a(Bitmap bitmap);

        /* renamed from: b */
        void mo9745b(Bitmap bitmap);
    }

    /* renamed from: c.c.a.u.i.n.f$c */
    /* compiled from: LruBitmapPool */
    private static class C2337c implements C2336b {
        private C2337c() {
        }

        /* renamed from: a */
        public void mo9744a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo9745b(Bitmap bitmap) {
        }
    }

    /* renamed from: c.c.a.u.i.n.f$d */
    /* compiled from: LruBitmapPool */
    private static class C2338d implements C2336b {

        /* renamed from: a */
        private final Set<Bitmap> f9249a = Collections.synchronizedSet(new HashSet());

        private C2338d() {
        }

        /* renamed from: a */
        public void mo9744a(Bitmap bitmap) {
            if (this.f9249a.contains(bitmap)) {
                this.f9249a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        /* renamed from: b */
        public void mo9745b(Bitmap bitmap) {
            if (!this.f9249a.contains(bitmap)) {
                this.f9249a.add(bitmap);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't add already added bitmap: ");
            sb.append(bitmap);
            sb.append(" [");
            sb.append(bitmap.getWidth());
            sb.append("x");
            sb.append(bitmap.getHeight());
            sb.append("]");
            throw new IllegalStateException(sb.toString());
        }
    }

    C2334f(int i, C2339g gVar, Set<Config> set) {
        this.f9241c = i;
        this.f9243e = i;
        this.f9239a = gVar;
        this.f9240b = set;
        this.f9242d = new C2337c();
    }

    /* renamed from: c */
    private void m12078c() {
        if (Log.isLoggable(f9237k, 2)) {
            m12079d();
        }
    }

    /* renamed from: d */
    private void m12079d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f9245g);
        sb.append(", misses=");
        sb.append(this.f9246h);
        sb.append(", puts=");
        sb.append(this.f9247i);
        sb.append(", evictions=");
        sb.append(this.f9248j);
        sb.append(", currentSize=");
        sb.append(this.f9244f);
        sb.append(", maxSize=");
        sb.append(this.f9243e);
        sb.append("\nStrategy=");
        sb.append(this.f9239a);
        sb.toString();
    }

    /* renamed from: e */
    private void m12080e() {
        m12077b(this.f9243e);
    }

    /* renamed from: f */
    private static Set<Config> m12081f() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    private static C2339g m12082g() {
        if (VERSION.SDK_INT >= 19) {
            return new C2342j();
        }
        return new C2326a();
    }

    /* renamed from: a */
    public int mo9730a() {
        return this.f9243e;
    }

    @TargetApi(12)
    /* renamed from: b */
    public synchronized Bitmap mo9735b(int i, int i2, Config config) {
        Bitmap a;
        a = this.f9239a.mo9714a(i, i2, config != null ? config : f9238l);
        if (a == null) {
            if (Log.isLoggable(f9237k, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f9239a.mo9717b(i, i2, config));
                sb.toString();
            }
            this.f9246h++;
        } else {
            this.f9245g++;
            this.f9244f -= this.f9239a.mo9716b(a);
            this.f9242d.mo9744a(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        if (Log.isLoggable(f9237k, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f9239a.mo9717b(i, i2, config));
            sb2.toString();
        }
        m12078c();
        return a;
    }

    /* renamed from: a */
    public synchronized void mo9732a(float f) {
        this.f9243e = Math.round(((float) this.f9241c) * f);
        m12080e();
    }

    /* renamed from: a */
    public synchronized boolean mo9734a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.f9239a.mo9716b(bitmap) <= this.f9243e) {
                if (this.f9240b.contains(bitmap.getConfig())) {
                    int b = this.f9239a.mo9716b(bitmap);
                    this.f9239a.mo9715a(bitmap);
                    this.f9242d.mo9745b(bitmap);
                    this.f9247i++;
                    this.f9244f += b;
                    if (Log.isLoggable(f9237k, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Put bitmap in pool=");
                        sb.append(this.f9239a.mo9718c(bitmap));
                        sb.toString();
                    }
                    m12078c();
                    m12080e();
                    return true;
                }
            }
            if (Log.isLoggable(f9237k, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f9239a.mo9718c(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f9240b.contains(bitmap.getConfig()));
                sb2.toString();
            }
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public C2334f(int i) {
        this(i, m12082g(), m12081f());
    }

    public C2334f(int i, Set<Config> set) {
        this(i, m12082g(), set);
    }

    /* renamed from: b */
    public void mo9736b() {
        boolean isLoggable = Log.isLoggable(f9237k, 3);
        m12077b(0);
    }

    /* renamed from: b */
    private synchronized void m12077b(int i) {
        while (this.f9244f > i) {
            Bitmap removeLast = this.f9239a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable(f9237k, 5)) {
                    m12079d();
                }
                this.f9244f = 0;
                return;
            }
            this.f9242d.mo9744a(removeLast);
            this.f9244f -= this.f9239a.mo9716b(removeLast);
            removeLast.recycle();
            this.f9248j++;
            if (Log.isLoggable(f9237k, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f9239a.mo9718c(removeLast));
                sb.toString();
            }
            m12078c();
        }
    }

    /* renamed from: a */
    public synchronized Bitmap mo9731a(int i, int i2, Config config) {
        Bitmap b;
        b = mo9735b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo9733a(int i) {
        if (Log.isLoggable(f9237k, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            sb.toString();
        }
        if (i >= 60) {
            mo9736b();
        } else if (i >= 40) {
            m12077b(this.f9243e / 2);
        }
    }
}
