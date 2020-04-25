package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7982k4.C7983a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.l4 */
/* compiled from: Multisets */
public final class C8003l4 {

    /* renamed from: a */
    private static final C8133r4<C7983a<?>> f21767a = new C8012e();

    /* renamed from: com.google.common.collect.l4$a */
    /* compiled from: Multisets */
    static class C8004a extends C7893i<E> {

        /* renamed from: N */
        final /* synthetic */ C7982k4 f21768N;

        /* renamed from: O */
        final /* synthetic */ C7982k4 f21769O;

        /* renamed from: com.google.common.collect.l4$a$a */
        /* compiled from: Multisets */
        class C8005a extends C7603c<C7983a<E>> {

            /* renamed from: N */
            final /* synthetic */ Iterator f21770N;

            /* renamed from: O */
            final /* synthetic */ Iterator f21771O;

            C8005a(Iterator it, Iterator it2) {
                this.f21770N = it;
                this.f21771O = it2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C7983a<E> m38382b() {
                if (this.f21770N.hasNext()) {
                    C7983a aVar = (C7983a) this.f21770N.next();
                    Object element = aVar.getElement();
                    return C8003l4.m38354a(element, Math.max(aVar.getCount(), C8004a.this.f21769O.mo29708b(element)));
                }
                while (this.f21771O.hasNext()) {
                    C7983a aVar2 = (C7983a) this.f21771O.next();
                    Object element2 = aVar2.getElement();
                    if (!C8004a.this.f21768N.contains(element2)) {
                        return C8003l4.m38354a(element2, aVar2.getCount());
                    }
                }
                return (C7983a) mo29793c();
            }
        }

        C8004a(C7982k4 k4Var, C7982k4 k4Var2) {
            this.f21768N = k4Var;
            this.f21769O = k4Var2;
        }

        /* renamed from: b */
        public int mo29708b(Object obj) {
            return Math.max(this.f21768N.mo29708b(obj), this.f21769O.mo29708b(obj));
        }

