package com.google.common.collect;

import com.google.common.base.C5827t;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.v1 */
/* compiled from: ForwardingMap */
public abstract class C8220v1<K, V> extends C8301z1 implements Map<K, V> {

    @C2775a
    /* renamed from: com.google.common.collect.v1$a */
    /* compiled from: ForwardingMap */
    protected abstract class C8221a extends C7828o<K, V> {
        public C8221a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo29777b() {
            return C8220v1.this;
        }
    }

    @C2775a
    /* renamed from: com.google.common.collect.v1$b */
    /* compiled from: ForwardingMap */
    protected class C8222b extends C7842w<K, V> {
        public C8222b() {
            super(C8220v1.this);
        }
    }

    @C2775a
    /* renamed from: com.google.common.collect.v1$c */
    /* compiled from: ForwardingMap */
    protected class C8223c extends C7818h0<K, V> {
        public C8223c() {
            super(C8220v1.this);
        }
    }

    protected C8220v1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo31108A() {
        return C8047m5.m38502a(entrySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo31109C() {
        return !entrySet().iterator().hasNext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo31110D() {
        return C7800f4.m37350f(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31111a(Map<? extends K, ? extends V> map) {
        C7800f4.m37329b((Map<K, V>) this, map);
    }

    public void clear() {
        mo26777y().clear();
    }

    public boolean containsKey(@C5952h Object obj) {
        return mo26777y().containsKey(obj);
    }

    public boolean containsValue(@C5952h Object obj) {
        return mo26777y().containsValue(obj);
    }

    public Set<Entry<K, V>> entrySet() {
        return mo26777y().entrySet();
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this || mo26777y().equals(obj);
    }

    public V get(@C5952h Object obj) {
        return mo26777y().get(obj);
    }

    public int hashCode() {
        return mo26777y().hashCode();
    }

    public boolean isEmpty() {
        return mo26777y().isEmpty();
    }

    public Set<K> keySet() {
        return mo26777y().keySet();
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: l */
    public boolean mo29936l(@C5952h Object obj) {
        return C7800f4.m37309a((Map<?, ?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo31116m(@C5952h Object obj) {
        return C7800f4.m37331b((Map<?, ?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo31117n(@C5952h Object obj) {
        return C7800f4.m37340c((Map<?, ?>) this, obj);
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: o */
    public V mo31118o(@C5952h Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (C5827t.m25562a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public V put(K k, V v) {
        return mo26777y().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo26777y().putAll(map);
    }

    public V remove(Object obj) {
        return mo26777y().remove(obj);
    }

    public int size() {
        return mo26777y().size();
    }

    public Collection<V> values() {
        return mo26777y().values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Map<K, V> m39221y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo31120z() {
        C8178t3.m39123c(entrySet().iterator());
    }
}
