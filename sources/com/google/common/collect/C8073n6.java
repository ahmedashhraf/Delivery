package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.n6 */
/* compiled from: UnmodifiableSortedMultiset */
final class C8073n6<E> extends C8021l<E> implements C8240v5<E> {
    private static final long serialVersionUID = 0;

    /* renamed from: O */
    private transient C8073n6<E> f21875O;

    C8073n6(C8240v5<E> v5Var) {
        super(v5Var);
    }

    /* renamed from: B */
    public C8240v5<E> mo30112B() {
        C8073n6<E> n6Var = this.f21875O;
        if (n6Var != null) {
            return n6Var;
        }
        C8073n6<E> n6Var2 = new C8073n6<>(m38659y().mo30112B());
        n6Var2.f21875O = this;
        this.f21875O = n6Var2;
        return n6Var2;
    }

    /* renamed from: a */
    public C8240v5<E> mo30117a(E e, C8209u uVar) {
        return C8003l4.m38358a(m38659y().mo30117a(e, uVar));
    }

    /* renamed from: b */
    public C8240v5<E> mo30119b(E e, C8209u uVar) {
        return C8003l4.m38358a(m38659y().mo30119b(e, uVar));
    }

    public Comparator<? super E> comparator() {
        return m38659y().comparator();
    }

    public C7983a<E> firstEntry() {
        return m38659y().firstEntry();
    }

    public C7983a<E> lastEntry() {
        return m38659y().lastEntry();
    }

    public C7983a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public C7983a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public SortedSet<E> m38650H() {
        return Collections.unmodifiableSortedSet(m38659y().mo29710h());
    }

    /* renamed from: a */
    public C8240v5<E> mo30118a(E e, C8209u uVar, E e2, C8209u uVar2) {
        return C8003l4.m38358a(m38659y().mo30118a(e, uVar, e2, uVar2));
    }

    /* renamed from: h */
    public SortedSet<E> m38655h() {
        return (SortedSet) super.mo29710h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C8240v5<E> m38657y() {
        return (C8240v5) super.m38421y();
    }
}
