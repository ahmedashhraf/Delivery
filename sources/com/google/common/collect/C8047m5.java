package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7859g3.C7860a;
import com.google.common.collect.C8257x2.C8259b;
import com.google.common.collect.C8302z2.C8303a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.m5 */
/* compiled from: Sets */
public final class C8047m5 {

    /* renamed from: com.google.common.collect.m5$a */
    /* compiled from: Sets */
    static class C8048a extends C8059j<E> {

        /* renamed from: N */
        final /* synthetic */ Set f21837N;

        /* renamed from: a */
        final /* synthetic */ Set f21838a;

        /* renamed from: b */
        final /* synthetic */ Set f21839b;

        C8048a(Set set, Set set2, Set set3) {
            this.f21838a = set;
            this.f21839b = set2;
            this.f21837N = set3;
            super(null);
        }

        /* renamed from: a */
        public <S extends Set<E>> S mo30821a(S s) {
            s.addAll(this.f21838a);
            s.addAll(this.f21837N);
            return s;
        }

        /* renamed from: b */
        public C7859g3<E> mo30822b() {
            return new C7860a().m37520a((Iterable<? extends E>) this.f21838a).m37520a((Iterable<? extends E>) this.f21837N).m37524a();
        }

        public boolean contains(Object obj) {
            return this.f21838a.contains(obj) || this.f21837N.contains(obj);
        }

        public boolean isEmpty() {
            return this.f21838a.isEmpty() && this.f21837N.isEmpty();
        }

        public Iterator<E> iterator() {
            return C8178t3.m39140l(C8178t3.m39100a(this.f21838a.iterator(), this.f21839b.iterator()));
        }

        public int size() {
            return this.f21838a.size() + this.f21839b.size();
        }
    }

    /* renamed from: com.google.common.collect.m5$b */
    /* compiled from: Sets */
    static class C8049b extends C8059j<E> {

        /* renamed from: N */
        final /* synthetic */ Set f21840N;

        /* renamed from: a */
        final /* synthetic */ Set f21841a;

        /* renamed from: b */
        final /* synthetic */ C5831y f21842b;

        C8049b(Set set, C5831y yVar, Set set2) {
            this.f21841a = set;
            this.f21842b = yVar;
            this.f21840N = set2;
            super(null);
        }

        public boolean contains(Object obj) {
            return this.f21841a.contains(obj) && this.f21840N.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f21841a.containsAll(collection) && this.f21840N.containsAll(collection);
        }

        public boolean isEmpty() {
            return !iterator().hasNext();
        }

        public Iterator<E> iterator() {
            return C8178t3.m39119c(this.f21841a.iterator(), this.f21842b);
        }

        public int size() {
            return C8178t3.m39138j(iterator());
        }
    }

    /* renamed from: com.google.common.collect.m5$c */
    /* compiled from: Sets */
    static class C8050c extends C8059j<E> {

        /* renamed from: N */
        final /* synthetic */ Set f21843N;

        /* renamed from: a */
        final /* synthetic */ Set f21844a;

        /* renamed from: b */
        final /* synthetic */ C5831y f21845b;

        C8050c(Set set, C5831y yVar, Set set2) {
            this.f21844a = set;
            this.f21845b = yVar;
            this.f21843N = set2;
            super(null);
        }

        public boolean contains(Object obj) {
            return this.f21844a.contains(obj) && !this.f21843N.contains(obj);
        }

        public boolean isEmpty() {
            return this.f21843N.containsAll(this.f21844a);
        }

        public Iterator<E> iterator() {
            return C8178t3.m39119c(this.f21844a.iterator(), this.f21845b);
        }

        public int size() {
            return C8178t3.m39138j(iterator());
        }
    }

    /* renamed from: com.google.common.collect.m5$d */
    /* compiled from: Sets */
    private static final class C8051d<E> extends C7997l1<List<E>> implements Set<List<E>> {

        /* renamed from: a */
        private final transient C8257x2<C7859g3<E>> f21846a;

        /* renamed from: b */
        private final transient C8241w<E> f21847b;

