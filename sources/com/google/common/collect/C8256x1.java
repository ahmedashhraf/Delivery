package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.x1 */
/* compiled from: ForwardingMultimap */
public abstract class C8256x1<K, V> extends C8301z1 implements C7886h4<K, V> {
    protected C8256x1() {
    }

    /* renamed from: a */
    public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
        return m39391y().mo29701a(h4Var);
    }

    /* renamed from: b */
    public boolean mo29702b(K k, Iterable<? extends V> iterable) {
        return m39391y().mo29702b(k, iterable);
    }

    /* renamed from: c */
    public boolean mo29884c(@C5952h Object obj, @C5952h Object obj2) {
        return m39391y().mo29884c(obj, obj2);
    }

    public void clear() {
        m39391y().clear();
    }

    public boolean containsKey(@C5952h Object obj) {
        return m39391y().containsKey(obj);
    }

    public boolean containsValue(@C5952h Object obj) {
        return m39391y().containsValue(obj);
    }

    /* renamed from: e */
    public Collection<V> mo29699e(@C5952h Object obj) {
        return m39391y().mo29699e(obj);
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this || m39391y().equals(obj);
    }

    public Collection<V> get(@C5952h K k) {
        return m39391y().get(k);
    }

    public int hashCode() {
        return m39391y().hashCode();
    }

    public boolean isEmpty() {
        return m39391y().isEmpty();
    }

    /* renamed from: j */
    public Map<K, Collection<V>> mo29703j() {
        return m39391y().mo29703j();
    }

    public Set<K> keySet() {
        return m39391y().keySet();
    }

    /* renamed from: m */
    public Collection<Entry<K, V>> mo29704m() {
        return m39391y().mo29704m();
    }

    /* renamed from: n */
    public C7982k4<K> mo29889n() {
        return m39391y().mo29889n();
    }

    public boolean put(K k, V v) {
        return m39391y().put(k, v);
    }

    public boolean remove(@C5952h Object obj, @C5952h Object obj2) {
        return m39391y().remove(obj, obj2);
    }

    public int size() {
        return m39391y().size();
    }

    public Collection<V> values() {
        return m39391y().values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C7886h4<K, V> m39391y();

    /* renamed from: a */
    public Collection<V> mo29698a(K k, Iterable<? extends V> iterable) {
        return m39391y().mo29698a(k, iterable);
    }
}
