package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.s */
/* compiled from: BiMap */
public interface C8139s<K, V> extends Map<K, V> {
    /* renamed from: a */
    V mo29602a(@C5952h K k, @C5952h V v);

    /* renamed from: k */
    C8139s<V, K> mo29607k();

    V put(@C5952h K k, @C5952h V v);

    void putAll(Map<? extends K, ? extends V> map);

    Set<V> values();
}
