package com.google.common.collect;

import java.util.Collection;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.l */
/* compiled from: AbstractSortedKeySortedSetMultimap */
abstract class C7995l<K, V> extends C8063n<K, V> {
    C7995l(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    /* renamed from: j */
    public SortedMap<K, Collection<V>> m38260j() {
        return (SortedMap) super.mo29703j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public SortedMap<K, Collection<V>> m38262k() {
        return (SortedMap) super.mo30003k();
    }

    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
