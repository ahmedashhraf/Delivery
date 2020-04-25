package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.y5 */
/* compiled from: SortedSetMultimap */
public interface C8291y5<K, V> extends C8022l5<K, V> {
    /* renamed from: a */
    SortedSet<V> mo29698a(K k, Iterable<? extends V> iterable);

    /* renamed from: e */
    SortedSet<V> mo29699e(@C5952h Object obj);

    SortedSet<V> get(@C5952h K k);

    /* renamed from: j */
    Map<K, Collection<V>> mo29703j();

    /* renamed from: q */
    Comparator<? super V> mo29707q();
}
