package com.google.common.collect;

import com.google.common.collect.C7677d6.C7678a;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.o */
/* compiled from: AbstractTable */
abstract class C8074o<R, C, V> implements C7677d6<R, C, V> {

    /* renamed from: a */
    private transient Set<C7678a<R, C, V>> f21876a;

    /* renamed from: b */
    private transient Collection<V> f21877b;

    /* renamed from: com.google.common.collect.o$a */
    /* compiled from: AbstractTable */
    class C8075a extends C7847f6<C7678a<R, C, V>, V> {
        C8075a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30361a(C7678a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* renamed from: com.google.common.collect.o$b */
    /* compiled from: AbstractTable */
    class C8076b extends AbstractSet<C7678a<R, C, V>> {
        C8076b() {
        }

        public void clear() {
            C8074o.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C7678a)) {
                return false;
            }
            C7678a aVar = (C7678a) obj;
            Map map = (Map) C7800f4.m37346e(C8074o.this.mo29650v(), aVar.mo29993d());
            if (map == null || !C8292z.m39592a((Collection<?>) map.entrySet(), (Object) C7800f4.m37291a(aVar.mo29992a(), aVar.getValue()))) {
                return false;
            }
            return true;
        }

        public Iterator<C7678a<R, C, V>> iterator() {
            return C8074o.this.mo29714a();
        }

        public boolean remove(@C5952h Object obj) {
            if (!(obj instanceof C7678a)) {
                return false;
            }
            C7678a aVar = (C7678a) obj;
            Map map = (Map) C7800f4.m37346e(C8074o.this.mo29650v(), aVar.mo29993d());
            if (map == null || !C8292z.m39598b((Collection<?>) map.entrySet(), (Object) C7800f4.m37291a(aVar.mo29992a(), aVar.getValue()))) {
                return false;
            }
            return true;
        }

        public int size() {
            return C8074o.this.size();
        }
    }

    /* renamed from: com.google.common.collect.o$c */
    /* compiled from: AbstractTable */
    class C8077c extends AbstractCollection<V> {
        C8077c() {
        }

        public void clear() {
            C8074o.this.clear();
        }

        public boolean contains(Object obj) {
            return C8074o.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C8074o.this.mo30888f();
        }

        public int size() {
            return C8074o.this.size();
        }
    }

    C8074o() {
    }

    /* renamed from: a */
    public V mo29713a(R r, C c, V v) {
        return mo29724k(r).put(c, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Iterator<C7678a<R, C, V>> mo29714a();

    /* renamed from: b */
    public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
        Map map = (Map) C7800f4.m37346e(mo29650v(), obj);
        if (map == null) {
            return null;
        }
        return C7800f4.m37346e(map, obj2);
    }

    public void clear() {
        C8178t3.m39123c(mo29727t().iterator());
    }

    public boolean containsValue(@C5952h Object obj) {
        for (Map containsValue : mo29650v().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
        Map map = (Map) C7800f4.m37346e(mo29650v(), obj);
        return map != null && C7800f4.m37345d(map, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Collection<V> mo30310e() {
        return new C8077c();
    }

    public boolean equals(@C5952h Object obj) {
        return C7771e6.m37142a((C7677d6<?, ?, ?>) this, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Iterator<V> mo30888f() {
        return new C8075a(mo29727t().iterator());
    }

    /* renamed from: h */
    public boolean mo29720h(@C5952h Object obj) {
        return C7800f4.m37345d(mo29730w(), obj);
    }

    public int hashCode() {
        return mo29727t().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public boolean mo29723j(@C5952h Object obj) {
        return C7800f4.m37345d(mo29650v(), obj);
    }

    public V remove(@C5952h Object obj, @C5952h Object obj2) {
        Map map = (Map) C7800f4.m37346e(mo29650v(), obj);
        if (map == null) {
            return null;
        }
        return C7800f4.m37349f(map, obj2);
    }

    /* renamed from: t */
    public Set<C7678a<R, C, V>> mo29727t() {
        Set<C7678a<R, C, V>> set = this.f21876a;
        if (set != null) {
            return set;
        }
        Set<C7678a<R, C, V>> d = mo30514d();
        this.f21876a = d;
        return d;
    }

    public String toString() {
        return mo29650v().toString();
    }

    /* renamed from: u */
    public Set<C> mo29728u() {
        return mo29730w().keySet();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f21877b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo30310e();
        this.f21877b = e;
        return e;
    }

    /* renamed from: x */
    public Set<R> mo29651x() {
        return mo29650v().keySet();
    }

    /* renamed from: a */
    public void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        for (C7678a aVar : d6Var.mo29727t()) {
            mo29713a(aVar.mo29993d(), aVar.mo29992a(), aVar.getValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<C7678a<R, C, V>> mo30514d() {
        return new C8076b();
    }
}
