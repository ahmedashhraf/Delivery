package com.google.common.cache;

import com.google.common.base.C5785c;
import com.google.common.base.C5827t;
import com.google.common.base.C5827t.C5829b;
import com.google.common.base.C7344g0;
import com.google.common.base.C7346h0;
import com.google.common.base.C7359j;
import com.google.common.base.C7365j0;
import com.google.common.base.C7397x;
import com.google.common.cache.C7420a.C7421a;
import com.google.common.cache.C7420a.C7422b;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5944c;

@C2776b(emulated = true)
/* renamed from: com.google.common.cache.d */
/* compiled from: CacheBuilder */
public final class C5832d<K, V> {

    /* renamed from: q */
    private static final int f16784q = 16;

    /* renamed from: r */
    private static final int f16785r = 4;

    /* renamed from: s */
    private static final int f16786s = 0;

    /* renamed from: t */
    private static final int f16787t = 0;

    /* renamed from: u */
    static final C7344g0<? extends C7422b> f16788u = C7346h0.m35568a(new C5833a());

    /* renamed from: v */
    static final C7441f f16789v;

    /* renamed from: w */
    static final C7344g0<C7422b> f16790w = new C5834b();

    /* renamed from: x */
    static final C7365j0 f16791x = new C5835c();

    /* renamed from: y */
    private static final Logger f16792y = Logger.getLogger(C5832d.class.getName());

    /* renamed from: z */
    static final int f16793z = -1;

    /* renamed from: a */
    boolean f16794a = true;

    /* renamed from: b */
    int f16795b = -1;

    /* renamed from: c */
    int f16796c = -1;

    /* renamed from: d */
    long f16797d = -1;

    /* renamed from: e */
    long f16798e = -1;

    /* renamed from: f */
    C7527s<? super K, ? super V> f16799f;

    /* renamed from: g */
    C7496u f16800g;

    /* renamed from: h */
    C7496u f16801h;

    /* renamed from: i */
    long f16802i = -1;

    /* renamed from: j */
    long f16803j = -1;

    /* renamed from: k */
    long f16804k = -1;

    /* renamed from: l */
    C7359j<Object> f16805l;

    /* renamed from: m */
    C7359j<Object> f16806m;

    /* renamed from: n */
    C7517o<? super K, ? super V> f16807n;

    /* renamed from: o */
    C7365j0 f16808o;

    /* renamed from: p */
    C7344g0<? extends C7422b> f16809p = f16788u;

    /* renamed from: com.google.common.cache.d$a */
    /* compiled from: CacheBuilder */
    static class C5833a implements C7422b {
        C5833a() {
        }

        /* renamed from: a */
        public void mo23194a() {
        }

        /* renamed from: a */
        public void mo23195a(int i) {
        }

        /* renamed from: a */
        public void mo23196a(long j) {
        }

        /* renamed from: b */
        public C7441f mo23197b() {
            return C5832d.f16789v;
        }

        /* renamed from: b */
        public void mo23198b(int i) {
        }

        /* renamed from: b */
        public void mo23199b(long j) {
        }
    }

    /* renamed from: com.google.common.cache.d$b */
    /* compiled from: CacheBuilder */
    static class C5834b implements C7344g0<C7422b> {
        C5834b() {
        }

        public C7422b get() {
            return new C7421a();
        }
    }

    /* renamed from: com.google.common.cache.d$c */
    /* compiled from: CacheBuilder */
    static class C5835c extends C7365j0 {
        C5835c() {
        }

        /* renamed from: a */
        public long mo23201a() {
            return 0;
        }
    }

