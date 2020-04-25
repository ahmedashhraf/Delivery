package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8175t2.C8177b;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.z2 */
/* compiled from: ImmutableMap */
public abstract class C8302z2<K, V> implements Map<K, V>, Serializable {

    /* renamed from: P */
    private static final Entry<?, ?>[] f22177P = new Entry[0];

    /* renamed from: N */
    private transient C8175t2<V> f22178N;

    /* renamed from: O */
    private transient C7882h3<K, V> f22179O;

    /* renamed from: a */
    private transient C7859g3<Entry<K, V>> f22180a;

    /* renamed from: b */
    private transient C7859g3<K> f22181b;

    /* renamed from: com.google.common.collect.z2$a */
    /* compiled from: ImmutableMap */
    public static class C8303a<K, V> {

        /* renamed from: a */
        C7541a<K, V>[] f22182a;

        /* renamed from: b */
        int f22183b;

        public C8303a() {
            this(4);
        }

        /* renamed from: a */
        private void m39636a(int i) {
            C7541a<K, V>[] aVarArr = this.f22182a;
            if (i > aVarArr.length) {
                this.f22182a = (C7541a[]) C8109q4.m38833a((T[]) aVarArr, C8177b.m39079a(aVarArr.length, i));
            }
        }

        C8303a(int i) {
            this.f22182a = new C7541a[i];
            this.f22183b = 0;
        }

        /* renamed from: a */
        public C8303a<K, V> mo30687a(K k, V v) {
            m39636a(this.f22183b + 1);
            C7541a<K, V> b = C8302z2.m39624b(k, v);
            C7541a<K, V>[] aVarArr = this.f22182a;
            int i = this.f22183b;
            this.f22183b = i + 1;
            aVarArr[i] = b;
            return this;
        }

