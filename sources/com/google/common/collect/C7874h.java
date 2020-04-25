package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.h */
/* compiled from: AbstractMultimap */
abstract class C7874h<K, V> implements C7886h4<K, V> {

    /* renamed from: N */
    private transient C7982k4<K> f21599N;

    /* renamed from: O */
    private transient Collection<V> f21600O;

    /* renamed from: P */
    private transient Map<K, Collection<V>> f21601P;

    /* renamed from: a */
    private transient Collection<Entry<K, V>> f21602a;

    /* renamed from: b */
    private transient Set<K> f21603b;

    /* renamed from: com.google.common.collect.h$b */
    /* compiled from: AbstractMultimap */
    private class C7876b extends C7944f<K, V> {
        private C7876b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7886h4<K, V> mo30527b() {
            return C7874h.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return C7874h.this.mo29807h();
        }
    }

    /* renamed from: com.google.common.collect.h$c */
    /* compiled from: AbstractMultimap */
    private class C7877c extends C7876b implements Set<Entry<K, V>> {
        private C7877c() {
            super();
        }

        public boolean equals(@C5952h Object obj) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C8047m5.m38502a((Set<?>) this);
        }
    }

    /* renamed from: com.google.common.collect.h$d */
    /* compiled from: AbstractMultimap */
    class C7878d extends AbstractCollection<V> {
        C7878d() {
        }

        public void clear() {
            C7874h.this.clear();
        }

        public boolean contains(@C5952h Object obj) {
            return C7874h.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C7874h.this.mo30002i();
        }

        public int size() {
            return C7874h.this.size();
        }
    }

    C7874h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo29800a();

    /* renamed from: a */
    public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
        boolean z = false;
        for (Entry entry : h4Var.mo29704m()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo29702b(@C5952h K k, Iterable<? extends V> iterable) {
        C7397x.m35664a(iterable);
        boolean z = true;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                z = false;
            }
            return z;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || !C8178t3.m39106a(get(k), it)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo29884c(@C5952h Object obj, @C5952h Object obj2) {
        Collection collection = (Collection) mo29703j().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(@C5952h Object obj) {
        for (Collection contains : mo29703j().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Collection<Entry<K, V>> mo29804d() {
        if (this instanceof C8022l5) {
            return new C7877c();
        }
        return new C7876b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<K> mo30001e() {
        return new C7842w(mo29703j());
    }

    public boolean equals(@C5952h Object obj) {
        return C7936j4.m37997a((C7886h4<?, ?>) this, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C7982k4<K> mo29805f() {
        return new C7945g(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Collection<V> mo29806g() {
        return new C7878d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract Iterator<Entry<K, V>> mo29807h();

    public int hashCode() {
        return mo29703j().hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Iterator<V> mo30002i() {
        return C7800f4.m37319b(mo29704m().iterator());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public Map<K, Collection<V>> mo29703j() {
        Map<K, Collection<V>> map = this.f21601P;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a = mo29800a();
        this.f21601P = a;
        return a;
    }

    public Set<K> keySet() {
        Set<K> set = this.f21603b;
        if (set != null) {
            return set;
        }
        Set<K> e = mo30001e();
        this.f21603b = e;
        return e;
    }

    /* renamed from: m */
    public Collection<Entry<K, V>> mo29704m() {
        Collection<Entry<K, V>> collection = this.f21602a;
        if (collection != null) {
            return collection;
        }
        Collection<Entry<K, V>> d = mo29804d();
        this.f21602a = d;
        return d;
    }

    /* renamed from: n */
    public C7982k4<K> mo29889n() {
        C7982k4<K> k4Var = this.f21599N;
        if (k4Var != null) {
            return k4Var;
        }
        C7982k4<K> f = mo29805f();
        this.f21599N = f;
        return f;
    }

    public boolean put(@C5952h K k, @C5952h V v) {
        return get(k).add(v);
    }

    public boolean remove(@C5952h Object obj, @C5952h Object obj2) {
        Collection collection = (Collection) mo29703j().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo29703j().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f21600O;
        if (collection != null) {
            return collection;
        }
        Collection<V> g = mo29806g();
        this.f21600O = g;
        return g;
    }

    /* renamed from: a */
    public Collection<V> mo29698a(@C5952h K k, Iterable<? extends V> iterable) {
        C7397x.m35664a(iterable);
        Collection<V> e = mo29699e(k);
        mo29702b(k, iterable);
        return e;
    }
}
