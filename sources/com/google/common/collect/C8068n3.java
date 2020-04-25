package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7859g3.C7860a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.n3 */
/* compiled from: ImmutableSortedSet */
public abstract class C8068n3<E> extends C8084o3<E> implements SortedSet<E>, C8138r5<E> {

    /* renamed from: R */
    private static final Comparator<Comparable> f21864R = C8133r4.m38943j();

    /* renamed from: S */
    private static final C8068n3<Comparable> f21865S = new C8243w0(f21864R);

    /* renamed from: P */
    final transient Comparator<? super E> f21866P;
    @C2777c("NavigableSet")

    /* renamed from: Q */
    transient C8068n3<E> f21867Q;

    /* renamed from: com.google.common.collect.n3$a */
    /* compiled from: ImmutableSortedSet */
    public static final class C8069a<E> extends C7860a<E> {

        /* renamed from: d */
        private final Comparator<? super E> f21868d;

        public C8069a(Comparator<? super E> comparator) {
            this.f21868d = (Comparator) C7397x.m35664a(comparator);
        }

        /* renamed from: a */
        public C8069a<E> m38631a(E e) {
            super.m37521a(e);
            return this;
        }

        /* renamed from: a */
        public C8069a<E> m38633a(E... eArr) {
            super.m37523a(eArr);
            return this;
        }

        /* renamed from: a */
        public C8069a<E> m38630a(Iterable<? extends E> iterable) {
            super.m37520a(iterable);
            return this;
        }

        /* renamed from: a */
        public C8069a<E> m38632a(Iterator<? extends E> it) {
            super.m37522a(it);
            return this;
        }

        /* renamed from: a */
        public C8068n3<E> m38634a() {
            C8068n3<E> a = C8068n3.m38600a(this.f21868d, this.f21998c, (E[]) this.f21997b);
            this.f21998c = a.size();
            return a;
        }
    }

    /* renamed from: com.google.common.collect.n3$b */
    /* compiled from: ImmutableSortedSet */
    private static class C8070b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f21869a;

        /* renamed from: b */
        final Object[] f21870b;