        /* renamed from: a */
        public C8303a<K, V> mo30688a(Entry<? extends K, ? extends V> entry) {
            return mo30687a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public C8303a<K, V> mo30689a(Map<? extends K, ? extends V> map) {
            m39636a(this.f22183b + map.size());
            for (Entry a : map.entrySet()) {
                mo30688a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C8302z2<K, V> mo30690a() {
            int i = this.f22183b;
            if (i == 0) {
                return C8302z2.m39630i();
            }
            if (i != 1) {
                return new C7543a5(i, this.f22182a);
            }
            return C8302z2.m39626c(this.f22182a[0].getKey(), this.f22182a[0].getValue());
        }
    }

    /* renamed from: com.google.common.collect.z2$b */
    /* compiled from: ImmutableMap */
    private static final class C8304b<K, V> extends C8302z2<K, C7859g3<V>> {
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public final C8302z2<K, V> f22184Q;

        /* renamed from: com.google.common.collect.z2$b$a */
        /* compiled from: ImmutableMap */
        class C8305a extends C7556b3<K, C7859g3<V>> {

            /* renamed from: com.google.common.collect.z2$b$a$a */
            /* compiled from: ImmutableMap */
            class C8306a extends C8023l6<Entry<K, C7859g3<V>>> {

                /* renamed from: a */
                final /* synthetic */ Iterator f22186a;

                /* renamed from: com.google.common.collect.z2$b$a$a$a */
                /* compiled from: ImmutableMap */
                class C8307a extends C7848g<K, C7859g3<V>> {

                    /* renamed from: a */
                    final /* synthetic */ Entry f22188a;

                    C8307a(Entry entry) {
                        this.f22188a = entry;
                    }

                    public K getKey() {
                        return this.f22188a.getKey();
                    }

                    public C7859g3<V> getValue() {
                        return C7859g3.m37499a(this.f22188a.getValue());
                    }
                }

                C8306a(Iterator it) {
                    this.f22186a = it;
                }

                public boolean hasNext() {
                    return this.f22186a.hasNext();
                }

                public Entry<K, C7859g3<V>> next() {
                    return new C8307a((Entry) this.f22186a.next());
                }
            }

            C8305a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8302z2<K, C7859g3<V>> mo29648n() {
                return C8304b.this;
            }

            public C8023l6<Entry<K, C7859g3<V>>> iterator() {
                return new C8306a(C8304b.this.f22184Q.entrySet().iterator());
            }
        }

        C8304b(C8302z2<K, V> z2Var) {
            this.f22184Q = (C8302z2) C7397x.m35664a(z2Var);
        }

        public boolean containsKey(@C5952h Object obj) {
            return this.f22184Q.containsKey(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C7859g3<Entry<K, C7859g3<V>>> mo29642d() {
            return new C8305a();
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return C8302z2.super.entrySet();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo29643f() {
            return false;
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return C8302z2.super.keySet();
        }

        public int size() {
            return this.f22184Q.size();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return C8302z2.super.values();
        }

        public C7859g3<V> get(@C5952h Object obj) {
            Object obj2 = this.f22184Q.get(obj);
            if (obj2 == null) {
                return null;
            }
            return C7859g3.m37499a(obj2);
        }
    }

    /* renamed from: com.google.common.collect.z2$c */
    /* compiled from: ImmutableMap */
    static class C8308c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f22190a;

        /* renamed from: b */
        private final Object[] f22191b;

        C8308c(C8302z2<?, ?> z2Var) {
            this.f22190a = new Object[z2Var.size()];
            this.f22191b = new Object[z2Var.size()];
            Iterator it = z2Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.f22190a[i] = entry.getKey();
                this.f22191b[i] = entry.getValue();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo31307a(C8303a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f22190a;
                if (i >= objArr.length) {
                    return aVar.mo30690a();
                }
                aVar.mo30687a(objArr[i], this.f22191b[i]);
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return mo31307a(new C8303a());
        }
    }

    C8302z2() {
    }

    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m39618a(K k, V v, K k2, V v2) {
        return new C7543a5((C7541a<?, ?>[]) new C7541a[]{m39624b(k, v), m39624b(k2, v2)});
    }

    /* renamed from: b */
    static <K, V> C7541a<K, V> m39624b(K k, V v) {
        C8277y.m39485a((Object) k, (Object) v);
        return new C7541a<>(k, v);
    }

    /* renamed from: c */
    public static <K, V> C8302z2<K, V> m39626c(K k, V v) {
        return C8125r2.m38918c(k, v);
    }

    /* renamed from: g */
    public static <K, V> C8303a<K, V> m39628g() {
        return new C8303a<>();
    }

    /* renamed from: h */
    private C7882h3<K, V> mo29983h() {
        C8302z2 j = m39631j();
        return new C7882h3<>(j, j.size(), null);
    }

    /* renamed from: i */
    public static <K, V> C8302z2<K, V> m39630i() {
        return C8125r2.m38920i();
    }

    /* renamed from: j */
    private C8302z2<K, C7859g3<V>> m39631j() {
        return new C8304b(this);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@C5952h Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@C5952h Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract C7859g3<Entry<K, V>> mo29642d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C7859g3<K> mo30737e() {
        return new C7618c3(this);
    }

    public boolean equals(@C5952h Object obj) {
        return C7800f4.m37340c((Map<?, ?>) this, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract boolean mo29643f();

    public abstract V get(@C5952h Object obj);

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C7800f4.m37350f(this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8308c(this);
    }

    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m39619a(K k, V v, K k2, V v2, K k3, V v3) {
        return new C7543a5((C7541a<?, ?>[]) new C7541a[]{m39624b(k, v), m39624b(k2, v2), m39624b(k3, v3)});
    }

    /* renamed from: c */
    private static <K, V> C8302z2<K, V> m39627c(Map<? extends K, ? extends V> map) {
        return m39625b((EnumMap) map);
    }

    public C7859g3<Entry<K, V>> entrySet() {
        C7859g3<Entry<K, V>> g3Var = this.f22180a;
        if (g3Var != null) {
            return g3Var;
        }
        C7859g3<Entry<K, V>> d = mo29642d();
        this.f22180a = d;
        return d;
    }

    public C7859g3<K> keySet() {
        C7859g3<K> g3Var = this.f22181b;
        if (g3Var != null) {
            return g3Var;
        }
        C7859g3<K> e = mo30737e();
        this.f22181b = e;
        return e;
    }

    public C8175t2<V> values() {
        C8175t2<V> t2Var = this.f22178N;
        if (t2Var != null) {
            return t2Var;
        }
        C7657d3 d3Var = new C7657d3(this);
        this.f22178N = d3Var;
        return d3Var;
    }

    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m39620a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return new C7543a5((C7541a<?, ?>[]) new C7541a[]{m39624b(k, v), m39624b(k2, v2), m39624b(k3, v3), m39624b(k4, v4)});
    }

    /* renamed from: b */
    private static <K extends Enum<K>, V> C8302z2<K, V> m39625b(Map<K, ? extends V> map) {
        EnumMap enumMap = new EnumMap(map);
        for (Entry entry : enumMap.entrySet()) {
            C8277y.m39485a(entry.getKey(), entry.getValue());
        }
        return C8224v2.m39224a(enumMap);
    }

    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m39621a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return new C7543a5((C7541a<?, ?>[]) new C7541a[]{m39624b(k, v), m39624b(k2, v2), m39624b(k3, v3), m39624b(k4, v4), m39624b(k5, v5)});
    }

    /* renamed from: a */
    static void m39623a(boolean z, String str, Entry<?, ?> entry, Entry<?, ?> entry2) {
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Multiple entries with same ");
            sb.append(str);
            sb.append(": ");
            sb.append(entry);
            sb.append(" and ");
            sb.append(entry2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m39622a(Map<? extends K, ? extends V> map) {
        if ((map instanceof C8302z2) && !(map instanceof C7933j3)) {
            C8302z2<K, V> z2Var = (C8302z2) map;
            if (!z2Var.mo29643f()) {
                return z2Var;
            }
        } else if (map instanceof EnumMap) {
            return m39627c(map);
        }
        Entry[] entryArr = (Entry[]) map.entrySet().toArray(f22177P);
        int length = entryArr.length;
        if (length == 0) {
            return m39630i();
        }
        if (length != 1) {
            return new C7543a5((Entry<?, ?>[]) entryArr);
        }
        Entry entry = entryArr[0];
        return m39626c(entry.getKey(), entry.getValue());
    }

    @C2775a
    /* renamed from: a */
    public C7882h3<K, V> mo30950a() {
        C7882h3<K, V> h3Var = this.f22179O;
        if (h3Var != null) {
            return h3Var;
        }
        C7882h3<K, V> h = mo29983h();
        this.f22179O = h;
        return h;
    }
}