        /* renamed from: com.google.common.collect.m5$d$a */
        /* compiled from: Sets */
        static class C8052a extends C8257x2<List<E>> {

            /* renamed from: N */
            final /* synthetic */ C8257x2 f21848N;

            C8052a(C8257x2 x2Var) {
                this.f21848N = x2Var;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: j */
            public boolean mo29686j() {
                return true;
            }

            public int size() {
                return this.f21848N.size();
            }

            public List<E> get(int i) {
                return ((C7859g3) this.f21848N.get(i)).mo30933e();
            }
        }

        private C8051d(C8257x2<C7859g3<E>> x2Var, C8241w<E> wVar) {
            this.f21846a = x2Var;
            this.f21847b = wVar;
        }

        /* renamed from: a */
        static <E> Set<List<E>> m38541a(List<? extends Set<? extends E>> list) {
            C8259b bVar = new C8259b(list.size());
            for (Set a : list) {
                C7859g3 a2 = C7859g3.m37505a((Collection<? extends E>) a);
                if (a2.isEmpty()) {
                    return C7859g3.m37512m();
                }
                bVar.m39420a((Object) a2);
            }
            C8257x2 a3 = bVar.mo30346a();
            return new C8051d(a3, new C8241w(new C8052a(a3)));
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C8051d)) {
                return super.equals(obj);
            }
            return this.f21846a.equals(((C8051d) obj).f21846a);
        }

        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.f21846a.size(); i2++) {
                size = ((size * 31) ^ -1) ^ -1;
            }
            Iterator it = this.f21846a.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                i = (((i * 31) + ((size() / set.size()) * set.hashCode())) ^ -1) ^ -1;
            }
            return ((i + size) ^ -1) ^ -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Collection<List<E>> m38543y() {
            return this.f21847b;
        }
    }

    /* renamed from: com.google.common.collect.m5$e */
    /* compiled from: Sets */
    private static class C8053e<E> extends C8294b<E> implements Set<E> {
        C8053e(Set<E> set, C5831y<? super E> yVar) {
            super(set, yVar);
        }

        public boolean equals(@C5952h Object obj) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C8047m5.m38502a((Set<?>) this);
        }
    }

    /* renamed from: com.google.common.collect.m5$f */
    /* compiled from: Sets */
    private static class C8054f<E> extends C8053e<E> implements SortedSet<E> {
        C8054f(SortedSet<E> sortedSet, C5831y<? super E> yVar) {
            super(sortedSet, yVar);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f22162a).comparator();
        }

        public E first() {
            return iterator().next();
        }

        public SortedSet<E> headSet(E e) {
            return new C8054f(((SortedSet) this.f22162a).headSet(e), this.f22163b);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f22162a;
            while (true) {
                E last = sortedSet.last();
                if (this.f22163b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(E e, E e2) {
            return new C8054f(((SortedSet) this.f22162a).subSet(e, e2), this.f22163b);
        }

        public SortedSet<E> tailSet(E e) {
            return new C8054f(((SortedSet) this.f22162a).tailSet(e), this.f22163b);
        }
    }

    /* renamed from: com.google.common.collect.m5$g */
    /* compiled from: Sets */
    static abstract class C8055g<E> extends AbstractSet<E> {
        C8055g() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C8047m5.m38520a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C7397x.m35664a(collection));
        }
    }

    /* renamed from: com.google.common.collect.m5$h */
    /* compiled from: Sets */
    private static final class C8056h<E> extends AbstractSet<Set<E>> {

        /* renamed from: a */
        final C8302z2<E, Integer> f21849a;

        /* renamed from: com.google.common.collect.m5$h$a */
        /* compiled from: Sets */
        class C8057a extends C7550b<Set<E>> {
            C8057a(int i) {
                super(i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Set<E> m38546a(int i) {
                return new C8060k(C8056h.this.f21849a, i);
            }
        }

        C8056h(Set<E> set) {
            C8303a g = C8302z2.m39628g();
            int i = 0;
            for (Object a : (Set) C7397x.m35664a(set)) {
                int i2 = i + 1;
                g.mo30687a(a, Integer.valueOf(i));
                i = i2;
            }
            this.f21849a = g.mo30690a();
            C7397x.m35672a(this.f21849a.size() <= 30, "Too many elements to create power set: %s > 30", Integer.valueOf(this.f21849a.size()));
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f21849a.keySet().containsAll((Set) obj);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C8056h)) {
                return super.equals(obj);
            }
            return this.f21849a.equals(((C8056h) obj).f21849a);
        }

        public int hashCode() {
            return this.f21849a.keySet().hashCode() << (this.f21849a.size() - 1);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<Set<E>> iterator() {
            return new C8057a(size());
        }

        public int size() {
            return 1 << this.f21849a.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("powerSet(");
            sb.append(this.f21849a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.m5$i */
    /* compiled from: Sets */
    private static class C8058i<E> extends AbstractSet<E> implements Set<E>, Serializable {
        @C2777c("not needed in emulated source")
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Map<E, Boolean> f21851a;

        /* renamed from: b */
        private transient Set<E> f21852b;

        C8058i(Map<E, Boolean> map) {
            C7397x.m35671a(map.isEmpty(), (Object) "Map is non-empty");
            this.f21851a = map;
            this.f21852b = map.keySet();
        }

        @C2777c("java.io.ObjectInputStream")
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21852b = this.f21851a.keySet();
        }

        public boolean add(E e) {
            return this.f21851a.put(e, Boolean.TRUE) == null;
        }

        public void clear() {
            this.f21851a.clear();
        }

        public boolean contains(Object obj) {
            return this.f21851a.containsKey(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f21852b.containsAll(collection);
        }

        public boolean equals(@C5952h Object obj) {
            return this == obj || this.f21852b.equals(obj);
        }

        public int hashCode() {
            return this.f21852b.hashCode();
        }

        public boolean isEmpty() {
            return this.f21851a.isEmpty();
        }

        public Iterator<E> iterator() {
            return this.f21852b.iterator();
        }

        public boolean remove(Object obj) {
            return this.f21851a.remove(obj) != null;
        }

        public boolean removeAll(Collection<?> collection) {
            return this.f21852b.removeAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return this.f21852b.retainAll(collection);
        }

        public int size() {
            return this.f21851a.size();
        }

        public Object[] toArray() {
            return this.f21852b.toArray();
        }

        public String toString() {
            return this.f21852b.toString();
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f21852b.toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.m5$j */
    /* compiled from: Sets */
    public static abstract class C8059j<E> extends AbstractSet<E> {
        /* synthetic */ C8059j(C8048a aVar) {
            this();
        }

        /* renamed from: a */
        public <S extends Set<E>> S mo30821a(S s) {
            s.addAll(this);
            return s;
        }

        /* renamed from: b */
        public C7859g3<E> mo30822b() {
            return C7859g3.m37505a((Collection<? extends E>) this);
        }

        private C8059j() {
        }
    }

    /* renamed from: com.google.common.collect.m5$k */
    /* compiled from: Sets */
    private static final class C8060k<E> extends AbstractSet<E> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8302z2<E, Integer> f21853a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f21854b;

        /* renamed from: com.google.common.collect.m5$k$a */
        /* compiled from: Sets */
        class C8061a extends C8023l6<E> {

            /* renamed from: a */
            final C8257x2<E> f21856a = C8060k.this.f21853a.keySet().mo30933e();

            /* renamed from: b */
            int f21857b = C8060k.this.f21854b;

            C8061a() {
            }

            public boolean hasNext() {
                return this.f21857b != 0;
            }

            public E next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f21857b);
                if (numberOfTrailingZeros != 32) {
                    this.f21857b &= (1 << numberOfTrailingZeros) ^ -1;
                    return this.f21856a.get(numberOfTrailingZeros);
                }
                throw new NoSuchElementException();
            }
        }

        C8060k(C8302z2<E, Integer> z2Var, int i) {
            this.f21853a = z2Var;
            this.f21854b = i;
        }

        public boolean contains(@C5952h Object obj) {
            Integer num = (Integer) this.f21853a.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f21854b) != 0) {
                    return true;
                }
            }
            return false;
        }

        public Iterator<E> iterator() {
            return new C8061a();
        }

        public int size() {
            return Integer.bitCount(this.f21854b);
        }
    }

    private C8047m5() {
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <E extends Enum<E>> C7859g3<E> m38503a(E e, E... eArr) {
        return C8245w2.m39340a(EnumSet.of(e, eArr));
    }

    /* renamed from: b */
    public static <E> Set<E> m38525b(Iterable<? extends E> iterable) {
        Set<E> a = m38512a();
        C8145s3.m39018a((Collection<T>) a, iterable);
        return a;
    }

    /* renamed from: c */
    public static <E> HashSet<E> m38530c() {
        return new HashSet<>();
    }

    /* renamed from: d */
    public static <E> HashSet<E> m38533d(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>(C8292z.m39586a(iterable)) : m38510a(iterable.iterator());
    }

    /* renamed from: e */
    public static <E> LinkedHashSet<E> m38535e() {
        return new LinkedHashSet<>();
    }

    /* renamed from: f */
    public static <E extends Comparable> TreeSet<E> m38537f() {
        return new TreeSet<>();
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <E extends Enum<E>> C7859g3<E> m38504a(Iterable<E> iterable) {
        if (iterable instanceof C8245w2) {
            return (C8245w2) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return C7859g3.m37512m();
            }
            return C8245w2.m39340a(EnumSet.copyOf(collection));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C7859g3.m37512m();
        }
        EnumSet of = EnumSet.of((Enum) it.next());
        C8178t3.m39106a((Collection<T>) of, it);
        return C8245w2.m39340a(of);
    }

    @C2777c("CopyOnWriteArraySet")
    /* renamed from: c */
    public static <E> CopyOnWriteArraySet<E> m38531c(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? C8292z.m39586a(iterable) : C8309z3.m39665b(iterable));
    }

    /* renamed from: d */
    public static <E> Set<E> m38534d() {
        return m38514a((Map<E, Boolean>) C7800f4.m37343d());
    }

    /* renamed from: e */
    public static <E> LinkedHashSet<E> m38536e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>(C8292z.m39586a(iterable));
        }
        LinkedHashSet<E> e = m38535e();
        C8145s3.m39018a((Collection<T>) e, iterable);
        return e;
    }

    /* renamed from: f */
    public static <E extends Comparable> TreeSet<E> m38538f(Iterable<? extends E> iterable) {
        TreeSet<E> f = m38537f();
        C8145s3.m39018a((Collection<T>) f, iterable);
        return f;
    }

    /* renamed from: b */
    public static <E> LinkedHashSet<E> m38524b(int i) {
        return new LinkedHashSet<>(C7800f4.m37271a(i));
    }

    /* renamed from: d */
    public static <E> C8059j<E> m38532d(Set<? extends E> set, Set<? extends E> set2) {
        C7397x.m35665a(set, (Object) "set1");
        C7397x.m35665a(set2, (Object) "set2");
        return new C8048a(set, m38505a(set2, set), set2);
    }

    @C2777c("CopyOnWriteArraySet")
    /* renamed from: b */
    public static <E> CopyOnWriteArraySet<E> m38528b() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: c */
    public static <E> C8059j<E> m38529c(Set<? extends E> set, Set<? extends E> set2) {
        C7397x.m35665a(set, (Object) "set1");
        C7397x.m35665a(set2, (Object) "set2");
        return m38505a((Set<E>) m38532d(set, set2), (Set<?>) m38522b(set, set2));
    }

    /* renamed from: b */
    private static <E extends Enum<E>> EnumSet<E> m38523b(Collection<E> collection, Class<E> cls) {
        EnumSet<E> allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    /* renamed from: b */
    public static <E> C8059j<E> m38522b(Set<E> set, Set<?> set2) {
        C7397x.m35665a(set, (Object) "set1");
        C7397x.m35665a(set2, (Object) "set2");
        return new C8049b(set, C7398z.m35689a((Collection<? extends T>) set2), set2);
    }

    /* renamed from: b */
    static <E> SortedSet<E> m38527b(SortedSet<E> sortedSet, C5831y<? super E> yVar) {
        if (!(sortedSet instanceof C8053e)) {
            return new C8054f((SortedSet) C7397x.m35664a(sortedSet), (C5831y) C7397x.m35664a(yVar));
        }
        C8053e eVar = (C8053e) sortedSet;
        return new C8054f((SortedSet) eVar.f22162a, C7398z.m35684a(eVar.f22163b, yVar));
    }

    /* renamed from: a */
    public static <E extends Enum<E>> EnumSet<E> m38506a(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        C8145s3.m39018a((Collection<T>) noneOf, iterable);
        return noneOf;
    }

    @C2776b(serializable = false)
    /* renamed from: b */
    public static <E> Set<Set<E>> m38526b(Set<E> set) {
        return new C8056h(set);
    }

    /* renamed from: a */
    public static <E> HashSet<E> m38511a(E... eArr) {
        HashSet<E> a = m38509a(eArr.length);
        Collections.addAll(a, eArr);
        return a;
    }

    /* renamed from: a */
    public static <E> HashSet<E> m38509a(int i) {
        return new HashSet<>(C7800f4.m37271a(i));
    }

    /* renamed from: a */
    public static <E> HashSet<E> m38510a(Iterator<? extends E> it) {
        HashSet<E> c = m38530c();
        C8178t3.m39106a((Collection<T>) c, it);
        return c;
    }

    /* renamed from: a */
    public static <E> Set<E> m38512a() {
        return m38514a((Map<E, Boolean>) new ConcurrentHashMap<E,Boolean>());
    }

    /* renamed from: a */
    public static <E> TreeSet<E> m38518a(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) C7397x.m35664a(comparator));
    }

    /* renamed from: a */
    public static <E extends Enum<E>> EnumSet<E> m38507a(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        C7397x.m35671a(!collection.isEmpty(), (Object) "collection is empty; use the other version of this method");
        return m38523b(collection, ((Enum) collection.iterator().next()).getDeclaringClass());
    }

    /* renamed from: a */
    public static <E extends Enum<E>> EnumSet<E> m38508a(Collection<E> collection, Class<E> cls) {
        C7397x.m35664a(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : m38523b(collection, cls);
    }

    /* renamed from: a */
    public static <E> Set<E> m38514a(Map<E, Boolean> map) {
        return new C8058i(map);
    }

    /* renamed from: a */
    public static <E> C8059j<E> m38505a(Set<E> set, Set<?> set2) {
        C7397x.m35665a(set, (Object) "set1");
        C7397x.m35665a(set2, (Object) "set2");
        return new C8050c(set, C7398z.m35682a(C7398z.m35689a((Collection<? extends T>) set2)), set2);
    }

    /* renamed from: a */
    public static <E> Set<E> m38515a(Set<E> set, C5831y<? super E> yVar) {
        if (set instanceof SortedSet) {
            return m38517a((SortedSet) set, yVar);
        }
        if (!(set instanceof C8053e)) {
            return new C8053e((Set) C7397x.m35664a(set), (C5831y) C7397x.m35664a(yVar));
        }
        C8053e eVar = (C8053e) set;
        return new C8053e((Set) eVar.f22162a, C7398z.m35684a(eVar.f22163b, yVar));
    }

    /* renamed from: a */
    public static <E> SortedSet<E> m38517a(SortedSet<E> sortedSet, C5831y<? super E> yVar) {
        return C8196t4.m39150a(sortedSet, yVar);
    }

    /* renamed from: a */
    public static <B> Set<List<B>> m38513a(List<? extends Set<? extends B>> list) {
        return C8051d.m38541a(list);
    }

    /* renamed from: a */
    public static <B> Set<List<B>> m38516a(Set<? extends B>... setArr) {
        return m38513a(Arrays.asList(setArr));
    }

    /* renamed from: a */
    static int m38502a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: a */
    static boolean m38519a(Set<?> set, @C5952h Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m38521a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    static boolean m38520a(Set<?> set, Collection<?> collection) {
        C7397x.m35664a(collection);
        if (collection instanceof C7982k4) {
            collection = ((C7982k4) collection).mo29710h();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m38521a(set, collection.iterator());
        }
        return C8178t3.m39109a(set.iterator(), collection);
    }
}
