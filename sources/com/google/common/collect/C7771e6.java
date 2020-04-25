package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.e6 */
/* compiled from: Tables */
public final class C7771e6 {

    /* renamed from: a */
    private static final C7380p<? extends Map<?, ?>, ? extends Map<?, ?>> f21459a = new C7772a();

    /* renamed from: com.google.common.collect.e6$a */
    /* compiled from: Tables */
    static class C7772a implements C7380p<Map<Object, Object>, Map<Object, Object>> {
        C7772a() {
        }

        /* renamed from: a */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* renamed from: com.google.common.collect.e6$b */
    /* compiled from: Tables */
    static abstract class C7773b<R, C, V> implements C7678a<R, C, V> {
        C7773b() {
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7678a)) {
                return false;
            }
            C7678a aVar = (C7678a) obj;
            if (!C5827t.m25562a(mo29993d(), aVar.mo29993d()) || !C5827t.m25562a(mo29992a(), aVar.mo29992a()) || !C5827t.m25562a(getValue(), aVar.getValue())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C5827t.m25558a(mo29993d(), mo29992a(), getValue());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(mo29993d());
            sb.append(",");
            sb.append(mo29992a());
            sb.append(")=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.e6$c */
    /* compiled from: Tables */
    static final class C7774c<R, C, V> extends C7773b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final V f21460N;

        /* renamed from: a */
        private final R f21461a;

        /* renamed from: b */
        private final C f21462b;

        C7774c(@C5952h R r, @C5952h C c, @C5952h V v) {
            this.f21461a = r;
            this.f21462b = c;
            this.f21460N = v;
        }

        /* renamed from: a */
        public C mo29992a() {
            return this.f21462b;
        }

        /* renamed from: d */
        public R mo29993d() {
            return this.f21461a;
        }

        public V getValue() {
            return this.f21460N;
        }
    }

    /* renamed from: com.google.common.collect.e6$d */
    /* compiled from: Tables */
    private static class C7775d<R, C, V1, V2> extends C8074o<R, C, V2> {

        /* renamed from: N */
        final C7677d6<R, C, V1> f21463N;

        /* renamed from: O */
        final C7380p<? super V1, V2> f21464O;

        /* renamed from: com.google.common.collect.e6$d$a */
        /* compiled from: Tables */
        class C7776a implements C7380p<C7678a<R, C, V1>, C7678a<R, C, V2>> {
            C7776a() {
            }

            /* renamed from: a */
            public C7678a<R, C, V2> apply(C7678a<R, C, V1> aVar) {
                return C7771e6.m37137a(aVar.mo29993d(), aVar.mo29992a(), C7775d.this.f21464O.apply(aVar.getValue()));
            }
        }

        /* renamed from: com.google.common.collect.e6$d$b */
        /* compiled from: Tables */
        class C7777b implements C7380p<Map<C, V1>, Map<C, V2>> {
            C7777b() {
            }

            /* renamed from: a */
            public Map<C, V2> apply(Map<C, V1> map) {
                return C7800f4.m37294a(map, C7775d.this.f21464O);
            }
        }

        /* renamed from: com.google.common.collect.e6$d$c */
        /* compiled from: Tables */
        class C7778c implements C7380p<Map<R, V1>, Map<R, V2>> {
            C7778c() {
            }

            /* renamed from: a */
            public Map<R, V2> apply(Map<R, V1> map) {
                return C7800f4.m37294a(map, C7775d.this.f21464O);
            }
        }

        C7775d(C7677d6<R, C, V1> d6Var, C7380p<? super V1, V2> pVar) {
            this.f21463N = (C7677d6) C7397x.m35664a(d6Var);
            this.f21464O = (C7380p) C7397x.m35664a(pVar);
        }

        /* renamed from: a */
        public V2 mo29713a(R r, C c, V2 v2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public V2 mo29715b(Object obj, Object obj2) {
            if (mo29718d(obj, obj2)) {
                return this.f21464O.apply(this.f21463N.mo29715b(obj, obj2));
            }
            return null;
        }

        public void clear() {
            this.f21463N.clear();
        }

        /* renamed from: d */
        public boolean mo29718d(Object obj, Object obj2) {
            return this.f21463N.mo29718d(obj, obj2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Collection<V2> mo30310e() {
            return C8292z.m39589a(this.f21463N.values(), this.f21464O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C7380p<C7678a<R, C, V1>, C7678a<R, C, V2>> mo30311g() {
            return new C7776a();
        }

        /* renamed from: i */
        public Map<R, V2> mo29721i(C c) {
            return C7800f4.m37294a(this.f21463N.mo29721i(c), this.f21464O);
        }

        /* renamed from: k */
        public Map<C, V2> mo29724k(R r) {
            return C7800f4.m37294a(this.f21463N.mo29724k(r), this.f21464O);
        }

        public V2 remove(Object obj, Object obj2) {
            if (mo29718d(obj, obj2)) {
                return this.f21464O.apply(this.f21463N.remove(obj, obj2));
            }
            return null;
        }

        public int size() {
            return this.f21463N.size();
        }

        /* renamed from: u */
        public Set<C> mo29728u() {
            return this.f21463N.mo29728u();
        }

        /* renamed from: v */
        public Map<R, Map<C, V2>> mo29650v() {
            return C7800f4.m37294a(this.f21463N.mo29650v(), (C7380p<? super V1, V2>) new C7777b<Object,V2>());
        }

        /* renamed from: w */
        public Map<C, Map<R, V2>> mo29730w() {
            return C7800f4.m37294a(this.f21463N.mo29730w(), (C7380p<? super V1, V2>) new C7778c<Object,V2>());
        }

        /* renamed from: x */
        public Set<R> mo29651x() {
            return this.f21463N.mo29651x();
        }

        /* renamed from: a */
        public void mo29989a(C7677d6<? extends R, ? extends C, ? extends V2> d6Var) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Iterator<C7678a<R, C, V2>> mo29714a() {
            return C8178t3.m39099a(this.f21463N.mo29727t().iterator(), mo30311g());
        }
    }

    /* renamed from: com.google.common.collect.e6$e */
    /* compiled from: Tables */
    private static class C7779e<C, R, V> extends C8074o<C, R, V> {

        /* renamed from: O */
        private static final C7380p<C7678a<?, ?, ?>, C7678a<?, ?, ?>> f21468O = new C7780a();

        /* renamed from: N */
        final C7677d6<R, C, V> f21469N;

        /* renamed from: com.google.common.collect.e6$e$a */
        /* compiled from: Tables */
        static class C7780a implements C7380p<C7678a<?, ?, ?>, C7678a<?, ?, ?>> {
            C7780a() {
            }

            /* renamed from: a */
            public C7678a<?, ?, ?> apply(C7678a<?, ?, ?> aVar) {
                return C7771e6.m37137a(aVar.mo29992a(), aVar.mo29993d(), aVar.getValue());
            }
        }

        C7779e(C7677d6<R, C, V> d6Var) {
            this.f21469N = (C7677d6) C7397x.m35664a(d6Var);
        }

        /* renamed from: a */
        public V mo29713a(C c, R r, V v) {
            return this.f21469N.mo29713a(r, c, v);
        }

        /* renamed from: b */
        public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
            return this.f21469N.mo29715b(obj2, obj);
        }

        public void clear() {
            this.f21469N.clear();
        }

        public boolean containsValue(@C5952h Object obj) {
            return this.f21469N.containsValue(obj);
        }

        /* renamed from: d */
        public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
            return this.f21469N.mo29718d(obj2, obj);
        }

        /* renamed from: h */
        public boolean mo29720h(@C5952h Object obj) {
            return this.f21469N.mo29723j(obj);
        }

        /* renamed from: i */
        public Map<C, V> mo29721i(R r) {
            return this.f21469N.mo29724k(r);
        }

        /* renamed from: j */
        public boolean mo29723j(@C5952h Object obj) {
            return this.f21469N.mo29720h(obj);
        }

        /* renamed from: k */
        public Map<R, V> mo29724k(C c) {
            return this.f21469N.mo29721i(c);
        }

        public V remove(@C5952h Object obj, @C5952h Object obj2) {
            return this.f21469N.remove(obj2, obj);
        }

        public int size() {
            return this.f21469N.size();
        }

        /* renamed from: u */
        public Set<R> mo29728u() {
            return this.f21469N.mo29651x();
        }

        /* renamed from: v */
        public Map<C, Map<R, V>> mo29650v() {
            return this.f21469N.mo29730w();
        }

        public Collection<V> values() {
            return this.f21469N.values();
        }

        /* renamed from: w */
        public Map<R, Map<C, V>> mo29730w() {
            return this.f21469N.mo29650v();
        }

        /* renamed from: x */
        public Set<C> mo29651x() {
            return this.f21469N.mo29728u();
        }

        /* renamed from: a */
        public void mo29989a(C7677d6<? extends C, ? extends R, ? extends V> d6Var) {
            this.f21469N.mo29989a(C7771e6.m37138a(d6Var));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Iterator<C7678a<C, R, V>> mo29714a() {
            return C8178t3.m39099a(this.f21469N.mo29727t().iterator(), f21468O);
        }
    }

    /* renamed from: com.google.common.collect.e6$f */
    /* compiled from: Tables */
    static final class C7781f<R, C, V> extends C7782g<R, C, V> implements C7960j5<R, C, V> {
        private static final long serialVersionUID = 0;

        public C7781f(C7960j5<R, ? extends C, ? extends V> j5Var) {
            super(j5Var);
        }

        /* renamed from: v */
        public SortedMap<R, Map<C, V>> m37179v() {
            return Collections.unmodifiableSortedMap(C7800f4.m37300a(m37184y().mo29650v(), C7771e6.m37143b()));
        }

        /* renamed from: x */
        public SortedSet<R> m37181x() {
            return Collections.unmodifiableSortedSet(m37184y().mo29651x());
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7960j5<R, C, V> m37183y() {
            return (C7960j5) super.m37195y();
        }
    }

    /* renamed from: com.google.common.collect.e6$g */
    /* compiled from: Tables */
    private static class C7782g<R, C, V> extends C7881h2<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C7677d6<? extends R, ? extends C, ? extends V> f21470a;

        C7782g(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
            this.f21470a = (C7677d6) C7397x.m35664a(d6Var);
        }

        /* renamed from: a */
        public V mo29713a(@C5952h R r, @C5952h C c, @C5952h V v) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public Map<R, V> mo29721i(@C5952h C c) {
            return Collections.unmodifiableMap(super.mo29721i(c));
        }

        /* renamed from: k */
        public Map<C, V> mo29724k(@C5952h R r) {
            return Collections.unmodifiableMap(super.mo29724k(r));
        }

        public V remove(@C5952h Object obj, @C5952h Object obj2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: t */
        public Set<C7678a<R, C, V>> mo29727t() {
            return Collections.unmodifiableSet(super.mo29727t());
        }

        /* renamed from: u */
        public Set<C> mo29728u() {
            return Collections.unmodifiableSet(super.mo29728u());
        }

        /* renamed from: v */
        public Map<R, Map<C, V>> mo29650v() {
            return Collections.unmodifiableMap(C7800f4.m37294a(super.mo29650v(), C7771e6.m37143b()));
        }

        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        /* renamed from: w */
        public Map<C, Map<R, V>> mo29730w() {
            return Collections.unmodifiableMap(C7800f4.m37294a(super.mo29730w(), C7771e6.m37143b()));
        }

        /* renamed from: x */
        public Set<R> mo29651x() {
            return Collections.unmodifiableSet(super.mo29651x());
        }

        /* renamed from: a */
        public void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C7677d6<R, C, V> m37195y() {
            return this.f21470a;
        }
    }

    private C7771e6() {
    }

    /* renamed from: b */
    public static <R, C, V> C7677d6<R, C, V> m37144b(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        return new C7782g(d6Var);
    }

    /* renamed from: a */
    public static <R, C, V> C7678a<R, C, V> m37137a(@C5952h R r, @C5952h C c, @C5952h V v) {
        return new C7774c(r, c, v);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, V> C7380p<Map<K, V>, Map<K, V>> m37143b() {
        return f21459a;
    }

    /* renamed from: a */
    public static <R, C, V> C7677d6<C, R, V> m37138a(C7677d6<R, C, V> d6Var) {
        return d6Var instanceof C7779e ? ((C7779e) d6Var).f21469N : new C7779e(d6Var);
    }

    @C2775a
    /* renamed from: a */
    public static <R, C, V> C7677d6<R, C, V> m37140a(Map<R, Map<C, V>> map, C7344g0<? extends Map<C, V>> g0Var) {
        C7397x.m35670a(map.isEmpty());
        C7397x.m35664a(g0Var);
        return new C7580b6(map, g0Var);
    }

    @C2775a
    /* renamed from: a */
    public static <R, C, V1, V2> C7677d6<R, C, V2> m37139a(C7677d6<R, C, V1> d6Var, C7380p<? super V1, V2> pVar) {
        return new C7775d(d6Var, pVar);
    }

    @C2775a
    /* renamed from: a */
    public static <R, C, V> C7960j5<R, C, V> m37141a(C7960j5<R, ? extends C, ? extends V> j5Var) {
        return new C7781f(j5Var);
    }

    /* renamed from: a */
    static boolean m37142a(C7677d6<?, ?, ?> d6Var, @C5952h Object obj) {
        if (obj == d6Var) {
            return true;
        }
        if (!(obj instanceof C7677d6)) {
            return false;
        }
        return d6Var.mo29727t().equals(((C7677d6) obj).mo29727t());
    }
}
