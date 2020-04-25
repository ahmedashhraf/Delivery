package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.d */
/* compiled from: AbstractListMultimap */
abstract class C7647d<K, V> extends C7679e<K, V> implements C8283y3<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected C7647d(Map<K, Collection<V>> map) {
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
    public abstract List<V> m36564l();

    public boolean put(@C5952h K k, @C5952h V v) {
        return super.put(k, v);
    }

    /* renamed from: a */
    public List<V> m36559a(@C5952h K k, Iterable<? extends V> iterable) {
        return (List) super.mo29698a(k, iterable);
    }

    /* renamed from: e */
    public List<V> m36561e(@C5952h Object obj) {
        return (List) super.mo29699e(obj);
    }

    public List<V> get(@C5952h K k) {
        return (List) super.get(k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public List<V> m36566r() {
        return C8257x2.m39412m();
    }
}
