package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.g2 */
/* compiled from: ForwardingSortedSetMultimap */
public abstract class C7858g2<K, V> extends C7617c2<K, V> implements C8291y5<K, V> {
    protected C7858g2() {
    }

    /* renamed from: q */
    public Comparator<? super V> mo29707q() {
        return m37496y().mo29707q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C8291y5<K, V> m37495y();

    /* renamed from: a */
    public SortedSet<V> m37488a(K k, Iterable<? extends V> iterable) {
        return m37496y().mo29698a(k, iterable);
    }

    /* renamed from: e */
    public SortedSet<V> m37491e(@C5952h Object obj) {
        return m37496y().mo29699e(obj);
    }

    public SortedSet<V> get(@C5952h K k) {
        return m37496y().get(k);
    }
}
