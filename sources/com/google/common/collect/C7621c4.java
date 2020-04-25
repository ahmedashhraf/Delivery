package com.google.common.collect;

import java.util.Map;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.c4 */
/* compiled from: MapDifference */
public interface C7621c4<K, V> {

    /* renamed from: com.google.common.collect.c4$a */
    /* compiled from: MapDifference */
    public interface C7622a<V> {
        /* renamed from: a */
        V mo29835a();

        /* renamed from: b */
        V mo29836b();

        boolean equals(@C5952h Object obj);

        int hashCode();
    }

    /* renamed from: a */
    Map<K, V> mo29828a();

    /* renamed from: b */
    Map<K, C7622a<V>> mo29829b();

    /* renamed from: c */
    boolean mo29830c();

    /* renamed from: d */
    Map<K, V> mo29831d();

    /* renamed from: e */
    Map<K, V> mo29832e();

    boolean equals(@C5952h Object obj);

    int hashCode();
}
