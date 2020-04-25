package com.google.common.base;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.j */
/* compiled from: Equivalence */
public abstract class C7359j<T> {

    /* renamed from: com.google.common.base.j$b */
    /* compiled from: Equivalence */
    static final class C7361b extends C7359j<Object> implements Serializable {

        /* renamed from: a */
        static final C7361b f20818a = new C7361b();
        private static final long serialVersionUID = 1;

        C7361b() {
        }

        private Object readResolve() {
            return f20818a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo29251a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int mo29248a(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: com.google.common.base.j$c */
    /* compiled from: Equivalence */
    private static final class C7362c<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7359j<T> f20819a;
        @C5952h

        /* renamed from: b */
        private final T f20820b;

        C7362c(C7359j<T> jVar, @C5952h T t) {
            this.f20819a = (C7359j) C7397x.m35664a(jVar);
            this.f20820b = t;
        }

        public boolean apply(@C5952h T t) {
            return this.f20819a.mo29253b(t, this.f20820b);
        }

        public boolean equals(@C5952h Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7362c)) {
                return false;
            }
            C7362c cVar = (C7362c) obj;
            if (!this.f20819a.equals(cVar.f20819a) || !C5827t.m25562a(this.f20820b, cVar.f20820b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f20819a, this.f20820b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20819a);
            sb.append(".equivalentTo(");
            sb.append(this.f20820b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.j$d */
    /* compiled from: Equivalence */
    static final class C7363d extends C7359j<Object> implements Serializable {

        /* renamed from: a */
        static final C7363d f20821a = new C7363d();
        private static final long serialVersionUID = 1;

        C7363d() {
        }

        private Object readResolve() {
            return f20821a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo29248a(Object obj) {
            return System.identityHashCode(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo29251a(Object obj, Object obj2) {
            return false;
        }
    }

    /* renamed from: com.google.common.base.j$e */
    /* compiled from: Equivalence */
    public static final class C7364e<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C7359j<? super T> f20822a;
        @C5952h

        /* renamed from: b */
        private final T f20823b;

        @C5952h
        /* renamed from: a */
        public T mo29258a() {
            return this.f20823b;
        }

        public boolean equals(@C5952h Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C7364e) {
                C7364e eVar = (C7364e) obj;
                if (this.f20822a.equals(eVar.f20822a)) {
                    return this.f20822a.mo29253b(this.f20823b, eVar.f20823b);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f20822a.mo29254c(this.f20823b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20822a);
            sb.append(".wrap(");
            sb.append(this.f20823b);
            sb.append(")");
            return sb.toString();
        }

        private C7364e(C7359j<? super T> jVar, @C5952h T t) {
            this.f20822a = (C7359j) C7397x.m35664a(jVar);
            this.f20823b = t;
        }
    }

    protected C7359j() {
    }

    /* renamed from: e */
    public static C7359j<Object> m35592e() {
        return C7363d.f20821a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29248a(T t);

    /* renamed from: a */
    public final <F> C7359j<F> mo29250a(C7380p<F, ? extends T> pVar) {
        return new C7381q(pVar, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29251a(T t, T t2);

    /* renamed from: b */
    public final boolean mo29253b(@C5952h T t, @C5952h T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo29251a(t, t2);
    }

    /* renamed from: c */
    public final int mo29254c(@C5952h T t) {
        if (t == null) {
            return 0;
        }
        return mo29248a(t);
    }

    /* renamed from: d */
    public final <S extends T> C7364e<S> mo29255d(@C5952h S s) {
        return new C7364e<>(s);
    }

    /* renamed from: d */
    public static C7359j<Object> m35591d() {
        return C7361b.f20818a;
    }

    @C2776b(serializable = true)
    /* renamed from: a */
    public final <S extends T> C7359j<Iterable<S>> mo29249a() {
        return new C7395v(this);
    }

    @C2775a
    /* renamed from: b */
    public final C5831y<T> mo29252b(@C5952h T t) {
        return new C7362c(this, t);
    }
}
