package com.google.common.cache;

import com.google.common.collect.C7800f4;
import com.google.common.collect.C8302z2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.a */
/* compiled from: AbstractCache */
public abstract class C7420a<K, V> implements C7424c<K, V> {

    @C2775a
    /* renamed from: com.google.common.cache.a$a */
    /* compiled from: AbstractCache */
    public static final class C7421a implements C7422b {

        /* renamed from: a */
        private final C7505k f20871a = C7506l.m36155a();

        /* renamed from: b */
        private final C7505k f20872b = C7506l.m36155a();

        /* renamed from: c */
        private final C7505k f20873c = C7506l.m36155a();

        /* renamed from: d */
        private final C7505k f20874d = C7506l.m36155a();

        /* renamed from: e */
        private final C7505k f20875e = C7506l.m36155a();

        /* renamed from: f */
        private final C7505k f20876f = C7506l.m36155a();

        /* renamed from: a */
        public void mo23195a(int i) {
            this.f20871a.mo29574a((long) i);
        }

        /* renamed from: b */
        public void mo23198b(int i) {
            this.f20872b.mo29574a((long) i);
        }

        /* renamed from: a */
        public void mo23196a(long j) {
            this.f20874d.mo29573a();
            this.f20875e.mo29574a(j);
        }

        /* renamed from: b */
        public void mo23199b(long j) {
            this.f20873c.mo29573a();
            this.f20875e.mo29574a(j);
        }

        /* renamed from: a */
        public void mo23194a() {
            this.f20876f.mo29573a();
        }

        /* renamed from: b */
        public C7441f mo23197b() {
            C7441f fVar = new C7441f(this.f20871a.mo29575d(), this.f20872b.mo29575d(), this.f20873c.mo29575d(), this.f20874d.mo29575d(), this.f20875e.mo29575d(), this.f20876f.mo29575d());
            return fVar;
        }

        /* renamed from: a */
        public void mo29332a(C7422b bVar) {
            C7441f b = bVar.mo23197b();
            this.f20871a.mo29574a(b.mo29350c());
            this.f20872b.mo29574a(b.mo29358i());
            this.f20873c.mo29574a(b.mo29356h());
            this.f20874d.mo29574a(b.mo29354f());
            this.f20875e.mo29574a(b.mo29361l());
            this.f20876f.mo29574a(b.mo29348b());
        }
    }

    @C2775a
    /* renamed from: com.google.common.cache.a$b */
    /* compiled from: AbstractCache */
    public interface C7422b {
        /* renamed from: a */
        void mo23194a();

        /* renamed from: a */
        void mo23195a(int i);

        /* renamed from: a */
        void mo23196a(long j);

        /* renamed from: b */
        C7441f mo23197b();

        /* renamed from: b */
        void mo23198b(int i);

        /* renamed from: b */
        void mo23199b(long j);
    }

    protected C7420a() {
    }

    /* renamed from: a */
    public V mo29321a(K k, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo29322b(Iterable<?> iterable) {
        for (Object g : iterable) {
            mo29325g(g);
        }
    }

    /* renamed from: c */
    public C8302z2<K, V> mo29323c(Iterable<?> iterable) {
        LinkedHashMap e = C7800f4.m37347e();
        for (Object next : iterable) {
            if (!e.containsKey(next)) {
                e.put(next, mo29336f(next));
            }
        }
        return C8302z2.m39622a(e);
    }

    public void cleanUp() {
    }

    /* renamed from: g */
    public void mo29325g(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public ConcurrentMap<K, V> mo29326j() {
        throw new UnsupportedOperationException();
    }

    public void put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: r */
    public C7441f mo29329r() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public void mo29330s() {
        throw new UnsupportedOperationException();
    }

    public long size() {
        throw new UnsupportedOperationException();
    }
}
