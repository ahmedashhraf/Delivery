package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7800f4.C7829p;
import com.google.common.collect.C7982k4.C7983a;
import com.google.common.collect.C8281y2.C8282a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.j4 */
/* compiled from: Multimaps */
public final class C7936j4 {

    /* renamed from: com.google.common.collect.j4$a */
    /* compiled from: Multimaps */
    static final class C7937a<K, V> extends C7841v<K, Collection<V>> {
        /* access modifiers changed from: private */

        /* renamed from: O */
        public final C7886h4<K, V> f21674O;

        /* renamed from: com.google.common.collect.j4$a$a */
        /* compiled from: Multimaps */
        class C7938a extends C7828o<K, Collection<V>> {

            /* renamed from: com.google.common.collect.j4$a$a$a */
            /* compiled from: Multimaps */
            class C7939a implements C7380p<K, Collection<V>> {
                C7939a() {
                }

                public Collection<V> apply(K k) {
                    return C7937a.this.f21674O.get(k);
                }
            }

            C7938a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, Collection<V>> mo29777b() {
                return C7937a.this;
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return C7800f4.m37320b(C7937a.this.f21674O.keySet(), (C7380p<? super K, V>) new C7939a<Object,V>());
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C7937a.this.mo30692b(((Entry) obj).getKey());
                return true;
            }
        }

        C7937a(C7886h4<K, V> h4Var) {
            this.f21674O = (C7886h4) C7397x.m35664a(h4Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30692b(Object obj) {
            this.f21674O.keySet().remove(obj);
        }

        public void clear() {
            this.f21674O.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f21674O.containsKey(obj);
        }

        public boolean isEmpty() {
            return this.f21674O.isEmpty();
        }

        public Set<K> keySet() {
            return this.f21674O.keySet();
        }

        public int size() {
            return this.f21674O.keySet().size();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, Collection<V>>> mo29734a() {
            return new C7938a();
        }

        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f21674O.get(obj);
            }
            return null;
        }

        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f21674O.mo29699e(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.j4$b */
    /* compiled from: Multimaps */
    private static class C7940b<K, V> extends C7647d<K, V> {
        @C2777c("java serialization not supported")
        private static final long serialVersionUID = 0;

        /* renamed from: S */
        transient C7344g0<? extends List<V>> f21677S;

        C7940b(Map<K, Collection<V>> map, C7344g0<? extends List<V>> g0Var) {
            super(map);
            this.f21677S = (C7344g0) C7397x.m35664a(g0Var);
        }

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21677S = (C7344g0) objectInputStream.readObject();
            mo30000a((Map) objectInputStream.readObject());
        }

        @C2777c("java.io.ObjectOutputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21677S);
            objectOutputStream.writeObject(mo30003k());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public List<V> m38021l() {
            return (List) this.f21677S.get();
        }
    }

    /* renamed from: com.google.common.collect.j4$c */
    /* compiled from: Multimaps */
    private static class C7941c<K, V> extends C7679e<K, V> {
        @C2777c("java serialization not supported")
        private static final long serialVersionUID = 0;

        /* renamed from: S */
        transient C7344g0<? extends Collection<V>> f21678S;

        C7941c(Map<K, Collection<V>> map, C7344g0<? extends Collection<V>> g0Var) {
            super(map);
            this.f21678S = (C7344g0) C7397x.m35664a(g0Var);
        }

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21678S = (C7344g0) objectInputStream.readObject();
            mo30000a((Map) objectInputStream.readObject());
        }

        @C2777c("java.io.ObjectOutputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21678S);
            objectOutputStream.writeObject(mo30003k());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public Collection<V> mo29915l() {
            return (Collection) this.f21678S.get();
        }
    }

    /* renamed from: com.google.common.collect.j4$d */
    /* compiled from: Multimaps */
    private static class C7942d<K, V> extends C7971k<K, V> {
        @C2777c("not needed in emulated source")
        private static final long serialVersionUID = 0;

        /* renamed from: S */
        transient C7344g0<? extends Set<V>> f21679S;

        C7942d(Map<K, Collection<V>> map, C7344g0<? extends Set<V>> g0Var) {
            super(map);
            this.f21679S = (C7344g0) C7397x.m35664a(g0Var);
        }

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21679S = (C7344g0) objectInputStream.readObject();
            mo30000a((Map) objectInputStream.readObject());
        }

        @C2777c("java.io.ObjectOutputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21679S);
            objectOutputStream.writeObject(mo30003k());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public Set<V> m38024l() {
            return (Set) this.f21679S.get();
        }
    }

    /* renamed from: com.google.common.collect.j4$e */
    /* compiled from: Multimaps */
    private static class C7943e<K, V> extends C8063n<K, V> {
        @C2777c("not needed in emulated source")
        private static final long serialVersionUID = 0;

        /* renamed from: S */
        transient C7344g0<? extends SortedSet<V>> f21680S;

        /* renamed from: T */
        transient Comparator<? super V> f21681T;

        C7943e(Map<K, Collection<V>> map, C7344g0<? extends SortedSet<V>> g0Var) {
            super(map);
            this.f21680S = (C7344g0) C7397x.m35664a(g0Var);
            this.f21681T = ((SortedSet) g0Var.get()).comparator();
        }

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21680S = (C7344g0) objectInputStream.readObject();
            this.f21681T = ((SortedSet) this.f21680S.get()).comparator();
            mo30000a((Map) objectInputStream.readObject());
        }

        @C2777c("java.io.ObjectOutputStream")
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21680S);
            objectOutputStream.writeObject(mo30003k());
        }

