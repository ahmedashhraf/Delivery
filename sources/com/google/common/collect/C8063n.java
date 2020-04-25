package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.n */
/* compiled from: AbstractSortedSetMultimap */
abstract class C8063n<K, V> extends C7971k<K, V> implements C8291y5<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    protected C8063n(Map<K, Collection<V>> map) {
        super(map);
    }

    /* renamed from: j */
    public Map<K, Collection<V>> mo29703j() {
        return super.mo29703j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public abstract SortedSet<V> m38560l();

    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: a */
    public SortedSet<V> m38553a(@C5952h K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.mo29698a((Object) k, (Iterable) iterable);
    }

    /* renamed from: e */
    public SortedSet<V> m38556e(@C5952h Object obj) {
        return (SortedSet) super.mo29699e(obj);
    }

    public SortedSet<V> get(@C5952h K k) {
        return (SortedSet) super.get((Object) k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public SortedSet<V> m38563r() {
        if (mo29707q() == null) {
            return Collections.unmodifiableSortedSet(m38559l());
        }
        return C8068n3.m38599a(mo29707q());
    }
}
