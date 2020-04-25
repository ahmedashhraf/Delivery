package p205i.p486d.p487a.p488c;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: i.d.a.c.c */
/* compiled from: LruCache */
public class C14060c<K, V> extends LinkedHashMap<K, V> implements C14056a<K, V> {

    /* renamed from: O */
    private static final int f41317O = 50;
    private static final long serialVersionUID = -4980809402073634607L;

    /* renamed from: N */
    private final AtomicLong f41318N;

    /* renamed from: a */
    private int f41319a;

    /* renamed from: b */
    private final AtomicLong f41320b;

    public C14060c(int i) {
        int i2 = 50;
        if (i < 50) {
            i2 = i;
        }
        super(i2, 0.75f, true);
        this.f41320b = new AtomicLong();
        this.f41318N = new AtomicLong();
        if (i != 0) {
            this.f41319a = i;
            return;
        }
        throw new IllegalArgumentException("Max cache size cannot be 0.");
    }

    /* renamed from: a */
    public final void mo44384a(int i) {
        this.f41319a = i;
    }

    public final void clear() {
        synchronized (this) {
            super.clear();
        }
        this.f41320b.set(0);
        this.f41318N.set(0);
    }

    public final synchronized boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final synchronized boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: d */
    public final int mo44385d() {
        return this.f41319a;
    }

    /* renamed from: e */
    public final long mo44409e() {
        return this.f41320b.longValue();
    }

    public final synchronized Set<Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    /* renamed from: f */
    public final long mo44411f() {
        return this.f41318N.longValue();
    }

    public final V get(Object obj) {
        V v;
        synchronized (this) {
            v = super.get(obj);
        }
        if (v == null) {
            this.f41318N.incrementAndGet();
            return null;
        }
        this.f41320b.incrementAndGet();
        return v;
    }

    public final synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    public final synchronized Set<K> keySet() {
        return super.keySet();
    }

    public final synchronized V put(K k, V v) {
        return super.put(k, v);
    }

    public final synchronized void putAll(Map<? extends K, ? extends V> map) {
        super.putAll(map);
    }

    public final synchronized V remove(Object obj) {
        return super.remove(obj);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        return size() > this.f41319a;
    }

    public final synchronized int size() {
        return super.size();
    }

    public final synchronized Collection<V> values() {
        return super.values();
    }
}
