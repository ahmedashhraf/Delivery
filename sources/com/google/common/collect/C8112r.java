package com.google.common.collect;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import com.google.common.collect.C8302z2.C8303a;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.r */
/* compiled from: ArrayTable */
public final class C8112r<R, C, V> extends C8074o<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C8257x2<R> f21915N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C8257x2<C> f21916O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C8302z2<R, Integer> f21917P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C8302z2<C, Integer> f21918Q;

    /* renamed from: R */
    private final V[][] f21919R;

    /* renamed from: S */
    private transient C8120d f21920S;

    /* renamed from: T */
    private transient C8122f f21921T;

    /* renamed from: com.google.common.collect.r$a */
    /* compiled from: ArrayTable */
    class C8113a extends C7550b<C7678a<R, C, V>> {

        /* renamed from: com.google.common.collect.r$a$a */
        /* compiled from: ArrayTable */
        class C8114a extends C7773b<R, C, V> {

            /* renamed from: N */
            final /* synthetic */ int f21923N;

            /* renamed from: a */
            final int f21925a = (this.f21923N / C8112r.this.f21916O.size());

            /* renamed from: b */
            final int f21926b = (this.f21923N % C8112r.this.f21916O.size());

            C8114a(int i) {
                this.f21923N = i;
            }

            /* renamed from: a */
            public C mo29992a() {
                return C8112r.this.f21916O.get(this.f21926b);
            }

            /* renamed from: d */
            public R mo29993d() {
                return C8112r.this.f21915N.get(this.f21925a);
            }

            public V getValue() {
                return C8112r.this.mo30958a(this.f21925a, this.f21926b);
            }
        }

        C8113a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7678a<R, C, V> m38882a(int i) {
            return new C8114a(i);
        }
    }

    /* renamed from: com.google.common.collect.r$b */
    /* compiled from: ArrayTable */
    private static abstract class C8115b<K, V> extends C7841v<K, V> {

        /* renamed from: O */
        private final C8302z2<K, Integer> f21927O;

        /* renamed from: com.google.common.collect.r$b$a */
        /* compiled from: ArrayTable */
        class C8116a extends C7828o<K, V> {

            /* renamed from: com.google.common.collect.r$b$a$a */
            /* compiled from: ArrayTable */
            class C8117a extends C7550b<Entry<K, V>> {

                /* renamed from: com.google.common.collect.r$b$a$a$a */
                /* compiled from: ArrayTable */
                class C8118a extends C7848g<K, V> {

                    /* renamed from: a */
                    final /* synthetic */ int f21930a;

                    C8118a(int i) {
                        this.f21930a = i;
                    }

                    public K getKey() {
                        return C8115b.this.mo30965a(this.f21930a);
                    }

                    public V getValue() {
                        return C8115b.this.mo30967b(this.f21930a);
                    }

                    public V setValue(V v) {
                        return C8115b.this.mo30966a(this.f21930a, v);
                    }
                }

                C8117a(int i) {
                    super(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Entry<K, V> m38892a(int i) {
                    return new C8118a(i);
                }
            }

            C8116a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<K, V> mo29777b() {
                return C8115b.this;
            }

            public Iterator<Entry<K, V>> iterator() {
                return new C8117a(size());
            }
        }

        /* synthetic */ C8115b(C8302z2 z2Var, C8113a aVar) {
            this(z2Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public K mo30965a(int i) {
            return this.f21927O.keySet().mo30933e().get(i);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public abstract V mo30966a(int i, V v);

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public abstract V mo30967b(int i);

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(@C5952h Object obj) {
            return this.f21927O.containsKey(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract String mo30970d();

        public V get(@C5952h Object obj) {
            Integer num = (Integer) this.f21927O.get(obj);
            if (num == null) {
                return null;
            }
            return mo30967b(num.intValue());
        }

        public boolean isEmpty() {
            return this.f21927O.isEmpty();
        }

        public Set<K> keySet() {
            return this.f21927O.keySet();
        }

        public V put(K k, V v) {
            Integer num = (Integer) this.f21927O.get(k);
            if (num != null) {
                return mo30966a(num.intValue(), v);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(mo30970d());
            sb.append(C3868i.f12248b);
            sb.append(k);
            sb.append(" not in ");
            sb.append(this.f21927O.keySet());
            throw new IllegalArgumentException(sb.toString());
        }

        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f21927O.size();
        }

        private C8115b(C8302z2<K, Integer> z2Var) {
            this.f21927O = z2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<K, V>> mo29734a() {
            return new C8116a();
        }
    }

    /* renamed from: com.google.common.collect.r$c */
    /* compiled from: ArrayTable */
    private class C8119c extends C8115b<R, V> {

        /* renamed from: P */
        final int f21932P;

        C8119c(int i) {
            super(C8112r.this.f21917P, null);
            this.f21932P = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30966a(int i, V v) {
            return C8112r.this.mo30959a(i, this.f21932P, v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo30967b(int i) {
            return C8112r.this.mo30958a(i, this.f21932P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo30970d() {
            return "Row";
        }
    }

    /* renamed from: com.google.common.collect.r$d */
    /* compiled from: ArrayTable */
    private class C8120d extends C8115b<C, Map<R, V>> {
        /* synthetic */ C8120d(C8112r rVar, C8113a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo30970d() {
            return "Column";
        }

        private C8120d() {
            super(C8112r.this.f21918Q, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Map<R, V> mo30966a(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<R, V> m38900b(int i) {
            return new C8119c(i);
        }

        /* renamed from: a */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.collect.r$e */
    /* compiled from: ArrayTable */
    private class C8121e extends C8115b<C, V> {

        /* renamed from: P */
        final int f21935P;

        C8121e(int i) {
            super(C8112r.this.f21918Q, null);
            this.f21935P = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo30966a(int i, V v) {
            return C8112r.this.mo30959a(this.f21935P, i, v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo30967b(int i) {
            return C8112r.this.mo30958a(this.f21935P, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo30970d() {
            return "Column";
        }
    }

    /* renamed from: com.google.common.collect.r$f */
    /* compiled from: ArrayTable */
    private class C8122f extends C8115b<R, Map<C, V>> {
        /* synthetic */ C8122f(C8112r rVar, C8113a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo30970d() {
            return "Row";
        }

        private C8122f() {
            super(C8112r.this.f21917P, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Map<C, V> mo30966a(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<C, V> m38909b(int i) {
            return new C8121e(i);
        }

        /* renamed from: a */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    private C8112r(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        this.f21915N = C8257x2.m39392a(iterable);
        this.f21916O = C8257x2.m39392a(iterable2);
        C7397x.m35670a(!this.f21915N.isEmpty());
        C7397x.m35670a(!this.f21916O.isEmpty());
        this.f21917P = m38853a((List<E>) this.f21915N);
        this.f21918Q = m38853a((List<E>) this.f21916O);
        this.f21919R = (Object[][]) Array.newInstance(Object.class, new int[]{this.f21915N.size(), this.f21916O.size()});
        mo30963h();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(@C5952h Object obj) {
        V[][] vArr;
        for (V[] vArr2 : this.f21919R) {
            for (V a : vArr[r3]) {
                if (C5827t.m25562a(obj, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public C8257x2<C> mo30962g() {
        return this.f21916O;
    }

    /* renamed from: h */
    public void mo30963h() {
        for (V[] fill : this.f21919R) {
            Arrays.fill(fill, null);
        }
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public C8257x2<R> mo30964i() {
        return this.f21915N;
    }

    public boolean isEmpty() {
        return false;
    }

    /* renamed from: j */
    public boolean mo29723j(@C5952h Object obj) {
        return this.f21917P.containsKey(obj);
    }

    /* renamed from: k */
    public Map<C, V> mo29724k(R r) {
        C7397x.m35664a(r);
        Integer num = (Integer) this.f21917P.get(r);
        return num == null ? C8302z2.m39630i() : new C8121e(num.intValue());
    }

    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f21915N.size() * this.f21916O.size();
    }

    /* renamed from: t */
    public Set<C7678a<R, C, V>> mo29727t() {
        return super.mo29727t();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: v */
    public Map<R, Map<C, V>> mo29650v() {
        C8122f fVar = this.f21921T;
        if (fVar != null) {
            return fVar;
        }
        C8122f fVar2 = new C8122f<>(this, null);
        this.f21921T = fVar2;
        return fVar2;
    }

    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: w */
    public Map<C, Map<R, V>> mo29730w() {
        C8120d dVar = this.f21920S;
        if (dVar != null) {
            return dVar;
        }
        C8120d dVar2 = new C8120d<>(this, null);
        this.f21920S = dVar2;
        return dVar2;
    }

    /* renamed from: a */
    public static <R, C, V> C8112r<R, C, V> m38851a(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new C8112r<>(iterable, iterable2);
    }

    /* renamed from: b */
    public static <R, C, V> C8112r<R, C, V> m38854b(C7677d6<R, C, V> d6Var) {
        return d6Var instanceof C8112r ? new C8112r<>((C8112r) d6Var) : new C8112r<>(d6Var);
    }

    /* renamed from: d */
    public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
        return mo29723j(obj) && mo29720h(obj2);
    }

    /* renamed from: i */
    public Map<R, V> mo29721i(C c) {
        C7397x.m35664a(c);
        Integer num = (Integer) this.f21918Q.get(c);
        return num == null ? C8302z2.m39630i() : new C8119c(num.intValue());
    }

    /* renamed from: u */
    public C7859g3<C> m38876u() {
        return this.f21918Q.keySet();
    }

    /* renamed from: x */
    public C7859g3<R> m38880x() {
        return this.f21917P.keySet();
    }

    /* renamed from: a */
    private static <E> C8302z2<E, Integer> m38853a(List<E> list) {
        C8303a g = C8302z2.m39628g();
        for (int i = 0; i < list.size(); i++) {
            g.mo30687a(list.get(i), Integer.valueOf(i));
        }
        return g.mo30690a();
    }

    /* renamed from: b */
    public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
        Integer num = (Integer) this.f21917P.get(obj);
        Integer num2 = (Integer) this.f21918Q.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return mo30958a(num.intValue(), num2.intValue());
    }

    /* renamed from: h */
    public boolean mo29720h(@C5952h Object obj) {
        return this.f21918Q.containsKey(obj);
    }

    /* renamed from: a */
    public V mo30958a(int i, int i2) {
        C7397x.m35663a(i, this.f21915N.size());
        C7397x.m35663a(i2, this.f21916O.size());
        return this.f21919R[i][i2];
    }

    /* renamed from: a */
    public V mo30959a(int i, int i2, @C5952h V v) {
        C7397x.m35663a(i, this.f21915N.size());
        C7397x.m35663a(i2, this.f21916O.size());
        V[][] vArr = this.f21919R;
        V v2 = vArr[i][i2];
        vArr[i][i2] = v;
        return v2;
    }

    private C8112r(C7677d6<R, C, V> d6Var) {
        this(d6Var.mo29651x(), d6Var.mo29728u());
        mo29989a(d6Var);
    }

    private C8112r(C8112r<R, C, V> rVar) {
        this.f21915N = rVar.f21915N;
        this.f21916O = rVar.f21916O;
        this.f21917P = rVar.f21917P;
        this.f21918Q = rVar.f21918Q;
        V[][] vArr = (Object[][]) Array.newInstance(Object.class, new int[]{this.f21915N.size(), this.f21916O.size()});
        this.f21919R = vArr;
        mo30963h();
        for (int i = 0; i < this.f21915N.size(); i++) {
            V[][] vArr2 = rVar.f21919R;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
    }

    @C2777c("reflection")
    /* renamed from: a */
    public V[][] mo30961a(Class<V> cls) {
        V[][] vArr = (Object[][]) Array.newInstance(cls, new int[]{this.f21915N.size(), this.f21916O.size()});
        for (int i = 0; i < this.f21915N.size(); i++) {
            V[][] vArr2 = this.f21919R;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
        return vArr;
    }

    /* renamed from: a */
    public V mo29713a(R r, C c, @C5952h V v) {
        C7397x.m35664a(r);
        C7397x.m35664a(c);
        Integer num = (Integer) this.f21917P.get(r);
        C7397x.m35672a(num != null, "Row %s not in %s", r, this.f21915N);
        Integer num2 = (Integer) this.f21918Q.get(c);
        C7397x.m35672a(num2 != null, "Column %s not in %s", c, this.f21916O);
        return mo30959a(num.intValue(), num2.intValue(), v);
    }

    /* renamed from: a */
    public void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        super.mo29989a(d6Var);
    }

    /* renamed from: a */
    public V mo30960a(@C5952h Object obj, @C5952h Object obj2) {
        Integer num = (Integer) this.f21917P.get(obj);
        Integer num2 = (Integer) this.f21918Q.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return mo30959a(num.intValue(), num2.intValue(), (V) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Iterator<C7678a<R, C, V>> mo29714a() {
        return new C8113a(size());
    }
}
