package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7793f3.C7795b;
import com.google.common.collect.C7982k4.C7983a;
import com.google.common.collect.C8257x2.C8259b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2777c;

@C2777c("hasn't been tested yet")
@C2775a
/* renamed from: com.google.common.collect.l3 */
/* compiled from: ImmutableSortedMultiset */
public abstract class C8000l3<E> extends C8044m3<E> implements C8240v5<E> {

    /* renamed from: P */
    private static final Comparator<Comparable> f21761P = C8133r4.m38943j();

    /* renamed from: Q */
    private static final C8000l3<Comparable> f21762Q = new C8219v0(f21761P);

    /* renamed from: O */
    transient C8000l3<E> f21763O;

    /* renamed from: com.google.common.collect.l3$a */
    /* compiled from: ImmutableSortedMultiset */
    public static class C8001a<E> extends C7795b<E> {
        public C8001a(Comparator<? super E> comparator) {
            super(C7961j6.m38111a((Comparator) C7397x.m35664a(comparator)));
        }

        /* renamed from: b */
        public C8001a<E> m38351b(E e, int i) {
            super.mo30347b(e, i);
            return this;
        }

        /* renamed from: a */
        public C8001a<E> m38340a(E e) {
            super.m37263a(e);
            return this;
        }

        /* renamed from: a */
        public C8001a<E> m38341a(E e, int i) {
            super.mo30343a(e, i);
            return this;
        }

        /* renamed from: a */
        public C8001a<E> m38343a(E... eArr) {
            super.m37265a(eArr);
            return this;
        }

        /* renamed from: a */
        public C8001a<E> m38339a(Iterable<? extends E> iterable) {
            super.m37262a(iterable);
            return this;
        }

        /* renamed from: a */
        public C8001a<E> m38342a(Iterator<? extends E> it) {
            super.m37264a(it);
            return this;
        }

        /* renamed from: a */
        public C8000l3<E> m38344a() {
            return C8000l3.m38304a((C8240v5) this.f21494b);
        }
    }

    /* renamed from: com.google.common.collect.l3$b */
    /* compiled from: ImmutableSortedMultiset */
    private static final class C8002b<E> implements Serializable {

        /* renamed from: N */
        int[] f21764N;

        /* renamed from: a */
        Comparator<? super E> f21765a;

        /* renamed from: b */
        E[] f21766b;

        C8002b(C8240v5<E> v5Var) {
            this.f21765a = v5Var.comparator();
            int size = v5Var.entrySet().size();
            this.f21766b = new Object[size];
            this.f21764N = new int[size];
            int i = 0;
            for (C7983a aVar : v5Var.entrySet()) {
                this.f21766b[i] = aVar.getElement();
                this.f21764N[i] = aVar.getCount();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            int length = this.f21766b.length;
            C8001a aVar = new C8001a(this.f21765a);
            for (int i = 0; i < length; i++) {
                aVar.mo30343a((Object) this.f21766b[i], this.f21764N[i]);
            }
            return aVar.m38349a();
        }
    }

    C8000l3() {
    }

    /* renamed from: l */
    public static <E extends Comparable<E>> C8001a<E> m38319l() {
        return new C8001a<>(C8133r4.m38943j());
    }

    /* renamed from: m */
    public static <E> C8000l3<E> m38320m() {
        return f21762Q;
    }

    /* renamed from: n */
    public static <E extends Comparable<E>> C8001a<E> m38321n() {
        return new C8001a<>(C8133r4.m38943j().mo30568g());
    }

    /* renamed from: a */
    public abstract C8000l3<E> m38326a(E e, C8209u uVar);

    /* renamed from: b */
    public abstract C8000l3<E> m38329b(E e, C8209u uVar);

    public final Comparator<? super E> comparator() {
        return m38332h().comparator();
    }

    /* renamed from: h */
    public abstract C8068n3<E> m38332h();

    @Deprecated
    public final C7983a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final C7983a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8002b(this);
    }

    /* renamed from: b */
    public static <E> C8001a<E> m38318b(Comparator<E> comparator) {
        return new C8001a<>(comparator);
    }

