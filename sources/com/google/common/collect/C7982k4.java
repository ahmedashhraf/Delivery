package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.k4 */
/* compiled from: Multiset */
public interface C7982k4<E> extends Collection<E> {

    /* renamed from: com.google.common.collect.k4$a */
    /* compiled from: Multiset */
    public interface C7983a<E> {
        boolean equals(Object obj);

        int getCount();

        E getElement();

        int hashCode();

        String toString();
    }

    /* renamed from: a */
    int mo29818a(@C5952h Object obj, int i);

    /* renamed from: a */
    boolean mo29892a(E e, int i, int i2);

    boolean add(E e);

    /* renamed from: b */
    int mo29708b(@C5952h Object obj);

    /* renamed from: b */
    int mo29893b(@C5952h E e, int i);

    /* renamed from: c */
    int mo29894c(E e, int i);

    boolean contains(@C5952h Object obj);

    boolean containsAll(Collection<?> collection);

    Set<C7983a<E>> entrySet();

    boolean equals(@C5952h Object obj);

    /* renamed from: h */
    Set<E> mo29710h();

    int hashCode();

    Iterator<E> iterator();

    boolean remove(@C5952h Object obj);

    boolean removeAll(Collection<?> collection);

    boolean retainAll(Collection<?> collection);

    String toString();
}
