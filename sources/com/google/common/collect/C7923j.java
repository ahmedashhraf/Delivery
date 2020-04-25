package com.google.common.collect;

import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.j */
/* compiled from: AbstractSequentialIterator */
public abstract class C7923j<T> extends C8023l6<T> {

    /* renamed from: a */
    private T f21663a;

    protected C7923j(@C5952h T t) {
        this.f21663a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo29469a(T t);

    public final boolean hasNext() {
        return this.f21663a != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f21663a;
            } finally {
                this.f21663a = mo29469a(this.f21663a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
