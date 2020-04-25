package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.a */
/* compiled from: AbstractBiMap */
abstract class C7529a<K, V> extends C8220v1<K, V> implements C8139s<K, V>, Serializable {
    @C2777c("Not needed in emulated source.")
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    private transient Set<K> f21079N;

    /* renamed from: O */
    private transient Set<V> f21080O;

    /* renamed from: P */
    private transient Set<Entry<K, V>> f21081P;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public transient Map<K, V> f21082a;

    /* renamed from: b */
    transient C7529a<V, K> f21083b;

    /* renamed from: com.google.common.collect.a$b */
    /* compiled from: AbstractBiMap */
    private class C7531b extends C7555b2<Entry<K, V>> {

        /* renamed from: a */
        final Set<Entry<K, V>> f21084a;

        /* renamed from: com.google.common.collect.a$b$a */
        /* compiled from: AbstractBiMap */
        class C7532a implements Iterator<Entry<K, V>> {

            /* renamed from: a */
            Entry<K, V> f21087a;

            /* renamed from: b */
            final /* synthetic */ Iterator f21088b;

            /* renamed from: com.google.common.collect.a$b$a$a */
            /* compiled from: AbstractBiMap */
            class C7533a extends C8244w1<K, V> {

                /* renamed from: a */
                final /* synthetic */ Entry f21089a;

                C7533a(Entry entry) {
                    this.f21089a = entry;
                }

                public V setValue(V v) {
                    String str = "entry no longer in map";
                    C7397x.m35677b(C7531b.this.contains(this), (Object) str);
                    if (C5827t.m25562a(v, getValue())) {
                        return v;
                    }
                    C7397x.m35672a(!C7529a.this.containsValue(v), "value already present: %s", v);
                    V value = this.f21089a.setValue(v);
                    C7397x.m35677b(C5827t.m25562a(v, C7529a.this.get(getKey())), (Object) str);
                    C7529a.this.m36189a(getKey(), true, value, v);
                    return value;
                }

                /* access modifiers changed from: protected */
                /* renamed from: y */
                public Entry<K, V> m36206y() {
                    return this.f21089a;
                }
            }

            C7532a(Iterator it) {
                this.f21088b = it;
            }

            public boolean hasNext() {
                return this.f21088b.hasNext();
            }

            public void remove() {
                C8277y.m39486a(this.f21087a != null);
                Object value = this.f21087a.getValue();
                this.f21088b.remove();
                C7529a.this.m36193s(value);
            }

            public Entry<K, V> next() {
                this.f21087a = (Entry) this.f21088b.next();
                return new C7533a(this.f21087a);
            }
        }

        private C7531b() {
            this.f21084a = C7529a.this.f21082a.entrySet();
        }

        public void clear() {
            C7529a.this.clear();
        }

