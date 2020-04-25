package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.m1 */
/* compiled from: ForwardingConcurrentMap */
public abstract class C8027m1<K, V> extends C8220v1<K, V> implements ConcurrentMap<K, V> {
    protected C8027m1() {
    }

    public V putIfAbsent(K k, V v) {
        return m38447y().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return m38447y().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return m38447y().replace(k, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract ConcurrentMap<K, V> m38448y();

    public boolean replace(K k, V v, V v2) {
        return m38447y().replace(k, v, v2);
    }
}
