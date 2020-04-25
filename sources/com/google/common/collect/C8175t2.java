package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.t2 */
/* compiled from: ImmutableCollection */
public abstract class C8175t2<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private transient C8257x2<E> f21996a;

    /* renamed from: com.google.common.collect.t2$a */
    /* compiled from: ImmutableCollection */
    static abstract class C8176a<E> extends C8177b<E> {

        /* renamed from: b */
        Object[] f21997b;

        /* renamed from: c */
        int f21998c = 0;

        C8176a(int i) {
            C8277y.m39484a(i, "initialCapacity");
            this.f21997b = new Object[i];
        }

        /* renamed from: a */
        private void m39074a(int i) {
            Object[] objArr = this.f21997b;
            if (objArr.length < i) {
                this.f21997b = C8109q4.m38833a((T[]) objArr, C8177b.m39079a(objArr.length, i));
            }
        }

        /* renamed from: a */
        public C8176a<E> m39077a(E e) {
            C7397x.m35664a(e);
            m39074a(this.f21998c + 1);
            Object[] objArr = this.f21997b;
            int i = this.f21998c;
            this.f21998c = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: a */
        public C8177b<E> mo30345a(E... eArr) {
            C8109q4.m38832a((Object[]) eArr);
            m39074a(this.f21998c + eArr.length);
            System.arraycopy(eArr, 0, this.f21997b, this.f21998c, eArr.length);
            this.f21998c += eArr.length;
            return this;
        }

        /* renamed from: a */
        public C8177b<E> mo30341a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                m39074a(this.f21998c + ((Collection) iterable).size());
            }
            super.mo30341a(iterable);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.t2$b */
    /* compiled from: ImmutableCollection */
    public static abstract class C8177b<E> {

        /* renamed from: a */
        static final int f21999a = 4;

        C8177b() {
        }

        /* renamed from: a */
        static int m39079a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        /* renamed from: a */
        public abstract C8177b<E> mo30342a(E e);

        /* renamed from: a */
        public abstract C8175t2<E> mo30346a();

        /* renamed from: a */
        public C8177b<E> mo30345a(E... eArr) {
            for (E a : eArr) {
                mo30342a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C8177b<E> mo30341a(Iterable<? extends E> iterable) {
            for (Object a : iterable) {
                mo30342a((E) a);
            }
            return this;
        }

        /* renamed from: a */
        public C8177b<E> mo30344a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo30342a((E) it.next());
            }
            return this;
        }
    }

    C8175t2() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        Iterator it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean contains(@C5952h Object obj) {
        return obj != null && super.contains(obj);
    }

    /* renamed from: e */
    public C8257x2<E> mo30933e() {
        C8257x2<E> x2Var = this.f21996a;
        if (x2Var != null) {
            return x2Var;
        }
        C8257x2<E> f = mo29646f();
        this.f21996a = f;
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8257x2<E> mo29646f() {
        int size = size();
        if (size == 0) {
            return C8257x2.m39412m();
        }
        if (size != 1) {
            return new C8274x4(this, toArray());
        }
        return C8257x2.m39393a(iterator().next());
    }

    public abstract C8023l6<E> iterator();

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public abstract boolean mo29686j();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        if (size() == 0) {
            return C8109q4.f21911a;
        }
        Object[] objArr = new Object[size()];
        mo29839a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C8261d(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        C7397x.m35664a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = C8109q4.m38840c(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo29839a(tArr, 0);
        return tArr;
    }
}
