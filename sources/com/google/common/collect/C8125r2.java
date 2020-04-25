package com.google.common.collect;

import com.google.common.collect.C8302z2.C8303a;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.r2 */
/* compiled from: ImmutableBiMap */
public abstract class C8125r2<K, V> extends C8302z2<K, V> implements C8139s<K, V> {

    /* renamed from: Q */
    private static final Entry<?, ?>[] f21939Q = new Entry[0];

    /* renamed from: com.google.common.collect.r2$a */
    /* compiled from: ImmutableBiMap */
    public static final class C8126a<K, V> extends C8303a<K, V> {
        /* renamed from: a */
        public C8126a<K, V> m38927a(K k, V v) {
            super.mo30687a(k, v);
            return this;
        }

        /* renamed from: a */
        public C8126a<K, V> m38928a(Map<? extends K, ? extends V> map) {
            super.mo30689a(map);
            return this;
        }

        /* renamed from: a */
        public C8125r2<K, V> m38929a() {
            int i = this.f22183b;
            if (i == 0) {
                return C8125r2.m38920i();
            }
            if (i != 1) {
                return new C8284y4(i, this.f22182a);
            }
            return C8125r2.m38918c(this.f22182a[0].getKey(), this.f22182a[0].getValue());
        }
    }

    /* renamed from: com.google.common.collect.r2$b */
    /* compiled from: ImmutableBiMap */
    private static class C8127b extends C8308c {
        private static final long serialVersionUID = 0;

        C8127b(C8125r2<?, ?> r2Var) {
            super(r2Var);
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return mo31307a(new C8126a());
        }
    }

    C8125r2() {
    }

    /* renamed from: a */
    public static <K, V> C8125r2<K, V> m38913a(K k, V v, K k2, V v2) {
        return new C8284y4((C7541a<?, ?>[]) new C7541a[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2)});
    }

    /* renamed from: c */
    public static <K, V> C8125r2<K, V> m38918c(K k, V v) {
        return new C8072n5(k, v);
    }

    /* renamed from: g */
    public static <K, V> C8126a<K, V> m38919g() {
        return new C8126a<>();
    }

    /* renamed from: i */
    public static <K, V> C8125r2<K, V> m38920i() {
        return C8104q0.f21909R;
    }

    /* renamed from: k */
    public abstract C8125r2<V, K> m38923k();

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8127b(this);
    }

    /* renamed from: a */
    public static <K, V> C8125r2<K, V> m38914a(K k, V v, K k2, V v2, K k3, V v3) {
        return new C8284y4((C7541a<?, ?>[]) new C7541a[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3)});
    }

    /* renamed from: a */
    public static <K, V> C8125r2<K, V> m38915a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return new C8284y4((C7541a<?, ?>[]) new C7541a[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3), C8302z2.m39624b(k4, v4)});
    }

    /* renamed from: a */
    public static <K, V> C8125r2<K, V> m38916a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return new C8284y4((C7541a<?, ?>[]) new C7541a[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3), C8302z2.m39624b(k4, v4), C8302z2.m39624b(k5, v5)});
    }

    public C7859g3<V> values() {
        return m38923k().keySet();
    }

    /* renamed from: a */
    public static <K, V> C8125r2<K, V> m38917a(Map<? extends K, ? extends V> map) {
        if (map instanceof C8125r2) {
            C8125r2<K, V> r2Var = (C8125r2) map;
            if (!r2Var.mo29643f()) {
                return r2Var;
            }
        }
        Entry[] entryArr = (Entry[]) map.entrySet().toArray(f21939Q);
        int length = entryArr.length;
        if (length == 0) {
            return m38920i();
        }
        if (length != 1) {
            return new C8284y4((Entry<?, ?>[]) entryArr);
        }
        Entry entry = entryArr[0];
        return m38918c(entry.getKey(), entry.getValue());
    }

    @Deprecated
    /* renamed from: a */
    public V mo29602a(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
