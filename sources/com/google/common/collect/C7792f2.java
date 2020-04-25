package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.f2 */
/* compiled from: ForwardingSortedSet */
public abstract class C7792f2<E> extends C7555b2<E> implements SortedSet<E> {
    protected C7792f2() {
    }

    /* renamed from: f */
    private int m37227f(Object obj, Object obj2) {
        Comparator comparator = comparator();
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    public Comparator<? super E> comparator() {
        return m37233y().comparator();
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: e */
    public SortedSet<E> mo30330e(E e, E e2) {
        return tailSet(e).headSet(e2);
    }

    public E first() {
        return m37233y().first();
    }

    public SortedSet<E> headSet(E e) {
        return m37233y().headSet(e);
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: l */
    public boolean mo30333l(@C5952h Object obj) {
        try {
            if (m37227f(tailSet(obj).first(), obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    public E last() {
        return m37233y().last();
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: m */
    public boolean mo30335m(@C5952h Object obj) {
        try {
            Iterator it = tailSet(obj).iterator();
            if (it.hasNext() && m37227f(it.next(), obj) == 0) {
                it.remove();
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> subSet(E e, E e2) {
        return m37233y().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return m37233y().tailSet(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract SortedSet<E> m37234y();
}
