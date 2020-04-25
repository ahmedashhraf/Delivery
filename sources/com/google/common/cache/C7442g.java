package com.google.common.cache;

import com.google.common.base.C7397x;
import com.google.common.collect.C8301z1;
import com.google.common.collect.C8302z2;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.cache.g */
/* compiled from: ForwardingCache */
public abstract class C7442g<K, V> extends C8301z1 implements C7424c<K, V> {

    @C2775a
    /* renamed from: com.google.common.cache.g$a */
    /* compiled from: ForwardingCache */
    public static abstract class C7443a<K, V> extends C7442g<K, V> {

        /* renamed from: a */
        private final C7424c<K, V> f20903a;

        protected C7443a(C7424c<K, V> cVar) {
            this.f20903a = (C7424c) C7397x.m35664a(cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final C7424c<K, V> m35795y() {
            return this.f20903a;
        }
    }

    protected C7442g() {
    }

    /* renamed from: a */
    public V mo29321a(K k, Callable<? extends V> callable) throws ExecutionException {
        return m35793y().mo29321a(k, callable);
    }

    /* renamed from: b */
    public void mo29322b(Iterable<?> iterable) {
        m35793y().mo29322b(iterable);
    }

    /* renamed from: c */
    public C8302z2<K, V> mo29323c(Iterable<?> iterable) {
        return m35793y().mo29323c(iterable);
    }

    public void cleanUp() {
        m35793y().cleanUp();
    }

    @C5952h
    /* renamed from: f */
    public V mo29336f(Object obj) {
        return m35793y().mo29336f(obj);
    }

    /* renamed from: g */
    public void mo29325g(Object obj) {
        m35793y().mo29325g(obj);
    }

    /* renamed from: j */
    public ConcurrentMap<K, V> mo29326j() {
        return m35793y().mo29326j();
    }

    public void put(K k, V v) {
        m35793y().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m35793y().putAll(map);
    }

    /* renamed from: r */
    public C7441f mo29329r() {
        return m35793y().mo29329r();
    }

    /* renamed from: s */
    public void mo29330s() {
        m35793y().mo29330s();
    }

    public long size() {
        return m35793y().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C7424c<K, V> m35793y();
}
