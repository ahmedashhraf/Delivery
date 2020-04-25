package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import com.google.common.collect.C8175t2.C8177b;
import com.google.common.collect.C8302z2.C8303a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.f3 */
/* compiled from: ImmutableMultiset */
public abstract class C7793f3<E> extends C8175t2<E> implements C7982k4<E> {

    /* renamed from: N */
    private static final C7793f3<Object> f21488N = new C7579b5(C8302z2.m39630i(), 0);

    /* renamed from: b */
    private transient C7859g3<C7983a<E>> f21489b;

    /* renamed from: com.google.common.collect.f3$a */
    /* compiled from: ImmutableMultiset */
    class C7794a extends C8023l6<E> {

        /* renamed from: N */
        final /* synthetic */ Iterator f21490N;

        /* renamed from: a */
        int f21492a;

        /* renamed from: b */
        E f21493b;

        C7794a(Iterator it) {
            this.f21490N = it;
        }

        public boolean hasNext() {
            return this.f21492a > 0 || this.f21490N.hasNext();
        }

        public E next() {
            if (this.f21492a <= 0) {
                C7983a aVar = (C7983a) this.f21490N.next();
                this.f21493b = aVar.getElement();
                this.f21492a = aVar.getCount();
            }
            this.f21492a--;
            return this.f21493b;
        }
    }

    /* renamed from: com.google.common.collect.f3$b */
    /* compiled from: ImmutableMultiset */
    public static class C7795b<E> extends C8177b<E> {

        /* renamed from: b */
        final C7982k4<E> f21494b;

        public C7795b() {
            this(C8248w3.m39344l());
        }

        /* renamed from: b */
        public C7795b<E> mo30347b(E e, int i) {
            this.f21494b.mo29894c(C7397x.m35664a(e), i);
            return this;
        }

        C7795b(C7982k4<E> k4Var) {
            this.f21494b = k4Var;
        }

        /* renamed from: a */
        public C7795b<E> m37263a(E e) {
            this.f21494b.add(C7397x.m35664a(e));
            return this;
        }

        /* renamed from: a */
        public C7795b<E> mo30343a(E e, int i) {
            this.f21494b.mo29893b(C7397x.m35664a(e), i);
            return this;
        }

        /* renamed from: a */
        public C7795b<E> m37265a(E... eArr) {
            super.mo30345a(eArr);
            return this;
        }

        /* renamed from: a */
        public C7795b<E> m37262a(Iterable<? extends E> iterable) {
            if (iterable instanceof C7982k4) {
                for (C7983a aVar : C8003l4.m38357a(iterable).entrySet()) {
                    mo30343a(aVar.getElement(), aVar.getCount());
                }
            } else {
                super.mo30341a(iterable);
            }
            return this;
        }

        /* renamed from: a */
        public C7795b<E> m37264a(Iterator<? extends E> it) {
            super.mo30344a(it);
            return this;
        }

        /* renamed from: a */
        public C7793f3<E> m37266a() {
            return C7793f3.m37236a((Iterable<? extends E>) this.f21494b);
        }
    }

    /* renamed from: com.google.common.collect.f3$c */
    /* compiled from: ImmutableMultiset */
    private final class C7796c extends C7859g3<C7983a<E>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.f3$c$a */
        /* compiled from: ImmutableMultiset */
        class C7797a extends C8106q2<C7983a<E>> {
            C7797a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8175t2<C7983a<E>> mo29826n() {
                return C7796c.this;
            }

            public C7983a<E> get(int i) {
                return C7793f3.this.mo29709b(i);
            }
        }

