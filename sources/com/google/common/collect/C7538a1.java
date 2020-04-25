package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;

@C2777c("java.util.ArrayDeque")
@C2775a
/* renamed from: com.google.common.collect.a1 */
/* compiled from: EvictingQueue */
public final class C7538a1<E> extends C7539a2<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Queue<E> f21095a;
    @C2778d

    /* renamed from: b */
    final int f21096b;

    private C7538a1(int i) {
        C7397x.m35672a(i >= 0, "maxSize (%s) must >= 0", Integer.valueOf(i));
        this.f21095a = new LinkedList();
        this.f21096b = i;
    }

    /* renamed from: b */
    public static <E> C7538a1<E> m36216b(int i) {
        return new C7538a1<>(i);
    }

    public boolean add(E e) {
        C7397x.m35664a(e);
        if (this.f21096b == 0) {
            return true;
        }
        if (size() == this.f21096b) {
            this.f21095a.remove();
        }
        this.f21095a.add(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return mo30761a(collection);
    }

    public boolean contains(Object obj) {
        return m36218y().contains(C7397x.m35664a(obj));
    }

    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.f21096b - size();
    }

    public boolean remove(Object obj) {
        return m36218y().remove(C7397x.m35664a(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Queue<E> m36219y() {
        return this.f21095a;
    }
}
