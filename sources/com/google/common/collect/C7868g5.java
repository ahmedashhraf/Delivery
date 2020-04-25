package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7677d6.C7678a;
import com.google.common.collect.C7859g3.C7860a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.g5 */
/* compiled from: RegularImmutableTable */
abstract class C7868g5<R, C, V> extends C8094p3<R, C, V> {

    /* renamed from: com.google.common.collect.g5$a */
    /* compiled from: RegularImmutableTable */
    static class C7869a implements Comparator<C7678a<R, C, V>> {

        /* renamed from: a */
        final /* synthetic */ Comparator f21594a;

        /* renamed from: b */
        final /* synthetic */ Comparator f21595b;

        C7869a(Comparator comparator, Comparator comparator2) {
            this.f21594a = comparator;
            this.f21595b = comparator2;
        }

        /* renamed from: a */
        public int compare(C7678a<R, C, V> aVar, C7678a<R, C, V> aVar2) {
            Comparator comparator = this.f21594a;
            int i = 0;
            int compare = comparator == null ? 0 : comparator.compare(aVar.mo29993d(), aVar2.mo29993d());
            if (compare != 0) {
                return compare;
            }
            Comparator comparator2 = this.f21595b;
            if (comparator2 != null) {
                i = comparator2.compare(aVar.mo29992a(), aVar2.mo29992a());
            }
            return i;
        }
    }

    /* renamed from: com.google.common.collect.g5$b */
    /* compiled from: RegularImmutableTable */
    private final class C7870b extends C7859g3<C7678a<R, C, V>> {

        /* renamed from: com.google.common.collect.g5$b$a */
        /* compiled from: RegularImmutableTable */
        class C7871a extends C8106q2<C7678a<R, C, V>> {
            C7871a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: n */
            public C8175t2<C7678a<R, C, V>> mo29826n() {
                return C7870b.this;
            }

            public C7678a<R, C, V> get(int i) {
                return C7868g5.this.mo30512a(i);
            }
        }

        private C7870b() {
        }

        public boolean contains(@C5952h Object obj) {
            if (!(obj instanceof C7678a)) {
                return false;
            }
            C7678a aVar = (C7678a) obj;
            Object b = C7868g5.this.mo29715b(aVar.mo29993d(), aVar.mo29992a());
            if (b == null || !b.equals(aVar.getValue())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8257x2<C7678a<R, C, V>> mo29646f() {
            return new C7871a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return false;
        }

        public int size() {
            return C7868g5.this.size();
        }

        /* synthetic */ C7870b(C7868g5 g5Var, C7869a aVar) {
            this();
        }

        public C8023l6<C7678a<R, C, V>> iterator() {
            return mo30933e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.g5$c */
    /* compiled from: RegularImmutableTable */
    private final class C7872c extends C8257x2<V> {
        private C7872c() {
        }

        public V get(int i) {
            return C7868g5.this.mo30513b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo29686j() {
            return true;
        }

        public int size() {
            return C7868g5.this.size();
        }

        /* synthetic */ C7872c(C7868g5 g5Var, C7869a aVar) {
            this();
        }
    }

    C7868g5() {
    }

    /* renamed from: a */
    static <R, C, V> C7868g5<R, C, V> m37576a(List<C7678a<R, C, V>> list, @C5952h Comparator<? super R> comparator, @C5952h Comparator<? super C> comparator2) {
        C7397x.m35664a(list);
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new C7869a(comparator, comparator2));
        }
        return m37575a((Iterable<C7678a<R, C, V>>) list, comparator, comparator2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C7678a<R, C, V> mo30512a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract V mo30513b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C7859g3<C7678a<R, C, V>> m37580d() {
        return isEmpty() ? C7859g3.m37512m() : new C7870b(this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C8175t2<V> m37582e() {
        return isEmpty() ? C8257x2.m39412m() : new C7872c(this, null);
    }

    /* renamed from: a */
    static <R, C, V> C7868g5<R, C, V> m37574a(Iterable<C7678a<R, C, V>> iterable) {
        return m37575a(iterable, null, null);
    }

    /* renamed from: a */
    private static final <R, C, V> C7868g5<R, C, V> m37575a(Iterable<C7678a<R, C, V>> iterable, @C5952h Comparator<? super R> comparator, @C5952h Comparator<? super C> comparator2) {
        C7860a l = C7859g3.m37511l();
        C7860a l2 = C7859g3.m37511l();
        C8257x2 a = C8257x2.m39392a(iterable);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            C7678a aVar = (C7678a) it.next();
            l.m37521a(aVar.mo29993d());
            l2.m37521a(aVar.mo29992a());
        }
        C7859g3 a2 = l.m37524a();
        if (comparator != null) {
            ArrayList b = C8309z3.m39665b((Iterable<? extends E>) a2);
            Collections.sort(b, comparator);
            a2 = C7859g3.m37505a((Collection<? extends E>) b);
        }
        C7859g3 a3 = l2.m37524a();
        if (comparator2 != null) {
            ArrayList b2 = C8309z3.m39665b((Iterable<? extends E>) a3);
            Collections.sort(b2, comparator2);
            a3 = C7859g3.m37505a((Collection<? extends E>) b2);
        }
        return ((long) a.size()) > (((long) a2.size()) * ((long) a3.size())) / 2 ? new C7972k0(a, a2, a3) : new C8328z5(a, a2, a3);
    }
}
