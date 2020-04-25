package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.base.z */
/* compiled from: Predicates */
public final class C7398z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C5822s f20853a = C5822s.m25522a(',');

    /* renamed from: com.google.common.base.z$b */
    /* compiled from: Predicates */
    private static class C7400b<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends C5831y<? super T>> f20854a;

        public boolean apply(@C5952h T t) {
            for (int i = 0; i < this.f20854a.size(); i++) {
                if (!((C5831y) this.f20854a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7400b)) {
                return false;
            }
            return this.f20854a.equals(((C7400b) obj).f20854a);
        }

        public int hashCode() {
            return this.f20854a.hashCode() + 306654252;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.and(");
            sb.append(C7398z.f20853a.mo23119a((Iterable<?>) this.f20854a));
            sb.append(")");
            return sb.toString();
        }

        private C7400b(List<? extends C5831y<? super T>> list) {
            this.f20854a = list;
        }
    }

    @C2777c("Class.isAssignableFrom")
    /* renamed from: com.google.common.base.z$c */
    /* compiled from: Predicates */
    private static class C7401c implements C5831y<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Class<?> f20855a;

        /* renamed from: a */
        public boolean apply(Class<?> cls) {
            return this.f20855a.isAssignableFrom(cls);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7401c)) {
                return false;
            }
            if (this.f20855a == ((C7401c) obj).f20855a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f20855a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.assignableFrom(");
            sb.append(this.f20855a.getName());
            sb.append(")");
            return sb.toString();
        }

        private C7401c(Class<?> cls) {
            this.f20855a = (Class) C7397x.m35664a(cls);
        }
    }

    /* renamed from: com.google.common.base.z$d */
    /* compiled from: Predicates */
    private static class C7402d<A, B> implements C5831y<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C5831y<B> f20856a;

        /* renamed from: b */
        final C7380p<A, ? extends B> f20857b;

        public boolean apply(@C5952h A a) {
            return this.f20856a.apply(this.f20857b.apply(a));
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7402d)) {
                return false;
            }
            C7402d dVar = (C7402d) obj;
            if (!this.f20857b.equals(dVar.f20857b) || !this.f20856a.equals(dVar.f20856a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f20857b.hashCode() ^ this.f20856a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20856a.toString());
            sb.append("(");
            sb.append(this.f20857b.toString());
            sb.append(")");
            return sb.toString();
        }

        private C7402d(C5831y<B> yVar, C7380p<A, ? extends B> pVar) {
            this.f20856a = (C5831y) C7397x.m35664a(yVar);
            this.f20857b = (C7380p) C7397x.m35664a(pVar);
        }
    }

    @C2777c("Only used by other GWT-incompatible code.")
    /* renamed from: com.google.common.base.z$e */
    /* compiled from: Predicates */
    private static class C7403e extends C7404f {
        private static final long serialVersionUID = 0;

        C7403e(String str) {
            super(Pattern.compile(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.containsPattern(");
            sb.append(this.f20858a.pattern());
            sb.append(")");
            return sb.toString();
        }
    }

    @C2777c("Only used by other GWT-incompatible code.")
    /* renamed from: com.google.common.base.z$f */
    /* compiled from: Predicates */
    private static class C7404f implements C5831y<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Pattern f20858a;

        C7404f(Pattern pattern) {
            this.f20858a = (Pattern) C7397x.m35664a(pattern);
        }

        /* renamed from: a */
        public boolean apply(CharSequence charSequence) {
            return this.f20858a.matcher(charSequence).find();
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7404f)) {
                return false;
            }
            C7404f fVar = (C7404f) obj;
            if (!C5827t.m25562a(this.f20858a.pattern(), fVar.f20858a.pattern()) || !C5827t.m25562a(Integer.valueOf(this.f20858a.flags()), Integer.valueOf(fVar.f20858a.flags()))) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f20858a.pattern(), Integer.valueOf(this.f20858a.flags()));
        }

        public String toString() {
            String str = "pattern.flags";
            String bVar = C5827t.m25559a((Object) this.f20858a).mo23152a("pattern", (Object) this.f20858a.pattern()).mo23150a(str, this.f20858a.flags()).toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.contains(");
            sb.append(bVar);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.z$g */
    /* compiled from: Predicates */
    private static class C7405g<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Collection<?> f20859a;

        public boolean apply(@C5952h T t) {
            try {
                return this.f20859a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7405g)) {
                return false;
            }
            return this.f20859a.equals(((C7405g) obj).f20859a);
        }

        public int hashCode() {
            return this.f20859a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.in(");
            sb.append(this.f20859a);
            sb.append(")");
            return sb.toString();
        }

        private C7405g(Collection<?> collection) {
            this.f20859a = (Collection) C7397x.m35664a(collection);
        }
    }

    @C2777c("Class.isInstance")
    /* renamed from: com.google.common.base.z$h */
    /* compiled from: Predicates */
    private static class C7406h implements C5831y<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Class<?> f20860a;

        public boolean apply(@C5952h Object obj) {
            return this.f20860a.isInstance(obj);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7406h)) {
                return false;
            }
            if (this.f20860a == ((C7406h) obj).f20860a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f20860a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.instanceOf(");
            sb.append(this.f20860a.getName());
            sb.append(")");
            return sb.toString();
        }

        private C7406h(Class<?> cls) {
            this.f20860a = (Class) C7397x.m35664a(cls);
        }
    }

    /* renamed from: com.google.common.base.z$i */
    /* compiled from: Predicates */
    private static class C7407i<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final T f20861a;

        public boolean apply(T t) {
            return this.f20861a.equals(t);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7407i)) {
                return false;
            }
            return this.f20861a.equals(((C7407i) obj).f20861a);
        }

        public int hashCode() {
            return this.f20861a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.equalTo(");
            sb.append(this.f20861a);
            sb.append(")");
            return sb.toString();
        }

        private C7407i(T t) {
            this.f20861a = t;
        }
    }

    /* renamed from: com.google.common.base.z$j */
    /* compiled from: Predicates */
    private static class C7408j<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C5831y<T> f20862a;

        C7408j(C5831y<T> yVar) {
            this.f20862a = (C5831y) C7397x.m35664a(yVar);
        }

        public boolean apply(@C5952h T t) {
            return !this.f20862a.apply(t);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7408j)) {
                return false;
            }
            return this.f20862a.equals(((C7408j) obj).f20862a);
        }

        public int hashCode() {
            return this.f20862a.hashCode() ^ -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.not(");
            sb.append(this.f20862a.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.z$k */
    /* compiled from: Predicates */
    enum C7409k implements C5831y<Object> {
        ALWAYS_TRUE {
            public boolean apply(@C5952h Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(@C5952h Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(@C5952h Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(@C5952h Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public <T> C5831y<T> mo29310d() {
            return this;
        }
    }

    /* renamed from: com.google.common.base.z$l */
    /* compiled from: Predicates */
    private static class C7414l<T> implements C5831y<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends C5831y<? super T>> f20863a;

        public boolean apply(@C5952h T t) {
            for (int i = 0; i < this.f20863a.size(); i++) {
                if (((C5831y) this.f20863a.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7414l)) {
                return false;
            }
            return this.f20863a.equals(((C7414l) obj).f20863a);
        }

        public int hashCode() {
            return this.f20863a.hashCode() + 87855567;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.or(");
            sb.append(C7398z.f20853a.mo23119a((Iterable<?>) this.f20863a));
            sb.append(")");
            return sb.toString();
        }

        private C7414l(List<? extends C5831y<? super T>> list) {
            this.f20863a = list;
        }
    }

    private C7398z() {
    }

    @C2776b(serializable = true)
    /* renamed from: b */
    public static <T> C5831y<T> m35693b() {
        return C7409k.ALWAYS_FALSE.mo29310d();
    }

    @C2776b(serializable = true)
    /* renamed from: c */
    public static <T> C5831y<T> m35698c() {
        return C7409k.ALWAYS_TRUE.mo29310d();
    }

    @C2776b(serializable = true)
    /* renamed from: d */
    public static <T> C5831y<T> m35701d() {
        return C7409k.IS_NULL.mo29310d();
    }

    @C2776b(serializable = true)
    /* renamed from: e */
    public static <T> C5831y<T> m35702e() {
        return C7409k.NOT_NULL.mo29310d();
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35682a(C5831y<T> yVar) {
        return new C7408j(yVar);
    }

    /* renamed from: b */
    public static <T> C5831y<T> m35695b(C5831y<? super T>... yVarArr) {
        return new C7414l(m35692a((T[]) yVarArr));
    }

    /* renamed from: c */
    public static <T> C5831y<T> m35700c(Iterable<? extends C5831y<? super T>> iterable) {
        return new C7414l(m35697b(iterable));
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35686a(Iterable<? extends C5831y<? super T>> iterable) {
        return new C7400b(m35697b(iterable));
    }

    @C2777c("Class.isInstance")
    /* renamed from: b */
    public static C5831y<Object> m35694b(Class<?> cls) {
        return new C7406h(cls);
    }

    /* renamed from: c */
    public static <T> C5831y<T> m35699c(C5831y<? super T> yVar, C5831y<? super T> yVar2) {
        return new C7414l(m35696b((C5831y) C7397x.m35664a(yVar), (C5831y) C7397x.m35664a(yVar2)));
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35691a(C5831y<? super T>... yVarArr) {
        return new C7400b(m35692a((T[]) yVarArr));
    }

    /* renamed from: b */
    private static <T> List<C5831y<? super T>> m35696b(C5831y<? super T> yVar, C5831y<? super T> yVar2) {
        return Arrays.asList(new C5831y[]{yVar, yVar2});
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35684a(C5831y<? super T> yVar, C5831y<? super T> yVar2) {
        return new C7400b(m35696b((C5831y) C7397x.m35664a(yVar), (C5831y) C7397x.m35664a(yVar2)));
    }

    /* renamed from: b */
    static <T> List<T> m35697b(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T a : iterable) {
            arrayList.add(C7397x.m35664a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35687a(@C5952h T t) {
        return t == null ? m35701d() : new C7407i(t);
    }

    @C2777c("Class.isAssignableFrom")
    @C2775a
    /* renamed from: a */
    public static C5831y<Class<?>> m35685a(Class<?> cls) {
        return new C7401c(cls);
    }

    /* renamed from: a */
    public static <T> C5831y<T> m35689a(Collection<? extends T> collection) {
        return new C7405g(collection);
    }

    /* renamed from: a */
    public static <A, B> C5831y<A> m35683a(C5831y<B> yVar, C7380p<A, ? extends B> pVar) {
        return new C7402d(yVar, pVar);
    }

    @C2777c("java.util.regex.Pattern")
    /* renamed from: a */
    public static C5831y<CharSequence> m35688a(String str) {
        return new C7403e(str);
    }

    @C2777c("java.util.regex.Pattern")
    /* renamed from: a */
    public static C5831y<CharSequence> m35690a(Pattern pattern) {
        return new C7404f(pattern);
    }

    /* renamed from: a */
    private static <T> List<T> m35692a(T... tArr) {
        return m35697b((Iterable<T>) Arrays.asList(tArr));
    }
}
