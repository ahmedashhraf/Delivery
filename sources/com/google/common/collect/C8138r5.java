package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.r5 */
/* compiled from: SortedIterable */
interface C8138r5<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    Iterator<T> iterator();
}
