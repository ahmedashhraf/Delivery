package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.d6 */
/* compiled from: Table */
public interface C7677d6<R, C, V> {

    /* renamed from: com.google.common.collect.d6$a */
    /* compiled from: Table */
    public interface C7678a<R, C, V> {
        /* renamed from: a */
        C mo29992a();

        /* renamed from: d */
        R mo29993d();

        boolean equals(@C5952h Object obj);

        V getValue();

        int hashCode();
    }

    /* renamed from: a */
    V mo29713a(R r, C c, V v);

    /* renamed from: a */
    void mo29989a(C7677d6<? extends R, ? extends C, ? extends V> d6Var);

    /* renamed from: b */
    V mo29715b(@C5952h Object obj, @C5952h Object obj2);

    void clear();

    boolean containsValue(@C5952h Object obj);

    /* renamed from: d */
    boolean mo29718d(@C5952h Object obj, @C5952h Object obj2);

    boolean equals(@C5952h Object obj);

    /* renamed from: h */
    boolean mo29720h(@C5952h Object obj);

    int hashCode();

    /* renamed from: i */
    Map<R, V> mo29721i(C c);

    boolean isEmpty();

    /* renamed from: j */
    boolean mo29723j(@C5952h Object obj);

    /* renamed from: k */
    Map<C, V> mo29724k(R r);

    V remove(@C5952h Object obj, @C5952h Object obj2);

    int size();

    /* renamed from: t */
    Set<C7678a<R, C, V>> mo29727t();

    /* renamed from: u */
    Set<C> mo29728u();

    /* renamed from: v */
    Map<R, Map<C, V>> mo29650v();

    Collection<V> values();

    /* renamed from: w */
    Map<C, Map<R, V>> mo29730w();

    /* renamed from: x */
    Set<R> mo29651x();
}
