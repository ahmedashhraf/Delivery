package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.b */
/* compiled from: AbstractIndexedListIterator */
abstract class C7550b<E> extends C8062m6<E> {

    /* renamed from: a */
    private final int f21104a;

    /* renamed from: b */
    private int f21105b;

    protected C7550b(int i) {
        this(i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo29660a(int i);

    public final boolean hasNext() {
        return this.f21105b < this.f21104a;
    }

    public final boolean hasPrevious() {
        return this.f21105b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f21105b;
            this.f21105b = i + 1;
            return mo29660a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f21105b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f21105b - 1;
            this.f21105b = i;
            return mo29660a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f21105b - 1;
    }

    protected C7550b(int i, int i2) {
        C7397x.m35673b(i2, i);
        this.f21104a = i;
        this.f21105b = i2;
    }
}
