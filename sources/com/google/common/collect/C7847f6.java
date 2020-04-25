package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.f6 */
/* compiled from: TransformedIterator */
abstract class C7847f6<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f21553a;

    C7847f6(Iterator<? extends F> it) {
        this.f21553a = (Iterator) C7397x.m35664a(it);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo30361a(F f);

    public final boolean hasNext() {
        return this.f21553a.hasNext();
    }

    public final T next() {
        return mo30361a(this.f21553a.next());
    }

    public final void remove() {
        this.f21553a.remove();
    }
}
