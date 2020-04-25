package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7982k4.C7983a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.c1 */
/* compiled from: FilteredEntryMultimap */
class C7607c1<K, V> extends C7874h<K, V> implements C7880h1<K, V> {

    /* renamed from: Q */
    final C7886h4<K, V> f21189Q;

    /* renamed from: R */
    final C5831y<? super Entry<K, V>> f21190R;

    /* renamed from: com.google.common.collect.c1$a */
    /* compiled from: FilteredEntryMultimap */
    class C7608a extends C7841v<K, Collection<V>> {

        /* renamed from: com.google.common.collect.c1$a$a */
        /* compiled from: FilteredEntryMultimap */
        class C7609a extends C7842w<K, Collection<V>> {
            C7609a(Map map) {
                super(map);
            }

            public boolean remove(@C5952h Object obj) {
                return C7608a.this.remove(obj) != null;
            }

            public boolean removeAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7800f4.m37276a(C7398z.m35689a(collection)));
            }

            public boolean retainAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7800f4.m37276a(C7398z.m35682a(C7398z.m35689a(collection))));
            }
        }

        /* renamed from: com.google.common.collect.c1$a$b */
        /* compiled from: FilteredEntryMultimap */
        class C7610b extends C7828o<K, Collection<V>> {

            /* renamed from: com.google.common.collect.c1$a$b$a */
            /* compiled from: FilteredEntryMultimap */
            class C7611a extends C7603c<Entry<K, Collection<V>>> {

                /* renamed from: N */
                final Iterator<Entry<K, Collection<V>>> f21194N = C7607c1.this.f21189Q.mo29703j().entrySet().iterator();

                C7611a() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Entry<K, Collection<V>> m36432b() {
                    while (this.f21194N.hasNext()) {
                        Entry entry = (Entry) this.f21194N.next();
                        Object key = entry.getKey();
                        Collection a = C7607c1.m36414a((Collection) entry.getValue(), (C5831y<? super E>) new C7616c<Object>(key));
                        if (!a.isEmpty()) {
                            return C7800f4.m37291a(key, a);
                        }
                    }
                    return (Entry) mo29793c();
                }
            }

            C7610b() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, Collection<V>> mo29777b() {
                return C7608a.this;
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return new C7611a();
            }

            public boolean removeAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7398z.m35689a(collection));
            }

            public boolean retainAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7398z.m35682a(C7398z.m35689a(collection)));
            }

            public int size() {
                return C8178t3.m39138j(iterator());
            }
        }

        /* renamed from: com.google.common.collect.c1$a$c */
        /* compiled from: FilteredEntryMultimap */
        class C7612c extends C7818h0<K, Collection<V>> {
            C7612c(Map map) {
                super(map);
            }

            public boolean remove(@C5952h Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator it = C7607c1.this.f21189Q.mo29703j().entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        Collection a = C7607c1.m36414a((Collection) entry.getValue(), (C5831y<? super E>) new C7616c<Object>(entry.getKey()));
                        if (!a.isEmpty() && collection.equals(a)) {
                            if (a.size() == ((Collection) entry.getValue()).size()) {
                                it.remove();
                            } else {
                                a.clear();
                            }
                            return true;
                        }
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7800f4.m37311b(C7398z.m35689a(collection)));
            }

            public boolean retainAll(Collection<?> collection) {
                return C7607c1.this.mo29801a(C7800f4.m37311b(C7398z.m35682a(C7398z.m35689a(collection))));
            }
        }

        C7608a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Set<Entry<K, Collection<V>>> mo29734a() {
            return new C7610b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<K> mo29652b() {
            return new C7609a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<Collection<V>> mo29736c() {
            return new C7612c(this);
        }

        public void clear() {
            C7607c1.this.clear();
        }

        public boolean containsKey(@C5952h Object obj) {
            return get(obj) != null;
        }

        public Collection<V> get(@C5952h Object obj) {
            Collection collection = (Collection) C7607c1.this.f21189Q.mo29703j().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> a = C7607c1.m36414a(collection, (C5831y<? super E>) new C7616c<Object>(obj));
            if (a.isEmpty()) {
                a = null;
            }
            return a;
        }

        public Collection<V> remove(@C5952h Object obj) {
            Collection collection = (Collection) C7607c1.this.f21189Q.mo29703j().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList a = C8309z3.m39648a();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C7607c1.this.m36416a(obj, next)) {
                    it.remove();
                    a.add(next);
                }
            }
            if (a.isEmpty()) {
                return null;
            }
            if (C7607c1.this.f21189Q instanceof C8022l5) {
                return Collections.unmodifiableSet(C8047m5.m38536e(a));
            }
            return Collections.unmodifiableList(a);
        }
    }

    /* renamed from: com.google.common.collect.c1$b */
    /* compiled from: FilteredEntryMultimap */
    class C7613b extends C7945g<K, V> {

        /* renamed from: com.google.common.collect.c1$b$a */
        /* compiled from: FilteredEntryMultimap */
        class C7614a extends C8016h<K> {

            /* renamed from: com.google.common.collect.c1$b$a$a */
            /* compiled from: FilteredEntryMultimap */
            class C7615a implements C5831y<Entry<K, Collection<V>>> {

                /* renamed from: a */
                final /* synthetic */ C5831y f21199a;

                C7615a(C5831y yVar) {
                    this.f21199a = yVar;
                }

                /* renamed from: a */
                public boolean apply(Entry<K, Collection<V>> entry) {
                    return this.f21199a.apply(C8003l4.m38354a(entry.getKey(), ((Collection) entry.getValue()).size()));
                }
            }

            C7614a() {
            }

            /* renamed from: a */
            private boolean m36434a(C5831y<? super C7983a<K>> yVar) {
                return C7607c1.this.mo29801a(new C7615a(yVar));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public C7982k4<K> mo29820b() {
                return C7613b.this;
            }

            public Iterator<C7983a<K>> iterator() {
                return C7613b.this.mo30101k();
            }

            public boolean removeAll(Collection<?> collection) {
                return m36434a(C7398z.m35689a(collection));
            }

            public boolean retainAll(Collection<?> collection) {
                return m36434a(C7398z.m35682a(C7398z.m35689a(collection)));
            }

            public int size() {
                return C7607c1.this.keySet().size();
            }
        }

        C7613b() {
            super(C7607c1.this);
        }

        /* renamed from: a */
        public int mo29818a(@C5952h Object obj, int i) {
            C8277y.m39484a(i, "occurrences");
            if (i == 0) {
                return mo29708b(obj);
            }
            Collection collection = (Collection) C7607c1.this.f21189Q.mo29703j().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (C7607c1.this.m36416a(obj, it.next())) {
                    i2++;
                    if (i2 <= i) {
                        it.remove();
                    }
                }
            }
            return i2;
        }

        public Set<C7983a<K>> entrySet() {
            return new C7614a();
        }
    }

    /* renamed from: com.google.common.collect.c1$c */
    /* compiled from: FilteredEntryMultimap */
    final class C7616c implements C5831y<V> {

        /* renamed from: a */
        private final K f21201a;

        C7616c(K k) {
            this.f21201a = k;
        }

        public boolean apply(@C5952h V v) {
            return C7607c1.this.m36416a(this.f21201a, v);
        }
    }

    C7607c1(C7886h4<K, V> h4Var, C5831y<? super Entry<K, V>> yVar) {
        this.f21189Q = (C7886h4) C7397x.m35664a(h4Var);
        this.f21190R = (C5831y) C7397x.m35664a(yVar);
    }

    public void clear() {
        mo29704m().clear();
    }

    public boolean containsKey(@C5952h Object obj) {
        return mo29703j().get(obj) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Collection<Entry<K, V>> mo29804d() {
        return m36414a(this.f21189Q.mo29704m(), this.f21190R);
    }

    /* renamed from: e */
    public Collection<V> mo29699e(@C5952h Object obj) {
        return (Collection) C5827t.m25564b(mo29703j().remove(obj), mo29808k());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C7982k4<K> mo29805f() {
        return new C7613b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Collection<V> mo29806g() {
        return new C7897i1(this);
    }

    public Collection<V> get(K k) {
        return m36414a(this.f21189Q.get(k), (C5831y<? super E>) new C7616c<Object>(k));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Iterator<Entry<K, V>> mo29807h() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Collection<V> mo29808k() {
        return this.f21189Q instanceof C8022l5 ? Collections.emptySet() : Collections.emptyList();
    }

    public Set<K> keySet() {
        return mo29703j().keySet();
    }

    /* renamed from: o */
    public C7886h4<K, V> mo29810o() {
        return this.f21189Q;
    }

    /* renamed from: p */
    public C5831y<? super Entry<K, V>> mo29811p() {
        return this.f21190R;
    }

    public int size() {
        return mo29704m().size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m36416a(K k, V v) {
        return this.f21190R.apply(C7800f4.m37291a(k, v));
    }

    /* renamed from: a */
    static <E> Collection<E> m36414a(Collection<E> collection, C5831y<? super E> yVar) {
        if (collection instanceof Set) {
            return C8047m5.m38515a((Set) collection, yVar);
        }
        return C8292z.m39590a(collection, yVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<K, Collection<V>> mo29800a() {
        return new C7608a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo29801a(C5831y<? super Entry<K, Collection<V>>> yVar) {
        Iterator it = this.f21189Q.mo29703j().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Object key = entry.getKey();
            Collection a = m36414a((Collection) entry.getValue(), (C5831y<? super E>) new C7616c<Object>(key));
            if (!a.isEmpty() && yVar.apply(C7800f4.m37291a(key, a))) {
                if (a.size() == ((Collection) entry.getValue()).size()) {
                    it.remove();
                } else {
                    a.clear();
                }
                z = true;
            }
        }
        return z;
    }
}
