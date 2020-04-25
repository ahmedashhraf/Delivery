package com.google.common.collect;

import com.google.common.base.C5822s;
import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p278e.C6602d;
import p076c.p112d.p148d.p278e.C6604e;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.z */
/* compiled from: Collections2 */
public final class C8292z {

    /* renamed from: a */
    static final C5822s f22160a = C5822s.m25525c(", ").mo23113a("null");

    /* renamed from: com.google.common.collect.z$a */
    /* compiled from: Collections2 */
    static class C8293a implements C7380p<Object, Object> {

        /* renamed from: a */
        final /* synthetic */ Collection f22161a;

        C8293a(Collection collection) {
            this.f22161a = collection;
        }

        public Object apply(Object obj) {
            return obj == this.f22161a ? "(this Collection)" : obj;
        }
    }

    /* renamed from: com.google.common.collect.z$b */
    /* compiled from: Collections2 */
    static class C8294b<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f22162a;

        /* renamed from: b */
        final C5831y<? super E> f22163b;

        C8294b(Collection<E> collection, C5831y<? super E> yVar) {
            this.f22162a = collection;
            this.f22163b = yVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8294b<E> mo31266a(C5831y<? super E> yVar) {
            return new C8294b<>(this.f22162a, C7398z.m35684a(this.f22163b, yVar));
        }

        public boolean add(E e) {
            C7397x.m35670a(this.f22163b.apply(e));
            return this.f22162a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                C7397x.m35670a(this.f22163b.apply(apply));
            }
            return this.f22162a.addAll(collection);
        }

        public void clear() {
            C8145s3.m39043g(this.f22162a, this.f22163b);
        }

