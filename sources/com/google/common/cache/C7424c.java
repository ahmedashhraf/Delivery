package com.google.common.cache;

import com.google.common.collect.C8302z2;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.c */
/* compiled from: Cache */
public interface C7424c<K, V> {
    /* renamed from: a */
    V mo29321a(K k, Callable<? extends V> callable) throws ExecutionException;

    /* renamed from: b */
    void mo29322b(Iterable<?> iterable);

    /* renamed from: c */
    C8302z2<K, V> mo29323c(Iterable<?> iterable);

    void cleanUp();

    @C5952h
    /* renamed from: f */
    V mo29336f(Object obj);

    /* renamed from: g */
    void mo29325g(Object obj);

    /* renamed from: j */
    ConcurrentMap<K, V> mo29326j();

    void put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    /* renamed from: r */
    C7441f mo29329r();

    /* renamed from: s */
    void mo29330s();

    long size();
}
