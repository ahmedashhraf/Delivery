package com.google.common.collect;

import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.c2 */
/* compiled from: ForwardingSetMultimap */
public abstract class C7617c2<K, V> extends C8256x1<K, V> implements C8022l5<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8022l5<K, V> m36444y();

    /* renamed from: a */
    public Set<V> m36438a(K k, Iterable<? extends V> iterable) {
        return m36445y().mo29698a(k, iterable);
    }

    /* renamed from: e */
    public Set<V> m36440e(@C5952h Object obj) {
        return m36445y().mo29699e(obj);
    }

    public Set<V> get(@C5952h K k) {
        return m36445y().get(k);
    }

    /* renamed from: m */
    public Set<Entry<K, V>> m36442m() {
        return m36445y().mo29704m();
    }
}
