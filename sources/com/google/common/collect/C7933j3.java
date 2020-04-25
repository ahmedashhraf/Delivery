package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2.C8259b;
import com.google.common.collect.C8302z2.C8303a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.j3 */
/* compiled from: ImmutableSortedMap */
public abstract class C7933j3<K, V> extends C7981k3<K, V> implements SortedMap<K, V> {

    /* renamed from: R */
    private static final Comparator<Comparable> f21669R = C8133r4.m38943j();

    /* renamed from: S */
    private static final C7933j3<Comparable, Object> f21670S = new C8212u0(f21669R);
    private static final long serialVersionUID = 0;

    /* renamed from: Q */
    private transient C7933j3<K, V> f21671Q;

    /* renamed from: com.google.common.collect.j3$a */
    /* compiled from: ImmutableSortedMap */
    public static class C7934a<K, V> extends C8303a<K, V> {

        /* renamed from: c */
        private final Comparator<? super K> f21672c;

        public C7934a(Comparator<? super K> comparator) {
            this.f21672c = (Comparator) C7397x.m35664a(comparator);
        }

        /* renamed from: a */
        public C7934a<K, V> m37971a(K k, V v) {
            super.mo30687a(k, v);
            return this;
        }

        /* renamed from: a */
        public C7934a<K, V> m37972a(Entry<? extends K, ? extends V> entry) {
            super.mo30688a(entry);
            return this;
        }

        /* renamed from: a */
        public C7934a<K, V> m37973a(Map<? extends K, ? extends V> map) {
            super.mo30689a(map);
            return this;
        }

        /* renamed from: a */
        public C7933j3<K, V> m37974a() {
            return C7933j3.m37954a(this.f21672c, false, this.f22183b, (Entry<K, V>[]) this.f22182a);
        }
    }

    /* renamed from: com.google.common.collect.j3$b */
    /* compiled from: ImmutableSortedMap */
    private static class C7935b extends C8308c {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final Comparator<Object> f21673N;

        C7935b(C7933j3<?, ?> j3Var) {
            super(j3Var);
            this.f21673N = j3Var.comparator();
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return mo31307a(new C7934a(this.f21673N));
        }
    }

    C7933j3() {
    }

    /* renamed from: a */
    static <K, V> C7933j3<K, V> m37952a(Comparator<? super K> comparator) {
        if (C8133r4.m38943j().equals(comparator)) {
            return m37962i();
        }
        return new C8212u0(comparator);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <K, V> com.google.common.collect.C7933j3<K, V> m37960b(java.util.Map<? extends K, ? extends V> r4, java.util.Comparator<? super K> r5) {
        /*
            boolean r0 = r4 instanceof java.util.SortedMap
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r0 = r4
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto L_0x0014
            java.util.Comparator<java.lang.Comparable> r0 = f21669R
            if (r5 != r0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0014:
            boolean r0 = r5.equals(r0)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x002a
            boolean r2 = r4 instanceof com.google.common.collect.C7933j3
            if (r2 == 0) goto L_0x002a
            r2 = r4
            com.google.common.collect.j3 r2 = (com.google.common.collect.C7933j3) r2
            boolean r3 = r2.mo29643f()
            if (r3 != 0) goto L_0x002a
            return r2
        L_0x002a:
            java.util.Set r4 = r4.entrySet()
            java.util.Map$Entry[] r1 = new java.util.Map.Entry[r1]
            java.lang.Object[] r4 = r4.toArray(r1)
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4
            int r1 = r4.length
            com.google.common.collect.j3 r4 = m37954a(r5, r0, r1, (java.util.Map.Entry<K, V>[]) r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7933j3.m37960b(java.util.Map, java.util.Comparator):com.google.common.collect.j3");
    }

    /* renamed from: i */
    public static <K, V> C7933j3<K, V> m37962i() {
        return f21670S;
    }

    /* renamed from: j */
    public static <K extends Comparable<?>, V> C7934a<K, V> m37963j() {
        return new C7934a<>(C8133r4.m38943j());
    }

    /* renamed from: l */
    public static <K extends Comparable<?>, V> C7934a<K, V> m37964l() {
        return new C7934a<>(C8133r4.m38943j().mo30568g());
    }

    public Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return C7800f4.m37287a(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    public boolean containsValue(@C5952h Object obj) {
        return values().contains(obj);
    }

    public C8068n3<K> descendingKeySet() {
        return keySet().mo30788o();
    }

    public C7933j3<K, V> descendingMap() {
        C7933j3<K, V> j3Var = this.f21671Q;
        if (j3Var != null) {
            return j3Var;
        }
        C7933j3<K, V> h = mo29983h();
        this.f21671Q = h;
        return h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return keySet().mo29686j() || values().mo29686j();
    }

    public Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) entrySet().mo30933e().get(0);
    }

    public K firstKey() {
        return keySet().first();
    }

    public Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return C7800f4.m37287a(floorEntry(k));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract C7933j3<K, V> mo29983h();

    public abstract C7933j3<K, V> headMap(K k, boolean z);

    public Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return C7800f4.m37287a(higherEntry(k));
    }

    public abstract C8068n3<K> keySet();

