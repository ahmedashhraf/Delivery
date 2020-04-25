package com.google.common.collect;

import com.google.common.base.C5831y;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.d1 */
/* compiled from: FilteredEntrySetMultimap */
final class C7654d1<K, V> extends C7607c1<K, V> implements C7930j1<K, V> {
    C7654d1(C8022l5<K, V> l5Var, C5831y<? super Entry<K, V>> yVar) {
        super(l5Var, yVar);
    }

    /* renamed from: a */
    public Set<V> m36591a(K k, Iterable<? extends V> iterable) {
        return (Set) super.mo29698a(k, iterable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<Entry<K, V>> m36593d() {
        return C8047m5.m38515a(mo29810o().mo29704m(), mo29811p());
    }

    /* renamed from: e */
    public Set<V> m36595e(Object obj) {
        return (Set) super.mo29699e(obj);
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    /* renamed from: m */
    public Set<Entry<K, V>> m36597m() {
        return (Set) super.mo29704m();
    }

    /* renamed from: o */
    public C8022l5<K, V> m36599o() {
        return (C8022l5) this.f21189Q;
    }
}
