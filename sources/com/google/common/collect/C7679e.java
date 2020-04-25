package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.e$i.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.e */
/* compiled from: AbstractMapBasedMultimap */
abstract class C7679e<K, V> extends C7874h<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public transient Map<K, Collection<V>> f21269Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public transient int f21270R;

    /* renamed from: com.google.common.collect.e$a */
    /* compiled from: AbstractMapBasedMultimap */
    class C7680a extends C7685d<V> {
        C7680a() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30004a(K k, V v) {
            return v;
        }
    }

    /* renamed from: com.google.common.collect.e$b */
    /* compiled from: AbstractMapBasedMultimap */
    class C7681b extends C7685d<Entry<K, V>> {
        C7681b() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Entry<K, V> m36703a(K k, V v) {
            return C7800f4.m37291a(k, v);
        }
    }

    /* renamed from: com.google.common.collect.e$c */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7682c extends C7841v<K, Collection<V>> {

        /* renamed from: O */
        final transient Map<K, Collection<V>> f21273O;

        /* renamed from: com.google.common.collect.e$c$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7683a extends C7828o<K, Collection<V>> {
            C7683a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, Collection<V>> mo29777b() {
                return C7682c.this;
            }

            public boolean contains(Object obj) {
                return C8292z.m39592a((Collection<?>) C7682c.this.f21273O.entrySet(), obj);
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return new C7684b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C7679e.this.m36686c(((Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.e$c$b */
        /* compiled from: AbstractMapBasedMultimap */
        class C7684b implements Iterator<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Entry<K, Collection<V>>> f21277a = C7682c.this.f21273O.entrySet().iterator();

            /* renamed from: b */
            Collection<V> f21278b;

            C7684b() {
            }

            public boolean hasNext() {
                return this.f21277a.hasNext();
            }

            public void remove() {
                this.f21277a.remove();
                C7679e.m36682b(C7679e.this, this.f21278b.size());
                this.f21278b.clear();
            }

            public Entry<K, Collection<V>> next() {
                Entry entry = (Entry) this.f21277a.next();
                this.f21278b = (Collection) entry.getValue();
                return C7682c.this.mo30005a(entry);
            }
        }

        C7682c(Map<K, Collection<V>> map) {
            this.f21273O = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, Collection<V>>> mo29734a() {
            return new C7683a();
        }

        public void clear() {
            if (this.f21273O == C7679e.this.f21269Q) {
                C7679e.this.clear();
            } else {
                C8178t3.m39123c(new C7684b());
            }
        }

        public boolean containsKey(Object obj) {
            return C7800f4.m37345d(this.f21273O, obj);
        }

        public boolean equals(@C5952h Object obj) {
            return this == obj || this.f21273O.equals(obj);
        }

        public int hashCode() {
            return this.f21273O.hashCode();
        }

        public Set<K> keySet() {
            return C7679e.this.keySet();
        }

        public int size() {
            return this.f21273O.size();
        }

        public String toString() {
            return this.f21273O.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Entry<K, Collection<V>> mo30005a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return C7800f4.m37291a(key, C7679e.this.mo29998a(key, (Collection) entry.getValue()));
        }

        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C7800f4.m37346e(this.f21273O, obj);
            if (collection == null) {
                return null;
            }
            return C7679e.this.mo29998a(obj, collection);
        }

        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) this.f21273O.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> l = C7679e.this.mo29915l();
            l.addAll(collection);
            C7679e.m36682b(C7679e.this, collection.size());
            collection.clear();
            return l;
        }
    }

    /* renamed from: com.google.common.collect.e$d */
    /* compiled from: AbstractMapBasedMultimap */
    private abstract class C7685d<T> implements Iterator<T> {

        /* renamed from: N */
        Collection<V> f21279N = null;

        /* renamed from: O */
        Iterator<V> f21280O = C8178t3.m39121c();

        /* renamed from: a */
        final Iterator<Entry<K, Collection<V>>> f21282a;

        /* renamed from: b */
        K f21283b = null;

        C7685d() {
            this.f21282a = C7679e.this.f21269Q.entrySet().iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo30004a(K k, V v);

        public boolean hasNext() {
            return this.f21282a.hasNext() || this.f21280O.hasNext();
        }

        public T next() {
            if (!this.f21280O.hasNext()) {
                Entry entry = (Entry) this.f21282a.next();
                this.f21283b = entry.getKey();
                this.f21279N = (Collection) entry.getValue();
                this.f21280O = this.f21279N.iterator();
            }
            return mo30004a(this.f21283b, this.f21280O.next());
        }

        public void remove() {
            this.f21280O.remove();
            if (this.f21279N.isEmpty()) {
                this.f21282a.remove();
            }
            C7679e.this.f21270R = C7679e.this.f21270R - 1;
        }
    }

    /* renamed from: com.google.common.collect.e$e */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7686e extends C7842w<K, Collection<V>> {

        /* renamed from: com.google.common.collect.e$e$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7687a implements Iterator<K> {

            /* renamed from: a */
            Entry<K, Collection<V>> f21286a;

            /* renamed from: b */
            final /* synthetic */ Iterator f21287b;

            C7687a(Iterator it) {
                this.f21287b = it;
            }

            public boolean hasNext() {
                return this.f21287b.hasNext();
            }

            public K next() {
                this.f21286a = (Entry) this.f21287b.next();
                return this.f21286a.getKey();
            }

            public void remove() {
                C8277y.m39486a(this.f21286a != null);
                Collection collection = (Collection) this.f21286a.getValue();
                this.f21287b.remove();
                C7679e.m36682b(C7679e.this, collection.size());
                collection.clear();
            }
        }

        C7686e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C8178t3.m39123c(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30423b().keySet().containsAll(collection);
        }

        public boolean equals(@C5952h Object obj) {
            return this == obj || mo30423b().keySet().equals(obj);
        }

        public int hashCode() {
            return mo30423b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C7687a(mo30423b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo30423b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C7679e.m36682b(C7679e.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.e$f */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7688f extends C7693j implements RandomAccess {
        C7688f(@C5952h K k, List<V> list, @C5952h C7691i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.google.common.collect.e$g */
    /* compiled from: AbstractMapBasedMultimap */
    protected class C7689g extends C7682c implements SortedMap<K, Collection<V>> {

        /* renamed from: Q */
        SortedSet<K> f21289Q;

        C7689g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo30032d().comparator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedMap<K, Collection<V>> mo30032d() {
            return (SortedMap) this.f21273O;
        }

        public K firstKey() {
            return mo30032d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C7689g(mo30032d().headMap(k));
        }

        public K lastKey() {
            return mo30032d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C7689g(mo30032d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C7689g(mo30032d().tailMap(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<K> m36709b() {
            return new C7690h(mo30032d());
        }

        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f21289Q;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = mo29652b();
            this.f21289Q = b;
            return b;
        }
    }

    /* renamed from: com.google.common.collect.e$h */
    /* compiled from: AbstractMapBasedMultimap */
    protected class C7690h extends C7686e implements SortedSet<K> {
        C7690h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public SortedMap<K, Collection<V>> mo30038c() {
            return (SortedMap) super.mo30423b();
        }

        public Comparator<? super K> comparator() {
            return mo30038c().comparator();
        }

        public K first() {
            return mo30038c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C7690h(mo30038c().headMap(k));
        }

        public K last() {
            return mo30038c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C7690h(mo30038c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C7690h(mo30038c().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.e$i */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7691i extends AbstractCollection<V> {

        /* renamed from: N */
        final C7691i f21292N;

        /* renamed from: O */
        final Collection<V> f21293O;

        /* renamed from: a */
        final K f21295a;

        /* renamed from: b */
        Collection<V> f21296b;

        /* renamed from: com.google.common.collect.e$i$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7692a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f21298a;

            /* renamed from: b */
            final Collection<V> f21299b = C7691i.this.f21296b;

            C7692a() {
                this.f21298a = C7679e.this.m36684b(C7691i.this.f21296b);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Iterator<V> mo30064b() {
                mo30065c();
                return this.f21298a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public void mo30065c() {
                C7691i.this.mo30057j();
                if (C7691i.this.f21296b != this.f21299b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo30065c();
                return this.f21298a.hasNext();
            }

            public V next() {
                mo30065c();
                return this.f21298a.next();
            }

            public void remove() {
                this.f21298a.remove();
                C7679e.this.f21270R = C7679e.this.f21270R - 1;
                C7691i.this.mo30058k();
            }

            C7692a(Iterator<V> it) {
                this.f21298a = it;
            }
        }

        C7691i(@C5952h K k, Collection<V> collection, @C5952h C7691i iVar) {
            Collection<V> collection2;
            this.f21295a = k;
            this.f21296b = collection;
            this.f21292N = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.mo30052e();
            }
            this.f21293O = collection2;
        }

        public boolean add(V v) {
            mo30057j();
            boolean isEmpty = this.f21296b.isEmpty();
            boolean add = this.f21296b.add(v);
            if (add) {
                C7679e.this.f21270R = C7679e.this.f21270R + 1;
                if (isEmpty) {
                    mo30047b();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f21296b.addAll(collection);
            if (addAll) {
                C7679e.m36675a(C7679e.this, this.f21296b.size() - size);
                if (size == 0) {
                    mo30047b();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30047b() {
            C7691i iVar = this.f21292N;
            if (iVar != null) {
                iVar.mo30047b();
            } else {
                C7679e.this.f21269Q.put(this.f21295a, this.f21296b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7691i mo30048c() {
            return this.f21292N;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f21296b.clear();
                C7679e.m36682b(C7679e.this, size);
                mo30058k();
            }
        }

        public boolean contains(Object obj) {
            mo30057j();
            return this.f21296b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo30057j();
            return this.f21296b.containsAll(collection);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Collection<V> mo30052e() {
            return this.f21296b;
        }

        public boolean equals(@C5952h Object obj) {
            if (obj == this) {
                return true;
            }
            mo30057j();
            return this.f21296b.equals(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public K mo30054f() {
            return this.f21295a;
        }

        public int hashCode() {
            mo30057j();
            return this.f21296b.hashCode();
        }

        public Iterator<V> iterator() {
            mo30057j();
            return new C7692a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo30057j() {
            C7691i iVar = this.f21292N;
            if (iVar != null) {
                iVar.mo30057j();
                if (this.f21292N.mo30052e() != this.f21293O) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f21296b.isEmpty()) {
                Collection<V> collection = (Collection) C7679e.this.f21269Q.get(this.f21295a);
                if (collection != null) {
                    this.f21296b = collection;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo30058k() {
            C7691i iVar = this.f21292N;
            if (iVar != null) {
                iVar.mo30058k();
            } else if (this.f21296b.isEmpty()) {
                C7679e.this.f21269Q.remove(this.f21295a);
            }
        }

        public boolean remove(Object obj) {
            mo30057j();
            boolean remove = this.f21296b.remove(obj);
            if (remove) {
                C7679e.this.f21270R = C7679e.this.f21270R - 1;
                mo30058k();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f21296b.removeAll(collection);
            if (removeAll) {
                C7679e.m36675a(C7679e.this, this.f21296b.size() - size);
                mo30058k();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C7397x.m35664a(collection);
            int size = size();
            boolean retainAll = this.f21296b.retainAll(collection);
            if (retainAll) {
                C7679e.m36675a(C7679e.this, this.f21296b.size() - size);
                mo30058k();
            }
            return retainAll;
        }

        public int size() {
            mo30057j();
            return this.f21296b.size();
        }

        public String toString() {
            mo30057j();
            return this.f21296b.toString();
        }
    }

    /* renamed from: com.google.common.collect.e$j */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7693j extends C7691i implements List<V> {

        /* renamed from: com.google.common.collect.e$j$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class C7694a extends a implements ListIterator<V> {
            C7694a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.e$i$a, com.google.common.collect.e$j$a] */
            /* renamed from: d */
            private ListIterator<V> m36721d() {
                return (ListIterator) mo30064b();
            }

            public void add(V v) {
                boolean isEmpty = C7693j.this.isEmpty();
                m36721d().add(v);
                C7679e.this.f21270R = C7679e.this.f21270R + 1;
                if (isEmpty) {
                    C7693j.this.mo30047b();
                }
            }

            public boolean hasPrevious() {
                return m36721d().hasPrevious();
            }

            public int nextIndex() {
                return m36721d().nextIndex();
            }

            public V previous() {
                return m36721d().previous();
            }

            public int previousIndex() {
                return m36721d().previousIndex();
            }

            public void set(V v) {
                m36721d().set(v);
            }

            public C7694a(int i) {
                super(C7693j.this.mo30073l().listIterator(i));
            }
        }

        C7693j(@C5952h K k, List<V> list, @C5952h C7691i iVar) {
            super(k, list, iVar);
        }

        public void add(int i, V v) {
            mo30057j();
            boolean isEmpty = mo30052e().isEmpty();
            mo30073l().add(i, v);
            C7679e.this.f21270R = C7679e.this.f21270R + 1;
            if (isEmpty) {
                mo30047b();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo30073l().addAll(i, collection);
            if (addAll) {
                C7679e.m36675a(C7679e.this, mo30052e().size() - size);
                if (size == 0) {
                    mo30047b();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo30057j();
            return mo30073l().get(i);
        }

        public int indexOf(Object obj) {
            mo30057j();
            return mo30073l().indexOf(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public List<V> mo30073l() {
            return (List) mo30052e();
        }

        public int lastIndexOf(Object obj) {
            mo30057j();
            return mo30073l().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo30057j();
            return new C7694a();
        }

        public V remove(int i) {
            mo30057j();
            V remove = mo30073l().remove(i);
            C7679e.this.f21270R = C7679e.this.f21270R - 1;
            mo30058k();
            return remove;
        }

        public V set(int i, V v) {
            mo30057j();
            return mo30073l().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo30057j();
            return C7679e.this.m36679a(mo30054f(), mo30073l().subList(i, i2), mo30048c() == null ? this : mo30048c());
        }

        public ListIterator<V> listIterator(int i) {
            mo30057j();
            return new C7694a(i);
        }
    }

    /* renamed from: com.google.common.collect.e$k */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7695k extends C7691i implements Set<V> {
        C7695k(@C5952h K k, Set<V> set) {
            super(k, set, null);
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = C8047m5.m38520a((Set) this.f21296b, collection);
            if (a) {
                C7679e.m36675a(C7679e.this, this.f21296b.size() - size);
                mo30058k();
            }
            return a;
        }
    }

    /* renamed from: com.google.common.collect.e$l */
    /* compiled from: AbstractMapBasedMultimap */
    protected class C7696l extends C7691i implements SortedSet<V> {
        C7696l(@C5952h K k, SortedSet<V> sortedSet, @C5952h C7691i iVar) {
            super(k, sortedSet, iVar);
        }

        public Comparator<? super V> comparator() {
            return mo30089l().comparator();
        }

        public V first() {
            mo30057j();
            return mo30089l().first();
        }

        public SortedSet<V> headSet(V v) {
            mo30057j();
            return new C7696l(mo30054f(), mo30089l().headSet(v), mo30048c() == null ? this : mo30048c());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public SortedSet<V> mo30089l() {
            return (SortedSet) mo30052e();
        }

        public V last() {
            mo30057j();
            return mo30089l().last();
        }

        public SortedSet<V> subSet(V v, V v2) {
            mo30057j();
            return new C7696l(mo30054f(), mo30089l().subSet(v, v2), mo30048c() == null ? this : mo30048c());
        }

        public SortedSet<V> tailSet(V v) {
            mo30057j();
            return new C7696l(mo30054f(), mo30089l().tailSet(v), mo30048c() == null ? this : mo30048c());
        }
    }

    protected C7679e(Map<K, Collection<V>> map) {
        C7397x.m35670a(map.isEmpty());
        this.f21269Q = map;
    }

    public void clear() {
        for (Collection clear : this.f21269Q.values()) {
            clear.clear();
        }
        this.f21269Q.clear();
        this.f21270R = 0;
    }

    public boolean containsKey(@C5952h Object obj) {
        return this.f21269Q.containsKey(obj);
    }

    /* renamed from: e */
    public Collection<V> mo29699e(@C5952h Object obj) {
        Collection collection = (Collection) this.f21269Q.remove(obj);
        if (collection == null) {
            return mo29916r();
        }
        Collection l = mo29915l();
        l.addAll(collection);
        this.f21270R -= collection.size();
        collection.clear();
        return mo29999a(l);
    }

    public Collection<V> get(@C5952h K k) {
        Collection collection = (Collection) this.f21269Q.get(k);
        if (collection == null) {
            collection = mo29997a(k);
        }
        return mo29998a(k, collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Iterator<Entry<K, V>> mo29807h() {
        return new C7681b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Iterator<V> mo30002i() {
        return new C7680a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Map<K, Collection<V>> mo30003k() {
        return this.f21269Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public abstract Collection<V> mo29915l();

    /* renamed from: m */
    public Collection<Entry<K, V>> mo29704m() {
        return super.mo29704m();
    }

    public boolean put(@C5952h K k, @C5952h V v) {
        Collection collection = (Collection) this.f21269Q.get(k);
        if (collection == null) {
            Collection a = mo29997a(k);
            if (a.add(v)) {
                this.f21270R++;
                this.f21269Q.put(k, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f21270R++;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Collection<V> mo29916r() {
        return mo29999a(mo29915l());
    }

    public int size() {
        return this.f21270R;
    }

    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: b */
    static /* synthetic */ int m36682b(C7679e eVar, int i) {
        int i2 = eVar.f21270R - i;
        eVar.f21270R = i2;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m36686c(Object obj) {
        Collection collection = (Collection) C7800f4.m37349f(this.f21269Q, obj);
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        collection.clear();
        this.f21270R -= size;
        return size;
    }

    /* renamed from: a */
    static /* synthetic */ int m36675a(C7679e eVar, int i) {
        int i2 = eVar.f21270R + i;
        eVar.f21270R = i2;
        return i2;
    }

    /* renamed from: b */
    private Collection<V> m36683b(@C5952h K k) {
        Collection<V> collection = (Collection) this.f21269Q.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> a = mo29997a(k);
        this.f21269Q.put(k, a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Iterator<V> m36684b(Collection<V> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30000a(Map<K, Collection<V>> map) {
        this.f21269Q = map;
        this.f21270R = 0;
        for (Collection collection : map.values()) {
            C7397x.m35670a(!collection.isEmpty());
            this.f21270R += collection.size();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<K> mo30001e() {
        Map<K, Collection<V>> map = this.f21269Q;
        return map instanceof SortedMap ? new C7690h((SortedMap) map) : new C7686e(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29997a(@C5952h K k) {
        return mo29915l();
    }

    /* renamed from: a */
    public Collection<V> mo29698a(@C5952h K k, Iterable<? extends V> iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return mo29699e(k);
        }
        Collection b = m36683b(k);
        Collection l = mo29915l();
        l.addAll(b);
        this.f21270R -= b.size();
        b.clear();
        while (it.hasNext()) {
            if (b.add(it.next())) {
                this.f21270R++;
            }
        }
        return mo29999a(l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29999a(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<V> mo29998a(@C5952h K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new C7696l(k, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new C7695k(k, (Set) collection);
        }
        if (collection instanceof List) {
            return m36679a(k, (List) collection, null);
        }
        return new C7691i(k, collection, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<V> m36679a(@C5952h K k, List<V> list, @C5952h C7691i iVar) {
        return list instanceof RandomAccess ? new C7688f(k, list, iVar) : new C7693j(k, list, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<K, Collection<V>> mo29800a() {
        Map<K, Collection<V>> map = this.f21269Q;
        return map instanceof SortedMap ? new C7689g((SortedMap) map) : new C7682c(map);
    }
}
