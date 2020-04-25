package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import com.google.common.collect.C7859g3.C7860a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.p3 */
/* compiled from: ImmutableTable */
public abstract class C8094p3<R, C, V> extends C8074o<R, C, V> {

    /* renamed from: N */
    private static final C8094p3<Object, Object, Object> f21894N = new C8328z5(C8257x2.m39412m(), C7859g3.m37512m(), C7859g3.m37512m());

    /* renamed from: com.google.common.collect.p3$a */
    /* compiled from: ImmutableTable */
    public static final class C8095a<R, C, V> {

        /* renamed from: a */
        private final List<C7678a<R, C, V>> f21895a = C8309z3.m39648a();

        /* renamed from: b */
        private Comparator<? super R> f21896b;

        /* renamed from: c */
        private Comparator<? super C> f21897c;

        /* renamed from: a */
        public C8095a<R, C, V> mo30939a(Comparator<? super C> comparator) {
            this.f21897c = (Comparator) C7397x.m35664a(comparator);
            return this;
        }

        /* renamed from: b */
        public C8095a<R, C, V> mo30941b(Comparator<? super R> comparator) {
            this.f21896b = (Comparator) C7397x.m35664a(comparator);
            return this;
        }

        /* renamed from: a */
        public C8095a<R, C, V> mo30938a(R r, C c, V v) {
            this.f21895a.add(C8094p3.m38754b(r, c, v));
            return this;
        }

        /* renamed from: a */
        public C8095a<R, C, V> mo30936a(C7678a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof C7774c) {
                C7397x.m35664a(aVar.mo29993d());
                C7397x.m35664a(aVar.mo29992a());
                C7397x.m35664a(aVar.getValue());
                this.f21895a.add(aVar);
            } else {
                mo30938a(aVar.mo29993d(), aVar.mo29992a(), aVar.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public C8095a<R, C, V> mo30937a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
            for (C7678a a : d6Var.mo29727t()) {
                mo30936a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C8094p3<R, C, V> mo30940a() {
            int size = this.f21895a.size();
            if (size == 0) {
                return C8094p3.m38758h();
            }
            if (size != 1) {
                return C7868g5.m37576a(this.f21895a, this.f21896b, this.f21897c);
            }
            return new C8110q5((C7678a) C8145s3.m39040f(this.f21895a));
        }
    }

    C8094p3() {
    }

    /* renamed from: c */
    public static <R, C, V> C8094p3<R, C, V> m38756c(R r, C c, V v) {
        return new C8110q5(r, c, v);
    }

    /* renamed from: g */
    public static <R, C, V> C8095a<R, C, V> m38757g() {
        return new C8095a<>();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo29715b(Object obj, Object obj2) {
        return super.mo29715b(obj, obj2);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(@C5952h Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract C7859g3<C7678a<R, C, V>> m38765d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract C8175t2<V> m38768e();

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<V> mo30888f() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo29720h(Object obj) {
        return super.mo29720h(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo29723j(Object obj) {
        return super.mo29723j(obj);
    }

    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: v */
    public abstract C8302z2<R, Map<C, V>> m38781v();

    /* renamed from: w */
    public abstract C8302z2<C, Map<R, V>> m38783w();

    /* renamed from: b */
    public static <R, C, V> C8094p3<R, C, V> m38755b(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        if (d6Var instanceof C8094p3) {
            return (C8094p3) d6Var;
        }
        int size = d6Var.size();
        if (size == 0) {
            return m38758h();
        }
        if (size != 1) {
            C7860a l = C7859g3.m37511l();
            for (C7678a aVar : d6Var.mo29727t()) {
                l.m37521a(m38754b(aVar.mo29993d(), aVar.mo29992a(), aVar.getValue()));
            }
            return C7868g5.m37574a((Iterable<C7678a<R, C, V>>) l.m37524a());
        }
        C7678a aVar2 = (C7678a) C8145s3.m39040f(d6Var.mo29727t());
        return m38756c(aVar2.mo29993d(), aVar2.mo29992a(), aVar2.getValue());
    }

    /* renamed from: h */
    public static <R, C, V> C8094p3<R, C, V> m38758h() {
        return f21894N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C8023l6<C7678a<R, C, V>> m38761a() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: d */
    public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
        return mo29715b(obj, obj2) != null;
    }

    /* renamed from: i */
    public C8302z2<R, V> m38772i(C c) {
        C7397x.m35664a(c);
        return (C8302z2) C5827t.m25564b((C8302z2) m38783w().get(c), C8302z2.m39630i());
    }

    /* renamed from: k */
    public C8302z2<C, V> m38775k(R r) {
        C7397x.m35664a(r);
        return (C8302z2) C5827t.m25564b((C8302z2) m38781v().get(r), C8302z2.m39630i());
    }

    /* renamed from: t */
    public C7859g3<C7678a<R, C, V>> m38777t() {
        return (C7859g3) super.mo29727t();
    }

    /* renamed from: u */
    public C7859g3<C> m38779u() {
        return m38783w().keySet();
    }

    public C8175t2<V> values() {
        return (C8175t2) super.values();
    }

    /* renamed from: x */
    public C7859g3<R> m38785x() {
        return m38781v().keySet();
    }

    @Deprecated
    /* renamed from: a */
    public final V mo29713a(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    static <R, C, V> C7678a<R, C, V> m38754b(R r, C c, V v) {
        return C7771e6.m37137a(C7397x.m35664a(r), C7397x.m35664a(c), C7397x.m35664a(v));
    }
}
