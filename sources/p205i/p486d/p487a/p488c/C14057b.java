package p205i.p486d.p487a.p488c;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: i.d.a.c.b */
/* compiled from: ExpirationCache */
public class C14057b<K, V> implements C14056a<K, V>, Map<K, V> {

    /* renamed from: a */
    private final C14060c<K, C14059b<V>> f41311a;

    /* renamed from: b */
    private long f41312b;

    /* renamed from: i.d.a.c.b$a */
    /* compiled from: ExpirationCache */
    private static class C14058a<K, V> implements Entry<K, V> {

        /* renamed from: a */
        private final K f41313a;

        /* renamed from: b */
        private V f41314b;

        public C14058a(K k, V v) {
            this.f41313a = k;
            this.f41314b = v;
        }

        public K getKey() {
            return this.f41313a;
        }

        public V getValue() {
            return this.f41314b;
        }

        public V setValue(V v) {
            V v2 = this.f41314b;
            this.f41314b = v;
            return v2;
        }
    }

    /* renamed from: i.d.a.c.b$b */
    /* compiled from: ExpirationCache */
    private static class C14059b<V> {

        /* renamed from: a */
        public final V f41315a;

        /* renamed from: b */
        public final long f41316b;

        public C14059b(V v, long j) {
            this.f41315a = v;
            this.f41316b = System.currentTimeMillis() + j;
        }

        /* renamed from: a */
        public boolean mo44403a() {
            return System.currentTimeMillis() > this.f41316b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14059b)) {
                return false;
            }
            return this.f41315a.equals(((C14059b) obj).f41315a);
        }

        public int hashCode() {
            return this.f41315a.hashCode();
        }
    }

    public C14057b(int i, long j) {
        this.f41311a = new C14060c<>(i);
        mo44389a(j);
    }

    /* renamed from: a */
    public void mo44389a(long j) {
        if (j > 0) {
            this.f41312b = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void clear() {
        this.f41311a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f41311a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f41311a.containsValue(obj);
    }

    /* renamed from: d */
    public int mo44385d() {
        return this.f41311a.mo44385d();
    }

    public Set<Entry<K, V>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Entry entry : this.f41311a.entrySet()) {
            hashSet.add(new C14058a(entry.getKey(), ((C14059b) entry.getValue()).f41315a));
        }
        return hashSet;
    }

    public V get(Object obj) {
        C14059b bVar = (C14059b) this.f41311a.get(obj);
        if (bVar == null) {
            return null;
        }
        if (!bVar.mo44403a()) {
            return bVar.f41315a;
        }
        remove(obj);
        return null;
    }

    public boolean isEmpty() {
        return this.f41311a.isEmpty();
    }

    public Set<K> keySet() {
        return this.f41311a.keySet();
    }

    public V put(K k, V v) {
        return mo44388a(k, v, this.f41312b);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        C14059b bVar = (C14059b) this.f41311a.remove(obj);
        if (bVar == null) {
            return null;
        }
        return bVar.f41315a;
    }

    public int size() {
        return this.f41311a.size();
    }

    public Collection<V> values() {
        HashSet hashSet = new HashSet();
        for (C14059b bVar : this.f41311a.values()) {
            hashSet.add(bVar.f41315a);
        }
        return hashSet;
    }

    /* renamed from: a */
    public V mo44388a(K k, V v, long j) {
        C14059b bVar = (C14059b) this.f41311a.put(k, new C14059b(v, j));
        if (bVar == null) {
            return null;
        }
        return bVar.f41315a;
    }

    /* renamed from: a */
    public void mo44384a(int i) {
        this.f41311a.mo44384a(i);
    }
}
