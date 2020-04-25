package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.collect.b4 */
/* compiled from: MapConstraints */
public final class C7558b4 {

    /* renamed from: com.google.common.collect.b4$a */
    /* compiled from: MapConstraints */
    static class C7559a extends C8244w1<K, V> {

        /* renamed from: a */
        final /* synthetic */ Entry f21112a;

        /* renamed from: b */
        final /* synthetic */ C7542a4 f21113b;

        C7559a(Entry entry, C7542a4 a4Var) {
            this.f21112a = entry;
            this.f21113b = a4Var;
        }

        public V setValue(V v) {
            this.f21113b.mo29640a(getKey(), v);
            return this.f21112a.setValue(v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Entry<K, V> m36315y() {
            return this.f21112a;
        }
    }

    /* renamed from: com.google.common.collect.b4$b */
    /* compiled from: MapConstraints */
    static class C7560b extends C8244w1<K, Collection<V>> {

        /* renamed from: a */
        final /* synthetic */ Entry f21114a;

        /* renamed from: b */
        final /* synthetic */ C7542a4 f21115b;

        /* renamed from: com.google.common.collect.b4$b$a */
        /* compiled from: MapConstraints */
        class C7561a implements C7787f0<V> {
            C7561a() {
            }

            /* renamed from: a */
            public V mo29691a(V v) {
                C7560b bVar = C7560b.this;
                bVar.f21115b.mo29640a(bVar.getKey(), v);
                return v;
            }
        }

        C7560b(Entry entry, C7542a4 a4Var) {
            this.f21114a = entry;
            this.f21115b = a4Var;
        }

        public Collection<V> getValue() {
            return C7849g0.m37460d((Collection) this.f21114a.getValue(), new C7561a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Entry<K, Collection<V>> m36317y() {
            return this.f21114a;
        }
    }

    /* renamed from: com.google.common.collect.b4$c */
    /* compiled from: MapConstraints */
    static class C7562c<K, V> extends C7555b2<Entry<K, Collection<V>>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C7542a4<? super K, ? super V> f21117a;

        /* renamed from: b */
        private final Set<Entry<K, Collection<V>>> f21118b;

        /* renamed from: com.google.common.collect.b4$c$a */
        /* compiled from: MapConstraints */
        class C7563a extends C8124r1<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21119a;

            C7563a(Iterator it) {
                this.f21119a = it;
            }

            public Entry<K, Collection<V>> next() {
                return C7558b4.m36309c((Entry) this.f21119a.next(), C7562c.this.f21117a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Iterator<Entry<K, Collection<V>>> m36324y() {
                return this.f21119a;
            }
        }

        C7562c(Set<Entry<K, Collection<V>>> set, C7542a4<? super K, ? super V> a4Var) {
            this.f21118b = set;
            this.f21117a = a4Var;
        }

        public boolean contains(Object obj) {
            return C7800f4.m37308a((Collection<Entry<K, V>>) m36321y(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30763b(collection);
        }

        public boolean equals(@C5952h Object obj) {
            return mo29684n(obj);
        }

        public int hashCode() {
            return mo29680E();
        }

        public Iterator<Entry<K, Collection<V>>> iterator() {
            return new C7563a(this.f21118b.iterator());
        }

        public boolean remove(Object obj) {
            return C7800f4.m37330b((Collection<Entry<K, V>>) m36321y(), obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo30764d(collection);
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<Entry<K, Collection<V>>> m36322y() {
            return this.f21118b;
        }
    }

    /* renamed from: com.google.common.collect.b4$d */
    /* compiled from: MapConstraints */
    private static class C7564d<K, V> extends C7997l1<Collection<V>> {

        /* renamed from: a */
        final Collection<Collection<V>> f21121a;

        /* renamed from: b */
        final Set<Entry<K, Collection<V>>> f21122b;

        /* renamed from: com.google.common.collect.b4$d$a */
        /* compiled from: MapConstraints */
        class C7565a implements Iterator<Collection<V>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21123a;

            C7565a(Iterator it) {
                this.f21123a = it;
            }

            public boolean hasNext() {
                return this.f21123a.hasNext();
            }

            public void remove() {
                this.f21123a.remove();
            }

            public Collection<V> next() {
                return (Collection) ((Entry) this.f21123a.next()).getValue();
            }
        }

        C7564d(Collection<Collection<V>> collection, Set<Entry<K, Collection<V>>> set) {
            this.f21121a = collection;
            this.f21122b = set;
        }

        public boolean contains(Object obj) {
            return mo30333l(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30763b(collection);
        }

        public Iterator<Collection<V>> iterator() {
            return new C7565a(this.f21122b.iterator());
        }

        public boolean remove(Object obj) {
            return mo30335m(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo30764d(collection);
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<Collection<V>> m36326y() {
            return this.f21121a;
        }
    }

    /* renamed from: com.google.common.collect.b4$e */
    /* compiled from: MapConstraints */
    private static class C7566e<K, V> extends C7571i<K, V> implements C8139s<K, V> {

        /* renamed from: O */
        volatile C8139s<V, K> f21125O;

        C7566e(C8139s<K, V> sVar, @C5952h C8139s<V, K> sVar2, C7542a4<? super K, ? super V> a4Var) {
            super(sVar, a4Var);
            this.f21125O = sVar2;
        }

        /* renamed from: a */
        public V mo29602a(K k, V v) {
            this.f21132b.mo29640a(k, v);
            return m36331y().mo29602a(k, v);
        }

        /* renamed from: k */
        public C8139s<V, K> mo29607k() {
            if (this.f21125O == null) {
                this.f21125O = new C7566e(m36331y().mo29607k(), this, new C7577m(this.f21132b));
            }
            return this.f21125O;
        }

        public Set<V> values() {
            return m36331y().values();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C8139s<K, V> m36331y() {
            return (C8139s) super.mo26777y();
        }
    }

    /* renamed from: com.google.common.collect.b4$f */
    /* compiled from: MapConstraints */
    private static class C7567f<K, V> extends C7997l1<Entry<K, V>> {

        /* renamed from: a */
        final C7542a4<? super K, ? super V> f21126a;

        /* renamed from: b */
        final Collection<Entry<K, V>> f21127b;

        /* renamed from: com.google.common.collect.b4$f$a */
        /* compiled from: MapConstraints */
        class C7568a extends C8124r1<Entry<K, V>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21128a;

            C7568a(Iterator it) {
                this.f21128a = it;
            }

            public Entry<K, V> next() {
                return C7558b4.m36312d((Entry) this.f21128a.next(), C7567f.this.f21126a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Iterator<Entry<K, V>> m36335y() {
                return this.f21128a;
            }
        }

        C7567f(Collection<Entry<K, V>> collection, C7542a4<? super K, ? super V> a4Var) {
            this.f21127b = collection;
            this.f21126a = a4Var;
        }

        public boolean contains(Object obj) {
            return C7800f4.m37308a(mo26777y(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30763b(collection);
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7568a(this.f21127b.iterator());
        }

        public boolean remove(Object obj) {
            return C7800f4.m37330b(mo26777y(), obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return mo29681c(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return mo30764d(collection);
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<Entry<K, V>> m36333y() {
            return this.f21127b;
        }
    }

    /* renamed from: com.google.common.collect.b4$g */
    /* compiled from: MapConstraints */
    static class C7569g<K, V> extends C7567f<K, V> implements Set<Entry<K, V>> {
        C7569g(Set<Entry<K, V>> set, C7542a4<? super K, ? super V> a4Var) {
            super(set, a4Var);
        }

        public boolean equals(@C5952h Object obj) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C8047m5.m38502a((Set<?>) this);
        }
    }

    /* renamed from: com.google.common.collect.b4$h */
    /* compiled from: MapConstraints */
    private static class C7570h<K, V> extends C7572j<K, V> implements C8283y3<K, V> {
        C7570h(C8283y3<K, V> y3Var, C7542a4<? super K, ? super V> a4Var) {
            super(y3Var, a4Var);
        }

        /* renamed from: a */
        public List<V> m36337a(K k, Iterable<? extends V> iterable) {
            return (List) super.mo29698a(k, iterable);
        }

        /* renamed from: e */
        public List<V> m36339e(Object obj) {
            return (List) super.mo29699e(obj);
        }

        public List<V> get(K k) {
            return (List) super.get(k);
        }
    }

    /* renamed from: com.google.common.collect.b4$i */
    /* compiled from: MapConstraints */
    static class C7571i<K, V> extends C8220v1<K, V> {

        /* renamed from: N */
        private transient Set<Entry<K, V>> f21130N;

        /* renamed from: a */
        private final Map<K, V> f21131a;

        /* renamed from: b */
        final C7542a4<? super K, ? super V> f21132b;

        C7571i(Map<K, V> map, C7542a4<? super K, ? super V> a4Var) {
            this.f21131a = (Map) C7397x.m35664a(map);
            this.f21132b = (C7542a4) C7397x.m35664a(a4Var);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f21130N;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a = C7558b4.m36313d(this.f21131a.entrySet(), this.f21132b);
            this.f21130N = a;
            return a;
        }

        public V put(K k, V v) {
            this.f21132b.mo29640a(k, v);
            return this.f21131a.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            this.f21131a.putAll(C7558b4.m36307b(map, this.f21132b));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Map<K, V> m36341y() {
            return this.f21131a;
        }
    }

    /* renamed from: com.google.common.collect.b4$j */
    /* compiled from: MapConstraints */
    private static class C7572j<K, V> extends C8256x1<K, V> implements Serializable {

        /* renamed from: N */
        transient Collection<Entry<K, V>> f21133N;

        /* renamed from: O */
        transient Map<K, Collection<V>> f21134O;

        /* renamed from: a */
        final C7542a4<? super K, ? super V> f21135a;

        /* renamed from: b */
        final C7886h4<K, V> f21136b;

        /* renamed from: com.google.common.collect.b4$j$a */
        /* compiled from: MapConstraints */
        class C7573a extends C8220v1<K, Collection<V>> {

            /* renamed from: N */
            final /* synthetic */ Map f21137N;

            /* renamed from: a */
            Set<Entry<K, Collection<V>>> f21139a;

            /* renamed from: b */
            Collection<Collection<V>> f21140b;

            C7573a(Map map) {
                this.f21137N = map;
            }

            public boolean containsValue(Object obj) {
                return values().contains(obj);
            }

            public Set<Entry<K, Collection<V>>> entrySet() {
                Set<Entry<K, Collection<V>>> set = this.f21139a;
                if (set != null) {
                    return set;
                }
                Set<Entry<K, Collection<V>>> b = C7558b4.m36311c(this.f21137N.entrySet(), C7572j.this.f21135a);
                this.f21139a = b;
                return b;
            }

            public Collection<Collection<V>> values() {
                Collection<Collection<V>> collection = this.f21140b;
                if (collection != null) {
                    return collection;
                }
                C7564d dVar = new C7564d(mo26777y().values(), entrySet());
                this.f21140b = dVar;
                return dVar;
            }

            public Collection<V> get(Object obj) {
                try {
                    Collection<V> collection = C7572j.this.get(obj);
                    if (collection.isEmpty()) {
                        collection = null;
                    }
                    return collection;
                } catch (ClassCastException unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Map<K, Collection<V>> m36350y() {
                return this.f21137N;
            }
        }

        /* renamed from: com.google.common.collect.b4$j$b */
        /* compiled from: MapConstraints */
        class C7574b implements C7787f0<V> {

            /* renamed from: a */
            final /* synthetic */ Object f21141a;

            C7574b(Object obj) {
                this.f21141a = obj;
            }

            /* renamed from: a */
            public V mo29691a(V v) {
                C7572j.this.f21135a.mo29640a(this.f21141a, v);
                return v;
            }
        }

        public C7572j(C7886h4<K, V> h4Var, C7542a4<? super K, ? super V> a4Var) {
            this.f21136b = (C7886h4) C7397x.m35664a(h4Var);
            this.f21135a = (C7542a4) C7397x.m35664a(a4Var);
        }

        /* renamed from: a */
        public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
            boolean z = false;
            for (Entry entry : h4Var.mo29704m()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }

        /* renamed from: b */
        public boolean mo29702b(K k, Iterable<? extends V> iterable) {
            return this.f21136b.mo29702b(k, C7558b4.m36304b(k, iterable, this.f21135a));
        }

        public Collection<V> get(K k) {
            return C7849g0.m37460d(this.f21136b.get(k), new C7574b(k));
        }

        /* renamed from: j */
        public Map<K, Collection<V>> mo29703j() {
            Map<K, Collection<V>> map = this.f21134O;
            if (map != null) {
                return map;
            }
            C7573a aVar = new C7573a(this.f21136b.mo29703j());
            this.f21134O = aVar;
            return aVar;
        }

        /* renamed from: m */
        public Collection<Entry<K, V>> mo29704m() {
            Collection<Entry<K, V>> collection = this.f21133N;
            if (collection != null) {
                return collection;
            }
            Collection<Entry<K, V>> a = C7558b4.m36305b(this.f21136b.mo29704m(), this.f21135a);
            this.f21133N = a;
            return a;
        }

        public boolean put(K k, V v) {
            this.f21135a.mo29640a(k, v);
            return this.f21136b.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7886h4<K, V> m36348y() {
            return this.f21136b;
        }

        /* renamed from: a */
        public Collection<V> mo29698a(K k, Iterable<? extends V> iterable) {
            return this.f21136b.mo29698a(k, C7558b4.m36304b(k, iterable, this.f21135a));
        }
    }

    /* renamed from: com.google.common.collect.b4$k */
    /* compiled from: MapConstraints */
    private static class C7575k<K, V> extends C7572j<K, V> implements C8022l5<K, V> {
        C7575k(C8022l5<K, V> l5Var, C7542a4<? super K, ? super V> a4Var) {
            super(l5Var, a4Var);
        }

        /* renamed from: a */
        public Set<V> m36353a(K k, Iterable<? extends V> iterable) {
            return (Set) super.mo29698a(k, iterable);
        }

        /* renamed from: e */
        public Set<V> m36355e(Object obj) {
            return (Set) super.mo29699e(obj);
        }

        public Set<V> get(K k) {
            return (Set) super.get(k);
        }

        /* renamed from: m */
        public Set<Entry<K, V>> m36357m() {
            return (Set) super.mo29704m();
        }
    }

    /* renamed from: com.google.common.collect.b4$l */
    /* compiled from: MapConstraints */
    private static class C7576l<K, V> extends C7575k<K, V> implements C8291y5<K, V> {
        C7576l(C8291y5<K, V> y5Var, C7542a4<? super K, ? super V> a4Var) {
            super(y5Var, a4Var);
        }

        /* renamed from: q */
        public Comparator<? super V> mo29707q() {
            return ((C8291y5) m36348y()).mo29707q();
        }

        /* renamed from: a */
        public SortedSet<V> m36360a(K k, Iterable<? extends V> iterable) {
            return (SortedSet) super.mo29698a((Object) k, (Iterable) iterable);
        }

        /* renamed from: e */
        public SortedSet<V> m36363e(Object obj) {
            return (SortedSet) super.mo29699e(obj);
        }

        public SortedSet<V> get(K k) {
            return (SortedSet) super.get((Object) k);
        }
    }

    /* renamed from: com.google.common.collect.b4$m */
    /* compiled from: MapConstraints */
    private static class C7577m<K, V> implements C7542a4<K, V> {

        /* renamed from: a */
        final C7542a4<? super V, ? super K> f21143a;

        public C7577m(C7542a4<? super V, ? super K> a4Var) {
            this.f21143a = (C7542a4) C7397x.m35664a(a4Var);
        }

        /* renamed from: a */
        public void mo29640a(K k, V v) {
            this.f21143a.mo29640a(v, k);
        }
    }

    /* renamed from: com.google.common.collect.b4$n */
    /* compiled from: MapConstraints */
    private enum C7578n implements C7542a4<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo29640a(Object obj, Object obj2) {
            C7397x.m35664a(obj);
            C7397x.m35664a(obj2);
        }

        public String toString() {
            return "Not null";
        }
    }

    private C7558b4() {
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m36310c(Map<K, V> map, C7542a4<? super K, ? super V> a4Var) {
        return new C7571i(map, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <K, V> Entry<K, V> m36312d(Entry<K, V> entry, C7542a4<? super K, ? super V> a4Var) {
        C7397x.m35664a(entry);
        C7397x.m35664a(a4Var);
        return new C7559a(entry, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <K, V> Entry<K, Collection<V>> m36309c(Entry<K, Collection<V>> entry, C7542a4<? super K, ? super V> a4Var) {
        C7397x.m35664a(entry);
        C7397x.m35664a(a4Var);
        return new C7560b(entry, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> Collection<Entry<K, V>> m36305b(Collection<Entry<K, V>> collection, C7542a4<? super K, ? super V> a4Var) {
        if (collection instanceof Set) {
            return m36313d((Set) collection, a4Var);
        }
        return new C7567f(collection, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <K, V> Set<Entry<K, V>> m36313d(Set<Entry<K, V>> set, C7542a4<? super K, ? super V> a4Var) {
        return new C7569g(set, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <K, V> Set<Entry<K, Collection<V>>> m36311c(Set<Entry<K, Collection<V>>> set, C7542a4<? super K, ? super V> a4Var) {
        return new C7562c(set, a4Var);
    }

    /* renamed from: a */
    public static C7542a4<Object, Object> m36293a() {
        return C7578n.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> Collection<V> m36304b(K k, Iterable<? extends V> iterable, C7542a4<? super K, ? super V> a4Var) {
        ArrayList<Object> b = C8309z3.m39665b(iterable);
        for (Object a : b) {
            a4Var.mo29640a(k, a);
        }
        return b;
    }

    /* renamed from: a */
    public static <K, V> C7886h4<K, V> m36294a(C7886h4<K, V> h4Var, C7542a4<? super K, ? super V> a4Var) {
        return new C7572j(h4Var, a4Var);
    }

    /* renamed from: a */
    public static <K, V> C8283y3<K, V> m36297a(C8283y3<K, V> y3Var, C7542a4<? super K, ? super V> a4Var) {
        return new C7570h(y3Var, a4Var);
    }

    /* renamed from: a */
    public static <K, V> C8022l5<K, V> m36295a(C8022l5<K, V> l5Var, C7542a4<? super K, ? super V> a4Var) {
        return new C7575k(l5Var, a4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> Map<K, V> m36307b(Map<? extends K, ? extends V> map, C7542a4<? super K, ? super V> a4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Entry entry : linkedHashMap.entrySet()) {
            a4Var.mo29640a(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <K, V> C8291y5<K, V> m36298a(C8291y5<K, V> y5Var, C7542a4<? super K, ? super V> a4Var) {
        return new C7576l(y5Var, a4Var);
    }

    /* renamed from: a */
    public static <K, V> C8139s<K, V> m36296a(C8139s<K, V> sVar, C7542a4<? super K, ? super V> a4Var) {
        return new C7566e(sVar, null, a4Var);
    }
}
