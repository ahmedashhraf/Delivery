package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.g3 */
/* compiled from: ImmutableSet */
public abstract class C7859g3<E> extends C8175t2<E> implements Set<E> {

    /* renamed from: N */
    private static final double f21565N = 0.7d;

    /* renamed from: O */
    private static final int f21566O = 751619276;

    /* renamed from: b */
    static final int f21567b = 1073741824;

    /* renamed from: com.google.common.collect.g3$a */
    /* compiled from: ImmutableSet */
    public static class C7860a<E> extends C8176a<E> {
        public C7860a() {
            this(4);
        }

        C7860a(int i) {
            super(i);
        }

        /* renamed from: a */
        public C7860a<E> m37521a(E e) {
            super.m39077a(e);
            return this;
        }

        /* renamed from: a */
        public C7860a<E> m37523a(E... eArr) {
            super.mo30345a(eArr);
            return this;
        }

        /* renamed from: a */
        public C7860a<E> m37520a(Iterable<? extends E> iterable) {
            super.mo30341a(iterable);
            return this;
        }

        /* renamed from: a */
        public C7860a<E> m37522a(Iterator<? extends E> it) {
            super.mo30344a(it);
            return this;
        }

        /* renamed from: a */
        public C7859g3<E> m37524a() {
            C7859g3<E> a = C7859g3.m37510b(this.f21998c, this.f21997b);
            this.f21998c = a.size();
            return a;
        }
    }

    /* renamed from: com.google.common.collect.g3$b */
    /* compiled from: ImmutableSet */
    private static class C7861b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f21568a;

        C7861b(Object[] objArr) {
            this.f21568a = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C7859g3.m37508a((E[]) this.f21568a);
        }
    }

    C7859g3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> C7859g3<E> m37510b(int i, Object... objArr) {
        if (i == 0) {
            return m37512m();
        }
        if (i == 1) {
            return m37499a((E) objArr[0]);
        }
        int b = m37509b(i);
        Object[] objArr2 = new Object[b];
        int i2 = b - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a = C8109q4.m38826a(objArr[i5], i5);
            int hashCode = a.hashCode();
            int a2 = C8093p2.m38750a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    int i7 = i3 + 1;
                    objArr[i3] = a;
                    objArr2[i6] = a;
                    i4 += hashCode;
                    i3 = i7;
                    break;
                } else if (obj.equals(a)) {
                    break;
                } else {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i3, i, null);
        if (i3 == 1) {
            return new C8097p5(objArr[0], i4);
        }
        if (b != m37509b(i3)) {
            return m37510b(i3, objArr);
        }
        if (i3 < objArr.length) {
            objArr = C8109q4.m38833a((T[]) objArr, i3);
        }
        return new C7623c5(objArr, i4, objArr2, i2);
    }

    /* renamed from: l */
    public static <E> C7860a<E> m37511l() {
        return new C7860a<>();
    }

    /* renamed from: m */
    public static <E> C7859g3<E> m37512m() {
        return C8140s0.f21950P;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7859g3) || !mo29841k() || !((C7859g3) obj).mo29841k() || hashCode() == obj.hashCode()) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C8047m5.m38502a((Set<?>) this);
    }

    public abstract C8023l6<E> iterator();

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo29841k() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C7861b(toArray());
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37499a(E e) {
        return new C8097p5(e);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37500a(E e, E e2) {
        return m37510b(2, e, e2);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37501a(E e, E e2, E e3) {
        return m37510b(3, e, e2, e3);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37502a(E e, E e2, E e3, E e4) {
        return m37510b(4, e, e2, e3, e4);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37503a(E e, E e2, E e3, E e4, E e5) {
        return m37510b(5, e, e2, e3, e4, e5);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37504a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m37510b(objArr.length, objArr);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37508a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m37512m();
        }
        if (length != 1) {
            return m37510b(eArr.length, (Object[]) eArr.clone());
        }
        return m37499a(eArr[0]);
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37498a(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? m37505a(C8292z.m39586a(iterable)) : m37507a(iterable.iterator());
    }

    @C2778d
    /* renamed from: b */
    static int m37509b(int i) {
        boolean z = true;
        if (i < f21566O) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * f21565N >= ((double) i)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (i >= 1073741824) {
                z = false;
            }
            C7397x.m35671a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37507a(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m37512m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m37499a((E) next);
        }
        return new C7860a().m37521a(next).m37522a(it).m37524a();
    }

    /* renamed from: a */
    public static <E> C7859g3<E> m37505a(Collection<? extends E> collection) {
        if ((collection instanceof C7859g3) && !(collection instanceof C8068n3)) {
            C7859g3<E> g3Var = (C7859g3) collection;
            if (!g3Var.mo29686j()) {
                return g3Var;
            }
        } else if (collection instanceof EnumSet) {
            return m37506a((EnumSet) collection);
        }
        Object[] array = collection.toArray();
        return m37510b(array.length, array);
    }

    /* renamed from: a */
    private static <E extends Enum<E>> C7859g3<E> m37506a(EnumSet<E> enumSet) {
        return C8245w2.m39340a(EnumSet.copyOf(enumSet));
    }
}