        public boolean contains(Object obj) {
            return C7800f4.m37308a((Collection<Entry<K, V>>) m36203y(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30763b(collection);
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7532a(this.f21084a.iterator());
        }

        public boolean remove(Object obj) {
            if (!this.f21084a.contains(obj)) {
                return false;
            }
            Entry entry = (Entry) obj;
            C7529a.this.f21083b.f21082a.remove(entry.getValue());
            this.f21084a.remove(entry);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo30764d(collection);
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<Entry<K, V>> m36204y() {
            return this.f21084a;
        }
    }

    /* renamed from: com.google.common.collect.a$c */
    /* compiled from: AbstractBiMap */
    private static class C7534c<K, V> extends C7529a<K, V> {
        @C2777c("Not needed in emulated source.")
        private static final long serialVersionUID = 0;

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            mo29603a((C7529a) objectInputStream.readObject());
        }

        @C2777c("java.io.ObjectOuputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(mo29607k());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public K mo29609p(K k) {
            return this.f21083b.mo29610q(k);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public V mo29610q(V v) {
            return this.f21083b.mo29609p(v);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("Not needed in the emulated source.")
        public Object readResolve() {
            return mo29607k().mo29607k();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return C7529a.super.values();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public /* bridge */ /* synthetic */ Object mo26777y() {
            return C7529a.super.mo26777y();
        }

        private C7534c(Map<K, V> map, C7529a<V, K> aVar) {
            super(map, aVar);
        }
    }

    /* renamed from: com.google.common.collect.a$d */
    /* compiled from: AbstractBiMap */
    private class C7535d extends C7555b2<K> {
        private C7535d() {
        }

        public void clear() {
            C7529a.this.clear();
        }

        public Iterator<K> iterator() {
            return C7800f4.m37289a(C7529a.this.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            C7529a.this.m36192r(obj);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo30764d(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<K> m36212y() {
            return C7529a.this.f21082a.keySet();
        }
    }

    /* renamed from: com.google.common.collect.a$e */
    /* compiled from: AbstractBiMap */
    private class C7536e extends C7555b2<V> {

        /* renamed from: a */
        final Set<V> f21092a;

        private C7536e() {
            this.f21092a = C7529a.this.f21083b.keySet();
        }

        public Iterator<V> iterator() {
            return C7800f4.m37319b(C7529a.this.entrySet().iterator());
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public String toString() {
            return mo30760D();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<V> m36215y() {
            return this.f21092a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public V m36192r(Object obj) {
        V remove = this.f21082a.remove(obj);
        m36193s(remove);
        return remove;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m36193s(V v) {
        this.f21083b.f21082a.remove(v);
    }

    public void clear() {
        this.f21082a.clear();
        this.f21083b.f21082a.clear();
    }

    public boolean containsValue(@C5952h Object obj) {
        return this.f21083b.containsKey(obj);
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f21081P;
        if (set != null) {
            return set;
        }
        C7531b bVar = new C7531b();
        this.f21081P = bVar;
        return bVar;
    }

    /* renamed from: k */
    public C8139s<V, K> mo29607k() {
        return this.f21083b;
    }

    public Set<K> keySet() {
        Set<K> set = this.f21079N;
        if (set != null) {
            return set;
        }
        C7535d dVar = new C7535d();
        this.f21079N = dVar;
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public K mo29609p(@C5952h K k) {
        return k;
    }

    public V put(@C5952h K k, @C5952h V v) {
        return m36187a(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public V mo29610q(@C5952h V v) {
        return v;
    }

    public V remove(@C5952h Object obj) {
        if (containsKey(obj)) {
            return m36192r(obj);
        }
        return null;
    }

    C7529a(Map<K, V> map, Map<V, K> map2) {
        mo29604a(map, map2);
    }

    public Set<V> values() {
        Set<V> set = this.f21080O;
        if (set != null) {
            return set;
        }
        C7536e eVar = new C7536e();
        this.f21080O = eVar;
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Map<K, V> m36201y() {
        return this.f21082a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29604a(Map<K, V> map, Map<V, K> map2) {
        boolean z = true;
        C7397x.m35676b(this.f21082a == null);
        C7397x.m35676b(this.f21083b == null);
        C7397x.m35670a(map.isEmpty());
        C7397x.m35670a(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f21082a = map;
        this.f21083b = new C7534c(map2, this);
    }

    private C7529a(Map<K, V> map, C7529a<V, K> aVar) {
        this.f21082a = map;
        this.f21083b = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29603a(C7529a<V, K> aVar) {
        this.f21083b = aVar;
    }

    /* renamed from: a */
    public V mo29602a(@C5952h K k, @C5952h V v) {
        return m36187a(k, v, true);
    }

    /* renamed from: a */
    private V m36187a(@C5952h K k, @C5952h V v, boolean z) {
        mo29609p(k);
        mo29610q(v);
        boolean containsKey = containsKey(k);
        if (containsKey && C5827t.m25562a(v, get(k))) {
            return v;
        }
        if (z) {
            mo29607k().remove(v);
        } else {
            C7397x.m35672a(!containsValue(v), "value already present: %s", v);
        }
        V put = this.f21082a.put(k, v);
        m36189a(k, containsKey, put, v);
        return put;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36189a(K k, boolean z, V v, V v2) {
        if (z) {
            m36193s(v);
        }
        this.f21083b.f21082a.put(v2, k);
    }
}
