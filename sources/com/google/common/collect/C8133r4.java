package com.google.common.collect;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.r4 */
/* compiled from: Ordering */
public abstract class C8133r4<T> implements Comparator<T> {

    /* renamed from: a */
    static final int f21943a = 1;

    /* renamed from: b */
    static final int f21944b = -1;

    @C2778d
    /* renamed from: com.google.common.collect.r4$a */
    /* compiled from: Ordering */
    static class C8134a extends C8133r4<Object> {

        /* renamed from: N */
        private Map<Object, Integer> f21945N = C8196t4.m39145a(new C7660d4()).mo29948a((C7380p<? super K, ? extends V>) new C8135a<Object,Object>());

        /* renamed from: com.google.common.collect.r4$a$a */
        /* compiled from: Ordering */
        class C8135a implements C7380p<Object, Integer> {

            /* renamed from: a */
            final AtomicInteger f21946a = new AtomicInteger(0);

            C8135a() {
            }

            public Integer apply(Object obj) {
                return Integer.valueOf(this.f21946a.getAndIncrement());
            }
        }

        C8134a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30994a(Object obj) {
            return System.identityHashCode(obj);
        }

        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            int i = -1;
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int a = mo30994a(obj);
            int a2 = mo30994a(obj2);
            if (a != a2) {
                if (a >= a2) {
                    i = 1;
                }
                return i;
            }
            int compareTo = ((Integer) this.f21945N.get(obj)).compareTo((Integer) this.f21945N.get(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* renamed from: com.google.common.collect.r4$b */
    /* compiled from: Ordering */
    private static class C8136b {

        /* renamed from: a */
        static final C8133r4<Object> f21948a = new C8134a();

        private C8136b() {
        }
    }

    @C2778d
    /* renamed from: com.google.common.collect.r4$c */
    /* compiled from: Ordering */
    static class C8137c extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object f21949a;

        C8137c(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot compare value: ");
            sb.append(obj);
            super(sb.toString());
            this.f21949a = obj;
        }
    }

    protected C8133r4() {
    }

    @C2776b(serializable = true)
    @Deprecated
    /* renamed from: a */
    public static <T> C8133r4<T> m38936a(C8133r4<T> r4Var) {
        return (C8133r4) C7397x.m35664a(r4Var);
    }

    @C2776b(serializable = true)
    /* renamed from: b */
    public static <T> C8133r4<T> m38939b(Comparator<T> comparator) {
        return comparator instanceof C8133r4 ? (C8133r4) comparator : new C7537a0(comparator);
    }

    @C2776b(serializable = true)
    /* renamed from: h */
    public static C8133r4<Object> m38941h() {
        return C8088p.f21889N;
    }

    /* renamed from: i */
    public static C8133r4<Object> m38942i() {
        return C8136b.f21948a;
    }

    @C2776b(serializable = true)
    /* renamed from: j */
    public static <C extends Comparable> C8133r4<C> m38943j() {
        return C8071n4.f21871N;
    }

    @C2776b(serializable = true)
    /* renamed from: k */
    public static C8133r4<Object> m38944k() {
        return C8087o6.f21888N;
    }

    /* renamed from: c */
    public boolean mo30992c(Iterable<? extends T> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    public abstract int compare(@C5952h T t, @C5952h T t2);

    @C2776b(serializable = true)
    /* renamed from: d */
    public <S extends T> C8133r4<S> mo30916d() {
        return new C8085o4(this);
    }

    @C2776b(serializable = true)
    /* renamed from: e */
    public <S extends T> C8133r4<S> mo30917e() {
        return new C8096p4(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public <T2 extends T> C8133r4<Entry<T2, ?>> mo30993f() {
        return mo30985a(C7800f4.m37273a());
    }

    @C2776b(serializable = true)
    /* renamed from: g */
    public <S extends T> C8133r4<S> mo30568g() {
        return new C7921i5(this);
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <T> C8133r4<T> m38938a(List<T> list) {
        return new C7554b1(list);
    }

    @C2776b(serializable = true)
    /* renamed from: g */
    public static <T> C8133r4<T> m38940g(Iterable<? extends Comparator<? super T>> iterable) {
        return new C7606c0(iterable);
    }

    /* renamed from: b */
    public <E extends T> E mo30562b(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = mo30563b(next, (E) it.next());
        }
        return next;
    }

    /* renamed from: d */
    public <E extends T> E mo30566d(Iterable<E> iterable) {
        return mo30557a(iterable.iterator());
    }

    /* renamed from: e */
    public <E extends T> E mo30567e(Iterable<E> iterable) {
        return mo30562b(iterable.iterator());
    }

    /* renamed from: f */
    public <E extends T> List<E> mo30931f(Iterable<E> iterable) {
        Object[] j = C8145s3.m39047j(iterable);
        Arrays.sort(j, this);
        return C8309z3.m39665b((Iterable<? extends E>) Arrays.asList(j));
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public static <T> C8133r4<T> m38937a(T t, T... tArr) {
        return m38938a(C8309z3.m39654a(t, (E[]) tArr));
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public <F> C8133r4<F> mo30985a(C7380p<F, ? extends T> pVar) {
        return new C8218v(pVar, this);
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public <U extends T> C8133r4<U> mo30986a(Comparator<? super U> comparator) {
        return new C7606c0(this, (Comparator) C7397x.m35664a(comparator));
    }

    /* renamed from: b */
    public <E extends T> E mo30563b(@C5952h E e, @C5952h E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public <S extends T> C8133r4<Iterable<S>> mo30984a() {
        return new C8215u3(this);
    }

    /* renamed from: b */
    public <E extends T> E mo30564b(@C5952h E e, @C5952h E e2, @C5952h E e3, E... eArr) {
        E b = mo30563b((E) mo30563b(e, e2), e3);
        for (E b2 : eArr) {
            b = mo30563b(b, b2);
        }
        return b;
    }

    /* renamed from: a */
    public <E extends T> E mo30557a(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = mo30558a(next, (E) it.next());
        }
        return next;
    }

    /* renamed from: b */
    public <E extends T> List<E> mo30989b(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (((long) collection.size()) <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = C8109q4.m38833a((T[]) array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return mo30990b(iterable.iterator(), i);
    }

    /* renamed from: a */
    public <E extends T> E mo30558a(@C5952h E e, @C5952h E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    /* renamed from: a */
    public <E extends T> E mo30559a(@C5952h E e, @C5952h E e2, @C5952h E e3, E... eArr) {
        E a = mo30558a((E) mo30558a(e, e2), e3);
        for (E a2 : eArr) {
            a = mo30558a(a, a2);
        }
        return a;
    }

    /* renamed from: a */
    private <E extends T> int m38935a(E[] eArr, int i, int i2, int i3) {
        E e = eArr[i3];
        eArr[i3] = eArr[i2];
        eArr[i2] = e;
        int i4 = i;
        while (i < i2) {
            if (compare(eArr[i], e) < 0) {
                C8109q4.m38838b(eArr, i4, i);
                i4++;
            }
            i++;
        }
        C8109q4.m38838b(eArr, i2, i4);
        return i4;
    }

    /* renamed from: b */
    public <E extends T> List<E> mo30990b(Iterator<E> it, int i) {
        C7397x.m35664a(it);
        C8277y.m39484a(i, "k");
        if (i == 0 || !it.hasNext()) {
            return C8257x2.m39412m();
        }
        if (i >= 1073741823) {
            ArrayList a = C8309z3.m39649a(it);
            Collections.sort(a, this);
            if (a.size() > i) {
                a.subList(i, a.size()).clear();
            }
            a.trimToSize();
            return Collections.unmodifiableList(a);
        }
        int i2 = i * 2;
        Object[] objArr = new Object[i2];
        Object next = it.next();
        objArr[0] = next;
        Object obj = next;
        int i3 = 1;
        while (i3 < i && it.hasNext()) {
            Object next2 = it.next();
            int i4 = i3 + 1;
            objArr[i3] = next2;
            obj = mo30558a((E) obj, (E) next2);
            i3 = i4;
        }
        while (it.hasNext()) {
            Object next3 = it.next();
            if (compare(next3, obj) < 0) {
                int i5 = i3 + 1;
                objArr[i3] = next3;
                if (i5 == i2) {
                    int i6 = i2 - 1;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i6) {
                        int a2 = m38935a((E[]) objArr, i7, i6, ((i7 + i6) + 1) >>> 1);
                        if (a2 <= i) {
                            if (a2 >= i) {
                                break;
                            }
                            i7 = Math.max(a2, i7 + 1);
                            i8 = a2;
                        } else {
                            i6 = a2 - 1;
                        }
                    }
                    Object obj2 = objArr[i8];
                    while (true) {
                        i8++;
                        if (i8 >= i) {
                            break;
                        }
                        obj2 = mo30558a((E) obj2, (E) objArr[i8]);
                    }
                    obj = obj2;
                    i3 = i;
                } else {
                    i3 = i5;
                }
            }
        }
        Arrays.sort(objArr, 0, i3, this);
        return Collections.unmodifiableList(Arrays.asList(C8109q4.m38833a((T[]) objArr, Math.min(i3, i))));
    }

    /* renamed from: a */
    public <E extends T> List<E> mo30987a(Iterable<E> iterable, int i) {
        return mo30568g().mo30989b(iterable, i);
    }

    /* renamed from: a */
    public <E extends T> List<E> mo30988a(Iterator<E> it, int i) {
        return mo30568g().mo30990b(it, i);
    }

    /* renamed from: a */
    public <E extends T> C8257x2<E> mo30930a(Iterable<E> iterable) {
        Object[] j = C8145s3.m39047j(iterable);
        for (Object a : j) {
            C7397x.m35664a(a);
        }
        Arrays.sort(j, this);
        return C8257x2.m39407a(j);
    }

    /* renamed from: a */
    public int mo30983a(List<? extends T> list, @C5952h T t) {
        return Collections.binarySearch(list, t, this);
    }

    /* renamed from: b */
    public boolean mo30991b(Iterable<? extends T> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }
}