        private C7796c() {
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (obj instanceof C7983a) {
                C7983a aVar = (C7983a) obj;
                if (aVar.getCount() <= 0) {
                    return false;
                }
                if (C7793f3.this.mo29708b(aVar.getElement()) == aVar.getCount()) {
                    z = true;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8257x2<C7983a<E>> mo29646f() {
            return new C7797a();
        }

        public int hashCode() {
            return C7793f3.this.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return C7793f3.this.mo29686j();
        }

        public int size() {
            return C7793f3.this.mo29710h().size();
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C7798d(C7793f3.this);
        }

        /* synthetic */ C7796c(C7793f3 f3Var, C7794a aVar) {
            this();
        }

        public C8023l6<C7983a<E>> iterator() {
            return mo30933e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.f3$d */
    /* compiled from: ImmutableMultiset */
    static class C7798d<E> implements Serializable {

        /* renamed from: a */
        final C7793f3<E> f21497a;

        C7798d(C7793f3<E> f3Var) {
            this.f21497a = f3Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21497a.entrySet();
        }
    }

    /* renamed from: com.google.common.collect.f3$e */
    /* compiled from: ImmutableMultiset */
    private static class C7799e implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f21498a;

        /* renamed from: b */
        final int[] f21499b;

        C7799e(C7982k4<?> k4Var) {
            int size = k4Var.entrySet().size();
            this.f21498a = new Object[size];
            this.f21499b = new int[size];
            int i = 0;
            for (C7983a aVar : k4Var.entrySet()) {
                this.f21498a[i] = aVar.getElement();
                this.f21499b[i] = aVar.getCount();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            C8248w3 b = C8248w3.m39343b(this.f21498a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f21498a;
                if (i >= objArr.length) {
                    return C7793f3.m37236a((Iterable<? extends E>) b);
                }
                b.mo29893b(objArr[i], this.f21499b[i]);
                i++;
            }
        }
    }

    C7793f3() {
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37237a(E e) {
        return m37246b((E[]) new Object[]{e});
    }

    /* renamed from: b */
    private static <E> C7793f3<E> m37246b(E... eArr) {
        return m37236a((Iterable<? extends E>) Arrays.asList(eArr));
    }

    /* renamed from: k */
    public static <E> C7795b<E> m37247k() {
        return new C7795b<>();
    }

    /* renamed from: l */
    private final C7859g3<C7983a<E>> m37248l() {
        return isEmpty() ? C7859g3.m37512m() : new C7796c(this, null);
    }

    /* renamed from: m */
    public static <E> C7793f3<E> m37249m() {
        return f21488N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C7983a<E> mo29709b(int i);

    @Deprecated
    /* renamed from: c */
    public final int mo29894c(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(@C5952h Object obj) {
        return mo29708b(obj) > 0;
    }

    public boolean containsAll(Collection<?> collection) {
        return mo29710h().containsAll(collection);
    }

    public boolean equals(@C5952h Object obj) {
        return C8003l4.m38360a((C7982k4<?>) this, obj);
    }

    public int hashCode() {
        return C8047m5.m38502a((Set<?>) entrySet());
    }

    public String toString() {
        return entrySet().toString();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C7799e(this);
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37238a(E e, E e2) {
        return m37246b((E[]) new Object[]{e, e2});
    }

    @Deprecated
    /* renamed from: b */
    public final int mo29893b(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public C7859g3<C7983a<E>> entrySet() {
        C7859g3<C7983a<E>> g3Var = this.f21489b;
        if (g3Var != null) {
            return g3Var;
        }
        C7859g3<C7983a<E>> l = m37248l();
        this.f21489b = l;
        return l;
    }

    public C8023l6<E> iterator() {
        return new C7794a(entrySet().iterator());
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37239a(E e, E e2, E e3) {
        return m37246b((E[]) new Object[]{e, e2, e3});
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37240a(E e, E e2, E e3, E e4) {
        return m37246b((E[]) new Object[]{e, e2, e3, e4});
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37241a(E e, E e2, E e3, E e4, E e5) {
        return m37246b((E[]) new Object[]{e, e2, e3, e4, e5});
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37242a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C7795b().m37263a(e).m37263a(e2).m37263a(e3).m37263a(e4).m37263a(e5).m37263a(e6).m37265a(eArr).m37266a();
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37245a(E[] eArr) {
        return m37236a((Iterable<? extends E>) Arrays.asList(eArr));
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37236a(Iterable<? extends E> iterable) {
        if (iterable instanceof C7793f3) {
            C7793f3<E> f3Var = (C7793f3) iterable;
            if (!f3Var.mo29686j()) {
                return f3Var;
            }
        }
        return m37235a(iterable instanceof C7982k4 ? C8003l4.m38357a(iterable) : C8248w3.m39342a(iterable));
    }

    /* renamed from: a */
    private static <E> C7793f3<E> m37235a(C7982k4<? extends E> k4Var) {
        return m37243a((Collection<? extends C7983a<? extends E>>) k4Var.entrySet());
    }

    /* renamed from: a */
    static <E> C7793f3<E> m37243a(Collection<? extends C7983a<? extends E>> collection) {
        C8303a g = C8302z2.m39628g();
        long j = 0;
        for (C7983a aVar : collection) {
            int count = aVar.getCount();
            if (count > 0) {
                g.mo30687a(aVar.getElement(), Integer.valueOf(count));
                j += (long) count;
            }
        }
        if (j == 0) {
            return m37249m();
        }
        return new C7579b5(g.mo30690a(), C6637f.m31672b(j));
    }

    /* renamed from: a */
    public static <E> C7793f3<E> m37244a(Iterator<? extends E> it) {
        C8248w3 l = C8248w3.m39344l();
        C8178t3.m39106a((Collection<T>) l, it);
        return m37235a((C7982k4<? extends E>) l);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo29818a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo29892a(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("not present in emulated superclass")
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            C7983a aVar = (C7983a) it.next();
            Arrays.fill(objArr, i, aVar.getCount() + i, aVar.getElement());
            i += aVar.getCount();
        }
        return i;
    }
}
