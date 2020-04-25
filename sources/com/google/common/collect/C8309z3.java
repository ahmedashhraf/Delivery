package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p278e.C6602d;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.z3 */
/* compiled from: Lists */
public final class C8309z3 {

    /* renamed from: com.google.common.collect.z3$a */
    /* compiled from: Lists */
    static class C8310a extends C8316g<E> {

        /* renamed from: b */
        private static final long f22192b = 0;

        C8310a(List list) {
            super(list);
        }

        public ListIterator<E> listIterator(int i) {
            return this.f22194a.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.z3$b */
    /* compiled from: Lists */
    static class C8311b extends C8312c<E> {

        /* renamed from: b */
        private static final long f22193b = 0;

        C8311b(List list) {
            super(list);
        }

        public ListIterator<E> listIterator(int i) {
            return this.f22194a.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.z3$c */
    /* compiled from: Lists */
    private static class C8312c<E> extends AbstractList<E> {

        /* renamed from: a */
        final List<E> f22194a;

        C8312c(List<E> list) {
            this.f22194a = (List) C7397x.m35664a(list);
        }

        public void add(int i, E e) {
            this.f22194a.add(i, e);
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.f22194a.addAll(i, collection);
        }

        public boolean contains(Object obj) {
            return this.f22194a.contains(obj);
        }

        public E get(int i) {
            return this.f22194a.get(i);
        }

        public E remove(int i) {
            return this.f22194a.remove(i);
        }

        public E set(int i, E e) {
            return this.f22194a.set(i, e);
        }

        public int size() {
            return this.f22194a.size();
        }
    }

    /* renamed from: com.google.common.collect.z3$d */
    /* compiled from: Lists */
    private static final class C8313d extends AbstractList<Character> {

        /* renamed from: a */
        private final CharSequence f22195a;

        C8313d(CharSequence charSequence) {
            this.f22195a = charSequence;
        }

        public int size() {
            return this.f22195a.length();
        }

        public Character get(int i) {
            C7397x.m35663a(i, size());
            return Character.valueOf(this.f22195a.charAt(i));
        }
    }

    /* renamed from: com.google.common.collect.z3$e */
    /* compiled from: Lists */
    private static class C8314e<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final E f22196a;

        /* renamed from: b */
        final E[] f22197b;

        C8314e(@C5952h E e, E[] eArr) {
            this.f22196a = e;
            this.f22197b = (Object[]) C7397x.m35664a(eArr);
        }

        public E get(int i) {
            C7397x.m35663a(i, size());
            return i == 0 ? this.f22196a : this.f22197b[i - 1];
        }

        public int size() {
            return this.f22197b.length + 1;
        }
    }

    /* renamed from: com.google.common.collect.z3$f */
    /* compiled from: Lists */
    private static class C8315f<T> extends AbstractList<List<T>> {

        /* renamed from: a */
        final List<T> f22198a;

        /* renamed from: b */
        final int f22199b;

        C8315f(List<T> list, int i) {
            this.f22198a = list;
            this.f22199b = i;
        }

        public boolean isEmpty() {
            return this.f22198a.isEmpty();
        }

        public int size() {
            return C6602d.m31374a(this.f22198a.size(), this.f22199b, RoundingMode.CEILING);
        }

        public List<T> get(int i) {
            C7397x.m35663a(i, size());
            int i2 = this.f22199b;
            int i3 = i * i2;
            return this.f22198a.subList(i3, Math.min(i2 + i3, this.f22198a.size()));
        }
    }

    /* renamed from: com.google.common.collect.z3$g */
    /* compiled from: Lists */
    private static class C8316g<E> extends C8312c<E> implements RandomAccess {
        C8316g(List<E> list) {
            super(list);
        }
    }

    /* renamed from: com.google.common.collect.z3$h */
    /* compiled from: Lists */
    private static class C8317h<T> extends C8315f<T> implements RandomAccess {
        C8317h(List<T> list, int i) {
            super(list, i);
        }
    }

    /* renamed from: com.google.common.collect.z3$i */
    /* compiled from: Lists */
    private static class C8318i<T> extends C8319j<T> implements RandomAccess {
        C8318i(List<T> list) {
            super(list);
        }
    }

    /* renamed from: com.google.common.collect.z3$j */
    /* compiled from: Lists */
    private static class C8319j<T> extends AbstractList<T> {

        /* renamed from: a */
        private final List<T> f22200a;

        /* renamed from: com.google.common.collect.z3$j$a */
        /* compiled from: Lists */
        class C8320a implements ListIterator<T> {

            /* renamed from: a */
            boolean f22202a;

            /* renamed from: b */
            final /* synthetic */ ListIterator f22203b;

            C8320a(ListIterator listIterator) {
                this.f22203b = listIterator;
            }

            public void add(T t) {
                this.f22203b.add(t);
                this.f22203b.previous();
                this.f22202a = false;
            }

            public boolean hasNext() {
                return this.f22203b.hasPrevious();
            }

            public boolean hasPrevious() {
                return this.f22203b.hasNext();
            }

            public T next() {
                if (hasNext()) {
                    this.f22202a = true;
                    return this.f22203b.previous();
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return C8319j.this.m39676c(this.f22203b.nextIndex());
            }

            public T previous() {
                if (hasPrevious()) {
                    this.f22202a = true;
                    return this.f22203b.next();
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return nextIndex() - 1;
            }

            public void remove() {
                C8277y.m39486a(this.f22202a);
                this.f22203b.remove();
                this.f22202a = false;
            }

            public void set(T t) {
                C7397x.m35676b(this.f22202a);
                this.f22203b.set(t);
            }
        }

        C8319j(List<T> list) {
            this.f22200a = (List) C7397x.m35664a(list);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public int m39676c(int i) {
            int size = size();
            C7397x.m35673b(i, size);
            return size - i;
        }

        public void add(int i, @C5952h T t) {
            this.f22200a.add(m39676c(i), t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public List<T> mo31325b() {
            return this.f22200a;
        }

        public void clear() {
            this.f22200a.clear();
        }

        public T get(int i) {
            return this.f22200a.get(m39675b(i));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new C8320a(this.f22200a.listIterator(m39676c(i)));
        }

        public T remove(int i) {
            return this.f22200a.remove(m39675b(i));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        public T set(int i, @C5952h T t) {
            return this.f22200a.set(m39675b(i), t);
        }

        public int size() {
            return this.f22200a.size();
        }

        public List<T> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            return C8309z3.m39671c(this.f22200a.subList(m39676c(i2), m39676c(i)));
        }

        /* renamed from: b */
        private int m39675b(int i) {
            int size = size();
            C7397x.m35663a(i, size);
            return (size - 1) - i;
        }
    }

    /* renamed from: com.google.common.collect.z3$k */
    /* compiled from: Lists */
    private static final class C8321k extends C8257x2<Character> {

        /* renamed from: N */
        private final String f22204N;

        C8321k(String str) {
            this.f22204N = str;
        }

        public int indexOf(@C5952h Object obj) {
            if (obj instanceof Character) {
                return this.f22204N.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return false;
        }

        public int lastIndexOf(@C5952h Object obj) {
            if (obj instanceof Character) {
                return this.f22204N.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public int size() {
            return this.f22204N.length();
        }

        public Character get(int i) {
            C7397x.m35663a(i, size());
            return Character.valueOf(this.f22204N.charAt(i));
        }

        public C8257x2<Character> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            return C8309z3.m39647a(this.f22204N.substring(i, i2));
        }
    }

    /* renamed from: com.google.common.collect.z3$l */
    /* compiled from: Lists */
    private static class C8322l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f22205a;

        /* renamed from: b */
        final C7380p<? super F, ? extends T> f22206b;

        /* renamed from: com.google.common.collect.z3$l$a */
        /* compiled from: Lists */
        class C8323a extends C7873g6<F, T> {
            C8323a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public T mo30361a(F f) {
                return C8322l.this.f22206b.apply(f);
            }
        }

        C8322l(List<F> list, C7380p<? super F, ? extends T> pVar) {
            this.f22205a = (List) C7397x.m35664a(list);
            this.f22206b = (C7380p) C7397x.m35664a(pVar);
        }

        public void clear() {
            this.f22205a.clear();
        }

        public T get(int i) {
            return this.f22206b.apply(this.f22205a.get(i));
        }

        public boolean isEmpty() {
            return this.f22205a.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new C8323a(this.f22205a.listIterator(i));
        }

        public T remove(int i) {
            return this.f22206b.apply(this.f22205a.remove(i));
        }

        public int size() {
            return this.f22205a.size();
        }
    }

    /* renamed from: com.google.common.collect.z3$m */
    /* compiled from: Lists */
    private static class C8324m<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f22208a;

        /* renamed from: b */
        final C7380p<? super F, ? extends T> f22209b;

        /* renamed from: com.google.common.collect.z3$m$a */
        /* compiled from: Lists */
        class C8325a extends C7873g6<F, T> {
            C8325a(ListIterator listIterator) {
                super(listIterator);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public T mo30361a(F f) {
                return C8324m.this.f22209b.apply(f);
            }
        }

        C8324m(List<F> list, C7380p<? super F, ? extends T> pVar) {
            this.f22208a = (List) C7397x.m35664a(list);
            this.f22209b = (C7380p) C7397x.m35664a(pVar);
        }

        public void clear() {
            this.f22208a.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new C8325a(this.f22208a.listIterator(i));
        }

        public int size() {
            return this.f22208a.size();
        }
    }

    /* renamed from: com.google.common.collect.z3$n */
    /* compiled from: Lists */
    private static class C8326n<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final E[] f22211N;

        /* renamed from: a */
        final E f22212a;

        /* renamed from: b */
        final E f22213b;

        C8326n(@C5952h E e, @C5952h E e2, E[] eArr) {
            this.f22212a = e;
            this.f22213b = e2;
            this.f22211N = (Object[]) C7397x.m35664a(eArr);
        }

        public E get(int i) {
            if (i == 0) {
                return this.f22212a;
            }
            if (i == 1) {
                return this.f22213b;
            }
            C7397x.m35663a(i, size());
            return this.f22211N[i - 2];
        }

        public int size() {
            return this.f22211N.length + 2;
        }
    }

    private C8309z3() {
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <E> ArrayList<E> m39648a() {
        return new ArrayList<>();
    }

    @C2776b(serializable = true)
    /* renamed from: b */
    public static <E> ArrayList<E> m39665b(Iterable<? extends E> iterable) {
        C7397x.m35664a(iterable);
        return iterable instanceof Collection ? new ArrayList<>(C8292z.m39586a(iterable)) : m39649a(iterable.iterator());
    }

    @C2776b(serializable = true)
    /* renamed from: c */
    public static <E> ArrayList<E> m39669c(int i) {
        return new ArrayList<>(m39646a(i));
    }

    @C2776b(serializable = true)
    /* renamed from: d */
    public static <E> LinkedList<E> m39673d(Iterable<? extends E> iterable) {
        LinkedList<E> c = m39670c();
        C8145s3.m39018a((Collection<T>) c, iterable);
        return c;
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <E> ArrayList<E> m39650a(E... eArr) {
        C7397x.m35664a(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m39646a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @C2776b(serializable = true)
    /* renamed from: c */
    public static <E> LinkedList<E> m39670c() {
        return new LinkedList<>();
    }

    @C2776b(serializable = true)
    /* renamed from: b */
    public static <E> ArrayList<E> m39664b(int i) {
        C8277y.m39484a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    @C2777c("CopyOnWriteArrayList")
    /* renamed from: c */
    public static <E> CopyOnWriteArrayList<E> m39672c(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? C8292z.m39586a(iterable) : m39665b(iterable));
    }

    @C2777c("CopyOnWriteArrayList")
    /* renamed from: b */
    public static <E> CopyOnWriteArrayList<E> m39667b() {
        return new CopyOnWriteArrayList<>();
    }

    /* renamed from: c */
    public static <T> List<T> m39671c(List<T> list) {
        if (list instanceof C8257x2) {
            return ((C8257x2) list).mo30925k();
        }
        if (list instanceof C8319j) {
            return ((C8319j) list).mo31325b();
        }
        if (list instanceof RandomAccess) {
            return new C8318i(list);
        }
        return new C8319j(list);
    }

    @C2778d
    /* renamed from: a */
    static int m39646a(int i) {
        C8277y.m39484a(i, "arraySize");
        return C6637f.m31672b(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: b */
    public static <T> List<List<T>> m39666b(List<T> list, int i) {
        C7397x.m35664a(list);
        C7397x.m35670a(i > 0);
        return list instanceof RandomAccess ? new C8317h(list, i) : new C8315f(list, i);
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <E> ArrayList<E> m39649a(Iterator<? extends E> it) {
        ArrayList<E> a = m39648a();
        C8178t3.m39106a((Collection<T>) a, it);
        return a;
    }

    /* renamed from: b */
    static int m39662b(List<?> list) {
        int i;
        int i2 = 1;
        for (Object next : list) {
            int i3 = i2 * 31;
            if (next == null) {
                i = 0;
            } else {
                i = next.hashCode();
            }
            i2 = ((i3 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    /* renamed from: a */
    public static <E> List<E> m39654a(@C5952h E e, E[] eArr) {
        return new C8314e(e, eArr);
    }

    /* renamed from: a */
    public static <E> List<E> m39653a(@C5952h E e, @C5952h E e2, E[] eArr) {
        return new C8326n(e, e2, eArr);
    }

    /* renamed from: b */
    static int m39663b(List<?> list, @C5952h Object obj) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C5827t.m25562a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: a */
    static <B> List<List<B>> m39655a(List<? extends List<? extends B>> list) {
        return C8241w.m39326a(list);
    }

    /* renamed from: c */
    static int m39668c(List<?> list, @C5952h Object obj) {
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C5827t.m25562a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: a */
    static <B> List<List<B>> m39658a(List<? extends B>... listArr) {
        return m39655a(Arrays.asList(listArr));
    }

    /* renamed from: a */
    public static <F, T> List<T> m39657a(List<F> list, C7380p<? super F, ? extends T> pVar) {
        return list instanceof RandomAccess ? new C8322l(list, pVar) : new C8324m(list, pVar);
    }

    @C2775a
    /* renamed from: a */
    public static C8257x2<Character> m39647a(String str) {
        return new C8321k((String) C7397x.m35664a(str));
    }

    @C2775a
    /* renamed from: a */
    public static List<Character> m39651a(CharSequence charSequence) {
        return new C8313d((CharSequence) C7397x.m35664a(charSequence));
    }

    /* renamed from: a */
    static boolean m39661a(List<?> list, @C5952h Object obj) {
        boolean z = true;
        if (obj == C7397x.m35664a(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        if (list.size() != list2.size() || !C8178t3.m39117b(list.iterator(), list2.iterator())) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    static <E> boolean m39660a(List<E> list, int i, Iterable<? extends E> iterable) {
        ListIterator listIterator = list.listIterator(i);
        boolean z = false;
        for (Object add : iterable) {
            listIterator.add(add);
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    static <E> ListIterator<E> m39659a(List<E> list, int i) {
        return new C8312c(list).listIterator(i);
    }

    /* renamed from: a */
    static <E> List<E> m39656a(List<E> list, int i, int i2) {
        List list2;
        if (list instanceof RandomAccess) {
            list2 = new C8310a(list);
        } else {
            list2 = new C8311b(list);
        }
        return list2.subList(i, i2);
    }

    /* renamed from: a */
    static <T> List<T> m39652a(Iterable<T> iterable) {
        return (List) iterable;
    }
}