    public Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) entrySet().mo30933e().get(size() - 1);
    }

    public K lastKey() {
        return keySet().last();
    }

    public Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return C7800f4.m37287a(lowerEntry(k));
    }

    public C8068n3<K> navigableKeySet() {
        return keySet();
    }

    @Deprecated
    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return values().size();
    }

    public abstract C7933j3<K, V> tailMap(K k, boolean z);

    public abstract C8175t2<V> values();

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C7935b(this);
    }

    C7933j3(C7933j3<K, V> j3Var) {
        this.f21671Q = j3Var;
    }

    public C7859g3<Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public C7933j3<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public C7933j3<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public C7933j3<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    public C7933j3<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        C7397x.m35664a(k);
        C7397x.m35664a(k2);
        C7397x.m35672a(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    /* renamed from: a */
    static <K, V> C7933j3<K, V> m37953a(Comparator<? super K> comparator, int i, Entry<K, V>[] entryArr) {
        if (i == 0) {
            return m37952a(comparator);
        }
        C8259b l = C8257x2.m39411l();
        C8259b l2 = C8257x2.m39411l();
        for (int i2 = 0; i2 < i; i2++) {
            Entry<K, V> entry = entryArr[i2];
            l.m39420a(entry.getKey());
            l2.m39420a(entry.getValue());
        }
        return new C7673d5(new C7846f5(l.mo30346a(), comparator), l2.mo30346a());
    }

    /* renamed from: b */
    private static <K, V> void m37961b(Comparator<? super K> comparator, int i, Entry<K, V>[] entryArr) {
        Arrays.sort(entryArr, 0, i, C8133r4.m38939b(comparator).mo30993f());
    }

    /* renamed from: a */
    static <K, V> C7933j3<K, V> m37946a(C8068n3<K> n3Var, C8257x2<V> x2Var) {
        if (n3Var.isEmpty()) {
            return m37952a(n3Var.comparator());
        }
        return new C7673d5((C7846f5) n3Var, x2Var);
    }

    /* renamed from: b */
    public static <K, V> C7934a<K, V> m37959b(Comparator<K> comparator) {
        return new C7934a<>(comparator);
    }

    /* renamed from: a */
    public static <K extends Comparable<? super K>, V> C7933j3<K, V> m37947a(K k, V v) {
        return m37946a(C8068n3.m38591a(k), C8257x2.m39393a(v));
    }

    /* renamed from: a */
    public static <K extends Comparable<? super K>, V> C7933j3<K, V> m37948a(K k, V v, K k2, V v2) {
        return m37954a((Comparator<? super K>) C8133r4.m38943j(), false, 2, (Entry<K, V>[]) new Entry[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2)});
    }

    /* renamed from: a */
    public static <K extends Comparable<? super K>, V> C7933j3<K, V> m37949a(K k, V v, K k2, V v2, K k3, V v3) {
        return m37954a((Comparator<? super K>) C8133r4.m38943j(), false, 3, (Entry<K, V>[]) new Entry[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3)});
    }

    /* renamed from: a */
    public static <K extends Comparable<? super K>, V> C7933j3<K, V> m37950a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return m37954a((Comparator<? super K>) C8133r4.m38943j(), false, 4, (Entry<K, V>[]) new Entry[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3), C8302z2.m39624b(k4, v4)});
    }

    /* renamed from: a */
    public static <K extends Comparable<? super K>, V> C7933j3<K, V> m37951a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return m37954a((Comparator<? super K>) C8133r4.m38943j(), false, 5, (Entry<K, V>[]) new Entry[]{C8302z2.m39624b(k, v), C8302z2.m39624b(k2, v2), C8302z2.m39624b(k3, v3), C8302z2.m39624b(k4, v4), C8302z2.m39624b(k5, v5)});
    }

    /* renamed from: a */
    public static <K, V> C7933j3<K, V> m37955a(Map<? extends K, ? extends V> map) {
        return m37960b(map, C8133r4.m38943j());
    }

    /* renamed from: a */
    public static <K, V> C7933j3<K, V> m37956a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return m37960b(map, (Comparator) C7397x.m35664a(comparator));
    }

    /* renamed from: a */
    public static <K, V> C7933j3<K, V> m37957a(SortedMap<K, ? extends V> sortedMap) {
        Comparator<Comparable> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f21669R;
        }
        return m37960b(sortedMap, comparator);
    }

    /* renamed from: a */
    static <K, V> C7933j3<K, V> m37954a(Comparator<? super K> comparator, boolean z, int i, Entry<K, V>... entryArr) {
        for (int i2 = 0; i2 < i; i2++) {
            Entry<K, V> entry = entryArr[i2];
            entryArr[i2] = C8302z2.m39624b(entry.getKey(), entry.getValue());
        }
        if (!z) {
            m37961b(comparator, i, entryArr);
            m37958a(i, entryArr, comparator);
        }
        return m37953a(comparator, i, entryArr);
    }

    /* renamed from: a */
    private static <K, V> void m37958a(int i, Entry<K, V>[] entryArr, Comparator<? super K> comparator) {
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = i2 - 1;
            C8302z2.m39623a(comparator.compare(entryArr[i3].getKey(), entryArr[i2].getKey()) != 0, "key", entryArr[i3], entryArr[i2]);
        }
    }
}
