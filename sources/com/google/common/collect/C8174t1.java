package com.google.common.collect;

import java.util.ListIterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.t1 */
/* compiled from: ForwardingListIterator */
public abstract class C8174t1<E> extends C8124r1<E> implements ListIterator<E> {
    protected C8174t1() {
    }

    public void add(E e) {
        m39068y().add(e);
    }

    public boolean hasPrevious() {
        return m39068y().hasPrevious();
    }

    public int nextIndex() {
        return m39068y().nextIndex();
    }

    public E previous() {
        return m39068y().previous();
    }

    public int previousIndex() {
        return m39068y().previousIndex();
    }

    public void set(E e) {
        m39068y().set(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract ListIterator<E> m39069y();
}
