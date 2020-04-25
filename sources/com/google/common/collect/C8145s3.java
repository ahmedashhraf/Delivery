package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.base.C7392u;
import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.s3 */
/* compiled from: Iterables */
public final class C8145s3 {

    /* renamed from: com.google.common.collect.s3$a */
    /* compiled from: Iterables */
    static class C8146a extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ int f21953N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21954b;

        /* renamed from: com.google.common.collect.s3$a$a */
        /* compiled from: Iterables */
        class C8147a implements Iterator<T> {

            /* renamed from: a */
            boolean f21956a = true;

            /* renamed from: b */
            final /* synthetic */ Iterator f21957b;

            C8147a(Iterator it) {
                this.f21957b = it;
            }

            public boolean hasNext() {
                return this.f21957b.hasNext();
            }

            public T next() {
                T next = this.f21957b.next();
                this.f21956a = false;
                return next;
            }

            public void remove() {
                C8277y.m39486a(!this.f21956a);
                this.f21957b.remove();
            }
        }

        C8146a(Iterable iterable, int i) {
            this.f21954b = iterable;
            this.f21953N = i;
        }

        public Iterator<T> iterator() {
            Iterator it = this.f21954b.iterator();
            C8178t3.m39085a(it, this.f21953N);
            return new C8147a(it);
        }
    }

    /* renamed from: com.google.common.collect.s3$b */
    /* compiled from: Iterables */
    static class C8148b extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ int f21958N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21959b;

        C8148b(Iterable iterable, int i) {
            this.f21959b = iterable;
            this.f21958N = i;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39122c(this.f21959b.iterator(), this.f21958N);
        }
    }

    /* renamed from: com.google.common.collect.s3$c */
    /* compiled from: Iterables */
    static class C8149c extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Iterable f21960b;

        C8149c(Iterable iterable) {
            this.f21960b = iterable;
        }

        public Iterator<T> iterator() {
            return new C8162p((Queue) this.f21960b, null);
        }

        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.s3$d */
    /* compiled from: Iterables */
    static class C8150d extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Iterable f21961b;

        C8150d(Iterable iterable) {
            this.f21961b = iterable;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39131e(this.f21961b.iterator());
        }

        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.s3$e */
    /* compiled from: Iterables */
    static class C8151e extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ Comparator f21962N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21963b;

        C8151e(Iterable iterable, Comparator comparator) {
            this.f21963b = iterable;
            this.f21962N = comparator;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39088a(C8145s3.m39001a(this.f21963b, C8145s3.m39021b()), this.f21962N);
        }
    }

    /* renamed from: com.google.common.collect.s3$f */
    /* compiled from: Iterables */
    static class C8152f implements C7380p<Iterable<? extends T>, Iterator<? extends T>> {
        C8152f() {
        }

        /* renamed from: b */
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* renamed from: com.google.common.collect.s3$g */
    /* compiled from: Iterables */
    static class C8153g extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Iterable f21964b;

        C8153g(Iterable iterable) {
            this.f21964b = iterable;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39098a(this.f21964b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21964b.toString());
            sb.append(" (cycled)");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.s3$h */
    /* compiled from: Iterables */
    static class C8154h extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Iterable f21965b;

        C8154h(Iterable iterable) {
            this.f21965b = iterable;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39127d(C8145s3.m39045h(this.f21965b));
        }
    }

    /* renamed from: com.google.common.collect.s3$i */
    /* compiled from: Iterables */
    static class C8155i extends C7847f6<Iterable<? extends T>, Iterator<? extends T>> {
        C8155i(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Iterator<? extends T> mo30361a(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* renamed from: com.google.common.collect.s3$j */
    /* compiled from: Iterables */
    static class C8156j extends C5838k1<List<T>> {

        /* renamed from: N */
        final /* synthetic */ int f21966N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21967b;

        C8156j(Iterable iterable, int i) {
            this.f21967b = iterable;
            this.f21966N = i;
        }

        public Iterator<List<T>> iterator() {
            return C8178t3.m39129e(this.f21967b.iterator(), this.f21966N);
        }
    }

    /* renamed from: com.google.common.collect.s3$k */
    /* compiled from: Iterables */
    static class C8157k extends C5838k1<List<T>> {

        /* renamed from: N */
        final /* synthetic */ int f21968N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21969b;

        C8157k(Iterable iterable, int i) {
            this.f21969b = iterable;
            this.f21968N = i;
        }

        public Iterator<List<T>> iterator() {
            return C8178t3.m39124d(this.f21969b.iterator(), this.f21968N);
        }
    }

    /* renamed from: com.google.common.collect.s3$l */
    /* compiled from: Iterables */
    static class C8158l extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ C5831y f21970N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21971b;

        C8158l(Iterable iterable, C5831y yVar) {
            this.f21971b = iterable;
            this.f21970N = yVar;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39119c(this.f21971b.iterator(), this.f21970N);
        }
    }

    /* renamed from: com.google.common.collect.s3$m */
    /* compiled from: Iterables */
    static class C8159m extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ Class f21972N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21973b;

        C8159m(Iterable iterable, Class cls) {
            this.f21973b = iterable;
            this.f21972N = cls;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39092a(this.f21973b.iterator(), this.f21972N);
        }
    }

    /* renamed from: com.google.common.collect.s3$n */
    /* compiled from: Iterables */
    static class C8160n extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ C7380p f21974N;

        /* renamed from: b */
        final /* synthetic */ Iterable f21975b;

        C8160n(Iterable iterable, C7380p pVar) {
            this.f21975b = iterable;
            this.f21974N = pVar;
        }

        public Iterator<T> iterator() {
            return C8178t3.m39099a(this.f21975b.iterator(), this.f21974N);
        }
    }

    /* renamed from: com.google.common.collect.s3$o */
    /* compiled from: Iterables */
    static class C8161o extends C5838k1<T> {

        /* renamed from: N */
        final /* synthetic */ int f21976N;

        /* renamed from: b */
        final /* synthetic */ List f21977b;

        C8161o(List list, int i) {
            this.f21977b = list;
            this.f21976N = i;
        }

        public Iterator<T> iterator() {
            int min = Math.min(this.f21977b.size(), this.f21976N);
            List list = this.f21977b;
            return list.subList(min, list.size()).iterator();
        }
    }

    /* renamed from: com.google.common.collect.s3$p */
    /* compiled from: Iterables */
    private static class C8162p<T> extends C7603c<T> {

        /* renamed from: N */
        private final Queue<T> f21978N;

        /* synthetic */ C8162p(Queue queue, C8153g gVar) {
            this(queue);
        }

        /* renamed from: b */
        public T mo29748b() {
            try {
                return this.f21978N.remove();
            } catch (NoSuchElementException unused) {
                return mo29793c();
            }
        }

        private C8162p(Queue<T> queue) {
            this.f21978N = queue;
        }
    }

    /* renamed from: com.google.common.collect.s3$q */
    /* compiled from: Iterables */
    private static final class C8163q<T> extends C5838k1<T> {

        /* renamed from: b */
        private final Iterable<T> f21979b;

        /* synthetic */ C8163q(Iterable iterable, C8153g gVar) {
            this(iterable);
        }

        public Iterator<T> iterator() {
            return C8178t3.m39140l(this.f21979b.iterator());
        }

        public String toString() {
            return this.f21979b.toString();
        }

        private C8163q(Iterable<T> iterable) {
            this.f21979b = iterable;
        }
    }

    private C8145s3() {
    }

    /* renamed from: b */
    public static boolean m39026b(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) C7397x.m35664a(collection)) : C8178t3.m39116b(iterable.iterator(), collection);
    }

    /* renamed from: c */
    public static <T> Iterable<List<T>> m39029c(Iterable<T> iterable, int i) {
        C7397x.m35664a(iterable);
        C7397x.m35670a(i > 0);
        return new C8157k(iterable, i);
    }

    /* renamed from: d */
    public static <T> Iterable<T> m39032d(Iterable<T> iterable) {
        C7397x.m35664a(iterable);
        return new C8153g(iterable);
    }

    @C5952h
    /* renamed from: e */
    public static <T> T m39039e(Iterable<? extends T> iterable, @C5952h T t) {
        return C8178t3.m39130e(iterable.iterator(), t);
    }

    @C5952h
    /* renamed from: f */
    static <T> T m39041f(Iterable<T> iterable, C5831y<? super T> yVar) {
        C7397x.m35664a(yVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (yVar.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static <T> boolean m39043g(Iterable<T> iterable, C5831y<? super T> yVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C8178t3.m39133f(iterable.iterator(), yVar);
        }
        return m39019a((List) iterable, (C5831y) C7397x.m35664a(yVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static <T> Iterator<Iterator<? extends T>> m39045h(Iterable<? extends Iterable<? extends T>> iterable) {
        return new C8155i(iterable.iterator());
    }

    /* renamed from: i */
    public static int m39046i(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : C8178t3.m39138j(iterable.iterator());
    }

    /* renamed from: j */
    static Object[] m39047j(Iterable<?> iterable) {
        return m39048k(iterable).toArray();
    }

    /* renamed from: k */
    private static <E> Collection<E> m39048k(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C8309z3.m39649a(iterable.iterator());
    }

    /* renamed from: l */
    public static String m39049l(Iterable<?> iterable) {
        return C8178t3.m39139k(iterable.iterator());
    }

    /* renamed from: m */
    public static <T> Iterable<T> m39050m(Iterable<T> iterable) {
        C7397x.m35664a(iterable);
        return ((iterable instanceof C8163q) || (iterable instanceof C8175t2)) ? iterable : new C8163q(iterable, null);
    }

    /* renamed from: b */
    public static boolean m39025b(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection)) {
            if (((Collection) iterable).size() != ((Collection) iterable2).size()) {
                return false;
            }
        }
        return C8178t3.m39117b(iterable.iterator(), iterable2.iterator());
    }

    /* renamed from: e */
    public static <T> int m39036e(Iterable<T> iterable, C5831y<? super T> yVar) {
        return C8178t3.m39128e(iterable.iterator(), yVar);
    }

    /* renamed from: h */
    public static <T> C7392u<T> m39044h(Iterable<T> iterable, C5831y<? super T> yVar) {
        return C8178t3.m39134g(iterable.iterator(), yVar);
    }

    @Deprecated
    /* renamed from: a */
    public static <E> Iterable<E> m39000a(C8175t2<E> t2Var) {
        return (Iterable) C7397x.m35664a(t2Var);
    }

    /* renamed from: d */
    public static <T> Iterable<List<T>> m39033d(Iterable<T> iterable, int i) {
        C7397x.m35664a(iterable);
        C7397x.m35670a(i > 0);
        return new C8156j(iterable, i);
    }

    /* renamed from: e */
    public static <T> T m39038e(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C8178t3.m39132f(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m39012a(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public static boolean m39016a(Iterable<?> iterable, @C5952h Object obj) {
        if (iterable instanceof Collection) {
            return C8292z.m39592a((Collection) iterable, obj);
        }
        return C8178t3.m39108a(iterable.iterator(), obj);
    }

    /* renamed from: c */
    public static <T> Iterable<T> m39030c(Iterable<T> iterable, C5831y<? super T> yVar) {
        C7397x.m35664a(iterable);
        C7397x.m35664a(yVar);
        return new C8158l(iterable, yVar);
    }

    /* renamed from: g */
    public static boolean m39042g(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* renamed from: d */
    public static <T> T m39034d(Iterable<T> iterable, C5831y<? super T> yVar) {
        return C8178t3.m39125d(iterable.iterator(), yVar);
    }

    @C2777c("Array.newInstance(Class, int)")
    /* renamed from: b */
    public static <T> T[] m39027b(Iterable<? extends T> iterable, Class<T> cls) {
        Collection k = m39048k(iterable);
        return k.toArray(C8109q4.m38827a(cls, k.size()));
    }

    @C5952h
    /* renamed from: c */
    public static <T> T m39031c(Iterable<? extends T> iterable, @C5952h T t) {
        return C8178t3.m39126d(iterable.iterator(), t);
    }

    @C5952h
    /* renamed from: d */
    public static <T> T m39035d(Iterable<? extends T> iterable, @C5952h T t) {
        if (iterable instanceof Collection) {
            if (C8292z.m39586a(iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return m39012a(C8309z3.m39652a(iterable));
            }
        }
        return C8178t3.m39120c(iterable.iterator(), t);
    }

    /* renamed from: f */
    public static <T> T m39040f(Iterable<T> iterable) {
        return C8178t3.m39135g(iterable.iterator());
    }

    /* renamed from: a */
    public static boolean m39017a(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) C7397x.m35664a(collection)) : C8178t3.m39109a(iterable.iterator(), collection);
    }

    /* renamed from: c */
    public static <T> Iterable<T> m39028c(Iterable<T> iterable) {
        if (iterable instanceof Queue) {
            return new C8149c(iterable);
        }
        C7397x.m35664a(iterable);
        return new C8150d(iterable);
    }

    /* renamed from: a */
    private static <T> boolean m39019a(List<T> list, C5831y<? super T> yVar) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!yVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        m39014a(list, yVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public static <T> Iterable<T> m39037e(Iterable<T> iterable, int i) {
        C7397x.m35664a(iterable);
        C7397x.m35671a(i >= 0, (Object) "number to skip cannot be negative");
        if (iterable instanceof List) {
            return new C8161o((List) iterable, i);
        }
        return new C8146a(iterable, i);
    }

    /* renamed from: b */
    public static int m39020b(Iterable<?> iterable, @C5952h Object obj) {
        if (iterable instanceof C7982k4) {
            return ((C7982k4) iterable).mo29708b(obj);
        }
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(obj) ? 1 : 0;
        }
        return C8178t3.m39110b(iterable.iterator(), obj);
    }

    /* renamed from: a */
    private static <T> void m39014a(List<T> list, C5831y<? super T> yVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (yVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: b */
    public static <T> Iterable<T> m39022b(Iterable<? extends Iterable<? extends T>> iterable) {
        C7397x.m35664a(iterable);
        return new C8154h(iterable);
    }

    /* renamed from: b */
    public static <T> boolean m39024b(Iterable<T> iterable, C5831y<? super T> yVar) {
        return C8178t3.m39115b(iterable.iterator(), yVar);
    }

    /* renamed from: b */
    public static <T> Iterable<T> m39023b(Iterable<T> iterable, int i) {
        C7397x.m35664a(iterable);
        C7397x.m35671a(i >= 0, (Object) "limit is negative");
        return new C8148b(iterable, i);
    }

    /* renamed from: a */
    public static <T> boolean m39018a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(C8292z.m39586a(iterable));
        }
        return C8178t3.m39106a(collection, ((Iterable) C7397x.m35664a(iterable)).iterator());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> C7380p<Iterable<? extends T>, Iterator<? extends T>> m39021b() {
        return new C8152f();
    }

    /* renamed from: a */
    public static <T> Iterable<T> m39008a(T... tArr) {
        return m39032d(C8309z3.m39650a((E[]) tArr));
    }

    /* renamed from: a */
    public static <T> Iterable<T> m39003a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m39022b(C8257x2.m39394a(iterable, iterable2));
    }

    /* renamed from: a */
    public static <T> Iterable<T> m39004a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return m39022b(C8257x2.m39395a(iterable, iterable2, iterable3));
    }

    /* renamed from: a */
    public static <T> Iterable<T> m39005a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return m39022b(C8257x2.m39396a(iterable, iterable2, iterable3, iterable4));
    }

    /* renamed from: a */
    public static <T> Iterable<T> m39007a(Iterable<? extends T>... iterableArr) {
        return m39022b(C8257x2.m39410c(iterableArr));
    }

    @C2777c("Class.isInstance")
    /* renamed from: a */
    public static <T> Iterable<T> m39002a(Iterable<?> iterable, Class<T> cls) {
        C7397x.m35664a(iterable);
        C7397x.m35664a(cls);
        return new C8159m(iterable, cls);
    }

    /* renamed from: a */
    public static <T> boolean m39015a(Iterable<T> iterable, C5831y<? super T> yVar) {
        return C8178t3.m39107a(iterable.iterator(), yVar);
    }

    @C5952h
    /* renamed from: a */
    public static <T> T m39011a(Iterable<? extends T> iterable, C5831y<? super T> yVar, @C5952h T t) {
        return C8178t3.m39096a(iterable.iterator(), yVar, t);
    }

    /* renamed from: a */
    public static <F, T> Iterable<T> m39001a(Iterable<F> iterable, C7380p<? super F, ? extends T> pVar) {
        C7397x.m35664a(iterable);
        C7397x.m35664a(pVar);
        return new C8160n(iterable, pVar);
    }

    /* renamed from: a */
    public static <T> T m39009a(Iterable<T> iterable, int i) {
        C7397x.m35664a(iterable);
        return iterable instanceof List ? ((List) iterable).get(i) : C8178t3.m39113b(iterable.iterator(), i);
    }

    @C5952h
    /* renamed from: a */
    public static <T> T m39010a(Iterable<? extends T> iterable, int i, @C5952h T t) {
        C7397x.m35664a(iterable);
        C8178t3.m39105a(i);
        if (iterable instanceof List) {
            List a = C8309z3.m39652a(iterable);
            if (i < a.size()) {
                t = a.get(i);
            }
            return t;
        }
        Iterator it = iterable.iterator();
        C8178t3.m39085a(it, i);
        return C8178t3.m39126d(it, t);
    }

    /* renamed from: a */
    private static <T> T m39012a(List<T> list) {
        return list.get(list.size() - 1);
    }

    @C2775a
    /* renamed from: a */
    public static <T> Iterable<T> m39006a(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        C7397x.m35665a(iterable, (Object) "iterables");
        C7397x.m35665a(comparator, (Object) "comparator");
        return new C8163q(new C8151e(iterable, comparator), null);
    }
}
