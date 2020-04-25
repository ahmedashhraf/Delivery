package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.p6 */
/* compiled from: WellBehavedMap */
final class C8098p6<K, V> extends C8220v1<K, V> {

    /* renamed from: a */
    private final Map<K, V> f21901a;

    /* renamed from: b */
    private Set<Entry<K, V>> f21902b;

    /* renamed from: com.google.common.collect.p6$b */
    /* compiled from: WellBehavedMap */
    private final class C8100b extends C7828o<K, V> {

        /* renamed from: com.google.common.collect.p6$b$a */
        /* compiled from: WellBehavedMap */
        class C8101a extends C7847f6<K, Entry<K, V>> {

            /* renamed from: com.google.common.collect.p6$b$a$a */
            /* compiled from: WellBehavedMap */
            class C8102a extends C7848g<K, V> {

                /* renamed from: a */
                final /* synthetic */ Object f21905a;

                C8102a(Object obj) {
                    this.f21905a = obj;
                }

                public K getKey() {
                    return this.f21905a;
                }

                public V getValue() {
                    return C8098p6.this.get(this.f21905a);
                }

                public V setValue(V v) {
                    return C8098p6.this.put(this.f21905a, v);
                }
            }

            C8101a(Iterator it) {
                super(it);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Entry<K, V> m38803a(K k) {
                return new C8102a(k);
            }
        }

        private C8100b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo29777b() {
            return C8098p6.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C8101a(C8098p6.this.keySet().iterator());
        }
    }

    private C8098p6(Map<K, V> map) {
        this.f21901a = map;
    }

    /* renamed from: b */
    static <K, V> C8098p6<K, V> m38798b(Map<K, V> map) {
        return new C8098p6<>(map);
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f21902b;
        if (set != null) {
            return set;
        }
        C8100b bVar = new C8100b();
        this.f21902b = bVar;
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Map<K, V> m38800y() {
        return this.f21901a;
    }
}
