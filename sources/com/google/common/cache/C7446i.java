package com.google.common.cache;

import com.google.common.base.C7380p;
import com.google.common.collect.C8302z2;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.i */
/* compiled from: LoadingCache */
public interface C7446i<K, V> extends C7424c<K, V>, C7380p<K, V> {
    /* renamed from: a */
    C8302z2<K, V> mo29333a(Iterable<? extends K> iterable) throws ExecutionException;

    @Deprecated
    V apply(K k);

    /* renamed from: c */
    V mo29334c(K k);

    /* renamed from: d */
    void mo29335d(K k);

    V get(K k) throws ExecutionException;

    /* renamed from: j */
    ConcurrentMap<K, V> mo29326j();
}
