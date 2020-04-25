package com.google.common.collect;

import com.google.common.base.C5831y;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.g1 */
/* compiled from: FilteredKeySetMultimap */
final class C7856g1<K, V> extends C7788f1<K, V> implements C7930j1<K, V> {

    /* renamed from: com.google.common.collect.g1$a */
    /* compiled from: FilteredKeySetMultimap */
    class C7857a extends C7791c implements Set<Entry<K, V>> {
        C7857a() {
            super();
        }

        public boolean equals(@C5952h Object obj) {
            return C8047m5.m38519a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C8047m5.m38502a((Set<?>) this);
        }
    }

    C7856g1(C8022l5<K, V> l5Var, C5831y<? super K> yVar) {
        super(l5Var, yVar);
    }

    /* renamed from: a */
    public Set<V> m37477a(K k, Iterable<? extends V> iterable) {
        return (Set) super.mo29698a(k, iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<Entry<K, V>> m37479d() {
        return new C7857a();
    }

    /* renamed from: e */
    public Set<V> m37481e(Object obj) {
        return (Set) super.mo29699e(obj);
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    /* renamed from: m */
    public Set<Entry<K, V>> m37483m() {
        return (Set) super.mo29704m();
    }

    /* renamed from: o */
    public C8022l5<K, V> m37485o() {
        return (C8022l5) this.f21483Q;
    }
}
