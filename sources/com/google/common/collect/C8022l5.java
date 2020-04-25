package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.l5 */
/* compiled from: SetMultimap */
public interface C8022l5<K, V> extends C7886h4<K, V> {
    /* renamed from: a */
    Set<V> mo29698a(K k, Iterable<? extends V> iterable);

    /* renamed from: e */
    Set<V> mo29699e(@C5952h Object obj);

    boolean equals(@C5952h Object obj);

    Set<V> get(@C5952h K k);

    /* renamed from: j */
    Map<K, Collection<V>> mo29703j();

    /* renamed from: m */
    Set<Entry<K, V>> mo29704m();
}
