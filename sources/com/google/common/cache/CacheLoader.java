package com.google.common.cache;

import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.util.concurrent.C8437a0;
import com.google.common.util.concurrent.C8473c0;
import com.google.common.util.concurrent.C8480d0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.cache.CacheLoader$a */
    static class C7415a extends CacheLoader<K, V> {

        /* renamed from: a */
        final /* synthetic */ CacheLoader f20864a;

        /* renamed from: b */
        final /* synthetic */ Executor f20865b;

        /* renamed from: com.google.common.cache.CacheLoader$a$a */
        class C7416a implements Callable<V> {

            /* renamed from: a */
            final /* synthetic */ Object f20867a;

            /* renamed from: b */
            final /* synthetic */ Object f20868b;

            C7416a(Object obj, Object obj2) {
                this.f20867a = obj;
                this.f20868b = obj2;
            }

            public V call() throws Exception {
                return C7415a.this.f20864a.mo29317a(this.f20867a, this.f20868b).get();
            }
        }

        C7415a(CacheLoader cacheLoader, Executor executor) {
            this.f20864a = cacheLoader;
            this.f20865b = executor;
        }

        /* renamed from: a */
        public V mo29318a(K k) throws Exception {
            return this.f20864a.mo29318a(k);
        }

        /* renamed from: a */
        public C8473c0<V> mo29317a(K k, V v) throws Exception {
            C8480d0 a = C8480d0.m40126a(new C7416a(k, v));
            this.f20865b.execute(a);
            return a;
        }

        /* renamed from: a */
        public Map<K, V> mo29319a(Iterable<? extends K> iterable) throws Exception {
            return this.f20864a.mo29319a(iterable);
        }
    }

    /* renamed from: com.google.common.cache.CacheLoader$b */
    private static final class C7417b<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7380p<K, V> f20869a;

        public C7417b(C7380p<K, V> pVar) {
            this.f20869a = (C7380p) C7397x.m35664a(pVar);
        }

        /* renamed from: a */
        public V mo29318a(K k) {
            return this.f20869a.apply(C7397x.m35664a(k));
        }
    }

    /* renamed from: com.google.common.cache.CacheLoader$c */
    private static final class C7418c<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7344g0<V> f20870a;

        public C7418c(C7344g0<V> g0Var) {
            this.f20870a = (C7344g0) C7397x.m35664a(g0Var);
        }

        /* renamed from: a */
        public V mo29318a(Object obj) {
            C7397x.m35664a(obj);
            return this.f20870a.get();
        }
    }

    /* renamed from: com.google.common.cache.CacheLoader$d */
    static final class C7419d extends UnsupportedOperationException {
        C7419d() {
        }
    }

    protected CacheLoader() {
    }

    @C2777c("Futures")
    /* renamed from: a */
    public C8473c0<V> mo29317a(K k, V v) throws Exception {
        C7397x.m35664a(k);
        C7397x.m35664a(v);
        return C8437a0.m40043b(mo29318a(k));
    }

    /* renamed from: a */
    public abstract V mo29318a(K k) throws Exception;

    /* renamed from: a */
    public Map<K, V> mo29319a(Iterable<? extends K> iterable) throws Exception {
        throw new C7419d();
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> CacheLoader<K, V> m35707a(C7380p<K, V> pVar) {
        return new C7417b(pVar);
    }

    @C2775a
    /* renamed from: a */
    public static <V> CacheLoader<Object, V> m35706a(C7344g0<V> g0Var) {
        return new C7418c(g0Var);
    }

    @C2777c("Executor + Futures")
    @C2775a
    /* renamed from: a */
    public static <K, V> CacheLoader<K, V> m35708a(CacheLoader<K, V> cacheLoader, Executor executor) {
        C7397x.m35664a(cacheLoader);
        C7397x.m35664a(executor);
        return new C7415a(cacheLoader, executor);
    }
}
