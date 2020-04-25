package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
class C4875m6<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Map<K, V> f14268N;

    /* renamed from: O */
    private boolean f14269O;

    /* renamed from: P */
    private volatile C4995t6 f14270P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Map<K, V> f14271Q;

    /* renamed from: R */
    private volatile C4888n6 f14272R;

    /* renamed from: a */
    private final int f14273a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C4946r6> f14274b;

    private C4875m6(int i) {
        this.f14273a = i;
        this.f14274b = Collections.emptyList();
        this.f14268N = Collections.emptyMap();
        this.f14271Q = Collections.emptyMap();
    }

    /* renamed from: b */
    static <FieldDescriptorType extends C5071z3<FieldDescriptorType>> C4875m6<FieldDescriptorType, Object> m20684b(int i) {
        return new C4862l6(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m20689f() {
        if (this.f14269O) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m20690g() {
        m20689f();
        if (this.f14268N.isEmpty() && !(this.f14268N instanceof TreeMap)) {
            this.f14268N = new TreeMap();
            this.f14271Q = ((TreeMap) this.f14268N).descendingMap();
        }
        return (SortedMap) this.f14268N;
    }

    /* renamed from: a */
    public void mo19268a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f14269O) {
            if (this.f14268N.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f14268N);
            }
            this.f14268N = map;
            if (this.f14271Q.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f14271Q);
            }
            this.f14271Q = map2;
            this.f14269O = true;
        }
    }

    /* renamed from: c */
    public final int mo19300c() {
        return this.f14274b.size();
    }

    public void clear() {
        m20689f();
        if (!this.f14274b.isEmpty()) {
            this.f14274b.clear();
        }
        if (!this.f14268N.isEmpty()) {
            this.f14268N.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m20681a((K) comparable) >= 0 || this.f14268N.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo19303d() {
        if (this.f14268N.isEmpty()) {
            return C4933q6.m21018a();
        }
        return this.f14268N.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo19304e() {
        if (this.f14272R == null) {
            this.f14272R = new C4888n6(this, null);
        }
        return this.f14272R;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f14270P == null) {
            this.f14270P = new C4995t6(this, null);
        }
        return this.f14270P;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4875m6)) {
            return super.equals(obj);
        }
        C4875m6 m6Var = (C4875m6) obj;
        int size = size();
        if (size != m6Var.size()) {
            return false;
        }
        int c = mo19300c();
        if (c != m6Var.mo19300c()) {
            return entrySet().equals(m6Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo19298a(i).equals(m6Var.mo19298a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f14268N.equals(m6Var.f14268N);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m20681a((K) comparable);
        if (a >= 0) {
            return ((C4946r6) this.f14274b.get(a)).getValue();
        }
        return this.f14268N.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo19300c(); i2++) {
            i += ((C4946r6) this.f14274b.get(i2)).hashCode();
        }
        return this.f14268N.size() > 0 ? i + this.f14268N.hashCode() : i;
    }

    public V remove(Object obj) {
        m20689f();
        Comparable comparable = (Comparable) obj;
        int a = m20681a((K) comparable);
        if (a >= 0) {
            return m20686c(a);
        }
        if (this.f14268N.isEmpty()) {
            return null;
        }
        return this.f14268N.remove(comparable);
    }

    public int size() {
        return this.f14274b.size() + this.f14268N.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m20686c(int i) {
        m20689f();
        V value = ((C4946r6) this.f14274b.remove(i)).getValue();
        if (!this.f14268N.isEmpty()) {
            Iterator it = m20690g().entrySet().iterator();
            this.f14274b.add(new C4946r6(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: b */
    public final boolean mo19299b() {
        return this.f14269O;
    }

    /* synthetic */ C4875m6(int i, C4862l6 l6Var) {
        this(i);
    }

    /* renamed from: a */
    public final Entry<K, V> mo19298a(int i) {
        return (Entry) this.f14274b.get(i);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m20689f();
        int a = m20681a(k);
        if (a >= 0) {
            return ((C4946r6) this.f14274b.get(a)).setValue(v);
        }
        m20689f();
        if (this.f14274b.isEmpty() && !(this.f14274b instanceof ArrayList)) {
            this.f14274b = new ArrayList(this.f14273a);
        }
        int i = -(a + 1);
        if (i >= this.f14273a) {
            return m20690g().put(k, v);
        }
        int size = this.f14274b.size();
        int i2 = this.f14273a;
        if (size == i2) {
            C4946r6 r6Var = (C4946r6) this.f14274b.remove(i2 - 1);
            m20690g().put((Comparable) r6Var.getKey(), r6Var.getValue());
        }
        this.f14274b.add(i, new C4946r6(this, k, v));
        return null;
    }

    /* renamed from: a */
    private final int m20681a(K k) {
        int size = this.f14274b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C4946r6) this.f14274b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C4946r6) this.f14274b.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