        public boolean contains(@C5952h Object obj) {
            if (C8292z.m39592a(this.f22162a, obj)) {
                return this.f22163b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return C8292z.m39593a((Collection<?>) this, collection);
        }

        public boolean isEmpty() {
            return !C8145s3.m39024b((Iterable<T>) this.f22162a, this.f22163b);
        }

        public Iterator<E> iterator() {
            return C8178t3.m39119c(this.f22162a.iterator(), this.f22163b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f22162a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return C8145s3.m39043g(this.f22162a, C7398z.m35684a(this.f22163b, C7398z.m35689a(collection)));
        }

        public boolean retainAll(Collection<?> collection) {
            return C8145s3.m39043g(this.f22162a, C7398z.m35684a(this.f22163b, C7398z.m35682a(C7398z.m35689a(collection))));
        }

        public int size() {
            return C8178t3.m39138j(iterator());
        }

        public Object[] toArray() {
            return C8309z3.m39649a(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C8309z3.m39649a(iterator()).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.z$c */
    /* compiled from: Collections2 */
    private static final class C8295c<E> extends AbstractCollection<List<E>> {

        /* renamed from: N */
        final int f22164N;

        /* renamed from: a */
        final C8257x2<E> f22165a;

        /* renamed from: b */
        final Comparator<? super E> f22166b;

        C8295c(Iterable<E> iterable, Comparator<? super E> comparator) {
            this.f22165a = C8133r4.m38939b(comparator).mo30930a(iterable);
            this.f22166b = comparator;
            this.f22164N = m39601a(this.f22165a, comparator);
        }

        /* renamed from: a */
        private static <E> int m39601a(List<E> list, Comparator<? super E> comparator) {
            long j = 1;
            int i = 1;
            int i2 = 1;
            while (i < list.size()) {
                if (comparator.compare(list.get(i - 1), list.get(i)) < 0) {
                    j *= C6604e.m31392a(i, i2);
                    i2 = 0;
                    if (!C8292z.m39597b(j)) {
                        return Integer.MAX_VALUE;
                    }
                }
                i++;
                i2++;
            }
            long a = j * C6604e.m31392a(i, i2);
            if (!C8292z.m39597b(a)) {
                return Integer.MAX_VALUE;
            }
            return (int) a;
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return C8292z.m39599b((List<?>) this.f22165a, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<List<E>> iterator() {
            return new C8296d(this.f22165a, this.f22166b);
        }

        public int size() {
            return this.f22164N;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("orderedPermutationCollection(");
            sb.append(this.f22165a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.z$d */
    /* compiled from: Collections2 */
    private static final class C8296d<E> extends C7603c<List<E>> {

        /* renamed from: N */
        List<E> f22167N;

        /* renamed from: O */
        final Comparator<? super E> f22168O;

        C8296d(List<E> list, Comparator<? super E> comparator) {
            this.f22167N = C8309z3.m39665b((Iterable<? extends E>) list);
            this.f22168O = comparator;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo31285a(int i) {
            Object obj = this.f22167N.get(i);
            for (int size = this.f22167N.size() - 1; size > i; size--) {
                if (this.f22168O.compare(obj, this.f22167N.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31286d() {
            int g = mo31287g();
            if (g == -1) {
                this.f22167N = null;
                return;
            }
            Collections.swap(this.f22167N, g, mo31285a(g));
            Collections.reverse(this.f22167N.subList(g + 1, this.f22167N.size()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo31287g() {
            for (int size = this.f22167N.size() - 2; size >= 0; size--) {
                if (this.f22168O.compare(this.f22167N.get(size), this.f22167N.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<E> m39604b() {
            List<E> list = this.f22167N;
            if (list == null) {
                return (List) mo29793c();
            }
            C8257x2 a = C8257x2.m39405a((Collection<? extends E>) list);
            mo31286d();
            return a;
        }
    }

    /* renamed from: com.google.common.collect.z$e */
    /* compiled from: Collections2 */
    private static final class C8297e<E> extends AbstractCollection<List<E>> {

        /* renamed from: a */
        final C8257x2<E> f22169a;

        C8297e(C8257x2<E> x2Var) {
            this.f22169a = x2Var;
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return C8292z.m39599b((List<?>) this.f22169a, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<List<E>> iterator() {
            return new C8298f(this.f22169a);
        }

        public int size() {
            return C6602d.m31372a(this.f22169a.size());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("permutations(");
            sb.append(this.f22169a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.z$f */
    /* compiled from: Collections2 */
    private static class C8298f<E> extends C7603c<List<E>> {

        /* renamed from: N */
        final List<E> f22170N;

        /* renamed from: O */
        final int[] f22171O;

        /* renamed from: P */
        final int[] f22172P;

        /* renamed from: Q */
        int f22173Q = Integer.MAX_VALUE;

        C8298f(List<E> list) {
            this.f22170N = new ArrayList(list);
            int size = list.size();
            this.f22171O = new int[size];
            this.f22172P = new int[size];
            Arrays.fill(this.f22171O, 0);
            Arrays.fill(this.f22172P, 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31286d() {
            this.f22173Q = this.f22170N.size() - 1;
            if (this.f22173Q != -1) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f22171O;
                    int i2 = this.f22173Q;
                    int i3 = iArr[i2] + this.f22172P[i2];
                    if (i3 >= 0) {
                        if (i3 != i2 + 1) {
                            Collections.swap(this.f22170N, (i2 - iArr[i2]) + i, (i2 - i3) + i);
                            this.f22171O[this.f22173Q] = i3;
                            break;
                        } else if (i2 == 0) {
                            break;
                        } else {
                            i++;
                            mo31293g();
                        }
                    } else {
                        mo31293g();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo31293g() {
            int[] iArr = this.f22172P;
            int i = this.f22173Q;
            iArr[i] = -iArr[i];
            this.f22173Q = i - 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<E> m39608b() {
            if (this.f22173Q <= 0) {
                return (List) mo29793c();
            }
            C8257x2 a = C8257x2.m39405a((Collection<? extends E>) this.f22170N);
            mo31286d();
            return a;
        }
    }

    /* renamed from: com.google.common.collect.z$g */
    /* compiled from: Collections2 */
    static class C8299g<F, T> extends AbstractCollection<T> {

        /* renamed from: a */
        final Collection<F> f22174a;

        /* renamed from: b */
        final C7380p<? super F, ? extends T> f22175b;

        C8299g(Collection<F> collection, C7380p<? super F, ? extends T> pVar) {
            this.f22174a = (Collection) C7397x.m35664a(collection);
            this.f22175b = (C7380p) C7397x.m35664a(pVar);
        }

        public void clear() {
            this.f22174a.clear();
        }

        public boolean isEmpty() {
            return this.f22174a.isEmpty();
        }

        public Iterator<T> iterator() {
            return C8178t3.m39099a(this.f22174a.iterator(), this.f22175b);
        }

        public int size() {
            return this.f22174a.size();
        }
    }

    private C8292z() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m39597b(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    /* renamed from: b */
    static boolean m39598b(Collection<?> collection, @C5952h Object obj) {
        C7397x.m35664a(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <E> Collection<E> m39590a(Collection<E> collection, C5831y<? super E> yVar) {
        if (collection instanceof C8294b) {
            return ((C8294b) collection).mo31266a(yVar);
        }
        return new C8294b((Collection) C7397x.m35664a(collection), (C5831y) C7397x.m35664a(yVar));
    }

    /* renamed from: b */
    static String m39595b(Collection<?> collection) {
        StringBuilder a = m39585a(collection.size());
        a.append('[');
        f22160a.mo23123a(a, C8145s3.m39001a((Iterable<F>) collection, (C7380p<? super F, ? extends T>) new C8293a<Object,Object>(collection)));
        a.append(']');
        return a.toString();
    }

    /* renamed from: a */
    static boolean m39592a(Collection<?> collection, @C5952h Object obj) {
        C7397x.m35664a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @C2775a
    /* renamed from: b */
    public static <E extends Comparable<? super E>> Collection<List<E>> m39596b(Iterable<E> iterable) {
        return m39587a(iterable, (Comparator<? super E>) C8133r4.m38943j());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m39599b(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        return C8083o2.m38712a(list).equals(C8083o2.m38712a(list2));
    }

    /* renamed from: a */
    public static <F, T> Collection<T> m39589a(Collection<F> collection, C7380p<? super F, T> pVar) {
        return new C8299g(collection, pVar);
    }

    /* renamed from: a */
    static boolean m39593a(Collection<?> collection, Collection<?> collection2) {
        return C8145s3.m39015a((Iterable<T>) collection2, C7398z.m35689a(collection));
    }

    /* renamed from: a */
    static StringBuilder m39585a(int i) {
        C8277y.m39484a(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: a */
    static <T> Collection<T> m39586a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    @C2775a
    /* renamed from: a */
    public static <E> Collection<List<E>> m39587a(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new C8295c(iterable, comparator);
    }

    @C2775a
    /* renamed from: a */
    public static <E> Collection<List<E>> m39588a(Collection<E> collection) {
        return new C8297e(C8257x2.m39405a(collection));
    }
}
