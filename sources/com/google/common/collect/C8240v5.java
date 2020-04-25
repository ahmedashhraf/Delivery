package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.v5 */
/* compiled from: SortedMultiset */
public interface C8240v5<E> extends C8253w5<E>, C8138r5<E> {
    /* renamed from: B */
    C8240v5<E> mo30112B();

    /* renamed from: a */
    C8240v5<E> mo30117a(E e, C8209u uVar);

    /* renamed from: a */
    C8240v5<E> mo30118a(E e, C8209u uVar, E e2, C8209u uVar2);

    /* renamed from: b */
    C8240v5<E> mo30119b(E e, C8209u uVar);

    Comparator<? super E> comparator();

    Set<C7983a<E>> entrySet();

    C7983a<E> firstEntry();

    /* renamed from: h */
    SortedSet<E> mo29710h();

    Iterator<E> iterator();

    C7983a<E> lastEntry();

    C7983a<E> pollFirstEntry();

    C7983a<E> pollLastEntry();
}