        /* renamed from: q */
        public Comparator<? super V> mo29707q() {
            return this.f21681T;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public SortedSet<V> m38027l() {
            return (SortedSet) this.f21680S.get();
        }
    }

    /* renamed from: com.google.common.collect.j4$f */
    /* compiled from: Multimaps */
    static abstract class C7944f<K, V> extends AbstractCollection<Entry<K, V>> {
        C7944f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C7886h4<K, V> mo30527b();

        public void clear() {
            mo30527b().clear();
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo30527b().mo29884c(entry.getKey(), entry.getValue());
        }

        public boolean remove(@C5952h Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo30527b().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo30527b().size();
        }
    }

    /* renamed from: com.google.common.collect.j4$g */
    /* compiled from: Multimaps */
    static class C7945g<K, V> extends C7893i<K> {

        /* renamed from: N */
        final C7886h4<K, V> f21682N;

        /* renamed from: com.google.common.collect.j4$g$a */
        /* compiled from: Multimaps */
        class C7946a extends C7847f6<Entry<K, Collection<V>>, C7983a<K>> {

            /* renamed from: com.google.common.collect.j4$g$a$a */
            /* compiled from: Multimaps */
            class C7947a extends C8013f<K> {

                /* renamed from: a */
                final /* synthetic */ Entry f21684a;

                C7947a(Entry entry) {
                    this.f21684a = entry;
                }

                public int getCount() {
                    return ((Collection) this.f21684a.getValue()).size();
                }

                public K getElement() {
                    return this.f21684a.getKey();
                }
            }

            C7946a(Iterator it) {
                super(it);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public C7983a<K> mo30361a(Entry<K, Collection<V>> entry) {
                return new C7947a(entry);
            }
        }

        /* renamed from: com.google.common.collect.j4$g$b */
        /* compiled from: Multimaps */
        class C7948b extends C8016h<K> {
            C7948b() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public C7982k4<K> mo29820b() {
                return C7945g.this;
            }

            public boolean contains(@C5952h Object obj) {
                if (!(obj instanceof C7983a)) {
                    return false;
                }
                C7983a aVar = (C7983a) obj;
                Collection collection = (Collection) C7945g.this.f21682N.mo29703j().get(aVar.getElement());
                if (collection == null || collection.size() != aVar.getCount()) {
                    return false;
                }
                return true;
            }

            public boolean isEmpty() {
                return C7945g.this.f21682N.isEmpty();
            }

