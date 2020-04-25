package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.a2 */
/* compiled from: ForwardingQueue */
public abstract class C7539a2<E> extends C7997l1<E> implements Queue<E> {
    protected C7539a2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public E mo29631E() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public E mo29632F() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E element() {
        return m36224y().element();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo29634n(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public boolean offer(E e) {
        return m36224y().offer(e);
    }

    public E peek() {
        return m36224y().peek();
    }

    public E poll() {
        return m36224y().poll();
    }

    public E remove() {
        return m36224y().remove();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Queue<E> m36225y();
}
