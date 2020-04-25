package com.google.common.collect;

import com.google.common.base.C5822s.C5823d;
import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7337g;
import com.google.common.base.C7359j;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7621c4.C7622a;
import com.google.common.collect.C8302z2.C8303a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.f4 */
/* compiled from: Maps */
public final class C7800f4 {

    /* renamed from: a */
    static final C5823d f21500a = C8292z.f22160a.mo23127b("=");

    /* renamed from: com.google.common.collect.f4$a */
    /* compiled from: Maps */
    static class C7801a implements C7380p<Entry<K, V1>, Entry<K, V2>> {

        /* renamed from: a */
        final /* synthetic */ C7829p f21501a;

        C7801a(C7829p pVar) {
            this.f21501a = pVar;
        }

        /* renamed from: a */
        public Entry<K, V2> apply(Entry<K, V1> entry) {
            return C7800f4.m37290a(this.f21501a, entry);
        }
    }

    /* renamed from: com.google.common.collect.f4$a0 */
    /* compiled from: Maps */
    static class C7802a0<K, V> extends C7843x<K, V> implements C8217u5<K, V> {
        C7802a0(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, C7622a<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        /* renamed from: a */
        public SortedMap<K, V> m37356a() {
            return (SortedMap) super.mo29828a();
        }

        /* renamed from: b */
        public SortedMap<K, C7622a<V>> m37358b() {
            return (SortedMap) super.mo29829b();
        }

        /* renamed from: d */
        public SortedMap<K, V> m37360d() {
            return (SortedMap) super.mo29831d();
        }

        /* renamed from: e */
        public SortedMap<K, V> m37362e() {
            return (SortedMap) super.mo29832e();
        }
    }

    /* renamed from: com.google.common.collect.f4$b */
    /* compiled from: Maps */
    static class C7803b extends C8023l6<V> {

        /* renamed from: a */
        final /* synthetic */ C8023l6 f21502a;

        C7803b(C8023l6 l6Var) {
            this.f21502a = l6Var;
        }

        public boolean hasNext() {
            return this.f21502a.hasNext();
        }

        public V next() {
            return ((Entry) this.f21502a.next()).getValue();
        }
    }

    /* renamed from: com.google.common.collect.f4$b0 */
    /* compiled from: Maps */
    static class C7804b0<K, V1, V2> extends C7841v<K, V2> {

        /* renamed from: O */
        final Map<K, V1> f21503O;

        /* renamed from: P */
        final C7829p<? super K, ? super V1, V2> f21504P;

        /* renamed from: com.google.common.collect.f4$b0$a */
        /* compiled from: Maps */
        class C7805a extends C7828o<K, V2> {
            C7805a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, V2> mo29777b() {
                return C7804b0.this;
            }

            public Iterator<Entry<K, V2>> iterator() {
                return C8178t3.m39099a(C7804b0.this.f21503O.entrySet().iterator(), C7800f4.m37274a(C7804b0.this.f21504P));
            }
        }

