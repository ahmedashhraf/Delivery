package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.b2 */
/* compiled from: ForwardingSet */
public abstract class C7555b2<E> extends C7997l1<E> implements Set<E> {
    protected C7555b2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo29680E() {
        return C8047m5.m38502a((Set<?>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29681c(Collection<?> collection) {
        return C8047m5.m38520a((Set<?>) this, (Collection) C7397x.m35664a(collection));
    }

    public boolean equals(@C5952h Object obj) {
        return obj == this || m36289y().equals(obj);
    }

    public int hashCode() {
        return m36289y().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo29684n(@C5952h Object obj) {
        return C8047m5.m38519a((Set<?>) this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Set<E> m36290y();
}
