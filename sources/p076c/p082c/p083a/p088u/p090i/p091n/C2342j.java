package p076c.p082c.p083a.p088u.p090i.p091n;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import p076c.p082c.p083a.p084a0.C2216i;

@TargetApi(19)
/* renamed from: c.c.a.u.i.n.j */
/* compiled from: SizeConfigStrategy */
public class C2342j implements C2339g {

    /* renamed from: d */
    private static final int f9250d = 8;

    /* renamed from: e */
    private static final Config[] f9251e = {Config.ARGB_8888, null};

    /* renamed from: f */
    private static final Config[] f9252f = {Config.RGB_565};

    /* renamed from: g */
    private static final Config[] f9253g = {Config.ARGB_4444};

    /* renamed from: h */
    private static final Config[] f9254h = {Config.ALPHA_8};

    /* renamed from: a */
    private final C2345c f9255a = new C2345c();

    /* renamed from: b */
    private final C2332e<C2344b, Bitmap> f9256b = new C2332e<>();

    /* renamed from: c */
    private final Map<Config, NavigableMap<Integer, Integer>> f9257c = new HashMap();

    /* renamed from: c.c.a.u.i.n.j$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C2343a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9258a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9258a = r0
                int[] r0 = f9258a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f9258a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f9258a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f9258a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p088u.p090i.p091n.C2342j.C2343a.<clinit>():void");
        }
    }

    /* renamed from: c.c.a.u.i.n.j$b */
    /* compiled from: SizeConfigStrategy */
    static final class C2344b implements C2340h {

        /* renamed from: a */
        private final C2345c f9259a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f9260b;

        /* renamed from: c */
        private Config f9261c;

        public C2344b(C2345c cVar) {
            this.f9259a = cVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2344b)) {
                return false;
            }
            C2344b bVar = (C2344b) obj;
            if (this.f9260b != bVar.f9260b) {
                return false;
            }
            Config config = this.f9261c;
            Config config2 = bVar.f9261c;
            if (config == null) {
                if (config2 != null) {
                    return false;
                }
            } else if (!config.equals(config2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f9260b * 31;
            Config config = this.f9261c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C2342j.m12106b(this.f9260b, this.f9261c);
        }

        /* renamed from: a */
        public void mo9748a(int i, Config config) {
            this.f9260b = i;
            this.f9261c = config;
        }

        C2344b(C2345c cVar, int i, Config config) {
            this(cVar);
            mo9748a(i, config);
        }

        /* renamed from: a */
        public void mo9721a() {
            this.f9259a.mo9728a(this);
        }
    }

    /* renamed from: c.c.a.u.i.n.j$c */
    /* compiled from: SizeConfigStrategy */
    static class C2345c extends C2329b<C2344b> {
        C2345c() {
        }

        /* renamed from: a */
        public C2344b mo9752a(int i, Config config) {
            C2344b bVar = (C2344b) mo9729b();
            bVar.mo9748a(i, config);
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2344b m12117a() {
            return new C2344b(this);
        }
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m12107b(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f9257c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f9257c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: c */
    public String mo9718c(Bitmap bitmap) {
        return m12106b(C2216i.m11338a(bitmap), bitmap.getConfig());
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f9256b.mo9737a();
        if (bitmap != null) {
            m12104a(Integer.valueOf(C2216i.m11338a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f9256b);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f9257c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f9257c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo9715a(Bitmap bitmap) {
        C2344b a = this.f9255a.mo9752a(C2216i.m11338a(bitmap), bitmap.getConfig());
        this.f9256b.mo9739a(a, bitmap);
        NavigableMap b = m12107b(bitmap.getConfig());
        Integer num = (Integer) b.get(Integer.valueOf(a.f9260b));
        Integer valueOf = Integer.valueOf(a.f9260b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: b */
    public String mo9717b(int i, int i2, Config config) {
        return m12106b(C2216i.m11336a(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo9716b(Bitmap bitmap) {
        return C2216i.m11338a(bitmap);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m12106b(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public Bitmap mo9714a(int i, int i2, Config config) {
        int a = C2216i.m11336a(i, i2, config);
        Bitmap bitmap = (Bitmap) this.f9256b.mo9738a(m12102a(this.f9255a.mo9752a(a, config), a, config));
        if (bitmap != null) {
            m12104a(Integer.valueOf(C2216i.m11338a(bitmap)), bitmap.getConfig());
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    /* renamed from: a */
    private C2344b m12102a(C2344b bVar, int i, Config config) {
        Config[] a = m12105a(config);
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = a[i2];
            Integer num = (Integer) m12107b(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVar;
                        }
                    } else if (config2.equals(config)) {
                        return bVar;
                    }
                }
                this.f9255a.mo9728a(bVar);
                return this.f9255a.mo9752a(num.intValue(), config2);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private void m12104a(Integer num, Config config) {
        NavigableMap b = m12107b(config);
        Integer num2 = (Integer) b.get(num);
        if (num2.intValue() == 1) {
            b.remove(num);
        } else {
            b.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private static Config[] m12105a(Config config) {
        int i = C2343a.f9258a[config.ordinal()];
        if (i == 1) {
            return f9251e;
        }
        if (i == 2) {
            return f9252f;
        }
        if (i == 3) {
            return f9253g;
        }
        if (i == 4) {
            return f9254h;
        }
        return new Config[]{config};
    }
}
