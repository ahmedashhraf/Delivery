package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.collect.C7800f4.C7829p;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.t4 */
/* compiled from: Platform */
final class C8196t4 {
    private C8196t4() {
    }

    /* renamed from: a */
    static <T> T[] m39151a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: a */
    static <E> Set<E> m39146a(Map<E, Boolean> map) {
        return C8047m5.m38514a(map);
    }

    /* renamed from: a */
    static C7660d4 m39145a(C7660d4 d4Var) {
        return d4Var.m36631e();
    }

    /* renamed from: a */
    static <K, V1, V2> SortedMap<K, V2> m39148a(SortedMap<K, V1> sortedMap, C7829p<? super K, ? super V1, V2> pVar) {
        return C7800f4.m37325b(sortedMap, pVar);
    }

    /* renamed from: a */
    static <K, V> SortedMap<K, V> m39149a(SortedSet<K> sortedSet, C7380p<? super K, V> pVar) {
        return C7800f4.m37326b(sortedSet, pVar);
    }

    /* renamed from: a */
    static <E> SortedSet<E> m39150a(SortedSet<E> sortedSet, C5831y<? super E> yVar) {
        return C8047m5.m38527b(sortedSet, yVar);
    }

    /* renamed from: a */
    static <K, V> SortedMap<K, V> m39147a(SortedMap<K, V> sortedMap, C5831y<? super Entry<K, V>> yVar) {
        return C7800f4.m37339c(sortedMap, yVar);
    }
}
