package com.google.common.collect;

import java.util.ListIterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.g6 */
/* compiled from: TransformedListIterator */
abstract class C7873g6<F, T> extends C7847f6<F, T> implements ListIterator<T> {
    C7873g6(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    /* renamed from: b */
    private ListIterator<? extends F> m37588b() {
        return C8178t3.m39114b(this.f21553a);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return m37588b().hasPrevious();
    }

    public final int nextIndex() {
        return m37588b().nextIndex();
    }

    public final T previous() {
        return mo30361a(m37588b().previous());
    }

    public final int previousIndex() {
        return m37588b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