        C7804b0(Map<K, V1> map, C7829p<? super K, ? super V1, V2> pVar) {
            this.f21503O = (Map) C7397x.m35664a(map);
            this.f21504P = (C7829p) C7397x.m35664a(pVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, V2>> mo29734a() {
            return new C7805a();
        }

        public void clear() {
            this.f21503O.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f21503O.containsKey(obj);
        }

        public V2 get(Object obj) {
            Object obj2 = this.f21503O.get(obj);
            if (obj2 != null || this.f21503O.containsKey(obj)) {
                return this.f21504P.mo30373a(obj, obj2);
            }
            return null;
        }

        public Set<K> keySet() {
            return this.f21503O.keySet();
        }

        public V2 remove(Object obj) {
            if (this.f21503O.containsKey(obj)) {
                return this.f21504P.mo30373a(obj, this.f21503O.remove(obj));
            }
            return null;
        }

        public int size() {
            return this.f21503O.size();
        }
    }

    /* renamed from: com.google.common.collect.f4$c */
    /* compiled from: Maps */
    static class C7806c extends C7847f6<K, Entry<K, V>> {

        /* renamed from: b */
        final /* synthetic */ C7380p f21506b;

        C7806c(Iterator it, C7380p pVar) {
            this.f21506b = pVar;
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Entry<K, V> m37366a(K k) {
            return C7800f4.m37291a(k, this.f21506b.apply(k));
        }
    }

    /* renamed from: com.google.common.collect.f4$c0 */
    /* compiled from: Maps */
    static class C7807c0<K, V1, V2> extends C7804b0<K, V1, V2> implements SortedMap<K, V2> {
        C7807c0(SortedMap<K, V1> sortedMap, C7829p<? super K, ? super V1, V2> pVar) {
            super(sortedMap, pVar);
        }

        public Comparator<? super K> comparator() {
            return mo30363d().comparator();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public SortedMap<K, V1> mo30363d() {
            return (SortedMap) this.f21503O;
        }

        public K firstKey() {
            return mo30363d().firstKey();
        }

        public SortedMap<K, V2> headMap(K k) {
            return C7800f4.m37302a(mo30363d().headMap(k), this.f21504P);
        }

        public K lastKey() {
            return mo30363d().lastKey();
        }

        public SortedMap<K, V2> subMap(K k, K k2) {
            return C7800f4.m37302a(mo30363d().subMap(k, k2), this.f21504P);
        }

        public SortedMap<K, V2> tailMap(K k) {
            return C7800f4.m37302a(mo30363d().tailMap(k), this.f21504P);
        }
    }

    /* renamed from: com.google.common.collect.f4$d */
    /* compiled from: Maps */
    static class C7808d extends C7555b2<E> {

        /* renamed from: a */
        final /* synthetic */ Set f21507a;

        C7808d(Set set) {
            this.f21507a = set;
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<E> m37370y() {
            return this.f21507a;
        }
    }

    /* renamed from: com.google.common.collect.f4$d0 */
    /* compiled from: Maps */
    private static class C7809d0<K, V> extends C8220v1<K, V> implements C8139s<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        C8139s<V, K> f21508N;

        /* renamed from: O */
        transient Set<V> f21509O;

        /* renamed from: a */
        final Map<K, V> f21510a;

        /* renamed from: b */
        final C8139s<? extends K, ? extends V> f21511b;

        C7809d0(C8139s<? extends K, ? extends V> sVar, @C5952h C8139s<V, K> sVar2) {
            this.f21510a = Collections.unmodifiableMap(sVar);
            this.f21511b = sVar;
            this.f21508N = sVar2;
        }

        /* renamed from: a */
        public V mo29602a(K k, V v) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public C8139s<V, K> mo29607k() {
            C8139s<V, K> sVar = this.f21508N;
            if (sVar != null) {
                return sVar;
            }
            C7809d0 d0Var = new C7809d0(this.f21511b.mo29607k(), this);
            this.f21508N = d0Var;
            return d0Var;
        }

        public Set<V> values() {
            Set<V> set = this.f21509O;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.f21511b.values());
            this.f21509O = unmodifiableSet;
            return unmodifiableSet;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Map<K, V> m37374y() {
            return this.f21510a;
        }
    }

    /* renamed from: com.google.common.collect.f4$e */
    /* compiled from: Maps */
    static class C7810e extends C7792f2<E> {

        /* renamed from: a */
        final /* synthetic */ SortedSet f21512a;

        C7810e(SortedSet sortedSet) {
            this.f21512a = sortedSet;
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public SortedSet<E> headSet(E e) {
            return C7800f4.m37327b(super.headSet(e));
        }

        public SortedSet<E> subSet(E e, E e2) {
            return C7800f4.m37327b(super.subSet(e, e2));
        }

        public SortedSet<E> tailSet(E e) {
            return C7800f4.m37327b(super.tailSet(e));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public SortedSet<E> m37378y() {
            return this.f21512a;
        }
    }

    /* renamed from: com.google.common.collect.f4$e0 */
    /* compiled from: Maps */
    static class C7811e0<K, V> extends C7997l1<Entry<K, V>> {

        /* renamed from: a */
        private final Collection<Entry<K, V>> f21513a;

        /* renamed from: com.google.common.collect.f4$e0$a */
        /* compiled from: Maps */
        class C7812a extends C8023l6<Entry<K, V>> {

            /* renamed from: a */
            final /* synthetic */ Iterator f21514a;

            C7812a(Iterator it) {
                this.f21514a = it;
            }

            public boolean hasNext() {
                return this.f21514a.hasNext();
            }

            public Entry<K, V> next() {
                return C7800f4.m37321b((Entry) this.f21514a.next());
            }
        }

        C7811e0(Collection<Entry<K, V>> collection) {
            this.f21513a = collection;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7812a(super.iterator());
        }

        public Object[] toArray() {
            return mo30759C();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo30762a(tArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<Entry<K, V>> m37380y() {
            return this.f21513a;
        }
    }

    /* renamed from: com.google.common.collect.f4$f */
    /* compiled from: Maps */
    static class C7813f extends C7848g<K, V> {

        /* renamed from: a */
        final /* synthetic */ Entry f21516a;

        C7813f(Entry entry) {
            this.f21516a = entry;
        }

        public K getKey() {
            return this.f21516a.getKey();
        }

        public V getValue() {
            return this.f21516a.getValue();
        }
    }

    /* renamed from: com.google.common.collect.f4$f0 */
    /* compiled from: Maps */
    static class C7814f0<K, V> extends C7811e0<K, V> implements Set<Entry<K, V>> {
        C7814f0(Set<Entry<K, V>> set) {
            super(set);
        }

        public boolean equals(@C5952h Object obj) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C8047m5.m38502a((Set<?>) this);
        }
    }

    /* renamed from: com.google.common.collect.f4$g */
    /* compiled from: Maps */
    static class C7815g implements C7829p<K, V1, V2> {

        /* renamed from: a */
        final /* synthetic */ C7380p f21517a;

        C7815g(C7380p pVar) {
            this.f21517a = pVar;
        }

        /* renamed from: a */
        public V2 mo30373a(K k, V1 v1) {
            return this.f21517a.apply(v1);
        }
    }

    /* renamed from: com.google.common.collect.f4$g0 */
    /* compiled from: Maps */
    static class C7816g0<V> implements C7622a<V> {

        /* renamed from: a */
        private final V f21518a;

        /* renamed from: b */
        private final V f21519b;

        private C7816g0(@C5952h V v, @C5952h V v2) {
            this.f21518a = v;
            this.f21519b = v2;
        }

        /* renamed from: a */
        static <V> C7622a<V> m37382a(@C5952h V v, @C5952h V v2) {
            return new C7816g0(v, v2);
        }

        /* renamed from: b */
        public V mo29836b() {
            return this.f21518a;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7622a)) {
                return false;
            }
            C7622a aVar = (C7622a) obj;
            if (!C5827t.m25562a(this.f21518a, aVar.mo29836b()) || !C5827t.m25562a(this.f21519b, aVar.mo29835a())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f21518a, this.f21519b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(this.f21518a);
            sb.append(", ");
            sb.append(this.f21519b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public V mo29835a() {
            return this.f21519b;
        }
    }

    /* renamed from: com.google.common.collect.f4$h */
    /* compiled from: Maps */
    static class C7817h implements C7380p<V1, V2> {

        /* renamed from: a */
        final /* synthetic */ C7829p f21520a;

        /* renamed from: b */
        final /* synthetic */ Object f21521b;

        C7817h(C7829p pVar, Object obj) {
            this.f21520a = pVar;
            this.f21521b = obj;
        }

        public V2 apply(@C5952h V1 v1) {
            return this.f21520a.mo30373a(this.f21521b, v1);
        }
    }

    /* renamed from: com.google.common.collect.f4$h0 */
    /* compiled from: Maps */
    static class C7818h0<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        final Map<K, V> f21522a;

        C7818h0(Map<K, V> map) {
            this.f21522a = (Map) C7397x.m35664a(map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Map<K, V> mo30375b() {
            return this.f21522a;
        }

        public void clear() {
            mo30375b().clear();
        }

        public boolean contains(@C5952h Object obj) {
            return mo30375b().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo30375b().isEmpty();
        }

        public Iterator<V> iterator() {
            return C7800f4.m37319b(mo30375b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : mo30375b().entrySet()) {
                    if (C5827t.m25562a(obj, entry.getValue())) {
                        mo30375b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C7397x.m35664a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet c = C8047m5.m38530c();
                for (Entry entry : mo30375b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo30375b().keySet().removeAll(c);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C7397x.m35664a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet c = C8047m5.m38530c();
                for (Entry entry : mo30375b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo30375b().keySet().retainAll(c);
            }
        }

        public int size() {
            return mo30375b().size();
        }
    }

    /* renamed from: com.google.common.collect.f4$i */
    /* compiled from: Maps */
    static class C7819i implements C7380p<Entry<K, V1>, V2> {

        /* renamed from: a */
        final /* synthetic */ C7829p f21523a;

        C7819i(C7829p pVar) {
            this.f21523a = pVar;
        }

        /* renamed from: a */
        public V2 apply(Entry<K, V1> entry) {
            return this.f21523a.mo30373a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.f4$j */
    /* compiled from: Maps */
    static class C7820j extends C7848g<K, V2> {

        /* renamed from: a */
        final /* synthetic */ Entry f21524a;

        /* renamed from: b */
        final /* synthetic */ C7829p f21525b;

        C7820j(Entry entry, C7829p pVar) {
            this.f21524a = entry;
            this.f21525b = pVar;
        }

        public K getKey() {
            return this.f21524a.getKey();
        }

        public V2 getValue() {
            return this.f21525b.mo30373a(this.f21524a.getKey(), this.f21524a.getValue());
        }
    }

    /* renamed from: com.google.common.collect.f4$k */
    /* compiled from: Maps */
    private static abstract class C7821k<K, V> extends C7841v<K, V> {

        /* renamed from: O */
        final Map<K, V> f21526O;

        /* renamed from: P */
        final C5831y<? super Entry<K, V>> f21527P;

        C7821k(Map<K, V> map, C5831y<? super Entry<K, V>> yVar) {
            this.f21526O = map;
            this.f21527P = yVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo30382b(@C5952h Object obj, @C5952h V v) {
            return this.f21527P.apply(C7800f4.m37291a(obj, v));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo29736c() {
            return new C7840u(this, this.f21526O, this.f21527P);
        }

        public boolean containsKey(Object obj) {
            return this.f21526O.containsKey(obj) && mo30382b(obj, this.f21526O.get(obj));
        }

        public V get(Object obj) {
            V v = this.f21526O.get(obj);
            if (v == null || !mo30382b(obj, v)) {
                return null;
            }
            return v;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V put(K k, V v) {
            C7397x.m35670a(mo30382b(k, v));
            return this.f21526O.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Entry entry : map.entrySet()) {
                C7397x.m35670a(mo30382b(entry.getKey(), entry.getValue()));
            }
            this.f21526O.putAll(map);
        }

        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f21526O.remove(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.f4$l */
    /* compiled from: Maps */
    private static class C7822l<K, V> extends C7841v<K, V> {

        /* renamed from: O */
        private final Set<K> f21528O;

        /* renamed from: P */
        final C7380p<? super K, V> f21529P;

        /* renamed from: com.google.common.collect.f4$l$a */
        /* compiled from: Maps */
        class C7823a extends C7828o<K, V> {
            C7823a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, V> mo29777b() {
                return C7822l.this;
            }

            public Iterator<Entry<K, V>> iterator() {
                return C7800f4.m37320b(C7822l.this.mo30391d(), C7822l.this.f21529P);
            }
        }

        C7822l(Set<K> set, C7380p<? super K, V> pVar) {
            this.f21528O = (Set) C7397x.m35664a(set);
            this.f21529P = (C7380p) C7397x.m35664a(pVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, V>> mo29734a() {
            return new C7823a();
        }

        /* renamed from: b */
        public Set<K> mo29652b() {
            return C7800f4.m37323b(mo30391d());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo29736c() {
            return C8292z.m39589a((Collection<F>) this.f21528O, this.f21529P);
        }

        public void clear() {
            mo30391d().clear();
        }

        public boolean containsKey(@C5952h Object obj) {
            return mo30391d().contains(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Set<K> mo30391d() {
            return this.f21528O;
        }

        public V get(@C5952h Object obj) {
            if (C8292z.m39592a((Collection<?>) mo30391d(), obj)) {
                return this.f21529P.apply(obj);
            }
            return null;
        }

        public V remove(@C5952h Object obj) {
            if (mo30391d().remove(obj)) {
                return this.f21529P.apply(obj);
            }
            return null;
        }

        public int size() {
            return mo30391d().size();
        }
    }

    /* renamed from: com.google.common.collect.f4$m */
    /* compiled from: Maps */
    private static final class C7824m<A, B> extends C7337g<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final C8139s<A, B> f21531N;

        C7824m(C8139s<A, B> sVar) {
            this.f21531N = (C8139s) C7397x.m35664a(sVar);
        }

        /* renamed from: a */
        private static <X, Y> Y m37394a(C8139s<X, Y> sVar, X x) {
            Y y = sVar.get(x);
            C7397x.m35672a(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7824m)) {
                return false;
            }
            return this.f21531N.equals(((C7824m) obj).f21531N);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public A mo26637f(B b) {
            return m37394a(this.f21531N.mo29607k(), b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public B mo26638g(A a) {
            return m37394a(this.f21531N, a);
        }

        public int hashCode() {
            return this.f21531N.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Maps.asConverter(");
            sb.append(this.f21531N);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.f4$n */
    /* compiled from: Maps */
    private enum C7825n implements C7380p<Entry<?, ?>, Object> {
        KEY {
            @C5952h
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @C5952h
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: com.google.common.collect.f4$o */
    /* compiled from: Maps */
    static abstract class C7828o<K, V> extends C8055g<Entry<K, V>> {
        C7828o() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Map<K, V> mo29777b();

        public void clear() {
            mo29777b().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object e = C7800f4.m37346e(mo29777b(), key);
            if (!C5827t.m25562a(e, entry.getValue())) {
                return false;
            }
            if (e != null || mo29777b().containsKey(key)) {
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            return mo29777b().isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return mo29777b().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C7397x.m35664a(collection));
            } catch (UnsupportedOperationException unused) {
                return C8047m5.m38521a((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C7397x.m35664a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C8047m5.m38509a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a.add(((Entry) next).getKey());
                    }
                }
                return mo29777b().keySet().retainAll(a);
            }
        }

        public int size() {
            return mo29777b().size();
        }
    }

    /* renamed from: com.google.common.collect.f4$p */
    /* compiled from: Maps */
    public interface C7829p<K, V1, V2> {
        /* renamed from: a */
        V2 mo30373a(@C5952h K k, @C5952h V1 v1);
    }

    /* renamed from: com.google.common.collect.f4$q */
    /* compiled from: Maps */
    static final class C7830q<K, V> extends C7832r<K, V> implements C8139s<K, V> {

        /* renamed from: R */
        private final C8139s<V, K> f21532R;

        /* renamed from: com.google.common.collect.f4$q$a */
        /* compiled from: Maps */
        static class C7831a implements C5831y<Entry<V, K>> {

            /* renamed from: a */
            final /* synthetic */ C5831y f21533a;

            C7831a(C5831y yVar) {
                this.f21533a = yVar;
            }

            /* renamed from: a */
            public boolean apply(Entry<V, K> entry) {
                return this.f21533a.apply(C7800f4.m37291a(entry.getValue(), entry.getKey()));
            }
        }

        C7830q(C8139s<K, V> sVar, C5831y<? super Entry<K, V>> yVar) {
            super(sVar, yVar);
            this.f21532R = new C7830q(sVar.mo29607k(), m37401a(yVar), this);
        }

        /* renamed from: a */
        private static <K, V> C5831y<Entry<V, K>> m37401a(C5831y<? super Entry<K, V>> yVar) {
            return new C7831a(yVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C8139s<K, V> mo30402d() {
            return (C8139s) this.f21526O;
        }

        /* renamed from: k */
        public C8139s<V, K> mo29607k() {
            return this.f21532R;
        }

        /* renamed from: a */
        public V mo29602a(@C5952h K k, @C5952h V v) {
            C7397x.m35670a(mo30382b(k, v));
            return mo30402d().mo29602a(k, v);
        }

        public Set<V> values() {
            return this.f21532R.keySet();
        }

        private C7830q(C8139s<K, V> sVar, C5831y<? super Entry<K, V>> yVar, C8139s<V, K> sVar2) {
            super(sVar, yVar);
            this.f21532R = sVar2;
        }
    }

    /* renamed from: com.google.common.collect.f4$r */
    /* compiled from: Maps */
    static class C7832r<K, V> extends C7821k<K, V> {

        /* renamed from: Q */
        final Set<Entry<K, V>> f21534Q;

        /* renamed from: com.google.common.collect.f4$r$a */
        /* compiled from: Maps */
        private class C7833a extends C7555b2<Entry<K, V>> {

            /* renamed from: com.google.common.collect.f4$r$a$a */
            /* compiled from: Maps */
            class C7834a extends C7847f6<Entry<K, V>, Entry<K, V>> {

                /* renamed from: com.google.common.collect.f4$r$a$a$a */
                /* compiled from: Maps */
                class C7835a extends C8244w1<K, V> {

                    /* renamed from: a */
                    final /* synthetic */ Entry f21537a;

                    C7835a(Entry entry) {
                        this.f21537a = entry;
                    }

                    public V setValue(V v) {
                        C7397x.m35670a(C7832r.this.mo30382b(getKey(), v));
                        return super.setValue(v);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: y */
                    public Entry<K, V> m37414y() {
                        return this.f21537a;
                    }
                }

                C7834a(Iterator it) {
                    super(it);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public Entry<K, V> mo30361a(Entry<K, V> entry) {
                    return new C7835a(entry);
                }
            }

            private C7833a() {
            }

            public Iterator<Entry<K, V>> iterator() {
                return new C7834a(C7832r.this.f21534Q.iterator());
            }

            /* synthetic */ C7833a(C7832r rVar, C7803b bVar) {
                this();
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Set<Entry<K, V>> m37410y() {
                return C7832r.this.f21534Q;
            }
        }

        /* renamed from: com.google.common.collect.f4$r$b */
        /* compiled from: Maps */
        class C7836b extends C7842w<K, V> {
            C7836b() {
                super(C7832r.this);
            }

            /* renamed from: a */
            private boolean m37415a(C5831y<? super K> yVar) {
                return C8145s3.m39043g(C7832r.this.f21526O.entrySet(), C7398z.m35684a(C7832r.this.f21527P, C7800f4.m37276a(yVar)));
            }

            public boolean remove(Object obj) {
                if (!C7832r.this.containsKey(obj)) {
                    return false;
                }
                C7832r.this.f21526O.remove(obj);
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                return m37415a(C7398z.m35689a(collection));
            }

            public boolean retainAll(Collection<?> collection) {
                return m37415a(C7398z.m35682a(C7398z.m35689a(collection)));
            }

            public Object[] toArray() {
                return C8309z3.m39649a(iterator()).toArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return C8309z3.m39649a(iterator()).toArray(tArr);
            }
        }

        C7832r(Map<K, V> map, C5831y<? super Entry<K, V>> yVar) {
            super(map, yVar);
            this.f21534Q = C8047m5.m38515a(map.entrySet(), this.f21527P);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, V>> mo29734a() {
            return new C7833a(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<K> mo29652b() {
            return new C7836b();
        }
    }

    /* renamed from: com.google.common.collect.f4$s */
    /* compiled from: Maps */
    private static class C7837s<K, V> extends C7832r<K, V> implements SortedMap<K, V> {

        /* renamed from: com.google.common.collect.f4$s$a */
        /* compiled from: Maps */
        class C7838a extends C7836b implements SortedSet<K> {
            C7838a() {
                super();
            }

            public Comparator<? super K> comparator() {
                return C7837s.this.mo30408d().comparator();
            }

            public K first() {
                return C7837s.this.firstKey();
            }

            public SortedSet<K> headSet(K k) {
                return (SortedSet) C7837s.this.headMap(k).keySet();
            }

            public K last() {
                return C7837s.this.lastKey();
            }

            public SortedSet<K> subSet(K k, K k2) {
                return (SortedSet) C7837s.this.subMap(k, k2).keySet();
            }

            public SortedSet<K> tailSet(K k) {
                return (SortedSet) C7837s.this.tailMap(k).keySet();
            }
        }

        C7837s(SortedMap<K, V> sortedMap, C5831y<? super Entry<K, V>> yVar) {
            super(sortedMap, yVar);
        }

        public Comparator<? super K> comparator() {
            return mo30408d().comparator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedMap<K, V> mo30408d() {
            return (SortedMap) this.f21526O;
        }

        public K firstKey() {
            return keySet().iterator().next();
        }

        public SortedMap<K, V> headMap(K k) {
            return new C7837s(mo30408d().headMap(k), this.f21527P);
        }

        public K lastKey() {
            SortedMap d = mo30408d();
            while (true) {
                K lastKey = d.lastKey();
                if (mo30382b(lastKey, this.f21526O.get(lastKey))) {
                    return lastKey;
                }
                d = mo30408d().headMap(lastKey);
            }
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return new C7837s(mo30408d().subMap(k, k2), this.f21527P);
        }

        public SortedMap<K, V> tailMap(K k) {
            return new C7837s(mo30408d().tailMap(k), this.f21527P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<K> m37417b() {
            return new C7838a();
        }

        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    /* renamed from: com.google.common.collect.f4$t */
    /* compiled from: Maps */
    private static class C7839t<K, V> extends C7821k<K, V> {

        /* renamed from: Q */
        C5831y<? super K> f21541Q;

        C7839t(Map<K, V> map, C5831y<? super K> yVar, C5831y<? super Entry<K, V>> yVar2) {
            super(map, yVar2);
            this.f21541Q = yVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, V>> mo29734a() {
            return C8047m5.m38515a(this.f21526O.entrySet(), this.f21527P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<K> mo29652b() {
            return C8047m5.m38515a(this.f21526O.keySet(), this.f21541Q);
        }

        public boolean containsKey(Object obj) {
            return this.f21526O.containsKey(obj) && this.f21541Q.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.f4$u */
    /* compiled from: Maps */
    private static final class C7840u<K, V> extends C7818h0<K, V> {

        /* renamed from: N */
        C5831y<? super Entry<K, V>> f21542N;

        /* renamed from: b */
        Map<K, V> f21543b;

        C7840u(Map<K, V> map, Map<K, V> map2, C5831y<? super Entry<K, V>> yVar) {
            super(map);
            this.f21543b = map2;
            this.f21542N = yVar;
        }

        /* renamed from: a */
        private boolean m37421a(C5831y<? super V> yVar) {
            return C8145s3.m39043g(this.f21543b.entrySet(), C7398z.m35684a(this.f21542N, C7800f4.m37311b(yVar)));
        }

        public boolean remove(Object obj) {
            return C8145s3.m39041f(this.f21543b.entrySet(), C7398z.m35684a(this.f21542N, C7800f4.m37311b(C7398z.m35687a(obj)))) != null;
        }

        public boolean removeAll(Collection<?> collection) {
            return m37421a(C7398z.m35689a(collection));
        }

        public boolean retainAll(Collection<?> collection) {
            return m37421a(C7398z.m35682a(C7398z.m35689a(collection)));
        }

        public Object[] toArray() {
            return C8309z3.m39649a(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C8309z3.m39649a(iterator()).toArray(tArr);
        }
    }

    @C2776b
    /* renamed from: com.google.common.collect.f4$v */
    /* compiled from: Maps */
    static abstract class C7841v<K, V> extends AbstractMap<K, V> {

        /* renamed from: N */
        private transient Collection<V> f21544N;

        /* renamed from: a */
        private transient Set<Entry<K, V>> f21545a;

        /* renamed from: b */
        private transient Set<K> f21546b;

        C7841v() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Set<Entry<K, V>> mo29734a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<K> mo29652b() {
            return new C7842w(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo29736c() {
            return new C7818h0(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f21545a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a = mo29734a();
            this.f21545a = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f21546b;
            if (set != null) {
                return set;
            }
            Set<K> b = mo29652b();
            this.f21546b = b;
            return b;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f21544N;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo29736c();
            this.f21544N = c;
            return c;
        }
    }

    /* renamed from: com.google.common.collect.f4$w */
    /* compiled from: Maps */
    static class C7842w<K, V> extends C8055g<K> {

        /* renamed from: a */
        final Map<K, V> f21547a;

        C7842w(Map<K, V> map) {
            this.f21547a = (Map) C7397x.m35664a(map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo30423b() {
            return this.f21547a;
        }

        public void clear() {
            mo30423b().clear();
        }

        public boolean contains(Object obj) {
            return mo30423b().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo30423b().isEmpty();
        }

        public Iterator<K> iterator() {
            return C7800f4.m37289a(mo30423b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo30423b().remove(obj);
            return true;
        }

        public int size() {
            return mo30423b().size();
        }
    }

    /* renamed from: com.google.common.collect.f4$x */
    /* compiled from: Maps */
    static class C7843x<K, V> implements C7621c4<K, V> {

        /* renamed from: a */
        final Map<K, V> f21548a;

        /* renamed from: b */
        final Map<K, V> f21549b;

        /* renamed from: c */
        final Map<K, V> f21550c;

        /* renamed from: d */
        final Map<K, C7622a<V>> f21551d;

        C7843x(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, C7622a<V>> map4) {
            this.f21548a = C7800f4.m37353g(map);
            this.f21549b = C7800f4.m37353g(map2);
            this.f21550c = C7800f4.m37353g(map3);
            this.f21551d = C7800f4.m37353g(map4);
        }

        /* renamed from: a */
        public Map<K, V> mo29828a() {
            return this.f21548a;
        }

        /* renamed from: b */
        public Map<K, C7622a<V>> mo29829b() {
            return this.f21551d;
        }

        /* renamed from: c */
        public boolean mo29830c() {
            return this.f21548a.isEmpty() && this.f21549b.isEmpty() && this.f21551d.isEmpty();
        }

        /* renamed from: d */
        public Map<K, V> mo29831d() {
            return this.f21549b;
        }

        /* renamed from: e */
        public Map<K, V> mo29832e() {
            return this.f21550c;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7621c4)) {
                return false;
            }
            C7621c4 c4Var = (C7621c4) obj;
            if (!mo29828a().equals(c4Var.mo29828a()) || !mo29831d().equals(c4Var.mo29831d()) || !mo29832e().equals(c4Var.mo29832e()) || !mo29829b().equals(c4Var.mo29829b())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C5827t.m25558a(mo29828a(), mo29831d(), mo29832e(), mo29829b());
        }

        public String toString() {
            if (mo29830c()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f21548a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f21548a);
            }
            if (!this.f21549b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f21549b);
            }
            if (!this.f21551d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f21551d);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.f4$y */
    /* compiled from: Maps */
    private static class C7844y<K, V> extends C7822l<K, V> implements SortedMap<K, V> {
        C7844y(SortedSet<K> sortedSet, C7380p<? super K, V> pVar) {
            super(sortedSet, pVar);
        }

        public Comparator<? super K> comparator() {
            return mo30391d().comparator();
        }

        public K firstKey() {
            return mo30391d().first();
        }

        public SortedMap<K, V> headMap(K k) {
            return C7800f4.m37303a(mo30391d().headSet(k), this.f21529P);
        }

        public Set<K> keySet() {
            return C7800f4.m37327b(mo30391d());
        }

        public K lastKey() {
            return mo30391d().last();
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return C7800f4.m37303a(mo30391d().subSet(k, k2), this.f21529P);
        }

        public SortedMap<K, V> tailMap(K k) {
            return C7800f4.m37303a(mo30391d().tailSet(k), this.f21529P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedSet<K> m37432d() {
            return (SortedSet) super.mo30391d();
        }
    }

    /* renamed from: com.google.common.collect.f4$z */
    /* compiled from: Maps */
    static class C7845z<K, V> extends C7842w<K, V> implements SortedSet<K> {
        C7845z(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo30423b().comparator();
        }

        public K first() {
            return mo30423b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C7845z(mo30423b().headMap(k));
        }

        public K last() {
            return mo30423b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C7845z(mo30423b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C7845z(mo30423b().tailMap(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedMap<K, V> m37434b() {
            return (SortedMap) super.mo30423b();
        }
    }

    private C7800f4() {
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m37319b(Iterator<Entry<K, V>> it) {
        return C8178t3.m39099a(it, m37352g());
    }

    /* renamed from: c */
    public static <K, V> HashMap<K, V> m37335c() {
        return new HashMap<>();
    }

    /* renamed from: d */
    public static <K, V> HashMap<K, V> m37342d(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    /* renamed from: e */
    public static <K, V> LinkedHashMap<K, V> m37347e() {
        return new LinkedHashMap<>();
    }

    /* renamed from: f */
    public static <K extends Comparable, V> TreeMap<K, V> m37351f() {
        return new TreeMap<>();
    }

    /* renamed from: g */
    static <V> C7380p<Entry<?, V>, V> m37352g() {
        return C7825n.VALUE;
    }

    @C2776b(serializable = true)
    @C2775a
    /* renamed from: b */
    public static <K extends Enum<K>, V> C8302z2<K, V> m37316b(Map<K, ? extends V> map) {
        if (map instanceof C8224v2) {
            return (C8224v2) map;
        }
        if (map.isEmpty()) {
            return C8302z2.m39630i();
        }
        for (Entry entry : map.entrySet()) {
            C7397x.m35664a(entry.getKey());
            C7397x.m35664a(entry.getValue());
        }
        return C8224v2.m39224a(new EnumMap<>(map));
    }

    /* renamed from: c */
    public static <K extends Enum<K>, V> EnumMap<K, V> m37334c(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    /* renamed from: d */
    public static <K, V> IdentityHashMap<K, V> m37343d() {
        return new IdentityHashMap<>();
    }

    /* renamed from: e */
    public static <K, V> LinkedHashMap<K, V> m37348e(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    /* renamed from: f */
    static <V> V m37349f(Map<?, V> map, Object obj) {
        C7397x.m35664a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static <K, V> Map<K, V> m37353g(Map<K, V> map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap) map);
        }
        return Collections.unmodifiableMap(map);
    }

    /* renamed from: c */
    static <K, V> Set<Entry<K, V>> m37338c(Set<Entry<K, V>> set) {
        return new C7814f0(Collections.unmodifiableSet(set));
    }

    /* renamed from: d */
    public static <K, V> SortedMap<K, V> m37344d(SortedMap<K, V> sortedMap, C5831y<? super V> yVar) {
        return m37301a(sortedMap, m37311b(yVar));
    }

    /* renamed from: e */
    static <V> V m37346e(Map<?, V> map, @C5952h Object obj) {
        C7397x.m35664a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <K> C7380p<Entry<K, ?>, K> m37273a() {
        return C7825n.KEY;
    }

    /* renamed from: c */
    public static <K, V> C8139s<K, V> m37332c(C8139s<? extends K, ? extends V> sVar) {
        return new C7809d0(sVar, null);
    }

    /* renamed from: d */
    static boolean m37345d(Map<?, ?> map, Object obj) {
        C7397x.m35664a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: f */
    static String m37350f(Map<?, ?> map) {
        StringBuilder a = C8292z.m39585a(map.size());
        a.append('{');
        f21500a.mo23137a(a, map);
        a.append('}');
        return a.toString();
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m37289a(Iterator<Entry<K, V>> it) {
        return C8178t3.m39099a(it, m37273a());
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m37337c(Map<K, V> map, C5831y<? super V> yVar) {
        if (map instanceof SortedMap) {
            return m37344d((SortedMap) map, yVar);
        }
        if (map instanceof C8139s) {
            return m37333c((C8139s) map, yVar);
        }
        return m37295a(map, m37311b(yVar));
    }

    /* renamed from: a */
    static <K, V> C8023l6<V> m37280a(C8023l6<Entry<K, V>> l6Var) {
        return new C7803b(l6Var);
    }

    @C5952h
    /* renamed from: d */
    static <V> V m37341d(@C5952h Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: a */
    static int m37271a(int i) {
        if (i < 3) {
            C8277y.m39484a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return i + (i / 3);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: a */
    public static <K, V> TreeMap<K, V> m37306a(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>(sortedMap);
    }

    /* renamed from: a */
    public static <C, K extends C, V> TreeMap<K, V> m37305a(@C5952h Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m37318b(int i) {
        return new HashMap<>(m37271a(i));
    }

    /* renamed from: c */
    public static <K, V> C8139s<K, V> m37333c(C8139s<K, V> sVar, C5831y<? super V> yVar) {
        return m37282a(sVar, m37311b(yVar));
    }

    /* renamed from: a */
    public static <K extends Enum<K>, V> EnumMap<K, V> m37288a(Class<K> cls) {
        return new EnumMap<>((Class) C7397x.m35664a(cls));
    }

    /* renamed from: b */
    public static <K, V> ConcurrentMap<K, V> m37328b() {
        return new C7660d4().mo29954c();
    }

    /* renamed from: c */
    static <K, V> SortedMap<K, V> m37339c(SortedMap<K, V> sortedMap, C5831y<? super Entry<K, V>> yVar) {
        C7397x.m35664a(yVar);
        return sortedMap instanceof C7837s ? m37299a((C7837s) sortedMap, yVar) : new C7837s((SortedMap) C7397x.m35664a(sortedMap), yVar);
    }

    /* renamed from: a */
    public static <K, V> C7621c4<K, V> m37277a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        if (map instanceof SortedMap) {
            return m37283a((SortedMap) map, map2);
        }
        return m37278a(map, map2, C7359j.m35591d());
    }

    /* renamed from: b */
    static <E> Comparator<? super E> m37317b(@C5952h Comparator<? super E> comparator) {
        return comparator != null ? comparator : C8133r4.m38943j();
    }

    /* renamed from: b */
    static <K, V> SortedMap<K, V> m37326b(SortedSet<K> sortedSet, C7380p<? super K, V> pVar) {
        return new C7844y(sortedSet, pVar);
    }

    @C5952h
    /* renamed from: c */
    private static <K, V> Entry<K, V> m37336c(@C5952h Entry<K, V> entry) {
        if (entry == null) {
            return null;
        }
        return m37321b(entry);
    }

    /* renamed from: b */
    static <K, V> Iterator<Entry<K, V>> m37320b(Set<K> set, C7380p<? super K, V> pVar) {
        return new C7806c(set.iterator(), pVar);
    }

    /* renamed from: c */
    static boolean m37340c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> Set<E> m37323b(Set<E> set) {
        return new C7808d(set);
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> C7621c4<K, V> m37278a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, C7359j<? super V> jVar) {
        C7397x.m35664a(jVar);
        HashMap c = m37335c();
        HashMap hashMap = new HashMap(map2);
        HashMap c2 = m37335c();
        HashMap c3 = m37335c();
        m37307a(map, map2, jVar, c, hashMap, c2, c3);
        return new C7843x(c, hashMap, c2, c3);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> SortedSet<E> m37327b(SortedSet<E> sortedSet) {
        return new C7810e(sortedSet);
    }

    /* renamed from: b */
    public static <K, V> C8302z2<K, V> m37314b(Iterable<V> iterable, C7380p<? super V, K> pVar) {
        return m37315b(iterable.iterator(), pVar);
    }

    /* renamed from: b */
    public static <K, V> C8302z2<K, V> m37315b(Iterator<V> it, C7380p<? super V, K> pVar) {
        C7397x.m35664a(pVar);
        C8303a g = C8302z2.m39628g();
        while (it.hasNext()) {
            Object next = it.next();
            g.mo30687a(pVar.apply(next), next);
        }
        return g.mo30690a();
    }

    /* renamed from: a */
    private static <K, V> void m37307a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, C7359j<? super V> jVar, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, C7622a<V>> map6) {
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object remove = map4.remove(key);
                if (jVar.mo29253b(value, remove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, C7816g0.m37382a(value, remove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* renamed from: b */
    static <K, V> Entry<K, V> m37321b(Entry<? extends K, ? extends V> entry) {
        C7397x.m35664a(entry);
        return new C7813f(entry);
    }

    /* renamed from: b */
    public static <K, V> C8139s<K, V> m37312b(C8139s<K, V> sVar) {
        return C7624c6.m36463a(sVar, (Object) null);
    }

    /* renamed from: b */
    static <K, V1, V2> SortedMap<K, V2> m37325b(SortedMap<K, V1> sortedMap, C7829p<? super K, ? super V1, V2> pVar) {
        return new C7807c0(sortedMap, pVar);
    }

    /* renamed from: b */
    static <K, V1, V2> C7380p<Entry<K, V1>, V2> m37310b(C7829p<? super K, ? super V1, V2> pVar) {
        C7397x.m35664a(pVar);
        return new C7819i(pVar);
    }

    /* renamed from: b */
    static <V> C5831y<Entry<?, V>> m37311b(C5831y<? super V> yVar) {
        return C7398z.m35683a(yVar, m37352g());
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m37322b(Map<K, V> map, C5831y<? super K> yVar) {
        if (map instanceof SortedMap) {
            return m37324b((SortedMap) map, yVar);
        }
        if (map instanceof C8139s) {
            return m37313b((C8139s) map, yVar);
        }
        C7397x.m35664a(yVar);
        C5831y a = m37276a(yVar);
        return map instanceof C7821k ? m37292a((C7821k) map, a) : new C7839t<>((Map) C7397x.m35664a(map), yVar, a);
    }

    /* renamed from: a */
    public static <K, V> C8217u5<K, V> m37283a(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        C7397x.m35664a(sortedMap);
        C7397x.m35664a(map);
        Comparator b = m37317b(sortedMap.comparator());
        TreeMap a = m37305a(b);
        TreeMap a2 = m37305a(b);
        a2.putAll(map);
        TreeMap a3 = m37305a(b);
        TreeMap a4 = m37305a(b);
        m37307a(sortedMap, map, C7359j.m35591d(), a, a2, a3, a4);
        return new C7802a0(a, a2, a3, a4);
    }

    /* renamed from: b */
    public static <K, V> SortedMap<K, V> m37324b(SortedMap<K, V> sortedMap, C5831y<? super K> yVar) {
        return m37301a(sortedMap, m37276a(yVar));
    }

    /* renamed from: b */
    public static <K, V> C8139s<K, V> m37313b(C8139s<K, V> sVar, C5831y<? super K> yVar) {
        C7397x.m35664a(yVar);
        return m37282a(sVar, m37276a(yVar));
    }

    /* renamed from: b */
    static boolean m37331b(Map<?, ?> map, @C5952h Object obj) {
        return C8178t3.m39108a(m37319b(map.entrySet().iterator()), obj);
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> Map<K, V> m37297a(Set<K> set, C7380p<? super K, V> pVar) {
        if (set instanceof SortedSet) {
            return m37303a((SortedSet) set, pVar);
        }
        return new C7822l(set, pVar);
    }

    /* renamed from: b */
    static <K, V> boolean m37330b(Collection<Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        return collection.remove(m37321b((Entry) obj));
    }

    /* renamed from: b */
    static <K, V> void m37329b(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> SortedMap<K, V> m37303a(SortedSet<K> sortedSet, C7380p<? super K, V> pVar) {
        return C8196t4.m39149a(sortedSet, pVar);
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m37284a(Iterable<K> iterable, C7380p<? super K, V> pVar) {
        return m37285a(iterable.iterator(), pVar);
    }

    @C2775a
    /* renamed from: a */
    public static <K, V> C8302z2<K, V> m37285a(Iterator<K> it, C7380p<? super K, V> pVar) {
        C7397x.m35664a(pVar);
        LinkedHashMap e = m37347e();
        while (it.hasNext()) {
            Object next = it.next();
            e.put(next, pVar.apply(next));
        }
        return C8302z2.m39622a(e);
    }

    @C2777c("java.util.Properties")
    /* renamed from: a */
    public static C8302z2<String, String> m37286a(Properties properties) {
        C8303a g = C8302z2.m39628g();
        Enumeration propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            g.mo30687a(str, properties.getProperty(str));
        }
        return g.mo30690a();
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <K, V> Entry<K, V> m37291a(@C5952h K k, @C5952h V v) {
        return new C8214u2(k, v);
    }

    @C2775a
    /* renamed from: a */
    public static <A, B> C7337g<A, B> m37272a(C8139s<A, B> sVar) {
        return new C7824m(sVar);
    }

    /* renamed from: a */
    public static <K, V1, V2> Map<K, V2> m37294a(Map<K, V1> map, C7380p<? super V1, V2> pVar) {
        return m37296a(map, m37279a(pVar));
    }

    /* renamed from: a */
    public static <K, V1, V2> SortedMap<K, V2> m37300a(SortedMap<K, V1> sortedMap, C7380p<? super V1, V2> pVar) {
        return m37302a(sortedMap, m37279a(pVar));
    }

    /* renamed from: a */
    public static <K, V1, V2> Map<K, V2> m37296a(Map<K, V1> map, C7829p<? super K, ? super V1, V2> pVar) {
        if (map instanceof SortedMap) {
            return m37302a((SortedMap) map, pVar);
        }
        return new C7804b0(map, pVar);
    }

    /* renamed from: a */
    public static <K, V1, V2> SortedMap<K, V2> m37302a(SortedMap<K, V1> sortedMap, C7829p<? super K, ? super V1, V2> pVar) {
        return C8196t4.m39148a(sortedMap, pVar);
    }

    /* renamed from: a */
    static <K, V1, V2> C7829p<K, V1, V2> m37279a(C7380p<? super V1, V2> pVar) {
        C7397x.m35664a(pVar);
        return new C7815g(pVar);
    }

    /* renamed from: a */
    static <K, V1, V2> C7380p<V1, V2> m37275a(C7829p<? super K, V1, V2> pVar, K k) {
        C7397x.m35664a(pVar);
        return new C7817h(pVar, k);
    }

    /* renamed from: a */
    static <V2, K, V1> Entry<K, V2> m37290a(C7829p<? super K, ? super V1, V2> pVar, Entry<K, V1> entry) {
        C7397x.m35664a(pVar);
        C7397x.m35664a(entry);
        return new C7820j(entry, pVar);
    }

    /* renamed from: a */
    static <K, V1, V2> C7380p<Entry<K, V1>, Entry<K, V2>> m37274a(C7829p<? super K, ? super V1, V2> pVar) {
        C7397x.m35664a(pVar);
        return new C7801a(pVar);
    }

    /* renamed from: a */
    static <K> C5831y<Entry<K, ?>> m37276a(C5831y<? super K> yVar) {
        return C7398z.m35683a(yVar, m37273a());
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m37295a(Map<K, V> map, C5831y<? super Entry<K, V>> yVar) {
        if (map instanceof SortedMap) {
            return m37301a((SortedMap) map, yVar);
        }
        if (map instanceof C8139s) {
            return m37282a((C8139s) map, yVar);
        }
        C7397x.m35664a(yVar);
        return map instanceof C7821k ? m37292a((C7821k) map, yVar) : new C7832r<>((Map) C7397x.m35664a(map), yVar);
    }

    /* renamed from: a */
    public static <K, V> SortedMap<K, V> m37301a(SortedMap<K, V> sortedMap, C5831y<? super Entry<K, V>> yVar) {
        return C8196t4.m39147a(sortedMap, yVar);
    }

    /* renamed from: a */
    public static <K, V> C8139s<K, V> m37282a(C8139s<K, V> sVar, C5831y<? super Entry<K, V>> yVar) {
        C7397x.m35664a(sVar);
        C7397x.m35664a(yVar);
        return sVar instanceof C7830q ? m37281a((C7830q) sVar, yVar) : new C7830q(sVar, yVar);
    }

    /* renamed from: a */
    private static <K, V> Map<K, V> m37292a(C7821k<K, V> kVar, C5831y<? super Entry<K, V>> yVar) {
        return new C7832r(kVar.f21526O, C7398z.m35684a(kVar.f21527P, yVar));
    }

    /* renamed from: a */
    private static <K, V> SortedMap<K, V> m37299a(C7837s<K, V> sVar, C5831y<? super Entry<K, V>> yVar) {
        return new C7837s(sVar.mo30408d(), C7398z.m35684a(sVar.f21527P, yVar));
    }

    /* renamed from: a */
    private static <K, V> C8139s<K, V> m37281a(C7830q<K, V> qVar, C5831y<? super Entry<K, V>> yVar) {
        return new C7830q(qVar.mo30402d(), C7398z.m35684a(qVar.f21527P, yVar));
    }

    /* renamed from: a */
    static boolean m37309a(Map<?, ?> map, @C5952h Object obj) {
        return C8178t3.m39108a(m37289a(map.entrySet().iterator()), obj);
    }

    /* renamed from: a */
    static <K, V> boolean m37308a(Collection<Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        return collection.contains(m37321b((Entry) obj));
    }

    @C5952h
    /* renamed from: a */
    static <K> K m37287a(@C5952h Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
}