        public C8070b(Comparator<? super E> comparator, Object[] objArr) {
            this.f21869a = comparator;
            this.f21870b = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return new C8069a(this.f21869a).m38639a(this.f21870b).m38640a();
        }
    }

    C8068n3(Comparator<? super E> comparator) {
        this.f21866P = comparator;
    }

    /* renamed from: a */
    static <E> C8068n3<E> m38599a(Comparator<? super E> comparator) {
        if (f21864R.equals(comparator)) {
            return mo30457p();
        }
        return new C8243w0(comparator);
    }

    /* renamed from: b */
    public static <E> C8069a<E> m38607b(Comparator<E> comparator) {
        return new C8069a<>(comparator);
    }

    /* renamed from: m */
    public static <E> C8068n3<E> m38608m() {
        return mo30457p();
    }

    /* renamed from: p */
    private static <E> C8068n3<E> mo30457p() {
        return f21865S;
    }

    /* renamed from: q */
    public static <E extends Comparable<?>> C8069a<E> m38610q() {
        return new C8069a<>(C8133r4.m38943j());
    }

    /* renamed from: r */
    public static <E extends Comparable<?>> C8069a<E> m38611r() {
        return new C8069a<>(C8133r4.m38943j().mo30568g());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C8068n3<E> mo30440b(E e, boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C8068n3<E> mo30441b(E e, boolean z, E e2, boolean z2);

    @C2777c("NavigableSet")
    /* renamed from: c */
    public C8068n3<E> mo30547c(E e, boolean z) {
        return mo30444d(C7397x.m35664a(e), z);
    }

    public Comparator<? super E> comparator() {
        return this.f21866P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract C8068n3<E> mo30444d(E e, boolean z);

    @C2777c("NavigableSet")
    /* renamed from: d */
    public E mo30445d(E e) {
        return C8178t3.m39126d((Iterator<? extends T>) mo30538a(e, true).descendingIterator(), null);
    }

    @C2777c("NavigableSet")
    public abstract C8023l6<E> descendingIterator();

    @C2777c("NavigableSet")
    /* renamed from: e */
    public E mo30448e(E e) {
        return C8145s3.m39031c((Iterable<? extends T>) mo30547c(e, false), null);
    }

    @C2777c("NavigableSet")
    /* renamed from: f */
    public E mo30451f(E e) {
        return C8178t3.m39126d((Iterator<? extends T>) mo30538a(e, false).descendingIterator(), null);
    }

    public E first() {
        return iterator().next();
    }

    /* access modifiers changed from: 0000 */
    public abstract int indexOf(@C5952h Object obj);

    public abstract C8023l6<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("NavigableSet")
    /* renamed from: n */
    public C8068n3<E> mo30456n() {
        return new C8026m0(this);
    }

    @C2777c("NavigableSet")
    /* renamed from: o */
    public C8068n3<E> mo30788o() {
        C8068n3<E> n3Var = this.f21867Q;
        if (n3Var != null) {
            return n3Var;
        }
        C8068n3<E> n = mo30456n();
        this.f21867Q = n;
        n.f21867Q = this;
        return n;
    }

    @C2777c("NavigableSet")
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @C2777c("NavigableSet")
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8070b(this.f21866P, toArray());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo30880b(Object obj, Object obj2) {
        return m38590a(this.f21866P, obj, obj2);
    }

    @C2777c("NavigableSet")
    /* renamed from: c */
    public E mo30442c(E e) {
        return C8145s3.m39031c((Iterable<? extends T>) mo30547c(e, true), null);
    }

    public C8068n3<E> headSet(E e) {
        return mo30538a(e, false);
    }

    public C8068n3<E> subSet(E e, E e2) {
        return mo30539a(e, true, e2, false);
    }

    public C8068n3<E> tailSet(E e) {
        return mo30547c(e, true);
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38591a(E e) {
        return new C7846f5(C8257x2.m39393a(e), C8133r4.m38943j());
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38592a(E e, E e2) {
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), 2, (E[]) new Comparable[]{e, e2});
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38593a(E e, E e2, E e3) {
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), 3, (E[]) new Comparable[]{e, e2, e3});
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38594a(E e, E e2, E e3, E e4) {
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), 4, (E[]) new Comparable[]{e, e2, e3, e4});
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38595a(E e, E e2, E e3, E e4, E e5) {
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), 5, (E[]) new Comparable[]{e, e2, e3, e4, e5});
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38596a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Comparable[] comparableArr = new Comparable[(eArr.length + 6)];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), comparableArr.length, (E[]) comparableArr);
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8068n3<E> m38606a(E[] eArr) {
        return m38600a((Comparator<? super E>) C8133r4.m38943j(), eArr.length, (E[]) (Object[]) eArr.clone());
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38597a(Iterable<? extends E> iterable) {
        return m38601a((Comparator<? super E>) C8133r4.m38943j(), iterable);
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38598a(Collection<? extends E> collection) {
        return m38602a((Comparator<? super E>) C8133r4.m38943j(), collection);
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38604a(Iterator<? extends E> it) {
        return m38603a((Comparator<? super E>) C8133r4.m38943j(), it);
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38603a(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new C8069a(comparator).m38638a((Iterator) it).m38640a();
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38601a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C7397x.m35664a(comparator);
        if (C8165s5.m39056a(comparator, iterable) && (iterable instanceof C8068n3)) {
            C8068n3<E> n3Var = (C8068n3) iterable;
            if (!n3Var.mo29686j()) {
                return n3Var;
            }
        }
        Object[] j = C8145s3.m39047j(iterable);
        return m38600a(comparator, j.length, (E[]) j);
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38602a(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return m38601a(comparator, (Iterable<? extends E>) collection);
    }

    /* renamed from: a */
    public static <E> C8068n3<E> m38605a(SortedSet<E> sortedSet) {
        Comparator a = C8165s5.m39055a(sortedSet);
        C8257x2 a2 = C8257x2.m39405a((Collection<? extends E>) sortedSet);
        if (a2.isEmpty()) {
            return m38599a(a);
        }
        return new C7846f5(a2, a);
    }

    /* renamed from: a */
    static <E> C8068n3<E> m38600a(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m38599a(comparator);
        }
        C8109q4.m38839b(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator.compare(e, eArr[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr[i2] = e;
                i2 = i4;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        return new C7846f5(C8257x2.m39409b(eArr, i2), comparator);
    }

    /* renamed from: a */
    static int m38590a(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @C2777c("NavigableSet")
    /* renamed from: a */
    public C8068n3<E> mo30538a(E e, boolean z) {
        return mo30440b((E) C7397x.m35664a(e), z);
    }

    @C2777c("NavigableSet")
    /* renamed from: a */
    public C8068n3<E> mo30539a(E e, boolean z, E e2, boolean z2) {
        C7397x.m35664a(e);
        C7397x.m35664a(e2);
        C7397x.m35670a(this.f21866P.compare(e, e2) <= 0);
        return mo30441b(e, z, e2, z2);
    }
}
