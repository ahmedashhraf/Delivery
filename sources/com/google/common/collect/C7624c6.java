package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.c6 */
/* compiled from: Synchronized */
final class C7624c6 {

    /* renamed from: com.google.common.collect.c6$b */
    /* compiled from: Synchronized */
    private static class C7626b<K, V> extends C7636i<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: Q */
        transient Set<Entry<K, Collection<V>>> f21211Q;

        /* renamed from: R */
        transient Collection<Collection<V>> f21212R;

        C7626b(Map<K, Collection<V>> map, @C5952h Object obj) {
            super(map, obj);
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        public Set<Entry<K, Collection<V>>> entrySet() {
            Set<Entry<K, Collection<V>>> set;
            synchronized (this.f21232b) {
                if (this.f21211Q == null) {
                    this.f21211Q = new C7627c(mo29856e().entrySet(), this.f21232b);
                }
                set = this.f21211Q;
            }
            return set;
        }

        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f21232b) {
                if (this.f21212R == null) {
                    this.f21212R = new C7630d(mo29856e().values(), this.f21232b);
                }
                collection = this.f21212R;
            }
            return collection;
        }

        public Collection<V> get(Object obj) {
            Collection<V> collection;
            synchronized (this.f21232b) {
                Collection collection2 = (Collection) super.get(obj);
                if (collection2 == null) {
                    collection = null;
                } else {
                    collection = C7624c6.m36479d(collection2, this.f21232b);
                }
            }
            return collection;
        }
    }

    /* renamed from: com.google.common.collect.c6$c */
    /* compiled from: Synchronized */
    private static class C7627c<K, V> extends C7642o<Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.c6$c$a */
        /* compiled from: Synchronized */
        class C7628a extends C8124r1<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21213a;

            /* renamed from: com.google.common.collect.c6$c$a$a */
            /* compiled from: Synchronized */
            class C7629a extends C8244w1<K, Collection<V>> {

                /* renamed from: a */
                final /* synthetic */ Entry f21215a;

                C7629a(Entry entry) {
                    this.f21215a = entry;
                }

                public Collection<V> getValue() {
                    return C7624c6.m36479d((Collection) this.f21215a.getValue(), C7627c.this.f21232b);
                }

                /* access modifiers changed from: protected */
                /* renamed from: y */
                public Entry<K, Collection<V>> m36483y() {
                    return this.f21215a;
                }
            }

            C7628a(Iterator it) {
                this.f21213a = it;
            }

            public Entry<K, Collection<V>> next() {
                return new C7629a((Entry) super.next());
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Iterator<Entry<K, Collection<V>>> m36481y() {
                return this.f21213a;
            }
        }

        C7627c(Set<Entry<K, Collection<V>>> set, @C5952h Object obj) {
            super(set, obj);
        }

        public boolean contains(Object obj) {
            boolean a;
            synchronized (this.f21232b) {
                a = C7800f4.m37308a((Collection<Entry<K, V>>) m36529e(), obj);
            }
            return a;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean a;
            synchronized (this.f21232b) {
                a = C8292z.m39593a((Collection<?>) m36529e(), collection);
            }
            return a;
        }

        public boolean equals(Object obj) {
            boolean a;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                a = C8047m5.m38519a(m36529e(), obj);
            }
            return a;
        }

        public Iterator<Entry<K, Collection<V>>> iterator() {
            return new C7628a(super.iterator());
        }

        public boolean remove(Object obj) {
            boolean b;
            synchronized (this.f21232b) {
                b = C7800f4.m37330b((Collection<Entry<K, V>>) m36529e(), obj);
            }
            return b;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean a;
            synchronized (this.f21232b) {
                a = C8178t3.m39109a(m36529e().iterator(), collection);
            }
            return a;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean b;
            synchronized (this.f21232b) {
                b = C8178t3.m39116b(m36529e().iterator(), collection);
            }
            return b;
        }

        public Object[] toArray() {
            Object[] a;
            synchronized (this.f21232b) {
                a = C8109q4.m38830a((Collection<?>) m36529e());
            }
            return a;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] a;
            synchronized (this.f21232b) {
                a = C8109q4.m38831a((Collection<?>) m36529e(), tArr);
            }
            return a;
        }
    }

    /* renamed from: com.google.common.collect.c6$d */
    /* compiled from: Synchronized */
    private static class C7630d<V> extends C7633f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.c6$d$a */
        /* compiled from: Synchronized */
        class C7631a extends C8124r1<Collection<V>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21217a;

            C7631a(Iterator it) {
                this.f21217a = it;
            }

            public Collection<V> next() {
                return C7624c6.m36479d((Collection) super.next(), C7630d.this.f21232b);
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Iterator<Collection<V>> m36485y() {
                return this.f21217a;
            }
        }

        C7630d(Collection<Collection<V>> collection, @C5952h Object obj) {
            super(collection, obj);
        }

        public Iterator<Collection<V>> iterator() {
            return new C7631a(super.iterator());
        }
    }

    @C2778d
    /* renamed from: com.google.common.collect.c6$e */
    /* compiled from: Synchronized */
    static class C7632e<K, V> extends C7636i<K, V> implements C8139s<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: Q */
        private transient Set<V> f21219Q;

        /* renamed from: R */
        private transient C8139s<V, K> f21220R;

        /* renamed from: a */
        public V mo29602a(K k, V v) {
            V a;
            synchronized (this.f21232b) {
                a = m36489e().mo29602a(k, v);
            }
            return a;
        }

        /* renamed from: k */
        public C8139s<V, K> mo29607k() {
            C8139s<V, K> sVar;
            synchronized (this.f21232b) {
                if (this.f21220R == null) {
                    this.f21220R = new C7632e(m36489e().mo29607k(), this.f21232b, this);
                }
                sVar = this.f21220R;
            }
            return sVar;
        }

        private C7632e(C8139s<K, V> sVar, @C5952h Object obj, @C5952h C8139s<V, K> sVar2) {
            super(sVar, obj);
            this.f21220R = sVar2;
        }

        public Set<V> values() {
            Set<V> set;
            synchronized (this.f21232b) {
                if (this.f21219Q == null) {
                    this.f21219Q = C7624c6.m36475b(m36489e().values(), this.f21232b);
                }
                set = this.f21219Q;
            }
            return set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8139s<K, V> m36489e() {
            return (C8139s) super.mo29856e();
        }
    }

    @C2778d
    /* renamed from: com.google.common.collect.c6$f */
    /* compiled from: Synchronized */
    static class C7633f<E> extends C7639l implements Collection<E> {
        private static final long serialVersionUID = 0;

        public boolean add(E e) {
            boolean add;
            synchronized (this.f21232b) {
                add = mo29856e().add(e);
            }
            return add;
        }

        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f21232b) {
                addAll = mo29856e().addAll(collection);
            }
            return addAll;
        }

        public void clear() {
            synchronized (this.f21232b) {
                mo29856e().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.f21232b) {
                contains = mo29856e().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.f21232b) {
                containsAll = mo29856e().containsAll(collection);
            }
            return containsAll;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21232b) {
                isEmpty = mo29856e().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return mo29856e().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.f21232b) {
                remove = mo29856e().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.f21232b) {
                removeAll = mo29856e().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.f21232b) {
                retainAll = mo29856e().retainAll(collection);
            }
            return retainAll;
        }

        public int size() {
            int size;
            synchronized (this.f21232b) {
                size = mo29856e().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f21232b) {
                array = mo29856e().toArray();
            }
            return array;
        }

        private C7633f(Collection<E> collection, @C5952h Object obj) {
            super(collection, obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Collection<E> m36492e() {
            return (Collection) super.mo29856e();
        }

        public <T> T[] toArray(T[] tArr) {
            T[] array;
            synchronized (this.f21232b) {
                array = mo29856e().toArray(tArr);
            }
            return array;
        }
    }

    /* renamed from: com.google.common.collect.c6$g */
    /* compiled from: Synchronized */
    private static class C7634g<E> extends C7633f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        C7634g(List<E> list, @C5952h Object obj) {
            super(list, obj);
        }

        public void add(int i, E e) {
            synchronized (this.f21232b) {
                m36494e().add(i, e);
            }
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f21232b) {
                addAll = m36494e().addAll(i, collection);
            }
            return addAll;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                equals = m36494e().equals(obj);
            }
            return equals;
        }

        public E get(int i) {
            E e;
            synchronized (this.f21232b) {
                e = m36494e().get(i);
            }
            return e;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f21232b) {
                hashCode = m36494e().hashCode();
            }
            return hashCode;
        }

        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.f21232b) {
                indexOf = m36494e().indexOf(obj);
            }
            return indexOf;
        }

        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.f21232b) {
                lastIndexOf = m36494e().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        public ListIterator<E> listIterator() {
            return m36494e().listIterator();
        }

        public E remove(int i) {
            E remove;
            synchronized (this.f21232b) {
                remove = m36494e().remove(i);
            }
            return remove;
        }

        public E set(int i, E e) {
            E e2;
            synchronized (this.f21232b) {
                e2 = m36494e().set(i, e);
            }
            return e2;
        }

        public List<E> subList(int i, int i2) {
            List<E> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36474b(m36494e().subList(i, i2), this.f21232b);
            }
            return a;
        }

        public ListIterator<E> listIterator(int i) {
            return m36494e().listIterator(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public List<E> m36495e() {
            return (List) super.mo29856e();
        }
    }

    /* renamed from: com.google.common.collect.c6$h */
    /* compiled from: Synchronized */
    private static class C7635h<K, V> extends C7637j<K, V> implements C8283y3<K, V> {
        private static final long serialVersionUID = 0;

        C7635h(C8283y3<K, V> y3Var, @C5952h Object obj) {
            super(y3Var, obj);
        }

        /* renamed from: a */
        public List<V> m36497a(K k, Iterable<? extends V> iterable) {
            List<V> a;
            synchronized (this.f21232b) {
                a = m36500e().mo29698a(k, iterable);
            }
            return a;
        }

        public List<V> get(K k) {
            List<V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36474b(m36500e().get(k), this.f21232b);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8283y3<K, V> m36499e() {
            return (C8283y3) super.m36510e();
        }

        /* renamed from: e */
        public List<V> m36502e(Object obj) {
            List<V> e;
            synchronized (this.f21232b) {
                e = m36500e().mo29699e(obj);
            }
            return e;
        }
    }

    /* renamed from: com.google.common.collect.c6$i */
    /* compiled from: Synchronized */
    private static class C7636i<K, V> extends C7639l implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient Set<K> f21221N;

        /* renamed from: O */
        transient Collection<V> f21222O;

        /* renamed from: P */
        transient Set<Entry<K, V>> f21223P;

        C7636i(Map<K, V> map, @C5952h Object obj) {
            super(map, obj);
        }

        public void clear() {
            synchronized (this.f21232b) {
                mo29856e().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f21232b) {
                containsKey = mo29856e().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.f21232b) {
                containsValue = mo29856e().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set;
            synchronized (this.f21232b) {
                if (this.f21223P == null) {
                    this.f21223P = C7624c6.m36475b(mo29856e().entrySet(), this.f21232b);
                }
                set = this.f21223P;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                equals = mo29856e().equals(obj);
            }
            return equals;
        }

        public V get(Object obj) {
            V v;
            synchronized (this.f21232b) {
                v = mo29856e().get(obj);
            }
            return v;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f21232b) {
                hashCode = mo29856e().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21232b) {
                isEmpty = mo29856e().isEmpty();
            }
            return isEmpty;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f21232b) {
                if (this.f21221N == null) {
                    this.f21221N = C7624c6.m36475b(mo29856e().keySet(), this.f21232b);
                }
                set = this.f21221N;
            }
            return set;
        }

        public V put(K k, V v) {
            V put;
            synchronized (this.f21232b) {
                put = mo29856e().put(k, v);
            }
            return put;
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f21232b) {
                mo29856e().putAll(map);
            }
        }

        public V remove(Object obj) {
            V remove;
            synchronized (this.f21232b) {
                remove = mo29856e().remove(obj);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.f21232b) {
                size = mo29856e().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f21232b) {
                if (this.f21222O == null) {
                    this.f21222O = C7624c6.m36477c(mo29856e().values(), this.f21232b);
                }
                collection = this.f21222O;
            }
            return collection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Map<K, V> m36504e() {
            return (Map) super.mo29856e();
        }
    }

    /* renamed from: com.google.common.collect.c6$j */
    /* compiled from: Synchronized */
    private static class C7637j<K, V> extends C7639l implements C7886h4<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient Set<K> f21224N;

        /* renamed from: O */
        transient Collection<V> f21225O;

        /* renamed from: P */
        transient Collection<Entry<K, V>> f21226P;

        /* renamed from: Q */
        transient Map<K, Collection<V>> f21227Q;

        /* renamed from: R */
        transient C7982k4<K> f21228R;

        C7637j(C7886h4<K, V> h4Var, @C5952h Object obj) {
            super(h4Var, obj);
        }

        /* renamed from: a */
        public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
            boolean a;
            synchronized (this.f21232b) {
                a = m36510e().mo29701a(h4Var);
            }
            return a;
        }

        /* renamed from: b */
        public boolean mo29702b(K k, Iterable<? extends V> iterable) {
            boolean b;
            synchronized (this.f21232b) {
                b = m36510e().mo29702b(k, iterable);
            }
            return b;
        }

        /* renamed from: c */
        public boolean mo29884c(Object obj, Object obj2) {
            boolean c;
            synchronized (this.f21232b) {
                c = m36510e().mo29884c(obj, obj2);
            }
            return c;
        }

        public void clear() {
            synchronized (this.f21232b) {
                m36510e().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f21232b) {
                containsKey = m36510e().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.f21232b) {
                containsValue = m36510e().containsValue(obj);
            }
            return containsValue;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                equals = m36510e().equals(obj);
            }
            return equals;
        }

        public Collection<V> get(K k) {
            Collection<V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36479d(m36510e().get(k), this.f21232b);
            }
            return a;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f21232b) {
                hashCode = m36510e().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21232b) {
                isEmpty = m36510e().isEmpty();
            }
            return isEmpty;
        }

        /* renamed from: j */
        public Map<K, Collection<V>> mo29703j() {
            Map<K, Collection<V>> map;
            synchronized (this.f21232b) {
                if (this.f21227Q == null) {
                    this.f21227Q = new C7626b(m36510e().mo29703j(), this.f21232b);
                }
                map = this.f21227Q;
            }
            return map;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f21232b) {
                if (this.f21224N == null) {
                    this.f21224N = C7624c6.m36478c(m36510e().keySet(), this.f21232b);
                }
                set = this.f21224N;
            }
            return set;
        }

        /* renamed from: m */
        public Collection<Entry<K, V>> mo29704m() {
            Collection<Entry<K, V>> collection;
            synchronized (this.f21232b) {
                if (this.f21226P == null) {
                    this.f21226P = C7624c6.m36479d(m36510e().mo29704m(), this.f21232b);
                }
                collection = this.f21226P;
            }
            return collection;
        }

        /* renamed from: n */
        public C7982k4<K> mo29889n() {
            C7982k4<K> k4Var;
            synchronized (this.f21232b) {
                if (this.f21228R == null) {
                    this.f21228R = C7624c6.m36461a(m36510e().mo29889n(), this.f21232b);
                }
                k4Var = this.f21228R;
            }
            return k4Var;
        }

        public boolean put(K k, V v) {
            boolean put;
            synchronized (this.f21232b) {
                put = m36510e().put(k, v);
            }
            return put;
        }

        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.f21232b) {
                remove = m36510e().remove(obj, obj2);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.f21232b) {
                size = m36510e().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f21232b) {
                if (this.f21225O == null) {
                    this.f21225O = C7624c6.m36477c(m36510e().values(), this.f21232b);
                }
                collection = this.f21225O;
            }
            return collection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C7886h4<K, V> m36510e() {
            return (C7886h4) super.mo29856e();
        }

        /* renamed from: e */
        public Collection<V> mo29699e(Object obj) {
            Collection<V> e;
            synchronized (this.f21232b) {
                e = m36510e().mo29699e(obj);
            }
            return e;
        }

        /* renamed from: a */
        public Collection<V> mo29698a(K k, Iterable<? extends V> iterable) {
            Collection<V> a;
            synchronized (this.f21232b) {
                a = m36510e().mo29698a(k, iterable);
            }
            return a;
        }
    }

    /* renamed from: com.google.common.collect.c6$k */
    /* compiled from: Synchronized */
    private static class C7638k<E> extends C7633f<E> implements C7982k4<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient Set<E> f21229N;

        /* renamed from: O */
        transient Set<C7983a<E>> f21230O;

        C7638k(C7982k4<E> k4Var, @C5952h Object obj) {
            super(k4Var, obj);
        }

        /* renamed from: a */
        public int mo29818a(Object obj, int i) {
            int a;
            synchronized (this.f21232b) {
                a = m36522e().mo29818a(obj, i);
            }
            return a;
        }

        /* renamed from: b */
        public int mo29708b(Object obj) {
            int b;
            synchronized (this.f21232b) {
                b = m36522e().mo29708b(obj);
            }
            return b;
        }

        /* renamed from: c */
        public int mo29894c(E e, int i) {
            int c;
            synchronized (this.f21232b) {
                c = m36522e().mo29894c(e, i);
            }
            return c;
        }

        public Set<C7983a<E>> entrySet() {
            Set<C7983a<E>> set;
            synchronized (this.f21232b) {
                if (this.f21230O == null) {
                    this.f21230O = C7624c6.m36478c(m36522e().entrySet(), this.f21232b);
                }
                set = this.f21230O;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                equals = m36522e().equals(obj);
            }
            return equals;
        }

        /* renamed from: h */
        public Set<E> mo29710h() {
            Set<E> set;
            synchronized (this.f21232b) {
                if (this.f21229N == null) {
                    this.f21229N = C7624c6.m36478c(m36522e().mo29710h(), this.f21232b);
                }
                set = this.f21229N;
            }
            return set;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f21232b) {
                hashCode = m36522e().hashCode();
            }
            return hashCode;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C7982k4<E> m36522e() {
            return (C7982k4) super.mo29856e();
        }

        /* renamed from: a */
        public boolean mo29892a(E e, int i, int i2) {
            boolean a;
            synchronized (this.f21232b) {
                a = m36522e().mo29892a(e, i, i2);
            }
            return a;
        }

        /* renamed from: b */
        public int mo29893b(E e, int i) {
            int b;
            synchronized (this.f21232b) {
                b = m36522e().mo29893b(e, i);
            }
            return b;
        }
    }

    /* renamed from: com.google.common.collect.c6$l */
    /* compiled from: Synchronized */
    static class C7639l implements Serializable {
        @C2777c("not needed in emulated source")
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object f21231a;

        /* renamed from: b */
        final Object f21232b;

        C7639l(Object obj, @C5952h Object obj2) {
            this.f21231a = C7397x.m35664a(obj);
            if (obj2 == 0) {
                obj2 = this;
            }
            this.f21232b = obj2;
        }

        @C2777c("java.io.ObjectOutputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f21232b) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Object mo29856e() {
            return this.f21231a;
        }

        public String toString() {
            String obj;
            synchronized (this.f21232b) {
                obj = this.f21231a.toString();
            }
            return obj;
        }
    }

    /* renamed from: com.google.common.collect.c6$m */
    /* compiled from: Synchronized */
    private static class C7640m<E> extends C7633f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        C7640m(Queue<E> queue, @C5952h Object obj) {
            super(queue, obj);
        }

        public E element() {
            E element;
            synchronized (this.f21232b) {
                element = m36526e().element();
            }
            return element;
        }

        public boolean offer(E e) {
            boolean offer;
            synchronized (this.f21232b) {
                offer = m36526e().offer(e);
            }
            return offer;
        }

        public E peek() {
            E peek;
            synchronized (this.f21232b) {
                peek = m36526e().peek();
            }
            return peek;
        }

        public E poll() {
            E poll;
            synchronized (this.f21232b) {
                poll = m36526e().poll();
            }
            return poll;
        }

        public E remove() {
            E remove;
            synchronized (this.f21232b) {
                remove = m36526e().remove();
            }
            return remove;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Queue<E> m36527e() {
            return (Queue) super.mo29856e();
        }
    }

    /* renamed from: com.google.common.collect.c6$n */
    /* compiled from: Synchronized */
    private static class C7641n<E> extends C7634g<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        C7641n(List<E> list, @C5952h Object obj) {
            super(list, obj);
        }
    }

    /* renamed from: com.google.common.collect.c6$o */
    /* compiled from: Synchronized */
    static class C7642o<E> extends C7633f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        C7642o(Set<E> set, @C5952h Object obj) {
            super(set, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21232b) {
                equals = m36529e().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f21232b) {
                hashCode = m36529e().hashCode();
            }
            return hashCode;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<E> m36530e() {
            return (Set) super.mo29856e();
        }
    }

    /* renamed from: com.google.common.collect.c6$p */
    /* compiled from: Synchronized */
    private static class C7643p<K, V> extends C7637j<K, V> implements C8022l5<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: S */
        transient Set<Entry<K, V>> f21233S;

        C7643p(C8022l5<K, V> l5Var, @C5952h Object obj) {
            super(l5Var, obj);
        }

        /* renamed from: a */
        public Set<V> m36532a(K k, Iterable<? extends V> iterable) {
            Set<V> a;
            synchronized (this.f21232b) {
                a = m36535e().mo29698a(k, iterable);
            }
            return a;
        }

        public Set<V> get(K k) {
            Set<V> b;
            synchronized (this.f21232b) {
                b = C7624c6.m36475b(m36535e().get(k), this.f21232b);
            }
            return b;
        }

        /* renamed from: m */
        public Set<Entry<K, V>> m36539m() {
            Set<Entry<K, V>> set;
            synchronized (this.f21232b) {
                if (this.f21233S == null) {
                    this.f21233S = C7624c6.m36475b(m36535e().mo29704m(), this.f21232b);
                }
                set = this.f21233S;
            }
            return set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8022l5<K, V> m36534e() {
            return (C8022l5) super.m36510e();
        }

        /* renamed from: e */
        public Set<V> m36537e(Object obj) {
            Set<V> e;
            synchronized (this.f21232b) {
                e = m36535e().mo29699e(obj);
            }
            return e;
        }
    }

    /* renamed from: com.google.common.collect.c6$q */
    /* compiled from: Synchronized */
    static class C7644q<K, V> extends C7636i<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        C7644q(SortedMap<K, V> sortedMap, @C5952h Object obj) {
            super(sortedMap, obj);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f21232b) {
                comparator = m36541e().comparator();
            }
            return comparator;
        }

        public K firstKey() {
            K firstKey;
            synchronized (this.f21232b) {
                firstKey = m36541e().firstKey();
            }
            return firstKey;
        }

        public SortedMap<K, V> headMap(K k) {
            SortedMap<K, V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36471a(m36541e().headMap(k), this.f21232b);
            }
            return a;
        }

        public K lastKey() {
            K lastKey;
            synchronized (this.f21232b) {
                lastKey = m36541e().lastKey();
            }
            return lastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SortedMap<K, V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36471a(m36541e().subMap(k, k2), this.f21232b);
            }
            return a;
        }

        public SortedMap<K, V> tailMap(K k) {
            SortedMap<K, V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36471a(m36541e().tailMap(k), this.f21232b);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public SortedMap<K, V> m36542e() {
            return (SortedMap) super.mo29856e();
        }
    }

    /* renamed from: com.google.common.collect.c6$r */
    /* compiled from: Synchronized */
    static class C7645r<E> extends C7642o<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        C7645r(SortedSet<E> sortedSet, @C5952h Object obj) {
            super(sortedSet, obj);
        }

        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f21232b) {
                comparator = m36545e().comparator();
            }
            return comparator;
        }

        public E first() {
            E first;
            synchronized (this.f21232b) {
                first = m36545e().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e) {
            SortedSet<E> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36476b(m36545e().headSet(e), this.f21232b);
            }
            return a;
        }

        public E last() {
            E last;
            synchronized (this.f21232b) {
                last = m36545e().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet<E> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36476b(m36545e().subSet(e, e2), this.f21232b);
            }
            return a;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet<E> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36476b(m36545e().tailSet(e), this.f21232b);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public SortedSet<E> m36546e() {
            return (SortedSet) super.m36529e();
        }
    }

    /* renamed from: com.google.common.collect.c6$s */
    /* compiled from: Synchronized */
    private static class C7646s<K, V> extends C7643p<K, V> implements C8291y5<K, V> {
        private static final long serialVersionUID = 0;

        C7646s(C8291y5<K, V> y5Var, @C5952h Object obj) {
            super(y5Var, obj);
        }

        /* renamed from: q */
        public Comparator<? super V> mo29707q() {
            Comparator<? super V> q;
            synchronized (this.f21232b) {
                q = m36553e().mo29707q();
            }
            return q;
        }

        /* renamed from: a */
        public SortedSet<V> m36549a(K k, Iterable<? extends V> iterable) {
            SortedSet<V> a;
            synchronized (this.f21232b) {
                a = m36553e().mo29698a(k, iterable);
            }
            return a;
        }

        public SortedSet<V> get(K k) {
            SortedSet<V> a;
            synchronized (this.f21232b) {
                a = C7624c6.m36476b(m36553e().get(k), this.f21232b);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8291y5<K, V> m36552e() {
            return (C8291y5) super.m36535e();
        }

        /* renamed from: e */
        public SortedSet<V> m36556e(Object obj) {
            SortedSet<V> e;
            synchronized (this.f21232b) {
                e = m36553e().mo29699e(obj);
            }
            return e;
        }
    }

    private C7624c6() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <E> Collection<E> m36477c(Collection<E> collection, @C5952h Object obj) {
        return new C7633f(collection, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <E> Collection<E> m36479d(Collection<E> collection, @C5952h Object obj) {
        if (collection instanceof SortedSet) {
            return m36476b((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return m36475b((Set) collection, obj);
        }
        if (collection instanceof List) {
            return m36474b((List) collection, obj);
        }
        return m36477c(collection, obj);
    }

    @C2778d
    /* renamed from: b */
    static <E> Set<E> m36475b(Set<E> set, @C5952h Object obj) {
        return new C7642o(set, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <E> Set<E> m36478c(Set<E> set, @C5952h Object obj) {
        if (set instanceof SortedSet) {
            return m36476b((SortedSet) set, obj);
        }
        return m36475b(set, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> SortedSet<E> m36476b(SortedSet<E> sortedSet, @C5952h Object obj) {
        return new C7645r(sortedSet, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> List<E> m36474b(List<E> list, @C5952h Object obj) {
        return list instanceof RandomAccess ? new C7641n(list, obj) : new C7634g(list, obj);
    }

    /* renamed from: a */
    static <E> C7982k4<E> m36461a(C7982k4<E> k4Var, @C5952h Object obj) {
        return ((k4Var instanceof C7638k) || (k4Var instanceof C7793f3)) ? k4Var : new C7638k(k4Var, obj);
    }

    /* renamed from: a */
    static <K, V> C7886h4<K, V> m36460a(C7886h4<K, V> h4Var, @C5952h Object obj) {
        return ((h4Var instanceof C7637j) || (h4Var instanceof C7707e3)) ? h4Var : new C7637j(h4Var, obj);
    }

    /* renamed from: a */
    static <K, V> C8283y3<K, V> m36464a(C8283y3<K, V> y3Var, @C5952h Object obj) {
        return ((y3Var instanceof C7635h) || (y3Var instanceof C8281y2)) ? y3Var : new C7635h(y3Var, obj);
    }

    /* renamed from: a */
    static <K, V> C8022l5<K, V> m36462a(C8022l5<K, V> l5Var, @C5952h Object obj) {
        return ((l5Var instanceof C7643p) || (l5Var instanceof C7882h3)) ? l5Var : new C7643p(l5Var, obj);
    }

    /* renamed from: a */
    static <K, V> C8291y5<K, V> m36465a(C8291y5<K, V> y5Var, @C5952h Object obj) {
        if (y5Var instanceof C7646s) {
            return y5Var;
        }
        return new C7646s(y5Var, obj);
    }

    @C2778d
    /* renamed from: a */
    static <K, V> Map<K, V> m36468a(Map<K, V> map, @C5952h Object obj) {
        return new C7636i(map, obj);
    }

    /* renamed from: a */
    static <K, V> SortedMap<K, V> m36471a(SortedMap<K, V> sortedMap, @C5952h Object obj) {
        return new C7644q(sortedMap, obj);
    }

    /* renamed from: a */
    static <K, V> C8139s<K, V> m36463a(C8139s<K, V> sVar, @C5952h Object obj) {
        return ((sVar instanceof C7632e) || (sVar instanceof C8125r2)) ? sVar : new C7632e(sVar, obj, null);
    }

    /* renamed from: a */
    static <E> Queue<E> m36469a(Queue<E> queue, @C5952h Object obj) {
        return queue instanceof C7640m ? queue : new C7640m(queue, obj);
    }
}