    /* renamed from: B */
    public C8000l3<E> m38323B() {
        C8000l3<E> l3Var = this.f21763O;
        if (l3Var != null) {
            return l3Var;
        }
        C7996l0 l0Var = new C7996l0(this);
        this.f21763O = l0Var;
        return l0Var;
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38305a(E e) {
        C7770e5 e5Var = new C7770e5((C7846f5) C8068n3.m38591a(e), new int[]{1}, new long[]{0, 1}, 0, 1);
        return e5Var;
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38306a(E e, E e2) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2}));
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38307a(E e, E e2, E e3) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3}));
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38308a(E e, E e2, E e3, E e4) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3, e4}));
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38309a(E e, E e2, E e3, E e4, E e5) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3, e4, e5}));
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38310a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ArrayList b = C8309z3.m39664b(eArr.length + 6);
        Collections.addAll(b, new Comparable[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(b, eArr);
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) b);
    }

    /* renamed from: a */
    public static <E extends Comparable<? super E>> C8000l3<E> m38317a(E[] eArr) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), (Iterable<? extends E>) Arrays.asList(eArr));
    }

    /* renamed from: a */
    public static <E> C8000l3<E> m38311a(Iterable<? extends E> iterable) {
        return m38313a((Comparator<? super E>) C8133r4.m38943j(), iterable);
    }

    /* renamed from: a */
    public static <E> C8000l3<E> m38316a(Iterator<? extends E> it) {
        return m38315a((Comparator<? super E>) C8133r4.m38943j(), it);
    }

    /* renamed from: a */
    public static <E> C8000l3<E> m38315a(Comparator<? super E> comparator, Iterator<? extends E> it) {
        C7397x.m35664a(comparator);
        return new C8001a(comparator).m38347a((Iterator) it).m38349a();
    }

    /* renamed from: a */
    public static <E> C8000l3<E> m38313a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof C8000l3) {
            C8000l3<E> l3Var = (C8000l3) iterable;
            if (comparator.equals(l3Var.comparator())) {
                return l3Var.mo29686j() ? m38314a(comparator, (Collection<C7983a<E>>) l3Var.entrySet().mo30933e()) : l3Var;
            }
        }
        ArrayList b = C8309z3.m39665b(iterable);
        C7961j6 a = C7961j6.m38111a((Comparator) C7397x.m35664a(comparator));
        C8145s3.m39018a((Collection<T>) a, (Iterable<? extends T>) b);
        return m38314a(comparator, (Collection<C7983a<E>>) a.entrySet());
    }

    /* renamed from: a */
    public static <E> C8000l3<E> m38304a(C8240v5<E> v5Var) {
        return m38314a(v5Var.comparator(), (Collection<C7983a<E>>) C8309z3.m39665b((Iterable<? extends E>) v5Var.entrySet()));
    }

    /* renamed from: a */
    private static <E> C8000l3<E> m38314a(Comparator<? super E> comparator, Collection<C7983a<E>> collection) {
        if (collection.isEmpty()) {
            return m38312a(comparator);
        }
        C8259b bVar = new C8259b(collection.size());
        int[] iArr = new int[collection.size()];
        long[] jArr = new long[(collection.size() + 1)];
        int i = 0;
        for (C7983a aVar : collection) {
            bVar.m39420a(aVar.getElement());
            iArr[i] = aVar.getCount();
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) iArr[i]);
            i = i2;
        }
        C7770e5 e5Var = new C7770e5(new C7846f5(bVar.mo30346a(), comparator), iArr, jArr, 0, collection.size());
        return e5Var;
    }

    /* renamed from: a */
    static <E> C8000l3<E> m38312a(Comparator<? super E> comparator) {
        if (f21761P.equals(comparator)) {
            return f21762Q;
        }
        return new C8219v0(comparator);
    }

    /* renamed from: a */
    public C8000l3<E> m38327a(E e, C8209u uVar, E e2, C8209u uVar2) {
        C7397x.m35672a(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return m38329b(e, uVar).m38326a(e2, uVar2);
    }
}
