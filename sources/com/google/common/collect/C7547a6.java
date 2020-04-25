package com.google.common.collect;

import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.a6 */
/* compiled from: StandardRowSortedTable */
class C7547a6<R, C, V> extends C7580b6<R, C, V> implements C7960j5<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.a6$b */
    /* compiled from: StandardRowSortedTable */
    private class C7549b extends C7599h implements SortedMap<R, Map<C, V>> {
        private C7549b() {
            super();
        }

        public Comparator<? super R> comparator() {
            return C7547a6.this.mo30570i().comparator();
        }

        public R firstKey() {
            return C7547a6.this.mo30570i().firstKey();
        }

        public SortedMap<R, Map<C, V>> headMap(R r) {
            C7397x.m35664a(r);
            return new C7547a6(C7547a6.this.mo30570i().headMap(r), C7547a6.this.f21147O).mo29650v();
        }

        public R lastKey() {
            return C7547a6.this.mo30570i().lastKey();
        }

        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            C7397x.m35664a(r);
            C7397x.m35664a(r2);
            return new C7547a6(C7547a6.this.mo30570i().subMap(r, r2), C7547a6.this.f21147O).mo29650v();
        }

        public SortedMap<R, Map<C, V>> tailMap(R r) {
            C7397x.m35664a(r);
            return new C7547a6(C7547a6.this.mo30570i().tailMap(r), C7547a6.this.f21147O).mo29650v();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<R> m36249b() {
            return new C7845z(this);
        }

        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    C7547a6(SortedMap<R, Map<C, V>> sortedMap, C7344g0<? extends Map<C, V>> g0Var) {
        super(sortedMap, g0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public SortedMap<R, Map<C, V>> mo30570i() {
        return (SortedMap) this.f21146N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public SortedMap<R, Map<C, V>> m36243h() {
        return new C7549b();
    }

    /* renamed from: v */
    public SortedMap<R, Map<C, V>> m36245v() {
        return (SortedMap) super.mo29650v();
    }

    /* renamed from: x */
    public SortedSet<R> m36247x() {
        return (SortedSet) mo29650v().keySet();
    }
}
