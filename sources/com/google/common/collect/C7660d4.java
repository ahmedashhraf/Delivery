package com.google.common.collect;

import com.google.common.base.C5785c;
import com.google.common.base.C5827t;
import com.google.common.base.C5827t.C5829b;
import com.google.common.base.C7358i0;
import com.google.common.base.C7359j;
import com.google.common.base.C7365j0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.d4 */
/* compiled from: MapMaker */
public final class C7660d4 extends C7931j2<Object, Object> {

    /* renamed from: m */
    private static final int f21245m = 16;

    /* renamed from: n */
    private static final int f21246n = 4;

    /* renamed from: o */
    private static final int f21247o = 0;

    /* renamed from: p */
    static final int f21248p = -1;

    /* renamed from: b */
    boolean f21249b;

    /* renamed from: c */
    int f21250c = -1;

    /* renamed from: d */
    int f21251d = -1;

    /* renamed from: e */
    int f21252e = -1;

    /* renamed from: f */
    C7763w f21253f;

    /* renamed from: g */
    C7763w f21254g;

    /* renamed from: h */
    long f21255h = -1;

    /* renamed from: i */
    long f21256i = -1;

    /* renamed from: j */
    C7665e f21257j;

    /* renamed from: k */
    C7359j<Object> f21258k;

    /* renamed from: l */
    C7365j0 f21259l;

    /* renamed from: com.google.common.collect.d4$b */
    /* compiled from: MapMaker */
    static final class C7662b<K, V> extends C7648d0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        C7662b(C7660d4 d4Var, C7380p<? super K, ? extends V> pVar) {
            super(d4Var, pVar);
        }

