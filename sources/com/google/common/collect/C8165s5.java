package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Comparator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.s5 */
/* compiled from: SortedIterables */
final class C8165s5 {
    private C8165s5() {
    }

    /* renamed from: a */
    public static boolean m39056a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C7397x.m35664a(comparator);
        C7397x.m35664a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m39055a((SortedSet) iterable);
        } else if (!(iterable instanceof C8138r5)) {
            return false;
        } else {
            comparator2 = ((C8138r5) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    /* renamed from: a */
    public static <E> Comparator<? super E> m39055a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? C8133r4.m38943j() : comparator;
    }
}
