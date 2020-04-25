package androidx.collection;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: androidx.collection.a */
/* compiled from: ArrayMap */
public class C0635a<K, V> extends C0649h<K, V> implements Map<K, V> {
    @C0195i0

    /* renamed from: X */
    C0643g<K, V> f2500X;

    /* renamed from: androidx.collection.a$a */
    /* compiled from: ArrayMap */
    class C0636a extends C0643g<K, V> {
        C0636a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo3216a(int i, int i2) {
            return C0635a.this.f2559b[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo3221b(Object obj) {
            return C0635a.this.mo3362c(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo3223c() {
            return C0635a.this.f2557N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo3215a(Object obj) {
            return C0635a.this.mo3360b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo3222b() {
            return C0635a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3220a(K k, V v) {
            C0635a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo3217a(int i, V v) {
            return C0635a.this.mo3357a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3219a(int i) {
            C0635a.this.mo3363c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3218a() {
            C0635a.this.clear();
        }
    }

    public C0635a() {
    }

    /* renamed from: b */
    private C0643g<K, V> m3365b() {
        if (this.f2500X == null) {
            this.f2500X = new C0636a();
        }
        return this.f2500X;
    }

    /* renamed from: a */
    public boolean mo3208a(@C0193h0 Collection<?> collection) {
        return C0643g.m3452a((Map<K, V>) this, collection);
    }

    /* renamed from: c */
    public boolean mo3210c(@C0193h0 Collection<?> collection) {
        return C0643g.m3455c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m3365b().mo3296d();
    }

    public Set<K> keySet() {
        return m3365b().mo3297e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo3358a(this.f2557N + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m3365b().mo3298f();
    }

    public C0635a(int i) {
        super(i);
    }

    public C0635a(C0649h hVar) {
        super(hVar);
    }

    /* renamed from: b */
    public boolean mo3209b(@C0193h0 Collection<?> collection) {
        return C0643g.m3454b(this, collection);
    }
}
