package com.google.common.collect;

import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.u1 */
/* compiled from: ForwardingListMultimap */
public abstract class C8213u1<K, V> extends C8256x1<K, V> implements C8283y3<K, V> {
    protected C8213u1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8283y3<K, V> m39179y();

    /* renamed from: a */
    public List<V> m39175a(K k, Iterable<? extends V> iterable) {
        return m39180y().mo29698a(k, iterable);
    }

    /* renamed from: e */
    public List<V> m39177e(@C5952h Object obj) {
        return m39180y().mo29699e(obj);
    }

    public List<V> get(@C5952h K k) {
        return m39180y().get(k);
    }
}
