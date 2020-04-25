package com.google.common.collect;

import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
@C2775a
/* renamed from: com.google.common.collect.h6 */
/* compiled from: TreeBasedTable */
public class C7888h6<R, C, V> extends C7547a6<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: S */
    private final Comparator<? super C> f21613S;

    /* renamed from: com.google.common.collect.h6$a */
    /* compiled from: TreeBasedTable */
    class C7889a implements C7380p<Map<C, V>, Iterator<C>> {
        C7889a() {
        }

        /* renamed from: a */
        public Iterator<C> apply(Map<C, V> map) {
            return map.keySet().iterator();
        }
    }

    /* renamed from: com.google.common.collect.h6$b */
    /* compiled from: TreeBasedTable */
    class C7890b extends C7603c<C> {

        /* renamed from: N */
        C f21615N;

        /* renamed from: O */
        final /* synthetic */ Iterator f21616O;

        /* renamed from: P */
        final /* synthetic */ Comparator f21617P;

        C7890b(Iterator it, Comparator comparator) {
            this.f21616O = it;
            this.f21617P = comparator;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C mo29748b() {
            boolean z;
            while (this.f21616O.hasNext()) {
                C next = this.f21616O.next();
                C c = this.f21615N;
                if (c == null || this.f21617P.compare(next, c) != 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    this.f21615N = next;
                    return this.f21615N;
                }
            }
            this.f21615N = null;
            return mo29793c();
        }
    }

    /* renamed from: com.google.common.collect.h6$c */
    /* compiled from: TreeBasedTable */
    private static class C7891c<C, V> implements C7344g0<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super C> f21619a;

        C7891c(Comparator<? super C> comparator) {
            this.f21619a = comparator;
        }

        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f21619a);
        }
    }

    /* renamed from: com.google.common.collect.h6$d */
    /* compiled from: TreeBasedTable */
    private class C7892d extends C7595g implements SortedMap<C, V> {
        @C5952h

        /* renamed from: R */
        final C f21620R;
        @C5952h

        /* renamed from: S */
        final C f21621S;

        /* renamed from: T */
        transient SortedMap<C, V> f21622T;

        C7892d(C7888h6 h6Var, R r) {
            this(r, null, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo30574b(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        public Comparator<? super C> comparator() {
            return C7888h6.this.mo30570i();
        }

        public boolean containsKey(Object obj) {
            return mo30575b(obj) && super.containsKey(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo29773f() {
            if (mo30578g() != null && this.f21622T.isEmpty()) {
                C7888h6.this.f21146N.remove(this.f21173O);
                this.f21622T = null;
                this.f21174P = null;
            }
        }

        public C firstKey() {
            if (mo29771d() != null) {
                return mo29771d().firstKey();
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public SortedMap<C, V> mo30578g() {
            SortedMap<C, V> sortedMap = this.f21622T;
            if (sortedMap == null || (sortedMap.isEmpty() && C7888h6.this.f21146N.containsKey(this.f21173O))) {
                this.f21622T = (SortedMap) C7888h6.this.f21146N.get(this.f21173O);
            }
            return this.f21622T;
        }

        public SortedMap<C, V> headMap(C c) {
            C7397x.m35670a(mo30575b(C7397x.m35664a(c)));
            return new C7892d(this.f21173O, this.f21620R, c);
        }

        public C lastKey() {
            if (mo29771d() != null) {
                return mo29771d().lastKey();
            }
            throw new NoSuchElementException();
        }

        public V put(C c, V v) {
            C7397x.m35670a(mo30575b(C7397x.m35664a(c)));
            return super.put(c, v);
        }

        public SortedMap<C, V> subMap(C c, C c2) {
            C7397x.m35670a(mo30575b(C7397x.m35664a(c)) && mo30575b(C7397x.m35664a(c2)));
            return new C7892d(this.f21173O, c, c2);
        }

        public SortedMap<C, V> tailMap(C c) {
            C7397x.m35670a(mo30575b(C7397x.m35664a(c)));
            return new C7892d(this.f21173O, c, this.f21621S);
        }

        C7892d(R r, @C5952h C c, @C5952h C c2) {
            super(r);
            this.f21620R = c;
            this.f21621S = c2;
            C7397x.m35670a(c == null || c2 == null || mo30574b(c, c2) <= 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedMap<C, V> m37740d() {
            return (SortedMap) super.mo29771d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public SortedMap<C, V> m37742e() {
            SortedMap<C, V> g = mo30578g();
            if (g == null) {
                return null;
            }
            C c = this.f21620R;
            if (c != null) {
                g = g.tailMap(c);
            }
            C c2 = this.f21621S;
            if (c2 != null) {
                g = g.headMap(c2);
            }
            return g;
        }

        public SortedSet<C> keySet() {
            return new C7845z(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo30575b(@C5952h Object obj) {
            if (obj != null) {
                C c = this.f21620R;
                if (c == null || mo30574b(c, obj) <= 0) {
                    C c2 = this.f21621S;
                    if (c2 == null || mo30574b(c2, obj) > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    C7888h6(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new C7891c(comparator2));
        this.f21613S = comparator2;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo29713a(Object obj, Object obj2, Object obj3) {
        return super.mo29713a(obj, obj2, obj3);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo29715b(Object obj, Object obj2) {
        return super.mo29715b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo29718d(Object obj, Object obj2) {
        return super.mo29718d(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Iterator<C> mo29719g() {
        Comparator i = mo30570i();
        return new C7890b(C8178t3.m39088a(C8145s3.m39001a((Iterable<F>) this.f21146N.values(), (C7380p<? super F, ? extends T>) new C7889a<Object,Object>()), i), i);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo29720h(Object obj) {
        return super.mo29720h(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Map mo29721i(Object obj) {
        return super.mo29721i(obj);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo29723j(Object obj) {
        return super.mo29723j(obj);
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ Set mo29727t() {
        return super.mo29727t();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ Set mo29728u() {
        return super.mo29728u();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ Map mo29730w() {
        return super.mo29730w();
    }

    /* renamed from: k */
    public static <R extends Comparable, C extends Comparable, V> C7888h6<R, C, V> m37715k() {
        return new C7888h6<>(C8133r4.m38943j(), C8133r4.m38943j());
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo29989a(C7677d6 d6Var) {
        super.mo29989a(d6Var);
    }

    /* renamed from: i */
    public Comparator<? super C> mo30570i() {
        return this.f21613S;
    }

    /* renamed from: j */
    public Comparator<? super R> mo30571j() {
        return mo29651x().comparator();
    }

    /* renamed from: v */
    public SortedMap<R, Map<C, V>> m37731v() {
        return super.mo29650v();
    }

    /* renamed from: x */
    public SortedSet<R> m37734x() {
        return super.mo29651x();
    }

    /* renamed from: a */
    public static <R, C, V> C7888h6<R, C, V> m37714a(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        C7397x.m35664a(comparator);
        C7397x.m35664a(comparator2);
        return new C7888h6<>(comparator, comparator2);
    }

    /* renamed from: k */
    public SortedMap<C, V> m37727k(R r) {
        return new C7892d(this, r);
    }

    /* renamed from: a */
    public static <R, C, V> C7888h6<R, C, V> m37713a(C7888h6<R, C, ? extends V> h6Var) {
        C7888h6<R, C, V> h6Var2 = new C7888h6<>(h6Var.mo30571j(), h6Var.mo30570i());
        h6Var2.mo29989a((C7677d6) h6Var);
        return h6Var2;
    }
}
