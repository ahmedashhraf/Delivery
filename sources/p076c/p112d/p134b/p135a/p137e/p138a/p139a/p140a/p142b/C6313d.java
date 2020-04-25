package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.io.Serializable;
import java.util.Iterator;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5952h;

@C2715a
@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.d */
/* compiled from: Converter */
public abstract class C6313d<A, B> implements C6324f<A, B> {

    /* renamed from: a */
    private final boolean f17682a;

    /* renamed from: b */
    private transient C6313d<B, A> f17683b;

    /* renamed from: c.d.b.a.e.a.a.a.b.d$a */
    /* compiled from: Converter */
    class C6314a implements Iterable<B> {

        /* renamed from: a */
        final /* synthetic */ Iterable f17684a;

        /* renamed from: c.d.b.a.e.a.a.a.b.d$a$a */
        /* compiled from: Converter */
        class C6315a implements Iterator<B> {

            /* renamed from: a */
            private final Iterator<? extends A> f17686a = C6314a.this.f17684a.iterator();

            C6315a() {
            }

            public boolean hasNext() {
                return this.f17686a.hasNext();
            }

            public B next() {
                return C6313d.this.mo25601a(this.f17686a.next());
            }

            public void remove() {
                this.f17686a.remove();
            }
        }

        C6314a(Iterable iterable) {
            this.f17684a = iterable;
        }

        public Iterator<B> iterator() {
            return new C6315a();
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.d$b */
    /* compiled from: Converter */
    private static final class C6316b<A, B, C> extends C6313d<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final C6313d<A, B> f17688N;

        /* renamed from: O */
        final C6313d<B, C> f17689O;

        C6316b(C6313d<A, B> dVar, C6313d<B, C> dVar2) {
            this.f17688N = dVar;
            this.f17689O = dVar2;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public A mo25603b(@C5952h C c) {
            return this.f17688N.mo25603b(this.f17689O.mo25603b(c));
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: c */
        public C mo25604c(@C5952h A a) {
            return this.f17689O.mo25604c(this.f17688N.mo25604c(a));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo25605d(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C mo25606e(A a) {
            throw new AssertionError();
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6316b)) {
                return false;
            }
            C6316b bVar = (C6316b) obj;
            if (!this.f17688N.equals(bVar.f17688N) || !this.f17689O.equals(bVar.f17689O)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f17688N.hashCode() * 31) + this.f17689O.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17688N);
            sb.append(".andThen(");
            sb.append(this.f17689O);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.d$c */
    /* compiled from: Converter */
    private static final class C6317c<A, B> extends C6313d<A, B> implements Serializable {

        /* renamed from: N */
        private final C6324f<? super A, ? extends B> f17690N;

        /* renamed from: O */
        private final C6324f<? super B, ? extends A> f17691O;

        /* synthetic */ C6317c(C6324f fVar, C6324f fVar2, C6314a aVar) {
            this(fVar, fVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo25605d(B b) {
            return this.f17691O.apply(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public B mo25606e(A a) {
            return this.f17690N.apply(a);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6317c)) {
                return false;
            }
            C6317c cVar = (C6317c) obj;
            if (!this.f17690N.equals(cVar.f17690N) || !this.f17691O.equals(cVar.f17691O)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f17690N.hashCode() * 31) + this.f17691O.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Converter.from(");
            sb.append(this.f17690N);
            sb.append(", ");
            sb.append(this.f17691O);
            sb.append(")");
            return sb.toString();
        }

        private C6317c(C6324f<? super A, ? extends B> fVar, C6324f<? super B, ? extends A> fVar2) {
            this.f17690N = (C6324f) C6329k.m29434a(fVar);
            this.f17691O = (C6324f) C6329k.m29434a(fVar2);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.d$d */
    /* compiled from: Converter */
    private static final class C6318d<T> extends C6313d<T, T> implements Serializable {

        /* renamed from: N */
        static final C6318d f17692N = new C6318d();
        private static final long serialVersionUID = 0;

        private C6318d() {
        }

        private Object readResolve() {
            return f17692N;
        }

        /* renamed from: a */
        public C6318d<T> m29397a() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public T mo25605d(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public T mo25606e(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }

        /* renamed from: a */
        public <S> C6313d<T, S> mo25599a(C6313d<T, S> dVar) {
            return (C6313d) C6329k.m29435a(dVar, (Object) "otherConverter");
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.d$e */
    /* compiled from: Converter */
    private static final class C6319e<A, B> extends C6313d<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final C6313d<A, B> f17693N;

        C6319e(C6313d<A, B> dVar) {
            this.f17693N = dVar;
        }

        /* renamed from: a */
        public C6313d<A, B> mo25598a() {
            return this.f17693N;
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: b */
        public B mo25603b(@C5952h A a) {
            return this.f17693N.mo25604c(a);
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: c */
        public A mo25604c(@C5952h B b) {
            return this.f17693N.mo25603b(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public B mo25605d(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public A mo25606e(B b) {
            throw new AssertionError();
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6319e)) {
                return false;
            }
            return this.f17693N.equals(((C6319e) obj).f17693N);
        }

        public int hashCode() {
            return this.f17693N.hashCode() ^ -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17693N);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    protected C6313d() {
        this(true);
    }

    /* renamed from: d */
    public static <T> C6313d<T, T> m29381d() {
        return C6318d.f17692N;
    }

    @C5952h
    /* renamed from: a */
    public final B mo25601a(@C5952h A a) {
        return mo25604c(a);
    }

    @C5952h
    @Deprecated
    public final B apply(@C5952h A a) {
        return mo25601a(a);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: b */
    public A mo25603b(@C5952h B b) {
        A a;
        if (!this.f17682a) {
            return mo25605d(b);
        }
        if (b == null) {
            a = null;
        } else {
            a = C6329k.m29434a(mo25605d(b));
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: c */
    public B mo25604c(@C5952h A a) {
        B b;
        if (!this.f17682a) {
            return mo25606e(a);
        }
        if (a == null) {
            b = null;
        } else {
            b = C6329k.m29434a(mo25606e(a));
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract A mo25605d(B b);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract B mo25606e(A a);

    public boolean equals(@C5952h Object obj) {
        return super.equals(obj);
    }

    C6313d(boolean z) {
        this.f17682a = z;
    }

    /* renamed from: a */
    public Iterable<B> mo25600a(Iterable<? extends A> iterable) {
        C6329k.m29435a(iterable, (Object) "fromIterable");
        return new C6314a(iterable);
    }

    /* renamed from: a */
    public C6313d<B, A> mo25598a() {
        C6313d<B, A> dVar = this.f17683b;
        if (dVar != null) {
            return dVar;
        }
        C6319e eVar = new C6319e(this);
        this.f17683b = eVar;
        return eVar;
    }

    /* renamed from: a */
    public <C> C6313d<A, C> mo25599a(C6313d<B, C> dVar) {
        return new C6316b(this, (C6313d) C6329k.m29434a(dVar));
    }

    /* renamed from: a */
    public static <A, B> C6313d<A, B> m29380a(C6324f<? super A, ? extends B> fVar, C6324f<? super B, ? extends A> fVar2) {
        return new C6317c(fVar, fVar2, null);
    }
}
