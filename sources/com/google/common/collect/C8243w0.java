package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.w0 */
/* compiled from: EmptyImmutableSortedSet */
class C8243w0<E> extends C8068n3<E> {
    C8243w0(Comparator<? super E> comparator) {
        super(comparator);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30440b(E e, boolean z) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8068n3<E> mo30441b(E e, boolean z, E e2, boolean z2) {
        return this;
    }

    public boolean contains(@C5952h Object obj) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8068n3<E> mo30444d(E e, boolean z) {
        return this;
    }

    @C2777c("NavigableSet")
    public C8023l6<E> descendingIterator() {
        return C8178t3.m39086a();
    }

    /* renamed from: e */
    public C8257x2<E> mo30933e() {
        return C8257x2.m39412m();
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public E first() {
        throw new NoSuchElementException();
    }

    public int hashCode() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int indexOf(@C5952h Object obj) {
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    public E last() {
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C8068n3<E> mo30456n() {
        return new C8243w0(C8133r4.m38939b(this.f21866P).mo30568g());
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39086a();
    }
}
