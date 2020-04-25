package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import org.apache.http.p549j0.C15430e;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.r */
/* compiled from: Functions */
public final class C7382r {

    /* renamed from: com.google.common.base.r$b */
    /* compiled from: Functions */
    private static class C7384b<E> implements C7380p<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final E f20841a;

        public C7384b(@C5952h E e) {
            this.f20841a = e;
        }

        public E apply(@C5952h Object obj) {
            return this.f20841a;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7384b)) {
                return false;
            }
            return C5827t.m25562a(this.f20841a, ((C7384b) obj).f20841a);
        }

        public int hashCode() {
            E e = this.f20841a;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("constant(");
            sb.append(this.f20841a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.r$c */
    /* compiled from: Functions */
    private static class C7385c<K, V> implements C7380p<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Map<K, ? extends V> f20842a;

        /* renamed from: b */
        final V f20843b;

        C7385c(Map<K, ? extends V> map, @C5952h V v) {
            this.f20842a = (Map) C7397x.m35664a(map);
            this.f20843b = v;
        }

        public V apply(@C5952h K k) {
            V v = this.f20842a.get(k);
            return (v != null || this.f20842a.containsKey(k)) ? v : this.f20843b;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7385c)) {
                return false;
            }
            C7385c cVar = (C7385c) obj;
            if (!this.f20842a.equals(cVar.f20842a) || !C5827t.m25562a(this.f20843b, cVar.f20843b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f20842a, this.f20843b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forMap(");
            sb.append(this.f20842a);
            sb.append(", defaultValue=");
            sb.append(this.f20843b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.r$d */
    /* compiled from: Functions */
    private static class C7386d<A, B, C> implements C7380p<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7380p<B, C> f20844a;

        /* renamed from: b */
        private final C7380p<A, ? extends B> f20845b;

        public C7386d(C7380p<B, C> pVar, C7380p<A, ? extends B> pVar2) {
            this.f20844a = (C7380p) C7397x.m35664a(pVar);
            this.f20845b = (C7380p) C7397x.m35664a(pVar2);
        }

        public C apply(@C5952h A a) {
            return this.f20844a.apply(this.f20845b.apply(a));
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7386d)) {
                return false;
            }
            C7386d dVar = (C7386d) obj;
            if (!this.f20845b.equals(dVar.f20845b) || !this.f20844a.equals(dVar.f20844a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f20845b.hashCode() ^ this.f20844a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20844a);
            sb.append("(");
            sb.append(this.f20845b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.r$e */
    /* compiled from: Functions */
    private static class C7387e<K, V> implements C7380p<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Map<K, V> f20846a;

        C7387e(Map<K, V> map) {
            this.f20846a = (Map) C7397x.m35664a(map);
        }

        public V apply(@C5952h K k) {
            V v = this.f20846a.get(k);
            C7397x.m35672a(v != null || this.f20846a.containsKey(k), "Key '%s' not present in map", k);
            return v;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7387e)) {
                return false;
            }
            return this.f20846a.equals(((C7387e) obj).f20846a);
        }

        public int hashCode() {
            return this.f20846a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forMap(");
            sb.append(this.f20846a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.r$f */
    /* compiled from: Functions */
    private enum C7388f implements C7380p<Object, Object> {
        INSTANCE;

        @C5952h
        public Object apply(@C5952h Object obj) {
            return obj;
        }

        public String toString() {
            return C15430e.f44592s;
        }
    }

    /* renamed from: com.google.common.base.r$g */
    /* compiled from: Functions */
    private static class C7389g<T> implements C7380p<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C5831y<T> f20847a;

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7389g)) {
                return false;
            }
            return this.f20847a.equals(((C7389g) obj).f20847a);
        }

        public int hashCode() {
            return this.f20847a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forPredicate(");
            sb.append(this.f20847a);
            sb.append(")");
            return sb.toString();
        }

        private C7389g(C5831y<T> yVar) {
            this.f20847a = (C5831y) C7397x.m35664a(yVar);
        }

        public Boolean apply(@C5952h T t) {
            return Boolean.valueOf(this.f20847a.apply(t));
        }
    }

    /* renamed from: com.google.common.base.r$h */
    /* compiled from: Functions */
    private static class C7390h<T> implements C7380p<Object, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7344g0<T> f20848a;

        public T apply(@C5952h Object obj) {
            return this.f20848a.get();
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7390h)) {
                return false;
            }
            return this.f20848a.equals(((C7390h) obj).f20848a);
        }

        public int hashCode() {
            return this.f20848a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forSupplier(");
            sb.append(this.f20848a);
            sb.append(")");
            return sb.toString();
        }

        private C7390h(C7344g0<T> g0Var) {
            this.f20848a = (C7344g0) C7397x.m35664a(g0Var);
        }
    }

    /* renamed from: com.google.common.base.r$i */
    /* compiled from: Functions */
    private enum C7391i implements C7380p<Object, String> {
        INSTANCE;

        public String toString() {
            return "toString";
        }

        public String apply(Object obj) {
            C7397x.m35664a(obj);
            return obj.toString();
        }
    }

    private C7382r() {
    }

    /* renamed from: a */
    public static <E> C7380p<E, E> m35635a() {
        return C7388f.INSTANCE;
    }

    /* renamed from: b */
    public static C7380p<Object, String> m35642b() {
        return C7391i.INSTANCE;
    }

    /* renamed from: a */
    public static <K, V> C7380p<K, V> m35640a(Map<K, V> map) {
        return new C7387e(map);
    }

    /* renamed from: a */
    public static <K, V> C7380p<K, V> m35641a(Map<K, ? extends V> map, @C5952h V v) {
        return new C7385c(map, v);
    }

    /* renamed from: a */
    public static <A, B, C> C7380p<A, C> m35637a(C7380p<B, C> pVar, C7380p<A, ? extends B> pVar2) {
        return new C7386d(pVar, pVar2);
    }

    /* renamed from: a */
    public static <T> C7380p<T, Boolean> m35638a(C5831y<T> yVar) {
        return new C7389g(yVar);
    }

    /* renamed from: a */
    public static <E> C7380p<Object, E> m35639a(@C5952h E e) {
        return new C7384b(e);
    }

    @C2775a
    /* renamed from: a */
    public static <T> C7380p<Object, T> m35636a(C7344g0<T> g0Var) {
        return new C7390h(g0Var);
    }
}
