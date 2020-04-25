package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.h4 */
/* compiled from: Multimap */
public interface C7886h4<K, V> {
    /* renamed from: a */
    Collection<V> mo29698a(@C5952h K k, Iterable<? extends V> iterable);

    /* renamed from: a */
    boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var);

    /* renamed from: b */
    boolean mo29702b(@C5952h K k, Iterable<? extends V> iterable);

    /* renamed from: c */
    boolean mo29884c(@C5952h Object obj, @C5952h Object obj2);

    void clear();

    boolean containsKey(@C5952h Object obj);

    boolean containsValue(@C5952h Object obj);

    /* renamed from: e */
    Collection<V> mo29699e(@C5952h Object obj);

    boolean equals(@C5952h Object obj);

    Collection<V> get(@C5952h K k);

    int hashCode();

    boolean isEmpty();

    /* renamed from: j */
    Map<K, Collection<V>> mo29703j();

    Set<K> keySet();

    /* renamed from: m */
    Collection<Entry<K, V>> mo29704m();

    /* renamed from: n */
    C7982k4<K> mo29889n();

    boolean put(@C5952h K k, @C5952h V v);

    boolean remove(@C5952h Object obj, @C5952h Object obj2);

    int size();

    Collection<V> values();
}
