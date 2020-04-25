package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.h0 */
/* compiled from: Suppliers */
public final class C7346h0 {

    @C2778d
    /* renamed from: com.google.common.base.h0$a */
    /* compiled from: Suppliers */
    static class C7347a<T> implements C7344g0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        volatile transient T f20804N;

        /* renamed from: O */
        volatile transient long f20805O;

        /* renamed from: a */
        final C7344g0<T> f20806a;

        /* renamed from: b */
        final long f20807b;

        C7347a(C7344g0<T> g0Var, long j, TimeUnit timeUnit) {
            this.f20806a = (C7344g0) C7397x.m35664a(g0Var);
            this.f20807b = timeUnit.toNanos(j);
            C7397x.m35670a(j > 0);
        }

        public T get() {
            long j = this.f20805O;
            long a = C7396w.m35660a();
            if (j == 0 || a - j >= 0) {
                synchronized (this) {
                    if (j == this.f20805O) {
                        T t = this.f20806a.get();
                        this.f20804N = t;
                        long j2 = a + this.f20807b;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.f20805O = j2;
                        return t;
                    }
                }
            }
            return this.f20804N;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(this.f20806a);
            sb.append(", ");
            sb.append(this.f20807b);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    @C2778d
    /* renamed from: com.google.common.base.h0$b */
    /* compiled from: Suppliers */
    static class C7348b<T> implements C7344g0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        transient T f20808N;

        /* renamed from: a */
        final C7344g0<T> f20809a;

        /* renamed from: b */
        volatile transient boolean f20810b;

        C7348b(C7344g0<T> g0Var) {
            this.f20809a = g0Var;
        }

        public T get() {
            if (!this.f20810b) {
                synchronized (this) {
                    if (!this.f20810b) {
                        T t = this.f20809a.get();
                        this.f20808N = t;
                        this.f20810b = true;
                        return t;
                    }
                }
            }
            return this.f20808N;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            sb.append(this.f20809a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.h0$c */
    /* compiled from: Suppliers */
    private static class C7349c<F, T> implements C7344g0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C7380p<? super F, T> f20811a;

        /* renamed from: b */
        final C7344g0<F> f20812b;

        C7349c(C7380p<? super F, T> pVar, C7344g0<F> g0Var) {
            this.f20811a = pVar;
            this.f20812b = g0Var;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7349c)) {
                return false;
            }
            C7349c cVar = (C7349c) obj;
            if (!this.f20811a.equals(cVar.f20811a) || !this.f20812b.equals(cVar.f20812b)) {
                return false;
            }
            return true;
        }

        public T get() {
            return this.f20811a.apply(this.f20812b.get());
        }

        public int hashCode() {
            return C5827t.m25558a(this.f20811a, this.f20812b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.compose(");
            sb.append(this.f20811a);
            sb.append(", ");
            sb.append(this.f20812b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.h0$d */
    /* compiled from: Suppliers */
    private interface C7350d<T> extends C7380p<C7344g0<T>, T> {
    }

    /* renamed from: com.google.common.base.h0$e */
    /* compiled from: Suppliers */
    private enum C7351e implements C7350d<Object> {
        INSTANCE;

        /* renamed from: a */
        public Object apply(C7344g0<Object> g0Var) {
            return g0Var.get();
        }

        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* renamed from: com.google.common.base.h0$f */
    /* compiled from: Suppliers */
    private static class C7352f<T> implements C7344g0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final T f20813a;

        C7352f(@C5952h T t) {
            this.f20813a = t;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7352f)) {
                return false;
            }
            return C5827t.m25562a(this.f20813a, ((C7352f) obj).f20813a);
        }

        public T get() {
            return this.f20813a;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f20813a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.ofInstance(");
            sb.append(this.f20813a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.h0$g */
    /* compiled from: Suppliers */
    private static class C7353g<T> implements C7344g0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C7344g0<T> f20814a;

        C7353g(C7344g0<T> g0Var) {
            this.f20814a = g0Var;
        }

        public T get() {
            T t;
            synchronized (this.f20814a) {
                t = this.f20814a.get();
            }
            return t;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(this.f20814a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C7346h0() {
    }

    /* renamed from: a */
    public static <F, T> C7344g0<T> m35567a(C7380p<? super F, T> pVar, C7344g0<F> g0Var) {
        C7397x.m35664a(pVar);
        C7397x.m35664a(g0Var);
        return new C7349c(pVar, g0Var);
    }

    /* renamed from: b */
    public static <T> C7344g0<T> m35570b(C7344g0<T> g0Var) {
        return new C7353g((C7344g0) C7397x.m35664a(g0Var));
    }

    /* renamed from: a */
    public static <T> C7344g0<T> m35565a(C7344g0<T> g0Var) {
        return g0Var instanceof C7348b ? g0Var : new C7348b((C7344g0) C7397x.m35664a(g0Var));
    }

    /* renamed from: a */
    public static <T> C7344g0<T> m35566a(C7344g0<T> g0Var, long j, TimeUnit timeUnit) {
        return new C7347a(g0Var, j, timeUnit);
    }

    /* renamed from: a */
    public static <T> C7344g0<T> m35568a(@C5952h T t) {
        return new C7352f(t);
    }

    @C2775a
    /* renamed from: a */
    public static <T> C7380p<C7344g0<T>, T> m35569a() {
        return C7351e.INSTANCE;
    }
}
