package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.s1 */
/* compiled from: ForwardingList */
public abstract class C8141s1<E> extends C7997l1<E> implements List<E> {
    protected C8141s1() {
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: E */
    public int mo31001E() {
        return C8309z3.m39662b((List<?>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Iterator<E> mo31002F() {
        return listIterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public ListIterator<E> mo31003G() {
        return listIterator(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31005a(int i, Iterable<? extends E> iterable) {
        return C8309z3.m39660a((List<E>) this, i, iterable);
    }

    public void add(int i, E e) {
        m38987y().add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return m38987y().addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: b */
    public ListIterator<E> mo31006b(int i) {
        return C8309z3.m39659a((List<E>) this, i);
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this || m38987y().equals(obj);
    }

    public E get(int i) {
        return m38987y().get(i);
    }

    public int hashCode() {
        return m38987y().hashCode();
    }

    public int indexOf(Object obj) {
        return m38987y().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return m38987y().lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return m38987y().listIterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo31012n(E e) {
        add(size(), e);
        return true;
    }

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: o */
    public boolean mo31013o(@C5952h Object obj) {
        return C8309z3.m39661a((List<?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo31014p(@C5952h Object obj) {
        return C8309z3.m39663b((List<?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo31015q(@C5952h Object obj) {
        return C8309z3.m39668c(this, obj);
    }

    public E remove(int i) {
        return m38987y().remove(i);
    }

    public E set(int i, E e) {
        return m38987y().set(i, e);
    }

    public List<E> subList(int i, int i2) {
        return m38987y().subList(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract List<E> m38988y();

    /* access modifiers changed from: protected */
    @C2775a
    /* renamed from: a */
    public List<E> mo31004a(int i, int i2) {
        return C8309z3.m39656a((List<E>) this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return m38987y().listIterator(i);
    }
}