            public Iterator<C7983a<K>> iterator() {
                return C7945g.this.mo30101k();
            }

            public boolean remove(@C5952h Object obj) {
                if (obj instanceof C7983a) {
                    C7983a aVar = (C7983a) obj;
                    Collection collection = (Collection) C7945g.this.f21682N.mo29703j().get(aVar.getElement());
                    if (collection != null && collection.size() == aVar.getCount()) {
                        collection.clear();
                        return true;
                    }
                }
                return false;
            }

            public int size() {
                return C7945g.this.mo30100j();
            }
        }

        C7945g(C7886h4<K, V> h4Var) {
            this.f21682N = h4Var;
        }

        /* renamed from: a */
        public int mo29818a(@C5952h Object obj, int i) {
            C8277y.m39484a(i, "occurrences");
            if (i == 0) {
                return mo29708b(obj);
            }
            Collection collection = (Collection) C7800f4.m37346e(this.f21682N.mo29703j(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        /* renamed from: b */
        public int mo29708b(@C5952h Object obj) {
            Collection collection = (Collection) C7800f4.m37346e(this.f21682N.mo29703j(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public void clear() {
            this.f21682N.clear();
        }

        public boolean contains(@C5952h Object obj) {
            return this.f21682N.containsKey(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Set<C7983a<K>> mo30583f() {
            return new C7948b();
        }

        /* renamed from: h */
        public Set<K> mo29710h() {
            return this.f21682N.keySet();
        }

        public Iterator<K> iterator() {
            return C7800f4.m37289a(this.f21682N.mo29704m().iterator());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return this.f21682N.mo29703j().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<K>> mo30101k() {
            return new C7946a(this.f21682N.mo29703j().entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.j4$h */
    /* compiled from: Multimaps */
    private static class C7949h<K, V> extends C7874h<K, V> implements C8022l5<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* renamed from: Q */
        final Map<K, V> f21687Q;

        /* renamed from: com.google.common.collect.j4$h$a */
        /* compiled from: Multimaps */
        class C7950a extends C8055g<V> {

            /* renamed from: a */
            final /* synthetic */ Object f21688a;

            /* renamed from: com.google.common.collect.j4$h$a$a */
            /* compiled from: Multimaps */
            class C7951a implements Iterator<V> {

                /* renamed from: a */
                int f21690a;

                C7951a() {
                }

                public boolean hasNext() {
                    if (this.f21690a == 0) {
                        C7950a aVar = C7950a.this;
                        if (C7949h.this.f21687Q.containsKey(aVar.f21688a)) {
                            return true;
                        }
                    }
                    return false;
                }

                public V next() {
                    if (hasNext()) {
                        this.f21690a++;
                        C7950a aVar = C7950a.this;
                        return C7949h.this.f21687Q.get(aVar.f21688a);
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    boolean z = true;
                    if (this.f21690a != 1) {
                        z = false;
                    }
                    C8277y.m39486a(z);
                    this.f21690a = -1;
                    C7950a aVar = C7950a.this;
                    C7949h.this.f21687Q.remove(aVar.f21688a);
                }
            }

            C7950a(Object obj) {
                this.f21688a = obj;
            }

            public Iterator<V> iterator() {
                return new C7951a();
            }

            public int size() {
                return C7949h.this.f21687Q.containsKey(this.f21688a) ? 1 : 0;
            }
        }

        C7949h(Map<K, V> map) {
            this.f21687Q = (Map) C7397x.m35664a(map);
        }

        /* renamed from: b */
        public boolean mo29702b(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public boolean mo29884c(Object obj, Object obj2) {
            return this.f21687Q.entrySet().contains(C7800f4.m37291a(obj, obj2));
        }

        public void clear() {
            this.f21687Q.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f21687Q.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f21687Q.containsValue(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Iterator<Entry<K, V>> mo29807h() {
            return this.f21687Q.entrySet().iterator();
        }

        public int hashCode() {
            return this.f21687Q.hashCode();
        }

        public Set<K> keySet() {
            return this.f21687Q.keySet();
        }

        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return this.f21687Q.entrySet().remove(C7800f4.m37291a(obj, obj2));
        }

        public int size() {
            return this.f21687Q.size();
        }

        public Collection<V> values() {
            return this.f21687Q.values();
        }

        /* renamed from: a */
        public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public Set<V> m38046e(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f21687Q.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f21687Q.remove(obj));
            return hashSet;
        }

        public Set<V> get(K k) {
            return new C7950a(k);
        }

        /* renamed from: m */
        public Set<Entry<K, V>> m38049m() {
            return this.f21687Q.entrySet();
        }

        /* renamed from: a */
        public Set<V> m38041a(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Map<K, Collection<V>> mo29800a() {
            return new C7937a(this);
        }
    }

    /* renamed from: com.google.common.collect.j4$i */
    /* compiled from: Multimaps */
    private static final class C7952i<K, V1, V2> extends C7953j<K, V1, V2> implements C8283y3<K, V2> {
        C7952i(C8283y3<K, V1> y3Var, C7829p<? super K, ? super V1, V2> pVar) {
            super(y3Var, pVar);
        }

        /* renamed from: e */
        public List<V2> m38055e(Object obj) {
            return mo30715a(obj, this.f21692Q.mo29699e(obj));
        }

        public List<V2> get(K k) {
            return mo30715a((Object) k, this.f21692Q.get(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<V2> m38053a(K k, Collection<V1> collection) {
            return C8309z3.m39657a((List) collection, C7800f4.m37275a(this.f21693R, k));
        }

        /* renamed from: a */
        public List<V2> m38052a(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.collect.j4$j */
    /* compiled from: Multimaps */
    private static class C7953j<K, V1, V2> extends C7874h<K, V2> {

        /* renamed from: Q */
        final C7886h4<K, V1> f21692Q;

        /* renamed from: R */
        final C7829p<? super K, ? super V1, V2> f21693R;

        /* renamed from: com.google.common.collect.j4$j$a */
        /* compiled from: Multimaps */
        class C7954a implements C7829p<K, Collection<V1>, Collection<V2>> {
            C7954a() {
            }

            /* renamed from: a */
            public Collection<V2> mo30373a(K k, Collection<V1> collection) {
                return C7953j.this.mo30715a(k, collection);
            }
        }

        C7953j(C7886h4<K, V1> h4Var, C7829p<? super K, ? super V1, V2> pVar) {
            this.f21692Q = (C7886h4) C7397x.m35664a(h4Var);
            this.f21693R = (C7829p) C7397x.m35664a(pVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Collection<V2> mo30715a(K k, Collection<V1> collection) {
            C7380p a = C7800f4.m37275a(this.f21693R, k);
            if (collection instanceof List) {
                return C8309z3.m39657a((List) collection, a);
            }
            return C8292z.m39589a(collection, a);
        }

        /* renamed from: b */
        public boolean mo29702b(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f21692Q.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f21692Q.containsKey(obj);
        }

        /* renamed from: e */
        public Collection<V2> mo29699e(Object obj) {
            return mo30715a((K) obj, this.f21692Q.mo29699e(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public Collection<V2> mo29806g() {
            return C8292z.m39589a(this.f21692Q.mo29704m(), C7800f4.m37310b(this.f21693R));
        }

        public Collection<V2> get(K k) {
            return mo30715a(k, this.f21692Q.get(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Iterator<Entry<K, V2>> mo29807h() {
            return C8178t3.m39099a(this.f21692Q.mo29704m().iterator(), C7800f4.m37274a(this.f21693R));
        }

        public boolean isEmpty() {
            return this.f21692Q.isEmpty();
        }

        public Set<K> keySet() {
            return this.f21692Q.keySet();
        }

        /* renamed from: n */
        public C7982k4<K> mo29889n() {
            return this.f21692Q.mo29889n();
        }

        public boolean put(K k, V2 v2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        public int size() {
            return this.f21692Q.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Map<K, Collection<V2>> mo29800a() {
            return C7800f4.m37296a(this.f21692Q.mo29703j(), (C7829p<? super K, ? super V1, V2>) new C7954a<Object,Object,V2>());
        }

        /* renamed from: a */
        public boolean mo29701a(C7886h4<? extends K, ? extends V2> h4Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public Collection<V2> mo29698a(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.collect.j4$k */
    /* compiled from: Multimaps */
    private static class C7955k<K, V> extends C7956l<K, V> implements C8283y3<K, V> {
        private static final long serialVersionUID = 0;

        C7955k(C8283y3<K, V> y3Var) {
            super(y3Var);
        }

        /* renamed from: a */
        public List<V> m38068a(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public List<V> m38070e(Object obj) {
            throw new UnsupportedOperationException();
        }

        public List<V> get(K k) {
            return Collections.unmodifiableList(m38073y().get(k));
        }

        /* renamed from: y */
        public C8283y3<K, V> m38072y() {
            return (C8283y3) super.m38082y();
        }
    }

    /* renamed from: com.google.common.collect.j4$l */
    /* compiled from: Multimaps */
    private static class C7956l<K, V> extends C8256x1<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient C7982k4<K> f21695N;

        /* renamed from: O */
        transient Set<K> f21696O;

        /* renamed from: P */
        transient Collection<V> f21697P;

        /* renamed from: Q */
        transient Map<K, Collection<V>> f21698Q;

        /* renamed from: a */
        final C7886h4<K, V> f21699a;

        /* renamed from: b */
        transient Collection<Entry<K, V>> f21700b;

        /* renamed from: com.google.common.collect.j4$l$a */
        /* compiled from: Multimaps */
        class C7957a implements C7380p<Collection<V>, Collection<V>> {
            C7957a() {
            }

            /* renamed from: a */
            public Collection<V> apply(Collection<V> collection) {
                return C7936j4.m38015d(collection);
            }
        }

        C7956l(C7886h4<K, V> h4Var) {
            this.f21699a = (C7886h4) C7397x.m35664a(h4Var);
        }

        /* renamed from: a */
        public boolean mo29701a(C7886h4<? extends K, ? extends V> h4Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public boolean mo29702b(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public Collection<V> mo29699e(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> get(K k) {
            return C7936j4.m38015d(this.f21699a.get(k));
        }

        /* renamed from: j */
        public Map<K, Collection<V>> mo29703j() {
            Map<K, Collection<V>> map = this.f21698Q;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(C7800f4.m37294a(this.f21699a.mo29703j(), (C7380p<? super V1, V2>) new C7957a<Object,V2>()));
            this.f21698Q = unmodifiableMap;
            return unmodifiableMap;
        }

        public Set<K> keySet() {
            Set<K> set = this.f21696O;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.f21699a.keySet());
            this.f21696O = unmodifiableSet;
            return unmodifiableSet;
        }

        /* renamed from: m */
        public Collection<Entry<K, V>> mo29704m() {
            Collection<Entry<K, V>> collection = this.f21700b;
            if (collection != null) {
                return collection;
            }
            Collection<Entry<K, V>> b = C7936j4.m38013c(this.f21699a.mo29704m());
            this.f21700b = b;
            return b;
        }

        /* renamed from: n */
        public C7982k4<K> mo29889n() {
            C7982k4<K> k4Var = this.f21695N;
            if (k4Var != null) {
                return k4Var;
            }
            C7982k4<K> d = C8003l4.m38370d(this.f21699a.mo29889n());
            this.f21695N = d;
            return d;
        }

        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> values() {
            Collection<V> collection = this.f21697P;
            if (collection != null) {
                return collection;
            }
            Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.f21699a.values());
            this.f21697P = unmodifiableCollection;
            return unmodifiableCollection;
        }

        /* renamed from: a */
        public Collection<V> mo29698a(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7886h4<K, V> m38082y() {
            return this.f21699a;
        }
    }

    /* renamed from: com.google.common.collect.j4$m */
    /* compiled from: Multimaps */
    private static class C7958m<K, V> extends C7956l<K, V> implements C8022l5<K, V> {
        private static final long serialVersionUID = 0;

        C7958m(C8022l5<K, V> l5Var) {
            super(l5Var);
        }

        /* renamed from: a */
        public Set<V> m38085a(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public Set<V> m38087e(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set<V> get(K k) {
            return Collections.unmodifiableSet(m38092y().get(k));
        }

        /* renamed from: m */
        public Set<Entry<K, V>> m38089m() {
            return C7800f4.m37338c(m38092y().mo29704m());
        }

        /* renamed from: y */
        public C8022l5<K, V> m38091y() {
            return (C8022l5) super.m38082y();
        }
    }

    /* renamed from: com.google.common.collect.j4$n */
    /* compiled from: Multimaps */
    private static class C7959n<K, V> extends C7958m<K, V> implements C8291y5<K, V> {
        private static final long serialVersionUID = 0;

        C7959n(C8291y5<K, V> y5Var) {
            super(y5Var);
        }

        /* renamed from: q */
        public Comparator<? super V> mo29707q() {
            return m38103y().mo29707q();
        }

        /* renamed from: a */
        public SortedSet<V> m38095a(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public SortedSet<V> m38098e(Object obj) {
            throw new UnsupportedOperationException();
        }

        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(m38103y().get(k));
        }

        /* renamed from: y */
        public C8291y5<K, V> m38102y() {
            return (C8291y5) super.m38092y();
        }
    }

    private C7936j4() {
    }

    /* renamed from: c */
    public static <K, V> C8022l5<K, V> m38010c(Map<K, Collection<V>> map, C7344g0<? extends Set<V>> g0Var) {
        return new C7942d(map, g0Var);
    }

    /* renamed from: d */
    public static <K, V> C8291y5<K, V> m38014d(Map<K, Collection<V>> map, C7344g0<? extends SortedSet<V>> g0Var) {
        return new C7943e(map, g0Var);
    }

    /* renamed from: a */
    public static <K, V> C8283y3<K, V> m37991a(Map<K, Collection<V>> map, C7344g0<? extends List<V>> g0Var) {
        return new C7940b(map, g0Var);
    }

    /* renamed from: b */
    public static <K, V> C7886h4<K, V> m38000b(Map<K, Collection<V>> map, C7344g0<? extends Collection<V>> g0Var) {
        return new C7941c(map, g0Var);
    }

    /* renamed from: c */
    public static <K, V> C7886h4<K, V> m38006c(C7886h4<K, V> h4Var) {
        return ((h4Var instanceof C7956l) || (h4Var instanceof C7707e3)) ? h4Var : new C7956l(h4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <V> Collection<V> m38015d(Collection<V> collection) {
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

    /* renamed from: a */
    public static <K, V, M extends C7886h4<K, V>> M m37980a(C7886h4<? extends V, ? extends K> h4Var, M m) {
        C7397x.m35664a(m);
        for (Entry entry : h4Var.mo29704m()) {
            m.put(entry.getValue(), entry.getKey());
        }
        return m;
    }

    /* renamed from: b */
    public static <K, V> C7886h4<K, V> m37998b(C7886h4<K, V> h4Var) {
        return C7624c6.m36460a(h4Var, (Object) null);
    }

    /* renamed from: b */
    public static <K, V> C8022l5<K, V> m38001b(C8022l5<K, V> l5Var) {
        return C7624c6.m36462a(l5Var, (Object) null);
    }

    /* renamed from: c */
    public static <K, V> C8022l5<K, V> m38008c(C8022l5<K, V> l5Var) {
        return ((l5Var instanceof C7958m) || (l5Var instanceof C7882h3)) ? l5Var : new C7958m(l5Var);
    }

    /* renamed from: b */
    public static <K, V> C8291y5<K, V> m38004b(C8291y5<K, V> y5Var) {
        return C7624c6.m36465a(y5Var, (Object) null);
    }

    @Deprecated
    /* renamed from: a */
    public static <K, V> C7886h4<K, V> m37975a(C7707e3<K, V> e3Var) {
        return (C7886h4) C7397x.m35664a(e3Var);
    }

    /* renamed from: b */
    public static <K, V> C8283y3<K, V> m38003b(C8283y3<K, V> y3Var) {
        return C7624c6.m36464a(y3Var, (Object) null);
    }

    /* renamed from: c */
    public static <K, V> C8291y5<K, V> m38012c(C8291y5<K, V> y5Var) {
        if (y5Var instanceof C7959n) {
            return y5Var;
        }
        return new C7959n(y5Var);
    }

    @Deprecated
    /* renamed from: a */
    public static <K, V> C8022l5<K, V> m37981a(C7882h3<K, V> h3Var) {
        return (C8022l5) C7397x.m35664a(h3Var);
    }

    /* renamed from: b */
    public static <K, V> C7886h4<K, V> m37999b(C7886h4<K, V> h4Var, C5831y<? super K> yVar) {
        if (h4Var instanceof C8022l5) {
            return m38002b((C8022l5) h4Var, yVar);
        }
        if (h4Var instanceof C8283y3) {
            return m37989a((C8283y3) h4Var, yVar);
        }
        if (h4Var instanceof C7788f1) {
            C7788f1 f1Var = (C7788f1) h4Var;
            return new C7788f1(f1Var.f21483Q, C7398z.m35684a(f1Var.f21484R, yVar));
        } else if (h4Var instanceof C7880h1) {
            return m37976a((C7880h1) h4Var, C7800f4.m37276a(yVar));
        } else {
            return new C7788f1(h4Var, yVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static <K, V> C8283y3<K, V> m37987a(C8281y2<K, V> y2Var) {
        return (C8283y3) C7397x.m35664a(y2Var);
    }

    /* renamed from: c */
    public static <K, V> C8283y3<K, V> m38011c(C8283y3<K, V> y3Var) {
        return ((y3Var instanceof C7955k) || (y3Var instanceof C8281y2)) ? y3Var : new C7955k(y3Var);
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> Map<K, List<V>> m37995a(C8283y3<K, V> y3Var) {
        return y3Var.mo29703j();
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> Map<K, Set<V>> m37994a(C8022l5<K, V> l5Var) {
        return l5Var.mo29703j();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <K, V> Collection<Entry<K, V>> m38013c(Collection<Entry<K, V>> collection) {
        if (collection instanceof Set) {
            return C7800f4.m37338c((Set) collection);
        }
        return new C7811e0(Collections.unmodifiableCollection(collection));
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> Map<K, SortedSet<V>> m37996a(C8291y5<K, V> y5Var) {
        return y5Var.mo29703j();
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> Map<K, Collection<V>> m37993a(C7886h4<K, V> h4Var) {
        return h4Var.mo29703j();
    }

    /* renamed from: a */
    public static <K, V> C8022l5<K, V> m37984a(Map<K, V> map) {
        return new C7949h(map);
    }

    /* renamed from: c */
    public static <K, V> C7886h4<K, V> m38007c(C7886h4<K, V> h4Var, C5831y<? super V> yVar) {
        return m37978a(h4Var, C7800f4.m37311b(yVar));
    }

    /* renamed from: a */
    public static <K, V1, V2> C7886h4<K, V2> m37977a(C7886h4<K, V1> h4Var, C7380p<? super V1, V2> pVar) {
        C7397x.m35664a(pVar);
        return m37979a(h4Var, C7800f4.m37279a(pVar));
    }

    /* renamed from: c */
    public static <K, V> C8022l5<K, V> m38009c(C8022l5<K, V> l5Var, C5831y<? super V> yVar) {
        return m37983a(l5Var, C7800f4.m37311b(yVar));
    }

    /* renamed from: a */
    public static <K, V1, V2> C7886h4<K, V2> m37979a(C7886h4<K, V1> h4Var, C7829p<? super K, ? super V1, V2> pVar) {
        return new C7953j(h4Var, pVar);
    }

    /* renamed from: a */
    public static <K, V1, V2> C8283y3<K, V2> m37988a(C8283y3<K, V1> y3Var, C7380p<? super V1, V2> pVar) {
        C7397x.m35664a(pVar);
        return m37990a(y3Var, C7800f4.m37279a(pVar));
    }

    /* renamed from: b */
    public static <K, V> C8022l5<K, V> m38002b(C8022l5<K, V> l5Var, C5831y<? super K> yVar) {
        if (l5Var instanceof C7856g1) {
            C7856g1 g1Var = (C7856g1) l5Var;
            return new C7856g1(g1Var.mo29810o(), C7398z.m35684a(g1Var.f21484R, yVar));
        } else if (l5Var instanceof C7930j1) {
            return m37982a((C7930j1) l5Var, C7800f4.m37276a(yVar));
        } else {
            return new C7856g1(l5Var, yVar);
        }
    }

    /* renamed from: a */
    public static <K, V1, V2> C8283y3<K, V2> m37990a(C8283y3<K, V1> y3Var, C7829p<? super K, ? super V1, V2> pVar) {
        return new C7952i(y3Var, pVar);
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m37985a(Iterable<V> iterable, C7380p<? super V, K> pVar) {
        return m37986a(iterable.iterator(), pVar);
    }

    /* renamed from: a */
    public static <K, V> C8281y2<K, V> m37986a(Iterator<V> it, C7380p<? super V, K> pVar) {
        C7397x.m35664a(pVar);
        C8282a r = C8281y2.m39527r();
        while (it.hasNext()) {
            Object next = it.next();
            C7397x.m35665a(next, (Object) it);
            r.mo30133a(pVar.apply(next), next);
        }
        return r.mo30137a();
    }

    /* renamed from: a */
    public static <K, V> C8283y3<K, V> m37989a(C8283y3<K, V> y3Var, C5831y<? super K> yVar) {
        if (!(y3Var instanceof C7703e1)) {
            return new C7703e1(y3Var, yVar);
        }
        C7703e1 e1Var = (C7703e1) y3Var;
        return new C7703e1(e1Var.mo29810o(), C7398z.m35684a(e1Var.f21484R, yVar));
    }

    /* renamed from: a */
    public static <K, V> C7886h4<K, V> m37978a(C7886h4<K, V> h4Var, C5831y<? super Entry<K, V>> yVar) {
        C7397x.m35664a(yVar);
        if (h4Var instanceof C8022l5) {
            return m37983a((C8022l5) h4Var, yVar);
        }
        return h4Var instanceof C7880h1 ? m37976a((C7880h1) h4Var, yVar) : new C7607c1<>((C7886h4) C7397x.m35664a(h4Var), yVar);
    }

    /* renamed from: a */
    public static <K, V> C8022l5<K, V> m37983a(C8022l5<K, V> l5Var, C5831y<? super Entry<K, V>> yVar) {
        C7397x.m35664a(yVar);
        return l5Var instanceof C7930j1 ? m37982a((C7930j1) l5Var, yVar) : new C7654d1((C8022l5) C7397x.m35664a(l5Var), yVar);
    }

    /* renamed from: a */
    private static <K, V> C7886h4<K, V> m37976a(C7880h1<K, V> h1Var, C5831y<? super Entry<K, V>> yVar) {
        return new C7607c1(h1Var.mo29810o(), C7398z.m35684a(h1Var.mo29811p(), yVar));
    }

    /* renamed from: a */
    private static <K, V> C8022l5<K, V> m37982a(C7930j1<K, V> j1Var, C5831y<? super Entry<K, V>> yVar) {
        return new C7654d1(j1Var.mo29810o(), C7398z.m35684a(j1Var.mo29811p(), yVar));
    }

    /* renamed from: a */
    static boolean m37997a(C7886h4<?, ?> h4Var, @C5952h Object obj) {
        if (obj == h4Var) {
            return true;
        }
        if (!(obj instanceof C7886h4)) {
            return false;
        }
        return h4Var.mo29703j().equals(((C7886h4) obj).mo29703j());
    }
}