    /* renamed from: com.google.common.cache.d$d */
    /* compiled from: CacheBuilder */
    enum C5836d implements C7517o<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo23202a(C7521q<Object, Object> qVar) {
        }
    }

    /* renamed from: com.google.common.cache.d$e */
    /* compiled from: CacheBuilder */
    enum C5837e implements C7527s<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public int mo23203a(Object obj, Object obj2) {
            return 1;
        }
    }

    static {
        C7441f fVar = new C7441f(0, 0, 0, 0, 0, 0);
        f16789v = fVar;
    }

    C5832d() {
    }

    @C2777c("To be supported")
    @C2775a
    /* renamed from: a */
    public static C5832d<Object, Object> m25583a(C7425e eVar) {
        return eVar.mo29337a().mo23188p();
    }

    /* renamed from: u */
    private void m25585u() {
        C7397x.m35677b(this.f16804k == -1, (Object) "refreshAfterWrite requires a LoadingCache");
    }

    /* renamed from: v */
    private void m25586v() {
        boolean z = true;
        if (this.f16799f == null) {
            if (this.f16798e != -1) {
                z = false;
            }
            C7397x.m35677b(z, (Object) "maximumWeight requires weigher");
        } else if (this.f16794a) {
            if (this.f16798e == -1) {
                z = false;
            }
            C7397x.m35677b(z, (Object) "weigher requires maximumWeight");
        } else if (this.f16798e == -1) {
            f16792y.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    /* renamed from: w */
    public static C5832d<Object, Object> m25587w() {
        return new C5832d<>();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: b */
    public C5832d<K, V> mo23172b(C7359j<Object> jVar) {
        C7397x.m35678b(this.f16806m == null, "value equivalence was already set to %s", this.f16806m);
        this.f16806m = (C7359j) C7397x.m35664a(jVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo23174c() {
        long j = this.f16803j;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public long mo23176d() {
        long j = this.f16802i;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo23177e() {
        int i = this.f16795b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C7359j<Object> mo23178f() {
        return (C7359j) C5827t.m25564b(this.f16805l, mo23179g().mo29572d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C7496u mo23179g() {
        return (C7496u) C5827t.m25564b(this.f16800g, C7496u.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public long mo23180h() {
        if (this.f16802i == 0 || this.f16803j == 0) {
            return 0;
        }
        return this.f16799f == null ? this.f16797d : this.f16798e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public long mo23181i() {
        long j = this.f16804k;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public <K1 extends K, V1 extends V> C7517o<K1, V1> mo23182j() {
        return (C7517o) C5827t.m25564b(this.f16807n, C5836d.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C7344g0<? extends C7422b> mo23183k() {
        return this.f16809p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C7359j<Object> mo23184l() {
        return (C7359j) C5827t.m25564b(this.f16806m, mo23185m().mo29572d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C7496u mo23185m() {
        return (C7496u) C5827t.m25564b(this.f16801h, C7496u.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public <K1 extends K, V1 extends V> C7527s<K1, V1> mo23186n() {
        return (C7527s) C5827t.m25564b(this.f16799f, C5837e.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo23187o() {
        return this.f16809p == f16790w;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: p */
    public C5832d<K, V> mo23188p() {
        this.f16794a = false;
        return this;
    }

    /* renamed from: q */
    public C5832d<K, V> mo23189q() {
        this.f16809p = f16790w;
        return this;
    }

    @C2777c("java.lang.ref.SoftReference")
    /* renamed from: r */
    public C5832d<K, V> mo23190r() {
        return mo23173b(C7496u.SOFT);
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: s */
    public C5832d<K, V> mo23191s() {
        return mo23164a(C7496u.WEAK);
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: t */
    public C5832d<K, V> mo23192t() {
        return mo23173b(C7496u.WEAK);
    }

    public String toString() {
        C5829b a = C5827t.m25559a((Object) this);
        int i = this.f16795b;
        if (i != -1) {
            a.mo23150a("initialCapacity", i);
        }
        int i2 = this.f16796c;
        if (i2 != -1) {
            a.mo23150a("concurrencyLevel", i2);
        }
        long j = this.f16797d;
        if (j != -1) {
            a.mo23151a("maximumSize", j);
        }
        long j2 = this.f16798e;
        if (j2 != -1) {
            a.mo23151a("maximumWeight", j2);
        }
        String str = "ns";
        if (this.f16802i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16802i);
            sb.append(str);
            a.mo23152a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f16803j != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16803j);
            sb2.append(str);
            a.mo23152a("expireAfterAccess", (Object) sb2.toString());
        }
        C7496u uVar = this.f16800g;
        if (uVar != null) {
            a.mo23152a("keyStrength", (Object) C5785c.m25356a(uVar.toString()));
        }
        C7496u uVar2 = this.f16801h;
        if (uVar2 != null) {
            a.mo23152a("valueStrength", (Object) C5785c.m25356a(uVar2.toString()));
        }
        if (this.f16805l != null) {
            a.mo23146a((Object) "keyEquivalence");
        }
        if (this.f16806m != null) {
            a.mo23146a((Object) "valueEquivalence");
        }
        if (this.f16807n != null) {
            a.mo23146a((Object) "removalListener");
        }
        return a.toString();
    }

    @C2777c("To be supported")
    @C2775a
    /* renamed from: a */
    public static C5832d<Object, Object> m25584a(String str) {
        return m25583a(C7425e.m35748a(str));
    }

    @C2777c("To be supported (synchronously).")
    @C2775a
    /* renamed from: c */
    public C5832d<K, V> mo23175c(long j, TimeUnit timeUnit) {
        C7397x.m35664a(timeUnit);
        C7397x.m35678b(this.f16804k == -1, "refresh was already set to %s ns", Long.valueOf(this.f16804k));
        C7397x.m35672a(j > 0, "duration must be positive: %s %s", Long.valueOf(j), timeUnit);
        this.f16804k = timeUnit.toNanos(j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: a */
    public C5832d<K, V> mo23163a(C7359j<Object> jVar) {
        C7397x.m35678b(this.f16805l == null, "key equivalence was already set to %s", this.f16805l);
        this.f16805l = (C7359j) C7397x.m35664a(jVar);
        return this;
    }

    /* renamed from: b */
    public C5832d<K, V> mo23169b(int i) {
        boolean z = true;
        C7397x.m35678b(this.f16795b == -1, "initial capacity was already set to %s", Integer.valueOf(this.f16795b));
        if (i < 0) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f16795b = i;
        return this;
    }

    /* renamed from: a */
    public C5832d<K, V> mo23159a(int i) {
        boolean z = true;
        C7397x.m35678b(this.f16796c == -1, "concurrency level was already set to %s", Integer.valueOf(this.f16796c));
        if (i <= 0) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f16796c = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo23168b() {
        int i = this.f16796c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    @C2777c("To be supported")
    /* renamed from: b */
    public C5832d<K, V> mo23170b(long j) {
        boolean z = true;
        C7397x.m35678b(this.f16798e == -1, "maximum weight was already set to %s", Long.valueOf(this.f16798e));
        C7397x.m35678b(this.f16797d == -1, "maximum size was already set to %s", Long.valueOf(this.f16797d));
        this.f16798e = j;
        if (j < 0) {
            z = false;
        }
        C7397x.m35671a(z, (Object) "maximum weight must not be negative");
        return this;
    }

    /* renamed from: a */
    public C5832d<K, V> mo23160a(long j) {
        boolean z = true;
        C7397x.m35678b(this.f16797d == -1, "maximum size was already set to %s", Long.valueOf(this.f16797d));
        C7397x.m35678b(this.f16798e == -1, "maximum weight was already set to %s", Long.valueOf(this.f16798e));
        C7397x.m35677b(this.f16799f == null, (Object) "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        C7397x.m35671a(z, (Object) "maximum size must not be negative");
        this.f16797d = j;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C5832d<K, V> mo23173b(C7496u uVar) {
        C7397x.m35678b(this.f16801h == null, "Value strength was already set to %s", this.f16801h);
        this.f16801h = (C7496u) C7397x.m35664a(uVar);
        return this;
    }

    @C2777c("To be supported")
    /* renamed from: a */
    public <K1 extends K, V1 extends V> C5832d<K1, V1> mo23166a(C7527s<? super K1, ? super V1> sVar) {
        C7397x.m35676b(this.f16799f == null);
        if (this.f16794a) {
            C7397x.m35678b(this.f16797d == -1, "weigher can not be combined with maximum size", Long.valueOf(this.f16797d));
        }
        this.f16799f = (C7527s) C7397x.m35664a(sVar);
        return this;
    }

    /* renamed from: b */
    public C5832d<K, V> mo23171b(long j, TimeUnit timeUnit) {
        C7397x.m35678b(this.f16802i == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(this.f16802i));
        C7397x.m35672a(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
        this.f16802i = timeUnit.toNanos(j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5832d<K, V> mo23164a(C7496u uVar) {
        C7397x.m35678b(this.f16800g == null, "Key strength was already set to %s", this.f16800g);
        this.f16800g = (C7496u) C7397x.m35664a(uVar);
        return this;
    }

    /* renamed from: a */
    public C5832d<K, V> mo23161a(long j, TimeUnit timeUnit) {
        C7397x.m35678b(this.f16803j == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(this.f16803j));
        C7397x.m35672a(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
        this.f16803j = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: a */
    public C5832d<K, V> mo23162a(C7365j0 j0Var) {
        C7397x.m35676b(this.f16808o == null);
        this.f16808o = (C7365j0) C7397x.m35664a(j0Var);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7365j0 mo23157a(boolean z) {
        C7365j0 j0Var = this.f16808o;
        if (j0Var != null) {
            return j0Var;
        }
        return z ? C7365j0.m35606b() : f16791x;
    }

    @C5944c
    /* renamed from: a */
    public <K1 extends K, V1 extends V> C5832d<K1, V1> mo23165a(C7517o<? super K1, ? super V1> oVar) {
        C7397x.m35676b(this.f16807n == null);
        this.f16807n = (C7517o) C7397x.m35664a(oVar);
        return this;
    }

    /* renamed from: a */
    public <K1 extends K, V1 extends V> C7446i<K1, V1> mo23167a(CacheLoader<? super K1, V1> cacheLoader) {
        m25586v();
        return new C7487n(this, cacheLoader);
    }

    /* renamed from: a */
    public <K1 extends K, V1 extends V> C7424c<K1, V1> mo23158a() {
        m25586v();
        m25585u();
        return new C7488o(this);
    }
}