        public V get(Object obj) {
            try {
                V d = mo29919d(obj);
                if (d != null) {
                    return d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f21234m0);
                sb.append(" returned null for key ");
                sb.append(obj);
                sb.append(".");
                throw new NullPointerException(sb.toString());
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                C7358i0.m35584a(cause, ComputationException.class);
                throw new ComputationException(cause);
            }
        }
    }

    /* renamed from: com.google.common.collect.d4$c */
    /* compiled from: MapMaker */
    static final class C7663c<K, V> extends C7664d<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final C7380p<? super K, ? extends V> f21260N;

        C7663c(C7660d4 d4Var, C7380p<? super K, ? extends V> pVar) {
            super(d4Var);
            this.f21260N = (C7380p) C7397x.m35664a(pVar);
        }

        /* renamed from: b */
        private V m36642b(K k) {
            C7397x.m35664a(k);
            try {
                return this.f21260N.apply(k);
            } catch (ComputationException e) {
                throw e;
            } catch (Throwable th) {
                throw new ComputationException(th);
            }
        }

        public V get(Object obj) {
            V b = m36642b(obj);
            C7397x.m35666a(b, "%s returned null for key %s.", this.f21260N, obj);
            mo29969b(obj, b);
            return b;
        }
    }

    /* renamed from: com.google.common.collect.d4$d */
    /* compiled from: MapMaker */
    static class C7664d<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7671f<K, V> f21261a;

        /* renamed from: b */
        private final C7665e f21262b;

        C7664d(C7660d4 d4Var) {
            this.f21261a = d4Var.mo30660a();
            this.f21262b = d4Var.f21257j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo29969b(K k, V v) {
            this.f21261a.mo29980a(new C7672g(k, v, this.f21262b));
        }

        public boolean containsKey(@C5952h Object obj) {
            return false;
        }

        public boolean containsValue(@C5952h Object obj) {
            return false;
        }

        public Set<Entry<K, V>> entrySet() {
            return Collections.emptySet();
        }

        public V get(@C5952h Object obj) {
            return null;
        }

        public V put(K k, V v) {
            C7397x.m35664a(k);
            C7397x.m35664a(v);
            mo29969b(k, v);
            return null;
        }

        public V putIfAbsent(K k, V v) {
            return put(k, v);
        }

        public V remove(@C5952h Object obj) {
            return null;
        }

        public boolean remove(@C5952h Object obj, @C5952h Object obj2) {
            return false;
        }

        public V replace(K k, V v) {
            C7397x.m35664a(k);
            C7397x.m35664a(v);
            return null;
        }

        public boolean replace(K k, @C5952h V v, V v2) {
            C7397x.m35664a(k);
            C7397x.m35664a(v2);
            return false;
        }
    }

    /* renamed from: com.google.common.collect.d4$e */
    /* compiled from: MapMaker */
    enum C7665e {
        EXPLICIT {
            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public boolean mo29979d() {
                return false;
            }
        },
        REPLACED {
            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public boolean mo29979d() {
                return false;
            }
        },
        COLLECTED {
            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public boolean mo29979d() {
                return true;
            }
        },
        EXPIRED {
            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public boolean mo29979d() {
                return true;
            }
        },
        SIZE {
            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public boolean mo29979d() {
                return true;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract boolean mo29979d();
    }

    /* renamed from: com.google.common.collect.d4$f */
    /* compiled from: MapMaker */
    interface C7671f<K, V> {
        /* renamed from: a */
        void mo29980a(C7672g<K, V> gVar);
    }

    /* renamed from: com.google.common.collect.d4$g */
    /* compiled from: MapMaker */
    static final class C7672g<K, V> extends C8214u2<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final C7665e f21263N;

        C7672g(@C5952h K k, @C5952h V v, C7665e eVar) {
            super(k, v);
            this.f21263N = eVar;
        }

        /* renamed from: a */
        public C7665e mo29981a() {
            return this.f21263N;
        }

        /* renamed from: d */
        public boolean mo29982d() {
            return this.f21263N.mo29979d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo29958g() {
        int i = this.f21251d;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public long mo29959h() {
        long j = this.f21256i;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public long mo29960i() {
        long j = this.f21255h;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo29961j() {
        int i = this.f21250c;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C7359j<Object> mo29962k() {
        return (C7359j) C5827t.m25564b(this.f21258k, mo29963l().mo30305d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C7763w mo29963l() {
        return (C7763w) C5827t.m25564b(this.f21253f, C7763w.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C7365j0 mo29964m() {
        return (C7365j0) C5827t.m25564b(this.f21259l, C7365j0.m35606b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C7763w mo29965n() {
        return (C7763w) C5827t.m25564b(this.f21254g, C7763w.STRONG);
    }

    public String toString() {
        C5829b a = C5827t.m25559a((Object) this);
        int i = this.f21250c;
        if (i != -1) {
            a.mo23150a("initialCapacity", i);
        }
        int i2 = this.f21251d;
        if (i2 != -1) {
            a.mo23150a("concurrencyLevel", i2);
        }
        int i3 = this.f21252e;
        if (i3 != -1) {
            a.mo23150a("maximumSize", i3);
        }
        String str = "ns";
        if (this.f21255h != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21255h);
            sb.append(str);
            a.mo23152a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f21256i != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21256i);
            sb2.append(str);
            a.mo23152a("expireAfterAccess", (Object) sb2.toString());
        }
        C7763w wVar = this.f21253f;
        if (wVar != null) {
            a.mo23152a("keyStrength", (Object) C5785c.m25356a(wVar.toString()));
        }
        C7763w wVar2 = this.f21254g;
        if (wVar2 != null) {
            a.mo23152a("valueStrength", (Object) C5785c.m25356a(wVar2.toString()));
        }
        if (this.f21258k != null) {
            a.mo23146a((Object) "keyEquivalence");
        }
        if (this.f21668a != null) {
            a.mo23146a((Object) "removalListener");
        }
        return a.toString();
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: c */
    public C7660d4 m36626c(int i) {
        boolean z = false;
        C7397x.m35678b(this.f21252e == -1, "maximum size was already set to %s", Integer.valueOf(this.f21252e));
        if (i >= 0) {
            z = true;
        }
        C7397x.m35671a(z, (Object) "maximum size must not be negative");
        this.f21252e = i;
        this.f21249b = true;
        if (this.f21252e == 0) {
            this.f21257j = C7665e.SIZE;
        }
        return this;
    }

    @C2777c("java.lang.ref.SoftReference")
    @Deprecated
    /* renamed from: d */
    public C7660d4 m36629d() {
        return mo29951b(C7763w.SOFT);
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: e */
    public C7660d4 m36631e() {
        return mo29946a(C7763w.WEAK);
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: f */
    public C7660d4 m36633f() {
        return mo29951b(C7763w.WEAK);
    }

    /* renamed from: b */
    public C7660d4 m36623b(int i) {
        boolean z = true;
        C7397x.m35678b(this.f21250c == -1, "initial capacity was already set to %s", Integer.valueOf(this.f21250c));
        if (i < 0) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f21250c = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    /* renamed from: a */
    public C7660d4 m36616a(C7359j<Object> jVar) {
        C7397x.m35678b(this.f21258k == null, "key equivalence was already set to %s", this.f21258k);
        this.f21258k = (C7359j) C7397x.m35664a(jVar);
        this.f21249b = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7660d4 mo29951b(C7763w wVar) {
        C7397x.m35678b(this.f21254g == null, "Value strength was already set to %s", this.f21254g);
        this.f21254g = (C7763w) C7397x.m35664a(wVar);
        if (wVar != C7763w.STRONG) {
            this.f21249b = true;
        }
        return this;
    }

    /* renamed from: a */
    public C7660d4 m36614a(int i) {
        boolean z = true;
        C7397x.m35678b(this.f21251d == -1, "concurrency level was already set to %s", Integer.valueOf(this.f21251d));
        if (i <= 0) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f21251d = i;
        return this;
    }

    /* renamed from: c */
    private void m36609c(long j, TimeUnit timeUnit) {
        C7397x.m35678b(this.f21255h == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(this.f21255h));
        C7397x.m35678b(this.f21256i == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(this.f21256i));
        C7397x.m35672a(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7660d4 mo29946a(C7763w wVar) {
        boolean z = false;
        C7397x.m35678b(this.f21253f == null, "Key strength was already set to %s", this.f21253f);
        this.f21253f = (C7763w) C7397x.m35664a(wVar);
        if (this.f21253f != C7763w.SOFT) {
            z = true;
        }
        C7397x.m35671a(z, (Object) "Soft keys are not supported");
        if (wVar != C7763w.STRONG) {
            this.f21249b = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: b */
    public C7660d4 m36624b(long j, TimeUnit timeUnit) {
        m36609c(j, timeUnit);
        this.f21255h = timeUnit.toNanos(j);
        if (j == 0 && this.f21257j == null) {
            this.f21257j = C7665e.EXPIRED;
        }
        this.f21249b = true;
        return this;
    }

    /* renamed from: c */
    public <K, V> ConcurrentMap<K, V> mo29954c() {
        if (!this.f21249b) {
            return new ConcurrentHashMap(mo29961j(), 0.75f, mo29958g());
        }
        return this.f21257j == null ? new C7717e4<>(this) : new C7664d<>(this);
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    @Deprecated
    /* renamed from: a */
    public C7660d4 m36615a(long j, TimeUnit timeUnit) {
        m36609c(j, timeUnit);
        this.f21256i = timeUnit.toNanos(j);
        if (j == 0 && this.f21257j == null) {
            this.f21257j = C7665e.EXPIRED;
        }
        this.f21249b = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("MapMakerInternalMap")
    /* renamed from: b */
    public <K, V> C7717e4<K, V> mo29952b() {
        return new C7717e4<>(this);
    }

    /* access modifiers changed from: 0000 */
    @C2777c("To be supported")
    @Deprecated
    /* renamed from: a */
    public <K, V> C7931j2<K, V> mo29947a(C7671f<K, V> fVar) {
        C7397x.m35676b(this.f21668a == null);
        this.f21668a = (C7671f) C7397x.m35664a(fVar);
        this.f21249b = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: a */
    public <K, V> ConcurrentMap<K, V> mo29948a(C7380p<? super K, ? extends V> pVar) {
        return this.f21257j == null ? new C7662b(this, pVar) : new C7663c(this, pVar);
    }
}