        public boolean contains(@C5952h Object obj) {
            return this.f21768N.contains(obj) || this.f21769O.contains(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<E> mo30097e() {
            return C8047m5.m38532d(this.f21768N.mo29710h(), this.f21769O.mo29710h());
        }

        public boolean isEmpty() {
            return this.f21768N.isEmpty() && this.f21769O.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return mo29710h().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<E>> mo30101k() {
            return new C8005a(this.f21768N.entrySet().iterator(), this.f21769O.entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.l4$b */
    /* compiled from: Multisets */
    static class C8006b extends C7893i<E> {

        /* renamed from: N */
        final /* synthetic */ C7982k4 f21773N;

        /* renamed from: O */
        final /* synthetic */ C7982k4 f21774O;

        /* renamed from: com.google.common.collect.l4$b$a */
        /* compiled from: Multisets */
        class C8007a extends C7603c<C7983a<E>> {

            /* renamed from: N */
            final /* synthetic */ Iterator f21775N;

            C8007a(Iterator it) {
                this.f21775N = it;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C7983a<E> m38388b() {
                while (this.f21775N.hasNext()) {
                    C7983a aVar = (C7983a) this.f21775N.next();
                    Object element = aVar.getElement();
                    int min = Math.min(aVar.getCount(), C8006b.this.f21774O.mo29708b(element));
                    if (min > 0) {
                        return C8003l4.m38354a(element, min);
                    }
                }
                return (C7983a) mo29793c();
            }
        }

        C8006b(C7982k4 k4Var, C7982k4 k4Var2) {
            this.f21773N = k4Var;
            this.f21774O = k4Var2;
        }

        /* renamed from: b */
        public int mo29708b(Object obj) {
            int b = this.f21773N.mo29708b(obj);
            if (b == 0) {
                return 0;
            }
            return Math.min(b, this.f21774O.mo29708b(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<E> mo30097e() {
            return C8047m5.m38522b(this.f21773N.mo29710h(), this.f21774O.mo29710h());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return mo29710h().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<E>> mo30101k() {
            return new C8007a(this.f21773N.entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.l4$c */
    /* compiled from: Multisets */
    static class C8008c extends C7893i<E> {

        /* renamed from: N */
        final /* synthetic */ C7982k4 f21777N;

        /* renamed from: O */
        final /* synthetic */ C7982k4 f21778O;

        /* renamed from: com.google.common.collect.l4$c$a */
        /* compiled from: Multisets */
        class C8009a extends C7603c<C7983a<E>> {

            /* renamed from: N */
            final /* synthetic */ Iterator f21779N;

            /* renamed from: O */
            final /* synthetic */ Iterator f21780O;

            C8009a(Iterator it, Iterator it2) {
                this.f21779N = it;
                this.f21780O = it2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C7983a<E> m38394b() {
                if (this.f21779N.hasNext()) {
                    C7983a aVar = (C7983a) this.f21779N.next();
                    Object element = aVar.getElement();
                    return C8003l4.m38354a(element, aVar.getCount() + C8008c.this.f21778O.mo29708b(element));
                }
                while (this.f21780O.hasNext()) {
                    C7983a aVar2 = (C7983a) this.f21780O.next();
                    Object element2 = aVar2.getElement();
                    if (!C8008c.this.f21777N.contains(element2)) {
                        return C8003l4.m38354a(element2, aVar2.getCount());
                    }
                }
                return (C7983a) mo29793c();
            }
        }

        C8008c(C7982k4 k4Var, C7982k4 k4Var2) {
            this.f21777N = k4Var;
            this.f21778O = k4Var2;
        }

        /* renamed from: b */
        public int mo29708b(Object obj) {
            return this.f21777N.mo29708b(obj) + this.f21778O.mo29708b(obj);
        }

        public boolean contains(@C5952h Object obj) {
            return this.f21777N.contains(obj) || this.f21778O.contains(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<E> mo30097e() {
            return C8047m5.m38532d(this.f21777N.mo29710h(), this.f21778O.mo29710h());
        }

        public boolean isEmpty() {
            return this.f21777N.isEmpty() && this.f21778O.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return mo29710h().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<E>> mo30101k() {
            return new C8009a(this.f21777N.entrySet().iterator(), this.f21778O.entrySet().iterator());
        }

        public int size() {
            return this.f21777N.size() + this.f21778O.size();
        }
    }

    /* renamed from: com.google.common.collect.l4$d */
    /* compiled from: Multisets */
    static class C8010d extends C7893i<E> {

        /* renamed from: N */
        final /* synthetic */ C7982k4 f21782N;

        /* renamed from: O */
        final /* synthetic */ C7982k4 f21783O;

        /* renamed from: com.google.common.collect.l4$d$a */
        /* compiled from: Multisets */
        class C8011a extends C7603c<C7983a<E>> {

            /* renamed from: N */
            final /* synthetic */ Iterator f21784N;

            C8011a(Iterator it) {
                this.f21784N = it;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C7983a<E> m38399b() {
                while (this.f21784N.hasNext()) {
                    C7983a aVar = (C7983a) this.f21784N.next();
                    Object element = aVar.getElement();
                    int count = aVar.getCount() - C8010d.this.f21783O.mo29708b(element);
                    if (count > 0) {
                        return C8003l4.m38354a(element, count);
                    }
                }
                return (C7983a) mo29793c();
            }
        }

        C8010d(C7982k4 k4Var, C7982k4 k4Var2) {
            this.f21782N = k4Var;
            this.f21783O = k4Var2;
        }

        /* renamed from: b */
        public int mo29708b(@C5952h Object obj) {
            int b = this.f21782N.mo29708b(obj);
            if (b == 0) {
                return 0;
            }
            return Math.max(0, b - this.f21783O.mo29708b(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return C8178t3.m39138j(mo30101k());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<E>> mo30101k() {
            return new C8011a(this.f21782N.entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.l4$e */
    /* compiled from: Multisets */
    static class C8012e extends C8133r4<C7983a<?>> {
        C8012e() {
        }

        /* renamed from: a */
        public int compare(C7983a<?> aVar, C7983a<?> aVar2) {
            return C6637f.m31658a(aVar2.getCount(), aVar.getCount());
        }
    }

    /* renamed from: com.google.common.collect.l4$f */
    /* compiled from: Multisets */
    static abstract class C8013f<E> implements C7983a<E> {
        C8013f() {
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7983a)) {
                return false;
            }
            C7983a aVar = (C7983a) obj;
            if (getCount() != aVar.getCount() || !C5827t.m25562a(getElement(), aVar.getElement())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object element = getElement();
            if (element == null) {
                i = 0;
            } else {
                i = element.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.l4$g */
    /* compiled from: Multisets */
    static abstract class C8014g<E> extends C8055g<E> {

        /* renamed from: com.google.common.collect.l4$g$a */
        /* compiled from: Multisets */
        class C8015a extends C7847f6<C7983a<E>, E> {
            C8015a(Iterator it) {
                super(it);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public E mo30361a(C7983a<E> aVar) {
                return aVar.getElement();
            }
        }

        C8014g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C7982k4<E> mo30584b();

        public void clear() {
            mo30584b().clear();
        }

        public boolean contains(Object obj) {
            return mo30584b().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo30584b().containsAll(collection);
        }

        public boolean isEmpty() {
            return mo30584b().isEmpty();
        }

        public Iterator<E> iterator() {
            return new C8015a(mo30584b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int b = mo30584b().mo29708b(obj);
            if (b <= 0) {
                return false;
            }
            mo30584b().mo29818a(obj, b);
            return true;
        }

        public int size() {
            return mo30584b().entrySet().size();
        }
    }

    /* renamed from: com.google.common.collect.l4$h */
    /* compiled from: Multisets */
    static abstract class C8016h<E> extends C8055g<C7983a<E>> {
        C8016h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C7982k4<E> mo29820b();

        public void clear() {
            mo29820b().clear();
        }

        public boolean contains(@C5952h Object obj) {
            boolean z = false;
            if (obj instanceof C7983a) {
                C7983a aVar = (C7983a) obj;
                if (aVar.getCount() <= 0) {
                    return false;
                }
                if (mo29820b().mo29708b(aVar.getElement()) == aVar.getCount()) {
                    z = true;
                }
            }
            return z;
        }

        public boolean remove(Object obj) {
            if (obj instanceof C7983a) {
                C7983a aVar = (C7983a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo29820b().mo29892a(element, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.l4$i */
    /* compiled from: Multisets */
    private static final class C8017i<E> extends C7893i<E> {

        /* renamed from: N */
        final C7982k4<E> f21787N;

        /* renamed from: O */
        final C5831y<? super E> f21788O;

        /* renamed from: com.google.common.collect.l4$i$a */
        /* compiled from: Multisets */
        class C8018a implements C5831y<C7983a<E>> {
            C8018a() {
            }

            /* renamed from: a */
            public boolean apply(C7983a<E> aVar) {
                return C8017i.this.f21788O.apply(aVar.getElement());
            }
        }

        C8017i(C7982k4<E> k4Var, C5831y<? super E> yVar) {
            this.f21787N = (C7982k4) C7397x.m35664a(k4Var);
            this.f21788O = (C5831y) C7397x.m35664a(yVar);
        }

        /* renamed from: a */
        public int mo29818a(@C5952h Object obj, int i) {
            C8277y.m39484a(i, "occurrences");
            if (i == 0) {
                return mo29708b(obj);
            }
            return contains(obj) ? this.f21787N.mo29818a(obj, i) : 0;
        }

        /* renamed from: b */
        public int mo29708b(@C5952h Object obj) {
            int b = this.f21787N.mo29708b(obj);
            if (b <= 0) {
                return 0;
            }
            if (!this.f21788O.apply(obj)) {
                b = 0;
            }
            return b;
        }

        public void clear() {
            mo29710h().clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<E> mo30097e() {
            return C8047m5.m38515a(this.f21787N.mo29710h(), this.f21788O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Set<C7983a<E>> mo30583f() {
            return C8047m5.m38515a(this.f21787N.entrySet(), (C5831y<? super E>) new C8018a<Object>());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo30100j() {
            return mo29710h().size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Iterator<C7983a<E>> mo30101k() {
            throw new AssertionError("should never be called");
        }

        public C8023l6<E> iterator() {
            return C8178t3.m39119c(this.f21787N.iterator(), this.f21788O);
        }

        /* renamed from: b */
        public int mo29893b(@C5952h E e, int i) {
            C7397x.m35672a(this.f21788O.apply(e), "Element %s does not match predicate %s", e, this.f21788O);
            return this.f21787N.mo29893b(e, i);
        }
    }

    /* renamed from: com.google.common.collect.l4$j */
    /* compiled from: Multisets */
    static final class C8019j<E> extends C8013f<E> implements Serializable {
        private static final long serialVersionUID = 0;
        @C5952h

        /* renamed from: a */
        final E f21790a;

        /* renamed from: b */
        final int f21791b;

        C8019j(@C5952h E e, int i) {
            this.f21790a = e;
            this.f21791b = i;
            C8277y.m39484a(i, "count");
        }

        public int getCount() {
            return this.f21791b;
        }

        @C5952h
        public E getElement() {
            return this.f21790a;
        }
    }

    /* renamed from: com.google.common.collect.l4$k */
    /* compiled from: Multisets */
    static final class C8020k<E> implements Iterator<E> {

        /* renamed from: N */
        private C7983a<E> f21792N;

        /* renamed from: O */
        private int f21793O;

        /* renamed from: P */
        private int f21794P;

        /* renamed from: Q */
        private boolean f21795Q;

        /* renamed from: a */
        private final C7982k4<E> f21796a;

        /* renamed from: b */
        private final Iterator<C7983a<E>> f21797b;

        C8020k(C7982k4<E> k4Var, Iterator<C7983a<E>> it) {
            this.f21796a = k4Var;
            this.f21797b = it;
        }

        public boolean hasNext() {
            return this.f21793O > 0 || this.f21797b.hasNext();
        }

        public E next() {
            if (hasNext()) {
                if (this.f21793O == 0) {
                    this.f21792N = (C7983a) this.f21797b.next();
                    int count = this.f21792N.getCount();
                    this.f21793O = count;
                    this.f21794P = count;
                }
                this.f21793O--;
                this.f21795Q = true;
                return this.f21792N.getElement();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C8277y.m39486a(this.f21795Q);
            if (this.f21794P == 1) {
                this.f21797b.remove();
            } else {
                this.f21796a.remove(this.f21792N.getElement());
            }
            this.f21794P--;
            this.f21795Q = false;
        }
    }

    /* renamed from: com.google.common.collect.l4$l */
    /* compiled from: Multisets */
    static class C8021l<E> extends C8279y1<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient Set<C7983a<E>> f21798N;

        /* renamed from: a */
        final C7982k4<? extends E> f21799a;

        /* renamed from: b */
        transient Set<E> f21800b;

        C8021l(C7982k4<? extends E> k4Var) {
            this.f21799a = k4Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H */
        public Set<E> mo30783H() {
            return Collections.unmodifiableSet(this.f21799a.mo29710h());
        }

        /* renamed from: a */
        public int mo29818a(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public int mo29893b(E e, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo29894c(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<C7983a<E>> entrySet() {
            Set<C7983a<E>> set = this.f21798N;
            if (set != null) {
                return set;
            }
            Set<C7983a<E>> unmodifiableSet = Collections.unmodifiableSet(this.f21799a.entrySet());
            this.f21798N = unmodifiableSet;
            return unmodifiableSet;
        }

        /* renamed from: h */
        public Set<E> mo29710h() {
            Set<E> set = this.f21800b;
            if (set != null) {
                return set;
            }
            Set<E> H = mo30783H();
            this.f21800b = H;
            return H;
        }

        public Iterator<E> iterator() {
            return C8178t3.m39140l(this.f21799a.iterator());
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public boolean mo29892a(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7982k4<E> m38421y() {
            return this.f21799a;
        }
    }

    private C8003l4() {
    }

    @Deprecated
    /* renamed from: a */
    public static <E> C7982k4<E> m38355a(C7793f3<E> f3Var) {
        return (C7982k4) C7397x.m35664a(f3Var);
    }

    /* renamed from: b */
    static int m38363b(Iterable<?> iterable) {
        if (iterable instanceof C7982k4) {
            return ((C7982k4) iterable).mo29710h().size();
        }
        return 11;
    }

    /* renamed from: c */
    public static <E> C7982k4<E> m38368c(C7982k4<E> k4Var, C7982k4<?> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        return new C8006b(k4Var, k4Var2);
    }

    /* renamed from: d */
    public static <E> C7982k4<E> m38370d(C7982k4<? extends E> k4Var) {
        return ((k4Var instanceof C8021l) || (k4Var instanceof C7793f3)) ? k4Var : new C8021l((C7982k4) C7397x.m35664a(k4Var));
    }

    /* renamed from: e */
    private static <E> boolean m38372e(C7982k4<E> k4Var, C7982k4<?> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        Iterator it = k4Var.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C7983a aVar = (C7983a) it.next();
            int b = k4Var2.mo29708b(aVar.getElement());
            if (b >= aVar.getCount()) {
                it.remove();
            } else if (b > 0) {
                k4Var.mo29818a(aVar.getElement(), b);
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public static boolean m38373f(C7982k4<?> k4Var, C7982k4<?> k4Var2) {
        return m38374g(k4Var, k4Var2);
    }

    /* renamed from: g */
    private static <E> boolean m38374g(C7982k4<E> k4Var, C7982k4<?> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        Iterator it = k4Var.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C7983a aVar = (C7983a) it.next();
            int b = k4Var2.mo29708b(aVar.getElement());
            if (b == 0) {
                it.remove();
            } else if (b < aVar.getCount()) {
                k4Var.mo29894c(aVar.getElement(), b);
            }
            z = true;
        }
        return z;
    }

    @C2775a
    /* renamed from: h */
    public static <E> C7982k4<E> m38375h(C7982k4<? extends E> k4Var, C7982k4<? extends E> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        return new C8008c(k4Var, k4Var2);
    }

    @C2775a
    /* renamed from: i */
    public static <E> C7982k4<E> m38376i(C7982k4<? extends E> k4Var, C7982k4<? extends E> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        return new C8004a(k4Var, k4Var2);
    }

    @C2775a
    /* renamed from: a */
    public static <E> C8240v5<E> m38358a(C8240v5<E> v5Var) {
        return new C8073n6((C8240v5) C7397x.m35664a(v5Var));
    }

    /* renamed from: a */
    public static <E> C7983a<E> m38354a(@C5952h E e, int i) {
        return new C8019j(e, i);
    }

    @C2775a
    /* renamed from: b */
    public static <E> C7982k4<E> m38364b(C7982k4<E> k4Var, C7982k4<?> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        return new C8010d(k4Var, k4Var2);
    }

    /* renamed from: d */
    public static boolean m38371d(C7982k4<?> k4Var, C7982k4<?> k4Var2) {
        return m38372e(k4Var, k4Var2);
    }

    @C2775a
    /* renamed from: a */
    public static <E> C7982k4<E> m38356a(C7982k4<E> k4Var, C5831y<? super E> yVar) {
        if (!(k4Var instanceof C8017i)) {
            return new C8017i(k4Var, yVar);
        }
        C8017i iVar = (C8017i) k4Var;
        return new C8017i(iVar.f21787N, C7398z.m35684a(iVar.f21788O, yVar));
    }

    /* renamed from: c */
    static boolean m38369c(C7982k4<?> k4Var, Collection<?> collection) {
        C7397x.m35664a(collection);
        if (collection instanceof C7982k4) {
            collection = ((C7982k4) collection).mo29710h();
        }
        return k4Var.mo29710h().retainAll(collection);
    }

    /* renamed from: b */
    static boolean m38366b(C7982k4<?> k4Var, Collection<?> collection) {
        if (collection instanceof C7982k4) {
            collection = ((C7982k4) collection).mo29710h();
        }
        return k4Var.mo29710h().removeAll(collection);
    }

    /* renamed from: c */
    static int m38367c(C7982k4<?> k4Var) {
        long j = 0;
        for (C7983a count : k4Var.entrySet()) {
            j += (long) count.getCount();
        }
        return C6637f.m31672b(j);
    }

    /* renamed from: b */
    static <E> Iterator<E> m38365b(C7982k4<E> k4Var) {
        return new C8020k(k4Var, k4Var.entrySet().iterator());
    }

    /* renamed from: a */
    public static boolean m38359a(C7982k4<?> k4Var, C7982k4<?> k4Var2) {
        C7397x.m35664a(k4Var);
        C7397x.m35664a(k4Var2);
        for (C7983a aVar : k4Var2.entrySet()) {
            if (k4Var.mo29708b(aVar.getElement()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m38360a(C7982k4<?> k4Var, @C5952h Object obj) {
        if (obj == k4Var) {
            return true;
        }
        if (obj instanceof C7982k4) {
            C7982k4 k4Var2 = (C7982k4) obj;
            if (k4Var.size() == k4Var2.size() && k4Var.entrySet().size() == k4Var2.entrySet().size()) {
                for (C7983a aVar : k4Var2.entrySet()) {
                    if (k4Var.mo29708b(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static <E> boolean m38362a(C7982k4<E> k4Var, Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        if (collection instanceof C7982k4) {
            for (C7983a aVar : m38357a((Iterable<T>) collection).entrySet()) {
                k4Var.mo29893b(aVar.getElement(), aVar.getCount());
            }
        } else {
            C8178t3.m39106a((Collection<T>) k4Var, collection.iterator());
        }
        return true;
    }

    /* renamed from: a */
    static <E> int m38352a(C7982k4<E> k4Var, E e, int i) {
        C8277y.m39484a(i, "count");
        int b = k4Var.mo29708b(e);
        int i2 = i - b;
        if (i2 > 0) {
            k4Var.mo29893b(e, i2);
        } else if (i2 < 0) {
            k4Var.mo29818a(e, -i2);
        }
        return b;
    }

    /* renamed from: a */
    static <E> boolean m38361a(C7982k4<E> k4Var, E e, int i, int i2) {
        C8277y.m39484a(i, "oldCount");
        C8277y.m39484a(i2, "newCount");
        if (k4Var.mo29708b(e) != i) {
            return false;
        }
        k4Var.mo29894c(e, i2);
        return true;
    }

    /* renamed from: a */
    static <T> C7982k4<T> m38357a(Iterable<T> iterable) {
        return (C7982k4) iterable;
    }

    @C2775a
    /* renamed from: a */
    public static <E> C7793f3<E> m38353a(C7982k4<E> k4Var) {
        return C7793f3.m37243a((Collection<? extends C7983a<? extends E>>) f21767a.mo30930a((Iterable<E>) k4Var.entrySet()));
    }
}
