package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.y3 */
/* compiled from: ListMultimap */
public interface C8283y3<K, V> extends C7886h4<K, V> {
    /* renamed from: a */
    List<V> mo29698a(K k, Iterable<? extends V> iterable);

    /* renamed from: e */
    List<V> mo29699e(@C5952h Object obj);

    boolean equals(@C5952h Object obj);

    List<V> get(@C5952h K k);

    /* renamed from: j */
    Map<K, Collection<V>> mo29703j();
}
