package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.base.g */
/* compiled from: Converter */
public abstract class C7337g<A, B> implements C7380p<A, B> {

    /* renamed from: a */
    private final boolean f20791a;

    /* renamed from: b */
    private transient C7337g<B, A> f20792b;

    /* renamed from: com.google.common.base.g$a */
    /* compiled from: Converter */
    class C7338a implements Iterable<B> {

        /* renamed from: a */
        final /* synthetic */ Iterable f20793a;

        /* renamed from: com.google.common.base.g$a$a */
        /* compiled from: Converter */
        class C7339a implements Iterator<B> {

            /* renamed from: a */
            private final Iterator<? extends A> f20795a = C7338a.this.f20793a.iterator();

            C7339a() {
            }

            public boolean hasNext() {
                return this.f20795a.hasNext();
            }

            public B next() {
                return C7337g.this.mo29215a(this.f20795a.next());
            }

            public void remove() {
                this.f20795a.remove();
            }
        }

        C7338a(Iterable iterable) {
            this.f20793a = iterable;
        }

        public Iterator<B> iterator() {
            return new C7339a();
        }
    }

    /* renamed from: com.google.common.base.g$b */
    /* compiled from: Converter */
    private static final class C7340b<A, B, C> extends C7337g<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final C7337g<A, B> f20797N;

        /* renamed from: O */
        final C7337g<B, C> f20798O;

        C7340b(C7337g<A, B> gVar, C7337g<B, C> gVar2) {
            this.f20797N = gVar;
            this.f20798O = gVar2;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public A mo29217b(@C5952h C c) {
            return this.f20797N.mo29217b(this.f20798O.mo29217b(c));
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: e */
        public C mo29218e(@C5952h A a) {
            return this.f20798O.mo29218e(this.f20797N.mo29218e(a));
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7340b)) {
                return false;
            }
            C7340b bVar = (C7340b) obj;
            if (!this.f20797N.equals(bVar.f20797N) || !this.f20798O.equals(bVar.f20798O)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public A mo26637f(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C mo26638g(A a) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f20797N.hashCode() * 31) + this.f20798O.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20797N);
            sb.append(".andThen(");
            sb.append(this.f20798O);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.g$c */
    /* compiled from: Converter */
    private static final class C7341c<A, B> extends C7337g<A, B> implements Serializable {

        /* renamed from: N */
        private final C7380p<? super A, ? extends B> f20799N;

        /* renamed from: O */
        private final C7380p<? super B, ? extends A> f20800O;

        /* synthetic */ C7341c(C7380p pVar, C7380p pVar2, C7338a aVar) {
            this(pVar, pVar2);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7341c)) {
                return false;
            }
            C7341c cVar = (C7341c) obj;
            if (!this.f20799N.equals(cVar.f20799N) || !this.f20800O.equals(cVar.f20800O)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public A mo26637f(B b) {
            return this.f20800O.apply(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public B mo26638g(A a) {
            return this.f20799N.apply(a);
        }

        public int hashCode() {
            return (this.f20799N.hashCode() * 31) + this.f20800O.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Converter.from(");
            sb.append(this.f20799N);
            sb.append(", ");
            sb.append(this.f20800O);
            sb.append(")");
            return sb.toString();
        }

        private C7341c(C7380p<? super A, ? extends B> pVar, C7380p<? super B, ? extends A> pVar2) {
            this.f20799N = (C7380p) C7397x.m35664a(pVar);
            this.f20800O = (C7380p) C7397x.m35664a(pVar2);
        }
    }

    /* renamed from: com.google.common.base.g$d */
    /* compiled from: Converter */
    private static final class C7342d<T> extends C7337g<T, T> implements Serializable {

        /* renamed from: N */
        static final C7342d f20801N = new C7342d();
        private static final long serialVersionUID = 0;

        private C7342d() {
        }

        private Object readResolve() {
            return f20801N;
        }

        /* renamed from: a */
        public C7342d<T> m35554a() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public T mo26637f(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public T mo26638g(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }

        /* renamed from: a */
        public <S> C7337g<T, S> mo29214a(C7337g<T, S> gVar) {
            return (C7337g) C7397x.m35665a(gVar, (Object) "otherConverter");
        }
    }

    /* renamed from: com.google.common.base.g$e */
    /* compiled from: Converter */
    private static final class C7343e<A, B> extends C7337g<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final C7337g<A, B> f20802N;

        C7343e(C7337g<A, B> gVar) {
            this.f20802N = gVar;
        }

        /* renamed from: a */
        public C7337g<A, B> mo29213a() {
            return this.f20802N;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public B mo29217b(@C5952h A a) {
            return this.f20802N.mo29218e(a);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: e */
        public A mo29218e(@C5952h B b) {
            return this.f20802N.mo29217b(b);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7343e)) {
                return false;
            }
            return this.f20802N.equals(((C7343e) obj).f20802N);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public B mo26637f(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public A mo26638g(B b) {
            throw new AssertionError();
        }

        public int hashCode() {
            return this.f20802N.hashCode() ^ -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20802N);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    protected C7337g() {
        this(true);
    }

    /* renamed from: d */
    public static <T> C7337g<T, T> m35538d() {
        return C7342d.f20801N;
    }

    @C5952h
    /* renamed from: a */
    public final B mo29215a(@C5952h A a) {
        return mo29218e(a);
    }

    @C5952h
    @Deprecated
    public final B apply(@C5952h A a) {
        return mo29215a(a);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: b */
    public A mo29217b(@C5952h B b) {
        A a;
        if (!this.f20791a) {
            return mo26637f(b);
        }
        if (b == null) {
            a = null;
        } else {
            a = C7397x.m35664a(mo26637f(b));
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: e */
    public B mo29218e(@C5952h A a) {
        B b;
        if (!this.f20791a) {
            return mo26638g(a);
        }
        if (a == null) {
            b = null;
        } else {
            b = C7397x.m35664a(mo26638g(a));
        }
        return b;
    }

    public boolean equals(@C5952h Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract A mo26637f(B b);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract B mo26638g(A a);

    C7337g(boolean z) {
        this.f20791a = z;
    }

    /* renamed from: a */
    public C7337g<B, A> mo29213a() {
        C7337g<B, A> gVar = this.f20792b;
        if (gVar != null) {
            return gVar;
        }
        C7343e eVar = new C7343e(this);
        this.f20792b = eVar;
        return eVar;
    }

    /* renamed from: a */
    public <C> C7337g<A, C> mo29214a(C7337g<B, C> gVar) {
        return new C7340b(this, (C7337g) C7397x.m35664a(gVar));
    }

    /* renamed from: b */
    public Iterable<B> mo29216b(Iterable<? extends A> iterable) {
        C7397x.m35665a(iterable, (Object) "fromIterable");
        return new C7338a(iterable);
    }

    /* renamed from: a */
    public static <A, B> C7337g<A, B> m35537a(C7380p<? super A, ? extends B> pVar, C7380p<? super B, ? extends A> pVar2) {
        return new C7341c(pVar, pVar2, null);
    }
}
