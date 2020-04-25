package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.k */
/* compiled from: AbstractSetMultimap */
abstract class C7971k<K, V> extends C7679e<K, V> implements C8022l5<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected C7971k(Map<K, Collection<V>> map) {
        super(map);
    }

    public boolean equals(@C5952h Object obj) {
        return super.equals(obj);
    }

    /* renamed from: j */
    public Map<K, Collection<V>> mo29703j() {
        return super.mo29703j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public abstract Set<V> m38185l();

    public boolean put(@C5952h K k, @C5952h V v) {
        return super.put(k, v);
    }

    /* renamed from: a */
    public Set<V> m38180a(@C5952h K k, Iterable<? extends V> iterable) {
        return (Set) super.mo29698a(k, iterable);
    }

    /* renamed from: e */
    public Set<V> m38182e(@C5952h Object obj) {
        return (Set) super.mo29699e(obj);
    }

    public Set<V> get(@C5952h K k) {
        return (Set) super.get(k);
    }

    /* renamed from: m */
    public Set<Entry<K, V>> m38187m() {
        return (Set) super.mo29704m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Set<V> m38189r() {
        return C7859g3.m37512m();
    }
}
