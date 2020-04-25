package com.google.common.collect;

import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.r1 */
/* compiled from: ForwardingIterator */
public abstract class C8124r1<T> extends C8301z1 implements Iterator<T> {
    protected C8124r1() {
    }

    public boolean hasNext() {
        return mo26777y().hasNext();
    }

    public T next() {
        return mo26777y().next();
    }

    public void remove() {
        mo26777y().remove();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Iterator<T> m38912y();
}
