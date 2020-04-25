package androidx.collection;

import androidx.annotation.C0195i0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: androidx.collection.g */
/* compiled from: MapCollections */
abstract class C0643g<K, V> {
    @C0195i0

    /* renamed from: a */
    C0645b f2533a;
    @C0195i0

    /* renamed from: b */
    C0646c f2534b;
    @C0195i0

    /* renamed from: c */
    C0648e f2535c;

    /* renamed from: androidx.collection.g$a */
    /* compiled from: MapCollections */
    final class C0644a<T> implements Iterator<T> {

        /* renamed from: N */
        int f2536N;

        /* renamed from: O */
        boolean f2537O = false;

        /* renamed from: a */
        final int f2539a;

        /* renamed from: b */
        int f2540b;

        C0644a(int i) {
            this.f2539a = i;
            this.f2540b = C0643g.this.mo3223c();
        }

        public boolean hasNext() {
            return this.f2536N < this.f2540b;
        }

        public T next() {
            if (hasNext()) {
                T a = C0643g.this.mo3216a(this.f2536N, this.f2539a);
                this.f2536N++;
                this.f2537O = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2537O) {
                this.f2536N--;
                this.f2540b--;
                this.f2537O = false;
                C0643g.this.mo3219a(this.f2536N);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.collection.g$b */
    /* compiled from: MapCollections */
    final class C0645b implements Set<Entry<K, V>> {
        C0645b() {
        }

        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C0643g.this.mo3223c();
            for (Entry entry : collection) {
                C0643g.this.mo3220a(entry.getKey(), entry.getValue());
            }
            return c != C0643g.this.mo3223c();
        }

        public void clear() {
            C0643g.this.mo3218a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0643g.this.mo3215a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0641e.m3426a(C0643g.this.mo3216a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0643g.m3453a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int c = C0643g.this.mo3223c() - 1; c >= 0; c--) {
                Object a = C0643g.this.mo3216a(c, 0);
                Object a2 = C0643g.this.mo3216a(c, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C0643g.this.mo3223c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0647d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0643g.this.mo3223c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.g$c */
    /* compiled from: MapCollections */
    final class C0646c implements Set<K> {
        C0646c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0643g.this.mo3218a();
        }

        public boolean contains(Object obj) {
            return C0643g.this.mo3215a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0643g.m3452a(C0643g.this.mo3222b(), collection);
        }

        public boolean equals(Object obj) {
            return C0643g.m3453a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int c = C0643g.this.mo3223c() - 1; c >= 0; c--) {
                Object a = C0643g.this.mo3216a(c, 0);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C0643g.this.mo3223c() == 0;
        }

        public Iterator<K> iterator() {
            return new C0644a(0);
        }

        public boolean remove(Object obj) {
            int a = C0643g.this.mo3215a(obj);
            if (a < 0) {
                return false;
            }
            C0643g.this.mo3219a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0643g.m3454b(C0643g.this.mo3222b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0643g.m3455c(C0643g.this.mo3222b(), collection);
        }

        public int size() {
            return C0643g.this.mo3223c();
        }

        public Object[] toArray() {
            return C0643g.this.mo3295b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0643g.this.mo3294a(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.g$d */
    /* compiled from: MapCollections */
    final class C0647d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: N */
        boolean f2543N = false;

        /* renamed from: a */
        int f2545a;

        /* renamed from: b */
        int f2546b;

        C0647d() {
            this.f2545a = C0643g.this.mo3223c() - 1;
            this.f2546b = -1;
        }

        public boolean equals(Object obj) {
            if (this.f2543N) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0641e.m3426a(entry.getKey(), C0643g.this.mo3216a(this.f2546b, 0)) && C0641e.m3426a(entry.getValue(), C0643g.this.mo3216a(this.f2546b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f2543N) {
                return C0643g.this.mo3216a(this.f2546b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f2543N) {
                return C0643g.this.mo3216a(this.f2546b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f2546b < this.f2545a;
        }

        public int hashCode() {
            int i;
            if (this.f2543N) {
                int i2 = 0;
                Object a = C0643g.this.mo3216a(this.f2546b, 0);
                Object a2 = C0643g.this.mo3216a(this.f2546b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f2543N) {
                C0643g.this.mo3219a(this.f2546b);
                this.f2546b--;
                this.f2545a--;
                this.f2543N = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f2543N) {
                return C0643g.this.mo3217a(this.f2546b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.f2546b++;
                this.f2543N = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: androidx.collection.g$e */
    /* compiled from: MapCollections */
    final class C0648e implements Collection<V> {
        C0648e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0643g.this.mo3218a();
        }

        public boolean contains(Object obj) {
            return C0643g.this.mo3221b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0643g.this.mo3223c() == 0;
        }

        public Iterator<V> iterator() {
            return new C0644a(1);
        }

        public boolean remove(Object obj) {
            int b = C0643g.this.mo3221b(obj);
            if (b < 0) {
                return false;
            }
            C0643g.this.mo3219a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C0643g.this.mo3223c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C0643g.this.mo3216a(i, 1))) {
                    C0643g.this.mo3219a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C0643g.this.mo3223c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C0643g.this.mo3216a(i, 1))) {
                    C0643g.this.mo3219a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0643g.this.mo3223c();
        }

        public Object[] toArray() {
            return C0643g.this.mo3295b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0643g.this.mo3294a(tArr, 1);
        }
    }

    C0643g() {
    }

    /* renamed from: a */
    public static <K, V> boolean m3452a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m3454b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m3455c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3215a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3216a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo3217a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3218a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3219a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3220a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo3221b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo3222b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo3223c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo3296d() {
        if (this.f2533a == null) {
            this.f2533a = new C0645b<>();
        }
        return this.f2533a;
    }

    /* renamed from: e */
    public Set<K> mo3297e() {
        if (this.f2534b == null) {
            this.f2534b = new C0646c<>();
        }
        return this.f2534b;
    }

    /* renamed from: f */
    public Collection<V> mo3298f() {
        if (this.f2535c == null) {
            this.f2535c = new C0648e<>();
        }
        return this.f2535c;
    }

    /* renamed from: a */
    public <T> T[] mo3294a(T[] tArr, int i) {
        int c = mo3223c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo3216a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public Object[] mo3295b(int i) {
        int c = mo3223c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo3216a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m3453a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
