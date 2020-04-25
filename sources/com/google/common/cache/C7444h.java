package com.google.common.cache;

import com.google.common.base.C7397x;
import com.google.common.collect.C8302z2;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.cache.h */
/* compiled from: ForwardingLoadingCache */
public abstract class C7444h<K, V> extends C7442g<K, V> implements C7446i<K, V> {

    @C2775a
    /* renamed from: com.google.common.cache.h$a */
    /* compiled from: ForwardingLoadingCache */
    public static abstract class C7445a<K, V> extends C7444h<K, V> {

        /* renamed from: a */
        private final C7446i<K, V> f20904a;

        protected C7445a(C7446i<K, V> iVar) {
            this.f20904a = (C7446i) C7397x.m35664a(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final C7446i<K, V> m35803y() {
            return this.f20904a;
        }
    }

    protected C7444h() {
    }

    /* renamed from: a */
    public C8302z2<K, V> mo29333a(Iterable<? extends K> iterable) throws ExecutionException {
        return m35801y().mo29333a(iterable);
    }

    public V apply(K k) {
        return m35801y().apply(k);
    }

    /* renamed from: c */
    public V mo29334c(K k) {
        return m35801y().mo29334c(k);
    }

    /* renamed from: d */
    public void mo29335d(K k) {
        m35801y().mo29335d(k);
    }

    public V get(K k) throws ExecutionException {
        return m35801y().get(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C7446i<K, V> m35800y();
}
