package com.google.common.collect;

import com.google.common.base.C5822s;
import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.base.C7392u;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.t3 */
/* compiled from: Iterators */
public final class C8178t3 {

    /* renamed from: a */
    static final C8062m6<Object> f22000a = new C8184f();

    /* renamed from: b */
    private static final Iterator<Object> f22001b = new C8185g();

    /* renamed from: com.google.common.collect.t3$a */
    /* compiled from: Iterators */
    static class C8179a extends C8023l6<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f22002a;

        C8179a(Iterator it) {
            this.f22002a = it;
        }

        public boolean hasNext() {
            return this.f22002a.hasNext();
        }

        public T next() {
            T next = this.f22002a.next();
            this.f22002a.remove();
            return next;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* renamed from: com.google.common.collect.t3$b */
    /* compiled from: Iterators */
    static class C8180b extends C7550b<T> {

        /* renamed from: N */
        final /* synthetic */ Object[] f22003N;

        /* renamed from: O */
        final /* synthetic */ int f22004O;

        C8180b(int i, int i2, Object[] objArr, int i3) {
            this.f22003N = objArr;
            this.f22004O = i3;
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo29660a(int i) {
            return this.f22003N[this.f22004O + i];
        }
    }

    /* renamed from: com.google.common.collect.t3$c */
    /* compiled from: Iterators */
    static class C8181c extends C8023l6<T> {

        /* renamed from: a */
        boolean f22005a;

        /* renamed from: b */
        final /* synthetic */ Object f22006b;

        C8181c(Object obj) {
            this.f22006b = obj;
        }

        public boolean hasNext() {
            return !this.f22005a;
        }

        public T next() {
            if (!this.f22005a) {
                this.f22005a = true;
                return this.f22006b;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.t3$d */
    /* compiled from: Iterators */
    static class C8182d extends C8023l6<T> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f22007a;

        C8182d(Enumeration enumeration) {
            this.f22007a = enumeration;
        }

        public boolean hasNext() {
            return this.f22007a.hasMoreElements();
        }

        public T next() {
            return this.f22007a.nextElement();
        }
    }

    /* renamed from: com.google.common.collect.t3$e */
    /* compiled from: Iterators */
    static class C8183e implements Enumeration<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f22008a;

        C8183e(Iterator it) {
            this.f22008a = it;
        }

        public boolean hasMoreElements() {
            return this.f22008a.hasNext();
        }

        public T nextElement() {
            return this.f22008a.next();
        }
    }

    /* renamed from: com.google.common.collect.t3$f */
    /* compiled from: Iterators */
    static class C8184f extends C8062m6<Object> {
        C8184f() {
        }

        public boolean hasNext() {
            return false;
        }

        public boolean hasPrevious() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return 0;
        }

        public Object previous() {
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return -1;
        }
    }

    /* renamed from: com.google.common.collect.t3$g */
    /* compiled from: Iterators */
    static class C8185g implements Iterator<Object> {
        C8185g() {
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C8277y.m39486a(false);
        }
    }

    /* renamed from: com.google.common.collect.t3$h */
    /* compiled from: Iterators */
    static class C8186h extends C8023l6<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f22009a;

        C8186h(Iterator it) {
            this.f22009a = it;
        }

        public boolean hasNext() {
            return this.f22009a.hasNext();
        }

        public T next() {
            return this.f22009a.next();
        }
    }

    /* renamed from: com.google.common.collect.t3$i */
    /* compiled from: Iterators */
    static class C8187i implements Iterator<T> {

        /* renamed from: N */
        final /* synthetic */ Iterable f22010N;

        /* renamed from: a */
        Iterator<T> f22011a = C8178t3.m39086a();

        /* renamed from: b */
        Iterator<T> f22012b;

        C8187i(Iterable iterable) {
            this.f22010N = iterable;
        }

        public boolean hasNext() {
            if (!this.f22011a.hasNext()) {
                this.f22011a = this.f22010N.iterator();
            }
            return this.f22011a.hasNext();
        }

        public T next() {
            if (hasNext()) {
                Iterator<T> it = this.f22011a;
                this.f22012b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C8277y.m39486a(this.f22012b != null);
            this.f22012b.remove();
            this.f22012b = null;
        }
    }

    /* renamed from: com.google.common.collect.t3$j */
    /* compiled from: Iterators */
    static class C8188j implements Iterator<T> {

        /* renamed from: N */
        final /* synthetic */ Iterator f22013N;

        /* renamed from: a */
        Iterator<? extends T> f22014a = C8178t3.m39086a();

        /* renamed from: b */
        Iterator<? extends T> f22015b;

        C8188j(Iterator it) {
            this.f22013N = it;
        }

        public boolean hasNext() {
            boolean hasNext;
            while (true) {
                hasNext = ((Iterator) C7397x.m35664a(this.f22014a)).hasNext();
                if (hasNext || !this.f22013N.hasNext()) {
                    return hasNext;
                }
                this.f22014a = (Iterator) this.f22013N.next();
            }
            return hasNext;
        }

        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f22014a;
                this.f22015b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C8277y.m39486a(this.f22015b != null);
            this.f22015b.remove();
            this.f22015b = null;
        }
    }

    /* renamed from: com.google.common.collect.t3$k */
    /* compiled from: Iterators */
    static class C8189k extends C8023l6<List<T>> {

        /* renamed from: N */
        final /* synthetic */ boolean f22016N;

        /* renamed from: a */
        final /* synthetic */ Iterator f22017a;

        /* renamed from: b */
        final /* synthetic */ int f22018b;

        C8189k(Iterator it, int i, boolean z) {
            this.f22017a = it;
            this.f22018b = i;
            this.f22016N = z;
        }

        public boolean hasNext() {
            return this.f22017a.hasNext();
        }

        public List<T> next() {
            if (hasNext()) {
                Object[] objArr = new Object[this.f22018b];
                int i = 0;
                while (i < this.f22018b && this.f22017a.hasNext()) {
                    objArr[i] = this.f22017a.next();
                    i++;
                }
                for (int i2 = i; i2 < this.f22018b; i2++) {
                    objArr[i2] = null;
                }
                List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (this.f22016N || i == this.f22018b) ? unmodifiableList : unmodifiableList.subList(0, i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.t3$l */
    /* compiled from: Iterators */
    static class C8190l extends C7603c<T> {

        /* renamed from: N */
        final /* synthetic */ Iterator f22019N;

        /* renamed from: O */
        final /* synthetic */ C5831y f22020O;

        C8190l(Iterator it, C5831y yVar) {
            this.f22019N = it;
            this.f22020O = yVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo29748b() {
            while (this.f22019N.hasNext()) {
                T next = this.f22019N.next();
                if (this.f22020O.apply(next)) {
                    return next;
                }
            }
            return mo29793c();
        }
    }

    /* renamed from: com.google.common.collect.t3$m */
    /* compiled from: Iterators */
    static class C8191m extends C7847f6<F, T> {

        /* renamed from: b */
        final /* synthetic */ C7380p f22021b;

        C8191m(Iterator it, C7380p pVar) {
            this.f22021b = pVar;
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public T mo30361a(F f) {
            return this.f22021b.apply(f);
        }
    }

    /* renamed from: com.google.common.collect.t3$n */
    /* compiled from: Iterators */
    static class C8192n implements Iterator<T> {

        /* renamed from: N */
        final /* synthetic */ Iterator f22022N;

        /* renamed from: a */
        private int f22023a;

        /* renamed from: b */
        final /* synthetic */ int f22024b;

        C8192n(int i, Iterator it) {
            this.f22024b = i;
            this.f22022N = it;
        }

        public boolean hasNext() {
            return this.f22023a < this.f22024b && this.f22022N.hasNext();
        }

        public T next() {
            if (hasNext()) {
                this.f22023a++;
                return this.f22022N.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            this.f22022N.remove();
        }
    }

    /* renamed from: com.google.common.collect.t3$o */
    /* compiled from: Iterators */
    private static class C8193o<T> extends C8023l6<T> {

        /* renamed from: a */
        final Queue<C8164s4<T>> f22025a;

        /* renamed from: com.google.common.collect.t3$o$a */
        /* compiled from: Iterators */
        class C8194a implements Comparator<C8164s4<T>> {

            /* renamed from: a */
            final /* synthetic */ Comparator f22026a;

            C8194a(Comparator comparator) {
                this.f22026a = comparator;
            }

            /* renamed from: a */
            public int compare(C8164s4<T> s4Var, C8164s4<T> s4Var2) {
                return this.f22026a.compare(s4Var.peek(), s4Var2.peek());
            }
        }

        public C8193o(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.f22025a = new PriorityQueue(2, new C8194a(comparator));
            for (Iterator it : iterable) {
                if (it.hasNext()) {
                    this.f22025a.add(C8178t3.m39136h(it));
                }
            }
        }

        public boolean hasNext() {
            return !this.f22025a.isEmpty();
        }

        public T next() {
            C8164s4 s4Var = (C8164s4) this.f22025a.remove();
            T next = s4Var.next();
            if (s4Var.hasNext()) {
                this.f22025a.add(s4Var);
            }
            return next;
        }
    }

    /* renamed from: com.google.common.collect.t3$p */
    /* compiled from: Iterators */
    private static class C8195p<E> implements C8164s4<E> {

        /* renamed from: N */
        private E f22028N;

        /* renamed from: a */
        private final Iterator<? extends E> f22029a;

        /* renamed from: b */
        private boolean f22030b;

        public C8195p(Iterator<? extends E> it) {
            this.f22029a = (Iterator) C7397x.m35664a(it);
        }

        public boolean hasNext() {
            return this.f22030b || this.f22029a.hasNext();
        }

        public E next() {
            if (!this.f22030b) {
                return this.f22029a.next();
            }
            E e = this.f22028N;
            this.f22030b = false;
            this.f22028N = null;
            return e;
        }

        public E peek() {
            if (!this.f22030b) {
                this.f22028N = this.f22029a.next();
                this.f22030b = true;
            }
            return this.f22028N;
        }

        public void remove() {
            C7397x.m35677b(!this.f22030b, (Object) "Can't remove after you've peeked at next");
            this.f22029a.remove();
        }
    }

    private C8178t3() {
    }

    /* renamed from: a */
    public static <T> C8023l6<T> m39086a() {
        return m39112b();
    }

    /* renamed from: b */
    static <T> C8062m6<T> m39112b() {
        return f22000a;
    }

    /* renamed from: c */
    static <T> Iterator<T> m39121c() {
        return f22001b;
    }

    /* renamed from: d */
    public static <T> Iterator<T> m39127d(Iterator<? extends Iterator<? extends T>> it) {
        C7397x.m35664a(it);
        return new C8188j(it);
    }

    @C5952h
    /* renamed from: e */
    public static <T> T m39130e(Iterator<? extends T> it, @C5952h T t) {
        return it.hasNext() ? m39135g(it) : t;
    }

    /* renamed from: f */
    public static <T> boolean m39133f(Iterator<T> it, C5831y<? super T> yVar) {
        C7397x.m35664a(yVar);
        boolean z = false;
        while (it.hasNext()) {
            if (yVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: g */
    public static <T> T m39135g(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        sb.append(sb2.toString());
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", ");
            sb3.append(it.next());
            sb.append(sb3.toString());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(C14662d0.f42854e);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public static <T> C8164s4<T> m39136h(Iterator<? extends T> it) {
        if (it instanceof C8195p) {
            return (C8195p) it;
        }
        return new C8195p(it);
    }

    @C5952h
    /* renamed from: i */
    static <T> T m39137i(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: j */
    public static int m39138j(Iterator<?> it) {
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    /* renamed from: k */
    public static String m39139k(Iterator<?> it) {
        C5822s sVar = C8292z.f22160a;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        StringBuilder a = sVar.mo23125a(sb, it);
        a.append(']');
        return a.toString();
    }

    /* renamed from: l */
    public static <T> C8023l6<T> m39140l(Iterator<T> it) {
        C7397x.m35664a(it);
        if (it instanceof C8023l6) {
            return (C8023l6) it;
        }
        return new C8186h(it);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> C8023l6<T> m39087a(C8023l6<T> l6Var) {
        return (C8023l6) C7397x.m35664a(l6Var);
    }

    /* renamed from: b */
    public static boolean m39116b(Iterator<?> it, Collection<?> collection) {
        return m39133f(it, C7398z.m35682a(C7398z.m35689a(collection)));
    }

    /* renamed from: c */
    public static <T> C8023l6<T> m39119c(Iterator<T> it, C5831y<? super T> yVar) {
        C7397x.m35664a(it);
        C7397x.m35664a(yVar);
        return new C8190l(it, yVar);
    }

    /* renamed from: e */
    public static <T> C8023l6<List<T>> m39129e(Iterator<T> it, int i) {
        return m39091a(it, i, false);
    }

    /* renamed from: a */
    public static boolean m39108a(Iterator<?> it, @C5952h Object obj) {
        return m39115b(it, C7398z.m35687a(obj));
    }

    /* renamed from: b */
    public static boolean m39117b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!C5827t.m25562a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: d */
    public static <T> C8023l6<List<T>> m39124d(Iterator<T> it, int i) {
        return m39091a(it, i, true);
    }

    /* renamed from: e */
    public static <T> int m39128e(Iterator<T> it, C5831y<? super T> yVar) {
        C7397x.m35665a(yVar, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (yVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m39109a(Iterator<?> it, Collection<?> collection) {
        return m39133f(it, C7398z.m35689a(collection));
    }

    /* renamed from: d */
    public static <T> T m39125d(Iterator<T> it, C5831y<? super T> yVar) {
        return m39119c(it, yVar).next();
    }

    /* renamed from: a */
    public static <T> boolean m39106a(Collection<T> collection, Iterator<? extends T> it) {
        C7397x.m35664a(collection);
        C7397x.m35664a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    @C5952h
    /* renamed from: c */
    public static <T> T m39120c(Iterator<? extends T> it, @C5952h T t) {
        return it.hasNext() ? m39132f(it) : t;
    }

    @C5952h
    /* renamed from: d */
    public static <T> T m39126d(Iterator<? extends T> it, @C5952h T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: f */
    public static <T> T m39132f(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: c */
    public static <T> Iterator<T> m39122c(Iterator<T> it, int i) {
        C7397x.m35664a(it);
        C7397x.m35671a(i >= 0, (Object) "limit is negative");
        return new C8192n(i, it);
    }

    /* renamed from: e */
    public static <T> Iterator<T> m39131e(Iterator<T> it) {
        C7397x.m35664a(it);
        return new C8179a(it);
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39098a(Iterable<T> iterable) {
        C7397x.m35664a(iterable);
        return new C8187i(iterable);
    }

    @C2777c("Array.newInstance(Class, int)")
    /* renamed from: b */
    public static <T> T[] m39118b(Iterator<? extends T> it, Class<T> cls) {
        return C8145s3.m39027b((Iterable<? extends T>) C8309z3.m39649a(it), cls);
    }

    /* renamed from: c */
    static void m39123c(Iterator<?> it) {
        C7397x.m35664a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39103a(T... tArr) {
        return m39098a((Iterable<T>) C8309z3.m39650a((E[]) tArr));
    }

    /* renamed from: b */
    public static int m39110b(Iterator<?> it, @C5952h Object obj) {
        return m39138j(m39119c(it, C7398z.m35687a(obj)));
    }

    /* renamed from: g */
    public static <T> C7392u<T> m39134g(Iterator<T> it, C5831y<? super T> yVar) {
        C8023l6 c = m39119c(it, yVar);
        return c.hasNext() ? C7392u.m35645c(c.next()) : C7392u.m35646g();
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39100a(Iterator<? extends T> it, Iterator<? extends T> it2) {
        return m39127d(C8257x2.m39394a(it, it2).iterator());
    }

    /* renamed from: b */
    public static <T> boolean m39115b(Iterator<T> it, C5831y<? super T> yVar) {
        return m39128e(it, yVar) != -1;
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39101a(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        return m39127d(C8257x2.m39395a(it, it2, it3).iterator());
    }

    /* renamed from: b */
    public static <T> T m39113b(Iterator<T> it, int i) {
        m39105a(i);
        int a = m39085a(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("position (");
        sb.append(i);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(a);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39102a(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        return m39127d(C8257x2.m39396a(it, it2, it3, it4).iterator());
    }

    /* renamed from: a */
    public static <T> Iterator<T> m39104a(Iterator<? extends T>... itArr) {
        return m39127d(C8257x2.m39410c(itArr).iterator());
    }

    /* renamed from: a */
    private static <T> C8023l6<List<T>> m39091a(Iterator<T> it, int i, boolean z) {
        C7397x.m35664a(it);
        C7397x.m35670a(i > 0);
        return new C8189k(it, i, z);
    }

    /* renamed from: b */
    public static <T> C8023l6<T> m39111b(T... tArr) {
        return m39093a(tArr, 0, tArr.length, 0);
    }

    @C2777c("Class.isInstance")
    /* renamed from: a */
    public static <T> C8023l6<T> m39092a(Iterator<?> it, Class<T> cls) {
        return m39119c(it, C7398z.m35694b(cls));
    }

    /* renamed from: b */
    static <T> ListIterator<T> m39114b(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* renamed from: a */
    public static <T> boolean m39107a(Iterator<T> it, C5831y<? super T> yVar) {
        C7397x.m35664a(yVar);
        while (it.hasNext()) {
            if (!yVar.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    @C5952h
    /* renamed from: a */
    public static <T> T m39096a(Iterator<? extends T> it, C5831y<? super T> yVar, @C5952h T t) {
        return m39126d((Iterator<? extends T>) m39119c(it, yVar), t);
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m39099a(Iterator<F> it, C7380p<? super F, ? extends T> pVar) {
        C7397x.m35664a(pVar);
        return new C8191m(it, pVar);
    }

    /* renamed from: a */
    static void m39105a(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("position (");
            sb.append(i);
            sb.append(") must not be negative");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    @C5952h
    /* renamed from: a */
    public static <T> T m39095a(Iterator<? extends T> it, int i, @C5952h T t) {
        m39105a(i);
        m39085a(it, i);
        return m39126d(it, t);
    }

    /* renamed from: a */
    public static int m39085a(Iterator<?> it, int i) {
        C7397x.m35664a(it);
        int i2 = 0;
        C7397x.m35671a(i >= 0, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    static <T> C8062m6<T> m39093a(T[] tArr, int i, int i2, int i3) {
        C7397x.m35670a(i2 >= 0);
        C7397x.m35675b(i, i + i2, tArr.length);
        C7397x.m35673b(i3, i2);
        if (i2 == 0) {
            return m39112b();
        }
        return new C8180b(i2, i3, tArr, i);
    }

    /* renamed from: a */
    public static <T> C8023l6<T> m39089a(@C5952h T t) {
        return new C8181c(t);
    }

    /* renamed from: a */
    public static <T> C8023l6<T> m39090a(Enumeration<T> enumeration) {
        C7397x.m35664a(enumeration);
        return new C8182d(enumeration);
    }

    /* renamed from: a */
    public static <T> Enumeration<T> m39097a(Iterator<T> it) {
        C7397x.m35664a(it);
        return new C8183e(it);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> C8164s4<T> m39094a(C8164s4<T> s4Var) {
        return (C8164s4) C7397x.m35664a(s4Var);
    }

    @C2775a
    /* renamed from: a */
    public static <T> C8023l6<T> m39088a(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        C7397x.m35665a(iterable, (Object) "iterators");
        C7397x.m35665a(comparator, (Object) "comparator");
        return new C8193o(iterable, comparator);
    }
}
