package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.x2 */
/* compiled from: ImmutableList */
public abstract class C8257x2<E> extends C8175t2<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final C8257x2<Object> f22095b = new C8327z4(C8109q4.f21911a);

    /* renamed from: com.google.common.collect.x2$a */
    /* compiled from: ImmutableList */
    class C8258a extends C7550b<E> {
        C8258a(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo29660a(int i) {
            return C8257x2.this.get(i);
        }
    }

    /* renamed from: com.google.common.collect.x2$b */
    /* compiled from: ImmutableList */
    public static final class C8259b<E> extends C8176a<E> {
        public C8259b() {
            this(4);
        }

        C8259b(int i) {
            super(i);
        }

        /* renamed from: a */
        public C8259b<E> m39425a(E e) {
            super.m39077a(e);
            return this;
        }

        /* renamed from: a */
        public C8259b<E> m39424a(Iterable<? extends E> iterable) {
            super.mo30341a(iterable);
            return this;
        }

        /* renamed from: a */
        public C8259b<E> m39427a(E... eArr) {
            super.mo30345a(eArr);
            return this;
        }

        /* renamed from: a */
        public C8259b<E> m39426a(Iterator<? extends E> it) {
            super.mo30344a(it);
            return this;
        }

        /* renamed from: a */
        public C8257x2<E> m39428a() {
            return C8257x2.m39409b(this.f21997b, this.f21998c);
        }
    }

    /* renamed from: com.google.common.collect.x2$c */
    /* compiled from: ImmutableList */
    private static class C8260c<E> extends C8257x2<E> {

        /* renamed from: N */
        private final transient C8257x2<E> f22097N;

        C8260c(C8257x2<E> x2Var) {
            this.f22097N = x2Var;
        }

        /* renamed from: b */
        private int m39429b(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: c */
        private int m39430c(int i) {
            return size() - i;
        }

        public boolean contains(@C5952h Object obj) {
            return this.f22097N.contains(obj);
        }

        public E get(int i) {
            C7397x.m35663a(i, size());
            return this.f22097N.get(m39429b(i));
        }

        public int indexOf(@C5952h Object obj) {
            int lastIndexOf = this.f22097N.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m39429b(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C8257x2.super.iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return this.f22097N.mo29686j();
        }

        /* renamed from: k */
        public C8257x2<E> mo30925k() {
            return this.f22097N;
        }

        public int lastIndexOf(@C5952h Object obj) {
            int indexOf = this.f22097N.indexOf(obj);
            if (indexOf >= 0) {
                return m39429b(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C8257x2.super.listIterator();
        }

        public int size() {
            return this.f22097N.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C8257x2.super.listIterator(i);
        }

        public C8257x2<E> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            return this.f22097N.subList(m39430c(i2), m39430c(i)).mo30925k();
        }
    }

    /* renamed from: com.google.common.collect.x2$d */
    /* compiled from: ImmutableList */
    static class C8261d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f22098a;

        C8261d(Object[] objArr) {
            this.f22098a = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C8257x2.m39410c(this.f22098a);
        }
    }

    /* renamed from: com.google.common.collect.x2$e */
    /* compiled from: ImmutableList */
    class C8262e extends C8257x2<E> {

        /* renamed from: N */
        final transient int f22099N;

        /* renamed from: O */
        final transient int f22100O;

        C8262e(int i, int i2) {
            this.f22099N = i;
            this.f22100O = i2;
        }

        public E get(int i) {
            C7397x.m35663a(i, this.f22100O);
            return C8257x2.this.get(i + this.f22099N);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C8257x2.super.iterator();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C8257x2.super.listIterator();
        }

        public int size() {
            return this.f22100O;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C8257x2.super.listIterator(i);
        }

        public C8257x2<E> subList(int i, int i2) {
            C7397x.m35675b(i, i2, this.f22100O);
            C8257x2 x2Var = C8257x2.this;
            int i3 = this.f22099N;
            return x2Var.subList(i + i3, i2 + i3);
        }
    }

    C8257x2() {
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39393a(E e) {
        return new C8086o5(e);
    }

    /* renamed from: b */
    private static <E> C8257x2<E> m39408b(Object... objArr) {
        return m39407a(C8109q4.m38832a(objArr));
    }

    /* renamed from: c */
    public static <E> C8257x2<E> m39410c(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m39412m();
        }
        if (length != 1) {
            return new C8327z4(C8109q4.m38832a((Object[]) eArr.clone()));
        }
        return new C8086o5(eArr[0]);
    }

    /* renamed from: l */
    public static <E> C8259b<E> m39411l() {
        return new C8259b<>();
    }

    /* renamed from: m */
    public static <E> C8257x2<E> m39412m() {
        return f22095b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(@C5952h Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public final C8257x2<E> mo30933e() {
        return this;
    }

    public boolean equals(@C5952h Object obj) {
        return C8309z3.m39661a((List<?>) this, obj);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(@C5952h Object obj) {
        if (obj == null) {
            return -1;
        }
        return C8309z3.m39663b((List<?>) this, obj);
    }

    /* renamed from: k */
    public C8257x2<E> mo30925k() {
        return new C8260c(this);
    }

    public int lastIndexOf(@C5952h Object obj) {
        if (obj == null) {
            return -1;
        }
        return C8309z3.m39668c(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8261d(toArray());
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39394a(E e, E e2) {
        return m39408b(e, e2);
    }

    /* renamed from: b */
    static <E> C8257x2<E> m39409b(Object[] objArr, int i) {
        if (i == 0) {
            return m39412m();
        }
        if (i == 1) {
            return new C8086o5(objArr[0]);
        }
        if (i < objArr.length) {
            objArr = C8109q4.m38833a((T[]) objArr, i);
        }
        return new C8327z4(objArr);
    }

    public C8023l6<E> iterator() {
        return listIterator();
    }

    public C8257x2<E> subList(int i, int i2) {
        C7397x.m35675b(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return m39412m();
        }
        if (i3 != 1) {
            return mo30618a(i, i2);
        }
        return m39393a((E) get(i));
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39395a(E e, E e2, E e3) {
        return m39408b(e, e2, e3);
    }

    public C8062m6<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39396a(E e, E e2, E e3, E e4) {
        return m39408b(e, e2, e3, e4);
    }

    public C8062m6<E> listIterator(int i) {
        return new C8258a(size(), i);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39397a(E e, E e2, E e3, E e4, E e5) {
        return m39408b(e, e2, e3, e4, e5);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39398a(E e, E e2, E e3, E e4, E e5, E e6) {
        return m39408b(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39399a(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return m39408b(e, e2, e3, e4, e5, e6, e7);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39400a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return m39408b(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39401a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return m39408b(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39402a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return m39408b(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39403a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return m39408b(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39404a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        Object[] objArr = new Object[(eArr.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return m39408b(objArr);
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39392a(Iterable<? extends E> iterable) {
        C7397x.m35664a(iterable);
        return iterable instanceof Collection ? m39405a(C8292z.m39586a(iterable)) : m39406a(iterable.iterator());
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39405a(Collection<? extends E> collection) {
        if (!(collection instanceof C8175t2)) {
            return m39408b(collection.toArray());
        }
        C8257x2<E> e = ((C8175t2) collection).mo30933e();
        if (e.mo29686j()) {
            e = m39407a(e.toArray());
        }
        return e;
    }

    /* renamed from: a */
    public static <E> C8257x2<E> m39406a(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m39412m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m39393a((E) next);
        }
        return new C8259b().m39420a(next).mo30344a((Iterator) it).mo30346a();
    }

    /* renamed from: a */
    static <E> C8257x2<E> m39407a(Object[] objArr) {
        return m39409b(objArr, objArr.length);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8257x2<E> mo30618a(int i, int i2) {
        return new C8262e(i, i2 - i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }
}
